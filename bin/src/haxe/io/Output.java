package haxe.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Output extends haxe.lang.HxObject
{
	public Output(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Output()
	{
		//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
		haxe.io.Output.__hx_ctor_haxe_io_Output(this);
	}
	
	
	protected static void __hx_ctor_haxe_io_Output(haxe.io.Output __hx_this)
	{
	}
	
	
	public void writeByte(int c)
	{
		//line 47 "/usr/share/haxe/std/haxe/io/Output.hx"
		throw new haxe.exceptions.NotImplementedException(haxe.lang.Runtime.toString(null), ((haxe.Exception) (null) ), ((java.lang.Object) (new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"haxe.io.Output", "haxe/io/Output.hx", "writeByte"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (47) )) )})) ));
	}
	
	
	public int writeBytes(haxe.io.Bytes s, int pos, int len)
	{
		//line 59 "/usr/share/haxe/std/haxe/io/Output.hx"
		if (( ( ( pos < 0 ) || ( len < 0 ) ) || ( ( pos + len ) > s.length ) )) 
		{
			//line 60 "/usr/share/haxe/std/haxe/io/Output.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(haxe.io.Error.OutsideBounds)) );
		}
		
		//line 62 "/usr/share/haxe/std/haxe/io/Output.hx"
		byte[] b = s.b;
		//line 63 "/usr/share/haxe/std/haxe/io/Output.hx"
		int k = len;
		//line 64 "/usr/share/haxe/std/haxe/io/Output.hx"
		while (( k > 0 ))
		{
			//line 74 "/usr/share/haxe/std/haxe/io/Output.hx"
			this.writeByte(((int) (b[pos]) ));
			//line 76 "/usr/share/haxe/std/haxe/io/Output.hx"
			 ++ pos;
			//line 77 "/usr/share/haxe/std/haxe/io/Output.hx"
			 -- k;
		}
		
		//line 79 "/usr/share/haxe/std/haxe/io/Output.hx"
		return len;
	}
	
	
	public void writeFullBytes(haxe.io.Bytes s, int pos, int len)
	{
		//line 121 "/usr/share/haxe/std/haxe/io/Output.hx"
		while (( len > 0 ))
		{
			//line 122 "/usr/share/haxe/std/haxe/io/Output.hx"
			int k = this.writeBytes(s, pos, len);
			//line 123 "/usr/share/haxe/std/haxe/io/Output.hx"
			pos += k;
			//line 124 "/usr/share/haxe/std/haxe/io/Output.hx"
			len -= k;
		}
		
	}
	
	
	public void writeString(java.lang.String s, haxe.io.Encoding encoding)
	{
		//line 282 "/usr/share/haxe/std/haxe/io/Output.hx"
		haxe.io.Bytes b = haxe.io.Bytes.ofString(s, encoding);
		//line 284 "/usr/share/haxe/std/haxe/io/Output.hx"
		this.writeFullBytes(b, 0, b.length);
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
		{
			//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
			boolean __temp_executeDef1 = true;
			//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
			if (( field != null )) 
			{
				//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
				switch (field.hashCode())
				{
					case 1412235472:
					{
						//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
						if (field.equals("writeString")) 
						{
							//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
							__temp_executeDef1 = false;
							//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeString")) );
						}
						
						//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
						break;
					}
					
					
					case -1406851705:
					{
						//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
						if (field.equals("writeByte")) 
						{
							//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
							__temp_executeDef1 = false;
							//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeByte")) );
						}
						
						//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
						break;
					}
					
					
					case 1188045309:
					{
						//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
						if (field.equals("writeFullBytes")) 
						{
							//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
							__temp_executeDef1 = false;
							//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeFullBytes")) );
						}
						
						//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
						break;
					}
					
					
					case -662729780:
					{
						//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
						if (field.equals("writeBytes")) 
						{
							//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
							__temp_executeDef1 = false;
							//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeBytes")) );
						}
						
						//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
			if (__temp_executeDef1) 
			{
				//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
		{
			//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
			boolean __temp_executeDef1 = true;
			//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
			if (( field != null )) 
			{
				//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
				switch (field.hashCode())
				{
					case 1412235472:
					{
						//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
						if (field.equals("writeString")) 
						{
							//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
							__temp_executeDef1 = false;
							//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
							this.writeString(haxe.lang.Runtime.toString(dynargs[0]), ((haxe.io.Encoding) (( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) )) ));
						}
						
						//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
						break;
					}
					
					
					case -1406851705:
					{
						//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
						if (field.equals("writeByte")) 
						{
							//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
							__temp_executeDef1 = false;
							//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
							this.writeByte(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ));
						}
						
						//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
						break;
					}
					
					
					case 1188045309:
					{
						//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
						if (field.equals("writeFullBytes")) 
						{
							//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
							__temp_executeDef1 = false;
							//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
							this.writeFullBytes(((haxe.io.Bytes) (dynargs[0]) ), ((int) (haxe.lang.Runtime.toInt(dynargs[1])) ), ((int) (haxe.lang.Runtime.toInt(dynargs[2])) ));
						}
						
						//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
						break;
					}
					
					
					case -662729780:
					{
						//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
						if (field.equals("writeBytes")) 
						{
							//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
							__temp_executeDef1 = false;
							//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
							return this.writeBytes(((haxe.io.Bytes) (dynargs[0]) ), ((int) (haxe.lang.Runtime.toInt(dynargs[1])) ), ((int) (haxe.lang.Runtime.toInt(dynargs[2])) ));
						}
						
						//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
			if (__temp_executeDef1) 
			{
				//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 31 "/usr/share/haxe/std/haxe/io/Output.hx"
		return null;
	}
	
	
}


