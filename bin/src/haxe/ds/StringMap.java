package haxe.ds;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringMap<T> extends haxe.lang.HxObject implements haxe.IMap<java.lang.String, T>
{
	public StringMap(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public StringMap()
	{
		//line 62 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		haxe.ds.StringMap.__hx_ctor_haxe_ds_StringMap(((haxe.ds.StringMap<T>) (this) ));
		//line 62 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
	}
	
	
	protected static <T_c> void __hx_ctor_haxe_ds_StringMap(haxe.ds.StringMap<T_c> __hx_this)
	{
		//line 64 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		__hx_this.cachedIndex = -1;
	}
	
	
	public int[] hashes;
	
	public java.lang.String[] _keys;
	
	public T[] vals;
	
	public int nBuckets;
	
	public java.lang.String cachedKey;
	
	public int cachedIndex;
	
	public int lookup(java.lang.String key)
	{
		//line 141 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		if (( this.nBuckets != 0 )) 
		{
			//line 142 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int[] hashes = this.hashes;
			//line 142 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			java.lang.String[] keys = this._keys;
			//line 144 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int mask = ( this.nBuckets - 1 );
			//line 144 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int k = ((java.lang.String) (((java.lang.Object) (key) )) ).hashCode();
			//line 144 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			k = ( ( k + 2127912214 ) + (( k << 12 )) );
			//line 144 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			k = ( ( k ^ -949894596 ) ^ ( k >> 19 ) );
			//line 144 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			k = ( ( k + 374761393 ) + (( k << 5 )) );
			//line 144 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			k = ( ( k + (-744332180) ) ^ ( k << 9 ) );
			//line 144 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			k = ( ( k + (-42973499) ) + (( k << 3 )) );
			//line 144 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			k = ( ( k ^ -1252372727 ) ^ ( k >> 16 ) );
			//line 144 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int ret = k;
			//line 144 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (( (( ret & -2 )) == 0 )) 
			{
				//line 144 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
				if (( ret == 0 )) 
				{
					//line 144 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
					ret = 2;
				}
				else
				{
					//line 144 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
					ret = -1;
				}
				
			}
			
			//line 144 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int hash = ret;
			//line 144 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int k1 = hash;
			//line 144 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int nProbes = 0;
			//line 145 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int i = ( k1 & mask );
			//line 146 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int last = i;
			//line 146 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int flag = 0;
			//line 148 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			while (true)
			{
				//line 148 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
				flag = hashes[i];
				//line 148 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
				if ( ! ((( ( flag != 0 ) && (( ( ( flag == 1 ) || ( flag != k1 ) ) ||  ! (haxe.lang.Runtime.valEq(keys[i], key))  )) ))) ) 
				{
					//line 148 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				//line 149 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
				i = ( ( i +  ++ nProbes ) & mask );
			}
			
			//line 162 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (( (( flag & -2 )) == 0 )) 
			{
				//line 162 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
				return -1;
			}
			else
			{
				//line 162 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
				return i;
			}
			
		}
		
		//line 165 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		return -1;
	}
	
	
	public java.lang.Object get(java.lang.String key)
	{
		//line 274 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		int idx = -1;
		//line 276 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		boolean tmp = false;
		//line 276 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		if (haxe.lang.Runtime.valEq(this.cachedKey, key)) 
		{
			//line 276 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			idx = this.cachedIndex;
			//line 276 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			tmp = ( idx != -1 );
		}
		else
		{
			//line 276 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			tmp = false;
		}
		
		//line 276 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		if (tmp) 
		{
			//line 277 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			return this.vals[idx];
		}
		
		//line 280 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		idx = this.lookup(key);
		//line 281 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		if (( idx != -1 )) 
		{
			//line 283 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			this.cachedKey = key;
			//line 284 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			this.cachedIndex = idx;
			//line 286 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			return this.vals[idx];
		}
		
		//line 289 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		return null;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		{
			//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (( field != null )) 
			{
				//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
				switch (field.hashCode())
				{
					case 1005083856:
					{
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("cachedIndex")) 
						{
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							this.cachedIndex = ((int) (value) );
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return value;
						}
						
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case 325636987:
					{
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("nBuckets")) 
						{
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							this.nBuckets = ((int) (value) );
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return value;
						}
						
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		{
			//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (( field != null )) 
			{
				//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
				switch (field.hashCode())
				{
					case 1005083856:
					{
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("cachedIndex")) 
						{
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							this.cachedIndex = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return value;
						}
						
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case -1224424900:
					{
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("hashes")) 
						{
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							this.hashes = ((int[]) (value) );
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return value;
						}
						
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case -553141795:
					{
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("cachedKey")) 
						{
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							this.cachedKey = haxe.lang.Runtime.toString(value);
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return value;
						}
						
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case 91023059:
					{
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("_keys")) 
						{
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							this._keys = ((java.lang.String[]) (value) );
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return value;
						}
						
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case 325636987:
					{
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("nBuckets")) 
						{
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							this.nBuckets = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return value;
						}
						
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case 3612018:
					{
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("vals")) 
						{
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							this.vals = ((T[]) (value) );
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return value;
						}
						
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		{
			//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (( field != null )) 
			{
				//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
				switch (field.hashCode())
				{
					case 102230:
					{
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("get")) 
						{
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get")) );
						}
						
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case -1224424900:
					{
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("hashes")) 
						{
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return this.hashes;
						}
						
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case -1097094790:
					{
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("lookup")) 
						{
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "lookup")) );
						}
						
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case 91023059:
					{
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("_keys")) 
						{
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return this._keys;
						}
						
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case 1005083856:
					{
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("cachedIndex")) 
						{
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return this.cachedIndex;
						}
						
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case 3612018:
					{
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("vals")) 
						{
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return this.vals;
						}
						
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case -553141795:
					{
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("cachedKey")) 
						{
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return this.cachedKey;
						}
						
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case 325636987:
					{
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("nBuckets")) 
						{
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return this.nBuckets;
						}
						
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		{
			//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (( field != null )) 
			{
				//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
				switch (field.hashCode())
				{
					case 1005083856:
					{
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("cachedIndex")) 
						{
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return ((double) (this.cachedIndex) );
						}
						
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case 325636987:
					{
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("nBuckets")) 
						{
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return ((double) (this.nBuckets) );
						}
						
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		{
			//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (( field != null )) 
			{
				//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
				switch (field.hashCode())
				{
					case 102230:
					{
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("get")) 
						{
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return this.get(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case -1097094790:
					{
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("lookup")) 
						{
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return this.lookup(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		baseArr.push("cachedIndex");
		//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		baseArr.push("cachedKey");
		//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		baseArr.push("nBuckets");
		//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		baseArr.push("vals");
		//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		baseArr.push("_keys");
		//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		baseArr.push("hashes");
		//line 27 "/usr/share/haxe/std/java/_std/haxe/ds/StringMap.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


