package hx_webserver;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class HTTPRequest extends haxe.lang.HxObject
{
	public HTTPRequest(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public HTTPRequest(sys.net.Socket d, hx_webserver.HTTPServer server, java.lang.String head)
	{
		//line 17 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		hx_webserver.HTTPRequest.__hx_ctor_hx_webserver_HTTPRequest(this, d, server, head);
	}
	
	
	protected static void __hx_ctor_hx_webserver_HTTPRequest(hx_webserver.HTTPRequest __hx_this, sys.net.Socket d, hx_webserver.HTTPServer server, java.lang.String head)
	{
		//line 18 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		try 
		{
			//line 14 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			__hx_this.postData = "";
			//line 12 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			__hx_this.error = null;
			//line 11 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			__hx_this.headers = new haxe.root.Array<haxe.root.Array<java.lang.String>>(new haxe.root.Array[]{});
			//line 10 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			__hx_this.data = null;
			//line 18 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			{
				//line 18 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
				try 
				{
					//line 19 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
					__hx_this.client = d;
					//line 20 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
					__hx_this.server = server;
					//line 22 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
					__hx_this.client = d;
					//line 23 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
					haxe.io.Bytes byteBuffer = haxe.io.Bytes.alloc(1024);
					//line 24 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
					int bytesRead = __hx_this.client.input.readBytes(byteBuffer, 0, 1024);
					//line 25 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
					haxe.io.Bytes byteString = haxe.io.Bytes.alloc(bytesRead);
					//line 26 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
					byteString.blit(0, byteBuffer, 0, bytesRead);
					//line 27 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
					__hx_this.data = byteString.toString();
					//line 29 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
					haxe.root.Array<java.lang.String> split = haxe.lang.StringExt.split(__hx_this.data, "\n");
					//line 30 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
					{
						//line 30 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						int _g = 0;
						//line 30 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						int _g1 = split.length;
						//line 30 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						while (( _g < _g1 ))
						{
							//line 30 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							int i = _g++;
							//line 31 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							haxe.root.Array<java.lang.String> splitAgain = haxe.lang.StringExt.split(split.__get(i), ": ");
							//line 32 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__hx_this.headers.push(new haxe.root.Array<java.lang.String>(new java.lang.String[]{splitAgain.__get(0), splitAgain.__get(1)}));
						}
						
					}
					
					//line 34 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
					__hx_this.methods = haxe.lang.StringExt.split(head, " ");
					//line 35 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
					if ( ! (haxe.lang.Runtime.valEq(__hx_this.methods.__get(0), "GET")) ) 
					{
						//line 36 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						haxe.root.Array<java.lang.String> t = haxe.lang.StringExt.split(__hx_this.data, "\r\n");
						//line 37 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						int v = 0;
						//line 38 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						{
							//line 38 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							int _g2 = 0;
							//line 38 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							int _g3 = t.length;
							//line 38 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							while (( _g2 < _g3 ))
							{
								//line 38 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
								int i1 = _g2++;
								//line 39 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
								if (( ( ( haxe.lang.Runtime.valEq(t.__get(i1), " ") || haxe.lang.Runtime.valEq(t.__get(i1), "") ) || haxe.lang.Runtime.valEq(t.__get(i1), "\r") ) || haxe.lang.Runtime.valEq(t.__get(i1), "\n") )) 
								{
									//line 40 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
									v = i1;
								}
								
							}
							
						}
						
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						java.lang.String f = "";
						//line 44 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						{
							//line 44 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							int _g4 = 0;
							//line 44 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							int _g5 = v;
							//line 44 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							while (( _g4 < _g5 ))
							{
								//line 44 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
								int i2 = _g4++;
								//line 45 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
								f += ( t.__get(i2) + "\r\n" );
							}
							
						}
						
						//line 47 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						__hx_this.postData = haxe.lang.StringExt.split(__hx_this.data, f).__get(1);
					}
					
				}
				catch (java.lang.Throwable _g6)
				{
					//line 49 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
					java.lang.Object _g7 = haxe.Exception.caught(_g6).unwrap();
					//line 18 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
					if (( _g7 instanceof java.lang.String )) 
					{
						//line 49 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						java.lang.String err = haxe.lang.Runtime.toString(_g7);
						//line 49 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						{
							//line 50 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							haxe.Log.trace.__hx_invoke2_o(0.0, err, 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"hx_webserver.HTTPRequest", "hx_webserver/HTTPRequest.hx", "new"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (50) )) )}));
							//line 51 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__hx_this.error = err;
						}
						
					}
					else
					{
						//line 18 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						throw _g6;
					}
					
				}
				
				
			}
			
		}
		catch (java.lang.Throwable typedException)
		{
			//line 17 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(typedException)) );
		}
		
		
	}
	
	
	public java.lang.String data;
	
	public haxe.root.Array<haxe.root.Array<java.lang.String>> headers;
	
	public java.lang.String error;
	
	public sys.net.Socket client;
	
	public java.lang.String postData;
	
	public hx_webserver.HTTPServer server;
	
	public haxe.root.Array<java.lang.String> methods;
	
	public java.lang.String getHeaderValue(java.lang.String header)
	{
		//line 55 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		java.lang.String tlcheader = header.toLowerCase();
		//line 56 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		java.lang.String headerValue = null;
		//line 57 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		{
			//line 57 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			int _g = 0;
			//line 57 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			int _g1 = this.headers.length;
			//line 57 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			while (( _g < _g1 ))
			{
				//line 57 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
				int i = _g++;
				//line 58 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
				{
					//line 58 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
					int _g2 = 0;
					//line 58 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
					int _g3 = this.headers.__get(i).length;
					//line 58 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
					while (( _g2 < _g3 ))
					{
						//line 58 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						int x = _g2++;
						//line 59 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (haxe.lang.Runtime.valEq(this.headers.__get(i).__get(0).toLowerCase(), tlcheader)) 
						{
							//line 60 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							headerValue = this.headers.__get(i).__get(1);
						}
						
					}
					
				}
				
			}
			
		}
		
		//line 64 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		return headerValue;
	}
	
	
	public void close()
	{
		//line 67 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		this.client.close();
	}
	
	
	public void replyData(java.lang.String text, java.lang.String mime, java.lang.Object code)
	{
		//line 69 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		java.lang.Object code1 = ( (haxe.lang.Runtime.eq(code, null)) ? (((java.lang.Object) (200) )) : (code) );
		//line 71 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		haxe.io.Bytes response = this.server.prepareHttpResponse(((int) (haxe.lang.Runtime.toInt(code1)) ), mime, haxe.io.Bytes.ofString(text, null));
		//line 72 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		this.client.output.writeFullBytes(response, 0, response.length);
	}
	
	
	public void reply(java.lang.String text, java.lang.Object code)
	{
		//line 74 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		java.lang.Object code1 = ( (haxe.lang.Runtime.eq(code, null)) ? (((java.lang.Object) (200) )) : (code) );
		//line 76 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		haxe.io.Bytes response = this.server.prepareHttpResponse(((int) (haxe.lang.Runtime.toInt(code1)) ), "text/plain", haxe.io.Bytes.ofString(text, null));
		//line 77 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		this.client.output.writeFullBytes(response, 0, response.length);
	}
	
	
	public void replyWithFile(java.lang.String file, java.lang.Object code)
	{
		//line 80 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		java.lang.Object code1 = ( (haxe.lang.Runtime.eq(code, null)) ? (((java.lang.Object) (200) )) : (code) );
		//line 80 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		if (sys.FileSystem.exists(file)) 
		{
			//line 83 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			haxe.io.Bytes bytes = sys.io.File.getBytes(file);
			//line 84 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			java.lang.String mime = hx_webserver.HTTPUtils.getMimeType(file);
			//line 86 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			haxe.io.Bytes response = this.server.prepareHttpResponse(((int) (haxe.lang.Runtime.toInt(code1)) ), mime, bytes);
			//line 87 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			this.client.output.writeFullBytes(response, 0, response.length);
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		{
			//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			if (( field != null )) 
			{
				//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
				switch (field.hashCode())
				{
					case 955534258:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("methods")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							this.methods = ((haxe.root.Array<java.lang.String>) (value) );
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							return value;
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
					case 3076010:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("data")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							this.data = haxe.lang.Runtime.toString(value);
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							return value;
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
					case -905826493:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("server")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							this.server = ((hx_webserver.HTTPServer) (value) );
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							return value;
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
					case 795307910:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("headers")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							this.headers = ((haxe.root.Array<haxe.root.Array<java.lang.String>>) (value) );
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							return value;
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
					case 756526186:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("postData")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							this.postData = haxe.lang.Runtime.toString(value);
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							return value;
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
					case 96784904:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("error")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							this.error = haxe.lang.Runtime.toString(value);
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							return value;
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
					case -1357712437:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("client")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							this.client = ((sys.net.Socket) (value) );
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							return value;
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		{
			//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			if (( field != null )) 
			{
				//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
				switch (field.hashCode())
				{
					case 1385378924:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("replyWithFile")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "replyWithFile")) );
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
					case 3076010:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("data")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							return this.data;
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
					case 108401386:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("reply")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "reply")) );
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
					case 795307910:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("headers")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							return this.headers;
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
					case -434179660:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("replyData")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "replyData")) );
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
					case 96784904:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("error")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							return this.error;
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
					case 94756344:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("close")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "close")) );
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
					case -1357712437:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("client")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							return this.client;
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
					case 535008686:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("getHeaderValue")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getHeaderValue")) );
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
					case 756526186:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("postData")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							return this.postData;
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
					case 955534258:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("methods")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							return this.methods;
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
					case -905826493:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("server")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							return this.server;
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		{
			//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			if (( field != null )) 
			{
				//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
				switch (field.hashCode())
				{
					case 1385378924:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("replyWithFile")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							this.replyWithFile(haxe.lang.Runtime.toString(dynargs[0]), ( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) ));
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
					case 535008686:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("getHeaderValue")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							return this.getHeaderValue(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
					case 108401386:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("reply")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							this.reply(haxe.lang.Runtime.toString(dynargs[0]), ( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) ));
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
					case 94756344:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("close")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							this.close();
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
					case -434179660:
					{
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						if (field.equals("replyData")) 
						{
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
							this.replyData(haxe.lang.Runtime.toString(dynargs[0]), haxe.lang.Runtime.toString(dynargs[1]), ( (( dynargs.length > 2 )) ? (dynargs[2]) : (null) ));
						}
						
						//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		baseArr.push("methods");
		//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		baseArr.push("server");
		//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		baseArr.push("postData");
		//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		baseArr.push("client");
		//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		baseArr.push("error");
		//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		baseArr.push("headers");
		//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		baseArr.push("data");
		//line 9 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPRequest.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


