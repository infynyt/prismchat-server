package haxe.iterators;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ArrayKeyValueIterator<T> extends haxe.lang.HxObject
{
	public ArrayKeyValueIterator(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ArrayKeyValueIterator(haxe.root.Array<T> array)
	{
		//line 30 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
		haxe.iterators.ArrayKeyValueIterator.__hx_ctor_haxe_iterators_ArrayKeyValueIterator(((haxe.iterators.ArrayKeyValueIterator<T>) (this) ), ((haxe.root.Array<T>) (array) ));
		//line 30 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
	}
	
	
	protected static <T_c> void __hx_ctor_haxe_iterators_ArrayKeyValueIterator(haxe.iterators.ArrayKeyValueIterator<T_c> __hx_this, haxe.root.Array<T_c> array)
	{
		//line 27 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
		__hx_this.current = 0;
		//line 32 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
		{
			//line 32 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
			__hx_this.array = array;
		}
		
	}
	
	
	public int current;
	
	public haxe.root.Array<T> array;
	
	public final boolean hasNext()
	{
		//line 37 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
		return ( this.current < this.array.length );
	}
	
	
	public final java.lang.Object next()
	{
		//line 42 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
		{
			//line 42 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
			T __temp_odecl1 = this.array.__get(this.current);
			//line 42 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
			int __temp_odecl2 = this.current++;
			//line 42 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
			return new haxe.lang.DynamicObject(new java.lang.String[]{"value"}, new java.lang.Object[]{__temp_odecl1}, new java.lang.String[]{"key"}, new double[]{((double) (((double) (__temp_odecl2) )) )});
		}
		
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
		{
			//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
			if (( field != null )) 
			{
				//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
				switch (field.hashCode())
				{
					case 1126940025:
					{
						//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
						if (field.equals("current")) 
						{
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							__temp_executeDef1 = false;
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							this.current = ((int) (value) );
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							return value;
						}
						
						//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
		{
			//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
			if (( field != null )) 
			{
				//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
				switch (field.hashCode())
				{
					case 93090393:
					{
						//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
						if (field.equals("array")) 
						{
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							__temp_executeDef1 = false;
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							this.array = ((haxe.root.Array<T>) (value) );
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							return value;
						}
						
						//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
						break;
					}
					
					
					case 1126940025:
					{
						//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
						if (field.equals("current")) 
						{
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							__temp_executeDef1 = false;
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							this.current = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							return value;
						}
						
						//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
		{
			//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
			if (( field != null )) 
			{
				//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
				switch (field.hashCode())
				{
					case 3377907:
					{
						//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
						if (field.equals("next")) 
						{
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							__temp_executeDef1 = false;
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "next")) );
						}
						
						//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
						break;
					}
					
					
					case 1126940025:
					{
						//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
						if (field.equals("current")) 
						{
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							__temp_executeDef1 = false;
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							return this.current;
						}
						
						//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
						break;
					}
					
					
					case 696759469:
					{
						//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
						if (field.equals("hasNext")) 
						{
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							__temp_executeDef1 = false;
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasNext")) );
						}
						
						//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
						break;
					}
					
					
					case 93090393:
					{
						//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
						if (field.equals("array")) 
						{
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							__temp_executeDef1 = false;
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							return this.array;
						}
						
						//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
		{
			//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
			if (( field != null )) 
			{
				//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
				switch (field.hashCode())
				{
					case 1126940025:
					{
						//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
						if (field.equals("current")) 
						{
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							__temp_executeDef1 = false;
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							return ((double) (this.current) );
						}
						
						//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
		{
			//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
			if (( field != null )) 
			{
				//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
				switch (field.hashCode())
				{
					case 3377907:
					{
						//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
						if (field.equals("next")) 
						{
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							__temp_executeDef1 = false;
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							return this.next();
						}
						
						//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
						break;
					}
					
					
					case 696759469:
					{
						//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
						if (field.equals("hasNext")) 
						{
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							__temp_executeDef1 = false;
							//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
							return this.hasNext();
						}
						
						//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
		baseArr.push("array");
		//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
		baseArr.push("current");
		//line 26 "/usr/share/haxe/std/haxe/iterators/ArrayKeyValueIterator.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


