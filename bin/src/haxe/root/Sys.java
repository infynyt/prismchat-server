package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Sys extends haxe.lang.HxObject
{
	public Sys(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Sys()
	{
		//line 28 "/usr/share/haxe/std/java/_std/Sys.hx"
		haxe.root.Sys.__hx_ctor__Sys(this);
	}
	
	
	protected static void __hx_ctor__Sys(haxe.root.Sys __hx_this)
	{
	}
	
	
	public static java.lang.String getCwd()
	{
		//line 79 "/usr/share/haxe/std/java/_std/Sys.hx"
		return haxe.lang.StringExt.substr(new java.io.File(haxe.lang.Runtime.toString(".")).getAbsolutePath(), 0, -1);
	}
	
	
	public static double time()
	{
		//line 132 "/usr/share/haxe/std/java/_std/Sys.hx"
		return ( ((double) (java.lang.System.currentTimeMillis()) ) / 1000 );
	}
	
	
	public static haxe.io.Output stderr()
	{
		//line 162 "/usr/share/haxe/std/java/_std/Sys.hx"
		return new haxe.java.io.NativeOutput(((java.io.OutputStream) (java.lang.System.err) ));
	}
	
	
}


