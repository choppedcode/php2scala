<?php
/*
 * PHP-to-Scala source code migration helper.
 *
 * Copyright(C) 2012 kbinani.
 * Copyright(C) 2010 Alex T. Ramos / Zigabyte Corporation.
 * COPYING is permitted under the terms of the GNU General Public License, v3.
 *
 */
class Converter {
	var $firstPass=true;
	var $package;
	var $packagesToInclude=array();
	/**
	 * object name for php functions
	 *
	 * @var string
	 */
	private $temp=1;
	private $phpLibName='php';
	private $anyType='ref'; // Any
	private $extendClassName='script with Constants'; // 'PHPObject';
	var $globals=array('argv','_GLOBALS','_SERVER','_SESSION','_GET','_COOKIE','_REQUEST','_POST');
	var $predefined=array('argv','_GLOBALS','_SERVER','_SESSION','_GET','_COOKIE','_REQUEST','_POST');
	private $classVars=array();
	private $classMethods=array();
	var $constants=array();
	var $globs=array();
	var $constantCategories=array('Core','curl');
	var $excludeConstants=array('PHP_EOL');
	private $functionArgs=array();
	private $vars=array();

	function is_global($var) {
		return in_array($var, $this->globs);
	}

	function match($token1, $ttype) {
		if (is_array($token1)) {
			return $token1[TTYPE] == $ttype;
		} else {
			return $token1 === $ttype;
		}
	}

	function contains(array $T, $ttype) {
		foreach ($T as $t) {
			if ($this->match($t, $ttype)) {
				return true;
			}
		}
		return false;
	}

	function skip(&$T, $ttype) {
		while ( count($T) && $this->match($T[0], $ttype) ) {
			array_shift($T);
		}
	}

	function skip_thru(&$T, $ttype) {
		$s='';
		while ( !$this->match($T[0], $ttype) ) {
			$s.=is_array($T[0]) ? $T[0][VALUE] : $T[0];
			if (!count($T)) throw new Exception();
			array_shift($T);
		}
		array_shift($T);
		return $s;
	}

	function display($token) {
		if (is_array($token)) {
			return token_name($token[TTYPE]);
		} else if (is_numeric($token)) {
			return token_name($token);
		} else {
			return $token;
		}
	}

	function expect(&$T, $ttype) {
		$this->skip($T, T_WHITESPACE);
		$t=array_shift($T);
		if (!$this->match($t, $ttype)) {
			throw new Exception('Expected: ' . ($this->display($ttype)) . " got: " . ($this->display($t)));
		}
	}

	function peek($T, $ttype) {
		$this->skip($T, T_WHITESPACE);
		$t=array_shift($T);
		return $this->match($t, $ttype);
	}

	function parse_expr_tail(&$T) {
		$out='';
		while ( !$this->match($T[0], ')') && !$this->match($T[0], ';') ) {
			if ($this->match($T[0], '(')) {
				array_shift($T);
				$out.='(' . $this->parse_expr_tail($T) . ')';
			} else {
				$out.=$this->parse($T);
			}
		}
		// echo $this->display($T[0]) . chr(10);
		if (!$this->match($T[0], ';')) {
			$this->last=array_shift($T);
		} else
			$this->last=null;
		return $out;
	}

	function parse_block_tail(&$T) {
		$out='';
		while ( count($T) && $T[0] !== '}' ) {
			if ($T[0] === '{') {
				array_shift($T);
				$out.="{ " . $this->parse_block_tail($T) . " }";
			} else {
				$out.=$this->parse($T);
			}
		}
		array_shift($T);
		return $out;
	}

	function fetch_expr(&$T) {
		$out=array();
		while ( count($T) && $T[0] !== ')' && $T[0] !== ';' ) {
			if ($T[0] === '(') {
				array_shift($T);
				$out[]='(';
				array_splice($out, count($out), 0, $this->fetch_expr($T));
				$out[]=')';
			} else {
				$out[]=array_shift($T);
			}
		}
		array_shift($T);
		return $out;
	}

	function fetch_block(&$T) {
		$out=array();
		while ( count($T) && $T[0] != '}' ) {
			$t=array_shift($T);
			if ($t == '{') {
				$out[]='{';
				array_splice($out, count($out), 0, $this->fetch_block($T));
				$out[]='}';
			} else {
				$out[]=$t;
			}
		}
		array_shift($T);
		return $out;
	}

	function fetch_stmt(&$T) {
		$this->skip($T, T_WHITESPACE);
		if ($T[0] === '{') {
			$out=array();
			array_shift($T);
			$out[]="{";
			array_splice($out, count($out), 0, $this->fetch_block($T));
			$out[]="}";
			return $out;
		} else {
			return $this->fetch_expr($T);
		}
	}

	function parse_stmt(&$T) {
		$this->skip($T, T_WHITESPACE);
		if ($T[0] === '{') {
			array_shift($T);
			return "{ " . $this->parse_block_tail($T) . " }";
		} else {
			return "{ " . $this->parse_expr_tail($T) . " }";
		}
	}

	function parse_for(&$T) {
		$this->expect($T, '(');
		$init_expr=$this->parse_expr_tail($T);
		$this->expect($T, ';');
		$cond_expr=$this->parse_expr_tail($T);
		$this->expect($T, ';');
		$term_expr=$this->parse_expr_tail($T);
		$body_stmt=$this->parse_stmt($T);
		return "\n$init_expr;\nwhile($cond_expr) {\n $body_stmt;\n$term_expr\n}\n";
	}

	/* type inference and variable declaration */
	function scan_vars($T) {
		$out='';
		$vars=array();
		
		while ( count($T) ) {
			if ($this->match($T[0], T_VARIABLE)) {
				// $name=$this->parse($T);
				if (in_array($T[0][VALUE], array('$class','$type','$package'))) $name='the' . ucfirst(substr($T[0][VALUE], 1));
				else $name=substr($T[0][VALUE], 1);
				array_shift($T);
				$this->skip($T, T_WHITESPACE);
				$t=array_shift($T);
				
				$type=$this->anyType;
				$default='null';
				if ($t == '=' || $t == '[') {
					$this->skip($T, T_WHITESPACE);
					$u=array_shift($T);
					if ($this->match($u, T_LNUMBER)) {
						$type='integer';
						$default='0';
					}
				}
				if (!in_array($name, $this->functionArgs) && $name != 'this' && !isset($vars[$name]) && !$this->is_global($name)) {
					// $out.="\nvar $name: $type = $default;";
					$vars[$name]=array('type' => $type,'default' => $default);
				}
			} else {
				array_shift($T);
			}
		}
		return $vars;
		// return $out;
	}
	
	// detect globals from global keyword
	function scan_global_keyword($T) {
		while ( count($T) ) {
			if ($this->match($T[0], T_GLOBAL)) {
				while ( count($T) && !$this->match($T[0], ';') ) {
					if ($this->match($T[0], T_VARIABLE)) $this->addGlobal(substr($T[0][VALUE], 1));
					$t=array_shift($T);
				}
			}
			$t=array_shift($T);
		}
	}

	function addGlobal($global) {
		if (!in_array($global, $this->globals)) $this->globals[]=$global;
		if (!in_array($global, $this->globs)) $this->globs[]=$global;
	}

	function addConstant($constant) {
		$constant=str_replace(array("'",'"'), array("",''), $constant);
		if (!in_array($constant, $this->constants)) $this->constants[]=$constant;
	}

	function parse_f_args(&$T) {
		$out='';
		while ( $T[0] != '{' ) {
			$prev=$T[0];
			if ($this->match($T[0], '(')) $this->classMethods[]=trim($out);
			$c=$this->parse($T);
			if ($c != '&') $out.=$c;
			if ($prev[TTYPE] == T_VARIABLE) {
				$this->functionArgs[]=substr($prev[VALUE], 1);
				$out.=' : ' . $this->anyType;
			}
		}
		return $out;
	}

	function parse_function(&$T, $scope='') {
		if ($scope !== '') {
			$scope.=' ';
		}
		$this->functionArgs=array();
		$out=$scope . "def" . $this->parse_f_args($T);
		$this->expect($T, '{');
		$body=$this->fetch_block($T);
		
		if ($this->contains($body, T_RETURN)) {
			$out.=' : ' . $this->anyType . ' = ';
		}
		$this->globs=$this->predefined;
		$this->scan_global_keyword($body);
		$this->vars=$this->scan_vars($body);
		$bodyDef=$this->parse_all($body);
		$varDef='';
		if (count($this->vars) > 0) {
			foreach ($this->vars as $name => $data) {
				$varDef.="\nvar $name: {$data['type']} = {$data['default']};";
			}
		}
		$f=$out . '{' . $varDef . "\n" . $bodyDef . '}';
		$this->globs=$this->predefined;
		$this->functionArgs=array();
		$this->vars=array();
		return $f;
	}

	function parse_vars(&$T, $scope='') {
		$out='';
		if ($scope !== '') {
			$scope.=' ';
		}
		while ( $T[0] != ';' ) {
			if ($T[0][TTYPE] == T_VARIABLE) {
				$var=$this->parse($T);
				if (!in_array($var, $this->functionArgs)) {
					$this->classVars[]=$var;
					$out.=$scope . 'var ' . $var . ' : ' . $this->anyType . ' = null;';
				}
			} else {
				array_shift($T);
			}
		}
		array_shift($T);
		return $out;
	}

	function parse_const_vars(&$T, $scope='') {
		$out='';
		if ($scope !== '') {
			$scope.=' ';
		}
		while ( $T[0] != ';' ) {
			if ($this->match($T[0], T_VARIABLE)) {
				$var=$this->parse($T);
				$this->classVars[]=$var;
				$out.=$var;
			} else
				$out.=$this->parse($T);
		}
		$out=$scope . 'val ' . $out . ';';
		array_shift($T);
		return $out;
	}

	function parse_echo(&$T) {
		$t=array_shift($T);
		return 'echo(' . $this->parse_expr_tail($T) . ')';
		// return $this->phpLibName . '.echo(' . $this->parse_expr_tail($T) . ')';
	}

	function parse_new(&$T) {
		$this->skip($T, T_WHITESPACE);
		$classname=$this->parse($T);
		return "new $classname __construct";
	}

	function parse_constructor(&$T) {
		$this->expect($T, T_FUNCTION);
		$this->expect($T, T_STRING);
		$out='def __construct ';
		$out.=$this->parse_f_args($T);
		$this->expect($T, '{');
		$out.=' : ' . $this->anyType . ' = {';
		$out.=$this->parse_block_tail($T);
		$out.="\nthis;\n}";
		return $out;
	}

	/**
	 * remove a specified type token, found at first
	 */
	function remove_first(&$T, $ttype) {
		for($i=0; $i < count($T); $i++) {
			$t=$T[$i];
			if ($t === $ttype || (is_array($t) && $t[TTYPE] === $ttype)) {
				array_splice($T, $i, 1);
				break;
			}
		}
	}

	function peek_whitespace(&$T) {
		$out='';
		while ( $this->match($T[0], T_WHITESPACE) ) {
			$out.=$T[0][VALUE];
			array_shift($T);
		}
		return $out;
	}

	function isVariableDefinition($T) {
		if ($this->peek($T, '=')) {
			$level=0;
			while ( count($T) ) {
				if ($this->match($T[0], '(')) $level++;
				elseif ($this->match($T[0], ')') && $level == 0) return false;
				elseif ($this->match($T[0], ')')) $level--;
				elseif ($this->match($T[0], ';')) return true;
				array_shift($T);
			}
		}
		return false;
	}

	function parse_class(&$T) {
		// $this->globs=$this->predefined;
		$this->classVars=array();
		$this->classMethods=array();
		$this->skip($T, T_WHITESPACE);
		$className=$this->parse($T);
		
		$classCodePrefix="class $className";
		$containsExtends=false;
		while ( $T[0] !== '{' ) {
			$parsedToken=$this->parse($T);
			if ($parsedToken === 'extends') {
				$containsExtends=true;
			}
			$classCodePrefix.=$parsedToken;
		}
		if (!$containsExtends) $classCodePrefix.=' ' . ($containsExtends ? 'with' : 'extends') . ' ' . $this->extendClassName . ' ' . $this->parse($T);
		else $classCodePrefix.=$this->parse($T);
		$classCode='';
		
		$objectCodePrefix="object $className extends {$this->extendClassName} {";
		$objectCode='';
		$body=$this->fetch_block($T);
		
		while ( count($body) ) {
			$isFunction=false;
			$block=$this->fetch_var_or_function($body, $isFunction);
			if (count($block) === 0) {
				$out=$this->parse($body);
			} else {
				if ($isConstant=$this->contains($block, T_CONST)) {
					$this->remove_first($block, T_CONST);
				}
				if ($isStatic=$this->contains($block, T_STATIC)) {
					$this->remove_first($block, T_STATIC);
				}
				if ($isPublic=$this->contains($block, T_PUBLIC)) {
					$this->remove_first($block, T_PUBLIC);
				}
				if ($isPrivate=$this->contains($block, T_PRIVATE)) {
					$this->remove_first($block, T_PRIVATE);
				}
				if ($isProtected=$this->contains($block, T_PROTECTED)) {
					$this->remove_first($block, T_PROTECTED);
				}
				
				$scope='';
				if ($isPrivate) {
					$scope='private';
				} else if ($isProtected) {
					$scope='protected';
				}
				if ($isFunction) {
					$out=$this->peek_whitespace($block);
					if ($this->match($block[0], T_DOC_COMMENT) || $this->match($block[0], T_COMMENT)) {
						$out.=$this->parse($block) . "\n";
						array_shift($block);
					}
					$this->expect($block, T_FUNCTION);
					$out.=$this->parse_function($block, $scope);
					if ($isStatic || $isConstant) {
						$objectCode.=$out;
					} else {
						$classCode.=$out;
					}
				} else {
					$out=$this->peek_whitespace($block);
					if ($isConstant) {
						$out.=$this->parse_const_vars($block, $scope);
					} else {
						$out.=$this->parse_vars($block, $scope);
					}
					if ($isStatic || $isConstant) {
						$objectCode.=$out;
					} else {
						$classCode.=$out;
					}
				}
			}
		}
		
		$result=$classCodePrefix . $classCode . PHP_EOL . '}' . PHP_EOL;
		if ($objectCode !== '') {
			$result.=$objectCodePrefix . $objectCode . PHP_EOL . '}' . PHP_EOL;
		}
		
		$common=array_intersect($this->classVars, $this->classMethods);
		if (count($common)) {
			trigger_error('Methods and variables with the same name defined here: ' . implode(',', $common), E_USER_WARNING);
		}
		// $this->globs=$this->predefined;
		return $result;
	}

	private function fetch_var_or_function(&$T, &$isFunction) {
		$nextFunctionIndex=$this->getNextFunctionIndex($T);
		$nextVarIndex=$this->getNextVarIndex($T);
		if ($nextFunctionIndex === PHP_INT_MAX && $nextVarIndex === PHP_INT_MAX) {
			return array();
		}
		$result=array();
		if ($nextFunctionIndex <= $nextVarIndex) {
			$isFunction=true;
			for($i=0; $i <= $nextFunctionIndex; $i++) {
				$result[]=array_shift($T);
			}
			while ( $T[0] !== '{' ) {
				$result[]=array_shift($T);
			}
			$result[]=array_shift($T);
			$result=array_merge($result, $this->fetch_block($T));
			$result[]='}';
		} else {
			for($i=0; $i <= $nextVarIndex; $i++) {
				$result[]=array_shift($T);
			}
		}
		return $result;
	}

	private function getNextFunctionIndex($T) {
		for($i=0; $i < count($T); $i++) {
			if ($T[$i][TTYPE] === T_FUNCTION) {
				return $i;
			}
		}
		return PHP_INT_MAX;
	}

	private function val($t) {
		return is_array($t) ? $t[VALUE] : $t;
	}

	private function getNextVarIndex($T) {
		for($i=0; $i < count($T); $i++) {
			if ($T[$i] === ';') {
				return $i;
			}
		}
		return PHP_INT_MAX;
	}

	function parse(&$T) {
		$t=array_shift($T);
		
		if (!is_array($t)) {
			switch ($t) {
				case '[' :
					if ($T[0] == ']' && $this->peek(array_slice($T, 1), '=')) {
						$this->expect($T, ']');
						$this->expect($T, '=');
						return " += ";
					} else {
						return '(';
					}
				
				case ']' :
					return ')';
				case '.' :
					return '+&';
				
				case '?' :
					$choices=$this->parse_expr_tail($T);
					$out=" |? { if(_) $choices }";
					if ($this->match($this->last, ')')) $out.=')';
					return $out;
				case ':' :
					return " else ";
				
				case '@':
					if ($this->peek($T,T_STRING)) return '';
					
				default :
					return $t;
			}
		}
		
		switch ($t[TTYPE]) {
			
			case T_INLINE_HTML :
				return 'output """' . $t[VALUE] . '"""' . "\n";
			
			case T_CLOSE_TAG : // ? > or % > escaping from HTML
			case T_OPEN_TAG : // < ?php, < ? or < % escaping from HTML
				return "";
			
			case T_FUNCTION : // function or cfunction functions
				return $this->parse_function($T);
			
			case T_OBJECT_OPERATOR : // -> classes and objects
				if ($this->peek(array_slice($T, 1), '=')) { // assignment
					return "('" . $this->parse($T) . ")";
				} else if ($this->peek(array_slice($T, 1), '(')) { // method call
					return "~&'" . $this->parse($T) . "~>";
				} else {
					return "~>'" . $this->parse($T);
				}
			
			case T_DOUBLE_COLON : // :: see T_PAAMAYIM_NEKUDOTAYIM below
			case T_PAAMAYIM_NEKUDOTAYIM : // :: ::. Also defined as T_DOUBLE_COLON.
				return ".";
			
			case T_VARIABLE : // $foo variables
				if ($t[VALUE] == '$this') {
					if (isset($T[0]) && $T[0][TTYPE] == T_OBJECT_OPERATOR) {
						array_shift($T);
						return "this."; // use static binding (".") instead of dynamic "~>"
					} else {
						return 'this';
					}
				} elseif (in_array($t[VALUE], array('$class','$type','$package'))) {
					$var='the' . ucfirst(substr($t[VALUE], 1));
				} else {
					$var=substr($t[VALUE], 1);
					if (in_array($var, $this->globs)) return 'php.Globals.' . $var;
				}
				if (isset($this->vars[$var]) && $this->isVariableDefinition($T)) {
					if (isset($this->vars[$var])) unset($this->vars[$var]);
					return "var $var";
				} else {
					return $var;
				}
			
			case T_VAR : // var classes and objects
				return $this->parse_vars($T);
			
			case T_FOR : // for for
				return $this->parse_for($T);
			
			case T_ECHO : // echo echo()
			case T_PRINT : // print() print()
				return $this->parse_echo($T);
			
			case T_NEW : // new classes and objects
				return $this->parse_new($T);
			
			case T_CLASS : // class classes and objects
				return $this->parse_class($T);
			
			case T_INC : // ++ incrementing/decrementing operators
				if ($this->peek($T, T_VARIABLE)) {
					$var=$this->parse($T);
					return "($var = $var + 1)";
				} else {
					return "++";
				}
			
			case T_CONSTANT_ENCAPSED_STRING : // "foo" or 'bar' string syntax
				return '"' . str_replace('"', '\"', substr($t[VALUE], 1, -1)) . '"';
			
			case T_ENCAPSED_AND_WHITESPACE : // " $a" constant part of string with variables
				$out=$t[VALUE];
				while ( $T[0][TTYPE] == T_VARIABLE ) {
					$out.='"+' . $this->parse($T) . '+"';
				}
				return $out;
			
			case T_DOUBLE_ARROW : // => array syntax
				return "->";
			
			case T_CONCAT_EQUAL : // .= assignment operators
				return "+=& (" . $this->parse_expr_tail($T) . ")";
			
			case T_FOREACH : // foreach foreach
				$this->expect($T, '(');
				$this->skip($T, T_WHITESPACE);
				$var='';
				while ( !$this->match($T[0], T_AS) ) {
					$var.=$this->parse($T);
				}
				$this->expect($T, T_AS);
				$this->skip($T, T_WHITESPACE);
				$maybeKeyVariable=$this->parse($T);
				
				$keyVariable=null;
				$valueVariable=null;
				if ($this->match($T[1], T_DOUBLE_ARROW)) {
					$this->expect($T, T_DOUBLE_ARROW);
					$this->skip($T, T_WHITESPACE);
					$keyVariable=$maybeKeyVariable;
					$valueVariable=$this->parse($T);
				} else {
					$valueVariable=$maybeKeyVariable;
				}
				$this->expect($T, ')');
				$this->skip($T, T_WHITESPACE);
				$loop=$this->fetch_stmt($T);
				
				if (is_null($keyVariable)) {
					return "$var.foreach{ ($valueVariable : {$this->anyType}) => " . $this->parse_all($loop) . " }";
				} else {
					return "$var.foreach{ ($keyVariable : {$this->anyType}, $valueVariable : {$this->anyType}) => " . $this->parse_all($loop) . " }";
				}
			
			case T_ARRAY : // array() array(), array syntax
				$this->skip($T, '(');
				$list=$this->fetch_expr($T, ')');
				if ($this->contains($list, T_DOUBLE_ARROW)) {
					return $this->phpLibName . ".array(" . $this->parse_all($list) . ")";
				} else {
					return "array.list(" . $this->parse_all($list) . ")";
				}
			
			case T_WHILE : // while while, do..while
				$this->expect($T, '(');
				$cond=$this->fetch_expr($T, ')');
				if ($this->contains($T, '=')) {
					// assignment in loop condition
					$var="";
					foreach ($cond as $t) {
						if ($t[TTYPE] == T_VARIABLE) {
							$U=array($t);
							$var=$this->parse($U);
							break;
						}
					}
					return 'while ({' . $this->parse_all($cond) . "; $var})";
				} else {
					// regular loop condition
					return 'while (' . $this->parse_all($cond) . ')';
				}
			
			case T_STRING : // "$a[a]" string array index inside string
				if ($t[VALUE] === 'self' || $t[VALUE] === 'parent') {
					$this->skip($T, T_WHITESPACE);
					$this->expect($T, T_DOUBLE_COLON);
					$this->skip($T, T_WHITESPACE);
					$var=$this->parse($T);
					return 'this.' . $var;
				} elseif ($t[VALUE] == 'define' && count($T) >= 2 && $this->match($T[0], '(') && $this->match($T[1], T_CONSTANT_ENCAPSED_STRING)) {
					$this->addConstant($T[1][VALUE]);
					return $t[VALUE];
				} else {
					return $t[VALUE];
				}
			
			case T_ELSEIF : // elseif elseif
				return 'else if';
			case T_GLOBAL : // skip over global variable scope
				$globs=array();
				while ( count($T) && !$this->match($T[0], ';') ) {
					$t=array_shift($T);
					if ($this->match($t, T_VARIABLE)) $globs[]=substr($t[VALUE], 1);
				}
				if (count($T)) array_shift($T);
				return '//' . implode(',', $globs) . "\n";
			case T_REQUIRE : // require() require()
			case T_REQUIRE_ONCE : // require_once() require_once()
			case T_INCLUDE : // include() include()
			case T_INCLUDE_ONCE : // include_once() include_once()
				$s='// ' . $t[VALUE] . $this->skip_thru($T, ';');
				return $s;
			case T_DIR : // __DIR__ magic constants (available since PHP 5.3.0)
				return 'new File(".").getCanonicalPath()';
			case T_SWITCH : // switch switch
				$s='';
				$this->expect($T, '(');
				$s=$this->parse_expr_tail($T) . ' match ';
				$this->expect($T, '{');
				$s.="{\n";
				$this->skip($T, T_WHITESPACE);
				$conditions=array();
				while ( count($T) && !$this->match($T[0], '}') ) {
					if ($this->match($T[0], T_CASE)) {
						array_shift($T);
						$block=array();
						while ( count($T) && !$this->match($T[0], ':') ) {
							$block[]=$T[0];
							array_shift($T);
						}
						array_shift($T);
						$conditions[]=$this->parse_all($block);
					} elseif ($this->match($T[0], T_DEFAULT)) {
						array_shift($T);
						$e=$this->skip_thru($T, ':');
						if (trim($e) != '') throw new Exception("Expected: blank got: $e");
						$conditions[]="_";
					} else {
						throw new Exception('Expected: ' . $this->display(T_CASE) . " or " . $this->display(T_DEFAULT) . " got: " . ($this->display($T[0])));
					}
					$level=0;
					$e='';
					$block=array();
					while ( count($T) && !$this->match($T[0], T_CASE) && !$this->match($T[0], T_DEFAULT) && !$this->match($T[0], '}') && $level == 0 ) {
						$c=array_shift($T);
						if ($this->match($c, '{')) $level++;
						elseif ($level > 0 && $this->match($c, '}')) $level--;
						if ($this->match($c, T_BREAK)) {
							$this->skip_thru($T, ';');
							$this->skip($T, T_WHITESPACE);
							continue;
						}
						$e.=$this->val($c);
						$block[]=$c;
					}
					if (trim($e) != '') {
						$s.="case " . implode('|', $conditions) . " =>";
						$s.=$this->parse_all($block) . "\n";
						$conditions=array();
					}
					$this->skip($T, T_WHITESPACE);
				}
				$s.="}\n";
				array_shift($T);
				return $s;
			case T_LIST : // list() list()
				$this->expect($T, '(');
				$vars=explode(',', $this->skip_thru($T, ')'));
				$s="val temp" . $this->temp . " " . $this->parse_expr_tail($T) . "\n";
				$this->skip_thru($T, ';');
				foreach ($vars as $i => $v) {
					$var=substr($v, 1);
					if (isset($this->vars[$var])) { 
						unset($this->vars[$var]);
						$s.="var ";
					}
					$s.=$var . " = temp" . $this->temp . "($i)\n";
				}
				$this->temp++;
				return $s;
			case T_COMMENT : // // or #, and /* */ in PHP 5 comments
			case T_ABSTRACT : // abstract Class Abstraction (available since PHP 5.0.0)
			case T_AND_EQUAL : // &= assignment operators
			case T_ARRAY_CAST : // (array) type-casting
			case T_AS : // as foreach
			case T_BAD_CHARACTER : // anything below ASCII 32 except \t (0x09), \n (0x0a) and \r (0x0d)
			case T_BOOLEAN_AND : // && logical operators
			case T_BOOLEAN_OR : // || logical operators
			case T_BOOL_CAST : // (bool) or (boolean) type-casting
			case T_BREAK : // break break
			case T_CASE : // case switch
			case T_CATCH : // catch Exceptions (available since PHP 5.0.0)
			case T_CHARACTER : // not used anymore
			case T_CLASS_C : // __CLASS__ magic constants (available since PHP 4.3.0)
			case T_CLONE : // clone classes and objects (available since PHP 5.0.0)
			case T_CONST : // const class constants
			case T_CONTINUE : // continue continue
			case T_CURLY_OPEN : // {$ complex variable parsed syntax
			case T_DEC : // -- incrementing/decrementing operators
			case T_DECLARE : // declare declare
			case T_DEFAULT : // default switch
			case T_DIV_EQUAL : // /= assignment operators
			case T_DNUMBER : // 0.12, etc floating point numbers
			case T_DOC_COMMENT : // /** */ PHPDoc style comments (available since PHP 5.0.0)
			case T_DO : // do do..while
			case T_DOLLAR_OPEN_CURLY_BRACES : // ${ complex variable parsed syntax
			case T_DOUBLE_CAST : // (real), (double) or (float) type-casting
			case T_ELSE : // else else
			case T_EMPTY : // empty empty()
			case T_ENDDECLARE : // enddeclare declare, alternative syntax
			case T_ENDFOR : // endfor for, alternative syntax
			case T_ENDFOREACH : // endforeach foreach, alternative syntax
			case T_ENDIF : // endif if, alternative syntax
			case T_ENDSWITCH : // endswitch switch, alternative syntax
			case T_ENDWHILE : // endwhile while, alternative syntax
			case T_END_HEREDOC : // heredoc syntax
			case T_EVAL : // eval() eval()
			case T_EXIT : // exit or die exit(), die()
			case T_EXTENDS : // extends extends, classes and objects
			case T_FILE : // __FILE__ magic constants
			case T_FINAL : // final Final Keyword (available since PHP 5.0.0)
			case T_FUNC_C : // __FUNCTION__ magic constants (available since PHP 4.3.0)
			case T_GOTO : // goto (available since PHP 5.3.0)
			case T_HALT_COMPILER : // __halt_compiler() __halt_compiler (available since PHP 5.1.0)
			case T_IF : // if if
			case T_IMPLEMENTS : // implements Object Interfaces (available since PHP 5.0.0)
			case T_INLINE_HTML : // text outside PHP
			case T_INSTANCEOF : // instanceof type operators (available since PHP 5.0.0)
			case T_INT_CAST : // (int) or (integer) type-casting
			case T_INTERFACE : // interface Object Interfaces (available since PHP 5.0.0)
			case T_ISSET : // isset() isset()
			case T_IS_EQUAL : // == comparison operators
			case T_IS_GREATER_OR_EQUAL : // >= comparison operators
			case T_IS_IDENTICAL : // === comparison operators
			case T_IS_NOT_EQUAL : // != or <> comparison operators
			case T_IS_NOT_IDENTICAL : // !== comparison operators
			case T_IS_SMALLER_OR_EQUAL : // <= comparison operators
			case T_LINE : // __LINE__ magic constants
			case T_LNUMBER : // 123, 012, 0x1ac, etc integers
			case T_LOGICAL_AND : // and logical operators
			case T_LOGICAL_OR : // or logical operators
			case T_LOGICAL_XOR : // xor logical operators
			case T_METHOD_C : // __METHOD__ magic constants (available since PHP 5.0.0)
			case T_MINUS_EQUAL : // -= assignment operators
			case T_ML_COMMENT : // /* and */ comments (PHP 4 only)
			case T_MOD_EQUAL : // %= assignment operators
			case T_MUL_EQUAL : // *= assignment operators
			case T_NS_C : // __NAMESPACE__ namespaces. Also defined as T_NAMESPACE (available since PHP 5.3.0)
			case T_NUM_STRING : // "$a[0]" numeric array index inside string
			case T_OBJECT_CAST : // (object) type-casting
			case T_OLD_FUNCTION : // old_function (PHP 4 Only)
			case T_OPEN_TAG_WITH_ECHO : // <?= or <%= escaping from HTML
			case T_OR_EQUAL : // |= assignment operators
			case T_PLUS_EQUAL : // += assignment operators
			case T_PRIVATE : // private classes and objects (available since PHP 5.0.0)
			case T_PUBLIC : // public classes and objects (available since PHP 5.0.0)
			case T_PROTECTED : // protected classes and objects (available since PHP 5.0.0)
			case T_RETURN : // return returning values
			case T_SL : // << bitwise operators
			case T_SL_EQUAL : // <<= assignment operators
			case T_SR : // >> bitwise operators
			case T_SR_EQUAL : // >>= assignment operators
			case T_START_HEREDOC : // <<< heredoc syntax
			case T_STATIC : // static variable scope
			case T_STRING_CAST : // (string) type-casting
			case T_STRING_VARNAME : // "${a complex variable parsed syntax
			case T_THROW : // throw Exceptions (available since PHP 5.0.0)
			case T_TRY : // try Exceptions (available since PHP 5.0.0)
			case T_UNSET : // unset() unset()
			case T_UNSET_CAST : // (unset) type-casting (available since PHP 5.0.0)
			case T_USE : // use namespaces (available since PHP 5.3.0)
			case T_WHITESPACE : // \t \r\n
			case T_XOR_EQUAL : // ^= assignment operators
				return $t[VALUE];
			
			default :
				throw new Exception("unknown token: " . token_name($t[TTYPE]));
		}
	}

	public function parse_all($T) {
		$out='';
		
		while ( count($T) ) {
			$out.=$this->parse($T);
		}
		return $out;
	}

	/**
	 *
	 * @param string $code PHP code
	 * @return string convert result
	 */
	public function convert($code) {
		$T=token_get_all($code);
		
		$result='';
		if ($this->package) $result.="package {$this->package}\n\n";
		if (count($this->packagesToInclude)) {
			foreach ($this->packagesToInclude as $package) {
				$result.="import $package._\n";
			}
		}
		$result.="import php._;\n";
		$result.="import scala.Predef.{ any2ArrowAssoc => _ }\n";
		$result.="import java.io.File\n";
		$result.="\n";
		if (1 || $this->firstPass) {
			// $this->scan_globals($T);
			$this->scan_global_keyword($T);
		}
		$result.=$this->parse_all($T);
		ksort($this->constants);
		ksort($this->globals);
		return $result;
	}

	function __construct() {
		if (!defined('TTYPE')) {
			define('TTYPE', 0);
		}
		if (!defined('VALUE')) {
			define('VALUE', 1);
		}
		
		$obsoleteTypeConstants=array('T_ML_COMMENT','T_OLD_FUNCTION');
		$definedConstants=get_defined_constants();
		foreach ($obsoleteTypeConstants as $name) {
			if (!array_key_exists($name, $definedConstants)) {
				define($name, $name);
			}
		}
	}

	function dump($tokens) { // debugging function
		foreach ($tokens as $c) {
			if (is_array($c)) {
				$disp=preg_replace("/[\r\n]+/", "\\n", $c[1]);
				print(token_name($c[0]) . ": '" . $disp . "'\n");
			} else {
				print("$c\n");
			}
		}
	}

	function dumpToken($token) {
		if (is_array($token)) {
			$result='Array' . PHP_EOL;
			$result.='(' . PHP_EOL;
			$result.='    [0] => ' . token_name($token[0]) . PHP_EOL;
			$result.='    [1] => ' . $token[1] . PHP_EOL;
			$result.='    [2] => ' . $token[2] . PHP_EOL;
			$result.=')' . PHP_EOL;
			echo $result;
		} else {
			print_r($token);
		}
	}

	function createGlobalsTrait($fileName) {
		$input=file_get_contents('templates/globals.scala');
		$result='';
		// $var='';
		foreach ($this->globals as $constant) {
			// if ($var) $var.=", ";
			// $var.="($constant,\"\")";
			// $result.="\tdef $constant : String = { return globals(\"$constant\") }\n";
			$result.="\tvar $constant : ref = null\n";
		}
		// $result.="\tvar globals = collection.mutable.Map( $var )\n";
		
		$output=str_replace('//%globals%', "\n" . $result, $input);
		if (!file_exists(dirname($fileName))) mkdir(dirname($fileName));
		file_put_contents($fileName, $output);
		// return $result;
	}

	function createConstantsTrait($fileName) {
		$input=file_get_contents('templates/constants.scala');
		$result='';
		// $var='';
		foreach ($this->constants as $constant) {
			// if ($var) $var.=", ";
			// $var.="($constant,\"\")";
			$result.="\tdef $constant : Value = { return constant(\"$constant\") }\n";
		}
		// $result.="\tvar constants = collection.mutable.Map( $var )\n";
		
		foreach (get_defined_constants(true) as $cat => $constants) {
			if (in_array($cat, $this->constantCategories)) {
				$result.="\t// $cat\n";
				foreach ($constants as $constant => $value) {
					if (!in_array($constant, $this->excludeConstants)) $result.="\tval $constant : Value = \"$value\"\n";
				}
			}
		}
		
		$output=str_replace('//%constants%', "\n" . $result, $input);
		if (!file_exists(dirname($fileName))) mkdir(dirname($fileName));
		file_put_contents($fileName, $output);
		// return $result;
	}
}
