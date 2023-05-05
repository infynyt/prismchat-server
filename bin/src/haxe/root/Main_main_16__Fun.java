package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Main_main_16__Fun extends haxe.lang.Function
{
	public Main_main_16__Fun()
	{
		//line 16 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
		super(1, 0);
	}
	
	
	public static haxe.root.Main_main_16__Fun __hx_current;
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 16 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
		hx_webserver.HTTPRequest d = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((hx_webserver.HTTPRequest) (((java.lang.Object) (__fn_float1) )) )) : (((hx_webserver.HTTPRequest) (__fn_dyn1) )) );
		//line 17 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, new haxe.format.JsonParser(haxe.lang.Runtime.toString(haxe.crypto.Base64.decode(haxe.lang.StringExt.substring(d.postData, 2, d.postData.length()), null).toString())).doParse(), 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Main", "src/Main.hx", "main"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (17) )) )}));
		//line 19 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
		d.close();
		//line 16 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
		return null;
	}
	
	
}


