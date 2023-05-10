package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ValueException extends haxe.Exception
{
	public ValueException(haxe.lang.EmptyObject empty)
	{
		//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public ValueException(java.lang.Object value, haxe.Exception previous, java.lang.Object _native)
	{
		//line 24 "/usr/share/haxe/std/haxe/ValueException.hx"
		super(haxe.lang.Runtime.toString(haxe.root.Std.string(((java.lang.Object) (value) ))), ((haxe.Exception) (( (( previous == null )) ? (null) : (previous) )) ), ((java.lang.Object) (( (( _native == null )) ? (null) : (_native) )) ));
		//line 25 "/usr/share/haxe/std/haxe/ValueException.hx"
		this.value = value;
	}
	
	
	public java.lang.Object value;
	
	@Override public java.lang.Object unwrap()
	{
		//line 36 "/usr/share/haxe/std/haxe/ValueException.hx"
		return this.value;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
		{
			//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
			boolean __temp_executeDef1 = true;
			//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
			if (( field != null )) 
			{
				//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
				switch (field.hashCode())
				{
					case 111972721:
					{
						//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
						if (field.equals("value")) 
						{
							//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
							__temp_executeDef1 = false;
							//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
							this.value = ((java.lang.Object) (value) );
							//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
							return value;
						}
						
						//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
			if (__temp_executeDef1) 
			{
				//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
		{
			//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
			boolean __temp_executeDef1 = true;
			//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
			if (( field != null )) 
			{
				//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
				switch (field.hashCode())
				{
					case 111972721:
					{
						//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
						if (field.equals("value")) 
						{
							//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
							__temp_executeDef1 = false;
							//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
							this.value = ((java.lang.Object) (value) );
							//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
							return value;
						}
						
						//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
			if (__temp_executeDef1) 
			{
				//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
		{
			//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
			boolean __temp_executeDef1 = true;
			//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
			if (( field != null )) 
			{
				//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
				switch (field.hashCode())
				{
					case -840111517:
					{
						//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
						if (field.equals("unwrap")) 
						{
							//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
							__temp_executeDef1 = false;
							//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "unwrap")) );
						}
						
						//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
						break;
					}
					
					
					case 111972721:
					{
						//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
						if (field.equals("value")) 
						{
							//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
							__temp_executeDef1 = false;
							//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
							return this.value;
						}
						
						//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
			if (__temp_executeDef1) 
			{
				//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
		{
			//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
			boolean __temp_executeDef1 = true;
			//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
			if (( field != null )) 
			{
				//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
				switch (field.hashCode())
				{
					case 111972721:
					{
						//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
						if (field.equals("value")) 
						{
							//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
							__temp_executeDef1 = false;
							//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
							return ((double) (haxe.lang.Runtime.toDouble(this.value)) );
						}
						
						//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
			if (__temp_executeDef1) 
			{
				//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
		baseArr.push("value");
		//line 17 "/usr/share/haxe/std/haxe/ValueException.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


