package sys.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class FileOutput extends haxe.io.Output
{
	public FileOutput(haxe.lang.EmptyObject empty)
	{
		//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public FileOutput(java.io.RandomAccessFile f)
	{
		//line 34 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		sys.io.FileOutput.__hx_ctor_sys_io_FileOutput(this, f);
	}
	
	
	protected static void __hx_ctor_sys_io_FileOutput(sys.io.FileOutput __hx_this, java.io.RandomAccessFile f)
	{
		//line 35 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		__hx_this.f = f;
	}
	
	
	public java.io.RandomAccessFile f;
	
	public void close()
	{
		//line 40 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		try 
		{
			//line 40 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			this.f.close();
		}
		catch (java.lang.Throwable _g)
		{
			//line 41 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			java.lang.Object e = ((java.lang.Object) (haxe.Exception.caught(_g).unwrap()) );
			//line 42 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(e)) );
		}
		
		
	}
	
	
	@Override public void writeByte(int c)
	{
		//line 47 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		try 
		{
			//line 47 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			this.f.write(((int) (c) ));
		}
		catch (java.io.IOException e)
		{
			//line 49 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(haxe.io.Error.Custom(e))) );
		}
		
		
	}
	
	
	@Override public int writeBytes(haxe.io.Bytes s, int pos, int len)
	{
		//line 62 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		try 
		{
			//line 63 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			this.f.write(((byte[]) (s.b) ), ((int) (pos) ), ((int) (len) ));
			//line 64 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			return len;
		}
		catch (java.io.IOException e)
		{
			//line 66 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(haxe.io.Error.Custom(e))) );
		}
		
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		{
			//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			boolean __temp_executeDef1 = true;
			//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			if (( field != null )) 
			{
				//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
				switch (field.hashCode())
				{
					case 102:
					{
						//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						if (field.equals("f")) 
						{
							//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
							__temp_executeDef1 = false;
							//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
							this.f = ((java.io.RandomAccessFile) (value) );
							//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
							return value;
						}
						
						//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			if (__temp_executeDef1) 
			{
				//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		{
			//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			boolean __temp_executeDef1 = true;
			//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			if (( field != null )) 
			{
				//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
				switch (field.hashCode())
				{
					case -662729780:
					{
						//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						if (field.equals("writeBytes")) 
						{
							//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
							__temp_executeDef1 = false;
							//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeBytes")) );
						}
						
						//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						break;
					}
					
					
					case 102:
					{
						//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						if (field.equals("f")) 
						{
							//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
							__temp_executeDef1 = false;
							//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
							return this.f;
						}
						
						//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						break;
					}
					
					
					case -1406851705:
					{
						//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						if (field.equals("writeByte")) 
						{
							//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
							__temp_executeDef1 = false;
							//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeByte")) );
						}
						
						//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						break;
					}
					
					
					case 94756344:
					{
						//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						if (field.equals("close")) 
						{
							//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
							__temp_executeDef1 = false;
							//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "close")) );
						}
						
						//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			if (__temp_executeDef1) 
			{
				//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		{
			//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			int __temp_hash2 = field.hashCode();
			//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			boolean __temp_executeDef1 = true;
			//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			if (( field != null )) 
			{
				//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
				switch (__temp_hash2)
				{
					case -662729780:
					case -1406851705:
					{
						//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						if (( (( ( __temp_hash2 == -662729780 ) && field.equals("writeBytes") )) || field.equals("writeByte") )) 
						{
							//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
							__temp_executeDef1 = false;
							//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
							return haxe.lang.Runtime.slowCallField(this, field, dynargs);
						}
						
						//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						break;
					}
					
					
					case 94756344:
					{
						//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						if (field.equals("close")) 
						{
							//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
							__temp_executeDef1 = false;
							//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
							this.close();
						}
						
						//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			if (__temp_executeDef1) 
			{
				//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		baseArr.push("f");
		//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


