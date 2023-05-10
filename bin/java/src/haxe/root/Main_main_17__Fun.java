package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Main_main_17__Fun extends haxe.lang.Function
{
	public Main_main_17__Fun()
	{
		//line 17 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
		super(1, 0);
	}
	
	
	public static haxe.root.Main_main_17__Fun __hx_current;
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 17 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
		hx_webserver.HTTPRequest d = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((hx_webserver.HTTPRequest) (((java.lang.Object) (__fn_float1) )) )) : (((hx_webserver.HTTPRequest) (__fn_dyn1) )) );
		//line 18 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
		java.lang.Object data = new haxe.format.JsonParser(haxe.lang.Runtime.toString(haxe.crypto.Base64.decode(haxe.lang.StringExt.substring(d.postData, 2, d.postData.length()), null).toString())).doParse();
		//line 19 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
		{
			//line 19 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
			java.lang.String __temp_svar3 = (haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(data, "request", true)));
			//line 19 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
			if (( __temp_svar3 != null )) 
			{
				//line 19 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
				switch (__temp_svar3.hashCode())
				{
					case 1963794526:
					{
						//line 54 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
						if (__temp_svar3.equals("getHistory")) 
						{
							//line 55 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
							int length = 0;
							//line 56 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
							java.lang.Object a = haxe.root.Database.read();
							//line 57 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
							haxe.root.Array<java.lang.Object> r = ((haxe.root.Array<java.lang.Object>) (haxe.lang.Runtime.getField(a, "messages", true)) ).slice(length, null);
							//line 58 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
							haxe.lang.Function replacer = null;
							//line 58 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
							java.lang.String space = null;
							//line 58 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
							d.reply(haxe.format.JsonPrinter.print(((java.lang.Object) (r) ), replacer, space), null);
						}
						
						//line 54 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
						break;
					}
					
					
					case 1591632797:
					{
						//line 59 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
						if (__temp_svar3.equals("userStatus")) 
						{
						}
						
						//line 59 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
						break;
					}
					
					
					case 103149417:
					{
						//line 20 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
						if (__temp_svar3.equals("login")) 
						{
							//line 21 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
							java.lang.String username = "";
							//line 22 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
							java.lang.String password = "";
							//line 24 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
							{
								//line 24 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
								int _g = 0;
								//line 24 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
								int _g1 = ((haxe.root.Array<java.lang.Object>) (haxe.lang.Runtime.getField(data, "parameters", true)) ).length;
								//line 24 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
								while (( _g < _g1 ))
								{
									//line 24 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
									int i = _g++;
									//line 25 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
									{
										//line 25 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
										java.lang.String __temp_svar1 = (haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(((haxe.root.Array<java.lang.Object>) (haxe.lang.Runtime.getField(data, "parameters", true)) ).__get(i), "key", true)));
										//line 25 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
										if (( __temp_svar1 != null )) 
										{
											//line 25 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
											switch (__temp_svar1.hashCode())
											{
												case 1216985755:
												{
													//line 30 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
													if (__temp_svar1.equals("password")) 
													{
														//line 31 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
														haxe.root.Sys.stderr().writeString("Client used unhashed password; rejected request\r\n", null);
														//line 32 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
														d.reply("DANGER: DO NOT USE UNHASHED PASSWORDS!", 400);
													}
													
													//line 30 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
													break;
												}
												
												
												case -265713450:
												{
													//line 27 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
													if (__temp_svar1.equals("username")) 
													{
														//line 27 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
														username = haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(((haxe.root.Array<java.lang.Object>) (haxe.lang.Runtime.getField(data, "parameters", true)) ).__get(i), "value", true));
													}
													
													//line 27 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
													break;
												}
												
												
												case 566700617:
												{
													//line 29 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
													if (__temp_svar1.equals("passwordHash")) 
													{
														//line 29 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
														password = haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(((haxe.root.Array<java.lang.Object>) (haxe.lang.Runtime.getField(data, "parameters", true)) ).__get(i), "value", true));
													}
													
													//line 29 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
													break;
												}
												
												
											}
											
										}
										
									}
									
								}
								
							}
							
						}
						
						//line 20 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
						break;
					}
					
					
					case 466695763:
					{
						//line 61 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
						if (__temp_svar3.equals("statusResponse")) 
						{
						}
						
						//line 61 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
						break;
					}
					
					
					case 954925063:
					{
						//line 35 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
						if (__temp_svar3.equals("message")) 
						{
							//line 36 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
							java.lang.String sender = "";
							//line 37 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
							java.lang.String message = "";
							//line 38 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
							int timestamp = 0;
							//line 39 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
							int crc32 = 0;
							//line 41 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
							{
								//line 41 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
								int _g2 = 0;
								//line 41 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
								haxe.root.Array<java.lang.Object> _g3 = ((haxe.root.Array<java.lang.Object>) (haxe.lang.Runtime.getField(data, "parameters", true)) );
								//line 41 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
								while (( _g2 < _g3.length ))
								{
									//line 41 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
									java.lang.Object v = _g3.__get(_g2);
									//line 41 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
									 ++ _g2;
									//line 42 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
									if (haxe.lang.Runtime.valEq(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(v, "key", true)), "sender")) 
									{
										//line 43 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
										sender = haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(v, "value", true));
									}
									else
									{
										//line 44 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
										if (haxe.lang.Runtime.valEq(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(v, "key", true)), "message")) 
										{
											//line 45 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
											message = haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(v, "value", true));
										}
										else
										{
											//line 46 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
											if (haxe.lang.Runtime.valEq(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(v, "key", true)), "timestamp")) 
											{
												//line 47 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
												timestamp = ((int) (haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(v, "value", true))))) );
											}
											else
											{
												//line 48 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
												if (haxe.lang.Runtime.valEq(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(v, "key", true)), "crc32")) 
												{
													//line 49 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
													crc32 = ((int) (haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(v, "value", true))))) );
												}
												
											}
											
										}
										
									}
									
								}
								
							}
							
							//line 53 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
							haxe.root.Database.addMessage(sender, message, timestamp, crc32);
						}
						
						//line 35 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
						break;
					}
					
					
				}
				
			}
			
		}
		
		//line 65 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
		d.close();
		//line 17 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
		return null;
	}
	
	
}


