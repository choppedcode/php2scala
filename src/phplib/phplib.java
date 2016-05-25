package phplib;

import java.io.*;
import java.nio.file.Paths;
import java.math.BigDecimal;
import javax.servlet.*;
import javax.servlet.http.*;

import com.caucho.vfs.*;
import com.caucho.quercus.*;
import com.caucho.quercus.env.*;
import com.caucho.quercus.annotation.*;
import com.caucho.quercus.lib.*;
import com.caucho.quercus.lib.curl.*;
import com.caucho.quercus.lib.date.*;
import com.caucho.quercus.lib.db.*;
import com.caucho.quercus.lib.dom.*;
import com.caucho.quercus.lib.file.*;
import com.caucho.quercus.lib.gettext.*;
import com.caucho.quercus.lib.i18n.*;
import com.caucho.quercus.lib.jms.*;
import com.caucho.quercus.lib.json.*;
import com.caucho.quercus.lib.mail.*;
import com.caucho.quercus.lib.mcrypt.*;
import com.caucho.quercus.lib.reflection.*;
import com.caucho.quercus.lib.regexp.*;
import com.caucho.quercus.lib.session.*;
import com.caucho.quercus.lib.simplexml.*;
import com.caucho.quercus.lib.spl.*;
import com.caucho.quercus.lib.string.*;
import com.caucho.quercus.lib.xml.*;
import com.caucho.quercus.lib.zip.*;
import com.caucho.quercus.lib.zlib.*;

import com.caucho.quercus.lib.ImageModule.QuercusImage;

public class phplib {

  private final Env quercus_context;
    
  public phplib(Env env) {
    this.quercus_context = env;
  } 



/* ./com/caucho/quercus/lib/ArrayModule.java : array_change_key_case */
final public Value array_change_key_case (ArrayValue array,@Optional("CASE_LOWER") int toCase) {
 return com.caucho.quercus.lib.ArrayModule.array_change_key_case (quercus_context,array,toCase);
}
final public Value array_change_key_case (ArrayValue array) {
 int toCase = 0;

 return com.caucho.quercus.lib.ArrayModule.array_change_key_case (quercus_context,array,toCase);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_chunk */
final public Value array_chunk (ArrayValue array,int size,@Optional boolean preserveKeys) {
 return com.caucho.quercus.lib.ArrayModule.array_chunk (quercus_context,array,size,preserveKeys);
}
final public Value array_chunk (ArrayValue array, int size) {
 boolean preserveKeys = false;

 return com.caucho.quercus.lib.ArrayModule.array_chunk (quercus_context,array,size,preserveKeys);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_combine */
final public Value array_combine (ArrayValue keys,ArrayValue values) {
 return com.caucho.quercus.lib.ArrayModule.array_combine (quercus_context,keys,values);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_count_values */
final public Value array_count_values (ArrayValue array) {
 return com.caucho.quercus.lib.ArrayModule.array_count_values (quercus_context,array);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_pop */
final public Value array_pop (Value array) {
 return com.caucho.quercus.lib.ArrayModule.array_pop (quercus_context,array);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : count */
final public long count (@ReadOnly Value value,@Optional int countMethod) {
 return com.caucho.quercus.lib.ArrayModule.count (quercus_context,value,countMethod);
}
final public long count (@ReadOnly Value value) {
 int countMethod = 0;

 return com.caucho.quercus.lib.ArrayModule.count (quercus_context,value,countMethod);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : current */
final public Value current (@ReadOnly Value value) {
 return com.caucho.quercus.lib.ArrayModule.current (value);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : key */
final public Value key (@ReadOnly Value value) {
 return com.caucho.quercus.lib.ArrayModule.key (value);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : pos */
final public Value pos (@ReadOnly Value value) {
 return com.caucho.quercus.lib.ArrayModule.pos (value);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : next */
final public Value next (Value value) {
 return com.caucho.quercus.lib.ArrayModule.next (value);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : each */
final public Value each (Value value) {
 return com.caucho.quercus.lib.ArrayModule.each (quercus_context,value);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : prev */
final public Value prev (Value array) {
 return com.caucho.quercus.lib.ArrayModule.prev (array);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : reset */
final public Value reset (Value array) {
 return com.caucho.quercus.lib.ArrayModule.reset (array);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : shuffle */
final public Value shuffle (Value array) {
 return com.caucho.quercus.lib.ArrayModule.shuffle (quercus_context,array);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : end */
final public Value end (Value value) {
 return com.caucho.quercus.lib.ArrayModule.end (value);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_key_exists */
final public boolean array_key_exists (@ReadOnly Value key,@ReadOnly Value searchArray) {
 return com.caucho.quercus.lib.ArrayModule.array_key_exists (quercus_context,key,searchArray);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : key_exists */
final public boolean key_exists (@ReadOnly Value key,@ReadOnly Value searchArray) {
 return com.caucho.quercus.lib.ArrayModule.key_exists (quercus_context,key,searchArray);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_keys */
final public Value array_keys (@ReadOnly ArrayValue array,@Optional @ReadOnly Value searchValue,@Optional boolean isStrict) {
 return com.caucho.quercus.lib.ArrayModule.array_keys (quercus_context,array,searchValue,isStrict);
}
final public Value array_keys (@ReadOnly ArrayValue array, @Optional @ReadOnly Value searchValue) {
 boolean isStrict = false;

 return com.caucho.quercus.lib.ArrayModule.array_keys (quercus_context,array,searchValue,isStrict);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_fill */
final public Value array_fill (long start,long num,Value value) {
 return com.caucho.quercus.lib.ArrayModule.array_fill (quercus_context,start,num,value);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_flip */
final public Value array_flip (ArrayValue array) {
 return com.caucho.quercus.lib.ArrayModule.array_flip (quercus_context,array);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_pad */
final public Value array_pad (ArrayValue input,long padSize,Value padValue) {
 return com.caucho.quercus.lib.ArrayModule.array_pad (quercus_context,input,padSize,padValue);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_filter */
final public Value array_filter (ArrayValue array,@Optional Value callbackName) {
 return com.caucho.quercus.lib.ArrayModule.array_filter (quercus_context,array,callbackName);
}
final public Value array_filter (ArrayValue array) {
 Value callbackName = null;

 return com.caucho.quercus.lib.ArrayModule.array_filter (quercus_context,array,callbackName);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_product */
final public Value array_product (ArrayValue array) {
 return com.caucho.quercus.lib.ArrayModule.array_product (quercus_context,array);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_push */
final public int array_push (Value array, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_push (quercus_context,array,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_rand */
final public Value array_rand (ArrayValue array,@Optional("1") long num) {
 return com.caucho.quercus.lib.ArrayModule.array_rand (quercus_context,array,num);
}
final public Value array_rand (ArrayValue array) {
 long num = 1l;

 return com.caucho.quercus.lib.ArrayModule.array_rand (quercus_context,array,num);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_reduce */
final public Value array_reduce (ArrayValue array,Callable callable,@Optional("NULL") Value initialValue) {
 return com.caucho.quercus.lib.ArrayModule.array_reduce (quercus_context,array,callable,initialValue);
}
final public Value array_reduce (ArrayValue array, Callable callable) {
 Value initialValue = null;

 return com.caucho.quercus.lib.ArrayModule.array_reduce (quercus_context,array,callable,initialValue);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_reverse */
final public Value array_reverse (ArrayValue inputArray,@Optional("false") boolean keyed) {
 return com.caucho.quercus.lib.ArrayModule.array_reverse (quercus_context,inputArray,keyed);
}
final public Value array_reverse (ArrayValue inputArray) {
 boolean keyed = false;

 return com.caucho.quercus.lib.ArrayModule.array_reverse (quercus_context,inputArray,keyed);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_search */
final public Value array_search (@ReadOnly Value needle,@ReadOnly ArrayValue array,@Optional("false") boolean strict) {
 return com.caucho.quercus.lib.ArrayModule.array_search (quercus_context,needle,array,strict);
}
final public Value array_search (@ReadOnly Value needle, @ReadOnly ArrayValue array) {
 boolean strict = false;

 return com.caucho.quercus.lib.ArrayModule.array_search (quercus_context,needle,array,strict);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_shift */
final public Value array_shift (Value value) {
 return com.caucho.quercus.lib.ArrayModule.array_shift (quercus_context,value);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_slice */
final public Value array_slice (@ReadOnly ArrayValue array,int offset,@Optional Value length,@Optional boolean isPreserveKeys) {
 return com.caucho.quercus.lib.ArrayModule.array_slice (quercus_context,array,offset,length,isPreserveKeys);
}
final public Value array_slice (@ReadOnly ArrayValue array, int offset) {
 Value length = null;
boolean isPreserveKeys = false;

 return com.caucho.quercus.lib.ArrayModule.array_slice (quercus_context,array,offset,length,isPreserveKeys);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_splice */
final public Value array_splice (Value arrayVar,int offset,@Optional("NULL") Value length,@Optional Value replace) {
 return com.caucho.quercus.lib.ArrayModule.array_splice (quercus_context,arrayVar,offset,length,replace);
}
final public Value array_splice (Value arrayVar, int offset) {
 Value length = null;
Value replace = null;

 return com.caucho.quercus.lib.ArrayModule.array_splice (quercus_context,arrayVar,offset,length,replace);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : spliceImpl */
final public Value spliceImpl (Value var,ArrayValue array,int start,int end,ArrayValue replace) {
 return com.caucho.quercus.lib.ArrayModule.spliceImpl (quercus_context,var,array,start,end,replace);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_sum */
final public Value array_sum (@ReadOnly ArrayValue array) {
 return com.caucho.quercus.lib.ArrayModule.array_sum (quercus_context,array);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_unique */
final public Value array_unique (ArrayValue array) {
 return com.caucho.quercus.lib.ArrayModule.array_unique (quercus_context,array);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_unshift */
final public Value array_unshift (Value value, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_unshift (quercus_context,value,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_values */
final public Value array_values (ArrayValue array) {
 return com.caucho.quercus.lib.ArrayModule.array_values (quercus_context,array);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_walk */
final public boolean array_walk (Value arrayVar,Callable callback,@Optional("NULL") Value userData) {
 return com.caucho.quercus.lib.ArrayModule.array_walk (quercus_context,arrayVar,callback,userData);
}
final public boolean array_walk (Value arrayVar, Callable callback) {
 Value userData = null;

 return com.caucho.quercus.lib.ArrayModule.array_walk (quercus_context,arrayVar,callback,userData);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_walk_recursive */
final public boolean array_walk_recursive (Value arrayVar,Callable callback,@Optional("NULL") Value extra) {
 return com.caucho.quercus.lib.ArrayModule.array_walk_recursive (quercus_context,arrayVar,callback,extra);
}
final public boolean array_walk_recursive (Value arrayVar, Callable callback) {
 Value extra = null;

 return com.caucho.quercus.lib.ArrayModule.array_walk_recursive (quercus_context,arrayVar,callback,extra);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : arsort */
final public boolean arsort (Value arrayVar,@Optional long sortFlag) {
 return com.caucho.quercus.lib.ArrayModule.arsort (quercus_context,arrayVar,sortFlag);
}
final public boolean arsort (Value arrayVar) {
 long sortFlag = 0;

 return com.caucho.quercus.lib.ArrayModule.arsort (quercus_context,arrayVar,sortFlag);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : asort */
final public boolean asort (Value arrayVar,@Optional long sortFlag) {
 return com.caucho.quercus.lib.ArrayModule.asort (quercus_context,arrayVar,sortFlag);
}
final public boolean asort (Value arrayVar) {
 long sortFlag = 0;

 return com.caucho.quercus.lib.ArrayModule.asort (quercus_context,arrayVar,sortFlag);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : ksort */
final public boolean ksort (Value arrayVar,@Optional long sortFlag) {
 return com.caucho.quercus.lib.ArrayModule.ksort (quercus_context,arrayVar,sortFlag);
}
final public boolean ksort (Value arrayVar) {
 long sortFlag = 0;

 return com.caucho.quercus.lib.ArrayModule.ksort (quercus_context,arrayVar,sortFlag);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : krsort */
final public boolean krsort (Value arrayVar,@Optional long sortFlag) {
 return com.caucho.quercus.lib.ArrayModule.krsort (quercus_context,arrayVar,sortFlag);
}
final public boolean krsort (Value arrayVar) {
 long sortFlag = 0;

 return com.caucho.quercus.lib.ArrayModule.krsort (quercus_context,arrayVar,sortFlag);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : natsort */
final public Value natsort (Value arrayVar) {
 return com.caucho.quercus.lib.ArrayModule.natsort (quercus_context,arrayVar);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : natcasesort */
final public Value natcasesort (Value arrayVar) {
 return com.caucho.quercus.lib.ArrayModule.natcasesort (quercus_context,arrayVar);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : in_array */
final public boolean in_array (@ReadOnly Value needle,@ReadOnly ArrayValue stack,@Optional("false") boolean strict) {
 return com.caucho.quercus.lib.ArrayModule.in_array (needle,stack,strict);
}
final public boolean in_array (@ReadOnly Value needle, @ReadOnly ArrayValue stack) {
 boolean strict = false;

 return com.caucho.quercus.lib.ArrayModule.in_array (needle,stack,strict);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : sort */
final public boolean sort (Value arrayVar,@Optional long sortFlag) {
 return com.caucho.quercus.lib.ArrayModule.sort (quercus_context,arrayVar,sortFlag);
}
final public boolean sort (Value arrayVar) {
 long sortFlag = 0;

 return com.caucho.quercus.lib.ArrayModule.sort (quercus_context,arrayVar,sortFlag);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : rsort */
final public boolean rsort (Value arrayVar,@Optional long sortFlag) {
 return com.caucho.quercus.lib.ArrayModule.rsort (quercus_context,arrayVar,sortFlag);
}
final public boolean rsort (Value arrayVar) {
 long sortFlag = 0;

 return com.caucho.quercus.lib.ArrayModule.rsort (quercus_context,arrayVar,sortFlag);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : usort */
final public boolean usort (Value arrayVar,Callable func,@Optional long sortFlag) {
 return com.caucho.quercus.lib.ArrayModule.usort (quercus_context,arrayVar,func,sortFlag);
}
final public boolean usort (Value arrayVar, Callable func) {
 long sortFlag = 0;

 return com.caucho.quercus.lib.ArrayModule.usort (quercus_context,arrayVar,func,sortFlag);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : uasort */
final public boolean uasort (Value arrayVar,Callable func,@Optional long sortFlag) {
 return com.caucho.quercus.lib.ArrayModule.uasort (quercus_context,arrayVar,func,sortFlag);
}
final public boolean uasort (Value arrayVar, Callable func) {
 long sortFlag = 0;

 return com.caucho.quercus.lib.ArrayModule.uasort (quercus_context,arrayVar,func,sortFlag);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : uksort */
final public boolean uksort (Value arrayVar,Callable func,@Optional long sortFlag) {
 return com.caucho.quercus.lib.ArrayModule.uksort (quercus_context,arrayVar,func,sortFlag);
}
final public boolean uksort (Value arrayVar, Callable func) {
 long sortFlag = 0;

 return com.caucho.quercus.lib.ArrayModule.uksort (quercus_context,arrayVar,func,sortFlag);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : range */
final public Value range (@ReadOnly Value start,@ReadOnly Value end,@Optional("1") long step) {
 return com.caucho.quercus.lib.ArrayModule.range (quercus_context,start,end,step);
}
final public Value range (@ReadOnly Value start, @ReadOnly Value end) {
 long step = 1l;

 return com.caucho.quercus.lib.ArrayModule.range (quercus_context,start,end,step);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : extract */
final public Value extract (ArrayValue array) {
 return com.caucho.quercus.lib.ArrayModule.extract (quercus_context,array);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : extract */
final public Value extract (ArrayValue array,long rawType,@Optional("NULL") Value valuePrefix) {
 return com.caucho.quercus.lib.ArrayModule.extract (quercus_context,array,rawType,valuePrefix);
}
final public Value extract (ArrayValue array, long rawType) {
 Value valuePrefix = null;

 return com.caucho.quercus.lib.ArrayModule.extract (quercus_context,array,rawType,valuePrefix);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_diff */
final public Value array_diff (ArrayValue array, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_diff (quercus_context,array,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_fill_keys */
final public ArrayValue array_fill_keys (ArrayValue keyArray,Value value) {
 return com.caucho.quercus.lib.ArrayModule.array_fill_keys (quercus_context,keyArray,value);
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_diff_assoc */
final public Value array_diff_assoc (ArrayValue array, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_diff_assoc (quercus_context,array,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_diff_key */
final public Value array_diff_key (ArrayValue array, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_diff_key (quercus_context,array,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_diff_uassoc */
final public Value array_diff_uassoc (ArrayValue array, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_diff_uassoc (quercus_context,array,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_diff_ukey */
final public Value array_diff_ukey (ArrayValue array, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_diff_ukey (quercus_context,array,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_intersect */
final public Value array_intersect (ArrayValue array, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_intersect (quercus_context,array,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_intersect_assoc */
final public Value array_intersect_assoc (ArrayValue array, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_intersect_assoc (quercus_context,array,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_intersect_key */
final public Value array_intersect_key (ArrayValue array, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_intersect_key (quercus_context,array,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_intersect_uassoc */
final public Value array_intersect_uassoc (ArrayValue array, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_intersect_uassoc (quercus_context,array,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_intersect_ukey */
final public Value array_intersect_ukey (ArrayValue array, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_intersect_ukey (quercus_context,array,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_map */
final public Value array_map (Callable fun, ArrayValue arg, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_map (quercus_context,fun,arg,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_merge */
final public Value array_merge (Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_merge (quercus_context,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_merge_recursive */
final public Value array_merge_recursive (Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_merge_recursive (quercus_context,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_multisort */
final public boolean array_multisort (Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_multisort (quercus_context,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_udiff */
final public Value array_udiff (Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_udiff (quercus_context,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_udiff_assoc */
final public Value array_udiff_assoc (Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_udiff_assoc (quercus_context,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_udiff_uassoc */
final public Value array_udiff_uassoc (Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_udiff_uassoc (quercus_context,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_uintersect */
final public Value array_uintersect (Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_uintersect (quercus_context,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_uintersect_assoc */
final public Value array_uintersect_assoc (Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_uintersect_assoc (quercus_context,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : array_uintersect_uassoc */
final public Value array_uintersect_uassoc (Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.array_uintersect_uassoc (quercus_context,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : compact */
final public ArrayValue compact (Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ArrayModule.compact (quercus_context,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ArrayModule.java : sizeof */
final public long sizeof (@ReadOnly Value value,@Optional int countMethod) {
 return com.caucho.quercus.lib.ArrayModule.sizeof (quercus_context,value,countMethod);
}
final public long sizeof (@ReadOnly Value value) {
 int countMethod = 0;

 return com.caucho.quercus.lib.ArrayModule.sizeof (quercus_context,value,countMethod);
}


/* ./com/caucho/quercus/lib/BcmathModule.java : bcadd */
final public String bcadd (Value value1,Value value2,@Optional("-1") int scale) {
 return com.caucho.quercus.lib.BcmathModule.bcadd (quercus_context,value1,value2,scale);
}
final public String bcadd (Value value1, Value value2) {
 int scale = -1;

 return com.caucho.quercus.lib.BcmathModule.bcadd (quercus_context,value1,value2,scale);
}


/* ./com/caucho/quercus/lib/BcmathModule.java : bccomp */
final public int bccomp (Value value1,Value value2,@Optional("-1") int scale) {
 return com.caucho.quercus.lib.BcmathModule.bccomp (quercus_context,value1,value2,scale);
}
final public int bccomp (Value value1, Value value2) {
 int scale = -1;

 return com.caucho.quercus.lib.BcmathModule.bccomp (quercus_context,value1,value2,scale);
}


/* ./com/caucho/quercus/lib/BcmathModule.java : bcdiv */
final public String bcdiv (Value value1,Value value2,@Optional("-1") int scale) {
 return com.caucho.quercus.lib.BcmathModule.bcdiv (quercus_context,value1,value2,scale);
}
final public String bcdiv (Value value1, Value value2) {
 int scale = -1;

 return com.caucho.quercus.lib.BcmathModule.bcdiv (quercus_context,value1,value2,scale);
}


/* ./com/caucho/quercus/lib/BcmathModule.java : bcmod */
final public String bcmod (Value value,Value modulus) {
 return com.caucho.quercus.lib.BcmathModule.bcmod (quercus_context,value,modulus);
}


/* ./com/caucho/quercus/lib/BcmathModule.java : bcmul */
final public String bcmul (Value value1,Value value2,@Optional("-1") int scale) {
 return com.caucho.quercus.lib.BcmathModule.bcmul (quercus_context,value1,value2,scale);
}
final public String bcmul (Value value1, Value value2) {
 int scale = -1;

 return com.caucho.quercus.lib.BcmathModule.bcmul (quercus_context,value1,value2,scale);
}


/* ./com/caucho/quercus/lib/BcmathModule.java : bcpow */
final public String bcpow (Value base,Value exp,@Optional("-1") int scale) {
 return com.caucho.quercus.lib.BcmathModule.bcpow (quercus_context,base,exp,scale);
}
final public String bcpow (Value base, Value exp) {
 int scale = -1;

 return com.caucho.quercus.lib.BcmathModule.bcpow (quercus_context,base,exp,scale);
}


/* ./com/caucho/quercus/lib/BcmathModule.java : bcpowmod */
final public String bcpowmod (BigDecimal base,BigDecimal exp,BigDecimal modulus,@Optional("-1") int scale) {
 return com.caucho.quercus.lib.BcmathModule.bcpowmod (quercus_context,base,exp,modulus,scale);
}
final public String bcpowmod (BigDecimal base, BigDecimal exp, BigDecimal modulus) {
 int scale = -1;

 return com.caucho.quercus.lib.BcmathModule.bcpowmod (quercus_context,base,exp,modulus,scale);
}


/* ./com/caucho/quercus/lib/BcmathModule.java : bcscale */
final public boolean bcscale (int scale) {
 return com.caucho.quercus.lib.BcmathModule.bcscale (quercus_context,scale);
}


/* ./com/caucho/quercus/lib/BcmathModule.java : bcsqrt */
final public String bcsqrt (Value operand,@Optional("-1") int scale) {
 return com.caucho.quercus.lib.BcmathModule.bcsqrt (quercus_context,operand,scale);
}
final public String bcsqrt (Value operand) {
 int scale = -1;

 return com.caucho.quercus.lib.BcmathModule.bcsqrt (quercus_context,operand,scale);
}


/* ./com/caucho/quercus/lib/BcmathModule.java : bcsub */
final public String bcsub (Value value1,Value value2,@Optional("-1") int scale) {
 return com.caucho.quercus.lib.BcmathModule.bcsub (quercus_context,value1,value2,scale);
}
final public String bcsub (Value value1, Value value2) {
 int scale = -1;

 return com.caucho.quercus.lib.BcmathModule.bcsub (quercus_context,value1,value2,scale);
}


/* ./com/caucho/quercus/lib/ClassesModule.java : call_user_method */
final public Value call_user_method (StringValue name, Value obj, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.ClassesModule.call_user_method (quercus_context,name,obj,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/ClassesModule.java : call_user_method_array */
final public Value call_user_method_array (StringValue methodName,Value obj,ArrayValue params) {
 return com.caucho.quercus.lib.ClassesModule.call_user_method_array (quercus_context,methodName,obj,params);
}


/* ./com/caucho/quercus/lib/ClassesModule.java : get_class_methods */
final public Value get_class_methods (Value cls) {
 return com.caucho.quercus.lib.ClassesModule.get_class_methods (quercus_context,cls);
}


/* ./com/caucho/quercus/lib/ClassesModule.java : get_class_vars */
final public Value get_class_vars (Value obj) {
 return com.caucho.quercus.lib.ClassesModule.get_class_vars (quercus_context,obj);
}


/* ./com/caucho/quercus/lib/ClassesModule.java : get_declared_classes */
final public Value get_declared_classes () {
 return com.caucho.quercus.lib.ClassesModule.get_declared_classes (quercus_context);
}


/* ./com/caucho/quercus/lib/ClassesModule.java : get_object_vars */
final public Value get_object_vars (Value obj) {
 return com.caucho.quercus.lib.ClassesModule.get_object_vars (quercus_context,obj);
}


/* ./com/caucho/quercus/lib/ClassesModule.java : is_a */
final public boolean is_a (@ReadOnly Value value,String name) {
 return com.caucho.quercus.lib.ClassesModule.is_a (value,name);
}


/* ./com/caucho/quercus/lib/ClassesModule.java : is_object */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/ClassesModule.java : is_subclass_of */
final public boolean is_subclass_of (@ReadOnly Value value,String name) {
 return com.caucho.quercus.lib.ClassesModule.is_subclass_of (quercus_context,value,name);
}


/* ./com/caucho/quercus/lib/ClassesModule.java : method_exists */
final public boolean method_exists (Value obj,StringValue methodName) {
 return com.caucho.quercus.lib.ClassesModule.method_exists (quercus_context,obj,methodName);
}


/* ./com/caucho/quercus/lib/ClassesModule.java : property_exists */
final public Value property_exists (Value obj,StringValue name) {
 return com.caucho.quercus.lib.ClassesModule.property_exists (quercus_context,obj,name);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : ctype_alnum */
final public boolean ctype_alnum (Value value) {
 return com.caucho.quercus.lib.CtypeModule.ctype_alnum (value);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : ctype_alpha */
final public boolean ctype_alpha (Value value) {
 return com.caucho.quercus.lib.CtypeModule.ctype_alpha (value);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : ctype_cntrl */
final public boolean ctype_cntrl (Value value) {
 return com.caucho.quercus.lib.CtypeModule.ctype_cntrl (value);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : ctype_digit */
final public boolean ctype_digit (Value value) {
 return com.caucho.quercus.lib.CtypeModule.ctype_digit (value);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : ctype_graph */
final public boolean ctype_graph (Value value) {
 return com.caucho.quercus.lib.CtypeModule.ctype_graph (value);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : ctype_lower */
final public boolean ctype_lower (Value value) {
 return com.caucho.quercus.lib.CtypeModule.ctype_lower (value);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : ctype_print */
final public boolean ctype_print (Value value) {
 return com.caucho.quercus.lib.CtypeModule.ctype_print (value);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : ctype_punct */
final public boolean ctype_punct (Value value) {
 return com.caucho.quercus.lib.CtypeModule.ctype_punct (value);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : ctype_space */
final public boolean ctype_space (Value value) {
 return com.caucho.quercus.lib.CtypeModule.ctype_space (value);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : ctype_upper */
final public boolean ctype_upper (Value value) {
 return com.caucho.quercus.lib.CtypeModule.ctype_upper (value);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : ctype_xdigit */
final public boolean ctype_xdigit (Value value) {
 return com.caucho.quercus.lib.CtypeModule.ctype_xdigit (value);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : isalnum */
final public boolean isalnum (int ch) {
 return com.caucho.quercus.lib.CtypeModule.isalnum (ch);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : isalpha */
final public boolean isalpha (int ch) {
 return com.caucho.quercus.lib.CtypeModule.isalpha (ch);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : iscntrl */
final public boolean iscntrl (int ch) {
 return com.caucho.quercus.lib.CtypeModule.iscntrl (ch);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : isdigit */
final public boolean isdigit (int ch) {
 return com.caucho.quercus.lib.CtypeModule.isdigit (ch);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : isgraph */
final public boolean isgraph (int ch) {
 return com.caucho.quercus.lib.CtypeModule.isgraph (ch);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : islower */
final public boolean islower (int ch) {
 return com.caucho.quercus.lib.CtypeModule.islower (ch);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : isprint */
final public boolean isprint (int ch) {
 return com.caucho.quercus.lib.CtypeModule.isprint (ch);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : ispunct */
final public boolean ispunct (int ch) {
 return com.caucho.quercus.lib.CtypeModule.ispunct (ch);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : isspace */
final public boolean isspace (int ch) {
 return com.caucho.quercus.lib.CtypeModule.isspace (ch);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : isupper */
final public boolean isupper (int ch) {
 return com.caucho.quercus.lib.CtypeModule.isupper (ch);
}


/* ./com/caucho/quercus/lib/CtypeModule.java : isxdigit */
final public boolean isxdigit (int ch) {
 return com.caucho.quercus.lib.CtypeModule.isxdigit (ch);
}


/* ./com/caucho/quercus/lib/curl/Authentication.java : getAuthorization */
final public String getAuthorization (String user,String pass,String requestMethod,String uri,String header) {
 return com.caucho.quercus.lib.curl.Authentication.getAuthorization (user,pass,requestMethod,uri,header);
}


/* ./com/caucho/quercus/lib/curl/Authentication.java : basic */
final public String basic (String user,String pass) {
 return com.caucho.quercus.lib.curl.Authentication.basic (user,pass);
}


/* ./com/caucho/quercus/lib/curl/Authentication.java : basic */
final public String basic (String usernamePassword) {
 return com.caucho.quercus.lib.curl.Authentication.basic (usernamePassword);
}


/* ./com/caucho/quercus/lib/curl/Authentication.java : digest */
final public String digest (String user,String pass,String requestMethod,String uri,String header) {
 return com.caucho.quercus.lib.curl.Authentication.digest (user,pass,requestMethod,uri,header);
}


/* ./com/caucho/quercus/lib/curl/CurlHostnameVerifier.java : create */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/curl/CurlHostnameVerifier.java : create */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/curl/CurlModule.java : curl_close */
final public void curl_close (@NotNull CurlResource curl) {
  com.caucho.quercus.lib.curl.CurlModule.curl_close (quercus_context,curl);
}


/* ./com/caucho/quercus/lib/curl/CurlModule.java : curl_copy_handle */
final public CurlResource curl_copy_handle (@NotNull CurlResource curl) {
 return com.caucho.quercus.lib.curl.CurlModule.curl_copy_handle (quercus_context,curl);
}


/* ./com/caucho/quercus/lib/curl/CurlModule.java : curl_errno */
final public Value curl_errno (@NotNull CurlResource curl) {
 return com.caucho.quercus.lib.curl.CurlModule.curl_errno (quercus_context,curl);
}


/* ./com/caucho/quercus/lib/curl/CurlModule.java : curl_error */
final public Value curl_error (@NotNull CurlResource curl) {
 return com.caucho.quercus.lib.curl.CurlModule.curl_error (quercus_context,curl);
}


/* ./com/caucho/quercus/lib/curl/CurlModule.java : curl_exec */
final public Value curl_exec (@NotNull CurlResource curl) {
 return com.caucho.quercus.lib.curl.CurlModule.curl_exec (quercus_context,curl);
}


/* ./com/caucho/quercus/lib/curl/CurlModule.java : curl_getinfo */
final public Value curl_getinfo (@NotNull CurlResource curl,@Optional Value option) {
 return com.caucho.quercus.lib.curl.CurlModule.curl_getinfo (quercus_context,curl,option);
}
final public Value curl_getinfo (@NotNull CurlResource curl) {
 Value option = null;

 return com.caucho.quercus.lib.curl.CurlModule.curl_getinfo (quercus_context,curl,option);
}


/* ./com/caucho/quercus/lib/curl/CurlModule.java : curl_init */
final public CurlResource curl_init (@Optional("") String url) {
 return com.caucho.quercus.lib.curl.CurlModule.curl_init (quercus_context,url);
}
final public CurlResource curl_init () {
 String url = "";

 return com.caucho.quercus.lib.curl.CurlModule.curl_init (quercus_context,url);
}


/* ./com/caucho/quercus/lib/curl/CurlModule.java : curl_multi_add_handle */
final public LongValue curl_multi_add_handle (Value curls,Value curl) {
 return com.caucho.quercus.lib.curl.CurlModule.curl_multi_add_handle (quercus_context,curls,curl);
}


/* ./com/caucho/quercus/lib/curl/CurlModule.java : curl_multi_close */
final public LongValue curl_multi_close (Value curls) {
 return com.caucho.quercus.lib.curl.CurlModule.curl_multi_close (quercus_context,curls);
}


/* ./com/caucho/quercus/lib/curl/CurlModule.java : curl_multi_exec */
final public LongValue curl_multi_exec (Value curls,Value stillRunning) {
 return com.caucho.quercus.lib.curl.CurlModule.curl_multi_exec (quercus_context,curls,stillRunning);
}


/* ./com/caucho/quercus/lib/curl/CurlModule.java : curl_multi_getcontent */
final public StringValue curl_multi_getcontent (Value curl) {
 return com.caucho.quercus.lib.curl.CurlModule.curl_multi_getcontent (quercus_context,curl);
}


/* ./com/caucho/quercus/lib/curl/CurlModule.java : curl_multi_info_read */
final public ArrayValue curl_multi_info_read (Value curls) {
 return com.caucho.quercus.lib.curl.CurlModule.curl_multi_info_read (quercus_context,curls);
}


/* ./com/caucho/quercus/lib/curl/CurlModule.java : curl_multi_init */
final public Value curl_multi_init () {
 return com.caucho.quercus.lib.curl.CurlModule.curl_multi_init (quercus_context);
}


/* ./com/caucho/quercus/lib/curl/CurlModule.java : curl_multi_remove_handle */
final public LongValue curl_multi_remove_handle (Value curls,Value curl) {
 return com.caucho.quercus.lib.curl.CurlModule.curl_multi_remove_handle (quercus_context,curls,curl);
}


/* ./com/caucho/quercus/lib/curl/CurlModule.java : curl_multi_select */
final public LongValue curl_multi_select (Value curls,@Optional Value timeout) {
 return com.caucho.quercus.lib.curl.CurlModule.curl_multi_select (quercus_context,curls,timeout);
}
final public LongValue curl_multi_select (Value curls) {
 Value timeout = null;

 return com.caucho.quercus.lib.curl.CurlModule.curl_multi_select (quercus_context,curls,timeout);
}


/* ./com/caucho/quercus/lib/curl/CurlModule.java : curl_setopt_array */
final public BooleanValue curl_setopt_array (@NotNull CurlResource curl,ArrayValue options) {
 return com.caucho.quercus.lib.curl.CurlModule.curl_setopt_array (quercus_context,curl,options);
}


/* ./com/caucho/quercus/lib/curl/CurlModule.java : curl_setopt */
final public BooleanValue curl_setopt (@NotNull CurlResource curl,int option,Value value) {
 return com.caucho.quercus.lib.curl.CurlModule.curl_setopt (quercus_context,curl,option,value);
}


/* ./com/caucho/quercus/lib/curl/CurlModule.java : curl_version */
final public ArrayValue curl_version (@Optional Value age) {
 return com.caucho.quercus.lib.curl.CurlModule.curl_version (quercus_context,age);
}
final public ArrayValue curl_version () {
 Value age = null;

 return com.caucho.quercus.lib.curl.CurlModule.curl_version (quercus_context,age);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : cal_days_in_month */
final public int cal_days_in_month (int cal,int month,int year) {
 return com.caucho.quercus.lib.date.DateModule.cal_days_in_month (cal,month,year);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : checkdate */
final public boolean checkdate (int month,int day,int year) {
 return com.caucho.quercus.lib.date.DateModule.checkdate (month,day,year);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : easter_date */
final public long easter_date (@Optional("-1") int year) {
 return com.caucho.quercus.lib.date.DateModule.easter_date (year);
}
final public long easter_date () {
 int year = -1;

 return com.caucho.quercus.lib.date.DateModule.easter_date (year);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : easter_days */
final public long easter_days (@Optional("-1") int year,@Optional int method) {
 return com.caucho.quercus.lib.date.DateModule.easter_days (year,method);
}
final public long easter_days () {
 int year = -1;
int method = 0;

 return com.caucho.quercus.lib.date.DateModule.easter_days (year,method);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : microtime */
final public Value microtime (@Optional boolean getAsFloat) {
 return com.caucho.quercus.lib.date.DateModule.microtime (quercus_context,getAsFloat);
}
final public Value microtime () {
 boolean getAsFloat = false;

 return com.caucho.quercus.lib.date.DateModule.microtime (quercus_context,getAsFloat);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : time */
final public long time () {
 return com.caucho.quercus.lib.date.DateModule.time ();
}


/* ./com/caucho/quercus/lib/date/DateModule.java : date_create */
final public DateTime date_create (@Optional("now") String time,@Optional DateTimeZone dateTimeZone) {
 return com.caucho.quercus.lib.date.DateModule.date_create (time,dateTimeZone);
}
final public DateTime date_create () {
 String time = null;
DateTimeZone dateTimeZone = null;

 return com.caucho.quercus.lib.date.DateModule.date_create (time,dateTimeZone);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : date_date_set */
final public void date_date_set (DateTime dateTime,int year,int month,int day) {
  com.caucho.quercus.lib.date.DateModule.date_date_set (dateTime,year,month,day);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : date_default_timezone_get */
final public String date_default_timezone_get () {
 return com.caucho.quercus.lib.date.DateModule.date_default_timezone_get (quercus_context);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : date_default_timezone_set */
final public boolean date_default_timezone_set (String id) {
 return com.caucho.quercus.lib.date.DateModule.date_default_timezone_set (quercus_context,id);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : date_format */
final public String date_format (DateTime dateTime,String format) {
 return com.caucho.quercus.lib.date.DateModule.date_format (dateTime,format);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : date_isodate_set */
final public void date_isodate_set (DateTime dateTime,int year,int week,int day) {
  com.caucho.quercus.lib.date.DateModule.date_isodate_set (dateTime,year,week,day);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : date_modify */
final public void date_modify (DateTime dateTime,String modify) {
  com.caucho.quercus.lib.date.DateModule.date_modify (dateTime,modify);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : date_offset_get */
final public long date_offset_get (DateTime dateTime) {
 return com.caucho.quercus.lib.date.DateModule.date_offset_get (dateTime);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : date_parse */
final public Value date_parse (String date) {
 return com.caucho.quercus.lib.date.DateModule.date_parse (date);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : date_sun_info */
final public ArrayValue date_sun_info (long time,double latitude,double longitude) {
 return com.caucho.quercus.lib.date.DateModule.date_sun_info (time,latitude,longitude);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : date_sunrise */
final public Value date_sunrise (int timestamp,@Optional int format,@Optional double latitude,@Optional double longitude,@Optional double zenith,@Optional double gmtOffset) {
 return com.caucho.quercus.lib.date.DateModule.date_sunrise (timestamp,format,latitude,longitude,zenith,gmtOffset);
}
final public Value date_sunrise (int timestamp) {
 int format = 0;
double latitude = 0;
double longitude = 0;
double zenith = 0;
double gmtOffset = 0;

 return com.caucho.quercus.lib.date.DateModule.date_sunrise (timestamp,format,latitude,longitude,zenith,gmtOffset);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : date_sunset */
final public Value date_sunset (int timestamp,@Optional int format,@Optional double latitude,@Optional double longitude,@Optional double zenith,@Optional double gmtOffset) {
 return com.caucho.quercus.lib.date.DateModule.date_sunset (timestamp,format,latitude,longitude,zenith,gmtOffset);
}
final public Value date_sunset (int timestamp) {
 int format = 0;
double latitude = 0;
double longitude = 0;
double zenith = 0;
double gmtOffset = 0;

 return com.caucho.quercus.lib.date.DateModule.date_sunset (timestamp,format,latitude,longitude,zenith,gmtOffset);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : date_time_set */
final public void date_time_set (DateTime dateTime,int hour,int minute,@Optional int second) {
  com.caucho.quercus.lib.date.DateModule.date_time_set (dateTime,hour,minute,second);
}
final public void date_time_set (DateTime dateTime, int hour, int minute) {
 int second = 0;

  com.caucho.quercus.lib.date.DateModule.date_time_set (dateTime,hour,minute,second);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : date_timezone_get */
final public DateTimeZone date_timezone_get (@NotNull DateTime dateTime) {
 return com.caucho.quercus.lib.date.DateModule.date_timezone_get (quercus_context,dateTime);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : date_timezone_set */
final public void date_timezone_set (@NotNull DateTime dateTime,@NotNull DateTimeZone dateTimeZone) {
  com.caucho.quercus.lib.date.DateModule.date_timezone_set (quercus_context,dateTime,dateTimeZone);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : timezone_abbreviations_list */
final public ArrayValue timezone_abbreviations_list () {
 return com.caucho.quercus.lib.date.DateModule.timezone_abbreviations_list ();
}


/* ./com/caucho/quercus/lib/date/DateModule.java : timezone_identifiers_list */
final public ArrayValue timezone_identifiers_list () {
 return com.caucho.quercus.lib.date.DateModule.timezone_identifiers_list ();
}


/* ./com/caucho/quercus/lib/date/DateModule.java : timezone_name_from_abbr */
final public Value timezone_name_from_abbr (StringValue abbr,@Optional("-1") int gmtOffset,@Optional boolean isDST) {
 return com.caucho.quercus.lib.date.DateModule.timezone_name_from_abbr (abbr,gmtOffset,isDST);
}
final public Value timezone_name_from_abbr (StringValue abbr) {
 int gmtOffset = -1;
boolean isDST = false;

 return com.caucho.quercus.lib.date.DateModule.timezone_name_from_abbr (abbr,gmtOffset,isDST);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : timezone_name_get */
final public String timezone_name_get (DateTimeZone dateTimeZone) {
 return com.caucho.quercus.lib.date.DateModule.timezone_name_get (dateTimeZone);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : timezone_offset_get */
final public long timezone_offset_get (DateTimeZone dateTimeZone,DateTime dateTime) {
 return com.caucho.quercus.lib.date.DateModule.timezone_offset_get (dateTimeZone,dateTime);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : timezone_open */
final public DateTimeZone timezone_open (String timeZone) {
 return com.caucho.quercus.lib.date.DateModule.timezone_open (timeZone);
}


/* ./com/caucho/quercus/lib/date/DateModule.java : timezone_transitions_get */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/date/DateTime.java : __construct */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/date/DateTimeZone.java : __construct */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/date/DateTimeZone.java : listAbbreviations */
final public ArrayValue listAbbreviations () {
 return com.caucho.quercus.lib.date.DateTimeZone.listAbbreviations ();
}


/* ./com/caucho/quercus/lib/date/DateTimeZone.java : listIdentifiers */
final public ArrayValue listIdentifiers () {
 return com.caucho.quercus.lib.date.DateTimeZone.listIdentifiers ();
}


/* ./com/caucho/quercus/lib/db/JdbcColumnMetaData.java : isNumeric */
final public boolean isNumeric (int jdbcType) {
 return com.caucho.quercus.lib.db.JdbcColumnMetaData.isNumeric (jdbcType);
}


/* ./com/caucho/quercus/lib/db/JdbcColumnMetaData.java : isBlob */
final public boolean isBlob (int jdbcType) {
 return com.caucho.quercus.lib.db.JdbcColumnMetaData.isBlob (jdbcType);
}


/* ./com/caucho/quercus/lib/db/JdbcResultResource.java : getNumRows */


/* ./com/caucho/quercus/lib/db/JdbcResultResource.java : setRowNumber */


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_affected_rows */
final public int mysqli_affected_rows (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_affected_rows (conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_autocommit */
final public boolean mysqli_autocommit (@NotNull Mysqli conn,boolean mode) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_autocommit (conn,mode);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_bind_param */
final public boolean mysqli_bind_param (@NotNull MysqliStatement stmt, StringValue types, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_bind_param (quercus_context,stmt,types,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_commit */
final public boolean mysqli_commit (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_commit (conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_character_set_name */
final public Value mysqli_character_set_name (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_character_set_name (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_client_encoding */
final public Value mysqli_client_encoding (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_client_encoding (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_close */
final public boolean mysqli_close (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_close (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_connect */
final public Mysqli mysqli_connect (@Optional("localhost") StringValue host,@Optional StringValue userName,@Optional StringValue password,@Optional String dbname,@Optional("3306") int port,@Optional StringValue socket) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_connect (quercus_context,host,userName,password,dbname,port,socket);
}
final public Mysqli mysqli_connect () {
 StringValue host = new ConstStringValue("localhost");
StringValue userName = new ConstStringValue("");
StringValue password = new ConstStringValue("");
String dbname = null;
int port = 3306;
StringValue socket = new ConstStringValue("");

 return com.caucho.quercus.lib.db.MysqliModule.mysqli_connect (quercus_context,host,userName,password,dbname,port,socket);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_connect_errno */
final public int mysqli_connect_errno () {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_connect_errno (quercus_context);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_connect_error */
final public StringValue mysqli_connect_error () {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_connect_error (quercus_context);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_data_seek */
final public Value mysqli_data_seek (@NotNull MysqliResult result,int rowNumber) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_data_seek (quercus_context,result,rowNumber);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_errno */
final public Value mysqli_errno (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_errno (conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_escape_string */
final public Value mysqli_escape_string (@NotNull Mysqli conn,StringValue unescapedString) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_escape_string (quercus_context,conn,unescapedString);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_fetch */
final public Value mysqli_fetch (MysqliStatement stmt) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_fetch (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_fetch_field_direct */
final public Value mysqli_fetch_field_direct (@NotNull MysqliResult result,int fieldOffset) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_fetch_field_direct (quercus_context,result,fieldOffset);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_fetch_field */
final public Value mysqli_fetch_field (@NotNull MysqliResult result) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_fetch_field (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_fetch_fields */
final public Value mysqli_fetch_fields (@NotNull MysqliResult result) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_fetch_fields (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_fetch_lengths */
final public Value mysqli_fetch_lengths (@NotNull MysqliResult result) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_fetch_lengths (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_field_seek */
final public boolean mysqli_field_seek (@NotNull MysqliResult result,int fieldOffset) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_field_seek (quercus_context,result,fieldOffset);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_field_tell */
final public int mysqli_field_tell (@NotNull MysqliResult result) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_field_tell (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_free_result */
final public boolean mysqli_free_result (@NotNull MysqliResult result) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_free_result (result);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_insert_id */
final public Value mysqli_insert_id (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_insert_id (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_num_fields */
final public Value mysqli_num_fields (@NotNull MysqliResult result) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_num_fields (result);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_multi_query */
final public boolean mysqli_multi_query (@NotNull Mysqli conn,StringValue query) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_multi_query (quercus_context,conn,query);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_more_results */
final public boolean mysqli_more_results (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_more_results (conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_next_result */
final public boolean mysqli_next_result (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_next_result (conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_stmt_errno */
final public int mysqli_stmt_errno (@NotNull MysqliStatement stmt) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_stmt_errno (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_stmt_error */
final public StringValue mysqli_stmt_error (@NotNull MysqliStatement stmt) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_stmt_error (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_error */
final public Value mysqli_error (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_error (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_field_count */
final public int mysqli_field_count (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_field_count (conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_fetch_array */
final public ArrayValue mysqli_fetch_array (@NotNull MysqliResult result,@Optional("MYSQLI_BOTH") int type) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_fetch_array (quercus_context,result,type);
}
final public ArrayValue mysqli_fetch_array (@NotNull MysqliResult result) {
 int type = 0;

 return com.caucho.quercus.lib.db.MysqliModule.mysqli_fetch_array (quercus_context,result,type);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_fetch_assoc */
final public ArrayValue mysqli_fetch_assoc (@NotNull MysqliResult result) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_fetch_assoc (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_fetch_row */
final public ArrayValue mysqli_fetch_row (@NotNull MysqliResult result) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_fetch_row (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_fetch_object */
final public Value mysqli_fetch_object (@NotNull MysqliResult result) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_fetch_object (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_get_client_info */
final public StringValue mysqli_get_client_info () {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_get_client_info (quercus_context);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_get_client_version */
final public int mysqli_get_client_version () {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_get_client_version (quercus_context);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_get_host_info */
final public Value mysqli_get_host_info (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_get_host_info (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_get_proto_info */
final public Value mysqli_get_proto_info (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_get_proto_info (conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_get_server_info */
final public Value mysqli_get_server_info (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_get_server_info (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_get_server_version */
final public Value mysqli_get_server_version (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_get_server_version (conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_num_rows */
final public Value mysqli_num_rows (@NotNull MysqliResult result) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_num_rows (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_options */
final public boolean mysqli_options (@NotNull Mysqli mysqli,int option,Value value) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_options (mysqli,option,value);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_set_opt */
final public boolean mysqli_set_opt (@NotNull Mysqli mysqli,int option,Value value) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_set_opt (mysqli,option,value);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_param_count */
final public int mysqli_param_count (@NotNull MysqliStatement stmt) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_param_count (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_rollback */
final public boolean mysqli_rollback (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_rollback (conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_set_charset */
final public boolean mysqli_set_charset (@NotNull Mysqli mysqli,String charset) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_set_charset (mysqli,charset);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_stmt_num_rows */
final public Value mysqli_stmt_num_rows (@NotNull MysqliStatement stmt) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_stmt_num_rows (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_stmt_param_count */
final public int mysqli_stmt_param_count (@NotNull MysqliStatement stmt) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_stmt_param_count (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_stmt_prepare */
final public boolean mysqli_stmt_prepare (@NotNull MysqliStatement stmt,StringValue query) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_stmt_prepare (quercus_context,stmt,query);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_stmt_reset */
final public boolean mysqli_stmt_reset (@NotNull MysqliStatement stmt) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_stmt_reset (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_stmt_result_metadata */
final public JdbcResultResource mysqli_stmt_result_metadata (@NotNull MysqliStatement stmt) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_stmt_result_metadata (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_sqlstate */
final public Value mysqli_sqlstate (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_sqlstate (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_stmt_sqlstate */
final public Value mysqli_stmt_sqlstate (@NotNull MysqliStatement stmt) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_stmt_sqlstate (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_stmt_store_result */
final public boolean mysqli_stmt_store_result (@NotNull MysqliStatement stmt) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_stmt_store_result (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_store_result */
final public JdbcResultResource mysqli_store_result (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_store_result (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_use_result */
final public JdbcResultResource mysqli_use_result (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_use_result (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_warning_count */
final public int mysqli_warning_count (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_warning_count (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_ping */
final public boolean mysqli_ping (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_ping (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_query */
final public Value mysqli_query (@NotNull Mysqli conn,StringValue sql,@Optional("MYSQLI_STORE_RESULT") int resultMode) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_query (quercus_context,conn,sql,resultMode);
}
final public Value mysqli_query (@NotNull Mysqli conn, StringValue sql) {
 int resultMode = 0;

 return com.caucho.quercus.lib.db.MysqliModule.mysqli_query (quercus_context,conn,sql,resultMode);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_real_connect */
final public boolean mysqli_real_connect (@NotNull Mysqli mysqli,@Optional("localhost") StringValue host,@Optional StringValue userName,@Optional StringValue password,@Optional StringValue dbname,@Optional("3306") int port,@Optional StringValue socket,@Optional int flags) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_real_connect (quercus_context,mysqli,host,userName,password,dbname,port,socket,flags);
}
final public boolean mysqli_real_connect (@NotNull Mysqli mysqli) {
 StringValue host = new ConstStringValue("localhost");
StringValue userName = new ConstStringValue("");
StringValue password = new ConstStringValue("");
StringValue dbname = new ConstStringValue("");
int port = 3306;
StringValue socket = new ConstStringValue("");
int flags = 0;

 return com.caucho.quercus.lib.db.MysqliModule.mysqli_real_connect (quercus_context,mysqli,host,userName,password,dbname,port,socket,flags);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_real_escape_string */
final public Value mysqli_real_escape_string (@NotNull Mysqli conn,StringValue unescapedString) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_real_escape_string (quercus_context,conn,unescapedString);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_real_query */
final public boolean mysqli_real_query (@NotNull Mysqli conn,StringValue query) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_real_query (quercus_context,conn,query);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_select_db */
final public boolean mysqli_select_db (Mysqli conn,String dbName) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_select_db (conn,dbName);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_stat */
final public Value mysqli_stat (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_stat (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_stmt_affected_rows */
final public int mysqli_stmt_affected_rows (@NotNull MysqliStatement stmt) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_stmt_affected_rows (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_stmt_bind_param */
final public boolean mysqli_stmt_bind_param (@NotNull MysqliStatement stmt, StringValue types, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_stmt_bind_param (quercus_context,stmt,types,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_stmt_bind_result */
final public boolean mysqli_stmt_bind_result (@NotNull MysqliStatement stmt, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_stmt_bind_result (quercus_context,stmt,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_stmt_execute */
final public boolean mysqli_stmt_execute (@NotNull MysqliStatement stmt) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_stmt_execute (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_stmt_fetch */
final public Value mysqli_stmt_fetch (@NotNull MysqliStatement stmt) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_stmt_fetch (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_stmt_free_result */
final public boolean mysqli_stmt_free_result (MysqliStatement stmt) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_stmt_free_result (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_bind_result */
final public boolean mysqli_bind_result (@NotNull MysqliStatement stmt, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_bind_result (quercus_context,stmt,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_change_user */
final public boolean mysqli_change_user (@NotNull Mysqli mysqli,String user,String password,String db) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_change_user (mysqli,user,password,db);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_execute */
final public boolean mysqli_execute (@NotNull MysqliStatement stmt) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_execute (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_get_metadata */
final public JdbcResultResource mysqli_get_metadata (@NotNull MysqliStatement stmt) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_get_metadata (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_init */
final public Mysqli mysqli_init () {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_init (quercus_context);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_prepare */
final public MysqliStatement mysqli_prepare (@NotNull Mysqli conn,StringValue query) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_prepare (quercus_context,conn,query);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_stmt_close */
final public boolean mysqli_stmt_close (@NotNull MysqliStatement stmt) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_stmt_close (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_stmt_init */
final public MysqliStatement mysqli_stmt_init (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_stmt_init (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_info */
final public Value mysqli_info (@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_info (quercus_context,conn);
}
final public Value mysqli_info () {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqliModule.mysqli_info (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_stmt_field_count */
final public int mysqli_stmt_field_count (@NotNull MysqliStatement stmt) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_stmt_field_count (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_thread_id */
final public Value mysqli_thread_id (@NotNull Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_thread_id (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqliModule.java : mysqli_kill */
final public boolean mysqli_kill (@NotNull Mysqli conn,int threadId) {
 return com.caucho.quercus.lib.db.MysqliModule.mysqli_kill (quercus_context,conn,threadId);
}


/* ./com/caucho/quercus/lib/db/MysqlLatin1Utility.java : decode */
final public char decode (int ch) {
 return com.caucho.quercus.lib.db.MysqlLatin1Utility.decode (ch);
}


/* ./com/caucho/quercus/lib/db/MysqlLatin1Utility.java : decode */
final public String decode (byte[] bytes) {
 return com.caucho.quercus.lib.db.MysqlLatin1Utility.decode (bytes);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_affected_rows */
final public int mysql_affected_rows (@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_affected_rows (quercus_context,conn);
}
final public int mysql_affected_rows () {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_affected_rows (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_info */
final public Value mysql_info (@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_info (quercus_context,conn);
}
final public Value mysql_info () {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_info (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_change_user */
final public boolean mysql_change_user (StringValue user,StringValue pass,@Optional StringValue database,@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_change_user (quercus_context,user,pass,database,conn);
}
final public boolean mysql_change_user (StringValue user, StringValue pass) {
 StringValue database = new ConstStringValue("");
Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_change_user (quercus_context,user,pass,database,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_client_encoding */
final public StringValue mysql_client_encoding (@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_client_encoding (quercus_context,conn);
}
final public StringValue mysql_client_encoding () {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_client_encoding (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_close */
final public boolean mysql_close (@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_close (quercus_context,conn);
}
final public boolean mysql_close () {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_close (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_create_db */
final public boolean mysql_create_db (@NotNull StringValue name,@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_create_db (quercus_context,name,conn);
}
final public boolean mysql_create_db (@NotNull StringValue name) {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_create_db (quercus_context,name,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_data_seek */
final public boolean mysql_data_seek (@NotNull MysqliResult result,int rowNumber) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_data_seek (quercus_context,result,rowNumber);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_db_name */
final public Value mysql_db_name (@NotNull MysqliResult result,int row,@Optional("0") Value field) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_db_name (quercus_context,result,row,field);
}
final public Value mysql_db_name (@NotNull MysqliResult result, int row) {
 Value field = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_db_name (quercus_context,result,row,field);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_dbname */
final public Value mysql_dbname (@NotNull MysqliResult result,int row) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_dbname (quercus_context,result,row);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_result */
final public Value mysql_result (@NotNull MysqliResult result,int row,@Optional("0") Value field) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_result (quercus_context,result,row,field);
}
final public Value mysql_result (@NotNull MysqliResult result, int row) {
 Value field = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_result (quercus_context,result,row,field);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_drop_db */
final public boolean mysql_drop_db (@NotNull StringValue databaseName,@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_drop_db (quercus_context,databaseName,conn);
}
final public boolean mysql_drop_db (@NotNull StringValue databaseName) {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_drop_db (quercus_context,databaseName,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_dropdb */
final public boolean mysql_dropdb (@NotNull StringValue databaseName,@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_dropdb (quercus_context,databaseName,conn);
}
final public boolean mysql_dropdb (@NotNull StringValue databaseName) {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_dropdb (quercus_context,databaseName,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_errno */
final public int mysql_errno (@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_errno (quercus_context,conn);
}
final public int mysql_errno () {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_errno (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_error */
final public StringValue mysql_error (@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_error (quercus_context,conn);
}
final public StringValue mysql_error () {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_error (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_escape_string */
final public StringValue mysql_escape_string (Value val) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_escape_string (quercus_context,val);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_real_escape_string */
final public StringValue mysql_real_escape_string (Value val,@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_real_escape_string (quercus_context,val,conn);
}
final public StringValue mysql_real_escape_string (Value val) {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_real_escape_string (quercus_context,val,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_fetch_array */
final public Value mysql_fetch_array (@NotNull MysqliResult result,@Optional("MYSQL_BOTH") int type) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_fetch_array (quercus_context,result,type);
}
final public Value mysql_fetch_array (@NotNull MysqliResult result) {
 int type = 0;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_fetch_array (quercus_context,result,type);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_fetch_assoc */
final public ArrayValue mysql_fetch_assoc (@NotNull MysqliResult result) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_fetch_assoc (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_fetch_field */
final public Value mysql_fetch_field (@NotNull MysqliResult result,@Optional("-1") int fieldOffset) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_fetch_field (quercus_context,result,fieldOffset);
}
final public Value mysql_fetch_field (@NotNull MysqliResult result) {
 int fieldOffset = -1;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_fetch_field (quercus_context,result,fieldOffset);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_query */
final public Value mysql_query (StringValue sql,@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_query (quercus_context,sql,conn);
}
final public Value mysql_query (StringValue sql) {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_query (quercus_context,sql,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_fetch_lengths */
final public Value mysql_fetch_lengths (@NotNull MysqliResult result) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_fetch_lengths (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_fetch_object */
final public Value mysql_fetch_object (@NotNull MysqliResult result) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_fetch_object (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_fetch_row */
final public ArrayValue mysql_fetch_row (@NotNull MysqliResult result) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_fetch_row (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_field_flags */
final public Value mysql_field_flags (@NotNull MysqliResult result,int fieldOffset) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_field_flags (quercus_context,result,fieldOffset);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_field_name */
final public Value mysql_field_name (@NotNull MysqliResult result,int fieldOffset) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_field_name (quercus_context,result,fieldOffset);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_fieldname */
final public Value mysql_fieldname (@NotNull MysqliResult result,int fieldOffset) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_fieldname (quercus_context,result,fieldOffset);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_field_seek */
final public boolean mysql_field_seek (@NotNull MysqliResult result,int fieldOffset) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_field_seek (quercus_context,result,fieldOffset);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_field_table */
final public Value mysql_field_table (@NotNull MysqliResult result,int fieldOffset) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_field_table (quercus_context,result,fieldOffset);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_fieldtable */
final public Value mysql_fieldtable (@NotNull MysqliResult result,int fieldOffset) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_fieldtable (quercus_context,result,fieldOffset);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_field_type */
final public Value mysql_field_type (@NotNull MysqliResult result,Value fieldOffset) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_field_type (quercus_context,result,fieldOffset);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_fieldtype */
final public Value mysql_fieldtype (@NotNull MysqliResult result,Value fieldOffset) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_fieldtype (quercus_context,result,fieldOffset);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_field_len */
final public Value mysql_field_len (@NotNull MysqliResult result,@Optional("0") int fieldOffset) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_field_len (quercus_context,result,fieldOffset);
}
final public Value mysql_field_len (@NotNull MysqliResult result) {
 int fieldOffset = 0;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_field_len (quercus_context,result,fieldOffset);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_free_result */
final public boolean mysql_free_result (@NotNull MysqliResult result) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_free_result (result);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_freeresult */
final public boolean mysql_freeresult (@NotNull MysqliResult result) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_freeresult (result);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_get_client_info */
final public StringValue mysql_get_client_info () {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_get_client_info (quercus_context);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_get_host_info */
final public StringValue mysql_get_host_info (@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_get_host_info (quercus_context,conn);
}
final public StringValue mysql_get_host_info () {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_get_host_info (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_get_proto_info */
final public int mysql_get_proto_info (@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_get_proto_info (quercus_context,conn);
}
final public int mysql_get_proto_info () {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_get_proto_info (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_get_server_info */
final public Value mysql_get_server_info (@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_get_server_info (quercus_context,conn);
}
final public Value mysql_get_server_info () {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_get_server_info (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_insert_id */
final public Value mysql_insert_id (@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_insert_id (quercus_context,conn);
}
final public Value mysql_insert_id () {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_insert_id (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_list_dbs */
final public Value mysql_list_dbs (@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_list_dbs (quercus_context,conn);
}
final public Value mysql_list_dbs () {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_list_dbs (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_list_fields */
final public Value mysql_list_fields (String database,StringValue tableName,@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_list_fields (quercus_context,database,tableName,conn);
}
final public Value mysql_list_fields (String database, StringValue tableName) {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_list_fields (quercus_context,database,tableName,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_listfields */
final public Value mysql_listfields (String databaseName,StringValue tableName,@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_listfields (quercus_context,databaseName,tableName,conn);
}
final public Value mysql_listfields (String databaseName, StringValue tableName) {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_listfields (quercus_context,databaseName,tableName,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_db_query */
final public Value mysql_db_query (String databaseName,StringValue query,@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_db_query (quercus_context,databaseName,query,conn);
}
final public Value mysql_db_query (String databaseName, StringValue query) {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_db_query (quercus_context,databaseName,query,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_select_db */
final public boolean mysql_select_db (String dbName,@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_select_db (quercus_context,dbName,conn);
}
final public boolean mysql_select_db (String dbName) {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_select_db (quercus_context,dbName,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_list_tables */
final public Object mysql_list_tables (StringValue databaseName,@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_list_tables (quercus_context,databaseName,conn);
}
final public Object mysql_list_tables (StringValue databaseName) {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_list_tables (quercus_context,databaseName,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_num_fields */
final public Value mysql_num_fields (@NotNull MysqliResult result) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_num_fields (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_numfields */
final public Value mysql_numfields (@NotNull MysqliResult result) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_numfields (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_num_rows */
final public Value mysql_num_rows (@NotNull MysqliResult result) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_num_rows (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_numrows */
final public Value mysql_numrows (@NotNull MysqliResult result) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_numrows (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_pconnect */
final public Value mysql_pconnect (@Optional StringValue server,@Optional StringValue user,@Optional StringValue password,@Optional boolean newLink,@Optional int flags) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_pconnect (quercus_context,server,user,password,newLink,flags);
}
final public Value mysql_pconnect () {
 StringValue server = new ConstStringValue("");
StringValue user = new ConstStringValue("");
StringValue password = new ConstStringValue("");
boolean newLink = false;
int flags = 0;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_pconnect (quercus_context,server,user,password,newLink,flags);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_connect */
final public Value mysql_connect (@Optional StringValue host,@Optional StringValue userName,@Optional StringValue password,@Optional boolean isNewLink,@Optional int flags) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_connect (quercus_context,host,userName,password,isNewLink,flags);
}
final public Value mysql_connect () {
 StringValue host = new ConstStringValue("");
StringValue userName = new ConstStringValue("");
StringValue password = new ConstStringValue("");
boolean isNewLink = false;
int flags = 0;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_connect (quercus_context,host,userName,password,isNewLink,flags);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_ping */
final public boolean mysql_ping (@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_ping (quercus_context,conn);
}
final public boolean mysql_ping () {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_ping (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_stat */
final public Value mysql_stat (@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_stat (quercus_context,conn);
}
final public Value mysql_stat () {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_stat (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_tablename */
final public Value mysql_tablename (@NotNull MysqliResult result,int i) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_tablename (quercus_context,result,i);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_unbuffered_query */
final public Object mysql_unbuffered_query (@NotNull StringValue name,@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_unbuffered_query (quercus_context,name,conn);
}
final public Object mysql_unbuffered_query (@NotNull StringValue name) {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_unbuffered_query (quercus_context,name,conn);
}


/* ./com/caucho/quercus/lib/db/MysqlModule.java : mysql_thread_id */
final public Value mysql_thread_id (@Optional Mysqli conn) {
 return com.caucho.quercus.lib.db.MysqlModule.mysql_thread_id (quercus_context,conn);
}
final public Value mysql_thread_id () {
 Mysqli conn = null;

 return com.caucho.quercus.lib.db.MysqlModule.mysql_thread_id (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_bind_array_by_name */
final public boolean oci_bind_array_by_name (@NotNull OracleStatement stmt,@NotNull String name,@NotNull ArrayValue varArray,@NotNull int maxTableLength,@Optional("0") int maxItemLength,@Optional("0") int type) {
 return com.caucho.quercus.lib.db.OracleModule.oci_bind_array_by_name (quercus_context,stmt,name,varArray,maxTableLength,maxItemLength,type);
}
final public boolean oci_bind_array_by_name (@NotNull OracleStatement stmt, @NotNull String name, @NotNull ArrayValue varArray, @NotNull int maxTableLength) {
 int maxItemLength = 0;
int type = 0;

 return com.caucho.quercus.lib.db.OracleModule.oci_bind_array_by_name (quercus_context,stmt,name,varArray,maxTableLength,maxItemLength,type);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_bind_by_name */
final public boolean oci_bind_by_name (@NotNull OracleStatement stmt,@NotNull String placeholderName,Value variable,@Optional("0") int maxLength,@Optional("0") int type) {
 return com.caucho.quercus.lib.db.OracleModule.oci_bind_by_name (quercus_context,stmt,placeholderName,variable,maxLength,type);
}
final public boolean oci_bind_by_name (@NotNull OracleStatement stmt, @NotNull String placeholderName, Value variable) {
 int maxLength = 0;
int type = 0;

 return com.caucho.quercus.lib.db.OracleModule.oci_bind_by_name (quercus_context,stmt,placeholderName,variable,maxLength,type);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_cancel */
final public boolean oci_cancel (@NotNull OracleStatement stmt) {
 return com.caucho.quercus.lib.db.OracleModule.oci_cancel (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_close */
final public boolean oci_close (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.oci_close (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_commit */
final public boolean oci_commit (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.oci_commit (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_connect */
final public Value oci_connect (@NotNull String username,@NotNull String password,@Optional String db,@Optional String charset,@Optional("0") int sessionMode) {
 return com.caucho.quercus.lib.db.OracleModule.oci_connect (quercus_context,username,password,db,charset,sessionMode);
}
final public Value oci_connect (@NotNull String username, @NotNull String password) {
 String db = null;
String charset = null;
int sessionMode = 0;

 return com.caucho.quercus.lib.db.OracleModule.oci_connect (quercus_context,username,password,db,charset,sessionMode);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_define_by_name */
final public boolean oci_define_by_name (@NotNull OracleStatement stmt,@NotNull String columnName,@NotNull Value variable,@Optional("0") int type) {
 return com.caucho.quercus.lib.db.OracleModule.oci_define_by_name (quercus_context,stmt,columnName,variable,type);
}
final public boolean oci_define_by_name (@NotNull OracleStatement stmt, @NotNull String columnName, @NotNull Value variable) {
 int type = 0;

 return com.caucho.quercus.lib.db.OracleModule.oci_define_by_name (quercus_context,stmt,columnName,variable,type);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_error */
final public String oci_error (@Optional Value resource) {
 return com.caucho.quercus.lib.db.OracleModule.oci_error (quercus_context,resource);
}
final public String oci_error () {
 Value resource = null;

 return com.caucho.quercus.lib.db.OracleModule.oci_error (quercus_context,resource);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_execute */
final public boolean oci_execute (@NotNull OracleStatement stmt,@Optional("0") int mode) {
 return com.caucho.quercus.lib.db.OracleModule.oci_execute (quercus_context,stmt,mode);
}
final public boolean oci_execute (@NotNull OracleStatement stmt) {
 int mode = 0;

 return com.caucho.quercus.lib.db.OracleModule.oci_execute (quercus_context,stmt,mode);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_fetch_all */
final public ArrayValue oci_fetch_all (@NotNull OracleStatement stmt,@NotNull Value output,@Optional int skip,@Optional int maxrows,@Optional int flags) {
 return com.caucho.quercus.lib.db.OracleModule.oci_fetch_all (quercus_context,stmt,output,skip,maxrows,flags);
}
final public ArrayValue oci_fetch_all (@NotNull OracleStatement stmt, @NotNull Value output) {
 int skip = 0;
int maxrows = 0;
int flags = 0;

 return com.caucho.quercus.lib.db.OracleModule.oci_fetch_all (quercus_context,stmt,output,skip,maxrows,flags);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_fetch_array */
final public ArrayValue oci_fetch_array (@NotNull OracleStatement stmt,@Optional("-1") int mode) {
 return com.caucho.quercus.lib.db.OracleModule.oci_fetch_array (quercus_context,stmt,mode);
}
final public ArrayValue oci_fetch_array (@NotNull OracleStatement stmt) {
 int mode = -1;

 return com.caucho.quercus.lib.db.OracleModule.oci_fetch_array (quercus_context,stmt,mode);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_fetch_assoc */
final public ArrayValue oci_fetch_assoc (@NotNull OracleStatement stmt) {
 return com.caucho.quercus.lib.db.OracleModule.oci_fetch_assoc (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_fetch_object */
final public Value oci_fetch_object (@NotNull OracleStatement stmt) {
 return com.caucho.quercus.lib.db.OracleModule.oci_fetch_object (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_fetch_row */
final public ArrayValue oci_fetch_row (@NotNull OracleStatement stmt) {
 return com.caucho.quercus.lib.db.OracleModule.oci_fetch_row (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_fetch */
final public boolean oci_fetch (@NotNull OracleStatement stmt) {
 return com.caucho.quercus.lib.db.OracleModule.oci_fetch (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_field_is_null */
final public boolean oci_field_is_null (@NotNull OracleStatement stmt,@NotNull Value fieldNameOrNumber) {
 return com.caucho.quercus.lib.db.OracleModule.oci_field_is_null (quercus_context,stmt,fieldNameOrNumber);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_field_name */
final public Value oci_field_name (@NotNull OracleStatement stmt,@NotNull int fieldNumber) {
 return com.caucho.quercus.lib.db.OracleModule.oci_field_name (quercus_context,stmt,fieldNumber);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_field_precision */
final public LongValue oci_field_precision (@NotNull OracleStatement stmt,@NotNull int field) {
 return com.caucho.quercus.lib.db.OracleModule.oci_field_precision (quercus_context,stmt,field);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_field_scale */
final public LongValue oci_field_scale (@NotNull OracleStatement stmt,@NotNull int field) {
 return com.caucho.quercus.lib.db.OracleModule.oci_field_scale (quercus_context,stmt,field);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_field_size */
final public Value oci_field_size (@NotNull OracleStatement stmt,@Optional("-1") Value fieldNameOrNumber) {
 return com.caucho.quercus.lib.db.OracleModule.oci_field_size (quercus_context,stmt,fieldNameOrNumber);
}
final public Value oci_field_size (@NotNull OracleStatement stmt) {
 Value fieldNameOrNumber = null;

 return com.caucho.quercus.lib.db.OracleModule.oci_field_size (quercus_context,stmt,fieldNameOrNumber);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_field_type_raw */
final public int oci_field_type_raw (@NotNull OracleStatement stmt,int field) {
 return com.caucho.quercus.lib.db.OracleModule.oci_field_type_raw (quercus_context,stmt,field);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_field_type */
final public Value oci_field_type (@NotNull OracleStatement stmt,int fieldNumber) {
 return com.caucho.quercus.lib.db.OracleModule.oci_field_type (quercus_context,stmt,fieldNumber);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_free_statement */
final public boolean oci_free_statement (@NotNull OracleStatement stmt) {
 return com.caucho.quercus.lib.db.OracleModule.oci_free_statement (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_internal_debug */
final public void oci_internal_debug (@NotNull int onoff) {
  com.caucho.quercus.lib.db.OracleModule.oci_internal_debug (quercus_context,onoff);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_lob_copy */
final public boolean oci_lob_copy (@NotNull OracleOciLob lobTo,@NotNull OracleOciLob lobFrom,@Optional("-1") int length) {
 return com.caucho.quercus.lib.db.OracleModule.oci_lob_copy (quercus_context,lobTo,lobFrom,length);
}
final public boolean oci_lob_copy (@NotNull OracleOciLob lobTo, @NotNull OracleOciLob lobFrom) {
 int length = -1;

 return com.caucho.quercus.lib.db.OracleModule.oci_lob_copy (quercus_context,lobTo,lobFrom,length);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_lob_is_equal */
final public boolean oci_lob_is_equal (@NotNull OracleOciLob lob1,@NotNull OracleOciLob lob2) {
 return com.caucho.quercus.lib.db.OracleModule.oci_lob_is_equal (quercus_context,lob1,lob2);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_new_collection */
final public OracleOciCollection oci_new_collection (@NotNull Oracle conn,@NotNull String tdo,@Optional String schema) {
 return com.caucho.quercus.lib.db.OracleModule.oci_new_collection (quercus_context,conn,tdo,schema);
}
final public OracleOciCollection oci_new_collection (@NotNull Oracle conn, @NotNull String tdo) {
 String schema = null;

 return com.caucho.quercus.lib.db.OracleModule.oci_new_collection (quercus_context,conn,tdo,schema);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_new_connect */
final public Value oci_new_connect (@NotNull String username,@NotNull String password,@Optional String db,@Optional String charset,@Optional("0") int sessionMode) {
 return com.caucho.quercus.lib.db.OracleModule.oci_new_connect (quercus_context,username,password,db,charset,sessionMode);
}
final public Value oci_new_connect (@NotNull String username, @NotNull String password) {
 String db = null;
String charset = null;
int sessionMode = 0;

 return com.caucho.quercus.lib.db.OracleModule.oci_new_connect (quercus_context,username,password,db,charset,sessionMode);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_new_cursor */
final public OracleStatement oci_new_cursor (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.oci_new_cursor (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_new_descriptor */
final public OracleOciLob oci_new_descriptor (@NotNull Oracle conn,@Optional("-1") int type) {
 return com.caucho.quercus.lib.db.OracleModule.oci_new_descriptor (quercus_context,conn,type);
}
final public OracleOciLob oci_new_descriptor (@NotNull Oracle conn) {
 int type = -1;

 return com.caucho.quercus.lib.db.OracleModule.oci_new_descriptor (quercus_context,conn,type);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_num_fields */
final public Value oci_num_fields (@NotNull OracleStatement stmt) {
 return com.caucho.quercus.lib.db.OracleModule.oci_num_fields (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_num_rows */
final public LongValue oci_num_rows (@NotNull OracleStatement stmt) {
 return com.caucho.quercus.lib.db.OracleModule.oci_num_rows (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_parse */
final public OracleStatement oci_parse (@NotNull Oracle conn,String query) {
 return com.caucho.quercus.lib.db.OracleModule.oci_parse (quercus_context,conn,query);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_password_change */
final public boolean oci_password_change (@NotNull Oracle conn,@NotNull String username,@NotNull String oldPassword,@NotNull String newPassword) {
 return com.caucho.quercus.lib.db.OracleModule.oci_password_change (quercus_context,conn,username,oldPassword,newPassword);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_pconnect */
final public Value oci_pconnect (@NotNull String username,@NotNull String password,@Optional String db,@Optional String charset,@Optional("0") int sessionMode) {
 return com.caucho.quercus.lib.db.OracleModule.oci_pconnect (quercus_context,username,password,db,charset,sessionMode);
}
final public Value oci_pconnect (@NotNull String username, @NotNull String password) {
 String db = null;
String charset = null;
int sessionMode = 0;

 return com.caucho.quercus.lib.db.OracleModule.oci_pconnect (quercus_context,username,password,db,charset,sessionMode);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_result */
final public Value oci_result (@NotNull OracleStatement stmt,@NotNull Value field) {
 return com.caucho.quercus.lib.db.OracleModule.oci_result (quercus_context,stmt,field);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_rollback */
final public Value oci_rollback (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.oci_rollback (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_server_version */
final public String oci_server_version (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.oci_server_version (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_set_prefetch */
final public boolean oci_set_prefetch (@NotNull OracleStatement stmt,@Optional("1") int rows) {
 return com.caucho.quercus.lib.db.OracleModule.oci_set_prefetch (quercus_context,stmt,rows);
}
final public boolean oci_set_prefetch (@NotNull OracleStatement stmt) {
 int rows = 1;

 return com.caucho.quercus.lib.db.OracleModule.oci_set_prefetch (quercus_context,stmt,rows);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : oci_statement_type */
final public String oci_statement_type (@NotNull OracleStatement stmt) {
 return com.caucho.quercus.lib.db.OracleModule.oci_statement_type (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocibindbyname */
final public boolean ocibindbyname (@NotNull OracleStatement stmt,@NotNull String variable,@NotNull Value value,@Optional("0") int maxLength,@Optional("0") int type) {
 return com.caucho.quercus.lib.db.OracleModule.ocibindbyname (quercus_context,stmt,variable,value,maxLength,type);
}
final public boolean ocibindbyname (@NotNull OracleStatement stmt, @NotNull String variable, @NotNull Value value) {
 int maxLength = 0;
int type = 0;

 return com.caucho.quercus.lib.db.OracleModule.ocibindbyname (quercus_context,stmt,variable,value,maxLength,type);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocicancel */
final public boolean ocicancel (@NotNull OracleStatement stmt) {
 return com.caucho.quercus.lib.db.OracleModule.ocicancel (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocicloselob */
final public Value ocicloselob (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.ocicloselob (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocicollappend */
final public Value ocicollappend (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.ocicollappend (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocicollassign */
final public Value ocicollassign (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.ocicollassign (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocicollassignelem */
final public Value ocicollassignelem (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.ocicollassignelem (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocicollgetelem */
final public Value ocicollgetelem (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.ocicollgetelem (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocicollmax */
final public Value ocicollmax (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.ocicollmax (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocicollsize */
final public Value ocicollsize (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.ocicollsize (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocicolltrim */
final public Value ocicolltrim (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.ocicolltrim (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocicolumnisnull */
final public boolean ocicolumnisnull (@NotNull OracleStatement stmt,@NotNull Value field) {
 return com.caucho.quercus.lib.db.OracleModule.ocicolumnisnull (quercus_context,stmt,field);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocicolumnname */
final public Value ocicolumnname (@NotNull OracleStatement stmt,@NotNull int fieldNumber) {
 return com.caucho.quercus.lib.db.OracleModule.ocicolumnname (quercus_context,stmt,fieldNumber);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocicolumnprecision */
final public Value ocicolumnprecision (@NotNull OracleStatement stmt,@NotNull int field) {
 return com.caucho.quercus.lib.db.OracleModule.ocicolumnprecision (quercus_context,stmt,field);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocicolumnscale */
final public Value ocicolumnscale (@NotNull OracleStatement stmt,@NotNull int field) {
 return com.caucho.quercus.lib.db.OracleModule.ocicolumnscale (quercus_context,stmt,field);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocicolumnsize */
final public Value ocicolumnsize (@NotNull OracleStatement stmt,@Optional Value field) {
 return com.caucho.quercus.lib.db.OracleModule.ocicolumnsize (quercus_context,stmt,field);
}
final public Value ocicolumnsize (@NotNull OracleStatement stmt) {
 Value field = null;

 return com.caucho.quercus.lib.db.OracleModule.ocicolumnsize (quercus_context,stmt,field);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocicolumntype */
final public Value ocicolumntype (@NotNull OracleStatement stmt,@Optional int fieldNumber) {
 return com.caucho.quercus.lib.db.OracleModule.ocicolumntype (quercus_context,stmt,fieldNumber);
}
final public Value ocicolumntype (@NotNull OracleStatement stmt) {
 int fieldNumber = 0;

 return com.caucho.quercus.lib.db.OracleModule.ocicolumntype (quercus_context,stmt,fieldNumber);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocicolumntyperaw */
final public int ocicolumntyperaw (@NotNull OracleStatement stmt,@Optional int field) {
 return com.caucho.quercus.lib.db.OracleModule.ocicolumntyperaw (quercus_context,stmt,field);
}
final public int ocicolumntyperaw (@NotNull OracleStatement stmt) {
 int field = 0;

 return com.caucho.quercus.lib.db.OracleModule.ocicolumntyperaw (quercus_context,stmt,field);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocicommit */
final public boolean ocicommit (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.ocicommit (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocidefinebyname */
final public boolean ocidefinebyname (@NotNull OracleStatement stmt,@NotNull String columnName,@NotNull Value variable,@Optional("0") int type) {
 return com.caucho.quercus.lib.db.OracleModule.ocidefinebyname (quercus_context,stmt,columnName,variable,type);
}
final public boolean ocidefinebyname (@NotNull OracleStatement stmt, @NotNull String columnName, @NotNull Value variable) {
 int type = 0;

 return com.caucho.quercus.lib.db.OracleModule.ocidefinebyname (quercus_context,stmt,columnName,variable,type);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocierror */
final public String ocierror (@Optional Value resource) {
 return com.caucho.quercus.lib.db.OracleModule.ocierror (quercus_context,resource);
}
final public String ocierror () {
 Value resource = null;

 return com.caucho.quercus.lib.db.OracleModule.ocierror (quercus_context,resource);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ociexecute */
final public boolean ociexecute (@NotNull OracleStatement stmt,@Optional("0") int mode) {
 return com.caucho.quercus.lib.db.OracleModule.ociexecute (quercus_context,stmt,mode);
}
final public boolean ociexecute (@NotNull OracleStatement stmt) {
 int mode = 0;

 return com.caucho.quercus.lib.db.OracleModule.ociexecute (quercus_context,stmt,mode);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocifetch */
final public boolean ocifetch (@NotNull OracleStatement stmt) {
 return com.caucho.quercus.lib.db.OracleModule.ocifetch (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocifetchinto */
final public Value ocifetchinto (@NotNull OracleStatement stmt,Value result,@Optional("-1") int mode) {
 return com.caucho.quercus.lib.db.OracleModule.ocifetchinto (quercus_context,stmt,result,mode);
}
final public Value ocifetchinto (@NotNull OracleStatement stmt, Value result) {
 int mode = -1;

 return com.caucho.quercus.lib.db.OracleModule.ocifetchinto (quercus_context,stmt,result,mode);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocifetchstatement */
final public Value ocifetchstatement (@NotNull OracleStatement stmt,@NotNull Value output,@Optional int skip,@Optional int maxrows,@Optional int flags) {
 return com.caucho.quercus.lib.db.OracleModule.ocifetchstatement (quercus_context,stmt,output,skip,maxrows,flags);
}
final public Value ocifetchstatement (@NotNull OracleStatement stmt, @NotNull Value output) {
 int skip = 0;
int maxrows = 0;
int flags = 0;

 return com.caucho.quercus.lib.db.OracleModule.ocifetchstatement (quercus_context,stmt,output,skip,maxrows,flags);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocifreecollection */
final public Value ocifreecollection (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.ocifreecollection (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocifreecursor */
final public boolean ocifreecursor (@NotNull OracleStatement stmt) {
 return com.caucho.quercus.lib.db.OracleModule.ocifreecursor (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocifreedesc */
final public Value ocifreedesc (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.ocifreedesc (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocifreestatement */
final public boolean ocifreestatement (@NotNull OracleStatement stmt) {
 return com.caucho.quercus.lib.db.OracleModule.ocifreestatement (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ociinternaldebug */
final public void ociinternaldebug (@NotNull int onoff) {
  com.caucho.quercus.lib.db.OracleModule.ociinternaldebug (quercus_context,onoff);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ociloadlob */
final public Value ociloadlob (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.ociloadlob (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocilogoff */
final public boolean ocilogoff (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.ocilogoff (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocilogon */
final public Value ocilogon (@NotNull String username,@NotNull String password,@Optional String db,@Optional String charset,@Optional("0") int sessionMode) {
 return com.caucho.quercus.lib.db.OracleModule.ocilogon (quercus_context,username,password,db,charset,sessionMode);
}
final public Value ocilogon (@NotNull String username, @NotNull String password) {
 String db = null;
String charset = null;
int sessionMode = 0;

 return com.caucho.quercus.lib.db.OracleModule.ocilogon (quercus_context,username,password,db,charset,sessionMode);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocinewcollection */
final public OracleOciCollection ocinewcollection (@NotNull Oracle conn,@NotNull String tdo,@Optional String schema) {
 return com.caucho.quercus.lib.db.OracleModule.ocinewcollection (quercus_context,conn,tdo,schema);
}
final public OracleOciCollection ocinewcollection (@NotNull Oracle conn, @NotNull String tdo) {
 String schema = null;

 return com.caucho.quercus.lib.db.OracleModule.ocinewcollection (quercus_context,conn,tdo,schema);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocinewcursor */
final public OracleStatement ocinewcursor (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.ocinewcursor (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocinewdescriptor */
final public OracleOciLob ocinewdescriptor (@NotNull Oracle conn,@Optional("-1") int type) {
 return com.caucho.quercus.lib.db.OracleModule.ocinewdescriptor (quercus_context,conn,type);
}
final public OracleOciLob ocinewdescriptor (@NotNull Oracle conn) {
 int type = -1;

 return com.caucho.quercus.lib.db.OracleModule.ocinewdescriptor (quercus_context,conn,type);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocinlogon */
final public Value ocinlogon (@NotNull String username,@NotNull String password,@Optional String db,@Optional String charset,@Optional("0") int sessionMode) {
 return com.caucho.quercus.lib.db.OracleModule.ocinlogon (quercus_context,username,password,db,charset,sessionMode);
}
final public Value ocinlogon (@NotNull String username, @NotNull String password) {
 String db = null;
String charset = null;
int sessionMode = 0;

 return com.caucho.quercus.lib.db.OracleModule.ocinlogon (quercus_context,username,password,db,charset,sessionMode);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocinumcols */
final public Value ocinumcols (@NotNull OracleStatement stmt) {
 return com.caucho.quercus.lib.db.OracleModule.ocinumcols (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ociparse */
final public OracleStatement ociparse (@NotNull Oracle conn,@NotNull String query) {
 return com.caucho.quercus.lib.db.OracleModule.ociparse (quercus_context,conn,query);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ociplogon */
final public Value ociplogon (@NotNull String username,@NotNull String password,@Optional String db,@Optional String charset,@Optional("0") int sessionMode) {
 return com.caucho.quercus.lib.db.OracleModule.ociplogon (quercus_context,username,password,db,charset,sessionMode);
}
final public Value ociplogon (@NotNull String username, @NotNull String password) {
 String db = null;
String charset = null;
int sessionMode = 0;

 return com.caucho.quercus.lib.db.OracleModule.ociplogon (quercus_context,username,password,db,charset,sessionMode);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ociresult */
final public Value ociresult (@NotNull OracleStatement stmt,@NotNull Value field) {
 return com.caucho.quercus.lib.db.OracleModule.ociresult (quercus_context,stmt,field);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocirollback */
final public Value ocirollback (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.ocirollback (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocirowcount */
final public Value ocirowcount (@NotNull OracleStatement stmt) {
 return com.caucho.quercus.lib.db.OracleModule.ocirowcount (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocisavelob */
final public Value ocisavelob (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.ocisavelob (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocisavelobfile */
final public Value ocisavelobfile (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.ocisavelobfile (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ociserverversion */
final public String ociserverversion (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.ociserverversion (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocisetprefetch */
final public boolean ocisetprefetch (@NotNull OracleStatement stmt,@Optional("1") int rows) {
 return com.caucho.quercus.lib.db.OracleModule.ocisetprefetch (quercus_context,stmt,rows);
}
final public boolean ocisetprefetch (@NotNull OracleStatement stmt) {
 int rows = 1;

 return com.caucho.quercus.lib.db.OracleModule.ocisetprefetch (quercus_context,stmt,rows);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ocistatementtype */
final public String ocistatementtype (@NotNull OracleStatement stmt) {
 return com.caucho.quercus.lib.db.OracleModule.ocistatementtype (quercus_context,stmt);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ociwritelobtofile */
final public Value ociwritelobtofile (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.ociwritelobtofile (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/OracleModule.java : ociwritetemporarylob */
final public Value ociwritetemporarylob (@NotNull Oracle conn) {
 return com.caucho.quercus.lib.db.OracleModule.ociwritetemporarylob (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PDO.java : getAvailableDrivers */
final public ArrayValue getAvailableDrivers () {
 return com.caucho.quercus.lib.db.PDO.getAvailableDrivers ();
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_affected_rows */
final public int pg_affected_rows (@NotNull PostgresResult result) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_affected_rows (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_cmdtuples */
final public int pg_cmdtuples (@NotNull PostgresResult result) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_cmdtuples (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_cancel_query */
final public boolean pg_cancel_query (@NotNull Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_cancel_query (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_client_encoding */
final public String pg_client_encoding (@Optional Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_client_encoding (quercus_context,conn);
}
final public String pg_client_encoding () {
 Postgres conn = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_client_encoding (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_close */
final public boolean pg_close (@Optional Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_close (quercus_context,conn);
}
final public boolean pg_close () {
 Postgres conn = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_close (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_connect */
final public Postgres pg_connect (String connectionString,@Optional int connectionType) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_connect (quercus_context,connectionString,connectionType);
}
final public Postgres pg_connect (String connectionString) {
 int connectionType = 0;

 return com.caucho.quercus.lib.db.PostgresModule.pg_connect (quercus_context,connectionString,connectionType);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_connection_busy */
final public boolean pg_connection_busy (@NotNull Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_connection_busy (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_connection_reset */
final public boolean pg_connection_reset (@NotNull Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_connection_reset (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_connection_status */
final public int pg_connection_status (@NotNull Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_connection_status (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_convert */
final public ArrayValue pg_convert (@NotNull Postgres conn,String tableName,ArrayValue assocArray,@Optional("0") int options) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_convert (quercus_context,conn,tableName,assocArray,options);
}
final public ArrayValue pg_convert (@NotNull Postgres conn, String tableName, ArrayValue assocArray) {
 int options = 0;

 return com.caucho.quercus.lib.db.PostgresModule.pg_convert (quercus_context,conn,tableName,assocArray,options);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_copy_from */
final public boolean pg_copy_from (@NotNull Postgres conn,String tableName,ArrayValue rows,@Optional("") String delimiter,@Optional("") String nullAs) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_copy_from (quercus_context,conn,tableName,rows,delimiter,nullAs);
}
final public boolean pg_copy_from (@NotNull Postgres conn, String tableName, ArrayValue rows) {
 String delimiter = "";
String nullAs = "";

 return com.caucho.quercus.lib.db.PostgresModule.pg_copy_from (quercus_context,conn,tableName,rows,delimiter,nullAs);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_copy_to */
final public ArrayValue pg_copy_to (@NotNull Postgres conn,String tableName,@Optional("") String delimiter,@Optional("") String nullAs) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_copy_to (quercus_context,conn,tableName,delimiter,nullAs);
}
final public ArrayValue pg_copy_to (@NotNull Postgres conn, String tableName) {
 String delimiter = "";
String nullAs = "";

 return com.caucho.quercus.lib.db.PostgresModule.pg_copy_to (quercus_context,conn,tableName,delimiter,nullAs);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_dbname */
final public String pg_dbname (@Optional Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_dbname (quercus_context,conn);
}
final public String pg_dbname () {
 Postgres conn = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_dbname (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_delete */
final public boolean pg_delete (@NotNull Postgres conn,String tableName,ArrayValue assocArray,@Optional("-1") int options) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_delete (quercus_context,conn,tableName,assocArray,options);
}
final public boolean pg_delete (@NotNull Postgres conn, String tableName, ArrayValue assocArray) {
 int options = -1;

 return com.caucho.quercus.lib.db.PostgresModule.pg_delete (quercus_context,conn,tableName,assocArray,options);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_end_copy */
final public boolean pg_end_copy (@Optional Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_end_copy (quercus_context,conn);
}
final public boolean pg_end_copy () {
 Postgres conn = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_end_copy (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_escape_bytea */
final public StringValue pg_escape_bytea (StringValue data) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_escape_bytea (quercus_context,data);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_escape_bytea */
final public StringValue pg_escape_bytea (@NotNull Postgres conn,StringValue data) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_escape_bytea (quercus_context,conn,data);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_escape_string */
final public StringValue pg_escape_string (StringValue data) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_escape_string (quercus_context,data);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_execute */
final public PostgresResult pg_execute (@NotNull Postgres conn,String stmtName,ArrayValue params) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_execute (quercus_context,conn,stmtName,params);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_fetch_all_columns */
final public ArrayValue pg_fetch_all_columns (@NotNull PostgresResult result,@Optional("0") int column) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_fetch_all_columns (quercus_context,result,column);
}
final public ArrayValue pg_fetch_all_columns (@NotNull PostgresResult result) {
 int column = 0;

 return com.caucho.quercus.lib.db.PostgresModule.pg_fetch_all_columns (quercus_context,result,column);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_fetch_all */
final public ArrayValue pg_fetch_all (@NotNull PostgresResult result) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_fetch_all (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_fetch_array */
final public ArrayValue pg_fetch_array (@NotNull PostgresResult result,@Optional("-1") Value row,@Optional("PGSQL_BOTH") int resultType) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_fetch_array (quercus_context,result,row,resultType);
}
final public ArrayValue pg_fetch_array (@NotNull PostgresResult result) {
 Value row = null;
int resultType = 0;

 return com.caucho.quercus.lib.db.PostgresModule.pg_fetch_array (quercus_context,result,row,resultType);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_fetch_assoc */
final public ArrayValue pg_fetch_assoc (@NotNull PostgresResult result,@Optional("-1") Value row) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_fetch_assoc (quercus_context,result,row);
}
final public ArrayValue pg_fetch_assoc (@NotNull PostgresResult result) {
 Value row = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_fetch_assoc (quercus_context,result,row);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_fetch_object */
final public Value pg_fetch_object (@NotNull PostgresResult result,@Optional("-1") Value row,@Optional int resultType) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_fetch_object (quercus_context,result,row,resultType);
}
final public Value pg_fetch_object (@NotNull PostgresResult result) {
 Value row = null;
int resultType = 0;

 return com.caucho.quercus.lib.db.PostgresModule.pg_fetch_object (quercus_context,result,row,resultType);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_fetch_result */
final public Value pg_fetch_result (@NotNull PostgresResult result,Value row,@Optional("-1") Value fieldNameOrNumber) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_fetch_result (quercus_context,result,row,fieldNameOrNumber);
}
final public Value pg_fetch_result (@NotNull PostgresResult result, Value row) {
 Value fieldNameOrNumber = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_fetch_result (quercus_context,result,row,fieldNameOrNumber);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_result */
final public Value pg_result (@NotNull PostgresResult result,Value row,@Optional("-1") Value fieldNameOrNumber) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_result (quercus_context,result,row,fieldNameOrNumber);
}
final public Value pg_result (@NotNull PostgresResult result, Value row) {
 Value fieldNameOrNumber = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_result (quercus_context,result,row,fieldNameOrNumber);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_fetch_row */
final public ArrayValue pg_fetch_row (@NotNull PostgresResult result,@Optional("-1") Value row) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_fetch_row (quercus_context,result,row);
}
final public ArrayValue pg_fetch_row (@NotNull PostgresResult result) {
 Value row = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_fetch_row (quercus_context,result,row);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_field_is_null */
final public LongValue pg_field_is_null (@NotNull PostgresResult result,Value row,@Optional("-1") Value fieldNameOrNumber) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_field_is_null (quercus_context,result,row,fieldNameOrNumber);
}
final public LongValue pg_field_is_null (@NotNull PostgresResult result, Value row) {
 Value fieldNameOrNumber = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_field_is_null (quercus_context,result,row,fieldNameOrNumber);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_fieldisnull */
final public LongValue pg_fieldisnull (@NotNull PostgresResult result,Value row,@Optional("-1") Value fieldNameOrNumber) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_fieldisnull (quercus_context,result,row,fieldNameOrNumber);
}
final public LongValue pg_fieldisnull (@NotNull PostgresResult result, Value row) {
 Value fieldNameOrNumber = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_fieldisnull (quercus_context,result,row,fieldNameOrNumber);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_field_name */
final public Value pg_field_name (@NotNull PostgresResult result,int fieldNumber) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_field_name (quercus_context,result,fieldNumber);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_fieldname */
final public Value pg_fieldname (@NotNull PostgresResult result,int fieldNumber) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_fieldname (quercus_context,result,fieldNumber);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_field_num */
final public int pg_field_num (@NotNull PostgresResult result,String fieldName) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_field_num (quercus_context,result,fieldName);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_fieldnum */
final public int pg_fieldnum (@NotNull PostgresResult result,String fieldName) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_fieldnum (quercus_context,result,fieldName);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_field_prtlen */
final public int pg_field_prtlen (@NotNull PostgresResult result,Value rowNumber,@Optional("-1") Value fieldNameOrNumber) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_field_prtlen (quercus_context,result,rowNumber,fieldNameOrNumber);
}
final public int pg_field_prtlen (@NotNull PostgresResult result, Value rowNumber) {
 Value fieldNameOrNumber = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_field_prtlen (quercus_context,result,rowNumber,fieldNameOrNumber);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_fieldprtlen */
final public int pg_fieldprtlen (@NotNull PostgresResult result,Value rowNumber,@Optional("-1") Value fieldNameOrNumber) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_fieldprtlen (quercus_context,result,rowNumber,fieldNameOrNumber);
}
final public int pg_fieldprtlen (@NotNull PostgresResult result, Value rowNumber) {
 Value fieldNameOrNumber = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_fieldprtlen (quercus_context,result,rowNumber,fieldNameOrNumber);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_field_size */
final public LongValue pg_field_size (@NotNull PostgresResult result,int fieldNumber) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_field_size (quercus_context,result,fieldNumber);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_fieldsize */
final public LongValue pg_fieldsize (@NotNull PostgresResult result,int fieldNumber) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_fieldsize (quercus_context,result,fieldNumber);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_field_table */
final public String pg_field_table (@NotNull PostgresResult result,int fieldNumber,@Optional("false") boolean oidOnly) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_field_table (quercus_context,result,fieldNumber,oidOnly);
}
final public String pg_field_table (@NotNull PostgresResult result, int fieldNumber) {
 boolean oidOnly = false;

 return com.caucho.quercus.lib.db.PostgresModule.pg_field_table (quercus_context,result,fieldNumber,oidOnly);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_field_type_oid */
final public LongValue pg_field_type_oid (@NotNull PostgresResult result,int fieldNumber) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_field_type_oid (quercus_context,result,fieldNumber);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_field_type */
final public StringValue pg_field_type (@NotNull PostgresResult result,int fieldNumber) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_field_type (quercus_context,result,fieldNumber);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_fieldtype */
final public StringValue pg_fieldtype (@NotNull PostgresResult result,int fieldNumber) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_fieldtype (quercus_context,result,fieldNumber);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_free_result */
final public boolean pg_free_result (PostgresResult result) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_free_result (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_freeresult */
final public boolean pg_freeresult (PostgresResult result) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_freeresult (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_get_notify */
final public ArrayValue pg_get_notify (@NotNull Postgres conn,@Optional("-1") int resultType) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_get_notify (quercus_context,conn,resultType);
}
final public ArrayValue pg_get_notify (@NotNull Postgres conn) {
 int resultType = -1;

 return com.caucho.quercus.lib.db.PostgresModule.pg_get_notify (quercus_context,conn,resultType);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_get_pid */
final public int pg_get_pid (@NotNull Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_get_pid (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_get_result */
final public PostgresResult pg_get_result (@Optional Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_get_result (quercus_context,conn);
}
final public PostgresResult pg_get_result () {
 Postgres conn = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_get_result (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_host */
final public String pg_host (@Optional Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_host (quercus_context,conn);
}
final public String pg_host () {
 Postgres conn = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_host (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_insert */
final public boolean pg_insert (@NotNull Postgres conn,String tableName,ArrayValue assocArray,@Optional("-1") int options) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_insert (quercus_context,conn,tableName,assocArray,options);
}
final public boolean pg_insert (@NotNull Postgres conn, String tableName, ArrayValue assocArray) {
 int options = -1;

 return com.caucho.quercus.lib.db.PostgresModule.pg_insert (quercus_context,conn,tableName,assocArray,options);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_last_error */
final public StringValue pg_last_error (@Optional Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_last_error (quercus_context,conn);
}
final public StringValue pg_last_error () {
 Postgres conn = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_last_error (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_errormessage */
final public StringValue pg_errormessage (@Optional Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_errormessage (quercus_context,conn);
}
final public StringValue pg_errormessage () {
 Postgres conn = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_errormessage (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_last_notice */
final public String pg_last_notice (@NotNull Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_last_notice (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_last_oid */
final public String pg_last_oid (PostgresResult result) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_last_oid (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_getlastoid */
final public String pg_getlastoid (PostgresResult result) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_getlastoid (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_lo_close */
final public boolean pg_lo_close (Object largeObject) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_lo_close (quercus_context,largeObject);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_loclose */
final public boolean pg_loclose (Object largeObject) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_loclose (quercus_context,largeObject);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_lo_create */
final public LongValue pg_lo_create (@Optional Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_lo_create (quercus_context,conn);
}
final public LongValue pg_lo_create () {
 Postgres conn = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_lo_create (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_locreate */
final public LongValue pg_locreate (@Optional Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_locreate (quercus_context,conn);
}
final public LongValue pg_locreate () {
 Postgres conn = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_locreate (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_lo_export */
final public boolean pg_lo_export (@NotNull Postgres conn,int oid,Path path) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_lo_export (quercus_context,conn,oid,path);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_loexport */
final public boolean pg_loexport (@NotNull Postgres conn,int oid,Path path) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_loexport (quercus_context,conn,oid,path);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_lo_import */
final public LongValue pg_lo_import (@NotNull Postgres conn,Path path) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_lo_import (quercus_context,conn,path);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_loimport */
final public LongValue pg_loimport (@NotNull Postgres conn,Path path) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_loimport (quercus_context,conn,path);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_lo_open */
final public Object pg_lo_open (@NotNull Postgres conn,int oid,String mode) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_lo_open (quercus_context,conn,oid,mode);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_loopen */
final public Object pg_loopen (@NotNull Postgres conn,int oid,String mode) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_loopen (quercus_context,conn,oid,mode);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_lo_read_all */
final public LongValue pg_lo_read_all (Object largeObject) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_lo_read_all (quercus_context,largeObject);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_loreadall */
final public LongValue pg_loreadall (Object largeObject) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_loreadall (quercus_context,largeObject);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_lo_read */
final public StringValue pg_lo_read (Object largeObject,@Optional("-1") int len) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_lo_read (quercus_context,largeObject,len);
}
final public StringValue pg_lo_read (Object largeObject) {
 int len = -1;

 return com.caucho.quercus.lib.db.PostgresModule.pg_lo_read (quercus_context,largeObject,len);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_loread */
final public StringValue pg_loread (Object largeObject,@Optional("-1") int len) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_loread (quercus_context,largeObject,len);
}
final public StringValue pg_loread (Object largeObject) {
 int len = -1;

 return com.caucho.quercus.lib.db.PostgresModule.pg_loread (quercus_context,largeObject,len);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_lo_seek */
final public boolean pg_lo_seek (Object largeObject,int offset,@Optional int whence) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_lo_seek (quercus_context,largeObject,offset,whence);
}
final public boolean pg_lo_seek (Object largeObject, int offset) {
 int whence = 0;

 return com.caucho.quercus.lib.db.PostgresModule.pg_lo_seek (quercus_context,largeObject,offset,whence);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_lo_tell */
final public int pg_lo_tell (Object largeObject) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_lo_tell (quercus_context,largeObject);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_lo_unlink */
final public boolean pg_lo_unlink (@NotNull Postgres conn,int oid) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_lo_unlink (quercus_context,conn,oid);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_lounlink */
final public boolean pg_lounlink (@NotNull Postgres conn,int oid) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_lounlink (quercus_context,conn,oid);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_lo_write */
final public LongValue pg_lo_write (@NotNull Object largeObject,String data,@Optional int len) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_lo_write (quercus_context,largeObject,data,len);
}
final public LongValue pg_lo_write (@NotNull Object largeObject, String data) {
 int len = 0;

 return com.caucho.quercus.lib.db.PostgresModule.pg_lo_write (quercus_context,largeObject,data,len);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_lowrite */
final public LongValue pg_lowrite (@NotNull Object largeObject,String data,@Optional int len) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_lowrite (quercus_context,largeObject,data,len);
}
final public LongValue pg_lowrite (@NotNull Object largeObject, String data) {
 int len = 0;

 return com.caucho.quercus.lib.db.PostgresModule.pg_lowrite (quercus_context,largeObject,data,len);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_meta_data */
final public ArrayValue pg_meta_data (@NotNull Postgres conn,String tableName) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_meta_data (quercus_context,conn,tableName);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_num_fields */
final public int pg_num_fields (@NotNull PostgresResult result) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_num_fields (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_numfields */
final public int pg_numfields (@NotNull PostgresResult result) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_numfields (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_num_rows */
final public LongValue pg_num_rows (@NotNull PostgresResult result) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_num_rows (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_numrows */
final public LongValue pg_numrows (@NotNull PostgresResult result) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_numrows (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_options */
final public String pg_options (@Optional Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_options (quercus_context,conn);
}
final public String pg_options () {
 Postgres conn = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_options (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_parameter_status */
final public Value pg_parameter_status (@NotNull Postgres conn,@NotNull StringValue paramName) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_parameter_status (quercus_context,conn,paramName);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_parameter_status */
final public Value pg_parameter_status (@NotNull StringValue paramName) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_parameter_status (quercus_context,paramName);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_pconnect */
final public Postgres pg_pconnect (String connectionString,@Optional int connectType) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_pconnect (quercus_context,connectionString,connectType);
}
final public Postgres pg_pconnect (String connectionString) {
 int connectType = 0;

 return com.caucho.quercus.lib.db.PostgresModule.pg_pconnect (quercus_context,connectionString,connectType);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_ping */
final public boolean pg_ping (@Optional Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_ping (quercus_context,conn);
}
final public boolean pg_ping () {
 Postgres conn = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_ping (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_port */
final public StringValue pg_port (@Optional Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_port (quercus_context,conn);
}
final public StringValue pg_port () {
 Postgres conn = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_port (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_prepare */
final public PostgresStatement pg_prepare (@NotNull Postgres conn,String stmtName,String query) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_prepare (quercus_context,conn,stmtName,query);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_put_line */
final public boolean pg_put_line (@NotNull Postgres conn,String data) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_put_line (quercus_context,conn,data);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_query_params */
final public PostgresResult pg_query_params (@NotNull Postgres conn,String query,ArrayValue params) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_query_params (quercus_context,conn,query,params);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_query */
final public PostgresResult pg_query (@NotNull String query) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_query (quercus_context,query);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_query */
final public PostgresResult pg_query (@NotNull Postgres conn,@NotNull String query) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_query (quercus_context,conn,query);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_exec */
final public PostgresResult pg_exec (@NotNull Postgres conn,String query) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_exec (quercus_context,conn,query);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_result_error_field */
final public Value pg_result_error_field (@NotNull PostgresResult result,int fieldCode) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_result_error_field (quercus_context,result,fieldCode);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_result_error */
final public String pg_result_error (@Optional PostgresResult result) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_result_error (quercus_context,result);
}
final public String pg_result_error () {
 PostgresResult result = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_result_error (quercus_context,result);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_result_seek */
final public boolean pg_result_seek (@NotNull PostgresResult result,int offset) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_result_seek (quercus_context,result,offset);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_result_status */
final public int pg_result_status (@NotNull PostgresResult result,@Optional("PGSQL_STATUS_LONG") int type) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_result_status (quercus_context,result,type);
}
final public int pg_result_status (@NotNull PostgresResult result) {
 int type = 0;

 return com.caucho.quercus.lib.db.PostgresModule.pg_result_status (quercus_context,result,type);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_select */
final public ArrayValue pg_select (@NotNull Postgres conn,String tableName,ArrayValue assocArray,@Optional("-1") int options) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_select (quercus_context,conn,tableName,assocArray,options);
}
final public ArrayValue pg_select (@NotNull Postgres conn, String tableName, ArrayValue assocArray) {
 int options = -1;

 return com.caucho.quercus.lib.db.PostgresModule.pg_select (quercus_context,conn,tableName,assocArray,options);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_send_execute */
final public boolean pg_send_execute (@NotNull Postgres conn,String stmtName,ArrayValue params) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_send_execute (quercus_context,conn,stmtName,params);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_send_prepare */
final public boolean pg_send_prepare (@NotNull Postgres conn,String stmtName,String query) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_send_prepare (quercus_context,conn,stmtName,query);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_send_query_params */
final public boolean pg_send_query_params (@NotNull Postgres conn,String query,ArrayValue params) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_send_query_params (quercus_context,conn,query,params);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_send_query */
final public boolean pg_send_query (@NotNull Postgres conn,String query) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_send_query (quercus_context,conn,query);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_set_client_encoding */
final public int pg_set_client_encoding (@NotNull Postgres conn,String encoding) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_set_client_encoding (quercus_context,conn,encoding);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_set_error_verbosity */
final public int pg_set_error_verbosity (@NotNull Postgres conn,int intVerbosity) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_set_error_verbosity (quercus_context,conn,intVerbosity);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_trace */
final public boolean pg_trace (Path path,@Optional String mode,@Optional Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_trace (quercus_context,path,mode,conn);
}
final public boolean pg_trace (Path path) {
 String mode = null;
Postgres conn = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_trace (quercus_context,path,mode,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_transaction_status */
final public int pg_transaction_status (@Optional Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_transaction_status (quercus_context,conn);
}
final public int pg_transaction_status () {
 Postgres conn = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_transaction_status (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_tty */
final public String pg_tty (@Optional Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_tty (quercus_context,conn);
}
final public String pg_tty () {
 Postgres conn = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_tty (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_unescape_bytea */
final public String pg_unescape_bytea (String data) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_unescape_bytea (quercus_context,data);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_untrace */
final public boolean pg_untrace (@Optional Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_untrace (quercus_context,conn);
}
final public boolean pg_untrace () {
 Postgres conn = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_untrace (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_update */
final public boolean pg_update (@NotNull Postgres conn,String tableName,ArrayValue data,ArrayValue condition,@Optional int options) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_update (quercus_context,conn,tableName,data,condition,options);
}
final public boolean pg_update (@NotNull Postgres conn, String tableName, ArrayValue data, ArrayValue condition) {
 int options = 0;

 return com.caucho.quercus.lib.db.PostgresModule.pg_update (quercus_context,conn,tableName,data,condition,options);
}


/* ./com/caucho/quercus/lib/db/PostgresModule.java : pg_version */
final public ArrayValue pg_version (@Optional Postgres conn) {
 return com.caucho.quercus.lib.db.PostgresModule.pg_version (quercus_context,conn);
}
final public ArrayValue pg_version () {
 Postgres conn = null;

 return com.caucho.quercus.lib.db.PostgresModule.pg_version (quercus_context,conn);
}


/* ./com/caucho/quercus/lib/dom/DOMAttr.java : __construct */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/dom/DOMComment.java : __construct */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/dom/DOMDocument.java : __construct */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/dom/DOMElement.java : __construct */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/dom/DOMEntityReference.java : __construct */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/dom/DOMProcessingInstruction.java : __construct */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/dom/DOMText.java : __construct */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/dom/DOMXPath.java : __construct */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/dom/QuercusDOMModule.java : dom_import_simplexml */
final public DOMElement dom_import_simplexml (SimpleXMLElement node) {
 return com.caucho.quercus.lib.dom.QuercusDOMModule.dom_import_simplexml (quercus_context,node);
}


/* ./com/caucho/quercus/lib/ErrorModule.java : die */
final public Value die (@Optional String msg) {
 return com.caucho.quercus.lib.ErrorModule.die (quercus_context,msg);
}
final public Value die () {
 String msg = null;

 return com.caucho.quercus.lib.ErrorModule.die (quercus_context,msg);
}


/* ./com/caucho/quercus/lib/ErrorModule.java : debug_backtrace */
final public Value debug_backtrace () {
 return com.caucho.quercus.lib.ErrorModule.debug_backtrace (quercus_context);
}


/* ./com/caucho/quercus/lib/ErrorModule.java : error_log */
final public boolean error_log (StringValue message,@Optional("0") int type,@Optional StringValue destination,@Optional StringValue extraHeaders) {
 return com.caucho.quercus.lib.ErrorModule.error_log (quercus_context,message,type,destination,extraHeaders);
}
final public boolean error_log (StringValue message) {
 int type = 0;
StringValue destination = new ConstStringValue("");
StringValue extraHeaders = new ConstStringValue("");

 return com.caucho.quercus.lib.ErrorModule.error_log (quercus_context,message,type,destination,extraHeaders);
}


/* ./com/caucho/quercus/lib/ErrorModule.java : error_reporting */
final public long error_reporting (@Optional Value levelV) {
 return com.caucho.quercus.lib.ErrorModule.error_reporting (quercus_context,levelV);
}
final public long error_reporting () {
 Value levelV = null;

 return com.caucho.quercus.lib.ErrorModule.error_reporting (quercus_context,levelV);
}


/* ./com/caucho/quercus/lib/ErrorModule.java : restore_error_handler */
final public boolean restore_error_handler () {
 return com.caucho.quercus.lib.ErrorModule.restore_error_handler (quercus_context);
}


/* ./com/caucho/quercus/lib/ErrorModule.java : set_error_handler */
final public boolean set_error_handler (Callable fun,@Optional("E_ALL") int errorMask) {
 return com.caucho.quercus.lib.ErrorModule.set_error_handler (quercus_context,fun,errorMask);
}
final public boolean set_error_handler (Callable fun) {
 int errorMask = 0;

 return com.caucho.quercus.lib.ErrorModule.set_error_handler (quercus_context,fun,errorMask);
}


/* ./com/caucho/quercus/lib/ErrorModule.java : set_exception_handler */
final public Value set_exception_handler (Callable fun) {
 return com.caucho.quercus.lib.ErrorModule.set_exception_handler (quercus_context,fun);
}


/* ./com/caucho/quercus/lib/ErrorModule.java : restore_exception_handler */
final public Value restore_exception_handler () {
 return com.caucho.quercus.lib.ErrorModule.restore_exception_handler (quercus_context);
}


/* ./com/caucho/quercus/lib/ErrorModule.java : trigger_error */
final public Value trigger_error (String msg,@Optional("E_USER_NOTICE") int code) {
 return com.caucho.quercus.lib.ErrorModule.trigger_error (quercus_context,msg,code);
}
final public Value trigger_error (String msg) {
 int code = 0;

 return com.caucho.quercus.lib.ErrorModule.trigger_error (quercus_context,msg,code);
}


/* ./com/caucho/quercus/lib/ExceptionClass.java : __construct */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/ExceptionClass.java : __toString */
final public Value __toString (@This ObjectValue value) {
 return com.caucho.quercus.lib.ExceptionClass.__toString (quercus_context,value);
}


/* ./com/caucho/quercus/lib/ExceptionClass.java : getMessage */
final public Value getMessage (@This ObjectValue obj) {
 return com.caucho.quercus.lib.ExceptionClass.getMessage (quercus_context,obj);
}


/* ./com/caucho/quercus/lib/ExceptionClass.java : getCode */
final public Value getCode (@This ObjectValue obj) {
 return com.caucho.quercus.lib.ExceptionClass.getCode (quercus_context,obj);
}


/* ./com/caucho/quercus/lib/ExceptionClass.java : getFile */
final public Value getFile (@This ObjectValue obj) {
 return com.caucho.quercus.lib.ExceptionClass.getFile (quercus_context,obj);
}


/* ./com/caucho/quercus/lib/ExceptionClass.java : getLine */
final public Value getLine (@This ObjectValue obj) {
 return com.caucho.quercus.lib.ExceptionClass.getLine (quercus_context,obj);
}


/* ./com/caucho/quercus/lib/ExceptionClass.java : getTrace */
final public Value getTrace (@This Value obj) {
 return com.caucho.quercus.lib.ExceptionClass.getTrace (quercus_context,obj);
}


/* ./com/caucho/quercus/lib/ExceptionClass.java : getTraceAsString */
final public Value getTraceAsString (@This Value obj) {
 return com.caucho.quercus.lib.ExceptionClass.getTraceAsString (quercus_context,obj);
}


/* ./com/caucho/quercus/lib/ExifModule.java : exif_read_data */
final public Value exif_read_data (Path file,@Optional String sections,@Optional boolean arrays,@Optional boolean thumbs) {
 return com.caucho.quercus.lib.ExifModule.exif_read_data (quercus_context,file,sections,arrays,thumbs);
}
final public Value exif_read_data (Path file) {
 String sections = null;
boolean arrays = false;
boolean thumbs = false;

 return com.caucho.quercus.lib.ExifModule.exif_read_data (quercus_context,file,sections,arrays,thumbs);
}


/* ./com/caucho/quercus/lib/ExifModule.java : read_exif_data */
final public Value read_exif_data (Path file,@Optional String sections,@Optional boolean arrays,@Optional boolean thumbs) {
 return com.caucho.quercus.lib.ExifModule.read_exif_data (quercus_context,file,sections,arrays,thumbs);
}
final public Value read_exif_data (Path file) {
 String sections = null;
boolean arrays = false;
boolean thumbs = false;

 return com.caucho.quercus.lib.ExifModule.read_exif_data (quercus_context,file,sections,arrays,thumbs);
}


/* ./com/caucho/quercus/lib/ExifModule.java : exif_thumbnail */
final public Value exif_thumbnail (Path file,@Optional int width,@Optional int height,@Optional int imageType) {
 return com.caucho.quercus.lib.ExifModule.exif_thumbnail (quercus_context,file,width,height,imageType);
}
final public Value exif_thumbnail (Path file) {
 int width = 0;
int height = 0;
int imageType = 0;

 return com.caucho.quercus.lib.ExifModule.exif_thumbnail (quercus_context,file,width,height,imageType);
}


/* ./com/caucho/quercus/lib/ExifModule.java : exif_tagname */
final public String exif_tagname (String index) {
 return com.caucho.quercus.lib.ExifModule.exif_tagname (index);
}


/* ./com/caucho/quercus/lib/ExifModule.java : exif_imagetype */
final public Value exif_imagetype (Path file) {
 return com.caucho.quercus.lib.ExifModule.exif_imagetype (quercus_context,file);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : basename */
final public Value basename (StringValue path,@Optional StringValue suffix) {
 return com.caucho.quercus.lib.file.FileModule.basename (path,suffix);
}
final public Value basename (StringValue path) {
 StringValue suffix = new ConstStringValue("");

 return com.caucho.quercus.lib.file.FileModule.basename (path,suffix);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : chdir */
final public boolean chdir (Path path) {
 return com.caucho.quercus.lib.file.FileModule.chdir (quercus_context,path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : chroot */
final public boolean chroot (Path path) {
 return com.caucho.quercus.lib.file.FileModule.chroot (quercus_context,path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : chgrp */
final public boolean chgrp (Path file,Value group) {
 return com.caucho.quercus.lib.file.FileModule.chgrp (quercus_context,file,group);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : chmod */
final public boolean chmod (Path file,int mode) {
 return com.caucho.quercus.lib.file.FileModule.chmod (quercus_context,file,mode);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : chown */
final public boolean chown (Path file,Value user) {
 return com.caucho.quercus.lib.file.FileModule.chown (quercus_context,file,user);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : clearstatcache */
final public Value clearstatcache () {
 return com.caucho.quercus.lib.file.FileModule.clearstatcache (quercus_context);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : copy */
final public boolean copy (Path src,Path dst) {
 return com.caucho.quercus.lib.file.FileModule.copy (quercus_context,src,dst);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : dir */
final public Directory dir (Path path) {
 return com.caucho.quercus.lib.file.FileModule.dir (quercus_context,path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : disk_free_space */
final public Value disk_free_space (Path directory) {
 return com.caucho.quercus.lib.file.FileModule.disk_free_space (quercus_context,directory);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : disk_total_space */
final public Value disk_total_space (Path directory) {
 return com.caucho.quercus.lib.file.FileModule.disk_total_space (quercus_context,directory);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : diskfreespace */
final public Value diskfreespace (Path directory) {
 return com.caucho.quercus.lib.file.FileModule.diskfreespace (quercus_context,directory);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : fclose */
final public boolean fclose (@NotNull BinaryStream s) {
 return com.caucho.quercus.lib.file.FileModule.fclose (quercus_context,s);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : feof */
final public boolean feof (@NotNull BinaryStream binaryStream) {
 return com.caucho.quercus.lib.file.FileModule.feof (quercus_context,binaryStream);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : fflush */
final public boolean fflush (@NotNull BinaryOutput os) {
 return com.caucho.quercus.lib.file.FileModule.fflush (quercus_context,os);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : fgetc */
final public Value fgetc (@NotNull BinaryInput is) {
 return com.caucho.quercus.lib.file.FileModule.fgetc (quercus_context,is);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : fgets */
final public Value fgets (@NotNull BinaryInput is,@Optional("0x7fffffff") int length) {
 return com.caucho.quercus.lib.file.FileModule.fgets (quercus_context,is,length);
}
final public Value fgets (@NotNull BinaryInput is) {
 int length = 0;

 return com.caucho.quercus.lib.file.FileModule.fgets (quercus_context,is,length);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : fgetss */
final public Value fgetss (BinaryInput is,@Optional("0x7fffffff") int length,@Optional Value allowedTags) {
 return com.caucho.quercus.lib.file.FileModule.fgetss (quercus_context,is,length,allowedTags);
}
final public Value fgetss (BinaryInput is) {
 int length = 0;
Value allowedTags = null;

 return com.caucho.quercus.lib.file.FileModule.fgetss (quercus_context,is,length,allowedTags);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : file */
final public Value file (StringValue filename,@Optional boolean useIncludePath,@Optional Value context) {
 return com.caucho.quercus.lib.file.FileModule.file (quercus_context,filename,useIncludePath,context);
}
final public Value file (StringValue filename) {
 boolean useIncludePath = false;
Value context = null;

 return com.caucho.quercus.lib.file.FileModule.file (quercus_context,filename,useIncludePath,context);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : fileatime */
final public Value fileatime (Path path) {
 return com.caucho.quercus.lib.file.FileModule.fileatime (quercus_context,path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : filectime */
final public Value filectime (Path path) {
 return com.caucho.quercus.lib.file.FileModule.filectime (quercus_context,path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : filegroup */
final public Value filegroup (Path path) {
 return com.caucho.quercus.lib.file.FileModule.filegroup (quercus_context,path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : fileinode */
final public Value fileinode (Path path) {
 return com.caucho.quercus.lib.file.FileModule.fileinode (quercus_context,path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : filemtime */
final public Value filemtime (Path path) {
 return com.caucho.quercus.lib.file.FileModule.filemtime (quercus_context,path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : fileowner */
final public Value fileowner (Path path) {
 return com.caucho.quercus.lib.file.FileModule.fileowner (quercus_context,path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : fileperms */
final public Value fileperms (Path path) {
 return com.caucho.quercus.lib.file.FileModule.fileperms (quercus_context,path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : filesize */
final public Value filesize (Path path) {
 return com.caucho.quercus.lib.file.FileModule.filesize (quercus_context,path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : filetype */
final public Value filetype (@NotNull Path path) {
 return com.caucho.quercus.lib.file.FileModule.filetype (quercus_context,path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : file_exists */
final public boolean file_exists (@NotNull Path path) {
 return com.caucho.quercus.lib.file.FileModule.file_exists (path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : file_get_contents */
final public StringValue file_get_contents (StringValue filename,@Optional boolean useIncludePath,@Optional Value context,@Optional long offset,@Optional("4294967296") long maxLen) {
 return com.caucho.quercus.lib.file.FileModule.file_get_contents (quercus_context,filename,useIncludePath,context,offset,maxLen);
}
final public StringValue file_get_contents (StringValue filename) {
 boolean useIncludePath = false;
Value context = null;
long offset = 0;
long maxLen = 4294967296l;

 return com.caucho.quercus.lib.file.FileModule.file_get_contents (quercus_context,filename,useIncludePath,context,offset,maxLen);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : file_put_contents */
final public Value file_put_contents (StringValue filename,Value data,@Optional int flags,@Optional Value context) {
 return com.caucho.quercus.lib.file.FileModule.file_put_contents (quercus_context,filename,data,flags,context);
}
final public Value file_put_contents (StringValue filename, Value data) {
 int flags = 0;
Value context = null;

 return com.caucho.quercus.lib.file.FileModule.file_put_contents (quercus_context,filename,data,flags,context);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : flock */
final public boolean flock (LockableStream fileV,int operation,@Optional Value wouldBlock) {
 return com.caucho.quercus.lib.file.FileModule.flock (quercus_context,fileV,operation,wouldBlock);
}
final public boolean flock (LockableStream fileV, int operation) {
 Value wouldBlock = null;

 return com.caucho.quercus.lib.file.FileModule.flock (quercus_context,fileV,operation,wouldBlock);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : fnmatch */
final public boolean fnmatch (String pattern,String string,@Optional int flags) {
 return com.caucho.quercus.lib.file.FileModule.fnmatch (quercus_context,pattern,string,flags);
}
final public boolean fnmatch (String pattern, String string) {
 int flags = 0;

 return com.caucho.quercus.lib.file.FileModule.fnmatch (quercus_context,pattern,string,flags);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : fopen */
final public BinaryStream fopen (StringValue filename,String mode,@Optional boolean useIncludePath,@Optional Value contextV) {
 return com.caucho.quercus.lib.file.FileModule.fopen (quercus_context,filename,mode,useIncludePath,contextV);
}
final public BinaryStream fopen (StringValue filename, String mode) {
 boolean useIncludePath = false;
Value contextV = null;

 return com.caucho.quercus.lib.file.FileModule.fopen (quercus_context,filename,mode,useIncludePath,contextV);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : fputs */
final public Value fputs (BinaryOutput os,InputStream value,@Optional("0x7fffffff") int length) {
 return com.caucho.quercus.lib.file.FileModule.fputs (quercus_context,os,value,length);
}
final public Value fputs (BinaryOutput os, InputStream value) {
 int length = 0;

 return com.caucho.quercus.lib.file.FileModule.fputs (quercus_context,os,value,length);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : fread */
final public Value fread (@NotNull BinaryInput is,int length) {
 return com.caucho.quercus.lib.file.FileModule.fread (quercus_context,is,length);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : fscanf */
final public Value fscanf (@NotNull BinaryInput is, StringValue format, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.file.FileModule.fscanf (quercus_context,is,format,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/file/FileModule.java : fseek */
final public Value fseek (@NotNull BinaryStream binaryStream,long offset,@Optional("SEEK_SET") int whence) {
 return com.caucho.quercus.lib.file.FileModule.fseek (quercus_context,binaryStream,offset,whence);
}
final public Value fseek (@NotNull BinaryStream binaryStream, long offset) {
 int whence = 0;

 return com.caucho.quercus.lib.file.FileModule.fseek (quercus_context,binaryStream,offset,whence);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : fstat */
final public Value fstat (@NotNull BinaryStream stream) {
 return com.caucho.quercus.lib.file.FileModule.fstat (quercus_context,stream);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : ftell */
final public Value ftell (@NotNull BinaryStream binaryStream) {
 return com.caucho.quercus.lib.file.FileModule.ftell (quercus_context,binaryStream);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : ftruncate */
final public boolean ftruncate (@NotNull BinaryOutput handle,long size) {
 return com.caucho.quercus.lib.file.FileModule.ftruncate (quercus_context,handle,size);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : fwrite */
final public Value fwrite (@NotNull BinaryOutput os,InputStream value,@Optional("0x7fffffff") int length) {
 return com.caucho.quercus.lib.file.FileModule.fwrite (quercus_context,os,value,length);
}
final public Value fwrite (@NotNull BinaryOutput os, InputStream value) {
 int length = 0;

 return com.caucho.quercus.lib.file.FileModule.fwrite (quercus_context,os,value,length);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : glob */
final public Value glob (String pattern,@Optional int flags) {
 return com.caucho.quercus.lib.file.FileModule.glob (quercus_context,pattern,flags);
}
final public Value glob (String pattern) {
 int flags = 0;

 return com.caucho.quercus.lib.file.FileModule.glob (quercus_context,pattern,flags);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : getcwd */
final public String getcwd () {
 return com.caucho.quercus.lib.file.FileModule.getcwd (quercus_context);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : is_dir */
final public boolean is_dir (@NotNull Path path) {
 return com.caucho.quercus.lib.file.FileModule.is_dir (path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : is_executable */
final public boolean is_executable (@NotNull Path path) {
 return com.caucho.quercus.lib.file.FileModule.is_executable (path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : is_file */
final public boolean is_file (@NotNull Path path) {
 return com.caucho.quercus.lib.file.FileModule.is_file (path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : is_link */
final public boolean is_link (@NotNull Path path) {
 return com.caucho.quercus.lib.file.FileModule.is_link (quercus_context,path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : is_readable */
final public boolean is_readable (Path path) {
 return com.caucho.quercus.lib.file.FileModule.is_readable (path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : is_uploaded_file */
final public boolean is_uploaded_file (@NotNull Path path) {
 return com.caucho.quercus.lib.file.FileModule.is_uploaded_file (quercus_context,path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : is_writable */
final public boolean is_writable (Path path) {
 return com.caucho.quercus.lib.file.FileModule.is_writable (path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : is_writeable */
final public boolean is_writeable (Path path) {
 return com.caucho.quercus.lib.file.FileModule.is_writeable (path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : linkinfo */
final public long linkinfo (Path path) {
 return com.caucho.quercus.lib.file.FileModule.linkinfo (quercus_context,path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : lstat */
final public Value lstat (StringValue filename) {
 return com.caucho.quercus.lib.file.FileModule.lstat (quercus_context,filename);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : mkdir */
final public boolean mkdir (StringValue dirname,@Optional int mode,@Optional boolean recursive,@Optional Value context) {
 return com.caucho.quercus.lib.file.FileModule.mkdir (quercus_context,dirname,mode,recursive,context);
}
final public boolean mkdir (StringValue dirname) {
 int mode = 0;
boolean recursive = false;
Value context = null;

 return com.caucho.quercus.lib.file.FileModule.mkdir (quercus_context,dirname,mode,recursive,context);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : move_uploaded_file */
final public boolean move_uploaded_file (@NotNull Path src,@NotNull Path dst) {
 return com.caucho.quercus.lib.file.FileModule.move_uploaded_file (quercus_context,src,dst);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : opendir */
final public Value opendir (StringValue pathName,@Optional Value context) {
 return com.caucho.quercus.lib.file.FileModule.opendir (quercus_context,pathName,context);
}
final public Value opendir (StringValue pathName) {
 Value context = null;

 return com.caucho.quercus.lib.file.FileModule.opendir (quercus_context,pathName,context);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : parse_ini_file */
final public Value parse_ini_file (Path path,@Optional boolean processSections) {
 return com.caucho.quercus.lib.file.FileModule.parse_ini_file (quercus_context,path,processSections);
}
final public Value parse_ini_file (Path path) {
 boolean processSections = false;

 return com.caucho.quercus.lib.file.FileModule.parse_ini_file (quercus_context,path,processSections);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : pathinfo */
final public Value pathinfo (String path,@Optional Value optionsV) {
 return com.caucho.quercus.lib.file.FileModule.pathinfo (quercus_context,path,optionsV);
}
final public Value pathinfo (String path) {
 Value optionsV = null;

 return com.caucho.quercus.lib.file.FileModule.pathinfo (quercus_context,path,optionsV);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : pclose */
final public int pclose (@NotNull BinaryStream stream) {
 return com.caucho.quercus.lib.file.FileModule.pclose (quercus_context,stream);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : popen */
final public BinaryStream popen (@NotNull String command,@NotNull StringValue mode) {
 return com.caucho.quercus.lib.file.FileModule.popen (quercus_context,command,mode);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : readdir */
final public Value readdir (@NotNull DirectoryValue dir) {
 return com.caucho.quercus.lib.file.FileModule.readdir (quercus_context,dir);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : readlink */
final public Value readlink (Path path) {
 return com.caucho.quercus.lib.file.FileModule.readlink (quercus_context,path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : realpath */
final public Value realpath (Path path) {
 return com.caucho.quercus.lib.file.FileModule.realpath (quercus_context,path);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : rename */
final public boolean rename (StringValue from,StringValue to) {
 return com.caucho.quercus.lib.file.FileModule.rename (quercus_context,from,to);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : rewind */
final public Value rewind (@NotNull BinaryStream binaryStream) {
 return com.caucho.quercus.lib.file.FileModule.rewind (quercus_context,binaryStream);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : rewinddir */
final public void rewinddir (@NotNull DirectoryValue dir) {
  com.caucho.quercus.lib.file.FileModule.rewinddir (quercus_context,dir);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : rmdir */
final public boolean rmdir (StringValue filename,@Optional Value context) {
 return com.caucho.quercus.lib.file.FileModule.rmdir (quercus_context,filename,context);
}
final public boolean rmdir (StringValue filename) {
 Value context = null;

 return com.caucho.quercus.lib.file.FileModule.rmdir (quercus_context,filename,context);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : closedir */
final public Value closedir (@NotNull DirectoryValue dirV) {
 return com.caucho.quercus.lib.file.FileModule.closedir (quercus_context,dirV);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : scandir */
final public Value scandir (StringValue fileName,@Optional("1") int order,@Optional Value context) {
 return com.caucho.quercus.lib.file.FileModule.scandir (quercus_context,fileName,order,context);
}
final public Value scandir (StringValue fileName) {
 int order = 1;
Value context = null;

 return com.caucho.quercus.lib.file.FileModule.scandir (quercus_context,fileName,order,context);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : set_file_buffer */
final public int set_file_buffer (BinaryOutput stream,int bufferSize) {
 return com.caucho.quercus.lib.file.FileModule.set_file_buffer (quercus_context,stream,bufferSize);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : stat */
final public Value stat (StringValue filename) {
 return com.caucho.quercus.lib.file.FileModule.stat (quercus_context,filename);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : tempnam */
final public Value tempnam (Path dir,String prefix) {
 return com.caucho.quercus.lib.file.FileModule.tempnam (quercus_context,dir,prefix);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : tmpfile */
final public FileInputOutput tmpfile () {
 return com.caucho.quercus.lib.file.FileModule.tmpfile (quercus_context);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : touch */
final public boolean touch (Path path,@Optional int time,@Optional int atime) {
 return com.caucho.quercus.lib.file.FileModule.touch (path,time,atime);
}
final public boolean touch (Path path) {
 int time = 0;
int atime = 0;

 return com.caucho.quercus.lib.file.FileModule.touch (path,time,atime);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : umask */
final public int umask (@Optional("0") int maskV) {
 return com.caucho.quercus.lib.file.FileModule.umask (quercus_context,maskV);
}
final public int umask () {
 int maskV = 0;

 return com.caucho.quercus.lib.file.FileModule.umask (quercus_context,maskV);
}


/* ./com/caucho/quercus/lib/file/FileModule.java : unlink */
final public boolean unlink (StringValue filename,@Optional Value context) {
 return com.caucho.quercus.lib.file.FileModule.unlink (quercus_context,filename,context);
}
final public boolean unlink (StringValue filename) {
 Value context = null;

 return com.caucho.quercus.lib.file.FileModule.unlink (quercus_context,filename,context);
}


/* ./com/caucho/quercus/lib/file/SocketModule.java : socket_create */
final public SocketInputOutput socket_create (int domain,int type,int protocol) {
 return com.caucho.quercus.lib.file.SocketModule.socket_create (quercus_context,domain,type,protocol);
}


/* ./com/caucho/quercus/lib/file/SocketModule.java : socket_bind */
final public boolean socket_bind (@NotNull SocketInputOutput socket,StringValue address,@Optional("0") int port) {
 return com.caucho.quercus.lib.file.SocketModule.socket_bind (quercus_context,socket,address,port);
}
final public boolean socket_bind (@NotNull SocketInputOutput socket, StringValue address) {
 int port = 0;

 return com.caucho.quercus.lib.file.SocketModule.socket_bind (quercus_context,socket,address,port);
}


/* ./com/caucho/quercus/lib/file/SocketModule.java : socket_close */
final public void socket_close (@NotNull SocketInputOutput socket) {
  com.caucho.quercus.lib.file.SocketModule.socket_close (quercus_context,socket);
}


/* ./com/caucho/quercus/lib/file/SocketModule.java : socket_connect */
final public boolean socket_connect (@NotNull SocketInputOutput socket,StringValue address,@Optional int port) {
 return com.caucho.quercus.lib.file.SocketModule.socket_connect (quercus_context,socket,address,port);
}
final public boolean socket_connect (@NotNull SocketInputOutput socket, StringValue address) {
 int port = 0;

 return com.caucho.quercus.lib.file.SocketModule.socket_connect (quercus_context,socket,address,port);
}


/* ./com/caucho/quercus/lib/file/SocketModule.java : socket_get_status */
final public Value socket_get_status (BinaryStream stream) {
 return com.caucho.quercus.lib.file.SocketModule.socket_get_status (quercus_context,stream);
}


/* ./com/caucho/quercus/lib/file/SocketModule.java : socket_read */
final public Value socket_read (@NotNull SocketInputOutput socket,int length,@Optional int type) {
 return com.caucho.quercus.lib.file.SocketModule.socket_read (quercus_context,socket,length,type);
}
final public Value socket_read (@NotNull SocketInputOutput socket, int length) {
 int type = 0;

 return com.caucho.quercus.lib.file.SocketModule.socket_read (quercus_context,socket,length,type);
}


/* ./com/caucho/quercus/lib/file/SocketModule.java : socket_set_timeout */
final public boolean socket_set_timeout (@NotNull Value stream,int seconds,@Optional("-1") int milliseconds) {
 return com.caucho.quercus.lib.file.SocketModule.socket_set_timeout (quercus_context,stream,seconds,milliseconds);
}
final public boolean socket_set_timeout (@NotNull Value stream, int seconds) {
 int milliseconds = -1;

 return com.caucho.quercus.lib.file.SocketModule.socket_set_timeout (quercus_context,stream,seconds,milliseconds);
}


/* ./com/caucho/quercus/lib/file/SocketModule.java : socket_write */
final public Value socket_write (@NotNull SocketInputOutput socket,@NotNull InputStream is,@Optional("-1") int length) {
 return com.caucho.quercus.lib.file.SocketModule.socket_write (quercus_context,socket,is,length);
}
final public Value socket_write (@NotNull SocketInputOutput socket, @NotNull InputStream is) {
 int length = -1;

 return com.caucho.quercus.lib.file.SocketModule.socket_write (quercus_context,socket,is,length);
}


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_bucket_append */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_bucket_make_writable */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_context_create */
final public Value stream_context_create (@Optional ArrayValue options) {
 return com.caucho.quercus.lib.file.StreamModule.stream_context_create (quercus_context,options);
}
final public Value stream_context_create () {
 ArrayValue options = null;

 return com.caucho.quercus.lib.file.StreamModule.stream_context_create (quercus_context,options);
}


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_context_get_options */
final public Value stream_context_get_options (Value resource) {
 return com.caucho.quercus.lib.file.StreamModule.stream_context_get_options (quercus_context,resource);
}


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_context_get_default */
final public Value stream_context_get_default (@Optional ArrayValue options) {
 return com.caucho.quercus.lib.file.StreamModule.stream_context_get_default (quercus_context,options);
}
final public Value stream_context_get_default () {
 ArrayValue options = null;

 return com.caucho.quercus.lib.file.StreamModule.stream_context_get_default (quercus_context,options);
}


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_context_set_option */
final public boolean stream_context_set_option (Value resource,StringValue wrapper,StringValue option,Value value) {
 return com.caucho.quercus.lib.file.StreamModule.stream_context_set_option (quercus_context,resource,wrapper,option,value);
}


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_context_set_params */
final public boolean stream_context_set_params (Value resource,ArrayValue value) {
 return com.caucho.quercus.lib.file.StreamModule.stream_context_set_params (quercus_context,resource,value);
}


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_copy_to_stream */
final public long stream_copy_to_stream (@NotNull BinaryInput in,@NotNull BinaryOutput out,@Optional("-1") int length,@Optional int offset) {
 return com.caucho.quercus.lib.file.StreamModule.stream_copy_to_stream (quercus_context,in,out,length,offset);
}
final public long stream_copy_to_stream (@NotNull BinaryInput in, @NotNull BinaryOutput out) {
 int length = -1;
int offset = 0;

 return com.caucho.quercus.lib.file.StreamModule.stream_copy_to_stream (quercus_context,in,out,length,offset);
}


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_get_contents */
final public Value stream_get_contents (@NotNull BinaryInput in,@Optional("-1") long maxLen,@Optional long offset) {
 return com.caucho.quercus.lib.file.StreamModule.stream_get_contents (quercus_context,in,maxLen,offset);
}
final public Value stream_get_contents (@NotNull BinaryInput in) {
 long maxLen = -1l;
long offset = 0;

 return com.caucho.quercus.lib.file.StreamModule.stream_get_contents (quercus_context,in,maxLen,offset);
}


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_get_line */
final public Value stream_get_line (@NotNull BinaryInput file,@Optional("-1") long length) {
 return com.caucho.quercus.lib.file.StreamModule.stream_get_line (quercus_context,file,length);
}
final public Value stream_get_line (@NotNull BinaryInput file) {
 long length = -1l;

 return com.caucho.quercus.lib.file.StreamModule.stream_get_line (quercus_context,file,length);
}


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_get_meta_data */
final public Value stream_get_meta_data (BinaryStream stream) {
 return com.caucho.quercus.lib.file.StreamModule.stream_get_meta_data (quercus_context,stream);
}


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_get_transports */
final public Value stream_get_transports () {
 return com.caucho.quercus.lib.file.StreamModule.stream_get_transports (quercus_context);
}


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_get_wrappers */
final public Value stream_get_wrappers () {
 return com.caucho.quercus.lib.file.StreamModule.stream_get_wrappers (quercus_context);
}


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_register_wrapper */
final public boolean stream_register_wrapper (StringValue protocol,String className) {
 return com.caucho.quercus.lib.file.StreamModule.stream_register_wrapper (quercus_context,protocol,className);
}


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_set_blocking */
final public boolean stream_set_blocking (@NotNull Value stream,int mode) {
 return com.caucho.quercus.lib.file.StreamModule.stream_set_blocking (quercus_context,stream,mode);
}


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_set_timeout */
final public boolean stream_set_timeout (@NotNull Value stream,int seconds,@Optional("-1") int microseconds) {
 return com.caucho.quercus.lib.file.StreamModule.stream_set_timeout (quercus_context,stream,seconds,microseconds);
}
final public boolean stream_set_timeout (@NotNull Value stream, int seconds) {
 int microseconds = -1;

 return com.caucho.quercus.lib.file.StreamModule.stream_set_timeout (quercus_context,stream,seconds,microseconds);
}


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_set_write_buffer */
final public int stream_set_write_buffer (BinaryOutput stream,int bufferSize) {
 return com.caucho.quercus.lib.file.StreamModule.stream_set_write_buffer (quercus_context,stream,bufferSize);
}


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_socket_client */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_wrapper_register */
final public void stream_wrapper_register (StringValue protocol,ProtocolWrapper wrapper) {
  com.caucho.quercus.lib.file.StreamModule.stream_wrapper_register (protocol,wrapper);
}


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_wrapper_register */
final public boolean stream_wrapper_register (StringValue protocol,String className) {
 return com.caucho.quercus.lib.file.StreamModule.stream_wrapper_register (quercus_context,protocol,className);
}


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_wrapper_restore */
final public boolean stream_wrapper_restore (StringValue protocol) {
 return com.caucho.quercus.lib.file.StreamModule.stream_wrapper_restore (quercus_context,protocol);
}


/* ./com/caucho/quercus/lib/file/StreamModule.java : stream_wrapper_unregister */
final public boolean stream_wrapper_unregister (StringValue protocol) {
 return com.caucho.quercus.lib.file.StreamModule.stream_wrapper_unregister (quercus_context,protocol);
}


/* ./com/caucho/quercus/lib/FunctionModule.java : call_user_func */
final public Value call_user_func (Callable function, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.FunctionModule.call_user_func (quercus_context,function,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/FunctionModule.java : call_user_func_array */
final public Value call_user_func_array (Callable function,Value arg) {
 return com.caucho.quercus.lib.FunctionModule.call_user_func_array (quercus_context,function,arg);
}


/* ./com/caucho/quercus/lib/FunctionModule.java : create_function */
final public Value create_function (String args,String code) {
 return com.caucho.quercus.lib.FunctionModule.create_function (quercus_context,args,code);
}


/* ./com/caucho/quercus/lib/FunctionModule.java : func_get_arg */
final public Value func_get_arg (int index) {
 return com.caucho.quercus.lib.FunctionModule.func_get_arg (quercus_context,index);
}


/* ./com/caucho/quercus/lib/FunctionModule.java : func_get_args */
final public Value func_get_args () {
 return com.caucho.quercus.lib.FunctionModule.func_get_args (quercus_context);
}


/* ./com/caucho/quercus/lib/FunctionModule.java : func_num_args */
final public Value func_num_args () {
 return com.caucho.quercus.lib.FunctionModule.func_num_args (quercus_context);
}


/* ./com/caucho/quercus/lib/FunctionModule.java : function_exists */
final public boolean function_exists (String name) {
 return com.caucho.quercus.lib.FunctionModule.function_exists (quercus_context,name);
}


/* ./com/caucho/quercus/lib/FunctionModule.java : get_defined_functions */
final public Value get_defined_functions () {
 return com.caucho.quercus.lib.FunctionModule.get_defined_functions (quercus_context);
}


/* ./com/caucho/quercus/lib/FunctionModule.java : register_shutdown_function */
final public Value register_shutdown_function (Callable fun, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.FunctionModule.register_shutdown_function (quercus_context,fun,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/gettext/expr/PluralExpr.java : getPluralExpr */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/gettext/expr/PluralExpr.java : eval */
final public int eval (CharSequence expr,int quantity) {
 return com.caucho.quercus.lib.gettext.expr.PluralExpr.eval (expr,quantity);
}


/* ./com/caucho/quercus/lib/HashModule.java : hash_algos */
final public Value hash_algos () {
 return com.caucho.quercus.lib.HashModule.hash_algos (quercus_context);
}


/* ./com/caucho/quercus/lib/HtmlModule.java : htmlspecialchars_decode */
final public StringValue htmlspecialchars_decode (StringValue str,@Optional("ENT_COMPAT") int quoteStyle) {
 return com.caucho.quercus.lib.HtmlModule.htmlspecialchars_decode (quercus_context,str,quoteStyle);
}
final public StringValue htmlspecialchars_decode (StringValue str) {
 int quoteStyle = 0;

 return com.caucho.quercus.lib.HtmlModule.htmlspecialchars_decode (quercus_context,str,quoteStyle);
}


/* ./com/caucho/quercus/lib/HtmlModule.java : htmlspecialchars */
final public Value htmlspecialchars (StringValue string,@Optional("ENT_COMPAT") int quoteStyle,@Optional String charset) {
 return com.caucho.quercus.lib.HtmlModule.htmlspecialchars (quercus_context,string,quoteStyle,charset);
}
final public Value htmlspecialchars (StringValue string) {
 int quoteStyle = 0;
String charset = null;

 return com.caucho.quercus.lib.HtmlModule.htmlspecialchars (quercus_context,string,quoteStyle,charset);
}


/* ./com/caucho/quercus/lib/HtmlModule.java : htmlentities */
final public Value htmlentities (StringValue string,@Optional("ENT_COMPAT") int quoteStyle,@Optional String charset) {
 return com.caucho.quercus.lib.HtmlModule.htmlentities (quercus_context,string,quoteStyle,charset);
}
final public Value htmlentities (StringValue string) {
 int quoteStyle = 0;
String charset = null;

 return com.caucho.quercus.lib.HtmlModule.htmlentities (quercus_context,string,quoteStyle,charset);
}


/* ./com/caucho/quercus/lib/HtmlModule.java : html_entity_decode */
final public StringValue html_entity_decode (StringValue string,@Optional int quoteStyle,@Optional String charset) {
 return com.caucho.quercus.lib.HtmlModule.html_entity_decode (quercus_context,string,quoteStyle,charset);
}
final public StringValue html_entity_decode (StringValue string) {
 int quoteStyle = 0;
String charset = null;

 return com.caucho.quercus.lib.HtmlModule.html_entity_decode (quercus_context,string,quoteStyle,charset);
}


/* ./com/caucho/quercus/lib/HtmlModule.java : nl2br */
final public Value nl2br (StringValue string) {
 return com.caucho.quercus.lib.HtmlModule.nl2br (quercus_context,string);
}


/* ./com/caucho/quercus/lib/HttpModule.java : header */
final public Value header (StringValue headerStr,@Optional("true") boolean replace,@Optional long httpResponseCode) {
 return com.caucho.quercus.lib.HttpModule.header (quercus_context,headerStr,replace,httpResponseCode);
}
final public Value header (StringValue headerStr) {
 boolean replace = false;
long httpResponseCode = 0;

 return com.caucho.quercus.lib.HttpModule.header (quercus_context,headerStr,replace,httpResponseCode);
}


/* ./com/caucho/quercus/lib/HttpModule.java : headers_list */
final public ArrayValue headers_list () {
 return com.caucho.quercus.lib.HttpModule.headers_list (quercus_context);
}


/* ./com/caucho/quercus/lib/HttpModule.java : headers_sent */
final public boolean headers_sent (@Optional Value file,@Optional Value line) {
 return com.caucho.quercus.lib.HttpModule.headers_sent (quercus_context,file,line);
}
final public boolean headers_sent () {
 Value file = null;
Value line = null;

 return com.caucho.quercus.lib.HttpModule.headers_sent (quercus_context,file,line);
}


/* ./com/caucho/quercus/lib/HttpModule.java : setcookie */
final public boolean setcookie (String name,@Optional String value,@Optional long expire,@Optional String path,@Optional String domain,@Optional boolean secure,@Optional boolean httpOnly) {
 return com.caucho.quercus.lib.HttpModule.setcookie (quercus_context,name,value,expire,path,domain,secure,httpOnly);
}
final public boolean setcookie (String name) {
 String value = null;
long expire = 0;
String path = null;
String domain = null;
boolean secure = false;
boolean httpOnly = false;

 return com.caucho.quercus.lib.HttpModule.setcookie (quercus_context,name,value,expire,path,domain,secure,httpOnly);
}


/* ./com/caucho/quercus/lib/i18n/Decoder.java : create */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/i18n/Encoder.java : create */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/i18n/IconvUtility.java : decodeEncode */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/i18n/IconvUtility.java : decodeEncode */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/i18n/IconvUtility.java : decodeEncode */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/i18n/IconvUtility.java : decodeMime */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/i18n/IconvUtility.java : encodeMime */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/i18n/IconvUtility.java : encodeMime */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/i18n/IconvUtility.java : encodeMimeWord */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_convert_case */
final public StringValue mb_convert_case (StringValue str,int mode,@Optional("") String encoding) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_convert_case (quercus_context,str,mode,encoding);
}
final public StringValue mb_convert_case (StringValue str, int mode) {
 String encoding = "";

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_convert_case (quercus_context,str,mode,encoding);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_convert_encoding */
final public Value mb_convert_encoding (StringValue str,String destEncoding,@Optional Value fromEncodings) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_convert_encoding (quercus_context,str,destEncoding,fromEncodings);
}
final public Value mb_convert_encoding (StringValue str, String destEncoding) {
 Value fromEncodings = null;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_convert_encoding (quercus_context,str,destEncoding,fromEncodings);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_convert_kana */
final public StringValue mb_convert_kana (StringValue str,@Optional("") String option,@Optional("") String encoding) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_convert_kana (quercus_context,str,option,encoding);
}
final public StringValue mb_convert_kana (StringValue str) {
 String option = "";
String encoding = "";

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_convert_kana (quercus_context,str,option,encoding);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_convert_variables */
final public StringValue mb_convert_variables (String toEncoding,String fromEncodings,Value vars) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_convert_variables (quercus_context,toEncoding,fromEncodings,vars);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_decode_mimeheader */
final public Value mb_decode_mimeheader (StringValue str) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_decode_mimeheader (quercus_context,str);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_decode_numericentity */
final public StringValue mb_decode_numericentity (StringValue str,ArrayValue convmap,@Optional String encoding) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_decode_numericentity (quercus_context,str,convmap,encoding);
}
final public StringValue mb_decode_numericentity (StringValue str, ArrayValue convmap) {
 String encoding = null;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_decode_numericentity (quercus_context,str,convmap,encoding);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_detect_encoding */
final public Value mb_detect_encoding (StringValue str,@Optional Value encodingV,@Optional boolean isStrict) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_detect_encoding (quercus_context,str,encodingV,isStrict);
}
final public Value mb_detect_encoding (StringValue str) {
 Value encodingV = null;
boolean isStrict = false;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_detect_encoding (quercus_context,str,encodingV,isStrict);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_detect_order */
final public Value mb_detect_order (@Optional Value encodingV) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_detect_order (quercus_context,encodingV);
}
final public Value mb_detect_order () {
 Value encodingV = null;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_detect_order (quercus_context,encodingV);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_encode_mimeheader */
final public StringValue mb_encode_mimeheader (StringValue str,@Optional("") String charset,@Optional("B") String transfer_encoding,@Optional("") String linefeed) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_encode_mimeheader (quercus_context,str,charset,transfer_encoding,linefeed);
}
final public StringValue mb_encode_mimeheader (StringValue str) {
 String charset = "";
String transfer_encoding = null;
String linefeed = "";

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_encode_mimeheader (quercus_context,str,charset,transfer_encoding,linefeed);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_encode_numericentity */
final public StringValue mb_encode_numericentity (StringValue str,ArrayValue convmap,@Optional String encoding) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_encode_numericentity (quercus_context,str,convmap,encoding);
}
final public StringValue mb_encode_numericentity (StringValue str, ArrayValue convmap) {
 String encoding = null;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_encode_numericentity (quercus_context,str,convmap,encoding);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_ereg_match */
final public BooleanValue mb_ereg_match (UnicodeEreg ereg,StringValue string,@Optional String option) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_ereg_match (quercus_context,ereg,string,option);
}
final public BooleanValue mb_ereg_match (UnicodeEreg ereg, StringValue string) {
 String option = null;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_ereg_match (quercus_context,ereg,string,option);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_ereg_replace */
final public Value mb_ereg_replace (Value eregValue,StringValue replacement,StringValue subject,@Optional String option) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_ereg_replace (quercus_context,eregValue,replacement,subject,option);
}
final public Value mb_ereg_replace (Value eregValue, StringValue replacement, StringValue subject) {
 String option = null;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_ereg_replace (quercus_context,eregValue,replacement,subject,option);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_ereg */
final public Value mb_ereg (UnicodeEreg ereg,StringValue string,@Optional ArrayValue regs) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_ereg (quercus_context,ereg,string,regs);
}
final public Value mb_ereg (UnicodeEreg ereg, StringValue string) {
 ArrayValue regs = null;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_ereg (quercus_context,ereg,string,regs);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_eregi_replace */
final public Value mb_eregi_replace (Value pattern,StringValue replacement,StringValue subject,@Optional String option) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_eregi_replace (quercus_context,pattern,replacement,subject,option);
}
final public Value mb_eregi_replace (Value pattern, StringValue replacement, StringValue subject) {
 String option = null;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_eregi_replace (quercus_context,pattern,replacement,subject,option);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_eregi */
final public Value mb_eregi (UnicodeEregi eregi,StringValue string,@Optional ArrayValue regs) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_eregi (quercus_context,eregi,string,regs);
}
final public Value mb_eregi (UnicodeEregi eregi, StringValue string) {
 ArrayValue regs = null;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_eregi (quercus_context,eregi,string,regs);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_ereg_search_getpos */
final public LongValue mb_ereg_search_getpos () {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_ereg_search_getpos (quercus_context);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_ereg_search_getregs */
final public Value mb_ereg_search_getregs () {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_ereg_search_getregs (quercus_context);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_ereg_search_init */
final public BooleanValue mb_ereg_search_init (StringValue string,@Optional Value rawRegexp,@Optional Value option) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_ereg_search_init (quercus_context,string,rawRegexp,option);
}
final public BooleanValue mb_ereg_search_init (StringValue string) {
 Value rawRegexp = null;
Value option = null;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_ereg_search_init (quercus_context,string,rawRegexp,option);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_ereg_search_pos */
final public Value mb_ereg_search_pos (@Optional Value rawRegexp,@Optional Value option) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_ereg_search_pos (quercus_context,rawRegexp,option);
}
final public Value mb_ereg_search_pos () {
 Value rawRegexp = null;
Value option = null;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_ereg_search_pos (quercus_context,rawRegexp,option);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_ereg_search_regs */
final public Value mb_ereg_search_regs (@Optional Value rawRegexp,@Optional Value option) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_ereg_search_regs (quercus_context,rawRegexp,option);
}
final public Value mb_ereg_search_regs () {
 Value rawRegexp = null;
Value option = null;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_ereg_search_regs (quercus_context,rawRegexp,option);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_ereg_search_setpos */
final public BooleanValue mb_ereg_search_setpos (int position) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_ereg_search_setpos (quercus_context,position);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_ereg_search */
final public BooleanValue mb_ereg_search (@Optional Value rawRegexp,@Optional Value option) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_ereg_search (quercus_context,rawRegexp,option);
}
final public BooleanValue mb_ereg_search () {
 Value rawRegexp = null;
Value option = null;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_ereg_search (quercus_context,rawRegexp,option);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_get_info */
final public Value mb_get_info (@Optional("") String type) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_get_info (quercus_context,type);
}
final public Value mb_get_info () {
 String type = "";

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_get_info (quercus_context,type);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_http_input */
final public Value mb_http_input (@Optional String type) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_http_input (quercus_context,type);
}
final public Value mb_http_input () {
 String type = null;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_http_input (quercus_context,type);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_http_output */
final public Value mb_http_output (@Optional String encoding) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_http_output (quercus_context,encoding);
}
final public Value mb_http_output () {
 String encoding = null;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_http_output (quercus_context,encoding);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_internal_encoding */
final public Value mb_internal_encoding (@Optional String encoding) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_internal_encoding (quercus_context,encoding);
}
final public Value mb_internal_encoding () {
 String encoding = null;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_internal_encoding (quercus_context,encoding);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_language */
final public Value mb_language (@Optional String language) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_language (quercus_context,language);
}
final public Value mb_language () {
 String language = null;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_language (quercus_context,language);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_list_encodings */
final public ArrayValue mb_list_encodings () {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_list_encodings (quercus_context);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_output_handler */
final public StringValue mb_output_handler (StringValue contents,int status) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_output_handler (quercus_context,contents,status);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_parse_str */
final public BooleanValue mb_parse_str (StringValue strValue,@Optional Value result) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_parse_str (quercus_context,strValue,result);
}
final public BooleanValue mb_parse_str (StringValue strValue) {
 Value result = null;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_parse_str (quercus_context,strValue,result);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_preferred_mime_name */
final public StringValue mb_preferred_mime_name (StringValue encoding) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_preferred_mime_name (quercus_context,encoding);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_regex_encoding */
final public Value mb_regex_encoding (@Optional("") String encoding) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_regex_encoding (quercus_context,encoding);
}
final public Value mb_regex_encoding () {
 String encoding = "";

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_regex_encoding (quercus_context,encoding);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_regex_set_options */
final public StringValue mb_regex_set_options (@Optional String options) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_regex_set_options (quercus_context,options);
}
final public StringValue mb_regex_set_options () {
 String options = null;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_regex_set_options (quercus_context,options);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_send_mail */
final public BooleanValue mb_send_mail (StringValue to,StringValue subject,StringValue message,@Optional StringValue additionalHeaders,@Optional StringValue additionalParameters) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_send_mail (quercus_context,to,subject,message,additionalHeaders,additionalParameters);
}
final public BooleanValue mb_send_mail (StringValue to, StringValue subject, StringValue message) {
 StringValue additionalHeaders = new ConstStringValue("");
StringValue additionalParameters = new ConstStringValue("");

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_send_mail (quercus_context,to,subject,message,additionalHeaders,additionalParameters);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_split */
final public Value mb_split (UnicodeEreg ereg,StringValue string,@Optional("-1") long limit) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_split (quercus_context,ereg,string,limit);
}
final public Value mb_split (UnicodeEreg ereg, StringValue string) {
 long limit = -1l;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_split (quercus_context,ereg,string,limit);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_strcut */
final public StringValue mb_strcut (final StringValue str,int start,@Optional("7fffffff") int length,@Optional String encoding) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_strcut (quercus_context,str,start,length,encoding);
}
final public StringValue mb_strcut (final StringValue str, int start) {
 int length = 0;
String encoding = null;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_strcut (quercus_context,str,start,length,encoding);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_strimwidth */
final public StringValue mb_strimwidth (final StringValue str,int start,int width,@Optional() StringValue trimmarker,@Optional("") String encoding) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_strimwidth (quercus_context,str,start,width,trimmarker,encoding);
}
final public StringValue mb_strimwidth (final StringValue str, int start, int width) {
 StringValue trimmarker = new ConstStringValue("");
String encoding = "";

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_strimwidth (quercus_context,str,start,width,trimmarker,encoding);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_strlen */
final public LongValue mb_strlen (StringValue str,@Optional("") String encoding) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_strlen (quercus_context,str,encoding);
}
final public LongValue mb_strlen (StringValue str) {
 String encoding = "";

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_strlen (quercus_context,str,encoding);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_strpos */
final public Value mb_strpos (StringValue haystack,StringValue needle,@Optional("0") int offset,@Optional("") String encoding) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_strpos (quercus_context,haystack,needle,offset,encoding);
}
final public Value mb_strpos (StringValue haystack, StringValue needle) {
 int offset = 0;
String encoding = "";

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_strpos (quercus_context,haystack,needle,offset,encoding);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_strrpos */
final public Value mb_strrpos (StringValue haystack,StringValue needle,@Optional Value offsetV,@Optional("") String encoding) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_strrpos (quercus_context,haystack,needle,offsetV,encoding);
}
final public Value mb_strrpos (StringValue haystack, StringValue needle) {
 Value offsetV = null;
String encoding = "";

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_strrpos (quercus_context,haystack,needle,offsetV,encoding);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_strtolower */
final public StringValue mb_strtolower (StringValue str,@Optional("") String encoding) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_strtolower (quercus_context,str,encoding);
}
final public StringValue mb_strtolower (StringValue str) {
 String encoding = "";

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_strtolower (quercus_context,str,encoding);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_strtoupper */
final public StringValue mb_strtoupper (StringValue str,@Optional("") String encoding) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_strtoupper (quercus_context,str,encoding);
}
final public StringValue mb_strtoupper (StringValue str) {
 String encoding = "";

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_strtoupper (quercus_context,str,encoding);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_strwidth */
final public LongValue mb_strwidth (StringValue str,@Optional("") String encoding) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_strwidth (quercus_context,str,encoding);
}
final public LongValue mb_strwidth (StringValue str) {
 String encoding = "";

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_strwidth (quercus_context,str,encoding);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_substitute_character */
final public Value mb_substitute_character (Value substrchar) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_substitute_character (substrchar);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_substr_count */
final public LongValue mb_substr_count (StringValue haystack,StringValue needle,@Optional("") String encoding) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_substr_count (quercus_context,haystack,needle,encoding);
}
final public LongValue mb_substr_count (StringValue haystack, StringValue needle) {
 String encoding = "";

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_substr_count (quercus_context,haystack,needle,encoding);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : mb_substr */
final public StringValue mb_substr (StringValue str,int start,@Optional Value lengthV,@Optional String encoding) {
 return com.caucho.quercus.lib.i18n.MbstringModule.mb_substr (quercus_context,str,start,lengthV,encoding);
}
final public StringValue mb_substr (StringValue str, int start) {
 Value lengthV = null;
String encoding = null;

 return com.caucho.quercus.lib.i18n.MbstringModule.mb_substr (quercus_context,str,start,lengthV,encoding);
}


/* ./com/caucho/quercus/lib/i18n/MbstringModule.java : getEncoding */
final public String getEncoding () {
 return com.caucho.quercus.lib.i18n.MbstringModule.getEncoding (quercus_context);
}


/* ./com/caucho/quercus/lib/i18n/QuercusMimeUtility.java : decodeMimeHeaders */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/i18n/QuercusMimeUtility.java : decodeMime */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/i18n/QuercusMimeUtility.java : encodeMime */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/i18n/QuercusMimeUtility.java : encodeMime */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/i18n/QuercusMimeUtility.java : encodeMimeWord */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/i18n/UnicodeModule.java : unicode_semantics */
final public BooleanValue unicode_semantics () {
 return com.caucho.quercus.lib.i18n.UnicodeModule.unicode_semantics (quercus_context);
}


/* ./com/caucho/quercus/lib/i18n/UnicodeModule.java : unicode_decode */
final public Value unicode_decode (BinaryValue str,String encoding,@Optional int errorMode) {
 return com.caucho.quercus.lib.i18n.UnicodeModule.unicode_decode (quercus_context,str,encoding,errorMode);
}
final public Value unicode_decode (BinaryValue str, String encoding) {
 int errorMode = 0;

 return com.caucho.quercus.lib.i18n.UnicodeModule.unicode_decode (quercus_context,str,encoding,errorMode);
}


/* ./com/caucho/quercus/lib/i18n/UnicodeModule.java : unicode_encode */
final public Value unicode_encode (UnicodeValue str,String encoding,@Optional int errorMode) {
 return com.caucho.quercus.lib.i18n.UnicodeModule.unicode_encode (quercus_context,str,encoding,errorMode);
}
final public Value unicode_encode (UnicodeValue str, String encoding) {
 int errorMode = 0;

 return com.caucho.quercus.lib.i18n.UnicodeModule.unicode_encode (quercus_context,str,encoding,errorMode);
}


/* ./com/caucho/quercus/lib/i18n/UnicodeModule.java : iconv_strpos */
final public Value iconv_strpos (StringValue haystack,StringValue needle,@Optional("0") int offset,@Optional("") String charset) {
 return com.caucho.quercus.lib.i18n.UnicodeModule.iconv_strpos (quercus_context,haystack,needle,offset,charset);
}
final public Value iconv_strpos (StringValue haystack, StringValue needle) {
 int offset = 0;
String charset = "";

 return com.caucho.quercus.lib.i18n.UnicodeModule.iconv_strpos (quercus_context,haystack,needle,offset,charset);
}


/* ./com/caucho/quercus/lib/i18n/UnicodeModule.java : iconv_strrpos */
final public Value iconv_strrpos (StringValue haystack,StringValue needle,@Optional("") String charset) {
 return com.caucho.quercus.lib.i18n.UnicodeModule.iconv_strrpos (quercus_context,haystack,needle,charset);
}
final public Value iconv_strrpos (StringValue haystack, StringValue needle) {
 String charset = "";

 return com.caucho.quercus.lib.i18n.UnicodeModule.iconv_strrpos (quercus_context,haystack,needle,charset);
}


/* ./com/caucho/quercus/lib/i18n/UnicodeModule.java : iconv_substr */
final public Value iconv_substr (StringValue str,int offset,@Optional("0x7fffffff") int length,@Optional("") String charset) {
 return com.caucho.quercus.lib.i18n.UnicodeModule.iconv_substr (quercus_context,str,offset,length,charset);
}
final public Value iconv_substr (StringValue str, int offset) {
 int length = 0;
String charset = "";

 return com.caucho.quercus.lib.i18n.UnicodeModule.iconv_substr (quercus_context,str,offset,length,charset);
}


/* ./com/caucho/quercus/lib/i18n/UnicodeModule.java : iconv */
final public Value iconv (String inCharset,String outCharset,StringValue str) {
 return com.caucho.quercus.lib.i18n.UnicodeModule.iconv (quercus_context,inCharset,outCharset,str);
}


/* ./com/caucho/quercus/lib/i18n/UnicodeModule.java : ob_iconv_handler */
final public StringValue ob_iconv_handler (StringValue contents,int status) {
 return com.caucho.quercus.lib.i18n.UnicodeModule.ob_iconv_handler (contents,status);
}


/* ./com/caucho/quercus/lib/i18n/UnicodeModule.java : iconv_get_encoding */
final public Value iconv_get_encoding (@Optional("all") String type) {
 return com.caucho.quercus.lib.i18n.UnicodeModule.iconv_get_encoding (quercus_context,type);
}
final public Value iconv_get_encoding () {
 String type = null;

 return com.caucho.quercus.lib.i18n.UnicodeModule.iconv_get_encoding (quercus_context,type);
}


/* ./com/caucho/quercus/lib/i18n/UnicodeModule.java : iconv_set_encoding */
final public BooleanValue iconv_set_encoding (String type,StringValue charset) {
 return com.caucho.quercus.lib.i18n.UnicodeModule.iconv_set_encoding (quercus_context,type,charset);
}


/* ./com/caucho/quercus/lib/i18n/UnicodeModule.java : iconv_strlen */
final public Value iconv_strlen (StringValue str,@Optional("") String charset) {
 return com.caucho.quercus.lib.i18n.UnicodeModule.iconv_strlen (quercus_context,str,charset);
}
final public Value iconv_strlen (StringValue str) {
 String charset = "";

 return com.caucho.quercus.lib.i18n.UnicodeModule.iconv_strlen (quercus_context,str,charset);
}


/* ./com/caucho/quercus/lib/i18n/UnicodeModule.java : iconv_mime_encode */
final public Value iconv_mime_encode (StringValue fieldName,StringValue fieldValue,@Optional() ArrayValue preferences) {
 return com.caucho.quercus.lib.i18n.UnicodeModule.iconv_mime_encode (quercus_context,fieldName,fieldValue,preferences);
}
final public Value iconv_mime_encode (StringValue fieldName, StringValue fieldValue) {
 ArrayValue preferences = null;

 return com.caucho.quercus.lib.i18n.UnicodeModule.iconv_mime_encode (quercus_context,fieldName,fieldValue,preferences);
}


/* ./com/caucho/quercus/lib/i18n/UnicodeModule.java : iconv_mime_decode_headers */
final public Value iconv_mime_decode_headers (StringValue encoded_headers,@Optional() int mode,@Optional() String charset) {
 return com.caucho.quercus.lib.i18n.UnicodeModule.iconv_mime_decode_headers (quercus_context,encoded_headers,mode,charset);
}
final public Value iconv_mime_decode_headers (StringValue encoded_headers) {
 int mode = 0;
String charset = null;

 return com.caucho.quercus.lib.i18n.UnicodeModule.iconv_mime_decode_headers (quercus_context,encoded_headers,mode,charset);
}


/* ./com/caucho/quercus/lib/i18n/UnicodeModule.java : iconv_mime_decode */
final public Value iconv_mime_decode (StringValue encodedHeader,@Optional("1") int mode,@Optional("") String charset) {
 return com.caucho.quercus.lib.i18n.UnicodeModule.iconv_mime_decode (quercus_context,encodedHeader,mode,charset);
}
final public Value iconv_mime_decode (StringValue encodedHeader) {
 int mode = 1;
String charset = "";

 return com.caucho.quercus.lib.i18n.UnicodeModule.iconv_mime_decode (quercus_context,encodedHeader,mode,charset);
}


/* ./com/caucho/quercus/lib/i18n/UnicodeUtility.java : utf8Clean */
final public StringValue utf8Clean (StringValue str,String replacement,boolean isIgnore) {
 return com.caucho.quercus.lib.i18n.UnicodeUtility.utf8Clean (quercus_context,str,replacement,isIgnore);
}


/* ./com/caucho/quercus/lib/i18n/UnicodeUtility.java : decode */
final public CharSequence decode (StringValue str,String charset) {
 return com.caucho.quercus.lib.i18n.UnicodeUtility.decode (quercus_context,str,charset);
}


/* ./com/caucho/quercus/lib/i18n/UnicodeUtility.java : decode */
final public CharSequence decode (StringValue str,String charset,String replacement,boolean isIgnoreErrors) {
 return com.caucho.quercus.lib.i18n.UnicodeUtility.decode (quercus_context,str,charset,replacement,isIgnoreErrors);
}


/* ./com/caucho/quercus/lib/i18n/UnicodeUtility.java : encode */
final public StringValue encode (CharSequence str,String charset) {
 return com.caucho.quercus.lib.i18n.UnicodeUtility.encode (quercus_context,str,charset);
}


/* ./com/caucho/quercus/lib/i18n/UnicodeUtility.java : encode */
final public StringValue encode (CharSequence str,String charset,String replacement,boolean isIgnoreErrors) {
 return com.caucho.quercus.lib.i18n.UnicodeUtility.encode (quercus_context,str,charset,replacement,isIgnoreErrors);
}


/* ./com/caucho/quercus/lib/i18n/UnicodeUtility.java : decodeEncode */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/ImageModule.java : gd_info */
final public Value gd_info () {
 return com.caucho.quercus.lib.ImageModule.gd_info ();
}


/* ./com/caucho/quercus/lib/ImageModule.java : image_type_to_extension */
final public Value image_type_to_extension (int imageType,boolean dot) {
 return com.caucho.quercus.lib.ImageModule.image_type_to_extension (imageType,dot);
}


/* ./com/caucho/quercus/lib/ImageModule.java : image_type_to_mime_type */
final public Value image_type_to_mime_type (int imageType) {
 return com.caucho.quercus.lib.ImageModule.image_type_to_mime_type (imageType);
}


/* ./com/caucho/quercus/lib/ImageModule.java : image_get_transform */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/ImageModule.java : image_set_transform */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/ImageModule.java : imagealphablending */
final public boolean imagealphablending (QuercusImage image,boolean useAlphaBlending) {
 return com.caucho.quercus.lib.ImageModule.imagealphablending (image,useAlphaBlending);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imageantialias */
final public boolean imageantialias (QuercusImage image,boolean useAntiAliasing) {
 return com.caucho.quercus.lib.ImageModule.imageantialias (image,useAntiAliasing);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagearc */
final public boolean imagearc (QuercusImage image,double cx,double cy,double width,double height,double start,double end,int color) {
 return com.caucho.quercus.lib.ImageModule.imagearc (image,cx,cy,width,height,start,end,color);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagechar */
final public boolean imagechar (QuercusImage image,int font,int x,int y,String c,int color) {
 return com.caucho.quercus.lib.ImageModule.imagechar (image,font,x,y,c,color);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecharup */
final public boolean imagecharup (QuercusImage image,int font,int x,int y,String c,int color) {
 return com.caucho.quercus.lib.ImageModule.imagecharup (image,font,x,y,c,color);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecolorallocate */
final public long imagecolorallocate (QuercusImage image,int r,int g,int b) {
 return com.caucho.quercus.lib.ImageModule.imagecolorallocate (image,r,g,b);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecolorallocatealpha */
final public long imagecolorallocatealpha (QuercusImage image,int r,int g,int b,int a) {
 return com.caucho.quercus.lib.ImageModule.imagecolorallocatealpha (image,r,g,b,a);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecolorat */
final public long imagecolorat (QuercusImage image,int x,int y) {
 return com.caucho.quercus.lib.ImageModule.imagecolorat (image,x,y);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecolorclosest */
final public long imagecolorclosest (QuercusImage image,int r,int g,int b) {
 return com.caucho.quercus.lib.ImageModule.imagecolorclosest (image,r,g,b);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecolorclosestalpha */
final public long imagecolorclosestalpha (QuercusImage image,int r,int g,int b,int a) {
 return com.caucho.quercus.lib.ImageModule.imagecolorclosestalpha (image,r,g,b,a);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecolorclosesthwb */
final public long imagecolorclosesthwb (QuercusImage image,int r,int g,int b) {
 return com.caucho.quercus.lib.ImageModule.imagecolorclosesthwb (image,r,g,b);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecolordeallocate */
final public boolean imagecolordeallocate (QuercusImage image,int rgb) {
 return com.caucho.quercus.lib.ImageModule.imagecolordeallocate (image,rgb);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecolorexact */
final public long imagecolorexact (QuercusImage image,int r,int g,int b) {
 return com.caucho.quercus.lib.ImageModule.imagecolorexact (image,r,g,b);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecolorexactalpha */
final public long imagecolorexactalpha (QuercusImage image,int r,int g,int b,int a) {
 return com.caucho.quercus.lib.ImageModule.imagecolorexactalpha (image,r,g,b,a);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecolormatch */
final public boolean imagecolormatch (QuercusImage image1,QuercusImage image2) {
 return com.caucho.quercus.lib.ImageModule.imagecolormatch (image1,image2);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecolorresolve */
final public long imagecolorresolve (QuercusImage image,int r,int g,int b) {
 return com.caucho.quercus.lib.ImageModule.imagecolorresolve (image,r,g,b);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecolorresolvealpha */
final public long imagecolorresolvealpha (QuercusImage image,int r,int g,int b,int a) {
 return com.caucho.quercus.lib.ImageModule.imagecolorresolvealpha (image,r,g,b,a);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecolorset */
final public boolean imagecolorset (QuercusImage image,int index,int r,int g,int b) {
 return com.caucho.quercus.lib.ImageModule.imagecolorset (image,index,r,g,b);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecolorsforindex */
final public ArrayValue imagecolorsforindex (QuercusImage image,int argb) {
 return com.caucho.quercus.lib.ImageModule.imagecolorsforindex (image,argb);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecolorstotal */
final public Value imagecolorstotal () {
 return com.caucho.quercus.lib.ImageModule.imagecolorstotal ();
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecolortransparent */
final public long imagecolortransparent (QuercusImage image,@Optional int color) {
 return com.caucho.quercus.lib.ImageModule.imagecolortransparent (image,color);
}
final public long imagecolortransparent (QuercusImage image) {
 int color = 0;

 return com.caucho.quercus.lib.ImageModule.imagecolortransparent (image,color);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imageconvolution */
final public boolean imageconvolution (QuercusImage image,ArrayValue matrix,double div,double offset) {
 return com.caucho.quercus.lib.ImageModule.imageconvolution (image,matrix,div,offset);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecopy */
final public boolean imagecopy (QuercusImage dest,QuercusImage src,int dx,int dy,int sx,int sy,int w,int h) {
 return com.caucho.quercus.lib.ImageModule.imagecopy (dest,src,dx,dy,sx,sy,w,h);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecopymerge */
final public boolean imagecopymerge (QuercusImage dest,QuercusImage src,int dx,int dy,int sx,int sy,int w,int h,int pct) {
 return com.caucho.quercus.lib.ImageModule.imagecopymerge (dest,src,dx,dy,sx,sy,w,h,pct);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecopymergegray */
final public boolean imagecopymergegray (QuercusImage dest,QuercusImage src,int dx,int dy,int sx,int sy,int w,int h,int pct) {
 return com.caucho.quercus.lib.ImageModule.imagecopymergegray (dest,src,dx,dy,sx,sy,w,h,pct);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecopyresampled */
final public boolean imagecopyresampled (QuercusImage dest,QuercusImage src,int dx,int dy,int sx,int sy,int dw,int dh,int sw,int sh) {
 return com.caucho.quercus.lib.ImageModule.imagecopyresampled (dest,src,dx,dy,sx,sy,dw,dh,sw,sh);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecopyresized */
final public boolean imagecopyresized (QuercusImage dest,QuercusImage src,int dx,int dy,int sx,int sy,int dw,int dh,int sw,int sh) {
 return com.caucho.quercus.lib.ImageModule.imagecopyresized (dest,src,dx,dy,sx,sy,dw,dh,sw,sh);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecreate */
final public Value imagecreate (int width,int height) {
 return com.caucho.quercus.lib.ImageModule.imagecreate (width,height);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecreatefromgd2 */
final public void imagecreatefromgd2 (Path file) {
  com.caucho.quercus.lib.ImageModule.imagecreatefromgd2 (file);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecreatefromgd2part */
final public void imagecreatefromgd2part (Path file,int srcX,int srcY,int width,int height) {
  com.caucho.quercus.lib.ImageModule.imagecreatefromgd2part (file,srcX,srcY,width,height);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecreatefromgd */
final public void imagecreatefromgd (Path file) {
  com.caucho.quercus.lib.ImageModule.imagecreatefromgd (file);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecreatefromgif */
final public QuercusImage imagecreatefromgif (Path filename) {
 return com.caucho.quercus.lib.ImageModule.imagecreatefromgif (quercus_context,filename);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecreatefromjpeg */
final public QuercusImage imagecreatefromjpeg (Path filename) {
 return com.caucho.quercus.lib.ImageModule.imagecreatefromjpeg (quercus_context,filename);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecreatefrompng */
final public QuercusImage imagecreatefrompng (Path filename) {
 return com.caucho.quercus.lib.ImageModule.imagecreatefrompng (quercus_context,filename);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecreatefromstring */
final public QuercusImage imagecreatefromstring (InputStream data) {
 return com.caucho.quercus.lib.ImageModule.imagecreatefromstring (quercus_context,data);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecreatefromwbmp */
final public QuercusImage imagecreatefromwbmp (Path filename) {
 return com.caucho.quercus.lib.ImageModule.imagecreatefromwbmp (quercus_context,filename);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecreatefromxbm */
final public Value imagecreatefromxbm (Path filename) {
 return com.caucho.quercus.lib.ImageModule.imagecreatefromxbm (quercus_context,filename);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecreatefromxpm */
final public QuercusImage imagecreatefromxpm (Path filename) {
 return com.caucho.quercus.lib.ImageModule.imagecreatefromxpm (quercus_context,filename);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagecreatetruecolor */
final public Value imagecreatetruecolor (int width,int height) {
 return com.caucho.quercus.lib.ImageModule.imagecreatetruecolor (width,height);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagedashedline */
final public boolean imagedashedline (QuercusImage image,int x1,int y1,int x2,int y2,int color) {
 return com.caucho.quercus.lib.ImageModule.imagedashedline (image,x1,y1,x2,y2,color);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagedestroy */
final public boolean imagedestroy (QuercusImage image) {
 return com.caucho.quercus.lib.ImageModule.imagedestroy (image);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imageellipse */
final public boolean imageellipse (QuercusImage image,double cx,double cy,double width,double height,int color) {
 return com.caucho.quercus.lib.ImageModule.imageellipse (image,cx,cy,width,height,color);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagefill */
final public boolean imagefill (QuercusImage image,int x,int y,int color) {
 return com.caucho.quercus.lib.ImageModule.imagefill (image,x,y,color);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagefilledarc */
final public boolean imagefilledarc (QuercusImage image,double cx,double cy,double width,double height,double start,double end,int color,int style) {
 return com.caucho.quercus.lib.ImageModule.imagefilledarc (image,cx,cy,width,height,start,end,color,style);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagefilledellipse */
final public boolean imagefilledellipse (QuercusImage image,double cx,double cy,double width,double height,int color) {
 return com.caucho.quercus.lib.ImageModule.imagefilledellipse (image,cx,cy,width,height,color);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagefilledpolygon */
final public boolean imagefilledpolygon (QuercusImage image,ArrayValue points,int numPoints,int color) {
 return com.caucho.quercus.lib.ImageModule.imagefilledpolygon (quercus_context,image,points,numPoints,color);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagefilledrectangle */
final public boolean imagefilledrectangle (QuercusImage image,int x1,int y1,int x2,int y2,int color) {
 return com.caucho.quercus.lib.ImageModule.imagefilledrectangle (image,x1,y1,x2,y2,color);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagefilltoborder */
final public boolean imagefilltoborder (QuercusImage image,int x,int y,int border,int color) {
 return com.caucho.quercus.lib.ImageModule.imagefilltoborder (image,x,y,border,color);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagefilter */
final public boolean imagefilter (QuercusImage image,int filterType,@Optional int arg1,@Optional int arg2,@Optional int arg3) {
 return com.caucho.quercus.lib.ImageModule.imagefilter (quercus_context,image,filterType,arg1,arg2,arg3);
}
final public boolean imagefilter (QuercusImage image, int filterType) {
 int arg1 = 0;
int arg2 = 0;
int arg3 = 0;

 return com.caucho.quercus.lib.ImageModule.imagefilter (quercus_context,image,filterType,arg1,arg2,arg3);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagefontheight */
final public int imagefontheight (int font) {
 return com.caucho.quercus.lib.ImageModule.imagefontheight (font);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagefontwidth */
final public int imagefontwidth (int font) {
 return com.caucho.quercus.lib.ImageModule.imagefontwidth (font);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imageftbbox */
final public Value imageftbbox (double size,double angle,StringValue fontFile,String text,@Optional ArrayValue extra) {
 return com.caucho.quercus.lib.ImageModule.imageftbbox (quercus_context,size,angle,fontFile,text,extra);
}
final public Value imageftbbox (double size, double angle, StringValue fontFile, String text) {
 ArrayValue extra = null;

 return com.caucho.quercus.lib.ImageModule.imageftbbox (quercus_context,size,angle,fontFile,text,extra);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagefttext */
final public Value imagefttext (@NotNull QuercusImage image,double size,double angle,int x,int y,int color,StringValue fontFile,String text,@Optional ArrayValue extra) {
 return com.caucho.quercus.lib.ImageModule.imagefttext (quercus_context,image,size,angle,x,y,color,fontFile,text,extra);
}
final public Value imagefttext (@NotNull QuercusImage image, double size, double angle, int x, int y, int color, StringValue fontFile, String text) {
 ArrayValue extra = null;

 return com.caucho.quercus.lib.ImageModule.imagefttext (quercus_context,image,size,angle,x,y,color,fontFile,text,extra);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagegammacorrect */
final public boolean imagegammacorrect (QuercusImage image,float gammaBefore,float gammaAfter) {
 return com.caucho.quercus.lib.ImageModule.imagegammacorrect (image,gammaBefore,gammaAfter);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagegd2 */
final public void imagegd2 (QuercusImage image,@Optional Path file) {
  com.caucho.quercus.lib.ImageModule.imagegd2 (image,file);
}
final public void imagegd2 (QuercusImage image) {
 Path file = null;

  com.caucho.quercus.lib.ImageModule.imagegd2 (image,file);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagegd */
final public void imagegd (QuercusImage image,@Optional Path file) {
  com.caucho.quercus.lib.ImageModule.imagegd (image,file);
}
final public void imagegd (QuercusImage image) {
 Path file = null;

  com.caucho.quercus.lib.ImageModule.imagegd (image,file);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagegif */
final public boolean imagegif (QuercusImage image,@Optional Path path) {
 return com.caucho.quercus.lib.ImageModule.imagegif (quercus_context,image,path);
}
final public boolean imagegif (QuercusImage image) {
 Path path = null;

 return com.caucho.quercus.lib.ImageModule.imagegif (quercus_context,image,path);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imageinterlace */
final public boolean imageinterlace (QuercusImage image,@Optional Boolean enable) {
 return com.caucho.quercus.lib.ImageModule.imageinterlace (image,enable);
}
final public boolean imageinterlace (QuercusImage image) {
 Boolean enable = null;

 return com.caucho.quercus.lib.ImageModule.imageinterlace (image,enable);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imageistruecolor */
final public boolean imageistruecolor (QuercusImage image) {
 return com.caucho.quercus.lib.ImageModule.imageistruecolor (image);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagejpeg */
final public boolean imagejpeg (QuercusImage image,@Optional Path path,@Optional int quality) {
 return com.caucho.quercus.lib.ImageModule.imagejpeg (quercus_context,image,path,quality);
}
final public boolean imagejpeg (QuercusImage image) {
 Path path = null;
int quality = 0;

 return com.caucho.quercus.lib.ImageModule.imagejpeg (quercus_context,image,path,quality);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagelayereffect */
final public boolean imagelayereffect (QuercusImage image,int effect) {
 return com.caucho.quercus.lib.ImageModule.imagelayereffect (image,effect);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imageline */
final public boolean imageline (QuercusImage image,int x1,int y1,int x2,int y2,int color) {
 return com.caucho.quercus.lib.ImageModule.imageline (image,x1,y1,x2,y2,color);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imageloadfont */
final public long imageloadfont (Path file) {
 return com.caucho.quercus.lib.ImageModule.imageloadfont (file);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagepalettecopy */
final public boolean imagepalettecopy (QuercusImage source,QuercusImage dest) {
 return com.caucho.quercus.lib.ImageModule.imagepalettecopy (source,dest);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagepng */
final public boolean imagepng (QuercusImage image,@Optional Path path) {
 return com.caucho.quercus.lib.ImageModule.imagepng (quercus_context,image,path);
}
final public boolean imagepng (QuercusImage image) {
 Path path = null;

 return com.caucho.quercus.lib.ImageModule.imagepng (quercus_context,image,path);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagepolygon */
final public boolean imagepolygon (QuercusImage image,ArrayValue points,int numPoints,int color) {
 return com.caucho.quercus.lib.ImageModule.imagepolygon (quercus_context,image,points,numPoints,color);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagepsbbox */
final public ArrayValue imagepsbbox (String text,int font,int size,@Optional int space,@Optional int tightness,@Optional float angle) {
 return com.caucho.quercus.lib.ImageModule.imagepsbbox (text,font,size,space,tightness,angle);
}
final public ArrayValue imagepsbbox (String text, int font, int size) {
 int space = 0;
int tightness = 0;
float angle = 0;

 return com.caucho.quercus.lib.ImageModule.imagepsbbox (text,font,size,space,tightness,angle);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagepscopyfont */
final public int imagepscopyfont (Value fontIndex) {
 return com.caucho.quercus.lib.ImageModule.imagepscopyfont (fontIndex);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagepsencodefont */
final public boolean imagepsencodefont (Value fontIndex,Path encodingFile) {
 return com.caucho.quercus.lib.ImageModule.imagepsencodefont (fontIndex,encodingFile);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagepsextendfont */
final public boolean imagepsextendfont (int fontIndex,float extend) {
 return com.caucho.quercus.lib.ImageModule.imagepsextendfont (fontIndex,extend);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagepsfreefont */
final public boolean imagepsfreefont (Value fontIndex) {
 return com.caucho.quercus.lib.ImageModule.imagepsfreefont (fontIndex);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagepsloadfont */
final public Value imagepsloadfont (Path fontFile) {
 return com.caucho.quercus.lib.ImageModule.imagepsloadfont (fontFile);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagepsslantfont */
final public boolean imagepsslantfont (Value fontIndex,float slant) {
 return com.caucho.quercus.lib.ImageModule.imagepsslantfont (fontIndex,slant);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagepstext */
final public ArrayValue imagepstext (QuercusImage image,String text,Value fontIndex,int size,int fg,int bg,int x,int y,@Optional int space,@Optional int tightness,@Optional float angle,@Optional int antialias_steps) {
 return com.caucho.quercus.lib.ImageModule.imagepstext (image,text,fontIndex,size,fg,bg,x,y,space,tightness,angle,antialias_steps);
}
final public ArrayValue imagepstext (QuercusImage image, String text, Value fontIndex, int size, int fg, int bg, int x, int y) {
 int space = 0;
int tightness = 0;
float angle = 0;
int antialias_steps = 0;

 return com.caucho.quercus.lib.ImageModule.imagepstext (image,text,fontIndex,size,fg,bg,x,y,space,tightness,angle,antialias_steps);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagerectangle */
final public boolean imagerectangle (QuercusImage image,int x1,int y1,int x2,int y2,int color) {
 return com.caucho.quercus.lib.ImageModule.imagerectangle (image,x1,y1,x2,y2,color);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagerotate */
final public boolean imagerotate (QuercusImage image,float angle,int backgroundColor,@Optional int ignoreTransparent) {
 return com.caucho.quercus.lib.ImageModule.imagerotate (image,angle,backgroundColor,ignoreTransparent);
}
final public boolean imagerotate (QuercusImage image, float angle, int backgroundColor) {
 int ignoreTransparent = 0;

 return com.caucho.quercus.lib.ImageModule.imagerotate (image,angle,backgroundColor,ignoreTransparent);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagesavealpha */
final public boolean imagesavealpha (QuercusImage image,boolean set) {
 return com.caucho.quercus.lib.ImageModule.imagesavealpha (image,set);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagesetbrush */
final public boolean imagesetbrush (QuercusImage image,QuercusImage brush) {
 return com.caucho.quercus.lib.ImageModule.imagesetbrush (image,brush);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagesetpixel */
final public boolean imagesetpixel (QuercusImage image,int x,int y,int color) {
 return com.caucho.quercus.lib.ImageModule.imagesetpixel (image,x,y,color);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagesetstyle */
final public boolean imagesetstyle (QuercusImage image,ArrayValue style) {
 return com.caucho.quercus.lib.ImageModule.imagesetstyle (quercus_context,image,style);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagesetthickness */
final public boolean imagesetthickness (QuercusImage image,int thickness) {
 return com.caucho.quercus.lib.ImageModule.imagesetthickness (image,thickness);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagestring */
final public boolean imagestring (QuercusImage image,int font,int x,int y,String s,int color) {
 return com.caucho.quercus.lib.ImageModule.imagestring (image,font,x,y,s,color);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagestringup */
final public boolean imagestringup (QuercusImage image,int font,int x,int y,String s,int color) {
 return com.caucho.quercus.lib.ImageModule.imagestringup (image,font,x,y,s,color);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagesx */
final public int imagesx (@NotNull QuercusImage image) {
 return com.caucho.quercus.lib.ImageModule.imagesx (image);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagesy */
final public int imagesy (@NotNull QuercusImage image) {
 return com.caucho.quercus.lib.ImageModule.imagesy (image);
}


/* ./com/caucho/quercus/lib/ImageModule.java : image_transform */
final public boolean image_transform (QuercusImage image,double m00,double m10,double m01,double m11,double m02,double m12) {
 return com.caucho.quercus.lib.ImageModule.image_transform (image,m00,m10,m01,m11,m02,m12);
}


/* ./com/caucho/quercus/lib/ImageModule.java : image_transform_scale */
final public boolean image_transform_scale (QuercusImage image,double sx,double sy) {
 return com.caucho.quercus.lib.ImageModule.image_transform_scale (image,sx,sy);
}


/* ./com/caucho/quercus/lib/ImageModule.java : image_transform_shear */
final public boolean image_transform_shear (QuercusImage image,double shx,double shy) {
 return com.caucho.quercus.lib.ImageModule.image_transform_shear (image,shx,shy);
}


/* ./com/caucho/quercus/lib/ImageModule.java : image_transform_translate */
final public boolean image_transform_translate (QuercusImage image,double x,double y) {
 return com.caucho.quercus.lib.ImageModule.image_transform_translate (image,x,y);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagettfbbox */
final public Value imagettfbbox (double size,double angle,StringValue fontFile,String text) {
 return com.caucho.quercus.lib.ImageModule.imagettfbbox (quercus_context,size,angle,fontFile,text);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagettftext */
final public Value imagettftext (@NotNull QuercusImage image,double size,double angle,int x,int y,int color,StringValue fontFile,String text) {
 return com.caucho.quercus.lib.ImageModule.imagettftext (quercus_context,image,size,angle,x,y,color,fontFile,text);
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagetypes */
final public long imagetypes () {
 return com.caucho.quercus.lib.ImageModule.imagetypes ();
}


/* ./com/caucho/quercus/lib/ImageModule.java : imagewbmp */
final public void imagewbmp (QuercusImage image,@Optional Path filename,@Optional int threshhold) {
  com.caucho.quercus.lib.ImageModule.imagewbmp (image,filename,threshhold);
}
final public void imagewbmp (QuercusImage image) {
 Path filename = null;
int threshhold = 0;

  com.caucho.quercus.lib.ImageModule.imagewbmp (image,filename,threshhold);
}


/* ./com/caucho/quercus/lib/ImageModule.java : iptcembed */
final public boolean iptcembed (String iptcdata,String jpegFileName,@Optional int spool) {
 return com.caucho.quercus.lib.ImageModule.iptcembed (iptcdata,jpegFileName,spool);
}
final public boolean iptcembed (String iptcdata, String jpegFileName) {
 int spool = 0;

 return com.caucho.quercus.lib.ImageModule.iptcembed (iptcdata,jpegFileName,spool);
}


/* ./com/caucho/quercus/lib/ImageModule.java : jpeg2wbmp */
final public void jpeg2wbmp (String jpegFilename,String wbmpName,int d_height,int d_width,int threshhold) {
  com.caucho.quercus.lib.ImageModule.jpeg2wbmp (jpegFilename,wbmpName,d_height,d_width,threshhold);
}


/* ./com/caucho/quercus/lib/ImageModule.java : png2wbmp */
final public void png2wbmp (String pngFilename,String wbmpName,int d_height,int d_width,int threshhold) {
  com.caucho.quercus.lib.ImageModule.png2wbmp (pngFilename,wbmpName,d_height,d_width,threshhold);
}


/* ./com/caucho/quercus/lib/Java.java : __construct */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/JavaModule.java : java */
final public Object java (String className, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.JavaModule.java (quercus_context,className,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/JavaModule.java : java_class */
final public Object java_class (String className) {
 return com.caucho.quercus.lib.JavaModule.java_class (quercus_context,className);
}


/* ./com/caucho/quercus/lib/JavaModule.java : get_java_class_name */
final public String get_java_class_name (Value value) {
 return com.caucho.quercus.lib.JavaModule.get_java_class_name (quercus_context,value);
}


/* ./com/caucho/quercus/lib/jms/JMSQueue.java : __construct */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/mail/MailModule.java : mail */
final public boolean mail (String to,String subject,StringValue message,@Optional String additionalHeaders,@Optional String additionalParameters) {
 return com.caucho.quercus.lib.mail.MailModule.mail (quercus_context,to,subject,message,additionalHeaders,additionalParameters);
}
final public boolean mail (String to, String subject, StringValue message) {
 String additionalHeaders = null;
String additionalParameters = null;

 return com.caucho.quercus.lib.mail.MailModule.mail (quercus_context,to,subject,message,additionalHeaders,additionalParameters);
}


/* ./com/caucho/quercus/lib/MathModule.java : abs */
final public Value abs (Value value) {
 return com.caucho.quercus.lib.MathModule.abs (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : acos */
final public double acos (double value) {
 return com.caucho.quercus.lib.MathModule.acos (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : acosh */
final public double acosh (double value) {
 return com.caucho.quercus.lib.MathModule.acosh (quercus_context,value);
}


/* ./com/caucho/quercus/lib/MathModule.java : asin */
final public Value asin (Value value) {
 return com.caucho.quercus.lib.MathModule.asin (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : asinh */
final public double asinh (double value) {
 return com.caucho.quercus.lib.MathModule.asinh (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : atan2 */
final public double atan2 (double yV,double xV) {
 return com.caucho.quercus.lib.MathModule.atan2 (yV,xV);
}


/* ./com/caucho/quercus/lib/MathModule.java : atan */
final public double atan (double value) {
 return com.caucho.quercus.lib.MathModule.atan (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : atanh */
final public double atanh (double value) {
 return com.caucho.quercus.lib.MathModule.atanh (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : base_convert */
final public Value base_convert (StringValue str,int fromBase,int toBase) {
 return com.caucho.quercus.lib.MathModule.base_convert (quercus_context,str,fromBase,toBase);
}


/* ./com/caucho/quercus/lib/MathModule.java : bindec */
final public Value bindec (StringValue bin) {
 return com.caucho.quercus.lib.MathModule.bindec (quercus_context,bin);
}


/* ./com/caucho/quercus/lib/MathModule.java : ceil */
final public double ceil (double value) {
 return com.caucho.quercus.lib.MathModule.ceil (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : cos */
final public double cos (double value) {
 return com.caucho.quercus.lib.MathModule.cos (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : cosh */
final public double cosh (double value) {
 return com.caucho.quercus.lib.MathModule.cosh (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : decbin */
final public StringValue decbin (long value) {
 return com.caucho.quercus.lib.MathModule.decbin (quercus_context,value);
}


/* ./com/caucho/quercus/lib/MathModule.java : dechex */
final public StringValue dechex (long value) {
 return com.caucho.quercus.lib.MathModule.dechex (quercus_context,value);
}


/* ./com/caucho/quercus/lib/MathModule.java : decoct */
final public StringValue decoct (long value) {
 return com.caucho.quercus.lib.MathModule.decoct (quercus_context,value);
}


/* ./com/caucho/quercus/lib/MathModule.java : deg2rad */
final public double deg2rad (double value) {
 return com.caucho.quercus.lib.MathModule.deg2rad (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : exp */
final public Value exp (Value value) {
 return com.caucho.quercus.lib.MathModule.exp (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : expm1 */
final public Value expm1 (Value value) {
 return com.caucho.quercus.lib.MathModule.expm1 (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : floor */
final public Value floor (Value value) {
 return com.caucho.quercus.lib.MathModule.floor (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : fmod */
final public double fmod (double xV,double yV) {
 return com.caucho.quercus.lib.MathModule.fmod (xV,yV);
}


/* ./com/caucho/quercus/lib/MathModule.java : hexdec */
final public Value hexdec (StringValue s) {
 return com.caucho.quercus.lib.MathModule.hexdec (quercus_context,s);
}


/* ./com/caucho/quercus/lib/MathModule.java : hypot */
final public double hypot (double a,double b) {
 return com.caucho.quercus.lib.MathModule.hypot (a,b);
}


/* ./com/caucho/quercus/lib/MathModule.java : is_finite */
final public boolean is_finite (Value value) {
 return com.caucho.quercus.lib.MathModule.is_finite (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : is_infinite */
final public Value is_infinite (Value value) {
 return com.caucho.quercus.lib.MathModule.is_infinite (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : is_nan */
final public Value is_nan (Value value) {
 return com.caucho.quercus.lib.MathModule.is_nan (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : log */
final public double log (double value) {
 return com.caucho.quercus.lib.MathModule.log (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : log10 */
final public double log10 (double value) {
 return com.caucho.quercus.lib.MathModule.log10 (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : log1p */
final public double log1p (double value) {
 return com.caucho.quercus.lib.MathModule.log1p (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : getrandmax */
final public Value getrandmax () {
 return com.caucho.quercus.lib.MathModule.getrandmax ();
}


/* ./com/caucho/quercus/lib/MathModule.java : max */
final public Value max (Value arg1, Value arg2) {
 return com.caucho.quercus.lib.MathModule.max (quercus_context,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/MathModule.java : min */
final public Value min (Value arg1, Value arg2) {
 return com.caucho.quercus.lib.MathModule.min (quercus_context,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/MathModule.java : mt_getrandmax */
final public Value mt_getrandmax () {
 return com.caucho.quercus.lib.MathModule.mt_getrandmax ();
}


/* ./com/caucho/quercus/lib/MathModule.java : mt_rand */
final public long mt_rand (@Optional("0") long min,@Optional("RAND_MAX") long max) {
 return com.caucho.quercus.lib.MathModule.mt_rand (min,max);
}
final public long mt_rand () {
 long min = 0l;
long max = 0;

 return com.caucho.quercus.lib.MathModule.mt_rand (min,max);
}


/* ./com/caucho/quercus/lib/MathModule.java : mt_srand */
final public Value mt_srand (@Optional long seed) {
 return com.caucho.quercus.lib.MathModule.mt_srand (seed);
}
final public Value mt_srand () {
 long seed = 0;

 return com.caucho.quercus.lib.MathModule.mt_srand (seed);
}


/* ./com/caucho/quercus/lib/MathModule.java : lcg_value */
final public double lcg_value () {
 return com.caucho.quercus.lib.MathModule.lcg_value ();
}


/* ./com/caucho/quercus/lib/MathModule.java : octdec */
final public Value octdec (StringValue oct) {
 return com.caucho.quercus.lib.MathModule.octdec (quercus_context,oct);
}


/* ./com/caucho/quercus/lib/MathModule.java : pi */
final public double pi () {
 return com.caucho.quercus.lib.MathModule.pi ();
}


/* ./com/caucho/quercus/lib/MathModule.java : pow */
final public double pow (double base,double exp) {
 return com.caucho.quercus.lib.MathModule.pow (base,exp);
}


/* ./com/caucho/quercus/lib/MathModule.java : rad2deg */
final public double rad2deg (double value) {
 return com.caucho.quercus.lib.MathModule.rad2deg (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : rand */
final public long rand (@Optional int min,@Optional("RAND_MAX") int max) {
 return com.caucho.quercus.lib.MathModule.rand (min,max);
}
final public long rand () {
 int min = 0;
int max = 0;

 return com.caucho.quercus.lib.MathModule.rand (min,max);
}


/* ./com/caucho/quercus/lib/MathModule.java : round */
final public double round (double value,@Optional int precision) {
 return com.caucho.quercus.lib.MathModule.round (value,precision);
}
final public double round (double value) {
 int precision = 0;

 return com.caucho.quercus.lib.MathModule.round (value,precision);
}


/* ./com/caucho/quercus/lib/MathModule.java : sin */
final public double sin (double value) {
 return com.caucho.quercus.lib.MathModule.sin (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : sinh */
final public Value sinh (Value value) {
 return com.caucho.quercus.lib.MathModule.sinh (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : sqrt */
final public double sqrt (double value) {
 return com.caucho.quercus.lib.MathModule.sqrt (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : srand */
final public Value srand (@Optional long seed) {
 return com.caucho.quercus.lib.MathModule.srand (seed);
}
final public Value srand () {
 long seed = 0;

 return com.caucho.quercus.lib.MathModule.srand (seed);
}


/* ./com/caucho/quercus/lib/MathModule.java : tan */
final public double tan (double value) {
 return com.caucho.quercus.lib.MathModule.tan (value);
}


/* ./com/caucho/quercus/lib/MathModule.java : tanh */
final public double tanh (double value) {
 return com.caucho.quercus.lib.MathModule.tanh (value);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_cbc */
final public StringValue mcrypt_cbc (String cipher,byte[] key,byte[] data,int mode,@Optional byte[] iv) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_cbc (quercus_context,cipher,key,data,mode,iv);
}
final public StringValue mcrypt_cbc (String cipher, byte[] key, byte[] data, int mode) {
 byte[] iv = null;

 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_cbc (quercus_context,cipher,key,data,mode,iv);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_cfb */
final public StringValue mcrypt_cfb (String cipher,byte[] key,byte[] data,int mode,@Optional byte[] iv) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_cfb (quercus_context,cipher,key,data,mode,iv);
}
final public StringValue mcrypt_cfb (String cipher, byte[] key, byte[] data, int mode) {
 byte[] iv = null;

 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_cfb (quercus_context,cipher,key,data,mode,iv);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_create_iv */
final public StringValue mcrypt_create_iv (int size,@Optional int randomMode) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_create_iv (quercus_context,size,randomMode);
}
final public StringValue mcrypt_create_iv (int size) {
 int randomMode = 0;

 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_create_iv (quercus_context,size,randomMode);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_decrypt */
final public StringValue mcrypt_decrypt (String cipher,byte[] key,byte[] data,String mode,@Optional byte[] iv) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_decrypt (quercus_context,cipher,key,data,mode,iv);
}
final public StringValue mcrypt_decrypt (String cipher, byte[] key, byte[] data, String mode) {
 byte[] iv = null;

 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_decrypt (quercus_context,cipher,key,data,mode,iv);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_ecb */
final public StringValue mcrypt_ecb (String cipher,byte[] key,byte[] data,int mode,@Optional byte[] iv) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_ecb (quercus_context,cipher,key,data,mode,iv);
}
final public StringValue mcrypt_ecb (String cipher, byte[] key, byte[] data, int mode) {
 byte[] iv = null;

 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_ecb (quercus_context,cipher,key,data,mode,iv);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_enc_get_algorithms_name */
final public String mcrypt_enc_get_algorithms_name (Mcrypt mcrypt) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_enc_get_algorithms_name (mcrypt);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_enc_get_block_size */
final public int mcrypt_enc_get_block_size (Mcrypt mcrypt) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_enc_get_block_size (mcrypt);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_enc_get_iv_size */
final public int mcrypt_enc_get_iv_size (Mcrypt mcrypt) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_enc_get_iv_size (mcrypt);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_enc_get_key_size */
final public int mcrypt_enc_get_key_size (Mcrypt mcrypt) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_enc_get_key_size (mcrypt);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_enc_get_modes_name */
final public String mcrypt_enc_get_modes_name (Mcrypt mcrypt) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_enc_get_modes_name (mcrypt);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_enc_get_supported_key_sizes */
final public Value mcrypt_enc_get_supported_key_sizes (Mcrypt mcrypt) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_enc_get_supported_key_sizes (mcrypt);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_enc_is_block_algorithm */
final public boolean mcrypt_enc_is_block_algorithm (Mcrypt mcrypt) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_enc_is_block_algorithm (mcrypt);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_enc_is_block_algorithm_mode */
final public boolean mcrypt_enc_is_block_algorithm_mode (Mcrypt mcrypt) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_enc_is_block_algorithm_mode (mcrypt);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_enc_is_block_mode */
final public boolean mcrypt_enc_is_block_mode (Mcrypt mcrypt) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_enc_is_block_mode (mcrypt);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_enc_self_test */
final public boolean mcrypt_enc_self_test (Mcrypt mcrypt) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_enc_self_test (mcrypt);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_encrypt */
final public StringValue mcrypt_encrypt (String cipher,byte[] key,byte[] data,String mode,@Optional byte[] iv) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_encrypt (quercus_context,cipher,key,data,mode,iv);
}
final public StringValue mcrypt_encrypt (String cipher, byte[] key, byte[] data, String mode) {
 byte[] iv = null;

 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_encrypt (quercus_context,cipher,key,data,mode,iv);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_generic */
final public StringValue mcrypt_generic (Mcrypt mcrypt,byte[] data) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_generic (quercus_context,mcrypt,data);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_generic_deinit */
final public boolean mcrypt_generic_deinit (Mcrypt mcrypt) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_generic_deinit (mcrypt);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_generic_init */
final public Value mcrypt_generic_init (Mcrypt mcrypt,byte[] key,byte[] iv) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_generic_init (mcrypt,key,iv);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_generic_end */
final public boolean mcrypt_generic_end (Mcrypt mcrypt) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_generic_end (mcrypt);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_get_block_size */
final public Value mcrypt_get_block_size (String cipher,String mode) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_get_block_size (quercus_context,cipher,mode);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_get_cipher_name */
final public String mcrypt_get_cipher_name (String cipher) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_get_cipher_name (quercus_context,cipher);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_get_iv_size */
final public Value mcrypt_get_iv_size (String cipher,String mode) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_get_iv_size (quercus_context,cipher,mode);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_get_key_size */
final public Value mcrypt_get_key_size (String cipher,String mode) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_get_key_size (quercus_context,cipher,mode);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_list_algorithms */
final public Value mcrypt_list_algorithms () {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_list_algorithms (quercus_context);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_list_modes */
final public Value mcrypt_list_modes () {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_list_modes (quercus_context);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_module_close */
final public boolean mcrypt_module_close (Mcrypt mcrypt) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_module_close (mcrypt);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_module_get_algo_block_size */
final public int mcrypt_module_get_algo_block_size (String cipher,@Optional String libDir) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_module_get_algo_block_size (quercus_context,cipher,libDir);
}
final public int mcrypt_module_get_algo_block_size (String cipher) {
 String libDir = null;

 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_module_get_algo_block_size (quercus_context,cipher,libDir);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_module_get_algo_key_size */
final public int mcrypt_module_get_algo_key_size (String cipher,@Optional String libDir) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_module_get_algo_key_size (quercus_context,cipher,libDir);
}
final public int mcrypt_module_get_algo_key_size (String cipher) {
 String libDir = null;

 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_module_get_algo_key_size (quercus_context,cipher,libDir);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_module_get_supported_key_sizes */
final public Value mcrypt_module_get_supported_key_sizes (String cipher,@Optional String libDir) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_module_get_supported_key_sizes (quercus_context,cipher,libDir);
}
final public Value mcrypt_module_get_supported_key_sizes (String cipher) {
 String libDir = null;

 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_module_get_supported_key_sizes (quercus_context,cipher,libDir);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_module_is_block_algorithm */
final public boolean mcrypt_module_is_block_algorithm (String cipher,@Optional String libDir) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_module_is_block_algorithm (quercus_context,cipher,libDir);
}
final public boolean mcrypt_module_is_block_algorithm (String cipher) {
 String libDir = null;

 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_module_is_block_algorithm (quercus_context,cipher,libDir);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_module_is_block_algorithm_mode */
final public boolean mcrypt_module_is_block_algorithm_mode (String mode,@Optional String libDir) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_module_is_block_algorithm_mode (quercus_context,mode,libDir);
}
final public boolean mcrypt_module_is_block_algorithm_mode (String mode) {
 String libDir = null;

 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_module_is_block_algorithm_mode (quercus_context,mode,libDir);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_module_is_block_mode */
final public boolean mcrypt_module_is_block_mode (String mode,@Optional String libDir) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_module_is_block_mode (quercus_context,mode,libDir);
}
final public boolean mcrypt_module_is_block_mode (String mode) {
 String libDir = null;

 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_module_is_block_mode (quercus_context,mode,libDir);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_module_self_test */
final public boolean mcrypt_module_self_test (String algorithm,Path libDir) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_module_self_test (quercus_context,algorithm,libDir);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_module_open */
final public Value mcrypt_module_open (String algorithm,Path algorithm_directory,String mode,Path mode_directory) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_module_open (quercus_context,algorithm,algorithm_directory,mode,mode_directory);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mcrypt_ofb */
final public StringValue mcrypt_ofb (String cipher,byte[] key,byte[] data,int mode,@Optional byte[] iv) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_ofb (quercus_context,cipher,key,data,mode,iv);
}
final public StringValue mcrypt_ofb (String cipher, byte[] key, byte[] data, int mode) {
 byte[] iv = null;

 return com.caucho.quercus.lib.mcrypt.McryptModule.mcrypt_ofb (quercus_context,cipher,key,data,mode,iv);
}


/* ./com/caucho/quercus/lib/mcrypt/McryptModule.java : mdecrypt_generic */
final public Value mdecrypt_generic (Mcrypt mcrypt,byte[] data) {
 return com.caucho.quercus.lib.mcrypt.McryptModule.mdecrypt_generic (quercus_context,mcrypt,data);
}


/* ./com/caucho/quercus/lib/MiscModule.java : connection_aborted */
final public int connection_aborted () {
 return com.caucho.quercus.lib.MiscModule.connection_aborted (quercus_context);
}


/* ./com/caucho/quercus/lib/MiscModule.java : connection_status */
final public int connection_status () {
 return com.caucho.quercus.lib.MiscModule.connection_status (quercus_context);
}


/* ./com/caucho/quercus/lib/MiscModule.java : escapeshellcmd */
final public String escapeshellcmd (String command) {
 return com.caucho.quercus.lib.MiscModule.escapeshellcmd (command);
}


/* ./com/caucho/quercus/lib/MiscModule.java : escapeshellarg */
final public StringValue escapeshellarg (StringValue arg) {
 return com.caucho.quercus.lib.MiscModule.escapeshellarg (quercus_context,arg);
}


/* ./com/caucho/quercus/lib/MiscModule.java : exec */
final public String exec (String command,@Optional Value output,@Optional Value result) {
 return com.caucho.quercus.lib.MiscModule.exec (quercus_context,command,output,result);
}
final public String exec (String command) {
 Value output = null;
Value result = null;

 return com.caucho.quercus.lib.MiscModule.exec (quercus_context,command,output,result);
}


/* ./com/caucho/quercus/lib/MiscModule.java : get_browser */
final public Value get_browser (@Optional() String user_agent,@Optional() boolean return_array) {
 return com.caucho.quercus.lib.MiscModule.get_browser (quercus_context,user_agent,return_array);
}
final public Value get_browser () {
 String user_agent = null;
boolean return_array = false;

 return com.caucho.quercus.lib.MiscModule.get_browser (quercus_context,user_agent,return_array);
}


/* ./com/caucho/quercus/lib/MiscModule.java : dump_stack */
final public Value dump_stack () {
 return com.caucho.quercus.lib.MiscModule.dump_stack (quercus_context);
}


/* ./com/caucho/quercus/lib/MiscModule.java : shell_exec */
final public Value shell_exec (String command) {
 return com.caucho.quercus.lib.MiscModule.shell_exec (quercus_context,command);
}


/* ./com/caucho/quercus/lib/MiscModule.java : passthru */
final public void passthru (String command,@Optional Value result) {
  com.caucho.quercus.lib.MiscModule.passthru (quercus_context,command,result);
}
final public void passthru (String command) {
 Value result = null;

  com.caucho.quercus.lib.MiscModule.passthru (quercus_context,command,result);
}


/* ./com/caucho/quercus/lib/MiscModule.java : proc_open */
final public ProcOpenResource proc_open (String command,ArrayValue descriptorArray,Value pipes,@Optional Path pwd,@Optional ArrayValue envArray,@Optional ArrayValue options) {
 return com.caucho.quercus.lib.MiscModule.proc_open (quercus_context,command,descriptorArray,pipes,pwd,envArray,options);
}
final public ProcOpenResource proc_open (String command, ArrayValue descriptorArray, Value pipes) {
 Path pwd = null;
ArrayValue envArray = null;
ArrayValue options = null;

 return com.caucho.quercus.lib.MiscModule.proc_open (quercus_context,command,descriptorArray,pipes,pwd,envArray,options);
}


/* ./com/caucho/quercus/lib/MiscModule.java : proc_close */
final public int proc_close (@NotNull ProcOpenResource stream) {
 return com.caucho.quercus.lib.MiscModule.proc_close (quercus_context,stream);
}


/* ./com/caucho/quercus/lib/MiscModule.java : proc_terminate */
final public boolean proc_terminate (@NotNull ProcOpenResource stream) {
 return com.caucho.quercus.lib.MiscModule.proc_terminate (quercus_context,stream);
}


/* ./com/caucho/quercus/lib/MiscModule.java : proc_get_status */
final public Value proc_get_status (@NotNull ProcOpenResource stream) {
 return com.caucho.quercus.lib.MiscModule.proc_get_status (quercus_context,stream);
}


/* ./com/caucho/quercus/lib/MiscModule.java : ignore_user_abort */
final public int ignore_user_abort (@Optional boolean set) {
 return com.caucho.quercus.lib.MiscModule.ignore_user_abort (set);
}
final public int ignore_user_abort () {
 boolean set = false;

 return com.caucho.quercus.lib.MiscModule.ignore_user_abort (set);
}


/* ./com/caucho/quercus/lib/MiscModule.java : usleep */
final public Value usleep (long microseconds) {
 return com.caucho.quercus.lib.MiscModule.usleep (microseconds);
}


/* ./com/caucho/quercus/lib/MiscModule.java : sleep */
final public long sleep (long seconds) {
 return com.caucho.quercus.lib.MiscModule.sleep (seconds);
}


/* ./com/caucho/quercus/lib/MiscModule.java : system */
final public String system (String command,@Optional Value result) {
 return com.caucho.quercus.lib.MiscModule.system (quercus_context,command,result);
}
final public String system (String command) {
 Value result = null;

 return com.caucho.quercus.lib.MiscModule.system (quercus_context,command,result);
}


/* ./com/caucho/quercus/lib/NetworkModule.java : fsockopen */
final public SocketInputOutput fsockopen (String host,@Optional int port,@Optional Value errno,@Optional Value errstr,@Optional double timeout) {
 return com.caucho.quercus.lib.NetworkModule.fsockopen (quercus_context,host,port,errno,errstr,timeout);
}
final public SocketInputOutput fsockopen (String host) {
 int port = 0;
Value errno = null;
Value errstr = null;
double timeout = 0;

 return com.caucho.quercus.lib.NetworkModule.fsockopen (quercus_context,host,port,errno,errstr,timeout);
}


/* ./com/caucho/quercus/lib/NetworkModule.java : ip2long */
final public Value ip2long (String ip) {
 return com.caucho.quercus.lib.NetworkModule.ip2long (ip);
}


/* ./com/caucho/quercus/lib/NetworkModule.java : long2ip */
final public StringValue long2ip (long address) {
 return com.caucho.quercus.lib.NetworkModule.long2ip (quercus_context,address);
}


/* ./com/caucho/quercus/lib/NetworkModule.java : gethostbyname */
final public String gethostbyname (String hostname) {
 return com.caucho.quercus.lib.NetworkModule.gethostbyname (hostname);
}


/* ./com/caucho/quercus/lib/NetworkModule.java : gethostbynamel */
final public Value gethostbynamel (String hostname) {
 return com.caucho.quercus.lib.NetworkModule.gethostbynamel (quercus_context,hostname);
}


/* ./com/caucho/quercus/lib/NetworkModule.java : gethostbyaddr */
final public String gethostbyaddr (String ip) {
 return com.caucho.quercus.lib.NetworkModule.gethostbyaddr (quercus_context,ip);
}


/* ./com/caucho/quercus/lib/NetworkModule.java : getprotobyname */
final public Value getprotobyname (String protoName) {
 return com.caucho.quercus.lib.NetworkModule.getprotobyname (protoName);
}


/* ./com/caucho/quercus/lib/NetworkModule.java : getprotobynumber */
final public String getprotobynumber (int protoNumber) {
 return com.caucho.quercus.lib.NetworkModule.getprotobynumber (protoNumber);
}


/* ./com/caucho/quercus/lib/NetworkModule.java : getservbyname */
final public Value getservbyname (String service,String protocol) {
 return com.caucho.quercus.lib.NetworkModule.getservbyname (service,protocol);
}


/* ./com/caucho/quercus/lib/NetworkModule.java : getservbyport */
final public String getservbyport (int port,String protocol) {
 return com.caucho.quercus.lib.NetworkModule.getservbyport (port,protocol);
}


/* ./com/caucho/quercus/lib/NetworkModule.java : getmxrr */
final public boolean getmxrr (@NotNull String hostname,Value mxhosts,@Optional Value weight) {
 return com.caucho.quercus.lib.NetworkModule.getmxrr (quercus_context,hostname,mxhosts,weight);
}
final public boolean getmxrr (@NotNull String hostname, Value mxhosts) {
 Value weight = null;

 return com.caucho.quercus.lib.NetworkModule.getmxrr (quercus_context,hostname,mxhosts,weight);
}


/* ./com/caucho/quercus/lib/NetworkModule.java : dns_get_mx */
final public boolean dns_get_mx (@NotNull String hostname,Value mxhosts,@Optional Value weight) {
 return com.caucho.quercus.lib.NetworkModule.dns_get_mx (quercus_context,hostname,mxhosts,weight);
}
final public boolean dns_get_mx (@NotNull String hostname, Value mxhosts) {
 Value weight = null;

 return com.caucho.quercus.lib.NetworkModule.dns_get_mx (quercus_context,hostname,mxhosts,weight);
}


/* ./com/caucho/quercus/lib/NetworkModule.java : checkdnsrr */
final public boolean checkdnsrr (@NotNull String hostname,@Optional("MX") String type) {
 return com.caucho.quercus.lib.NetworkModule.checkdnsrr (quercus_context,hostname,type);
}
final public boolean checkdnsrr (@NotNull String hostname) {
 String type = null;

 return com.caucho.quercus.lib.NetworkModule.checkdnsrr (quercus_context,hostname,type);
}


/* ./com/caucho/quercus/lib/NetworkModule.java : dns_check_record */
final public boolean dns_check_record (@NotNull String hostname,@Optional("MX") String type) {
 return com.caucho.quercus.lib.NetworkModule.dns_check_record (quercus_context,hostname,type);
}
final public boolean dns_check_record (@NotNull String hostname) {
 String type = null;

 return com.caucho.quercus.lib.NetworkModule.dns_check_record (quercus_context,hostname,type);
}


/* ./com/caucho/quercus/lib/NetworkModule.java : define_syslog_variables */
final public Value define_syslog_variables () {
 return com.caucho.quercus.lib.NetworkModule.define_syslog_variables (quercus_context);
}


/* ./com/caucho/quercus/lib/NetworkModule.java : openlog */
final public boolean openlog (String ident,int option,int facility) {
 return com.caucho.quercus.lib.NetworkModule.openlog (quercus_context,ident,option,facility);
}


/* ./com/caucho/quercus/lib/NetworkModule.java : closelog */
final public boolean closelog () {
 return com.caucho.quercus.lib.NetworkModule.closelog ();
}


/* ./com/caucho/quercus/lib/NetworkModule.java : syslog */
final public boolean syslog (int priority,String message) {
 return com.caucho.quercus.lib.NetworkModule.syslog (quercus_context,priority,message);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : q_assert */
final public Value q_assert (String code) {
 return com.caucho.quercus.lib.OptionsModule.q_assert (quercus_context,code);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : assert_options */
final public Value assert_options (int code,@Optional("null") Value value) {
 return com.caucho.quercus.lib.OptionsModule.assert_options (quercus_context,code,value);
}
final public Value assert_options (int code) {
 Value value = null;

 return com.caucho.quercus.lib.OptionsModule.assert_options (quercus_context,code,value);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : dl */
final public boolean dl (String dl) {
 return com.caucho.quercus.lib.OptionsModule.dl (quercus_context,dl);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : extension_loaded */
final public boolean extension_loaded (String ext) {
 return com.caucho.quercus.lib.OptionsModule.extension_loaded (quercus_context,ext);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : get_cfg_var */
final public Value get_cfg_var (String name) {
 return com.caucho.quercus.lib.OptionsModule.get_cfg_var (quercus_context,name);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : get_current_user */
final public String get_current_user () {
 return com.caucho.quercus.lib.OptionsModule.get_current_user (quercus_context);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : get_defined_constants */
final public Value get_defined_constants () {
 return com.caucho.quercus.lib.OptionsModule.get_defined_constants (quercus_context);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : get_extension_funcs */
final public Value get_extension_funcs (String name) {
 return com.caucho.quercus.lib.OptionsModule.get_extension_funcs (quercus_context,name);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : get_include_path */
final public Value get_include_path () {
 return com.caucho.quercus.lib.OptionsModule.get_include_path (quercus_context);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : get_included_files */
final public ArrayValue get_included_files () {
 return com.caucho.quercus.lib.OptionsModule.get_included_files (quercus_context);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : get_loaded_extensions */
final public Value get_loaded_extensions () {
 return com.caucho.quercus.lib.OptionsModule.get_loaded_extensions (quercus_context);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : get_magic_quotes_gpc */
final public LongValue get_magic_quotes_gpc () {
 return com.caucho.quercus.lib.OptionsModule.get_magic_quotes_gpc (quercus_context);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : get_magic_quotes_runtime */
final public Value get_magic_quotes_runtime () {
 return com.caucho.quercus.lib.OptionsModule.get_magic_quotes_runtime (quercus_context);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : get_required_files */
final public ArrayValue get_required_files () {
 return com.caucho.quercus.lib.OptionsModule.get_required_files (quercus_context);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : getenv */
final public Value getenv (StringValue key) {
 return com.caucho.quercus.lib.OptionsModule.getenv (quercus_context,key);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : getlastmod */
final public Value getlastmod () {
 return com.caucho.quercus.lib.OptionsModule.getlastmod (quercus_context);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : getmygid */
final public Value getmygid () {
 return com.caucho.quercus.lib.OptionsModule.getmygid (quercus_context);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : getmyinode */
final public Value getmyinode () {
 return com.caucho.quercus.lib.OptionsModule.getmyinode (quercus_context);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : getmyuid */
final public Value getmyuid () {
 return com.caucho.quercus.lib.OptionsModule.getmyuid (quercus_context);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : getmypid */
final public long getmypid () {
 return com.caucho.quercus.lib.OptionsModule.getmypid (quercus_context);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : getrusage */
final public Value getrusage (@Optional int who) {
 return com.caucho.quercus.lib.OptionsModule.getrusage (quercus_context,who);
}
final public Value getrusage () {
 int who = 0;

 return com.caucho.quercus.lib.OptionsModule.getrusage (quercus_context,who);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : ini_alter */
final public Value ini_alter (String varName,StringValue value) {
 return com.caucho.quercus.lib.OptionsModule.ini_alter (quercus_context,varName,value);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : ini_get */
final public StringValue ini_get (String varName) {
 return com.caucho.quercus.lib.OptionsModule.ini_get (quercus_context,varName);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : ini_get_all */
final public Value ini_get_all (@Optional() String extension) {
 return com.caucho.quercus.lib.OptionsModule.ini_get_all (quercus_context,extension);
}
final public Value ini_get_all () {
 String extension = null;

 return com.caucho.quercus.lib.OptionsModule.ini_get_all (quercus_context,extension);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : ini_restore */
final public Value ini_restore (String name) {
 return com.caucho.quercus.lib.OptionsModule.ini_restore (quercus_context,name);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : ini_set */
final public StringValue ini_set (String varName,StringValue value) {
 return com.caucho.quercus.lib.OptionsModule.ini_set (quercus_context,varName,value);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : magic_quotes_runtime */
final public Value magic_quotes_runtime () {
 return com.caucho.quercus.lib.OptionsModule.magic_quotes_runtime (quercus_context);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : memory_get_peak_usage */
final public Value memory_get_peak_usage (@Optional boolean real) {
 return com.caucho.quercus.lib.OptionsModule.memory_get_peak_usage (quercus_context,real);
}
final public Value memory_get_peak_usage () {
 boolean real = false;

 return com.caucho.quercus.lib.OptionsModule.memory_get_peak_usage (quercus_context,real);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : memory_get_usage */
final public Value memory_get_usage (@Optional boolean real) {
 return com.caucho.quercus.lib.OptionsModule.memory_get_usage (quercus_context,real);
}
final public Value memory_get_usage () {
 boolean real = false;

 return com.caucho.quercus.lib.OptionsModule.memory_get_usage (quercus_context,real);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : php_sapi_name */
final public String php_sapi_name () {
 return com.caucho.quercus.lib.OptionsModule.php_sapi_name (quercus_context);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : php_uname */
final public String php_uname (@Optional("'a'") String mode) {
 return com.caucho.quercus.lib.OptionsModule.php_uname (mode);
}
final public String php_uname () {
 String mode = null;

 return com.caucho.quercus.lib.OptionsModule.php_uname (mode);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : phpinfo */
final public void phpinfo (@Optional("-1") int what) {
  com.caucho.quercus.lib.OptionsModule.phpinfo (quercus_context,what);
}
final public void phpinfo () {
 int what = -1;

  com.caucho.quercus.lib.OptionsModule.phpinfo (quercus_context,what);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : phpversion */
final public StringValue phpversion (@Optional StringValue module) {
 return com.caucho.quercus.lib.OptionsModule.phpversion (quercus_context,module);
}
final public StringValue phpversion () {
 StringValue module = new ConstStringValue("");

 return com.caucho.quercus.lib.OptionsModule.phpversion (quercus_context,module);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : putenv */
final public boolean putenv (StringValue settings) {
 return com.caucho.quercus.lib.OptionsModule.putenv (quercus_context,settings);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : restore_include_path */
final public Value restore_include_path () {
 return com.caucho.quercus.lib.OptionsModule.restore_include_path (quercus_context);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : set_include_path */
final public String set_include_path (String includePath) {
 return com.caucho.quercus.lib.OptionsModule.set_include_path (quercus_context,includePath);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : set_magic_quotes_runtime */
final public Value set_magic_quotes_runtime (Value value) {
 return com.caucho.quercus.lib.OptionsModule.set_magic_quotes_runtime (quercus_context,value);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : set_time_limit */
final public Value set_time_limit (long seconds) {
 return com.caucho.quercus.lib.OptionsModule.set_time_limit (quercus_context,seconds);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : sys_get_temp_dir */
final public String sys_get_temp_dir () {
 return com.caucho.quercus.lib.OptionsModule.sys_get_temp_dir (quercus_context);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : version_compare */
final public Value version_compare (StringValue version1,StringValue version2,@Optional("cmp") String op) {
 return com.caucho.quercus.lib.OptionsModule.version_compare (quercus_context,version1,version2,op);
}
final public Value version_compare (StringValue version1, StringValue version2) {
 String op = null;

 return com.caucho.quercus.lib.OptionsModule.version_compare (quercus_context,version1,version2,op);
}


/* ./com/caucho/quercus/lib/OptionsModule.java : zend_version */
final public String zend_version () {
 return com.caucho.quercus.lib.OptionsModule.zend_version ();
}


/* ./com/caucho/quercus/lib/OutputModule.java : ob_clean */
final public Value ob_clean () {
 return com.caucho.quercus.lib.OutputModule.ob_clean (quercus_context);
}


/* ./com/caucho/quercus/lib/OutputModule.java : ob_end_clean */
final public boolean ob_end_clean () {
 return com.caucho.quercus.lib.OutputModule.ob_end_clean (quercus_context);
}


/* ./com/caucho/quercus/lib/OutputModule.java : ob_end_flush */
final public boolean ob_end_flush () {
 return com.caucho.quercus.lib.OutputModule.ob_end_flush (quercus_context);
}


/* ./com/caucho/quercus/lib/OutputModule.java : ob_get_clean */
final public Value ob_get_clean () {
 return com.caucho.quercus.lib.OutputModule.ob_get_clean (quercus_context);
}


/* ./com/caucho/quercus/lib/OutputModule.java : ob_get_contents */
final public Value ob_get_contents () {
 return com.caucho.quercus.lib.OutputModule.ob_get_contents (quercus_context);
}


/* ./com/caucho/quercus/lib/OutputModule.java : ob_get_flush */
final public Value ob_get_flush () {
 return com.caucho.quercus.lib.OutputModule.ob_get_flush (quercus_context);
}


/* ./com/caucho/quercus/lib/OutputModule.java : ob_flush */
final public Value ob_flush () {
 return com.caucho.quercus.lib.OutputModule.ob_flush (quercus_context);
}


/* ./com/caucho/quercus/lib/OutputModule.java : ob_get_length */
final public Value ob_get_length () {
 return com.caucho.quercus.lib.OutputModule.ob_get_length (quercus_context);
}


/* ./com/caucho/quercus/lib/OutputModule.java : ob_get_level */
final public Value ob_get_level () {
 return com.caucho.quercus.lib.OutputModule.ob_get_level (quercus_context);
}


/* ./com/caucho/quercus/lib/OutputModule.java : ob_list_handlers */
final public Value ob_list_handlers () {
 return com.caucho.quercus.lib.OutputModule.ob_list_handlers (quercus_context);
}


/* ./com/caucho/quercus/lib/OutputModule.java : ob_get_status */
final public Value ob_get_status (@Optional boolean full_status) {
 return com.caucho.quercus.lib.OutputModule.ob_get_status (quercus_context,full_status);
}
final public Value ob_get_status () {
 boolean full_status = false;

 return com.caucho.quercus.lib.OutputModule.ob_get_status (quercus_context,full_status);
}


/* ./com/caucho/quercus/lib/OutputModule.java : ob_implicit_flush */
final public Value ob_implicit_flush (@Optional("true") boolean flag) {
 return com.caucho.quercus.lib.OutputModule.ob_implicit_flush (quercus_context,flag);
}
final public Value ob_implicit_flush () {
 boolean flag = false;

 return com.caucho.quercus.lib.OutputModule.ob_implicit_flush (quercus_context,flag);
}


/* ./com/caucho/quercus/lib/OutputModule.java : ob_start */
final public boolean ob_start (@Optional Callable callback,@Optional int chunkSize,@Optional("true") boolean erase) {
 return com.caucho.quercus.lib.OutputModule.ob_start (quercus_context,callback,chunkSize,erase);
}
final public boolean ob_start () {
 Callable callback = null;
int chunkSize = 0;
boolean erase = false;

 return com.caucho.quercus.lib.OutputModule.ob_start (quercus_context,callback,chunkSize,erase);
}


/* ./com/caucho/quercus/lib/OutputModule.java : pushUrlRewriter */
final public UrlRewriterCallback pushUrlRewriter () {
 return com.caucho.quercus.lib.OutputModule.pushUrlRewriter (quercus_context);
}


/* ./com/caucho/quercus/lib/OutputModule.java : output_add_rewrite_var */
final public boolean output_add_rewrite_var (String name,String value) {
 return com.caucho.quercus.lib.OutputModule.output_add_rewrite_var (quercus_context,name,value);
}


/* ./com/caucho/quercus/lib/OutputModule.java : output_reset_rewrite_vars */
final public boolean output_reset_rewrite_vars () {
 return com.caucho.quercus.lib.OutputModule.output_reset_rewrite_vars (quercus_context);
}


/* ./com/caucho/quercus/lib/OutputModule.java : ob_gzhandler */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/QuercusModule.java : get_quercus */
final public QuercusContext get_quercus () {
 return com.caucho.quercus.lib.QuercusModule.get_quercus (quercus_context);
}


/* ./com/caucho/quercus/lib/QuercusModule.java : get_env */
final public Env get_env () {
 return com.caucho.quercus.lib.QuercusModule.get_env (quercus_context);
}


/* ./com/caucho/quercus/lib/QuercusModule.java : version */
final public String version () {
 return com.caucho.quercus.lib.QuercusModule.version (quercus_context);
}


/* ./com/caucho/quercus/lib/QuercusModule.java : is_pro */
final public boolean is_pro () {
 return com.caucho.quercus.lib.QuercusModule.is_pro (quercus_context);
}


/* ./com/caucho/quercus/lib/QuercusModule.java : is_compile */
final public boolean is_compile () {
 return com.caucho.quercus.lib.QuercusModule.is_compile (quercus_context);
}


/* ./com/caucho/quercus/lib/QuercusModule.java : is_resin */
final public boolean is_resin () {
 return com.caucho.quercus.lib.QuercusModule.is_resin (quercus_context);
}


/* ./com/caucho/quercus/lib/QuercusModule.java : has_database */
final public boolean has_database () {
 return com.caucho.quercus.lib.QuercusModule.has_database (quercus_context);
}


/* ./com/caucho/quercus/lib/QuercusModule.java : has_request */
final public boolean has_request () {
 return com.caucho.quercus.lib.QuercusModule.has_request (quercus_context);
}


/* ./com/caucho/quercus/lib/QuercusModule.java : get_request */
final public HttpServletRequest get_request () {
 return com.caucho.quercus.lib.QuercusModule.get_request (quercus_context);
}


/* ./com/caucho/quercus/lib/QuercusModule.java : get_servlet_request */
final public HttpServletRequest get_servlet_request () {
 return com.caucho.quercus.lib.QuercusModule.get_servlet_request (quercus_context);
}


/* ./com/caucho/quercus/lib/QuercusModule.java : get_response */
final public HttpServletResponse get_response () {
 return com.caucho.quercus.lib.QuercusModule.get_response (quercus_context);
}


/* ./com/caucho/quercus/lib/QuercusModule.java : get_servlet_response */
final public HttpServletResponse get_servlet_response () {
 return com.caucho.quercus.lib.QuercusModule.get_servlet_response (quercus_context);
}


/* ./com/caucho/quercus/lib/QuercusModule.java : get_servlet_context */
final public ServletContext get_servlet_context () {
 return com.caucho.quercus.lib.QuercusModule.get_servlet_context (quercus_context);
}


/* ./com/caucho/quercus/lib/QuercusModule.java : q_import */
final public void q_import (String name) {
  com.caucho.quercus.lib.QuercusModule.q_import (quercus_context,name);
}


/* ./com/caucho/quercus/lib/reflection/Reflection.java : export */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/reflection/Reflection.java : getModifierNames */
final public ArrayValue getModifierNames (int modifierValue) {
 return com.caucho.quercus.lib.reflection.Reflection.getModifierNames (modifierValue);
}


/* ./com/caucho/quercus/lib/reflection/ReflectionClass.java : __construct */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/reflection/ReflectionClass.java : export */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/reflection/ReflectionExtension.java : __construct */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/reflection/ReflectionExtension.java : export */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/reflection/ReflectionFunction.java : __construct */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/reflection/ReflectionMethod.java : __construct */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/reflection/ReflectionMethod.java : export */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/reflection/ReflectionObject.java : __construct */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/reflection/ReflectionObject.java : export */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/reflection/ReflectionParameter.java : __construct */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/reflection/ReflectionParameter.java : export */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/reflection/ReflectionProperty.java : __construct */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/reflection/ReflectionProperty.java : export */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/reflection/ReflectionProperty.java : create */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : getRegexpCacheSize */
final public int getRegexpCacheSize () {
 return com.caucho.quercus.lib.regexp.RegexpModule.getRegexpCacheSize ();
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : setRegexpCacheSize */
final public void setRegexpCacheSize (int size) {
  com.caucho.quercus.lib.regexp.RegexpModule.setRegexpCacheSize (size);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : ereg */
final public Value ereg (Ereg regexp,StringValue string,@Optional Value regsV) {
 return com.caucho.quercus.lib.regexp.RegexpModule.ereg (quercus_context,regexp,string,regsV);
}
final public Value ereg (Ereg regexp, StringValue string) {
 Value regsV = null;

 return com.caucho.quercus.lib.regexp.RegexpModule.ereg (quercus_context,regexp,string,regsV);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : eregi */
final public Value eregi (Eregi regexp,StringValue string,@Optional Value regsV) {
 return com.caucho.quercus.lib.regexp.RegexpModule.eregi (quercus_context,regexp,string,regsV);
}
final public Value eregi (Eregi regexp, StringValue string) {
 Value regsV = null;

 return com.caucho.quercus.lib.regexp.RegexpModule.eregi (quercus_context,regexp,string,regsV);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : eregImpl */
final public Value eregImpl (Ereg regexp,StringValue string,Value regsV) {
 return com.caucho.quercus.lib.regexp.RegexpModule.eregImpl (quercus_context,regexp,string,regsV);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : compileRegexp */
final public Regexp compileRegexp (StringValue regexpValue) {
 return com.caucho.quercus.lib.regexp.RegexpModule.compileRegexp (regexpValue);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : createRegexp */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : createRegexp */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : createEreg */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : createEreg */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : createEregi */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : createEregi */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : createUnicodeEreg */
final public UnicodeEreg createUnicodeEreg (StringValue pattern) {
 return com.caucho.quercus.lib.regexp.RegexpModule.createUnicodeEreg (quercus_context,pattern);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : createUnicodeEreg */
final public UnicodeEreg createUnicodeEreg (StringValue pattern,String encoding) {
 return com.caucho.quercus.lib.regexp.RegexpModule.createUnicodeEreg (quercus_context,pattern,encoding);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : createUnicodeEregi */
final public UnicodeEregi createUnicodeEregi (StringValue pattern) {
 return com.caucho.quercus.lib.regexp.RegexpModule.createUnicodeEregi (quercus_context,pattern);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : createUnicodeEregi */
final public UnicodeEregi createUnicodeEregi (StringValue pattern,String encoding) {
 return com.caucho.quercus.lib.regexp.RegexpModule.createUnicodeEregi (quercus_context,pattern,encoding);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : preg_last_error */
final public Value preg_last_error () {
 return com.caucho.quercus.lib.regexp.RegexpModule.preg_last_error (quercus_context);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : preg_match */
final public Value preg_match (Regexp regexp,StringValue subject,@Optional Value matchRef,@Optional int flags,@Optional int offset) {
 return com.caucho.quercus.lib.regexp.RegexpModule.preg_match (quercus_context,regexp,subject,matchRef,flags,offset);
}
final public Value preg_match (Regexp regexp, StringValue subject) {
 Value matchRef = null;
int flags = 0;
int offset = 0;

 return com.caucho.quercus.lib.regexp.RegexpModule.preg_match (quercus_context,regexp,subject,matchRef,flags,offset);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : preg_match_all */
final public Value preg_match_all (Regexp regexp,StringValue subject,Value matchRef,@Optional("PREG_PATTERN_ORDER") int flags,@Optional int offset) {
 return com.caucho.quercus.lib.regexp.RegexpModule.preg_match_all (quercus_context,regexp,subject,matchRef,flags,offset);
}
final public Value preg_match_all (Regexp regexp, StringValue subject, Value matchRef) {
 int flags = 0;
int offset = 0;

 return com.caucho.quercus.lib.regexp.RegexpModule.preg_match_all (quercus_context,regexp,subject,matchRef,flags,offset);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : pregMatchAllPatternOrder */
final public LongValue pregMatchAllPatternOrder (RegexpState regexpState,StringValue subject,ArrayValue matches,int flags,int offset) {
 return com.caucho.quercus.lib.regexp.RegexpModule.pregMatchAllPatternOrder (quercus_context,regexpState,subject,matches,flags,offset);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : preg_quote */
final public StringValue preg_quote (StringValue string,@Optional StringValue delim) {
 return com.caucho.quercus.lib.regexp.RegexpModule.preg_quote (string,delim);
}
final public StringValue preg_quote (StringValue string) {
 StringValue delim = new ConstStringValue("");

 return com.caucho.quercus.lib.regexp.RegexpModule.preg_quote (string,delim);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : preg_replace */
final public Value preg_replace (Regexp regexp,Value replacement,Value subject,@Optional("-1") long limit,@Optional Value count) {
 return com.caucho.quercus.lib.regexp.RegexpModule.preg_replace (quercus_context,regexp,replacement,subject,limit,count);
}
final public Value preg_replace (Regexp regexp, Value replacement, Value subject) {
 long limit = -1l;
Value count = null;

 return com.caucho.quercus.lib.regexp.RegexpModule.preg_replace (quercus_context,regexp,replacement,subject,limit,count);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : preg_replace */
final public Value preg_replace (Value pattern,Value replacement,Value subject,@Optional("-1") long limit,@Optional Value count) {
 return com.caucho.quercus.lib.regexp.RegexpModule.preg_replace (quercus_context,pattern,replacement,subject,limit,count);
}
final public Value preg_replace (Value pattern, Value replacement, Value subject) {
 long limit = -1l;
Value count = null;

 return com.caucho.quercus.lib.regexp.RegexpModule.preg_replace (quercus_context,pattern,replacement,subject,limit,count);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : ereg_replace */
final public Value ereg_replace (Value regexpValue,Value replacement,StringValue subject) {
 return com.caucho.quercus.lib.regexp.RegexpModule.ereg_replace (quercus_context,regexpValue,replacement,subject);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : eregi_replace */
final public Value eregi_replace (Value regexpValue,Value replacement,StringValue subject) {
 return com.caucho.quercus.lib.regexp.RegexpModule.eregi_replace (quercus_context,regexpValue,replacement,subject);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : eregReplaceImpl */
final public Value eregReplaceImpl (Ereg regexp,Value replacement,StringValue subject,boolean isCaseInsensitive) {
 return com.caucho.quercus.lib.regexp.RegexpModule.eregReplaceImpl (quercus_context,regexp,replacement,subject,isCaseInsensitive);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : preg_replace_callback */
final public Value preg_replace_callback (Regexp regexp,@NotNull Callable fun,Value subject,@Optional("-1") long limit,@Optional Value count) {
 return com.caucho.quercus.lib.regexp.RegexpModule.preg_replace_callback (quercus_context,regexp,fun,subject,limit,count);
}
final public Value preg_replace_callback (Regexp regexp, @NotNull Callable fun, Value subject) {
 long limit = -1l;
Value count = null;

 return com.caucho.quercus.lib.regexp.RegexpModule.preg_replace_callback (quercus_context,regexp,fun,subject,limit,count);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : preg_replace_callback */
final public Value preg_replace_callback (Value regexpValue,Callable fun,Value subject,@Optional("-1") long limit,@Optional Value count) {
 return com.caucho.quercus.lib.regexp.RegexpModule.preg_replace_callback (quercus_context,regexpValue,fun,subject,limit,count);
}
final public Value preg_replace_callback (Value regexpValue, Callable fun, Value subject) {
 long limit = -1l;
Value count = null;

 return com.caucho.quercus.lib.regexp.RegexpModule.preg_replace_callback (quercus_context,regexpValue,fun,subject,limit,count);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : preg_split */
final public Value preg_split (Regexp regexp,StringValue string,@Optional("-1") long limit,@Optional int flags) {
 return com.caucho.quercus.lib.regexp.RegexpModule.preg_split (quercus_context,regexp,string,limit,flags);
}
final public Value preg_split (Regexp regexp, StringValue string) {
 long limit = -1l;
int flags = 0;

 return com.caucho.quercus.lib.regexp.RegexpModule.preg_split (quercus_context,regexp,string,limit,flags);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : sql_regcase */
final public StringValue sql_regcase (StringValue string) {
 return com.caucho.quercus.lib.regexp.RegexpModule.sql_regcase (string);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : split */
final public Value split (Ereg regexp,StringValue string,@Optional("-1") long limit) {
 return com.caucho.quercus.lib.regexp.RegexpModule.split (quercus_context,regexp,string,limit);
}
final public Value split (Ereg regexp, StringValue string) {
 long limit = -1l;

 return com.caucho.quercus.lib.regexp.RegexpModule.split (quercus_context,regexp,string,limit);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : spliti */
final public Value spliti (Eregi regexp,StringValue string,@Optional("-1") long limit) {
 return com.caucho.quercus.lib.regexp.RegexpModule.spliti (quercus_context,regexp,string,limit);
}
final public Value spliti (Eregi regexp, StringValue string) {
 long limit = -1l;

 return com.caucho.quercus.lib.regexp.RegexpModule.spliti (quercus_context,regexp,string,limit);
}


/* ./com/caucho/quercus/lib/regexp/RegexpModule.java : preg_grep */
final public Value preg_grep (Regexp regexp,ArrayValue input,@Optional("0") int flag) {
 return com.caucho.quercus.lib.regexp.RegexpModule.preg_grep (quercus_context,regexp,input,flag);
}
final public Value preg_grep (Regexp regexp, ArrayValue input) {
 int flag = 0;

 return com.caucho.quercus.lib.regexp.RegexpModule.preg_grep (quercus_context,regexp,input,flag);
}


/* ./com/caucho/quercus/lib/regexp/RegexpState.java : create */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/regexp/RegexpState.java : create */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/regexp/RegexpState.java : free */
final public void free (RegexpState state) {
  com.caucho.quercus.lib.regexp.RegexpState.free (quercus_context,state);
}


/* ./com/caucho/quercus/lib/session/SessionModule.java : session_commit */
final public Value session_commit () {
 return com.caucho.quercus.lib.session.SessionModule.session_commit (quercus_context);
}


/* ./com/caucho/quercus/lib/session/SessionModule.java : session_decode */
final public boolean session_decode (StringValue value) {
 return com.caucho.quercus.lib.session.SessionModule.session_decode (quercus_context,value);
}


/* ./com/caucho/quercus/lib/session/SessionModule.java : session_encode */
final public String session_encode () {
 return com.caucho.quercus.lib.session.SessionModule.session_encode (quercus_context);
}


/* ./com/caucho/quercus/lib/session/SessionModule.java : session_destroy */
final public boolean session_destroy () {
 return com.caucho.quercus.lib.session.SessionModule.session_destroy (quercus_context);
}


/* ./com/caucho/quercus/lib/session/SessionModule.java : session_get_cookie_params */
final public ArrayValue session_get_cookie_params () {
 return com.caucho.quercus.lib.session.SessionModule.session_get_cookie_params (quercus_context);
}


/* ./com/caucho/quercus/lib/session/SessionModule.java : session_id */
final public String session_id (@Optional String id) {
 return com.caucho.quercus.lib.session.SessionModule.session_id (quercus_context,id);
}
final public String session_id () {
 String id = null;

 return com.caucho.quercus.lib.session.SessionModule.session_id (quercus_context,id);
}


/* ./com/caucho/quercus/lib/session/SessionModule.java : session_is_registered */
final public boolean session_is_registered (StringValue name) {
 return com.caucho.quercus.lib.session.SessionModule.session_is_registered (quercus_context,name);
}


/* ./com/caucho/quercus/lib/session/SessionModule.java : session_regenerate_id */
final public boolean session_regenerate_id (@Optional boolean deleteOld) {
 return com.caucho.quercus.lib.session.SessionModule.session_regenerate_id (quercus_context,deleteOld);
}
final public boolean session_regenerate_id () {
 boolean deleteOld = false;

 return com.caucho.quercus.lib.session.SessionModule.session_regenerate_id (quercus_context,deleteOld);
}


/* ./com/caucho/quercus/lib/session/SessionModule.java : session_start */
final public boolean session_start () {
 return com.caucho.quercus.lib.session.SessionModule.session_start (quercus_context);
}


/* ./com/caucho/quercus/lib/session/SessionModule.java : session_write_close */
final public Value session_write_close () {
 return com.caucho.quercus.lib.session.SessionModule.session_write_close (quercus_context);
}


/* ./com/caucho/quercus/lib/simplexml/SimpleXMLElement.java : __construct */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/spl/SplModule.java : class_implements */
final public Value class_implements (Value obj,@Optional boolean autoload) {
 return com.caucho.quercus.lib.spl.SplModule.class_implements (quercus_context,obj,autoload);
}
final public Value class_implements (Value obj) {
 boolean autoload = false;

 return com.caucho.quercus.lib.spl.SplModule.class_implements (quercus_context,obj,autoload);
}


/* ./com/caucho/quercus/lib/spl/SplModule.java : class_parents */
final public Value class_parents (Value obj,@Optional boolean autoload) {
 return com.caucho.quercus.lib.spl.SplModule.class_parents (quercus_context,obj,autoload);
}
final public Value class_parents (Value obj) {
 boolean autoload = false;

 return com.caucho.quercus.lib.spl.SplModule.class_parents (quercus_context,obj,autoload);
}


/* ./com/caucho/quercus/lib/spl/SplModule.java : spl_autoload_register */
final public boolean spl_autoload_register (@Optional Callable fun) {
 return com.caucho.quercus.lib.spl.SplModule.spl_autoload_register (quercus_context,fun);
}
final public boolean spl_autoload_register () {
 Callable fun = null;

 return com.caucho.quercus.lib.spl.SplModule.spl_autoload_register (quercus_context,fun);
}


/* ./com/caucho/quercus/lib/spl/SplModule.java : spl_autoload_unregister */
final public boolean spl_autoload_unregister (Callable fun) {
 return com.caucho.quercus.lib.spl.SplModule.spl_autoload_unregister (quercus_context,fun);
}


/* ./com/caucho/quercus/lib/spl/SplModule.java : spl_autoload_functions */
final public Value spl_autoload_functions () {
 return com.caucho.quercus.lib.spl.SplModule.spl_autoload_functions (quercus_context);
}


/* ./com/caucho/quercus/lib/spl/SplModule.java : spl_autoload_extensions */
final public String spl_autoload_extensions (@Optional String extensions) {
 return com.caucho.quercus.lib.spl.SplModule.spl_autoload_extensions (quercus_context,extensions);
}
final public String spl_autoload_extensions () {
 String extensions = null;

 return com.caucho.quercus.lib.spl.SplModule.spl_autoload_extensions (quercus_context,extensions);
}


/* ./com/caucho/quercus/lib/spl/SplModule.java : spl_autoload */
final public void spl_autoload (String className,@Optional String extensions) {
  com.caucho.quercus.lib.spl.SplModule.spl_autoload (quercus_context,className,extensions);
}
final public void spl_autoload (String className) {
 String extensions = null;

  com.caucho.quercus.lib.spl.SplModule.spl_autoload (quercus_context,className,extensions);
}


/* ./com/caucho/quercus/lib/string/Crypt.java : crypt */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/string/StringModule.java : addcslashes */
final public StringValue addcslashes (StringValue source,String characters) {
 return com.caucho.quercus.lib.string.StringModule.addcslashes (quercus_context,source,characters);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : addslashes */
final public StringValue addslashes (StringValue source) {
 return com.caucho.quercus.lib.string.StringModule.addslashes (source);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : bin2hex */
final public StringValue bin2hex (InputStream is) {
 return com.caucho.quercus.lib.string.StringModule.bin2hex (quercus_context,is);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : chop */
final public StringValue chop (StringValue str,@Optional String charset) {
 return com.caucho.quercus.lib.string.StringModule.chop (quercus_context,str,charset);
}
final public StringValue chop (StringValue str) {
 String charset = null;

 return com.caucho.quercus.lib.string.StringModule.chop (quercus_context,str,charset);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : chr */
final public StringValue chr (long value) {
 return com.caucho.quercus.lib.string.StringModule.chr (quercus_context,value);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : chunk_split */
final public String chunk_split (String body,@Optional("76") int chunkLen,@Optional("\"\\r\\n\"") String end) {
 return com.caucho.quercus.lib.string.StringModule.chunk_split (body,chunkLen,end);
}
final public String chunk_split (String body) {
 int chunkLen = 76;
String end = null;

 return com.caucho.quercus.lib.string.StringModule.chunk_split (body,chunkLen,end);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : convert_cyr_string */
final public String convert_cyr_string (String str,String from,String to) {
 return com.caucho.quercus.lib.string.StringModule.convert_cyr_string (quercus_context,str,from,to);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : convert_uudecode */
final public Value convert_uudecode (StringValue source) {
 return com.caucho.quercus.lib.string.StringModule.convert_uudecode (quercus_context,source);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : convert_uuencode */
final public Value convert_uuencode (StringValue source) {
 return com.caucho.quercus.lib.string.StringModule.convert_uuencode (source);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : count_chars */
final public Value count_chars (StringValue data,@Optional("0") int mode) {
 return com.caucho.quercus.lib.string.StringModule.count_chars (data,mode);
}
final public Value count_chars (StringValue data) {
 int mode = 0;

 return com.caucho.quercus.lib.string.StringModule.count_chars (data,mode);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : crc32 */
final public long crc32 (StringValue str) {
 return com.caucho.quercus.lib.string.StringModule.crc32 (str);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : crypt */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/string/StringModule.java : explode */
final public Value explode (StringValue separator,StringValue string,@Optional("0x7fffffff") long limit) {
 return com.caucho.quercus.lib.string.StringModule.explode (quercus_context,separator,string,limit);
}
final public Value explode (StringValue separator, StringValue string) {
 long limit = 0;

 return com.caucho.quercus.lib.string.StringModule.explode (quercus_context,separator,string,limit);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : fprintf */
final public Value fprintf (@NotNull BinaryOutput os, StringValue format, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.string.StringModule.fprintf (quercus_context,os,format,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/string/StringModule.java : implode */
final public Value implode (Value glueV,@Optional Value piecesV) {
 return com.caucho.quercus.lib.string.StringModule.implode (quercus_context,glueV,piecesV);
}
final public Value implode (Value glueV) {
 Value piecesV = null;

 return com.caucho.quercus.lib.string.StringModule.implode (quercus_context,glueV,piecesV);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : join */
final public Value join (Value glueV,Value piecesV) {
 return com.caucho.quercus.lib.string.StringModule.join (quercus_context,glueV,piecesV);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : localeconv */
final public ArrayValue localeconv () {
 return com.caucho.quercus.lib.string.StringModule.localeconv (quercus_context);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : ltrim */
final public StringValue ltrim (StringValue string,@Optional String characters) {
 return com.caucho.quercus.lib.string.StringModule.ltrim (quercus_context,string,characters);
}
final public StringValue ltrim (StringValue string) {
 String characters = null;

 return com.caucho.quercus.lib.string.StringModule.ltrim (quercus_context,string,characters);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : md5 */
final public Value md5 (InputStream is,@Optional boolean rawOutput) {
 return com.caucho.quercus.lib.string.StringModule.md5 (quercus_context,is,rawOutput);
}
final public Value md5 (InputStream is) {
 boolean rawOutput = false;

 return com.caucho.quercus.lib.string.StringModule.md5 (quercus_context,is,rawOutput);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : md5_file */
final public Value md5_file (Path source,@Optional boolean rawOutput) {
 return com.caucho.quercus.lib.string.StringModule.md5_file (quercus_context,source,rawOutput);
}
final public Value md5_file (Path source) {
 boolean rawOutput = false;

 return com.caucho.quercus.lib.string.StringModule.md5_file (quercus_context,source,rawOutput);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : metaphone */
final public String metaphone (String string) {
 return com.caucho.quercus.lib.string.StringModule.metaphone (string);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : money_format */
final public String money_format (String format,double value) {
 return com.caucho.quercus.lib.string.StringModule.money_format (quercus_context,format,value);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : number_format */
final public String number_format (double value,@Optional int decimals,@Optional Value pointValue,@Optional Value groupValue) {
 return com.caucho.quercus.lib.string.StringModule.number_format (quercus_context,value,decimals,pointValue,groupValue);
}
final public String number_format (double value) {
 int decimals = 0;
Value pointValue = null;
Value groupValue = null;

 return com.caucho.quercus.lib.string.StringModule.number_format (quercus_context,value,decimals,pointValue,groupValue);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : ord */
final public long ord (StringValue string) {
 return com.caucho.quercus.lib.string.StringModule.ord (string);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : parse_str */
final public Value parse_str (StringValue str,@Optional Value ref) {
 return com.caucho.quercus.lib.string.StringModule.parse_str (quercus_context,str,ref);
}
final public Value parse_str (StringValue str) {
 Value ref = null;

 return com.caucho.quercus.lib.string.StringModule.parse_str (quercus_context,str,ref);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : print */
final public long print (Value value) {
 return com.caucho.quercus.lib.string.StringModule.print (quercus_context,value);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : printf */
final public int printf (StringValue format, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.string.StringModule.printf (quercus_context,format,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/string/StringModule.java : quoted_printable_decode */
final public String quoted_printable_decode (String str) {
 return com.caucho.quercus.lib.string.StringModule.quoted_printable_decode (str);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : quotemeta */
final public Value quotemeta (StringValue string) {
 return com.caucho.quercus.lib.string.StringModule.quotemeta (string);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : rtrim */
final public StringValue rtrim (StringValue string,@Optional String characters) {
 return com.caucho.quercus.lib.string.StringModule.rtrim (quercus_context,string,characters);
}
final public StringValue rtrim (StringValue string) {
 String characters = null;

 return com.caucho.quercus.lib.string.StringModule.rtrim (quercus_context,string,characters);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : setlocale */
final public Value setlocale (int category, Value localeArg, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.string.StringModule.setlocale (quercus_context,category,localeArg,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/string/StringModule.java : sha1 */
final public Value sha1 (String source,@Optional boolean rawOutput) {
 return com.caucho.quercus.lib.string.StringModule.sha1 (quercus_context,source,rawOutput);
}
final public Value sha1 (String source) {
 boolean rawOutput = false;

 return com.caucho.quercus.lib.string.StringModule.sha1 (quercus_context,source,rawOutput);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : sha1_file */
final public Value sha1_file (Path source,@Optional boolean rawOutput) {
 return com.caucho.quercus.lib.string.StringModule.sha1_file (quercus_context,source,rawOutput);
}
final public Value sha1_file (Path source) {
 boolean rawOutput = false;

 return com.caucho.quercus.lib.string.StringModule.sha1_file (quercus_context,source,rawOutput);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : soundex */
final public Value soundex (StringValue string) {
 return com.caucho.quercus.lib.string.StringModule.soundex (string);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : sprintf */
final public Value sprintf (StringValue format, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.string.StringModule.sprintf (quercus_context,format,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/string/StringModule.java : sscanf */
final public Value sscanf (StringValue string, StringValue format, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.string.StringModule.sscanf (quercus_context,string,format,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/string/StringModule.java : sscanfOld */
final public Value sscanfOld (StringValue string, StringValue format, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.string.StringModule.sscanfOld (quercus_context,string,format,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/string/StringModule.java : str_ireplace */
final public Value str_ireplace (Value search,Value replace,Value subject,@Optional Value count) {
 return com.caucho.quercus.lib.string.StringModule.str_ireplace (quercus_context,search,replace,subject,count);
}
final public Value str_ireplace (Value search, Value replace, Value subject) {
 Value count = null;

 return com.caucho.quercus.lib.string.StringModule.str_ireplace (quercus_context,search,replace,subject,count);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : str_pad */
final public StringValue str_pad (StringValue string,int length,@Optional("' '") String pad,@Optional("STR_PAD_RIGHT") int type) {
 return com.caucho.quercus.lib.string.StringModule.str_pad (string,length,pad,type);
}
final public StringValue str_pad (StringValue string, int length) {
 String pad = null;
int type = 0;

 return com.caucho.quercus.lib.string.StringModule.str_pad (string,length,pad,type);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : str_repeat */
final public Value str_repeat (StringValue string,int count) {
 return com.caucho.quercus.lib.string.StringModule.str_repeat (string,count);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : str_replace */
final public Value str_replace (Value search,Value replace,Value subject,@Optional Value count) {
 return com.caucho.quercus.lib.string.StringModule.str_replace (quercus_context,search,replace,subject,count);
}
final public Value str_replace (Value search, Value replace, Value subject) {
 Value count = null;

 return com.caucho.quercus.lib.string.StringModule.str_replace (quercus_context,search,replace,subject,count);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : str_rot13 */
final public Value str_rot13 (StringValue string) {
 return com.caucho.quercus.lib.string.StringModule.str_rot13 (string);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : str_shuffle */
final public String str_shuffle (String string) {
 return com.caucho.quercus.lib.string.StringModule.str_shuffle (string);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : str_split */
final public Value str_split (StringValue string,@Optional("1") int chunk) {
 return com.caucho.quercus.lib.string.StringModule.str_split (string,chunk);
}
final public Value str_split (StringValue string) {
 int chunk = 1;

 return com.caucho.quercus.lib.string.StringModule.str_split (string,chunk);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : str_word_count */
final public Value str_word_count (StringValue string,@Optional int format,@Optional String additionalWordCharacters) {
 return com.caucho.quercus.lib.string.StringModule.str_word_count (string,format,additionalWordCharacters);
}
final public Value str_word_count (StringValue string) {
 int format = 0;
String additionalWordCharacters = null;

 return com.caucho.quercus.lib.string.StringModule.str_word_count (string,format,additionalWordCharacters);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strcasecmp */
final public int strcasecmp (StringValue a,StringValue b) {
 return com.caucho.quercus.lib.string.StringModule.strcasecmp (a,b);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strchr */
final public Value strchr (StringValue haystack,Value needle) {
 return com.caucho.quercus.lib.string.StringModule.strchr (quercus_context,haystack,needle);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strcmp */
final public int strcmp (StringValue a,StringValue b) {
 return com.caucho.quercus.lib.string.StringModule.strcmp (a,b);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strcoll */
final public Value strcoll (String a,String b) {
 return com.caucho.quercus.lib.string.StringModule.strcoll (a,b);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strcspn */
final public Value strcspn (StringValue string,StringValue characters,@Optional("0") int offset,@Optional("-2147483648") int length) {
 return com.caucho.quercus.lib.string.StringModule.strcspn (string,characters,offset,length);
}
final public Value strcspn (StringValue string, StringValue characters) {
 int offset = 0;
int length = -2147483648;

 return com.caucho.quercus.lib.string.StringModule.strcspn (string,characters,offset,length);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strip_tags */
final public StringValue strip_tags (StringValue string,@Optional Value allowTags) {
 return com.caucho.quercus.lib.string.StringModule.strip_tags (string,allowTags);
}
final public StringValue strip_tags (StringValue string) {
 Value allowTags = null;

 return com.caucho.quercus.lib.string.StringModule.strip_tags (string,allowTags);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : stripcslashes */
final public String stripcslashes (String source) {
 return com.caucho.quercus.lib.string.StringModule.stripcslashes (source);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : stripos */
final public Value stripos (StringValue haystack,Value needleV,@Optional int offset) {
 return com.caucho.quercus.lib.string.StringModule.stripos (quercus_context,haystack,needleV,offset);
}
final public Value stripos (StringValue haystack, Value needleV) {
 int offset = 0;

 return com.caucho.quercus.lib.string.StringModule.stripos (quercus_context,haystack,needleV,offset);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : stripslashes */
final public StringValue stripslashes (StringValue string) {
 return com.caucho.quercus.lib.string.StringModule.stripslashes (string);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : stristr */
final public Value stristr (StringValue haystack,Value needleV) {
 return com.caucho.quercus.lib.string.StringModule.stristr (haystack,needleV);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strlen */
final public Value strlen (Value value) {
 return com.caucho.quercus.lib.string.StringModule.strlen (value);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strnatcasecmp */
final public int strnatcasecmp (StringValue a,StringValue b) {
 return com.caucho.quercus.lib.string.StringModule.strnatcasecmp (a,b);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strnatcmp */
final public int strnatcmp (StringValue a,StringValue b) {
 return com.caucho.quercus.lib.string.StringModule.strnatcmp (a,b);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strncasecmp */
final public Value strncasecmp (StringValue a,StringValue b,int length) {
 return com.caucho.quercus.lib.string.StringModule.strncasecmp (quercus_context,a,b,length);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strncmp */
final public Value strncmp (StringValue a,StringValue b,int length) {
 return com.caucho.quercus.lib.string.StringModule.strncmp (quercus_context,a,b,length);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strpbrk */
final public Value strpbrk (StringValue haystack,StringValue charList) {
 return com.caucho.quercus.lib.string.StringModule.strpbrk (haystack,charList);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strpos */
final public Value strpos (StringValue haystack,Value needleV,@Optional int offset) {
 return com.caucho.quercus.lib.string.StringModule.strpos (quercus_context,haystack,needleV,offset);
}
final public Value strpos (StringValue haystack, Value needleV) {
 int offset = 0;

 return com.caucho.quercus.lib.string.StringModule.strpos (quercus_context,haystack,needleV,offset);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strrchr */
final public Value strrchr (StringValue haystack,Value needleV) {
 return com.caucho.quercus.lib.string.StringModule.strrchr (haystack,needleV);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strrev */
final public Value strrev (StringValue string) {
 return com.caucho.quercus.lib.string.StringModule.strrev (string);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strripos */
final public Value strripos (String haystack,Value needleV,@Optional Value offsetV) {
 return com.caucho.quercus.lib.string.StringModule.strripos (quercus_context,haystack,needleV,offsetV);
}
final public Value strripos (String haystack, Value needleV) {
 Value offsetV = null;

 return com.caucho.quercus.lib.string.StringModule.strripos (quercus_context,haystack,needleV,offsetV);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strrpos */
final public Value strrpos (StringValue haystack,Value needleV,@Optional Value offsetV) {
 return com.caucho.quercus.lib.string.StringModule.strrpos (quercus_context,haystack,needleV,offsetV);
}
final public Value strrpos (StringValue haystack, Value needleV) {
 Value offsetV = null;

 return com.caucho.quercus.lib.string.StringModule.strrpos (quercus_context,haystack,needleV,offsetV);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strspn */
final public Value strspn (StringValue string,StringValue characters,@Optional int offset,@Optional("-2147483648") int length) {
 return com.caucho.quercus.lib.string.StringModule.strspn (string,characters,offset,length);
}
final public Value strspn (StringValue string, StringValue characters) {
 int offset = 0;
int length = -2147483648;

 return com.caucho.quercus.lib.string.StringModule.strspn (string,characters,offset,length);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strstr */
final public Value strstr (StringValue haystackV,Value needleV) {
 return com.caucho.quercus.lib.string.StringModule.strstr (quercus_context,haystackV,needleV);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strtok */
final public Value strtok (StringValue string1,@Optional Value string2) {
 return com.caucho.quercus.lib.string.StringModule.strtok (quercus_context,string1,string2);
}
final public Value strtok (StringValue string1) {
 Value string2 = null;

 return com.caucho.quercus.lib.string.StringModule.strtok (quercus_context,string1,string2);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strtolower */
final public StringValue strtolower (StringValue string) {
 return com.caucho.quercus.lib.string.StringModule.strtolower (string);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strtoupper */
final public StringValue strtoupper (StringValue string) {
 return com.caucho.quercus.lib.string.StringModule.strtoupper (string);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : strtr */
final public StringValue strtr (StringValue string,Value fromV,@Optional StringValue to) {
 return com.caucho.quercus.lib.string.StringModule.strtr (quercus_context,string,fromV,to);
}
final public StringValue strtr (StringValue string, Value fromV) {
 StringValue to = new ConstStringValue("");

 return com.caucho.quercus.lib.string.StringModule.strtr (quercus_context,string,fromV,to);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : substr */
final public Value substr (StringValue string,int start,@Optional Value lenV) {
 return com.caucho.quercus.lib.string.StringModule.substr (quercus_context,string,start,lenV);
}
final public Value substr (StringValue string, int start) {
 Value lenV = null;

 return com.caucho.quercus.lib.string.StringModule.substr (quercus_context,string,start,lenV);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : substr_compare */
final public Value substr_compare (StringValue mainStr,StringValue str,int offset,@Optional Value lenV,@Optional boolean isCaseInsensitive) {
 return com.caucho.quercus.lib.string.StringModule.substr_compare (quercus_context,mainStr,str,offset,lenV,isCaseInsensitive);
}
final public Value substr_compare (StringValue mainStr, StringValue str, int offset) {
 Value lenV = null;
boolean isCaseInsensitive = false;

 return com.caucho.quercus.lib.string.StringModule.substr_compare (quercus_context,mainStr,str,offset,lenV,isCaseInsensitive);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : substr_count */
final public Value substr_count (StringValue haystackV,StringValue needleV,@Optional int offset,@Optional("-1") int length) {
 return com.caucho.quercus.lib.string.StringModule.substr_count (quercus_context,haystackV,needleV,offset,length);
}
final public Value substr_count (StringValue haystackV, StringValue needleV) {
 int offset = 0;
int length = -1;

 return com.caucho.quercus.lib.string.StringModule.substr_count (quercus_context,haystackV,needleV,offset,length);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : substr_replace */
final public Value substr_replace (Value subjectV,StringValue replacement,Value startV,@Optional Value lengthV) {
 return com.caucho.quercus.lib.string.StringModule.substr_replace (subjectV,replacement,startV,lengthV);
}
final public Value substr_replace (Value subjectV, StringValue replacement, Value startV) {
 Value lengthV = null;

 return com.caucho.quercus.lib.string.StringModule.substr_replace (subjectV,replacement,startV,lengthV);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : trim */
final public Value trim (StringValue string,@Optional String characters) {
 return com.caucho.quercus.lib.string.StringModule.trim (quercus_context,string,characters);
}
final public Value trim (StringValue string) {
 String characters = null;

 return com.caucho.quercus.lib.string.StringModule.trim (quercus_context,string,characters);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : ucfirst */
final public StringValue ucfirst (StringValue string) {
 return com.caucho.quercus.lib.string.StringModule.ucfirst (quercus_context,string);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : ucwords */
final public String ucwords (String string) {
 return com.caucho.quercus.lib.string.StringModule.ucwords (string);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : vprintf */
final public int vprintf (StringValue format,@NotNull ArrayValue array) {
 return com.caucho.quercus.lib.string.StringModule.vprintf (quercus_context,format,array);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : vsprintf */
final public Value vsprintf (StringValue format,@NotNull ArrayValue array) {
 return com.caucho.quercus.lib.string.StringModule.vsprintf (quercus_context,format,array);
}


/* ./com/caucho/quercus/lib/string/StringModule.java : wordwrap */
final public Value wordwrap (@Expect(type=Expect.Type.STRING) Value value,@Optional @Expect(type=Expect.Type.NUMERIC) Value widthV,@Optional @Expect(type=Expect.Type.STRING) Value breakV,@Optional @Expect(type=Expect.Type.BOOLEAN) Value cutV) {
 return com.caucho.quercus.lib.string.StringModule.wordwrap (quercus_context,value,widthV,breakV,cutV);
}


/* ./com/caucho/quercus/lib/string/StringUtility.java : parseStr */
final public Value parseStr (CharSequence str,ArrayValue result,boolean isRef,String encoding) {
 return com.caucho.quercus.lib.string.StringUtility.parseStr (quercus_context,str,result,isRef,encoding);
}


/* ./com/caucho/quercus/lib/string/StringUtility.java : parseStr */
final public Value parseStr (CharSequence str,ArrayValue result,boolean isRef,String encoding,boolean isMagicQuotes,int[] querySeparatorMap) {
 return com.caucho.quercus.lib.string.StringUtility.parseStr (quercus_context,str,result,isRef,encoding,isMagicQuotes,querySeparatorMap);
}


/* ./com/caucho/quercus/lib/string/StringUtility.java : addQueryValue */
final public void addQueryValue (ArrayValue array,String key,String valueStr) {
  com.caucho.quercus.lib.string.StringUtility.addQueryValue (quercus_context,array,key,valueStr);
}


/* ./com/caucho/quercus/lib/TokenModule.java : highlight_file */
final public Value highlight_file (StringValue filename,@Optional boolean isReturn) {
 return com.caucho.quercus.lib.TokenModule.highlight_file (quercus_context,filename,isReturn);
}
final public Value highlight_file (StringValue filename) {
 boolean isReturn = false;

 return com.caucho.quercus.lib.TokenModule.highlight_file (quercus_context,filename,isReturn);
}


/* ./com/caucho/quercus/lib/TokenModule.java : highlight_string */
final public Value highlight_string (StringValue s,@Optional boolean isReturn) {
 return com.caucho.quercus.lib.TokenModule.highlight_string (quercus_context,s,isReturn);
}
final public Value highlight_string (StringValue s) {
 boolean isReturn = false;

 return com.caucho.quercus.lib.TokenModule.highlight_string (quercus_context,s,isReturn);
}


/* ./com/caucho/quercus/lib/TokenModule.java : token_get_all */
final public ArrayValue token_get_all (StringValue s) {
 return com.caucho.quercus.lib.TokenModule.token_get_all (quercus_context,s);
}


/* ./com/caucho/quercus/lib/TokenModule.java : token_name */
final public String token_name (int token) {
 return com.caucho.quercus.lib.TokenModule.token_name (token);
}


/* ./com/caucho/quercus/lib/UrlModule.java : base64_encode */
final public String base64_encode (StringValue s) {
 return com.caucho.quercus.lib.UrlModule.base64_encode (s);
}


/* ./com/caucho/quercus/lib/UrlModule.java : base64_decode */
final public Value base64_decode (StringValue str,@Optional boolean isStrict) {
 return com.caucho.quercus.lib.UrlModule.base64_decode (quercus_context,str,isStrict);
}
final public Value base64_decode (StringValue str) {
 boolean isStrict = false;

 return com.caucho.quercus.lib.UrlModule.base64_decode (quercus_context,str,isStrict);
}


/* ./com/caucho/quercus/lib/UrlModule.java : get_headers */
final public Value get_headers (String urlString,@Optional Value format) {
 return com.caucho.quercus.lib.UrlModule.get_headers (quercus_context,urlString,format);
}
final public Value get_headers (String urlString) {
 Value format = null;

 return com.caucho.quercus.lib.UrlModule.get_headers (quercus_context,urlString,format);
}


/* ./com/caucho/quercus/lib/UrlModule.java : get_meta_tags */
final public Value get_meta_tags (StringValue filename,@Optional("false") boolean use_include_path) {
 return com.caucho.quercus.lib.UrlModule.get_meta_tags (quercus_context,filename,use_include_path);
}
final public Value get_meta_tags (StringValue filename) {
 boolean use_include_path = false;

 return com.caucho.quercus.lib.UrlModule.get_meta_tags (quercus_context,filename,use_include_path);
}


/* ./com/caucho/quercus/lib/UrlModule.java : http_build_query */
final public Value http_build_query (Value formdata,@Optional StringValue numeric_prefix,@Optional("'&'") StringValue separator) {
 return com.caucho.quercus.lib.UrlModule.http_build_query (quercus_context,formdata,numeric_prefix,separator);
}
final public Value http_build_query (Value formdata) {
 StringValue numeric_prefix = new ConstStringValue("");
StringValue separator = new ConstStringValue("'&'");

 return com.caucho.quercus.lib.UrlModule.http_build_query (quercus_context,formdata,numeric_prefix,separator);
}


/* ./com/caucho/quercus/lib/UrlModule.java : parse_url */
final public Value parse_url (StringValue str,@Optional("-1") int component) {
 return com.caucho.quercus.lib.UrlModule.parse_url (quercus_context,str,component);
}
final public Value parse_url (StringValue str) {
 int component = -1;

 return com.caucho.quercus.lib.UrlModule.parse_url (quercus_context,str,component);
}


/* ./com/caucho/quercus/lib/UrlModule.java : rawurldecode */
final public String rawurldecode (String s) {
 return com.caucho.quercus.lib.UrlModule.rawurldecode (s);
}


/* ./com/caucho/quercus/lib/UrlModule.java : rawurlencode */
final public String rawurlencode (String str) {
 return com.caucho.quercus.lib.UrlModule.rawurlencode (str);
}


/* ./com/caucho/quercus/lib/UrlModule.java : urlencode */
final public StringValue urlencode (StringValue str) {
 return com.caucho.quercus.lib.UrlModule.urlencode (str);
}


/* ./com/caucho/quercus/lib/UrlModule.java : urldecode */
final public String urldecode (String s) {
 return com.caucho.quercus.lib.UrlModule.urldecode (s);
}


/* ./com/caucho/quercus/lib/UrlRewriterCallback.java : getInstance */
final public UrlRewriterCallback getInstance () {
 return com.caucho.quercus.lib.UrlRewriterCallback.getInstance (quercus_context);
}


/* ./com/caucho/quercus/lib/UrlRewriterCallback.java : _internal_url_rewriter */
final public Value _internal_url_rewriter (Value buffer) {
 return com.caucho.quercus.lib.UrlRewriterCallback._internal_url_rewriter (quercus_context,buffer);
}


/* ./com/caucho/quercus/lib/VariableModule.java : constant */
final public Value constant (String name) {
 return com.caucho.quercus.lib.VariableModule.constant (quercus_context,name);
}


/* ./com/caucho/quercus/lib/VariableModule.java : debug_zval_dump */
final public Value debug_zval_dump (@ReadOnly Value v) {
 return com.caucho.quercus.lib.VariableModule.debug_zval_dump (quercus_context,v);
}


/* ./com/caucho/quercus/lib/VariableModule.java : define */
final public Value define (StringValue name,Value value,@Optional boolean isCaseInsensitive) {
 return com.caucho.quercus.lib.VariableModule.define (quercus_context,name,value,isCaseInsensitive);
}
final public Value define (StringValue name, Value value) {
 boolean isCaseInsensitive = false;

 return com.caucho.quercus.lib.VariableModule.define (quercus_context,name,value,isCaseInsensitive);
}


/* ./com/caucho/quercus/lib/VariableModule.java : defined */
final public boolean defined (String name) {
 return com.caucho.quercus.lib.VariableModule.defined (quercus_context,name);
}


/* ./com/caucho/quercus/lib/VariableModule.java : doubleval */
final public Value doubleval (@ReadOnly Value v) {
 return com.caucho.quercus.lib.VariableModule.doubleval (v);
}


/* ./com/caucho/quercus/lib/VariableModule.java : empty */
final public boolean empty (@ReadOnly Value v) {
 return com.caucho.quercus.lib.VariableModule.empty (v);
}


/* ./com/caucho/quercus/lib/VariableModule.java : floatval */
final public Value floatval (@ReadOnly Value v) {
 return com.caucho.quercus.lib.VariableModule.floatval (v);
}


/* ./com/caucho/quercus/lib/VariableModule.java : get_defined_vars */
final public Value get_defined_vars () {
 return com.caucho.quercus.lib.VariableModule.get_defined_vars (quercus_context);
}


/* ./com/caucho/quercus/lib/VariableModule.java : get_resource_type */
final public String get_resource_type (Value v) {
 return com.caucho.quercus.lib.VariableModule.get_resource_type (quercus_context,v);
}


/* ./com/caucho/quercus/lib/VariableModule.java : gettype */
final public String gettype (@ReadOnly Value v) {
 return com.caucho.quercus.lib.VariableModule.gettype (v);
}


/* ./com/caucho/quercus/lib/VariableModule.java : import_request_variables */
final public boolean import_request_variables (String types,@Optional String prefix) {
 return com.caucho.quercus.lib.VariableModule.import_request_variables (quercus_context,types,prefix);
}
final public boolean import_request_variables (String types) {
 String prefix = null;

 return com.caucho.quercus.lib.VariableModule.import_request_variables (quercus_context,types,prefix);
}


/* ./com/caucho/quercus/lib/VariableModule.java : intval */
final public Value intval (@ReadOnly Value v) {
 return com.caucho.quercus.lib.VariableModule.intval (v);
}


/* ./com/caucho/quercus/lib/VariableModule.java : intval */
final public long intval (@ReadOnly Value v,int base) {
 return com.caucho.quercus.lib.VariableModule.intval (v,base);
}


/* ./com/caucho/quercus/lib/VariableModule.java : is_array */
final public boolean is_array (@ReadOnly Value v) {
 return com.caucho.quercus.lib.VariableModule.is_array (v);
}


/* ./com/caucho/quercus/lib/VariableModule.java : is_bool */
final public Value is_bool (@ReadOnly Value v) {
 return com.caucho.quercus.lib.VariableModule.is_bool (v);
}


/* ./com/caucho/quercus/lib/VariableModule.java : is_callable */
final public boolean is_callable (Value v,@Optional boolean isSyntaxOnly,@Optional Value nameRef) {
 return com.caucho.quercus.lib.VariableModule.is_callable (quercus_context,v,isSyntaxOnly,nameRef);
}
final public boolean is_callable (Value v) {
 boolean isSyntaxOnly = false;
Value nameRef = null;

 return com.caucho.quercus.lib.VariableModule.is_callable (quercus_context,v,isSyntaxOnly,nameRef);
}


/* ./com/caucho/quercus/lib/VariableModule.java : is_double */
final public boolean is_double (@ReadOnly Value v) {
 return com.caucho.quercus.lib.VariableModule.is_double (v);
}


/* ./com/caucho/quercus/lib/VariableModule.java : is_float */
final public boolean is_float (@ReadOnly Value v) {
 return com.caucho.quercus.lib.VariableModule.is_float (v);
}


/* ./com/caucho/quercus/lib/VariableModule.java : is_int */
final public Value is_int (@ReadOnly Value v) {
 return com.caucho.quercus.lib.VariableModule.is_int (v);
}


/* ./com/caucho/quercus/lib/VariableModule.java : is_integer */
final public Value is_integer (@ReadOnly Value v) {
 return com.caucho.quercus.lib.VariableModule.is_integer (v);
}


/* ./com/caucho/quercus/lib/VariableModule.java : is_long */
final public Value is_long (@ReadOnly Value v) {
 return com.caucho.quercus.lib.VariableModule.is_long (v);
}


/* ./com/caucho/quercus/lib/VariableModule.java : is_null */
final public boolean is_null (@ReadOnly Value v) {
 return com.caucho.quercus.lib.VariableModule.is_null (v);
}


/* ./com/caucho/quercus/lib/VariableModule.java : is_numeric */
final public boolean is_numeric (@ReadOnly Value v) {
 return com.caucho.quercus.lib.VariableModule.is_numeric (quercus_context,v);
}


/* ./com/caucho/quercus/lib/VariableModule.java : is_object */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/VariableModule.java : is_real */
final public boolean is_real (@ReadOnly Value v) {
 return com.caucho.quercus.lib.VariableModule.is_real (v);
}


/* ./com/caucho/quercus/lib/VariableModule.java : is_scalar */
final public boolean is_scalar (@ReadOnly Value v) {
 return com.caucho.quercus.lib.VariableModule.is_scalar (v);
}


/* ./com/caucho/quercus/lib/VariableModule.java : isset */
final public boolean isset (@ReadOnly Value ... vList) {
 return com.caucho.quercus.lib.VariableModule.isset (vList);
}


/* ./com/caucho/quercus/lib/VariableModule.java : print_r */
final public Value print_r (@ReadOnly Value v,@Optional boolean isReturn) {
 return com.caucho.quercus.lib.VariableModule.print_r (quercus_context,v,isReturn);
}
final public Value print_r (@ReadOnly Value v) {
 boolean isReturn = false;

 return com.caucho.quercus.lib.VariableModule.print_r (quercus_context,v,isReturn);
}


/* ./com/caucho/quercus/lib/VariableModule.java : serialize */
final public String serialize (@PassThru @ReadOnly Value v) {
 return com.caucho.quercus.lib.VariableModule.serialize (quercus_context,v);
}


/* ./com/caucho/quercus/lib/VariableModule.java : settype */
final public boolean settype (Value var,String type) {
 return com.caucho.quercus.lib.VariableModule.settype (quercus_context,var,type);
}


/* ./com/caucho/quercus/lib/VariableModule.java : strval */
final public Value strval (@ReadOnly Value v) {
 return com.caucho.quercus.lib.VariableModule.strval (quercus_context,v);
}


/* ./com/caucho/quercus/lib/VariableModule.java : unserialize */
final public Value unserialize (StringValue s) {
 return com.caucho.quercus.lib.VariableModule.unserialize (quercus_context,s);
}


/* ./com/caucho/quercus/lib/VariableModule.java : var_dump */
final public Value var_dump (@PassThru @ReadOnly Value v, Value arg1, Value arg2) {
 return com.caucho.quercus.lib.VariableModule.var_dump (quercus_context,v,new Value[] {arg1,arg2});
}


/* ./com/caucho/quercus/lib/VariableModule.java : var_export */
final public Value var_export (@ReadOnly Value v,@Optional boolean isReturn) {
 return com.caucho.quercus.lib.VariableModule.var_export (quercus_context,v,isReturn);
}
final public Value var_export (@ReadOnly Value v) {
 boolean isReturn = false;

 return com.caucho.quercus.lib.VariableModule.var_export (quercus_context,v,isReturn);
}


/* ./com/caucho/quercus/lib/xml/XmlModule.java : utf8_encode */
final public Value utf8_encode (StringValue str) {
 return com.caucho.quercus.lib.xml.XmlModule.utf8_encode (quercus_context,str);
}


/* ./com/caucho/quercus/lib/xml/XmlModule.java : utf8_decode */
final public Value utf8_decode (StringValue str) {
 return com.caucho.quercus.lib.xml.XmlModule.utf8_decode (quercus_context,str);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_flush */
final public Value xmlwriter_flush (@NotNull XMLWriter w) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_flush (w);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_open_memory */
final public XMLWriter xmlwriter_open_memory () {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_open_memory (quercus_context);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_open_uri */
final public XMLWriter xmlwriter_open_uri (Path path) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_open_uri (quercus_context,path);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_output_memory */
final public Value xmlwriter_output_memory (@NotNull XMLWriter w) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_output_memory (w);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_end_attribute */
final public boolean xmlwriter_end_attribute (@NotNull XMLWriter w) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_end_attribute (w);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_end_cdata */
final public boolean xmlwriter_end_cdata (@NotNull XMLWriter w) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_end_cdata (w);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_end_comment */
final public boolean xmlwriter_end_comment (@NotNull XMLWriter w) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_end_comment (w);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_end_pi */
final public boolean xmlwriter_end_pi (@NotNull XMLWriter w) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_end_pi (w);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_end_document */
final public boolean xmlwriter_end_document (@NotNull XMLWriter w) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_end_document (w);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_end_dtd_attlist */
final public boolean xmlwriter_end_dtd_attlist (@NotNull XMLWriter w) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_end_dtd_attlist (w);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_end_dtd_element */
final public boolean xmlwriter_end_dtd_element (@NotNull XMLWriter w) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_end_dtd_element (w);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_end_dtd_entity */
final public boolean xmlwriter_end_dtd_entity (@NotNull XMLWriter w) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_end_dtd_entity (w);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_end_dtd */
final public boolean xmlwriter_end_dtd (@NotNull XMLWriter w) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_end_dtd (w);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_end_element */
final public boolean xmlwriter_end_element (@NotNull XMLWriter w) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_end_element (quercus_context,w);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_end_element_ns */
final public boolean xmlwriter_end_element_ns (@NotNull XMLWriter w) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_end_element_ns (quercus_context,w);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_full_end_element */
final public boolean xmlwriter_full_end_element (@NotNull XMLWriter w) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_full_end_element (quercus_context,w);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_set_indent */
final public boolean xmlwriter_set_indent (@NotNull XMLWriter w,boolean isIndent) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_set_indent (w,isIndent);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_set_indent_string */
final public boolean xmlwriter_set_indent_string (@NotNull XMLWriter w,StringValue value) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_set_indent_string (w,value);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_start_attribute */
final public boolean xmlwriter_start_attribute (@NotNull XMLWriter w,StringValue name) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_start_attribute (quercus_context,w,name);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_start_attribute_ns */
final public boolean xmlwriter_start_attribute_ns (@NotNull XMLWriter w,StringValue prefix,StringValue name,StringValue uri) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_start_attribute_ns (quercus_context,w,prefix,name,uri);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_start_cdata */
final public boolean xmlwriter_start_cdata (@NotNull XMLWriter w) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_start_cdata (w);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_start_comment */
final public boolean xmlwriter_start_comment (@NotNull XMLWriter w) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_start_comment (w);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_start_document */
final public boolean xmlwriter_start_document (@NotNull XMLWriter w,@Optional StringValue version,@Optional StringValue encoding,@Optional StringValue standalone) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_start_document (quercus_context,w,version,encoding,standalone);
}
final public boolean xmlwriter_start_document (@NotNull XMLWriter w) {
 StringValue version = new ConstStringValue("");
StringValue encoding = new ConstStringValue("");
StringValue standalone = new ConstStringValue("");

 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_start_document (quercus_context,w,version,encoding,standalone);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_start_dtd_attlist */
final public boolean xmlwriter_start_dtd_attlist (@NotNull XMLWriter w,StringValue name) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_start_dtd_attlist (w,name);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_start_dtd_element */
final public boolean xmlwriter_start_dtd_element (@NotNull XMLWriter w,StringValue name) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_start_dtd_element (w,name);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_start_dtd_entity */
final public boolean xmlwriter_start_dtd_entity (@NotNull XMLWriter w,StringValue name) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_start_dtd_entity (w,name);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_start_dtd */
final public boolean xmlwriter_start_dtd (@NotNull XMLWriter w,StringValue name,@Optional StringValue publicId,@Optional StringValue systemId) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_start_dtd (w,name,publicId,systemId);
}
final public boolean xmlwriter_start_dtd (@NotNull XMLWriter w, StringValue name) {
 StringValue publicId = new ConstStringValue("");
StringValue systemId = new ConstStringValue("");

 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_start_dtd (w,name,publicId,systemId);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_start_element */
final public boolean xmlwriter_start_element (@NotNull XMLWriter w,StringValue name) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_start_element (quercus_context,w,name);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_start_element_ns */
final public boolean xmlwriter_start_element_ns (@NotNull XMLWriter w,StringValue prefix,StringValue name,StringValue uri) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_start_element_ns (quercus_context,w,prefix,name,uri);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_start_pi */
final public boolean xmlwriter_start_pi (@NotNull XMLWriter w,StringValue target) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_start_pi (quercus_context,w,target);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_text */
final public boolean xmlwriter_text (@NotNull XMLWriter w,StringValue text) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_text (quercus_context,w,text);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_write_attribute */
final public boolean xmlwriter_write_attribute (@NotNull XMLWriter w,StringValue name,StringValue value) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_write_attribute (quercus_context,w,name,value);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_write_attribute_ns */
final public boolean xmlwriter_write_attribute_ns (@NotNull XMLWriter w,StringValue prefix,StringValue name,StringValue uri,StringValue value) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_write_attribute_ns (quercus_context,w,prefix,name,uri,value);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_write_cdata */
final public boolean xmlwriter_write_cdata (@NotNull XMLWriter w,StringValue value) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_write_cdata (quercus_context,w,value);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_write_comment */
final public boolean xmlwriter_write_comment (@NotNull XMLWriter w,StringValue value) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_write_comment (quercus_context,w,value);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_write_dtd_attlist */
final public boolean xmlwriter_write_dtd_attlist (@NotNull XMLWriter w,StringValue name,StringValue content) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_write_dtd_attlist (quercus_context,w,name,content);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_write_dtd_element */
final public boolean xmlwriter_write_dtd_element (@NotNull XMLWriter w,StringValue name,StringValue content) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_write_dtd_element (quercus_context,w,name,content);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_write_dtd_entity */
final public boolean xmlwriter_write_dtd_entity (@NotNull XMLWriter w,StringValue name,StringValue content) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_write_dtd_entity (quercus_context,w,name,content);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_write_dtd */
final public boolean xmlwriter_write_dtd (@NotNull XMLWriter w,StringValue name,@Optional StringValue publicId,@Optional StringValue systemId,@Optional StringValue subset) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_write_dtd (quercus_context,w,name,publicId,systemId,subset);
}
final public boolean xmlwriter_write_dtd (@NotNull XMLWriter w, StringValue name) {
 StringValue publicId = new ConstStringValue("");
StringValue systemId = new ConstStringValue("");
StringValue subset = new ConstStringValue("");

 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_write_dtd (quercus_context,w,name,publicId,systemId,subset);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_write_element */
final public boolean xmlwriter_write_element (@NotNull XMLWriter w,StringValue name,@Optional StringValue content) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_write_element (quercus_context,w,name,content);
}
final public boolean xmlwriter_write_element (@NotNull XMLWriter w, StringValue name) {
 StringValue content = new ConstStringValue("");

 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_write_element (quercus_context,w,name,content);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_write_element_ns */
final public boolean xmlwriter_write_element_ns (@NotNull XMLWriter w,StringValue prefix,StringValue name,StringValue uri,@Optional StringValue content) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_write_element_ns (quercus_context,w,prefix,name,uri,content);
}
final public boolean xmlwriter_write_element_ns (@NotNull XMLWriter w, StringValue prefix, StringValue name, StringValue uri) {
 StringValue content = new ConstStringValue("");

 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_write_element_ns (quercus_context,w,prefix,name,uri,content);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_write_pi */
final public boolean xmlwriter_write_pi (@NotNull XMLWriter w,StringValue name,StringValue value) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_write_pi (quercus_context,w,name,value);
}


/* ./com/caucho/quercus/lib/xml/XMLWriterModule.java : xmlwriter_write_raw */
final public boolean xmlwriter_write_raw (@NotNull XMLWriter w,StringValue value) {
 return com.caucho.quercus.lib.xml.XMLWriterModule.xmlwriter_write_raw (quercus_context,w,value);
}


/* ./com/caucho/quercus/lib/zlib/ZlibModule.java : gzopen */
final public BinaryStream gzopen (StringValue fileName,String mode,@Optional("false") boolean useIncludePath) {
 return com.caucho.quercus.lib.zlib.ZlibModule.gzopen (quercus_context,fileName,mode,useIncludePath);
}
final public BinaryStream gzopen (StringValue fileName, String mode) {
 boolean useIncludePath = false;

 return com.caucho.quercus.lib.zlib.ZlibModule.gzopen (quercus_context,fileName,mode,useIncludePath);
}


/* ./com/caucho/quercus/lib/zlib/ZlibModule.java : gzfile */
final public ArrayValue gzfile (StringValue fileName,@Optional boolean useIncludePath) {
 return com.caucho.quercus.lib.zlib.ZlibModule.gzfile (quercus_context,fileName,useIncludePath);
}
final public ArrayValue gzfile (StringValue fileName) {
 boolean useIncludePath = false;

 return com.caucho.quercus.lib.zlib.ZlibModule.gzfile (quercus_context,fileName,useIncludePath);
}


/* ./com/caucho/quercus/lib/zlib/ZlibModule.java : ob_gzhandler */
/* EXCLUDED */


/* ./com/caucho/quercus/lib/zlib/ZlibModule.java : readgzfile */
final public Value readgzfile (StringValue fileName,@Optional boolean useIncludePath) {
 return com.caucho.quercus.lib.zlib.ZlibModule.readgzfile (quercus_context,fileName,useIncludePath);
}
final public Value readgzfile (StringValue fileName) {
 boolean useIncludePath = false;

 return com.caucho.quercus.lib.zlib.ZlibModule.readgzfile (quercus_context,fileName,useIncludePath);
}


/* ./com/caucho/quercus/lib/zlib/ZlibModule.java : gzwrite */
final public int gzwrite (@NotNull BinaryOutput os,InputStream is,@Optional("0x7fffffff") int length) {
 return com.caucho.quercus.lib.zlib.ZlibModule.gzwrite (os,is,length);
}
final public int gzwrite (@NotNull BinaryOutput os, InputStream is) {
 int length = 0;

 return com.caucho.quercus.lib.zlib.ZlibModule.gzwrite (os,is,length);
}


/* ./com/caucho/quercus/lib/zlib/ZlibModule.java : gzgetc */
final public Value gzgetc (@NotNull BinaryInput is) {
 return com.caucho.quercus.lib.zlib.ZlibModule.gzgetc (quercus_context,is);
}


/* ./com/caucho/quercus/lib/zlib/ZlibModule.java : gzgets */
final public Value gzgets (@NotNull BinaryInput is,int length) {
 return com.caucho.quercus.lib.zlib.ZlibModule.gzgets (quercus_context,is,length);
}


/* ./com/caucho/quercus/lib/zlib/ZlibModule.java : gzgetss */
final public Value gzgetss (@NotNull BinaryInput is,int length,@Optional Value allowedTags) {
 return com.caucho.quercus.lib.zlib.ZlibModule.gzgetss (quercus_context,is,length,allowedTags);
}
final public Value gzgetss (@NotNull BinaryInput is, int length) {
 Value allowedTags = null;

 return com.caucho.quercus.lib.zlib.ZlibModule.gzgetss (quercus_context,is,length,allowedTags);
}
}
