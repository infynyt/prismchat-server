package sys.thread._EventLoop;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class RegularEvent extends haxe.lang.HxObject
{
	public RegularEvent(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public RegularEvent(haxe.lang.Function run, double nextRunTime, double interval)
	{
		//line 240 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		sys.thread._EventLoop.RegularEvent.__hx_ctor_sys_thread__EventLoop_RegularEvent(this, run, nextRunTime, interval);
	}
	
	
	protected static void __hx_ctor_sys_thread__EventLoop_RegularEvent(sys.thread._EventLoop.RegularEvent __hx_this, haxe.lang.Function run, double nextRunTime, double interval)
	{
		//line 241 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		__hx_this.run = run;
		//line 242 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		__hx_this.nextRunTime = nextRunTime;
		//line 243 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		__hx_this.interval = interval;
	}
	
	
	public double nextRunTime;
	
	public double interval;
	
	public haxe.lang.Function run;
	
	public sys.thread._EventLoop.RegularEvent next;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		{
			//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			boolean __temp_executeDef1 = true;
			//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			if (( field != null )) 
			{
				//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				switch (field.hashCode())
				{
					case 570418373:
					{
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("interval")) 
						{
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							this.interval = ((double) (value) );
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return value;
						}
						
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case -1393120891:
					{
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("nextRunTime")) 
						{
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							this.nextRunTime = ((double) (value) );
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return value;
						}
						
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			if (__temp_executeDef1) 
			{
				//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		{
			//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			boolean __temp_executeDef1 = true;
			//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			if (( field != null )) 
			{
				//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				switch (field.hashCode())
				{
					case 3377907:
					{
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("next")) 
						{
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							this.next = ((sys.thread._EventLoop.RegularEvent) (value) );
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return value;
						}
						
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case -1393120891:
					{
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("nextRunTime")) 
						{
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							this.nextRunTime = ((double) (haxe.lang.Runtime.toDouble(value)) );
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return value;
						}
						
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case 113291:
					{
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("run")) 
						{
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							this.run = ((haxe.lang.Function) (value) );
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return value;
						}
						
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case 570418373:
					{
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("interval")) 
						{
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							this.interval = ((double) (haxe.lang.Runtime.toDouble(value)) );
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return value;
						}
						
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			if (__temp_executeDef1) 
			{
				//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		{
			//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			boolean __temp_executeDef1 = true;
			//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			if (( field != null )) 
			{
				//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				switch (field.hashCode())
				{
					case 3377907:
					{
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("next")) 
						{
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return this.next;
						}
						
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case -1393120891:
					{
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("nextRunTime")) 
						{
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return this.nextRunTime;
						}
						
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case 113291:
					{
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("run")) 
						{
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return this.run;
						}
						
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case 570418373:
					{
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("interval")) 
						{
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return this.interval;
						}
						
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			if (__temp_executeDef1) 
			{
				//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		{
			//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			boolean __temp_executeDef1 = true;
			//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			if (( field != null )) 
			{
				//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				switch (field.hashCode())
				{
					case 570418373:
					{
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("interval")) 
						{
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return this.interval;
						}
						
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case -1393120891:
					{
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("nextRunTime")) 
						{
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return this.nextRunTime;
						}
						
						//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			if (__temp_executeDef1) 
			{
				//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		baseArr.push("next");
		//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		baseArr.push("run");
		//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		baseArr.push("interval");
		//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		baseArr.push("nextRunTime");
		//line 233 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


