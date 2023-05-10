package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Array<T> extends haxe.lang.HxObject
{
	
	public Array(T[] _native)
	{
		this.__a = _native;
		this.length = _native.length;
	}
	static
	{
		//line 39 "/usr/share/haxe/std/java/_std/Array.hx"
		haxe.root.Array.__hx_toString_depth = 0;
		//line 40 "/usr/share/haxe/std/java/_std/Array.hx"
		haxe.root.Array.__hx_defaultCapacity = 4;
	}
	
	public Array(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Array()
	{
		//line 70 "/usr/share/haxe/std/java/_std/Array.hx"
		haxe.root.Array.__hx_ctor__Array(((haxe.root.Array<T>) (this) ));
		//line 70 "/usr/share/haxe/std/java/_std/Array.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
	}
	
	
	public static <T_c> void __hx_ctor__Array(haxe.root.Array<T_c> __hx_this)
	{
		//line 71 "/usr/share/haxe/std/java/_std/Array.hx"
		__hx_this.length = 0;
		//line 72 "/usr/share/haxe/std/java/_std/Array.hx"
		__hx_this.__a = ((T_c[]) (((java.lang.Object) (new java.lang.Object[0]) )) );
	}
	
	
	public static int __hx_toString_depth;
	
	public static int __hx_defaultCapacity;
	
	public static <X> haxe.root.Array<X> ofNative(X[] _native)
	{
		
			return new Array<X>(_native);
	
	}
	
	
	public static <Y> haxe.root.Array<Y> alloc(int size)
	{
		
			return new Array<Y>((Y[]) ((java.lang.Object)new java.lang.Object[size]));
	
	}
	
	
	public int length;
	
	public T[] __a;
	
	public final haxe.root.Array<T> concat(haxe.root.Array<T> a)
	{
		//line 76 "/usr/share/haxe/std/java/_std/Array.hx"
		int length = this.length;
		//line 77 "/usr/share/haxe/std/java/_std/Array.hx"
		int len = ( length + a.length );
		//line 78 "/usr/share/haxe/std/java/_std/Array.hx"
		T[] retarr = ((T[]) (((java.lang.Object) (new java.lang.Object[len]) )) );
		//line 79 "/usr/share/haxe/std/java/_std/Array.hx"
		java.lang.System.arraycopy(((java.lang.Object) (this.__a) ), ((int) (0) ), ((java.lang.Object) (retarr) ), ((int) (0) ), ((int) (length) ));
		//line 80 "/usr/share/haxe/std/java/_std/Array.hx"
		java.lang.System.arraycopy(((java.lang.Object) (a.__a) ), ((int) (0) ), ((java.lang.Object) (retarr) ), ((int) (length) ), ((int) (a.length) ));
		//line 82 "/usr/share/haxe/std/java/_std/Array.hx"
		return ((haxe.root.Array<T>) (haxe.root.Array.ofNative(((T[]) (retarr) ))) );
	}
	
	
	public final void concatNative(T[] a)
	{
		//line 86 "/usr/share/haxe/std/java/_std/Array.hx"
		T[] __a = this.__a;
		//line 87 "/usr/share/haxe/std/java/_std/Array.hx"
		int length = this.length;
		//line 88 "/usr/share/haxe/std/java/_std/Array.hx"
		int len = ( length + a.length );
		//line 89 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( __a.length >= len )) 
		{
			//line 90 "/usr/share/haxe/std/java/_std/Array.hx"
			java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (0) ), ((java.lang.Object) (__a) ), ((int) (length) ), ((int) (length) ));
		}
		else
		{
			//line 92 "/usr/share/haxe/std/java/_std/Array.hx"
			T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[len]) )) );
			//line 93 "/usr/share/haxe/std/java/_std/Array.hx"
			java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (length) ));
			//line 94 "/usr/share/haxe/std/java/_std/Array.hx"
			java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (length) ), ((int) (a.length) ));
			//line 96 "/usr/share/haxe/std/java/_std/Array.hx"
			this.__a = newarr;
		}
		
		//line 99 "/usr/share/haxe/std/java/_std/Array.hx"
		this.length = len;
	}
	
	
	public final java.lang.String join(java.lang.String sep)
	{
		//line 103 "/usr/share/haxe/std/java/_std/Array.hx"
		haxe.root.StringBuf buf = new haxe.root.StringBuf();
		//line 104 "/usr/share/haxe/std/java/_std/Array.hx"
		int i = -1;
		//line 106 "/usr/share/haxe/std/java/_std/Array.hx"
		boolean first = true;
		//line 107 "/usr/share/haxe/std/java/_std/Array.hx"
		int length = this.length;
		//line 108 "/usr/share/haxe/std/java/_std/Array.hx"
		while ((  ++ i < length ))
		{
			//line 109 "/usr/share/haxe/std/java/_std/Array.hx"
			if (first) 
			{
				//line 110 "/usr/share/haxe/std/java/_std/Array.hx"
				first = false;
			}
			else
			{
				//line 112 "/usr/share/haxe/std/java/_std/Array.hx"
				buf.add(haxe.lang.Runtime.toString(sep));
				//line 112 "/usr/share/haxe/std/java/_std/Array.hx"
				java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
			}
			
			//line 113 "/usr/share/haxe/std/java/_std/Array.hx"
			buf.add(((T) (this.__a[i]) ));
			//line 113 "/usr/share/haxe/std/java/_std/Array.hx"
			java.lang.Object __temp_expr2 = ((java.lang.Object) (null) );
		}
		
		//line 116 "/usr/share/haxe/std/java/_std/Array.hx"
		return buf.toString();
	}
	
	
	public final java.lang.Object pop()
	{
		//line 120 "/usr/share/haxe/std/java/_std/Array.hx"
		T[] __a = this.__a;
		//line 121 "/usr/share/haxe/std/java/_std/Array.hx"
		int length = this.length;
		//line 122 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( length > 0 )) 
		{
			//line 123 "/usr/share/haxe/std/java/_std/Array.hx"
			T val = __a[ -- length];
			//line 124 "/usr/share/haxe/std/java/_std/Array.hx"
			__a[length] = null;
			//line 125 "/usr/share/haxe/std/java/_std/Array.hx"
			this.length = length;
			//line 127 "/usr/share/haxe/std/java/_std/Array.hx"
			return val;
		}
		else
		{
			//line 129 "/usr/share/haxe/std/java/_std/Array.hx"
			return null;
		}
		
	}
	
	
	public final int push(T x)
	{
		//line 134 "/usr/share/haxe/std/java/_std/Array.hx"
		int length = this.length;
		//line 135 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( length >= this.__a.length )) 
		{
			//line 136 "/usr/share/haxe/std/java/_std/Array.hx"
			int newLen = ( (( length == 0 )) ? (4) : (( length << 1 )) );
			//line 137 "/usr/share/haxe/std/java/_std/Array.hx"
			T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[newLen]) )) );
			//line 138 "/usr/share/haxe/std/java/_std/Array.hx"
			java.lang.System.arraycopy(((java.lang.Object) (this.__a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (this.__a.length) ));
			//line 140 "/usr/share/haxe/std/java/_std/Array.hx"
			this.__a = newarr;
		}
		
		//line 143 "/usr/share/haxe/std/java/_std/Array.hx"
		this.__a[length] = x;
		//line 144 "/usr/share/haxe/std/java/_std/Array.hx"
		return  ++ this.length;
	}
	
	
	public final void reverse()
	{
		//line 148 "/usr/share/haxe/std/java/_std/Array.hx"
		int i = 0;
		//line 149 "/usr/share/haxe/std/java/_std/Array.hx"
		int l = this.length;
		//line 150 "/usr/share/haxe/std/java/_std/Array.hx"
		T[] a = this.__a;
		//line 151 "/usr/share/haxe/std/java/_std/Array.hx"
		int half = ( l >> 1 );
		//line 152 "/usr/share/haxe/std/java/_std/Array.hx"
		 -- l;
		//line 153 "/usr/share/haxe/std/java/_std/Array.hx"
		while (( i < half ))
		{
			//line 154 "/usr/share/haxe/std/java/_std/Array.hx"
			T tmp = a[i];
			//line 155 "/usr/share/haxe/std/java/_std/Array.hx"
			a[i] = a[( l - i )];
			//line 156 "/usr/share/haxe/std/java/_std/Array.hx"
			a[( l - i )] = tmp;
			//line 157 "/usr/share/haxe/std/java/_std/Array.hx"
			 ++ i;
		}
		
	}
	
	
	public final java.lang.Object shift()
	{
		//line 162 "/usr/share/haxe/std/java/_std/Array.hx"
		int l = this.length;
		//line 163 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( l == 0 )) 
		{
			//line 164 "/usr/share/haxe/std/java/_std/Array.hx"
			return null;
		}
		
		//line 166 "/usr/share/haxe/std/java/_std/Array.hx"
		T[] a = this.__a;
		//line 167 "/usr/share/haxe/std/java/_std/Array.hx"
		T x = a[0];
		//line 168 "/usr/share/haxe/std/java/_std/Array.hx"
		 -- l;
		//line 169 "/usr/share/haxe/std/java/_std/Array.hx"
		java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (1) ), ((java.lang.Object) (a) ), ((int) (0) ), ((int) (( this.length - 1 )) ));
		//line 170 "/usr/share/haxe/std/java/_std/Array.hx"
		a[l] = null;
		//line 171 "/usr/share/haxe/std/java/_std/Array.hx"
		this.length = l;
		//line 173 "/usr/share/haxe/std/java/_std/Array.hx"
		return x;
	}
	
	
	public final haxe.root.Array<T> slice(int pos, java.lang.Object end)
	{
		//line 177 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( pos < 0 )) 
		{
			//line 178 "/usr/share/haxe/std/java/_std/Array.hx"
			pos = ( this.length + pos );
			//line 179 "/usr/share/haxe/std/java/_std/Array.hx"
			if (( pos < 0 )) 
			{
				//line 180 "/usr/share/haxe/std/java/_std/Array.hx"
				pos = 0;
			}
			
		}
		
		//line 182 "/usr/share/haxe/std/java/_std/Array.hx"
		if (haxe.lang.Runtime.eq(end, null)) 
		{
			//line 183 "/usr/share/haxe/std/java/_std/Array.hx"
			end = this.length;
		}
		else
		{
			//line 184 "/usr/share/haxe/std/java/_std/Array.hx"
			if (( ((int) (haxe.lang.Runtime.toInt(end)) ) < 0 )) 
			{
				//line 185 "/usr/share/haxe/std/java/_std/Array.hx"
				end = ((int) (haxe.lang.Runtime.toInt(haxe.lang.Runtime.plus(this.length, end))) );
			}
			
		}
		
		//line 186 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( ((int) (haxe.lang.Runtime.toInt(end)) ) > this.length )) 
		{
			//line 187 "/usr/share/haxe/std/java/_std/Array.hx"
			end = this.length;
		}
		
		//line 188 "/usr/share/haxe/std/java/_std/Array.hx"
		int len = ( ((int) (haxe.lang.Runtime.toInt(end)) ) - ((int) (pos) ) );
		//line 189 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( len < 0 )) 
		{
			//line 190 "/usr/share/haxe/std/java/_std/Array.hx"
			return new haxe.root.Array<T>();
		}
		
		//line 192 "/usr/share/haxe/std/java/_std/Array.hx"
		T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[len]) )) );
		//line 193 "/usr/share/haxe/std/java/_std/Array.hx"
		java.lang.System.arraycopy(((java.lang.Object) (this.__a) ), ((int) (pos) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (len) ));
		//line 195 "/usr/share/haxe/std/java/_std/Array.hx"
		return ((haxe.root.Array<T>) (haxe.root.Array.ofNative(((T[]) (newarr) ))) );
	}
	
	
	public final void sort(haxe.lang.Function f)
	{
		//line 199 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( this.length == 0 )) 
		{
			//line 200 "/usr/share/haxe/std/java/_std/Array.hx"
			return ;
		}
		
		//line 201 "/usr/share/haxe/std/java/_std/Array.hx"
		this.quicksort(0, ( this.length - 1 ), f);
	}
	
	
	public final void quicksort(int lo, int hi, haxe.lang.Function f)
	{
		//line 205 "/usr/share/haxe/std/java/_std/Array.hx"
		T[] buf = this.__a;
		//line 206 "/usr/share/haxe/std/java/_std/Array.hx"
		int i = lo;
		//line 206 "/usr/share/haxe/std/java/_std/Array.hx"
		int j = hi;
		//line 207 "/usr/share/haxe/std/java/_std/Array.hx"
		T p = buf[( ( i + j ) >> 1 )];
		//line 208 "/usr/share/haxe/std/java/_std/Array.hx"
		while (( i <= j ))
		{
			//line 209 "/usr/share/haxe/std/java/_std/Array.hx"
			while (( ( i < hi ) && ( ((int) (f.__hx_invoke2_f(0.0, buf[i], 0.0, p)) ) < 0 ) ))
			{
				//line 210 "/usr/share/haxe/std/java/_std/Array.hx"
				 ++ i;
			}
			
			//line 211 "/usr/share/haxe/std/java/_std/Array.hx"
			while (( ( j > lo ) && ( ((int) (f.__hx_invoke2_f(0.0, buf[j], 0.0, p)) ) > 0 ) ))
			{
				//line 212 "/usr/share/haxe/std/java/_std/Array.hx"
				 -- j;
			}
			
			//line 213 "/usr/share/haxe/std/java/_std/Array.hx"
			if (( i <= j )) 
			{
				//line 214 "/usr/share/haxe/std/java/_std/Array.hx"
				T t = buf[i];
				//line 215 "/usr/share/haxe/std/java/_std/Array.hx"
				buf[i++] = buf[j];
				//line 216 "/usr/share/haxe/std/java/_std/Array.hx"
				buf[j--] = t;
			}
			
		}
		
		//line 220 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( lo < j )) 
		{
			//line 221 "/usr/share/haxe/std/java/_std/Array.hx"
			this.quicksort(lo, j, f);
		}
		
		//line 222 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( i < hi )) 
		{
			//line 223 "/usr/share/haxe/std/java/_std/Array.hx"
			this.quicksort(i, hi, f);
		}
		
	}
	
	
	public final haxe.root.Array<T> splice(int pos, int len)
	{
		//line 227 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( len < 0 )) 
		{
			//line 228 "/usr/share/haxe/std/java/_std/Array.hx"
			return new haxe.root.Array<T>();
		}
		
		//line 229 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( pos < 0 )) 
		{
			//line 230 "/usr/share/haxe/std/java/_std/Array.hx"
			pos = ( this.length + pos );
			//line 231 "/usr/share/haxe/std/java/_std/Array.hx"
			if (( pos < 0 )) 
			{
				//line 232 "/usr/share/haxe/std/java/_std/Array.hx"
				pos = 0;
			}
			
		}
		
		//line 234 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( pos > this.length )) 
		{
			//line 235 "/usr/share/haxe/std/java/_std/Array.hx"
			pos = 0;
			//line 236 "/usr/share/haxe/std/java/_std/Array.hx"
			len = 0;
		}
		else
		{
			//line 237 "/usr/share/haxe/std/java/_std/Array.hx"
			if (( ( pos + len ) > this.length )) 
			{
				//line 238 "/usr/share/haxe/std/java/_std/Array.hx"
				len = ( this.length - pos );
				//line 239 "/usr/share/haxe/std/java/_std/Array.hx"
				if (( len < 0 )) 
				{
					//line 240 "/usr/share/haxe/std/java/_std/Array.hx"
					len = 0;
				}
				
			}
			
		}
		
		//line 242 "/usr/share/haxe/std/java/_std/Array.hx"
		T[] a = this.__a;
		//line 244 "/usr/share/haxe/std/java/_std/Array.hx"
		T[] ret = ((T[]) (((java.lang.Object) (new java.lang.Object[len]) )) );
		//line 245 "/usr/share/haxe/std/java/_std/Array.hx"
		java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (pos) ), ((java.lang.Object) (ret) ), ((int) (0) ), ((int) (len) ));
		//line 246 "/usr/share/haxe/std/java/_std/Array.hx"
		haxe.root.Array<T> ret1 = ((haxe.root.Array<T>) (haxe.root.Array.ofNative(((T[]) (ret) ))) );
		//line 248 "/usr/share/haxe/std/java/_std/Array.hx"
		int end = ( pos + len );
		//line 249 "/usr/share/haxe/std/java/_std/Array.hx"
		java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (end) ), ((java.lang.Object) (a) ), ((int) (pos) ), ((int) (( this.length - end )) ));
		//line 250 "/usr/share/haxe/std/java/_std/Array.hx"
		this.length -= len;
		//line 251 "/usr/share/haxe/std/java/_std/Array.hx"
		while ((  -- len >= 0 ))
		{
			//line 252 "/usr/share/haxe/std/java/_std/Array.hx"
			a[( this.length + len )] = null;
		}
		
		//line 253 "/usr/share/haxe/std/java/_std/Array.hx"
		return ret1;
	}
	
	
	public final void spliceVoid(int pos, int len)
	{
		//line 257 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( len < 0 )) 
		{
			//line 258 "/usr/share/haxe/std/java/_std/Array.hx"
			return ;
		}
		
		//line 259 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( pos < 0 )) 
		{
			//line 260 "/usr/share/haxe/std/java/_std/Array.hx"
			pos = ( this.length + pos );
			//line 261 "/usr/share/haxe/std/java/_std/Array.hx"
			if (( pos < 0 )) 
			{
				//line 262 "/usr/share/haxe/std/java/_std/Array.hx"
				pos = 0;
			}
			
		}
		
		//line 264 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( pos > this.length )) 
		{
			//line 265 "/usr/share/haxe/std/java/_std/Array.hx"
			pos = 0;
			//line 266 "/usr/share/haxe/std/java/_std/Array.hx"
			len = 0;
		}
		else
		{
			//line 267 "/usr/share/haxe/std/java/_std/Array.hx"
			if (( ( pos + len ) > this.length )) 
			{
				//line 268 "/usr/share/haxe/std/java/_std/Array.hx"
				len = ( this.length - pos );
				//line 269 "/usr/share/haxe/std/java/_std/Array.hx"
				if (( len < 0 )) 
				{
					//line 270 "/usr/share/haxe/std/java/_std/Array.hx"
					len = 0;
				}
				
			}
			
		}
		
		//line 272 "/usr/share/haxe/std/java/_std/Array.hx"
		T[] a = this.__a;
		//line 274 "/usr/share/haxe/std/java/_std/Array.hx"
		int end = ( pos + len );
		//line 275 "/usr/share/haxe/std/java/_std/Array.hx"
		java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (end) ), ((java.lang.Object) (a) ), ((int) (pos) ), ((int) (( this.length - end )) ));
		//line 276 "/usr/share/haxe/std/java/_std/Array.hx"
		this.length -= len;
		//line 277 "/usr/share/haxe/std/java/_std/Array.hx"
		while ((  -- len >= 0 ))
		{
			//line 278 "/usr/share/haxe/std/java/_std/Array.hx"
			a[( this.length + len )] = null;
		}
		
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 282 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( haxe.root.Array.__hx_toString_depth >= 5 )) 
		{
			//line 283 "/usr/share/haxe/std/java/_std/Array.hx"
			return "...";
		}
		
		//line 285 "/usr/share/haxe/std/java/_std/Array.hx"
		 ++ haxe.root.Array.__hx_toString_depth;
		//line 286 "/usr/share/haxe/std/java/_std/Array.hx"
		try 
		{
			//line 287 "/usr/share/haxe/std/java/_std/Array.hx"
			java.lang.String s = this.__hx_toString();
			//line 288 "/usr/share/haxe/std/java/_std/Array.hx"
			 -- haxe.root.Array.__hx_toString_depth;
			//line 289 "/usr/share/haxe/std/java/_std/Array.hx"
			return s;
		}
		catch (java.lang.Throwable _g)
		{
			//line 290 "/usr/share/haxe/std/java/_std/Array.hx"
			java.lang.Object e = ((java.lang.Object) (haxe.Exception.caught(_g).unwrap()) );
			//line 291 "/usr/share/haxe/std/java/_std/Array.hx"
			 -- haxe.root.Array.__hx_toString_depth;
			//line 292 "/usr/share/haxe/std/java/_std/Array.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(e)) );
		}
		
		
	}
	
	
	public final java.lang.String __hx_toString()
	{
		//line 297 "/usr/share/haxe/std/java/_std/Array.hx"
		haxe.root.StringBuf ret = new haxe.root.StringBuf();
		//line 298 "/usr/share/haxe/std/java/_std/Array.hx"
		T[] a = this.__a;
		//line 299 "/usr/share/haxe/std/java/_std/Array.hx"
		ret.add(haxe.lang.Runtime.toString("["));
		//line 299 "/usr/share/haxe/std/java/_std/Array.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
		//line 300 "/usr/share/haxe/std/java/_std/Array.hx"
		boolean first = true;
		//line 301 "/usr/share/haxe/std/java/_std/Array.hx"
		{
			//line 301 "/usr/share/haxe/std/java/_std/Array.hx"
			int _g = 0;
			//line 301 "/usr/share/haxe/std/java/_std/Array.hx"
			int _g1 = this.length;
			//line 301 "/usr/share/haxe/std/java/_std/Array.hx"
			while (( _g < _g1 ))
			{
				//line 301 "/usr/share/haxe/std/java/_std/Array.hx"
				int i = _g++;
				//line 302 "/usr/share/haxe/std/java/_std/Array.hx"
				if (first) 
				{
					//line 303 "/usr/share/haxe/std/java/_std/Array.hx"
					first = false;
				}
				else
				{
					//line 305 "/usr/share/haxe/std/java/_std/Array.hx"
					ret.add(haxe.lang.Runtime.toString(","));
					//line 305 "/usr/share/haxe/std/java/_std/Array.hx"
					java.lang.Object __temp_expr2 = ((java.lang.Object) (null) );
				}
				
				//line 306 "/usr/share/haxe/std/java/_std/Array.hx"
				ret.add(((T) (a[i]) ));
				//line 306 "/usr/share/haxe/std/java/_std/Array.hx"
				java.lang.Object __temp_expr3 = ((java.lang.Object) (null) );
			}
			
		}
		
		//line 309 "/usr/share/haxe/std/java/_std/Array.hx"
		ret.add(haxe.lang.Runtime.toString("]"));
		//line 309 "/usr/share/haxe/std/java/_std/Array.hx"
		java.lang.Object __temp_expr4 = ((java.lang.Object) (null) );
		//line 310 "/usr/share/haxe/std/java/_std/Array.hx"
		return ret.toString();
	}
	
	
	public final void unshift(T x)
	{
		//line 314 "/usr/share/haxe/std/java/_std/Array.hx"
		T[] __a = this.__a;
		//line 315 "/usr/share/haxe/std/java/_std/Array.hx"
		int length = this.length;
		//line 316 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( length >= __a.length )) 
		{
			//line 317 "/usr/share/haxe/std/java/_std/Array.hx"
			int newLen = ( (( length << 1 )) + 1 );
			//line 318 "/usr/share/haxe/std/java/_std/Array.hx"
			T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[newLen]) )) );
			//line 319 "/usr/share/haxe/std/java/_std/Array.hx"
			java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (1) ), ((int) (length) ));
			//line 321 "/usr/share/haxe/std/java/_std/Array.hx"
			this.__a = newarr;
		}
		else
		{
			//line 323 "/usr/share/haxe/std/java/_std/Array.hx"
			java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (__a) ), ((int) (1) ), ((int) (length) ));
		}
		
		//line 326 "/usr/share/haxe/std/java/_std/Array.hx"
		this.__a[0] = x;
		//line 327 "/usr/share/haxe/std/java/_std/Array.hx"
		 ++ this.length;
	}
	
	
	public final void insert(int pos, T x)
	{
		//line 331 "/usr/share/haxe/std/java/_std/Array.hx"
		int l = this.length;
		//line 332 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( pos < 0 )) 
		{
			//line 333 "/usr/share/haxe/std/java/_std/Array.hx"
			pos = ( l + pos );
			//line 334 "/usr/share/haxe/std/java/_std/Array.hx"
			if (( pos < 0 )) 
			{
				//line 335 "/usr/share/haxe/std/java/_std/Array.hx"
				pos = 0;
			}
			
		}
		
		//line 337 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( pos >= l )) 
		{
			//line 338 "/usr/share/haxe/std/java/_std/Array.hx"
			this.push(x);
			//line 339 "/usr/share/haxe/std/java/_std/Array.hx"
			return ;
		}
		else
		{
			//line 340 "/usr/share/haxe/std/java/_std/Array.hx"
			if (( pos == 0 )) 
			{
				//line 341 "/usr/share/haxe/std/java/_std/Array.hx"
				this.unshift(x);
				//line 342 "/usr/share/haxe/std/java/_std/Array.hx"
				return ;
			}
			
		}
		
		//line 345 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( l >= this.__a.length )) 
		{
			//line 346 "/usr/share/haxe/std/java/_std/Array.hx"
			int newLen = ( (( this.length << 1 )) + 1 );
			//line 347 "/usr/share/haxe/std/java/_std/Array.hx"
			T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[newLen]) )) );
			//line 348 "/usr/share/haxe/std/java/_std/Array.hx"
			java.lang.System.arraycopy(((java.lang.Object) (this.__a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (pos) ));
			//line 349 "/usr/share/haxe/std/java/_std/Array.hx"
			newarr[pos] = x;
			//line 350 "/usr/share/haxe/std/java/_std/Array.hx"
			java.lang.System.arraycopy(((java.lang.Object) (this.__a) ), ((int) (pos) ), ((java.lang.Object) (newarr) ), ((int) (( pos + 1 )) ), ((int) (( l - pos )) ));
			//line 352 "/usr/share/haxe/std/java/_std/Array.hx"
			this.__a = newarr;
			//line 353 "/usr/share/haxe/std/java/_std/Array.hx"
			 ++ this.length;
		}
		else
		{
			//line 355 "/usr/share/haxe/std/java/_std/Array.hx"
			T[] __a = this.__a;
			//line 356 "/usr/share/haxe/std/java/_std/Array.hx"
			java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (pos) ), ((java.lang.Object) (__a) ), ((int) (( pos + 1 )) ), ((int) (( l - pos )) ));
			//line 357 "/usr/share/haxe/std/java/_std/Array.hx"
			java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (__a) ), ((int) (0) ), ((int) (pos) ));
			//line 358 "/usr/share/haxe/std/java/_std/Array.hx"
			__a[pos] = x;
			//line 359 "/usr/share/haxe/std/java/_std/Array.hx"
			 ++ this.length;
		}
		
	}
	
	
	public final boolean remove(T x)
	{
		//line 364 "/usr/share/haxe/std/java/_std/Array.hx"
		T[] __a = this.__a;
		//line 365 "/usr/share/haxe/std/java/_std/Array.hx"
		int i = -1;
		//line 366 "/usr/share/haxe/std/java/_std/Array.hx"
		int length = this.length;
		//line 367 "/usr/share/haxe/std/java/_std/Array.hx"
		while ((  ++ i < length ))
		{
			//line 368 "/usr/share/haxe/std/java/_std/Array.hx"
			if (haxe.lang.Runtime.eq(__a[i], x)) 
			{
				//line 369 "/usr/share/haxe/std/java/_std/Array.hx"
				java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (( i + 1 )) ), ((java.lang.Object) (__a) ), ((int) (i) ), ((int) (( ( length - i ) - 1 )) ));
				//line 370 "/usr/share/haxe/std/java/_std/Array.hx"
				__a[ -- this.length] = null;
				//line 372 "/usr/share/haxe/std/java/_std/Array.hx"
				return true;
			}
			
		}
		
		//line 376 "/usr/share/haxe/std/java/_std/Array.hx"
		return false;
	}
	
	
	public final boolean contains(T x)
	{
		//line 380 "/usr/share/haxe/std/java/_std/Array.hx"
		T[] __a = this.__a;
		//line 381 "/usr/share/haxe/std/java/_std/Array.hx"
		int i = -1;
		//line 382 "/usr/share/haxe/std/java/_std/Array.hx"
		int length = this.length;
		//line 383 "/usr/share/haxe/std/java/_std/Array.hx"
		while ((  ++ i < length ))
		{
			//line 384 "/usr/share/haxe/std/java/_std/Array.hx"
			if (haxe.lang.Runtime.eq(__a[i], x)) 
			{
				//line 385 "/usr/share/haxe/std/java/_std/Array.hx"
				return true;
			}
			
		}
		
		//line 387 "/usr/share/haxe/std/java/_std/Array.hx"
		return false;
	}
	
	
	public final int indexOf(T x, java.lang.Object fromIndex)
	{
		//line 391 "/usr/share/haxe/std/java/_std/Array.hx"
		int len = this.length;
		//line 391 "/usr/share/haxe/std/java/_std/Array.hx"
		T[] a = this.__a;
		//line 391 "/usr/share/haxe/std/java/_std/Array.hx"
		int i = ( (haxe.lang.Runtime.eq(fromIndex, null)) ? (0) : (((int) (haxe.lang.Runtime.toInt(fromIndex)) )) );
		//line 392 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( i < 0 )) 
		{
			//line 393 "/usr/share/haxe/std/java/_std/Array.hx"
			i += len;
			//line 394 "/usr/share/haxe/std/java/_std/Array.hx"
			if (( i < 0 )) 
			{
				//line 395 "/usr/share/haxe/std/java/_std/Array.hx"
				i = 0;
			}
			
		}
		
		//line 397 "/usr/share/haxe/std/java/_std/Array.hx"
		while (( i < len ))
		{
			//line 398 "/usr/share/haxe/std/java/_std/Array.hx"
			if (haxe.lang.Runtime.eq(a[i], x)) 
			{
				//line 399 "/usr/share/haxe/std/java/_std/Array.hx"
				return i;
			}
			
			//line 400 "/usr/share/haxe/std/java/_std/Array.hx"
			 ++ i;
		}
		
		//line 402 "/usr/share/haxe/std/java/_std/Array.hx"
		return -1;
	}
	
	
	public final int lastIndexOf(T x, java.lang.Object fromIndex)
	{
		//line 406 "/usr/share/haxe/std/java/_std/Array.hx"
		int len = this.length;
		//line 406 "/usr/share/haxe/std/java/_std/Array.hx"
		T[] a = this.__a;
		//line 406 "/usr/share/haxe/std/java/_std/Array.hx"
		int i = ( (haxe.lang.Runtime.eq(fromIndex, null)) ? (( len - 1 )) : (((int) (haxe.lang.Runtime.toInt(fromIndex)) )) );
		//line 409 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( i >= len )) 
		{
			//line 410 "/usr/share/haxe/std/java/_std/Array.hx"
			i = ( len - 1 );
		}
		else
		{
			//line 411 "/usr/share/haxe/std/java/_std/Array.hx"
			if (( i < 0 )) 
			{
				//line 412 "/usr/share/haxe/std/java/_std/Array.hx"
				i += len;
			}
			
		}
		
		//line 413 "/usr/share/haxe/std/java/_std/Array.hx"
		while (( i >= 0 ))
		{
			//line 414 "/usr/share/haxe/std/java/_std/Array.hx"
			if (haxe.lang.Runtime.eq(a[i], x)) 
			{
				//line 415 "/usr/share/haxe/std/java/_std/Array.hx"
				return i;
			}
			
			//line 416 "/usr/share/haxe/std/java/_std/Array.hx"
			 -- i;
		}
		
		//line 418 "/usr/share/haxe/std/java/_std/Array.hx"
		return -1;
	}
	
	
	public final haxe.root.Array<T> copy()
	{
		//line 422 "/usr/share/haxe/std/java/_std/Array.hx"
		int len = this.length;
		//line 423 "/usr/share/haxe/std/java/_std/Array.hx"
		T[] __a = this.__a;
		//line 424 "/usr/share/haxe/std/java/_std/Array.hx"
		T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[len]) )) );
		//line 425 "/usr/share/haxe/std/java/_std/Array.hx"
		java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (len) ));
		//line 426 "/usr/share/haxe/std/java/_std/Array.hx"
		return ((haxe.root.Array<T>) (haxe.root.Array.ofNative(((T[]) (newarr) ))) );
	}
	
	
	public final haxe.iterators.ArrayIterator<T> iterator()
	{
		//line 430 "/usr/share/haxe/std/java/_std/Array.hx"
		return new haxe.iterators.ArrayIterator<T>(((haxe.root.Array<T>) (this) ));
	}
	
	
	public final haxe.iterators.ArrayKeyValueIterator<T> keyValueIterator()
	{
		//line 434 "/usr/share/haxe/std/java/_std/Array.hx"
		return new haxe.iterators.ArrayKeyValueIterator<T>(((haxe.root.Array<T>) (this) ));
	}
	
	
	public final void resize(int len)
	{
		//line 438 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( this.length < len )) 
		{
			//line 439 "/usr/share/haxe/std/java/_std/Array.hx"
			if (( this.__a.length < len )) 
			{
				//line 440 "/usr/share/haxe/std/java/_std/Array.hx"
				T[] newArr = ((T[]) (((java.lang.Object) (new java.lang.Object[len]) )) );
				//line 441 "/usr/share/haxe/std/java/_std/Array.hx"
				if (( this.length > 0 )) 
				{
					//line 442 "/usr/share/haxe/std/java/_std/Array.hx"
					java.lang.System.arraycopy(((java.lang.Object) (this.__a) ), ((int) (0) ), ((java.lang.Object) (newArr) ), ((int) (0) ), ((int) (this.length) ));
				}
				
				//line 443 "/usr/share/haxe/std/java/_std/Array.hx"
				this.__a = this.__a = newArr;
			}
			
			//line 445 "/usr/share/haxe/std/java/_std/Array.hx"
			this.length = len;
		}
		else
		{
			//line 446 "/usr/share/haxe/std/java/_std/Array.hx"
			if (( this.length > len )) 
			{
				//line 447 "/usr/share/haxe/std/java/_std/Array.hx"
				this.spliceVoid(len, ( this.length - len ));
			}
			
		}
		
	}
	
	
	public final <S> haxe.root.Array<S> map(haxe.lang.Function f)
	{
		//line 452 "/usr/share/haxe/std/java/_std/Array.hx"
		haxe.root.Array<S> ret = ((haxe.root.Array<S>) (((haxe.root.Array) (haxe.root.Array.alloc(((int) (this.length) ))) )) );
		//line 453 "/usr/share/haxe/std/java/_std/Array.hx"
		{
			//line 453 "/usr/share/haxe/std/java/_std/Array.hx"
			int _g = 0;
			//line 453 "/usr/share/haxe/std/java/_std/Array.hx"
			int _g1 = this.length;
			//line 453 "/usr/share/haxe/std/java/_std/Array.hx"
			while (( _g < _g1 ))
			{
				//line 453 "/usr/share/haxe/std/java/_std/Array.hx"
				int i = _g++;
				//line 454 "/usr/share/haxe/std/java/_std/Array.hx"
				ret.__set(i, ((S) (f.__hx_invoke1_o(0.0, this.__get(i))) ));
			}
			
		}
		
		//line 455 "/usr/share/haxe/std/java/_std/Array.hx"
		return ret;
	}
	
	
	public final haxe.root.Array<T> filter(haxe.lang.Function f)
	{
		//line 459 "/usr/share/haxe/std/java/_std/Array.hx"
		haxe.root.Array<T> ret = new haxe.root.Array<T>(( (T[]) (new java.lang.Object[] {}) ));
		//line 460 "/usr/share/haxe/std/java/_std/Array.hx"
		{
			//line 460 "/usr/share/haxe/std/java/_std/Array.hx"
			int _g = 0;
			//line 460 "/usr/share/haxe/std/java/_std/Array.hx"
			int _g1 = this.length;
			//line 460 "/usr/share/haxe/std/java/_std/Array.hx"
			while (( _g < _g1 ))
			{
				//line 460 "/usr/share/haxe/std/java/_std/Array.hx"
				int i = _g++;
				//line 461 "/usr/share/haxe/std/java/_std/Array.hx"
				T elt = this.__get(i);
				//line 462 "/usr/share/haxe/std/java/_std/Array.hx"
				if (haxe.lang.Runtime.toBool(((java.lang.Boolean) (f.__hx_invoke1_o(0.0, elt)) ))) 
				{
					//line 463 "/usr/share/haxe/std/java/_std/Array.hx"
					ret.push(elt);
				}
				
			}
			
		}
		
		//line 465 "/usr/share/haxe/std/java/_std/Array.hx"
		return ret;
	}
	
	
	public final T __get(int idx)
	{
		//line 469 "/usr/share/haxe/std/java/_std/Array.hx"
		T[] __a = this.__a;
		//line 470 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( ( idx >= __a.length ) || ( idx < 0 ) )) 
		{
			//line 471 "/usr/share/haxe/std/java/_std/Array.hx"
			return null;
		}
		
		//line 473 "/usr/share/haxe/std/java/_std/Array.hx"
		return __a[idx];
	}
	
	
	public final T __set(int idx, T v)
	{
		//line 478 "/usr/share/haxe/std/java/_std/Array.hx"
		T[] __a = this.__a;
		//line 479 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( idx >= __a.length )) 
		{
			//line 480 "/usr/share/haxe/std/java/_std/Array.hx"
			int newl = ( idx + 1 );
			//line 481 "/usr/share/haxe/std/java/_std/Array.hx"
			if (( idx == __a.length )) 
			{
				//line 482 "/usr/share/haxe/std/java/_std/Array.hx"
				newl = ( (( idx << 1 )) + 1 );
			}
			
			//line 483 "/usr/share/haxe/std/java/_std/Array.hx"
			T[] newArr = ((T[]) (((java.lang.Object) (new java.lang.Object[newl]) )) );
			//line 484 "/usr/share/haxe/std/java/_std/Array.hx"
			if (( this.length > 0 )) 
			{
				//line 485 "/usr/share/haxe/std/java/_std/Array.hx"
				java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (newArr) ), ((int) (0) ), ((int) (this.length) ));
			}
			
			//line 486 "/usr/share/haxe/std/java/_std/Array.hx"
			__a = newArr;
			//line 486 "/usr/share/haxe/std/java/_std/Array.hx"
			this.__a = __a;
		}
		
		//line 489 "/usr/share/haxe/std/java/_std/Array.hx"
		if (( idx >= this.length )) 
		{
			//line 490 "/usr/share/haxe/std/java/_std/Array.hx"
			this.length = ( idx + 1 );
		}
		
		//line 492 "/usr/share/haxe/std/java/_std/Array.hx"
		return __a[idx] = v;
	}
	
	
	public final T __unsafe_get(int idx)
	{
		//line 496 "/usr/share/haxe/std/java/_std/Array.hx"
		return this.__a[idx];
	}
	
	
	public final T __unsafe_set(int idx, T val)
	{
		//line 500 "/usr/share/haxe/std/java/_std/Array.hx"
		return this.__a[idx] = val;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
		{
			//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
			boolean __temp_executeDef1 = true;
			//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
			if (( field != null )) 
			{
				//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
				switch (field.hashCode())
				{
					case -1106363674:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("length")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							this.length = ((int) (value) );
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return value;
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
			if (__temp_executeDef1) 
			{
				//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
		{
			//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
			boolean __temp_executeDef1 = true;
			//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
			if (( field != null )) 
			{
				//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
				switch (field.hashCode())
				{
					case 94337:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("__a")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							this.__a = ((T[]) (value) );
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return value;
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -1106363674:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("length")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							this.length = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return value;
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
			if (__temp_executeDef1) 
			{
				//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
		{
			//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
			boolean __temp_executeDef1 = true;
			//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
			if (( field != null )) 
			{
				//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
				switch (field.hashCode())
				{
					case -537840087:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("__unsafe_set")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "__unsafe_set")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -1106363674:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("length")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.length;
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -537851619:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("__unsafe_get")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "__unsafe_get")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 94337:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("__a")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.__a;
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 90678402:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("__set")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "__set")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -1354795244:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("concat")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "concat")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 90666870:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("__get")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "__get")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -1238494133:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("concatNative")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "concatNative")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -1274492040:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("filter")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "filter")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 3267882:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("join")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "join")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 107868:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("map")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "map")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 111185:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("pop")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "pop")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -934437708:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("resize")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "resize")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 3452698:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("push")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "push")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -955047712:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("keyValueIterator")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "keyValueIterator")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 1099846370:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("reverse")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "reverse")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 1182533742:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("iterator")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "iterator")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 109407362:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("shift")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "shift")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 3059573:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("copy")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "copy")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 109526418:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("slice")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "slice")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -467511597:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("lastIndexOf")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "lastIndexOf")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 3536286:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("sort")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "sort")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 1943291465:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("indexOf")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "indexOf")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 1301699851:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("quicksort")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "quicksort")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -567445985:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("contains")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "contains")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -895859076:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("splice")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "splice")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -934610812:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("remove")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "remove")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -821858768:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("spliceVoid")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "spliceVoid")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -1183792455:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("insert")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "insert")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -1776922004:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("toString")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -277637751:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("unshift")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "unshift")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -128126757:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("__hx_toString")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "__hx_toString")) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
			if (__temp_executeDef1) 
			{
				//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
		{
			//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
			boolean __temp_executeDef1 = true;
			//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
			if (( field != null )) 
			{
				//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
				switch (field.hashCode())
				{
					case -1106363674:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("length")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((double) (this.length) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
			if (__temp_executeDef1) 
			{
				//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
		{
			//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
			boolean __temp_executeDef1 = true;
			//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
			if (( field != null )) 
			{
				//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
				switch (field.hashCode())
				{
					case -537840087:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("__unsafe_set")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.__unsafe_set(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), ((T) (dynargs[1]) ));
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -1354795244:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("concat")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.concat(((haxe.root.Array<T>) (dynargs[0]) ));
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -537851619:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("__unsafe_get")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.__unsafe_get(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ));
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -1238494133:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("concatNative")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							this.concatNative(((T[]) (dynargs[0]) ));
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 90678402:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("__set")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.__set(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), ((T) (dynargs[1]) ));
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 3267882:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("join")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.join(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 90666870:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("__get")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.__get(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ));
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 111185:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("pop")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.pop();
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -1274492040:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("filter")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.filter(((haxe.lang.Function) (dynargs[0]) ));
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 3452698:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("push")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.push(((T) (dynargs[0]) ));
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 107868:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("map")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return ((haxe.root.Array<java.lang.Object>) (this.map(((haxe.lang.Function) (dynargs[0]) ))) );
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 1099846370:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("reverse")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							this.reverse();
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -934437708:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("resize")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							this.resize(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ));
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 109407362:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("shift")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.shift();
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -955047712:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("keyValueIterator")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.keyValueIterator();
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 109526418:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("slice")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.slice(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), ( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) ));
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 1182533742:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("iterator")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.iterator();
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 3536286:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("sort")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							this.sort(((haxe.lang.Function) (dynargs[0]) ));
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 3059573:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("copy")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.copy();
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 1301699851:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("quicksort")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							this.quicksort(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), ((int) (haxe.lang.Runtime.toInt(dynargs[1])) ), ((haxe.lang.Function) (dynargs[2]) ));
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -467511597:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("lastIndexOf")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.lastIndexOf(((T) (dynargs[0]) ), ( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) ));
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -895859076:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("splice")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.splice(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), ((int) (haxe.lang.Runtime.toInt(dynargs[1])) ));
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case 1943291465:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("indexOf")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.indexOf(((T) (dynargs[0]) ), ( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) ));
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -821858768:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("spliceVoid")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							this.spliceVoid(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), ((int) (haxe.lang.Runtime.toInt(dynargs[1])) ));
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -567445985:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("contains")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.contains(((T) (dynargs[0]) ));
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -1776922004:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("toString")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.toString();
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -934610812:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("remove")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.remove(((T) (dynargs[0]) ));
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -128126757:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("__hx_toString")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							return this.__hx_toString();
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -1183792455:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("insert")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							this.insert(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), ((T) (dynargs[1]) ));
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
					case -277637751:
					{
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						if (field.equals("unshift")) 
						{
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							__temp_executeDef1 = false;
							//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
							this.unshift(((T) (dynargs[0]) ));
						}
						
						//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
			if (__temp_executeDef1) 
			{
				//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
		baseArr.push("__a");
		//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
		baseArr.push("length");
		//line 34 "/usr/share/haxe/std/java/_std/Array.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


