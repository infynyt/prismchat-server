package haxe.format;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class JsonParser extends haxe.lang.HxObject
{
	public JsonParser(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public JsonParser(java.lang.String str)
	{
		//line 51 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		haxe.format.JsonParser.__hx_ctor_haxe_format_JsonParser(this, str);
	}
	
	
	protected static void __hx_ctor_haxe_format_JsonParser(haxe.format.JsonParser __hx_this, java.lang.String str)
	{
		//line 52 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		__hx_this.str = str;
		//line 53 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		__hx_this.pos = 0;
	}
	
	
	public java.lang.String str;
	
	public int pos;
	
	public java.lang.Object doParse()
	{
		//line 57 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		java.lang.Object result = this.parseRec();
		//line 58 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		int c = 0;
		//line 59 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		while (true)
		{
			//line 59 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			java.lang.String s = this.str;
			//line 59 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			int index = this.pos++;
			//line 59 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			c = ( (( index < s.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s) )) ).charAt(index)) )) : (-1) );
			//line 59 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			if ( ! ((( c != -1 ))) ) 
			{
				//line 59 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				break;
			}
			
			//line 60 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			switch (c)
			{
				case 9:
				case 10:
				case 13:
				case 32:
				{
					//line 61 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					break;
				}
				
				
				default:
				{
					//line 64 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					this.invalidChar();
					//line 64 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					break;
				}
				
			}
			
		}
		
		//line 67 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		return result;
	}
	
	
	public java.lang.Object parseRec()
	{
		//line 71 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		while (true)
		{
			//line 72 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			java.lang.String s = this.str;
			//line 72 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			int index = this.pos++;
			//line 72 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			int c = ( (( index < s.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s) )) ).charAt(index)) )) : (-1) );
			//line 73 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			switch (c)
			{
				case 9:
				case 10:
				case 13:
				case 32:
				{
					//line 74 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					break;
				}
				
				
				case 34:
				{
					//line 143 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					return this.parseString();
				}
				
				
				case 45:
				case 48:
				case 49:
				case 50:
				case 51:
				case 52:
				case 53:
				case 54:
				case 55:
				case 56:
				case 57:
				{
					//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					int c1 = c;
					//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					int start = ( this.pos - 1 );
					//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					boolean minus = ( c1 == 45 );
					//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					boolean digit =  ! (minus) ;
					//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					boolean zero = ( c1 == 48 );
					//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					boolean point = false;
					//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					boolean e = false;
					//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					boolean pm = false;
					//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					boolean end = false;
					//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					while (true)
					{
						//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						java.lang.String s1 = this.str;
						//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						int index1 = this.pos++;
						//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						c1 = ( (( index1 < s1.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s1) )) ).charAt(index1)) )) : (-1) );
						//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						switch (c1)
						{
							case 43:
							case 45:
							{
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								if ((  ! (e)  || pm )) 
								{
									//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
									this.invalidNumber(start);
								}
								
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								digit = false;
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								pm = true;
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								break;
							}
							
							
							case 46:
							{
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								if (( ( minus || point ) || e )) 
								{
									//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
									this.invalidNumber(start);
								}
								
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								digit = false;
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								point = true;
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								break;
							}
							
							
							case 48:
							{
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								if (( zero &&  ! (point)  )) 
								{
									//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
									this.invalidNumber(start);
								}
								
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								if (minus) 
								{
									//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
									minus = false;
									//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
									zero = true;
								}
								
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								digit = true;
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								break;
							}
							
							
							case 49:
							case 50:
							case 51:
							case 52:
							case 53:
							case 54:
							case 55:
							case 56:
							case 57:
							{
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								if (( zero &&  ! (point)  )) 
								{
									//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
									this.invalidNumber(start);
								}
								
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								if (minus) 
								{
									//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
									minus = false;
								}
								
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								digit = true;
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								zero = false;
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								break;
							}
							
							
							case 69:
							case 101:
							{
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								if (( ( minus || zero ) || e )) 
								{
									//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
									this.invalidNumber(start);
								}
								
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								digit = false;
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								e = true;
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								break;
							}
							
							
							default:
							{
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								if ( ! (digit) ) 
								{
									//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
									this.invalidNumber(start);
								}
								
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								this.pos--;
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								end = true;
								//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								break;
							}
							
						}
						
						//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						if (end) 
						{
							//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							break;
						}
						
					}
					
					//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					double f = haxe.root.Std.parseFloat(haxe.lang.StringExt.substr(this.str, start, ( this.pos - start )));
					//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					if (point) 
					{
						//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						return f;
					}
					else
					{
						//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						int i = ((int) (f) );
						//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						if (( i == f )) 
						{
							//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							return i;
						}
						else
						{
							//line 145 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							return f;
						}
						
					}
					
				}
				
				
				case 91:
				{
					//line 103 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					haxe.root.Array arr = new haxe.root.Array(new java.lang.Object[]{});
					//line 103 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					java.lang.Object comma = null;
					//line 104 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					while (true)
					{
						//line 105 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						java.lang.String s2 = this.str;
						//line 105 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						int index2 = this.pos++;
						//line 105 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						int c2 = ( (( index2 < s2.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s2) )) ).charAt(index2)) )) : (-1) );
						//line 106 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						switch (c2)
						{
							case 9:
							case 10:
							case 13:
							case 32:
							{
								//line 107 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								break;
							}
							
							
							case 44:
							{
								//line 113 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								if (haxe.lang.Runtime.toBool(((java.lang.Boolean) ((comma)) ))) 
								{
									//line 113 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
									comma = false;
								}
								else
								{
									//line 113 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
									this.invalidChar();
								}
								
								//line 113 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								break;
							}
							
							
							case 93:
							{
								//line 110 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								if (haxe.lang.Runtime.eq(comma, false)) 
								{
									//line 110 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
									this.invalidChar();
								}
								
								//line 111 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								return arr;
							}
							
							
							default:
							{
								//line 115 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								if (haxe.lang.Runtime.toBool(((java.lang.Boolean) ((comma)) ))) 
								{
									//line 115 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
									this.invalidChar();
								}
								
								//line 116 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								this.pos--;
								//line 117 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								arr.push(this.parseRec());
								//line 118 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								comma = true;
								//line 114 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								break;
							}
							
						}
						
					}
					
				}
				
				
				case 102:
				{
					//line 129 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					int save = this.pos;
					//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					boolean tmp = false;
					//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					boolean tmp1 = false;
					//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					boolean tmp2 = false;
					//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					java.lang.String s3 = this.str;
					//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					int index3 = this.pos++;
					//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					if (( (( (( index3 < s3.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s3) )) ).charAt(index3)) )) : (-1) )) == 97 )) 
					{
						//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						java.lang.String s4 = this.str;
						//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						int index4 = this.pos++;
						//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						tmp2 = ( (( (( index4 < s4.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s4) )) ).charAt(index4)) )) : (-1) )) != 108 );
					}
					else
					{
						//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						tmp2 = true;
					}
					
					//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					if ( ! (tmp2) ) 
					{
						//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						java.lang.String s5 = this.str;
						//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						int index5 = this.pos++;
						//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						tmp1 = ( (( (( index5 < s5.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s5) )) ).charAt(index5)) )) : (-1) )) != 115 );
					}
					else
					{
						//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						tmp1 = true;
					}
					
					//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					if ( ! (tmp1) ) 
					{
						//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						java.lang.String s6 = this.str;
						//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						int index6 = this.pos++;
						//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						tmp = ( (( (( index6 < s6.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s6) )) ).charAt(index6)) )) : (-1) )) != 101 );
					}
					else
					{
						//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						tmp = true;
					}
					
					//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					if (tmp) 
					{
						//line 131 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						this.pos = save;
						//line 132 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						this.invalidChar();
					}
					
					//line 134 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					return false;
				}
				
				
				case 110:
				{
					//line 136 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					int save1 = this.pos;
					//line 137 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					boolean tmp3 = false;
					//line 137 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					boolean tmp4 = false;
					//line 137 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					java.lang.String s7 = this.str;
					//line 137 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					int index7 = this.pos++;
					//line 137 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					if (( (( (( index7 < s7.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s7) )) ).charAt(index7)) )) : (-1) )) == 117 )) 
					{
						//line 137 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						java.lang.String s8 = this.str;
						//line 137 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						int index8 = this.pos++;
						//line 137 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						tmp4 = ( (( (( index8 < s8.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s8) )) ).charAt(index8)) )) : (-1) )) != 108 );
					}
					else
					{
						//line 137 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						tmp4 = true;
					}
					
					//line 137 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					if ( ! (tmp4) ) 
					{
						//line 137 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						java.lang.String s9 = this.str;
						//line 137 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						int index9 = this.pos++;
						//line 137 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						tmp3 = ( (( (( index9 < s9.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s9) )) ).charAt(index9)) )) : (-1) )) != 108 );
					}
					else
					{
						//line 137 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						tmp3 = true;
					}
					
					//line 137 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					if (tmp3) 
					{
						//line 138 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						this.pos = save1;
						//line 139 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						this.invalidChar();
					}
					
					//line 141 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					return null;
				}
				
				
				case 116:
				{
					//line 122 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					int save2 = this.pos;
					//line 123 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					boolean tmp5 = false;
					//line 123 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					boolean tmp6 = false;
					//line 123 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					java.lang.String s10 = this.str;
					//line 123 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					int index10 = this.pos++;
					//line 123 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					if (( (( (( index10 < s10.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s10) )) ).charAt(index10)) )) : (-1) )) == 114 )) 
					{
						//line 123 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						java.lang.String s11 = this.str;
						//line 123 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						int index11 = this.pos++;
						//line 123 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						tmp6 = ( (( (( index11 < s11.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s11) )) ).charAt(index11)) )) : (-1) )) != 117 );
					}
					else
					{
						//line 123 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						tmp6 = true;
					}
					
					//line 123 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					if ( ! (tmp6) ) 
					{
						//line 123 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						java.lang.String s12 = this.str;
						//line 123 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						int index12 = this.pos++;
						//line 123 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						tmp5 = ( (( (( index12 < s12.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s12) )) ).charAt(index12)) )) : (-1) )) != 101 );
					}
					else
					{
						//line 123 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						tmp5 = true;
					}
					
					//line 123 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					if (tmp5) 
					{
						//line 124 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						this.pos = save2;
						//line 125 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						this.invalidChar();
					}
					
					//line 127 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					return true;
				}
				
				
				case 123:
				{
					//line 77 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					java.lang.Object obj = new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{});
					//line 77 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					java.lang.String field = null;
					//line 77 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					java.lang.Object comma1 = null;
					//line 78 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					while (true)
					{
						//line 79 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						java.lang.String s13 = this.str;
						//line 79 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						int index13 = this.pos++;
						//line 79 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						int c3 = ( (( index13 < s13.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s13) )) ).charAt(index13)) )) : (-1) );
						//line 80 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						switch (c3)
						{
							case 9:
							case 10:
							case 13:
							case 32:
							{
								//line 81 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								break;
							}
							
							
							case 34:
							{
								//line 96 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								if (( haxe.lang.Runtime.toBool(((java.lang.Boolean) (( field != null )) )) || haxe.lang.Runtime.toBool(((java.lang.Boolean) (comma1) )) )) 
								{
									//line 96 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
									this.invalidChar();
								}
								
								//line 97 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								field = this.parseString();
								//line 95 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								break;
							}
							
							
							case 44:
							{
								//line 94 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								if (haxe.lang.Runtime.toBool(((java.lang.Boolean) ((comma1)) ))) 
								{
									//line 94 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
									comma1 = false;
								}
								else
								{
									//line 94 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
									this.invalidChar();
								}
								
								//line 94 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								break;
							}
							
							
							case 58:
							{
								//line 88 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								if (( field == null )) 
								{
									//line 89 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
									this.invalidChar();
								}
								
								//line 90 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								haxe.root.Reflect.setField(obj, field, this.parseRec());
								//line 91 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								field = null;
								//line 92 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								comma1 = true;
								//line 87 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								break;
							}
							
							
							case 125:
							{
								//line 84 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								if (( ( field != null ) || haxe.lang.Runtime.eq(comma1, false) )) 
								{
									//line 85 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
									this.invalidChar();
								}
								
								//line 86 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								return obj;
							}
							
							
							default:
							{
								//line 99 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								this.invalidChar();
								//line 99 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								break;
							}
							
						}
						
					}
					
				}
				
				
				default:
				{
					//line 147 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					this.invalidChar();
					//line 147 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					break;
				}
				
			}
			
		}
		
	}
	
	
	public java.lang.String parseString()
	{
		//line 153 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		int start = this.pos;
		//line 154 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		haxe.root.StringBuf buf = null;
		//line 156 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		int prev = -1;
		//line 163 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		while (true)
		{
			//line 164 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			java.lang.String s = this.str;
			//line 164 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			int index = this.pos++;
			//line 164 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			int c = ( (( index < s.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s) )) ).charAt(index)) )) : (-1) );
			//line 165 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			if (( c == 34 )) 
			{
				//line 166 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				break;
			}
			
			//line 167 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			if (( c == 92 )) 
			{
				//line 168 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				if (( buf == null )) 
				{
					//line 169 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					buf = new haxe.root.StringBuf();
				}
				
				//line 171 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				buf.addSub(this.str, start, ( ( this.pos - start ) - 1 ));
				//line 172 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				java.lang.String s1 = this.str;
				//line 172 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				int index1 = this.pos++;
				//line 172 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				c = ( (( index1 < s1.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s1) )) ).charAt(index1)) )) : (-1) );
				//line 174 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				if (( ( c != 117 ) && ( prev != -1 ) )) 
				{
					//line 175 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					buf.addChar(65533);
					//line 175 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					prev = -1;
				}
				
				//line 177 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				switch (c)
				{
					case 34:
					case 47:
					case 92:
					{
						//line 189 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						buf.addChar(c);
						//line 189 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
					case 98:
					{
						//line 185 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						buf.addChar(8);
						//line 185 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
					case 102:
					{
						//line 187 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						buf.addChar(12);
						//line 187 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
					case 110:
					{
						//line 181 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						buf.addChar(10);
						//line 181 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
					case 114:
					{
						//line 179 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						buf.addChar(13);
						//line 179 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
					case 116:
					{
						//line 183 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						buf.addChar(9);
						//line 183 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
					case 117:
					{
						//line 191 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						int uc = ((int) (haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(( "0x" + haxe.lang.StringExt.substr(this.str, this.pos, 4) )))) );
						//line 192 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						this.pos += 4;
						//line 210 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						if (( prev != -1 )) 
						{
							//line 211 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							if (( ( uc < 56320 ) || ( uc > 57343 ) )) 
							{
								//line 212 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								buf.addChar(65533);
								//line 212 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								prev = -1;
							}
							else
							{
								//line 214 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								buf.addChar(( ( (( ( prev - 55296 ) << 10 )) + (( uc - 56320 )) ) + 65536 ));
								//line 215 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								prev = -1;
							}
							
						}
						else
						{
							//line 217 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							if (( ( uc >= 55296 ) && ( uc <= 56319 ) )) 
							{
								//line 218 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								prev = uc;
							}
							else
							{
								//line 220 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
								buf.addChar(uc);
							}
							
						}
						
						//line 190 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
					default:
					{
						//line 223 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						throw ((java.lang.RuntimeException) (haxe.Exception.thrown(( ( ( "Invalid escape sequence \\" + new java.lang.String( java.lang.Character.toChars((int) c) ) ) + " at position " ) + (( this.pos - 1 )) ))) );
					}
					
				}
				
				//line 225 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				start = this.pos;
			}
			else
			{
				//line 241 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				if (( c == -1 )) 
				{
					//line 242 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
					throw ((java.lang.RuntimeException) (haxe.Exception.thrown("Unclosed string")) );
				}
				
			}
			
		}
		
		//line 245 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		if (( prev != -1 )) 
		{
			//line 246 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			buf.addChar(65533);
			//line 246 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			prev = -1;
		}
		
		//line 248 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		if (( buf == null )) 
		{
			//line 249 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			return haxe.lang.StringExt.substr(this.str, start, ( ( this.pos - start ) - 1 ));
		}
		else
		{
			//line 251 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			buf.addSub(this.str, start, ( ( this.pos - start ) - 1 ));
			//line 252 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			return buf.toString();
		}
		
	}
	
	
	public void invalidChar()
	{
		//line 317 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		this.pos--;
		//line 318 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		java.lang.String s = this.str;
		//line 318 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		int index = this.pos;
		//line 318 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		throw ((java.lang.RuntimeException) (haxe.Exception.thrown(( ( ( "Invalid char " + (( (( index < s.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s) )) ).charAt(index)) )) : (-1) )) ) + " at position " ) + this.pos ))) );
	}
	
	
	public void invalidNumber(int start)
	{
		//line 322 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		throw ((java.lang.RuntimeException) (haxe.Exception.thrown(( ( ( "Invalid number at position " + start ) + ": " ) + haxe.lang.StringExt.substr(this.str, start, ( this.pos - start )) ))) );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		{
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			if (( field != null )) 
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				switch (field.hashCode())
				{
					case 111188:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						if (field.equals("pos")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							this.pos = ((int) (value) );
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							return value;
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		{
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			if (( field != null )) 
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				switch (field.hashCode())
				{
					case 111188:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						if (field.equals("pos")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							this.pos = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							return value;
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
					case 114225:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						if (field.equals("str")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							this.str = haxe.lang.Runtime.toString(value);
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							return value;
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		{
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			if (( field != null )) 
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				switch (field.hashCode())
				{
					case -1321720800:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						if (field.equals("invalidNumber")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "invalidNumber")) );
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
					case 114225:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						if (field.equals("str")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							return this.str;
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
					case -953670163:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						if (field.equals("invalidChar")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "invalidChar")) );
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
					case 111188:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						if (field.equals("pos")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							return this.pos;
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
					case -678275932:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						if (field.equals("parseString")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "parseString")) );
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
					case 1810775272:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						if (field.equals("doParse")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "doParse")) );
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
					case 1187792093:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						if (field.equals("parseRec")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "parseRec")) );
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		{
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			if (( field != null )) 
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				switch (field.hashCode())
				{
					case 111188:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						if (field.equals("pos")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							return ((double) (this.pos) );
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		{
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			if (( field != null )) 
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				switch (field.hashCode())
				{
					case -1321720800:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						if (field.equals("invalidNumber")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							this.invalidNumber(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ));
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
					case 1810775272:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						if (field.equals("doParse")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							return this.doParse();
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
					case -953670163:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						if (field.equals("invalidChar")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							this.invalidChar();
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
					case 1187792093:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						if (field.equals("parseRec")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							return this.parseRec();
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
					case -678275932:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						if (field.equals("parseString")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
							return this.parseString();
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		baseArr.push("pos");
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		baseArr.push("str");
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\format\\JsonParser.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


