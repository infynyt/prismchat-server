package haxe.exceptions;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class PosException extends haxe.Exception
{
	public PosException(haxe.lang.EmptyObject empty)
	{
		//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public PosException(java.lang.String message, haxe.Exception previous, java.lang.Object pos)
	{
		//line 13 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
		super(haxe.lang.Runtime.toString(message), ((haxe.Exception) (( (( previous == null )) ? (null) : (previous) )) ), ((java.lang.Object) (null) ));
		//line 14 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
		if (( pos == null )) 
		{
			//line 15 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
			this.posInfos = new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"(unknown)", "(unknown)", "(unknown)"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (0) )) )});
		}
		else
		{
			//line 17 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
			this.posInfos = pos;
		}
		
	}
	
	
	public java.lang.Object posInfos;
	
	@Override public java.lang.String toString()
	{
		//line 25 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
		return ( ( ( ( ( ( ( ( ( "" + super.toString() ) + " in " ) + haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(this.posInfos, "className", true)) ) + "." ) + haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(this.posInfos, "methodName", true)) ) + " at " ) + haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(this.posInfos, "fileName", true)) ) + ":" ) + ((int) (haxe.lang.Runtime.getField_f(this.posInfos, "lineNumber", true)) ) );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
		{
			//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
			if (( field != null )) 
			{
				//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
				switch (field.hashCode())
				{
					case 718070673:
					{
						//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
						if (field.equals("posInfos")) 
						{
							//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
							__temp_executeDef1 = false;
							//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
							this.posInfos = ((java.lang.Object) (value) );
							//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
							return value;
						}
						
						//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
		{
			//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
			if (( field != null )) 
			{
				//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
				switch (field.hashCode())
				{
					case 718070673:
					{
						//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
						if (field.equals("posInfos")) 
						{
							//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
							__temp_executeDef1 = false;
							//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
							this.posInfos = ((java.lang.Object) (value) );
							//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
							return value;
						}
						
						//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
		{
			//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
			if (( field != null )) 
			{
				//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
				switch (field.hashCode())
				{
					case -1776922004:
					{
						//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
						if (field.equals("toString")) 
						{
							//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
							__temp_executeDef1 = false;
							//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
						}
						
						//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
						break;
					}
					
					
					case 718070673:
					{
						//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
						if (field.equals("posInfos")) 
						{
							//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
							__temp_executeDef1 = false;
							//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
							return this.posInfos;
						}
						
						//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
		{
			//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
			if (( field != null )) 
			{
				//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
				switch (field.hashCode())
				{
					case 718070673:
					{
						//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
						if (field.equals("posInfos")) 
						{
							//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
							__temp_executeDef1 = false;
							//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
							return ((double) (haxe.lang.Runtime.toDouble(this.posInfos)) );
						}
						
						//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
		baseArr.push("posInfos");
		//line 6 "/usr/share/haxe/std/haxe/exceptions/PosException.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


