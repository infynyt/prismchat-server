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
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		haxe.root.Sys.__hx_ctor__Sys(this);
	}
	
	
	protected static void __hx_ctor__Sys(haxe.root.Sys __hx_this)
	{
	}
	
	
	public static double time()
	{
		//line 132 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return ( ((double) (java.lang.System.currentTimeMillis()) ) / 1000 );
	}
	
	
	public static haxe.io.Output stderr()
	{
		//line 162 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return new haxe.java.io.NativeOutput(((java.io.OutputStream) (java.lang.System.err) ));
	}
	
	
}


