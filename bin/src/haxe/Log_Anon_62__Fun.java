package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Log_Anon_62__Fun extends haxe.lang.Function
{
	public Log_Anon_62__Fun()
	{
		//line 62 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Log.hx"
		super(2, 0);
	}
	
	
	public static haxe.Log_Anon_62__Fun __hx_current;
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 62 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Log.hx"
		java.lang.Object infos = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((java.lang.Object) (__fn_float2) )) : (( (( __fn_dyn2 == null )) ? (null) : (((java.lang.Object) (__fn_dyn2) )) )) );
		//line 62 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Log.hx"
		java.lang.Object v = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((java.lang.Object) (__fn_float1) )) : (((java.lang.Object) (__fn_dyn1) )) );
		//line 63 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Log.hx"
		java.lang.String str = haxe.Log.formatOutput(v, infos);
		//line 70 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Log.hx"
		java.lang.System.out.println(((java.lang.Object) (str) ));
		//line 62 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Log.hx"
		return null;
	}
	
	
}


