package haxe.exceptions;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ArgumentException extends haxe.exceptions.PosException
{
	public ArgumentException(haxe.lang.EmptyObject empty)
	{
		//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public ArgumentException(java.lang.String argument, java.lang.String message, haxe.Exception previous, java.lang.Object pos)
	{
		//line 13 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
		super(haxe.lang.Runtime.toString(( (( (( (( message == null )) ? (null) : (message) )) == null )) ? (( ( "Invalid argument \"" + argument ) + "\"" )) : (( (( message == null )) ? (null) : (message) )) )), ((haxe.Exception) (( (( previous == null )) ? (null) : (previous) )) ), ((java.lang.Object) (( (( pos == null )) ? (null) : (pos) )) ));
		//line 14 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
		this.argument = argument;
	}
	
	
	public java.lang.String argument;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
		{
			//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
			if (( field != null )) 
			{
				//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
				switch (field.hashCode())
				{
					case -1589682499:
					{
						//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
						if (field.equals("argument")) 
						{
							//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
							this.argument = haxe.lang.Runtime.toString(value);
							//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
							return value;
						}
						
						//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
		{
			//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
			if (( field != null )) 
			{
				//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
				switch (field.hashCode())
				{
					case -1589682499:
					{
						//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
						if (field.equals("argument")) 
						{
							//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
							return this.argument;
						}
						
						//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
		baseArr.push("argument");
		//line 6 "C:\\HaxeToolkit\\haxe\\std\\haxe\\exceptions\\ArgumentException.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


