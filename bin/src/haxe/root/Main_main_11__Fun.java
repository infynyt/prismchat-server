package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Main_main_11__Fun extends haxe.lang.Function
{
	public Main_main_11__Fun()
	{
		//line 11 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
		super(1, 0);
	}
	
	
	public static haxe.root.Main_main_11__Fun __hx_current;
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 11 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
		hx_webserver.HTTPRequest d = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((hx_webserver.HTTPRequest) (((java.lang.Object) (__fn_float1) )) )) : (((hx_webserver.HTTPRequest) (__fn_dyn1) )) );
		//line 12 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, d.postData, 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Main", "src/Main.hx", "main"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (12) )) )}));
		//line 13 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
		d.reply("hi", null);
		//line 11 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
		return null;
	}
	
	
}


