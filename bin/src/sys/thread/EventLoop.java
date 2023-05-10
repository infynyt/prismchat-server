package sys.thread;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class EventLoop extends haxe.lang.HxObject
{
	public EventLoop(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public EventLoop()
	{
		//line 32 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		sys.thread.EventLoop.__hx_ctor_sys_thread_EventLoop(this);
	}
	
	
	protected static void __hx_ctor_sys_thread_EventLoop(sys.thread.EventLoop __hx_this)
	{
		//line 29 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		__hx_this.promisedEventsCount = 0;
		//line 28 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		__hx_this.waitLock = new haxe.java.vm.Lock();
		//line 27 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		__hx_this.oneTimeEventsIdx = 0;
		//line 26 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		__hx_this.oneTimeEvents = new haxe.root.Array<haxe.lang.Function>();
		//line 25 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		__hx_this.mutex = new haxe.java.vm.Mutex();
		//line 32 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		{
		}
		
	}
	
	
	public haxe.java.vm.Mutex mutex;
	
	public haxe.root.Array<haxe.lang.Function> oneTimeEvents;
	
	public int oneTimeEventsIdx;
	
	public haxe.java.vm.Lock waitLock;
	
	public int promisedEventsCount;
	
	public sys.thread._EventLoop.RegularEvent regularEvents;
	
	public void promise()
	{
		//line 79 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		this.mutex.acquire();
		//line 80 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		 ++ this.promisedEventsCount;
		//line 81 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		this.mutex.release();
	}
	
	
	public void runPromised(haxe.lang.Function event)
	{
		//line 98 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		this.mutex.acquire();
		//line 99 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		this.oneTimeEvents.__set(this.oneTimeEventsIdx++, event);
		//line 100 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		 -- this.promisedEventsCount;
		//line 101 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		this.waitLock.release();
		//line 102 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		this.mutex.release();
	}
	
	
	public void loop()
	{
		//line 148 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		haxe.root.Array<haxe.lang.Function> events = new haxe.root.Array<haxe.lang.Function>(new haxe.lang.Function[]{});
		//line 149 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		label1:
		while (true)
		{
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			double now = haxe.root.Sys.time();
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			haxe.root.Array<haxe.lang.Function> eventsToRun = events;
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			int eventsToRunIdx = 0;
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			double nextEventAt = ((double) (-1) );
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			this.mutex.acquire();
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			while (this.waitLock.wait(0.0))
			{
			}
			
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			sys.thread._EventLoop.RegularEvent current = this.regularEvents;
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			while (( current != null ))
			{
				//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				if (( current.nextRunTime <= now )) 
				{
					//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
					eventsToRun.__set(eventsToRunIdx++, current.run);
					//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
					current.nextRunTime += current.interval;
					//line 187 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
					nextEventAt = ((double) (-2) );
				}
				else
				{
					//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
					if (( ( nextEventAt == -1 ) || ( current.nextRunTime < nextEventAt ) )) 
					{
						//line 189 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						nextEventAt = current.nextRunTime;
					}
					
				}
				
				//line 191 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				current = current.next;
			}
			
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			this.mutex.release();
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			int _g = 0;
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			int _g1 = eventsToRunIdx;
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			while (( _g < _g1 ))
			{
				//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				int i = _g++;
				//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				eventsToRun.__get(i).__hx_invoke0_o();
				//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				eventsToRun.__set(i, null);
			}
			
			//line 200 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			eventsToRunIdx = 0;
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			this.mutex.acquire();
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			int _g2_current = 0;
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			haxe.root.Array<haxe.lang.Function> _g2_array = this.oneTimeEvents;
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			while (( _g2_current < _g2_array.length ))
			{
				//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				haxe.lang.Function _g3_value = _g2_array.__get(_g2_current);
				//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				int _g3_key = _g2_current++;
				//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				int i1 = _g3_key;
				//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				haxe.lang.Function event = _g3_value;
				//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				if (( event == null )) 
				{
					//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
					break;
				}
				else
				{
					//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
					eventsToRun.__set(eventsToRunIdx++, event);
					//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
					this.oneTimeEvents.__set(i1, null);
				}
				
			}
			
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			this.oneTimeEventsIdx = 0;
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			boolean hasPromisedEvents = ( this.promisedEventsCount > 0 );
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			this.mutex.release();
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			int _g2 = 0;
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			int _g3 = eventsToRunIdx;
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			while (( _g2 < _g3 ))
			{
				//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				int i2 = _g2++;
				//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				eventsToRun.__get(i2).__hx_invoke0_o();
				//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				eventsToRun.__set(i2, null);
			}
			
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			if (( eventsToRunIdx > 0 )) 
			{
				//line 225 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				nextEventAt = ((double) (-2) );
			}
			
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			double r_nextEventAt = nextEventAt;
			//line 150 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			boolean r_anyTime = hasPromisedEvents;
			//line 151 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			{
				//line 151 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				boolean _g4 = r_anyTime;
				//line 151 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				double _g5 = r_nextEventAt;
				//line 151 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				{
					//line 151 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
					double __temp_switch1 = (_g5);
					//line 152 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
					if (( __temp_switch1 == -2 )) 
					{
					}
					else
					{
						//line 151 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (( __temp_switch1 == -1 )) 
						{
							//line 151 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							if (_g4) 
							{
								//line 156 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
								this.waitLock.wait(null);
							}
							else
							{
								//line 154 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
								break label1;
							}
							
						}
						else
						{
							//line 157 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							double time = _g5;
							//line 157 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							{
								//line 158 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
								double timeout = ( time - haxe.root.Sys.time() );
								//line 159 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
								this.waitLock.wait(java.lang.Math.max(((double) (0) ), timeout));
							}
							
						}
						
					}
					
				}
				
			}
			
		}
		;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		{
			//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			if (( field != null )) 
			{
				//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				switch (field.hashCode())
				{
					case -1834061555:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("promisedEventsCount")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							this.promisedEventsCount = ((int) (value) );
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return value;
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case 832255441:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("oneTimeEventsIdx")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							this.oneTimeEventsIdx = ((int) (value) );
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return value;
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		{
			//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			if (( field != null )) 
			{
				//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				switch (field.hashCode())
				{
					case -1054357547:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("regularEvents")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							this.regularEvents = ((sys.thread._EventLoop.RegularEvent) (value) );
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return value;
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case 104264063:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("mutex")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							this.mutex = ((haxe.java.vm.Mutex) (value) );
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return value;
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case -1834061555:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("promisedEventsCount")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							this.promisedEventsCount = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return value;
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case 95180108:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("oneTimeEvents")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							this.oneTimeEvents = ((haxe.root.Array<haxe.lang.Function>) (value) );
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return value;
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case 245106752:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("waitLock")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							this.waitLock = ((haxe.java.vm.Lock) (value) );
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return value;
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case 832255441:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("oneTimeEventsIdx")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							this.oneTimeEventsIdx = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return value;
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		{
			//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			if (( field != null )) 
			{
				//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				switch (field.hashCode())
				{
					case 3327652:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("loop")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "loop")) );
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case 104264063:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("mutex")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return this.mutex;
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case 1901055572:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("runPromised")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "runPromised")) );
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case 95180108:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("oneTimeEvents")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return this.oneTimeEvents;
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case -309216997:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("promise")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "promise")) );
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case 832255441:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("oneTimeEventsIdx")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return this.oneTimeEventsIdx;
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case -1054357547:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("regularEvents")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return this.regularEvents;
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case 245106752:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("waitLock")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return this.waitLock;
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case -1834061555:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("promisedEventsCount")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return this.promisedEventsCount;
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		{
			//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			if (( field != null )) 
			{
				//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				switch (field.hashCode())
				{
					case -1834061555:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("promisedEventsCount")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return ((double) (this.promisedEventsCount) );
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case 832255441:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("oneTimeEventsIdx")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							return ((double) (this.oneTimeEventsIdx) );
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		{
			//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			if (( field != null )) 
			{
				//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				switch (field.hashCode())
				{
					case 3327652:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("loop")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							this.loop();
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case -309216997:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("promise")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							this.promise();
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
					case 1901055572:
					{
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						if (field.equals("runPromised")) 
						{
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							__temp_executeDef1 = false;
							//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
							this.runPromised(((haxe.lang.Function) (dynargs[0]) ));
						}
						
						//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		baseArr.push("regularEvents");
		//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		baseArr.push("promisedEventsCount");
		//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		baseArr.push("waitLock");
		//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		baseArr.push("oneTimeEventsIdx");
		//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		baseArr.push("oneTimeEvents");
		//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		baseArr.push("mutex");
		//line 24 "/usr/share/haxe/std/sys/thread/EventLoop.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


