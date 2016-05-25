# What is 'php2scala' ?

* Converts php code to scala.
* This project is a fork of 'php-to-scala-migration-helper', http://code.google.com/p/php-to-scala-migration-helper/

# Getting started

PHP has a standard library with thousands of built-in functions and extensions. Luckily for us, an Open Source Java implementation of those functions has existed for some time - as a feature known as Quercus buried inside the Caucho Resin application server.

The Ant script (build.xml) scans the Quercus source to produce a more transparent façade to the Quercus libraries: every PHP function is automatically in scope for subclasses of php.script which is defined in php.scala. This is all then packaged into php-scala.jar.

The functions are made available directly by name and with the same parameter signatures in the converted Scala code as in the original PHP script. In other words, the converted Scala code really looks identical to the PHP code, in regards to the use of built-in functions.

## Generate the php-scala.jar

Copy Caucho's Quercus source code in the directory quercus/src.

Run 
```
export SCALA_HOME='...'
ant -Dlib='...'
```

where:
* SCALA_HOME is the home directory of your Scala installation. For example for Scala installed on OSX with brew, this is '/usr/local/opt/scala/libexec'
* lib is the directory containing the required libraries quercus.jar and javaee-16.jar 

# Notes
Below is a description of the some of the more interesting transformations that are performed in the conversion from PHP to Scala.

## for loop

Scala does not have a traditional for loop.

The solution is to rewrite the for into a while loop: for(E;F;G){H} becomes E; while(F) {H; G}.

In a future release this will be re-implemented using higher-order function as for_loop(E,F,G){H}.

## Ternary Operator

Scala lacks a traditional ternary operator - ?:.

The solution, which preserves the overall "look and feel" of a ternary operator, is the ?| function, defined in php.scala, which takes a Boolean on the left and a function on the right. The expression E ? F : G becomes E ?| {if(_) F else G}

Although a simple if(E) F else G might seem like a simpler alternative, that would have required a much more complex transformation algorithm.

## Duck Typing

In PHP, it is possible to reference functions and members on an object of an unknown type. For instance, consider this PHP code: function f($obj) { $obj->doSomething(123); } In this case, the type of $obj is unknown. The doSomething() method is only resolved at run-time.

The Scala solution is actually rather simple. We define a dynamic resolution operator, ~&, which uses Java reflection to resolve the method. So the Scala code becomes: def f(obj: ref) { obj~&'doSomething->(123); } It looks slightly uglier than the PHP, but not too bad really. The developer can always clean-up the code later once the actual type is known: def f(obj: SomeClass) { obj.doSomething(123) } The ~& works for class functions. For class variables, the dynamic resolution operator is ~>. We have to use ~> instead of the more natural -> here only because of operator precedence.

## Scala Constructors

Scala is notorious for its restrictions on what constructors may be defined on a class.

The work-around for the converted PHP code is rather trivial: we just don't generate Scala constructors! Instead, every Scala class is given an empty constructor, and the PHP constructor is translated to a __construct method (that is literally the name of the method).

So, this PHP code: class Point { function Point($x,$y) { ... } } $p = new Point(1,2); is translated to this Scala code: class Point { def __construct(x: ref, y: ref) { ... } } p = new Point __construct(1,2); It looks a bit strange at first but is still quite bearable. The developer can always come back at a later time (after the PHP code has been thrown away for good) and change the __construct to an actual constructor. One major advantage of a static language like Scala is, that the developer can rely on the Scala compiler (or a good IDE) to point out all the references that need to be updated. The developer does not have to run the application to discover where all the errors are.

## String Concatenation

The . and .= are mapped to +& and +&= respectively. Suggestions for a better choice of symbol would be welcome.

## Number Arithmetic Semantics

PHP is notorious for its "flexible" numeric type which automatically expands from integer to double as needed. Scala on the other hand is stuck to more traditional Ints, Longs, and Doubles.

The solution here is to let Quercus handle the number semantics. It's all done within the NumberValue hierarchy which includes subclasses LongValue and DoubleValue. The performance does not seem to suffer from this. Scala's implicit conversions and operator overloading makes it all transparent to the developer: an expression like x = y + z looks the same regardless of whether the variables involved are Ints, Doubles, or Quercus NumberValues.

The Scala developer can later substitute Int and Double where appropriate, such as to make the code clearer, or slightly faster.

## Inline HTML

These are handled as Scala triple-quoted strings. Not a lot of testing done yet with this.

## eval()

Quercus has its own PHP parser and interpreter (in Java), which includes full support for eval. This just hasn't been integrated or tested with php-to-scala yet, but it should work with minimal effort.

## __DIR__
The __DIR__ constant is replaced with new File(".").getCanonicalPath()

# Limitations
## @ error control operator
Should be removed from the code.

## require, require_once, include, include_once
Is bypassed by the convertor. Best to use a dynamic class loader in PHP.

# License

* GNU General Public License, v3


# Release Notes
## Features planned for future releases

* Pretty-print (auto-indent) the Scala output
* Performance improvements
* Type-inference based on function type-hints
* Type-inference based on global static analysis
* Complete integration with Quercus - still missing I/O, ob_handler, eval(), etc
* Clean-up the "$" types with well thought-out behaviors; currently it's a bit ad-hoc
* Still need an overall strategy and details for dealing with "large" applications (multiple PHP scripts, such as in a web app).
* Port the build/test scripts (mklib.sh, runtests.sh) to Scala so they can run on Windows

## New Features in v0.6 (2010-04-28)

* This was a performance-focused release. The roman number generator (test_2) is now 3.4x FASTER in the generated Scala versus the original PHP. That is based on the straight output of the source converter, without any optimizations such as replacing the dynamically-typed variables with Ints or Strings. With the latter, performance would probably another 2x faster at least.

## New Features in v0.5 (2010-04-27)

* Ternary operator (?:) converts to |?
* Fuller support for arrays, including type inference, foreach(...as...){} and constructor syntax
* New testcase (test_2, a roman numeral generator) - executes successfully!
* Parser handling for assignment in while loop condition
* Specific patches for str_replace, isset.
* String concatenation operators +& and +=& (like PHP's . and .= )
* New and improved execution speed! (see PerformanceBenchmarks)

## New Features in v0.4 (2010-04-22)

* Success! This is the first release where the PI Digit Generator (test_1) works!
* This qualifies as an "Alpha" release! It is sufficiently functional now to encourage volunteers to try it out and contribute their own improvements :)
* Finished up the basic integration with Quercus. A total of 1,054 (over one thousand) standard PHP functions are now integrated and available for use. What remains now are the functions that could not be handled by the automatic build script due to unusual signatures, duplicate names, etc and had to be manually excluded (see mklib.sh).
* Finished up the basic Scala-friendly "php-like" types ($int, $str, $obj, $val, and $null) which provide implicit conversions and other syntactic niceties that keep the generated Scala code free of clutter.
* Introduced "idiomatic" dynamic resolution operators ~> for variables and ~& for functions (note that "~>" had to be chosen over "->" due to Scala's operator precedence rules)
* First benchmark: test_1.php 200 runs in 0.7 seconds; test_1.scala in 16 seconds. Yes it is surprisingly slow - and the cause for slowness is even more surprising! See PerformanceBenchmarks for details.
* Use static binding ("." instead of "~>") for references to this. That's more aesthetically pleasing but actually provided no speed gain - reflection is pretty fast!
* String variable interpolation syntax is working too now

## New Features in v0.3 (2010-04-18)

* This was a rather buggy interim release. Nothing works.

## New Features in v0.2 (2010-04-16)

* Begun integration with the Quercus run-time (full PHP library implementation in Java)
* Right now everything compiles fine but only test_0.php (Hello World) runs successfully
* Successful compilation of test_1.scala!!! It still doesn't run, as the Quercus integration is unfinished
* The conversion of constructors now is nice and clean, although not "idiomatic Scala"
* Renamed php.value to '$', to identify generic PHP variables.
* Primitive type-inference (everything is a '$', but at least it is declared)
* Implemented implicit conversions in php.scala
* Improved type inference - variables assigned to an integer are declared var:Int

## Features implemented in v0.1 (2010-04-12)

* Use the built-in PHP tokenizer for correctness (should handle complex scripts)
* Recursive "look-ahead" parser avoids an AST, this helps preserve code structure.
* Breaking up of for(;;) loops into scala while() loops is working.
* Use correct syntax for function declaration (including no '=' for non-returning)
* Removal of dollar signs from all variables
* Change of array index square brackets to parens.
* Change of object operator -> to '.'
* Inline HTML for now just invokes an "output" function with triple-quoted string.
* Correct handling of command-syntax (e.g. print) by adding parenthesis.
* File scope becomes an object scope; this should help a later "aliasing" scheme.
