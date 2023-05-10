package haxe.format;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class JsonPrinter extends haxe.lang.HxObject
{
	public JsonPrinter(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public JsonPrinter(haxe.lang.Function replacer, java.lang.String space)
	{
		//line 56 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		haxe.format.JsonPrinter.__hx_ctor_haxe_format_JsonPrinter(this, replacer, space);
	}
	
	
	protected static void __hx_ctor_haxe_format_JsonPrinter(haxe.format.JsonPrinter __hx_this, haxe.lang.Function replacer, java.lang.String space)
	{
		//line 57 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		__hx_this.replacer = replacer;
		//line 58 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		__hx_this.indent = space;
		//line 59 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		__hx_this.pretty = ( space != null );
		//line 60 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		__hx_this.nind = 0;
		//line 67 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		__hx_this.buf = new haxe.root.StringBuf();
	}
	
	
	public static java.lang.String print(java.lang.Object o, haxe.lang.Function replacer, java.lang.String space)
	{
		//line 45 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		haxe.format.JsonPrinter printer = new haxe.format.JsonPrinter(((haxe.lang.Function) (replacer) ), haxe.lang.Runtime.toString(space));
		//line 46 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		printer.write("", o);
		//line 47 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		return printer.buf.toString();
	}
	
	
	public haxe.root.StringBuf buf;
	
	public haxe.lang.Function replacer;
	
	public java.lang.String indent;
	
	public boolean pretty;
	
	public int nind;
	
	public void write(java.lang.Object k, java.lang.Object v)
	{
		//line 82 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		if (( this.replacer != null )) 
		{
			//line 83 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			v = ((java.lang.Object) (this.replacer.__hx_invoke2_o(0.0, k, 0.0, v)) );
		}
		
		//line 84 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		{
			//line 84 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			haxe.root.ValueType _g = haxe.root.Type.typeof(v);
			//line 84 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			switch (_g.index)
			{
				case 0:
				{
					//line 136 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					this.buf.add(haxe.lang.Runtime.toString("null"));
					//line 136 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
					//line 136 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					break;
				}
				
				
				case 1:
				{
					//line 90 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					this.buf.add(haxe.lang.Runtime.toString(v));
					//line 90 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					java.lang.Object __temp_expr2 = ((java.lang.Object) (null) );
					//line 90 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					break;
				}
				
				
				case 2:
				{
					//line 92 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					java.lang.String v1 = ( (haxe.lang.Runtime.isFinite(((double) (haxe.lang.Runtime.toDouble(v)) ))) ? (haxe.root.Std.string(v)) : ("null") );
					//line 92 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					this.buf.add(haxe.lang.Runtime.toString(v1));
					//line 92 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					java.lang.Object __temp_expr3 = ((java.lang.Object) (null) );
					//line 92 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					break;
				}
				
				
				case 3:
				{
					//line 134 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					this.buf.add(haxe.lang.Runtime.toString(v));
					//line 134 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					java.lang.Object __temp_expr4 = ((java.lang.Object) (null) );
					//line 134 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					break;
				}
				
				
				case 4:
				{
					//line 88 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					this.fieldsString(v, haxe.root.Reflect.fields(v));
					//line 88 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					break;
				}
				
				
				case 5:
				{
					//line 94 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					this.buf.add(haxe.lang.Runtime.toString("\"<fun>\""));
					//line 94 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					java.lang.Object __temp_expr5 = ((java.lang.Object) (null) );
					//line 94 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					break;
				}
				
				
				case 6:
				{
					//line 95 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					java.lang.Class c = ((java.lang.Class) (_g.params[0]) );
					//line 96 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					if (( ((java.lang.Object) (c) ) == ((java.lang.Object) (java.lang.String.class) ) )) 
					{
						//line 97 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						this.quote(haxe.lang.Runtime.toString(v));
					}
					else
					{
						//line 98 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						if (( ((java.lang.Object) (c) ) == ((java.lang.Object) (haxe.root.Array.class) ) )) 
						{
							//line 99 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							haxe.root.Array v2 = ((haxe.root.Array) (v) );
							//line 100 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							this.buf.addChar(91);
							//line 102 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							int len = v2.length;
							//line 103 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							int last = ( len - 1 );
							//line 104 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							{
								//line 104 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
								int _g1 = 0;
								//line 104 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
								int _g2 = len;
								//line 104 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
								while (( _g1 < _g2 ))
								{
									//line 104 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
									int i = _g1++;
									//line 105 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
									if (( i > 0 )) 
									{
										//line 106 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
										this.buf.addChar(44);
									}
									else
									{
										//line 108 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
										this.nind++;
									}
									
									//line 109 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
									if (this.pretty) 
									{
										//line 109 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
										this.buf.addChar(10);
									}
									
									//line 110 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
									if (this.pretty) 
									{
										//line 110 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
										java.lang.String v3 = haxe.root.StringTools.lpad("", this.indent, ( this.nind * this.indent.length() ));
										//line 110 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
										this.buf.add(haxe.lang.Runtime.toString(v3));
										//line 110 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
										java.lang.Object __temp_expr6 = ((java.lang.Object) (null) );
									}
									
									//line 111 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
									this.write(i, v2.__get(i));
									//line 112 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
									if (( i == last )) 
									{
										//line 113 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
										this.nind--;
										//line 114 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
										if (this.pretty) 
										{
											//line 114 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
											this.buf.addChar(10);
										}
										
										//line 115 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
										if (this.pretty) 
										{
											//line 115 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
											java.lang.String v4 = haxe.root.StringTools.lpad("", this.indent, ( this.nind * this.indent.length() ));
											//line 115 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
											this.buf.add(haxe.lang.Runtime.toString(v4));
											//line 115 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
											java.lang.Object __temp_expr7 = ((java.lang.Object) (null) );
										}
										
									}
									
								}
								
							}
							
							//line 118 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							this.buf.addChar(93);
						}
						else
						{
							//line 119 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							if (( ((java.lang.Object) (c) ) == ((java.lang.Object) (haxe.ds.StringMap.class) ) )) 
							{
								//line 120 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
								haxe.ds.StringMap v5 = ((haxe.ds.StringMap) (v) );
								//line 121 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
								java.lang.Object o = new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{});
								//line 122 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
								{
									//line 122 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
									java.lang.Object k1 = ((java.lang.Object) (new haxe.ds._StringMap.StringMapKeyIterator(((haxe.ds.StringMap<java.lang.Object>) (v5) ))) );
									//line 122 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
									while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(k1, "hasNext", null)) )))
									{
										//line 122 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
										java.lang.String k2 = haxe.lang.Runtime.toString(haxe.lang.Runtime.callField(k1, "next", null));
										//line 123 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
										haxe.root.Reflect.setField(o, k2, v5.get(k2));
									}
									
								}
								
								//line 124 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
								{
									//line 124 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
									java.lang.Object v6 = ((java.lang.Object) (o) );
									//line 124 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
									this.fieldsString(v6, haxe.root.Reflect.fields(v6));
								}
								
							}
							else
							{
								//line 125 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
								if (( ((java.lang.Object) (c) ) == ((java.lang.Object) (haxe.root.Date.class) ) )) 
								{
									//line 126 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
									haxe.root.Date v7 = ((haxe.root.Date) (v) );
									//line 127 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
									this.quote(v7.toString());
								}
								else
								{
									//line 129 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
									this.classString(v);
								}
								
							}
							
						}
						
					}
					
					//line 95 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					break;
				}
				
				
				case 7:
				{
					//line 130 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					java.lang.Class _g3 = ((java.lang.Class) (_g.params[0]) );
					//line 130 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					{
						//line 131 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						java.lang.Object i1 = haxe.root.Type.enumIndex(v);
						//line 132 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						this.buf.add(haxe.lang.Runtime.toString(i1));
						//line 132 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						java.lang.Object __temp_expr8 = ((java.lang.Object) (null) );
					}
					
					//line 130 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					break;
				}
				
				
				case 8:
				{
					//line 86 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					this.buf.add(haxe.lang.Runtime.toString("\"???\""));
					//line 86 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					java.lang.Object __temp_expr9 = ((java.lang.Object) (null) );
					//line 86 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					break;
				}
				
				
			}
			
		}
		
	}
	
	
	public void classString(java.lang.Object v)
	{
		//line 158 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		this.fieldsString(v, haxe.root.Type.getInstanceFields(((java.lang.Class) (haxe.root.Type.getClass(((java.lang.Object) (v) ))) )));
	}
	
	
	public void fieldsString(java.lang.Object v, haxe.root.Array<java.lang.String> fields)
	{
		//line 166 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		this.buf.addChar(123);
		//line 167 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		int len = fields.length;
		//line 168 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		int last = ( len - 1 );
		//line 169 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		boolean first = true;
		//line 170 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		{
			//line 170 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			int _g = 0;
			//line 170 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			int _g1 = len;
			//line 170 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			while (( _g < _g1 ))
			{
				//line 170 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				int i = _g++;
				//line 171 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				java.lang.String f = fields.__get(i);
				//line 172 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				java.lang.Object value = haxe.root.Reflect.field(v, f);
				//line 173 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				if (haxe.root.Reflect.isFunction(value)) 
				{
					//line 174 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					continue;
				}
				
				//line 175 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				if (first) 
				{
					//line 176 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					this.nind++;
					//line 177 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					first = false;
				}
				else
				{
					//line 179 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					this.buf.addChar(44);
				}
				
				//line 180 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				if (this.pretty) 
				{
					//line 180 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					this.buf.addChar(10);
				}
				
				//line 181 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				if (this.pretty) 
				{
					//line 181 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					java.lang.String v1 = haxe.root.StringTools.lpad("", this.indent, ( this.nind * this.indent.length() ));
					//line 181 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					this.buf.add(haxe.lang.Runtime.toString(v1));
					//line 181 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
				}
				
				//line 182 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				this.quote(f);
				//line 183 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				this.buf.addChar(58);
				//line 184 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				if (this.pretty) 
				{
					//line 185 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					this.buf.addChar(32);
				}
				
				//line 186 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				this.write(f, value);
				//line 187 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				if (( i == last )) 
				{
					//line 188 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					this.nind--;
					//line 189 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					if (this.pretty) 
					{
						//line 189 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						this.buf.addChar(10);
					}
					
					//line 190 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					if (this.pretty) 
					{
						//line 190 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						java.lang.String v2 = haxe.root.StringTools.lpad("", this.indent, ( this.nind * this.indent.length() ));
						//line 190 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						this.buf.add(haxe.lang.Runtime.toString(v2));
						//line 190 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						java.lang.Object __temp_expr2 = ((java.lang.Object) (null) );
					}
					
				}
				
			}
			
		}
		
		//line 193 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		this.buf.addChar(125);
	}
	
	
	public void quote(java.lang.String s)
	{
		//line 203 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		this.buf.addChar(34);
		//line 204 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		int i = 0;
		//line 205 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		int length = s.length();
		//line 209 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		while (( i < length ))
		{
			//line 210 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			int c = ((int) (((java.lang.String) (((java.lang.Object) (s) )) ).charAt(i++)) );
			//line 211 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			switch (c)
			{
				case 8:
				{
					//line 223 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					this.buf.add(haxe.lang.Runtime.toString("\\b"));
					//line 223 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
					//line 223 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					break;
				}
				
				
				case 9:
				{
					//line 221 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					this.buf.add(haxe.lang.Runtime.toString("\\t"));
					//line 221 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					java.lang.Object __temp_expr2 = ((java.lang.Object) (null) );
					//line 221 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					break;
				}
				
				
				case 10:
				{
					//line 217 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					this.buf.add(haxe.lang.Runtime.toString("\\n"));
					//line 217 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					java.lang.Object __temp_expr3 = ((java.lang.Object) (null) );
					//line 217 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					break;
				}
				
				
				case 12:
				{
					//line 225 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					this.buf.add(haxe.lang.Runtime.toString("\\f"));
					//line 225 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					java.lang.Object __temp_expr4 = ((java.lang.Object) (null) );
					//line 225 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					break;
				}
				
				
				case 13:
				{
					//line 219 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					this.buf.add(haxe.lang.Runtime.toString("\\r"));
					//line 219 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					java.lang.Object __temp_expr5 = ((java.lang.Object) (null) );
					//line 219 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					break;
				}
				
				
				case 34:
				{
					//line 213 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					this.buf.add(haxe.lang.Runtime.toString("\\\""));
					//line 213 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					java.lang.Object __temp_expr6 = ((java.lang.Object) (null) );
					//line 213 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					break;
				}
				
				
				case 92:
				{
					//line 215 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					this.buf.add(haxe.lang.Runtime.toString("\\\\"));
					//line 215 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					java.lang.Object __temp_expr7 = ((java.lang.Object) (null) );
					//line 215 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					break;
				}
				
				
				default:
				{
					//line 248 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					this.buf.addChar(c);
					//line 248 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
					break;
				}
				
			}
			
		}
		
		//line 256 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		this.buf.addChar(34);
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		{
			//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			if (( field != null )) 
			{
				//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				switch (field.hashCode())
				{
					case 3381425:
					{
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						if (field.equals("nind")) 
						{
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							__temp_executeDef1 = false;
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							this.nind = ((int) (value) );
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							return value;
						}
						
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		{
			//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			if (( field != null )) 
			{
				//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				switch (field.hashCode())
				{
					case 3381425:
					{
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						if (field.equals("nind")) 
						{
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							__temp_executeDef1 = false;
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							this.nind = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							return value;
						}
						
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						break;
					}
					
					
					case 97907:
					{
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						if (field.equals("buf")) 
						{
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							__temp_executeDef1 = false;
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							this.buf = ((haxe.root.StringBuf) (value) );
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							return value;
						}
						
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						break;
					}
					
					
					case -980096906:
					{
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						if (field.equals("pretty")) 
						{
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							__temp_executeDef1 = false;
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							this.pretty = haxe.lang.Runtime.toBool(((java.lang.Boolean) (value) ));
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							return value;
						}
						
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						break;
					}
					
					
					case -430332866:
					{
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						if (field.equals("replacer")) 
						{
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							__temp_executeDef1 = false;
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							this.replacer = ((haxe.lang.Function) (value) );
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							return value;
						}
						
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						break;
					}
					
					
					case -1184239444:
					{
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						if (field.equals("indent")) 
						{
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							__temp_executeDef1 = false;
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							this.indent = haxe.lang.Runtime.toString(value);
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							return value;
						}
						
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		{
			//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			if (( field != null )) 
			{
				//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				switch (field.hashCode())
				{
					case 107953788:
					{
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						if (field.equals("quote")) 
						{
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							__temp_executeDef1 = false;
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "quote")) );
						}
						
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						break;
					}
					
					
					case 97907:
					{
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						if (field.equals("buf")) 
						{
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							__temp_executeDef1 = false;
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							return this.buf;
						}
						
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						break;
					}
					
					
					case -66446294:
					{
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						if (field.equals("fieldsString")) 
						{
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							__temp_executeDef1 = false;
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "fieldsString")) );
						}
						
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						break;
					}
					
					
					case -430332866:
					{
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						if (field.equals("replacer")) 
						{
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							__temp_executeDef1 = false;
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							return this.replacer;
						}
						
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						break;
					}
					
					
					case -752288855:
					{
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						if (field.equals("classString")) 
						{
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							__temp_executeDef1 = false;
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "classString")) );
						}
						
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						break;
					}
					
					
					case -1184239444:
					{
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						if (field.equals("indent")) 
						{
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							__temp_executeDef1 = false;
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							return this.indent;
						}
						
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						break;
					}
					
					
					case 113399775:
					{
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						if (field.equals("write")) 
						{
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							__temp_executeDef1 = false;
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "write")) );
						}
						
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						break;
					}
					
					
					case -980096906:
					{
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						if (field.equals("pretty")) 
						{
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							__temp_executeDef1 = false;
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							return this.pretty;
						}
						
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						break;
					}
					
					
					case 3381425:
					{
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						if (field.equals("nind")) 
						{
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							__temp_executeDef1 = false;
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							return this.nind;
						}
						
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		{
			//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			if (( field != null )) 
			{
				//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				switch (field.hashCode())
				{
					case 3381425:
					{
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						if (field.equals("nind")) 
						{
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							__temp_executeDef1 = false;
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							return ((double) (this.nind) );
						}
						
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		{
			//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			if (( field != null )) 
			{
				//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				switch (field.hashCode())
				{
					case 107953788:
					{
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						if (field.equals("quote")) 
						{
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							__temp_executeDef1 = false;
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							this.quote(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						break;
					}
					
					
					case 113399775:
					{
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						if (field.equals("write")) 
						{
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							__temp_executeDef1 = false;
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							this.write(dynargs[0], dynargs[1]);
						}
						
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						break;
					}
					
					
					case -66446294:
					{
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						if (field.equals("fieldsString")) 
						{
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							__temp_executeDef1 = false;
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							this.fieldsString(dynargs[0], ((haxe.root.Array<java.lang.String>) (dynargs[1]) ));
						}
						
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						break;
					}
					
					
					case -752288855:
					{
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						if (field.equals("classString")) 
						{
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							__temp_executeDef1 = false;
							//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
							this.classString(dynargs[0]);
						}
						
						//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		baseArr.push("nind");
		//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		baseArr.push("pretty");
		//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		baseArr.push("indent");
		//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		baseArr.push("replacer");
		//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		baseArr.push("buf");
		//line 33 "/usr/share/haxe/std/haxe/format/JsonPrinter.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


