package haxe.crypto;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Base64 extends haxe.lang.HxObject
{
	static
	{
		//line 29 "/usr/share/haxe/std/haxe/crypto/Base64.hx"
		haxe.crypto.Base64.CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
		//line 30 "/usr/share/haxe/std/haxe/crypto/Base64.hx"
		haxe.crypto.Base64.BYTES = haxe.io.Bytes.ofString(haxe.crypto.Base64.CHARS, null);
	}
	
	public Base64(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Base64()
	{
		//line 28 "/usr/share/haxe/std/haxe/crypto/Base64.hx"
		haxe.crypto.Base64.__hx_ctor_haxe_crypto_Base64(this);
	}
	
	
	protected static void __hx_ctor_haxe_crypto_Base64(haxe.crypto.Base64 __hx_this)
	{
	}
	
	
	public static java.lang.String CHARS;
	
	public static haxe.io.Bytes BYTES;
	
	public static haxe.io.Bytes decode(java.lang.String str, java.lang.Object complement)
	{
		//line 48 "/usr/share/haxe/std/haxe/crypto/Base64.hx"
		boolean complement1 = ( (haxe.lang.Runtime.eq(complement, null)) ? (true) : (haxe.lang.Runtime.toBool(((java.lang.Boolean) (complement) ))) );
		//line 49 "/usr/share/haxe/std/haxe/crypto/Base64.hx"
		if (complement1) 
		{
			//line 50 "/usr/share/haxe/std/haxe/crypto/Base64.hx"
			while (haxe.lang.Runtime.eq(haxe.lang.StringExt.charCodeAt(str, ( str.length() - 1 )), 61))
			{
				//line 51 "/usr/share/haxe/std/haxe/crypto/Base64.hx"
				str = haxe.lang.StringExt.substr(str, 0, -1);
			}
			
		}
		
		//line 52 "/usr/share/haxe/std/haxe/crypto/Base64.hx"
		return new haxe.crypto.BaseCode(((haxe.io.Bytes) (haxe.crypto.Base64.BYTES) )).decodeBytes(haxe.io.Bytes.ofString(str, null));
	}
	
	
}


