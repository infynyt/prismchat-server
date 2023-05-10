package haxe.java.vm;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Lock extends haxe.lang.HxObject
{
	public Lock(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Lock()
	{
		//line 34 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
		haxe.java.vm.Lock.__hx_ctor_haxe_java_vm_Lock(this);
	}
	
	
	protected static void __hx_ctor_haxe_java_vm_Lock(haxe.java.vm.Lock __hx_this)
	{
		//line 32 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
		__hx_this.releasedCount = 0;
		//line 34 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
		{
		}
		
	}
	
	
	public volatile int releasedCount;
	
	public boolean wait(java.lang.Object timeout)
	{
		//line 37 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
		boolean ret = false;
		//line 38 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
		synchronized(this)
		{
			//line 39 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
			if ((  -- this.releasedCount < 0 )) 
			{
				//line 40 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
				if (haxe.lang.Runtime.eq(timeout, null)) 
				{
					//line 45 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
					while (true)
					{
						//line 45 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
						if ( ! ((( this.releasedCount < 0 ))) ) 
						{
							//line 45 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							break;
						}
						
						//line 47 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
						try 
						{
							//line 47 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							((java.lang.Object) (((java.lang.Object) (this) )) ).wait();
						}
						catch (java.lang.InterruptedException e)
						{
						}
						
						
					}
					
				}
				else
				{
					//line 51 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
					long timeout1 = ((long) (( ((double) (haxe.lang.Runtime.toDouble(timeout)) ) * ((double) (1000) ) )) );
					//line 52 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
					long cur = java.lang.System.currentTimeMillis();
					//line 52 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
					long max = ((long) (( ((long) (cur) ) + ((long) (timeout1) ) )) );
					//line 55 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
					while (true)
					{
						//line 55 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
						if ( ! ((( (( this.releasedCount < 0 )) ? (( (( (( ((long) (cur) ) < ((long) (max) ) )) ? (-1) : (( (( ((long) (cur) ) > ((long) (max) ) )) ? (1) : (0) )) )) < 0 )) : (false) ))) ) 
						{
							//line 55 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							break;
						}
						
						//line 56 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
						try 
						{
							//line 57 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							long t = ((long) (( ((long) (max) ) - ((long) (cur) ) )) );
							//line 58 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							((java.lang.Object) (((java.lang.Object) (this) )) ).wait(((long) (t) ));
							//line 59 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							cur = java.lang.System.currentTimeMillis();
						}
						catch (java.lang.InterruptedException e1)
						{
						}
						
						
					}
					
				}
				
			}
			
			//line 64 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
			ret = ( this.releasedCount >= 0 );
			//line 65 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
			if ( ! (ret) ) 
			{
				//line 66 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
				this.releasedCount++;
			}
			
		}
		
		//line 68 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
		return ret;
	}
	
	
	public void release()
	{
		//line 72 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
		synchronized(this)
		{
			if ((  ++ this.releasedCount >= 0 )) 
			{
				//line 74 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
				this.notify();
			}
		}
		
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
		{
			//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
			boolean __temp_executeDef1 = true;
			//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
			if (( field != null )) 
			{
				//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
				switch (field.hashCode())
				{
					case -698890798:
					{
						//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
						if (field.equals("releasedCount")) 
						{
							//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							__temp_executeDef1 = false;
							//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							this.releasedCount = ((int) (value) );
							//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							return value;
						}
						
						//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
			if (__temp_executeDef1) 
			{
				//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
		{
			//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
			boolean __temp_executeDef1 = true;
			//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
			if (( field != null )) 
			{
				//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
				switch (field.hashCode())
				{
					case -698890798:
					{
						//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
						if (field.equals("releasedCount")) 
						{
							//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							__temp_executeDef1 = false;
							//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							this.releasedCount = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							return value;
						}
						
						//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
			if (__temp_executeDef1) 
			{
				//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
		{
			//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
			boolean __temp_executeDef1 = true;
			//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
			if (( field != null )) 
			{
				//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
				switch (field.hashCode())
				{
					case 1090594823:
					{
						//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
						if (field.equals("release")) 
						{
							//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							__temp_executeDef1 = false;
							//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "release")) );
						}
						
						//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
						break;
					}
					
					
					case -698890798:
					{
						//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
						if (field.equals("releasedCount")) 
						{
							//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							__temp_executeDef1 = false;
							//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							return this.releasedCount;
						}
						
						//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
						break;
					}
					
					
					case 3641717:
					{
						//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
						if (field.equals("wait")) 
						{
							//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							__temp_executeDef1 = false;
							//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "wait")) );
						}
						
						//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
			if (__temp_executeDef1) 
			{
				//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
		{
			//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
			boolean __temp_executeDef1 = true;
			//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
			if (( field != null )) 
			{
				//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
				switch (field.hashCode())
				{
					case -698890798:
					{
						//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
						if (field.equals("releasedCount")) 
						{
							//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							__temp_executeDef1 = false;
							//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							return ((double) (this.releasedCount) );
						}
						
						//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
			if (__temp_executeDef1) 
			{
				//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
		{
			//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
			boolean __temp_executeDef1 = true;
			//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
			if (( field != null )) 
			{
				//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
				switch (field.hashCode())
				{
					case 1090594823:
					{
						//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
						if (field.equals("release")) 
						{
							//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							__temp_executeDef1 = false;
							//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							this.release();
						}
						
						//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
						break;
					}
					
					
					case 3641717:
					{
						//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
						if (field.equals("wait")) 
						{
							//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							__temp_executeDef1 = false;
							//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
							return this.wait(( (( dynargs.length > 0 )) ? (dynargs[0]) : (null) ));
						}
						
						//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
			if (__temp_executeDef1) 
			{
				//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
		baseArr.push("releasedCount");
		//line 31 "/usr/share/haxe/std/java/_std/sys/thread/Lock.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


