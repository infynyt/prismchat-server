package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringTools extends haxe.lang.HxObject
{
	public StringTools(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public StringTools()
	{
		//line 38 "/usr/share/haxe/std/StringTools.hx"
		haxe.root.StringTools.__hx_ctor__StringTools(this);
	}
	
	
	protected static void __hx_ctor__StringTools(haxe.root.StringTools __hx_this)
	{
	}
	
	
	public static boolean isSpace(java.lang.String s, int pos)
	{
		//line 283 "/usr/share/haxe/std/StringTools.hx"
		java.lang.Object c = haxe.lang.StringExt.charCodeAt(s, pos);
		//line 284 "/usr/share/haxe/std/StringTools.hx"
		if ( ! ((( ( ((int) (haxe.lang.Runtime.toInt(c)) ) > 8 ) && ( ((int) (haxe.lang.Runtime.toInt(c)) ) < 14 ) ))) ) 
		{
			//line 284 "/usr/share/haxe/std/StringTools.hx"
			return haxe.lang.Runtime.eq(c, 32);
		}
		else
		{
			//line 284 "/usr/share/haxe/std/StringTools.hx"
			return true;
		}
		
	}
	
	
	public static java.lang.String ltrim(java.lang.String s)
	{
		//line 300 "/usr/share/haxe/std/StringTools.hx"
		int l = s.length();
		//line 301 "/usr/share/haxe/std/StringTools.hx"
		int r = 0;
		//line 302 "/usr/share/haxe/std/StringTools.hx"
		while (( ( r < l ) && haxe.root.StringTools.isSpace(s, r) ))
		{
			//line 303 "/usr/share/haxe/std/StringTools.hx"
			 ++ r;
		}
		
		//line 305 "/usr/share/haxe/std/StringTools.hx"
		if (( r > 0 )) 
		{
			//line 306 "/usr/share/haxe/std/StringTools.hx"
			return haxe.lang.StringExt.substr(s, r, ( l - r ));
		}
		else
		{
			//line 308 "/usr/share/haxe/std/StringTools.hx"
			return s;
		}
		
	}
	
	
	public static java.lang.String lpad(java.lang.String s, java.lang.String c, int l)
	{
		//line 366 "/usr/share/haxe/std/StringTools.hx"
		if (( c.length() <= 0 )) 
		{
			//line 367 "/usr/share/haxe/std/StringTools.hx"
			return s;
		}
		
		//line 369 "/usr/share/haxe/std/StringTools.hx"
		haxe.root.StringBuf buf = new haxe.root.StringBuf();
		//line 370 "/usr/share/haxe/std/StringTools.hx"
		l -= s.length();
		//line 371 "/usr/share/haxe/std/StringTools.hx"
		while (( buf.b.length() < l ))
		{
			//line 372 "/usr/share/haxe/std/StringTools.hx"
			buf.add(haxe.lang.Runtime.toString(c));
			//line 372 "/usr/share/haxe/std/StringTools.hx"
			java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
		}
		
		//line 374 "/usr/share/haxe/std/StringTools.hx"
		buf.add(haxe.lang.Runtime.toString(s));
		//line 374 "/usr/share/haxe/std/StringTools.hx"
		java.lang.Object __temp_expr2 = ((java.lang.Object) (null) );
		//line 375 "/usr/share/haxe/std/StringTools.hx"
		return buf.toString();
	}
	
	
}


