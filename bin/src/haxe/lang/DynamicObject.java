package haxe.lang;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class DynamicObject extends haxe.lang.HxObject
{
	static
	{
		//line 50 "/usr/share/haxe/std/java/internal/HxObject.hx"
		haxe.lang.DynamicObject.__hx_toString_depth = 0;
	}
	
	public DynamicObject(haxe.lang.EmptyObject empty)
	{
		//line 40 "/usr/share/haxe/std/java/internal/HxObject.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public DynamicObject(java.lang.String[] fields, java.lang.Object[] dynamics, java.lang.String[] fields_f, double[] dynamics_f)
	{
		//line 59 "/usr/share/haxe/std/java/internal/HxObject.hx"
		haxe.lang.DynamicObject.__hx_ctor_haxe_lang_DynamicObject(((haxe.lang.DynamicObject) (this) ), ((java.lang.String[]) (fields) ), ((java.lang.Object[]) (dynamics) ), ((java.lang.String[]) (fields_f) ), ((double[]) (dynamics_f) ));
	}
	
	
	public DynamicObject()
	{
		//line 52 "/usr/share/haxe/std/java/internal/HxObject.hx"
		haxe.lang.DynamicObject.__hx_ctor_haxe_lang_DynamicObject(((haxe.lang.DynamicObject) (this) ));
	}
	
	
	protected static void __hx_ctor_haxe_lang_DynamicObject(haxe.lang.DynamicObject __hx_this, java.lang.String[] fields, java.lang.Object[] dynamics, java.lang.String[] fields_f, double[] dynamics_f)
	{
		//line 60 "/usr/share/haxe/std/java/internal/HxObject.hx"
		__hx_this.__hx_fields = fields;
		//line 61 "/usr/share/haxe/std/java/internal/HxObject.hx"
		__hx_this.__hx_dynamics = dynamics;
		//line 62 "/usr/share/haxe/std/java/internal/HxObject.hx"
		__hx_this.__hx_fields_f = fields_f;
		//line 63 "/usr/share/haxe/std/java/internal/HxObject.hx"
		__hx_this.__hx_dynamics_f = dynamics_f;
		//line 64 "/usr/share/haxe/std/java/internal/HxObject.hx"
		__hx_this.__hx_length = fields.length;
		//line 65 "/usr/share/haxe/std/java/internal/HxObject.hx"
		__hx_this.__hx_length_f = fields_f.length;
	}
	
	
	protected static void __hx_ctor_haxe_lang_DynamicObject(haxe.lang.DynamicObject __hx_this)
	{
		//line 53 "/usr/share/haxe/std/java/internal/HxObject.hx"
		__hx_this.__hx_fields = new java.lang.String[0];
		//line 54 "/usr/share/haxe/std/java/internal/HxObject.hx"
		__hx_this.__hx_dynamics = new java.lang.Object[0];
		//line 55 "/usr/share/haxe/std/java/internal/HxObject.hx"
		__hx_this.__hx_fields_f = new java.lang.String[0];
		//line 56 "/usr/share/haxe/std/java/internal/HxObject.hx"
		__hx_this.__hx_dynamics_f = new double[0];
	}
	
	
	public static int __hx_toString_depth;
	
	public java.lang.String[] __hx_fields;
	
	public java.lang.Object[] __hx_dynamics;
	
	public java.lang.String[] __hx_fields_f;
	
	public double[] __hx_dynamics_f;
	
	public int __hx_length;
	
	public int __hx_length_f;
	
	public boolean __hx_deleteField(java.lang.String field)
	{
		//line 69 "/usr/share/haxe/std/java/internal/HxObject.hx"
		int res = haxe.lang.FieldLookup.findHash(field, this.__hx_fields, this.__hx_length);
		//line 70 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (( res >= 0 )) 
		{
			//line 71 "/usr/share/haxe/std/java/internal/HxObject.hx"
			haxe.lang.FieldLookup.removeString(this.__hx_fields, this.__hx_length, res);
			//line 72 "/usr/share/haxe/std/java/internal/HxObject.hx"
			haxe.lang.FieldLookup.removeDynamic(this.__hx_dynamics, this.__hx_length, res);
			//line 73 "/usr/share/haxe/std/java/internal/HxObject.hx"
			this.__hx_length--;
			//line 74 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return true;
		}
		
		//line 76 "/usr/share/haxe/std/java/internal/HxObject.hx"
		int res1 = haxe.lang.FieldLookup.findHash(field, this.__hx_fields_f, this.__hx_length_f);
		//line 77 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (( res1 >= 0 )) 
		{
			//line 78 "/usr/share/haxe/std/java/internal/HxObject.hx"
			haxe.lang.FieldLookup.removeString(this.__hx_fields_f, this.__hx_length_f, res1);
			//line 79 "/usr/share/haxe/std/java/internal/HxObject.hx"
			haxe.lang.FieldLookup.removeFloat(this.__hx_dynamics_f, this.__hx_length_f, res1);
			//line 80 "/usr/share/haxe/std/java/internal/HxObject.hx"
			this.__hx_length_f--;
			//line 81 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return true;
		}
		
		//line 83 "/usr/share/haxe/std/java/internal/HxObject.hx"
		return false;
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 87 "/usr/share/haxe/std/java/internal/HxObject.hx"
		int res = haxe.lang.FieldLookup.findHash(field, this.__hx_fields, this.__hx_length);
		//line 88 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (( res >= 0 )) 
		{
			//line 89 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return this.__hx_dynamics[res];
		}
		
		//line 91 "/usr/share/haxe/std/java/internal/HxObject.hx"
		res = haxe.lang.FieldLookup.findHash(field, this.__hx_fields_f, this.__hx_length_f);
		//line 92 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (( res >= 0 )) 
		{
			//line 93 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return this.__hx_dynamics_f[res];
		}
		
		//line 96 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (isCheck) 
		{
			//line 96 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return haxe.lang.Runtime.undefined;
		}
		else
		{
			//line 96 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return null;
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 100 "/usr/share/haxe/std/java/internal/HxObject.hx"
		int res = haxe.lang.FieldLookup.findHash(field, this.__hx_fields, this.__hx_length);
		//line 101 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (( res >= 0 )) 
		{
			//line 102 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return this.__hx_dynamics[res] = value;
		}
		else
		{
			//line 104 "/usr/share/haxe/std/java/internal/HxObject.hx"
			int res1 = haxe.lang.FieldLookup.findHash(field, this.__hx_fields_f, this.__hx_length_f);
			//line 105 "/usr/share/haxe/std/java/internal/HxObject.hx"
			if (( res1 >= 0 )) 
			{
				//line 106 "/usr/share/haxe/std/java/internal/HxObject.hx"
				if (haxe.lang.Runtime.isDouble(value)) 
				{
					//line 107 "/usr/share/haxe/std/java/internal/HxObject.hx"
					return this.__hx_dynamics_f[res1] = ((double) (haxe.lang.Runtime.toDouble(value)) );
				}
				
				//line 110 "/usr/share/haxe/std/java/internal/HxObject.hx"
				haxe.lang.FieldLookup.removeString(this.__hx_fields_f, this.__hx_length_f, res1);
				//line 111 "/usr/share/haxe/std/java/internal/HxObject.hx"
				haxe.lang.FieldLookup.removeFloat(this.__hx_dynamics_f, this.__hx_length_f, res1);
				//line 112 "/usr/share/haxe/std/java/internal/HxObject.hx"
				this.__hx_length_f--;
			}
			
		}
		
		//line 116 "/usr/share/haxe/std/java/internal/HxObject.hx"
		this.__hx_fields = haxe.lang.FieldLookup.insertString(this.__hx_fields, this.__hx_length,  ~ (res) , field);
		//line 117 "/usr/share/haxe/std/java/internal/HxObject.hx"
		this.__hx_dynamics = haxe.lang.FieldLookup.insertDynamic(this.__hx_dynamics, this.__hx_length,  ~ (res) , value);
		//line 118 "/usr/share/haxe/std/java/internal/HxObject.hx"
		this.__hx_length++;
		//line 119 "/usr/share/haxe/std/java/internal/HxObject.hx"
		return value;
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 123 "/usr/share/haxe/std/java/internal/HxObject.hx"
		int res = haxe.lang.FieldLookup.findHash(field, this.__hx_fields_f, this.__hx_length_f);
		//line 124 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (( res >= 0 )) 
		{
			//line 125 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return this.__hx_dynamics_f[res];
		}
		
		//line 127 "/usr/share/haxe/std/java/internal/HxObject.hx"
		res = haxe.lang.FieldLookup.findHash(field, this.__hx_fields, this.__hx_length);
		//line 128 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (( res >= 0 )) 
		{
			//line 129 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return ((double) (haxe.lang.Runtime.toDouble(this.__hx_dynamics[res])) );
		}
		
		//line 132 "/usr/share/haxe/std/java/internal/HxObject.hx"
		return 0.0;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 136 "/usr/share/haxe/std/java/internal/HxObject.hx"
		int res = haxe.lang.FieldLookup.findHash(field, this.__hx_fields_f, this.__hx_length_f);
		//line 137 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (( res >= 0 )) 
		{
			//line 138 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return this.__hx_dynamics_f[res] = value;
		}
		else
		{
			//line 140 "/usr/share/haxe/std/java/internal/HxObject.hx"
			int res1 = haxe.lang.FieldLookup.findHash(field, this.__hx_fields, this.__hx_length);
			//line 141 "/usr/share/haxe/std/java/internal/HxObject.hx"
			if (( res1 >= 0 )) 
			{
				//line 143 "/usr/share/haxe/std/java/internal/HxObject.hx"
				haxe.lang.FieldLookup.removeString(this.__hx_fields, this.__hx_length, res1);
				//line 144 "/usr/share/haxe/std/java/internal/HxObject.hx"
				haxe.lang.FieldLookup.removeDynamic(this.__hx_dynamics, this.__hx_length, res1);
				//line 145 "/usr/share/haxe/std/java/internal/HxObject.hx"
				this.__hx_length--;
			}
			
		}
		
		//line 149 "/usr/share/haxe/std/java/internal/HxObject.hx"
		this.__hx_fields_f = haxe.lang.FieldLookup.insertString(this.__hx_fields_f, this.__hx_length_f,  ~ (res) , field);
		//line 150 "/usr/share/haxe/std/java/internal/HxObject.hx"
		this.__hx_dynamics_f = haxe.lang.FieldLookup.insertFloat(this.__hx_dynamics_f, this.__hx_length_f,  ~ (res) , value);
		//line 151 "/usr/share/haxe/std/java/internal/HxObject.hx"
		this.__hx_length_f++;
		//line 152 "/usr/share/haxe/std/java/internal/HxObject.hx"
		return value;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 156 "/usr/share/haxe/std/java/internal/HxObject.hx"
		{
			//line 156 "/usr/share/haxe/std/java/internal/HxObject.hx"
			int _g = 0;
			//line 156 "/usr/share/haxe/std/java/internal/HxObject.hx"
			int _g1 = this.__hx_length;
			//line 156 "/usr/share/haxe/std/java/internal/HxObject.hx"
			while (( _g < _g1 ))
			{
				//line 156 "/usr/share/haxe/std/java/internal/HxObject.hx"
				int i = _g++;
				//line 157 "/usr/share/haxe/std/java/internal/HxObject.hx"
				baseArr.push(this.__hx_fields[i]);
			}
			
		}
		
		//line 159 "/usr/share/haxe/std/java/internal/HxObject.hx"
		{
			//line 159 "/usr/share/haxe/std/java/internal/HxObject.hx"
			int _g2 = 0;
			//line 159 "/usr/share/haxe/std/java/internal/HxObject.hx"
			int _g3 = this.__hx_length_f;
			//line 159 "/usr/share/haxe/std/java/internal/HxObject.hx"
			while (( _g2 < _g3 ))
			{
				//line 159 "/usr/share/haxe/std/java/internal/HxObject.hx"
				int i1 = _g2++;
				//line 160 "/usr/share/haxe/std/java/internal/HxObject.hx"
				baseArr.push(this.__hx_fields_f[i1]);
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 165 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (haxe.lang.Runtime.valEq(field, "toString")) 
		{
			//line 166 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return this.toString();
		}
		
		//line 168 "/usr/share/haxe/std/java/internal/HxObject.hx"
		haxe.lang.Function fn = ((haxe.lang.Function) (this.__hx_getField(field, false, false, false)) );
		//line 169 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (( fn == null )) 
		{
			//line 170 "/usr/share/haxe/std/java/internal/HxObject.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(( ( "Cannot invoke field " + field ) + ": It does not exist" ))) );
		}
		
		//line 173 "/usr/share/haxe/std/java/internal/HxObject.hx"
		return fn.__hx_invokeDynamic(dynargs);
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 177 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (( haxe.lang.DynamicObject.__hx_toString_depth >= 5 )) 
		{
			//line 178 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return "...";
		}
		
		//line 180 "/usr/share/haxe/std/java/internal/HxObject.hx"
		 ++ haxe.lang.DynamicObject.__hx_toString_depth;
		//line 181 "/usr/share/haxe/std/java/internal/HxObject.hx"
		try 
		{
			//line 182 "/usr/share/haxe/std/java/internal/HxObject.hx"
			java.lang.String s = this.__hx_toString();
			//line 183 "/usr/share/haxe/std/java/internal/HxObject.hx"
			 -- haxe.lang.DynamicObject.__hx_toString_depth;
			//line 184 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return s;
		}
		catch (java.lang.Throwable _g)
		{
			//line 185 "/usr/share/haxe/std/java/internal/HxObject.hx"
			java.lang.Object e = ((java.lang.Object) (haxe.Exception.caught(_g).unwrap()) );
			//line 186 "/usr/share/haxe/std/java/internal/HxObject.hx"
			 -- haxe.lang.DynamicObject.__hx_toString_depth;
			//line 187 "/usr/share/haxe/std/java/internal/HxObject.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(e)) );
		}
		
		
	}
	
	
	public java.lang.String __hx_toString()
	{
		//line 192 "/usr/share/haxe/std/java/internal/HxObject.hx"
		haxe.lang.Function ts = ((haxe.lang.Function) (this.__hx_getField("toString", false, false, false)) );
		//line 193 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (( ts != null )) 
		{
			//line 194 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return haxe.lang.Runtime.toString(ts.__hx_invoke0_o());
		}
		
		//line 195 "/usr/share/haxe/std/java/internal/HxObject.hx"
		haxe.root.StringBuf ret = new haxe.root.StringBuf();
		//line 196 "/usr/share/haxe/std/java/internal/HxObject.hx"
		ret.add(haxe.lang.Runtime.toString("{"));
		//line 196 "/usr/share/haxe/std/java/internal/HxObject.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
		//line 197 "/usr/share/haxe/std/java/internal/HxObject.hx"
		boolean first = true;
		//line 198 "/usr/share/haxe/std/java/internal/HxObject.hx"
		{
			//line 198 "/usr/share/haxe/std/java/internal/HxObject.hx"
			int _g = 0;
			//line 198 "/usr/share/haxe/std/java/internal/HxObject.hx"
			haxe.root.Array<java.lang.String> _g1 = haxe.root.Reflect.fields(this);
			//line 198 "/usr/share/haxe/std/java/internal/HxObject.hx"
			while (( _g < _g1.length ))
			{
				//line 198 "/usr/share/haxe/std/java/internal/HxObject.hx"
				java.lang.String f = _g1.__get(_g);
				//line 198 "/usr/share/haxe/std/java/internal/HxObject.hx"
				 ++ _g;
				//line 199 "/usr/share/haxe/std/java/internal/HxObject.hx"
				if (first) 
				{
					//line 200 "/usr/share/haxe/std/java/internal/HxObject.hx"
					first = false;
				}
				else
				{
					//line 202 "/usr/share/haxe/std/java/internal/HxObject.hx"
					ret.add(haxe.lang.Runtime.toString(","));
					//line 202 "/usr/share/haxe/std/java/internal/HxObject.hx"
					java.lang.Object __temp_expr2 = ((java.lang.Object) (null) );
				}
				
				//line 203 "/usr/share/haxe/std/java/internal/HxObject.hx"
				ret.add(haxe.lang.Runtime.toString(" "));
				//line 203 "/usr/share/haxe/std/java/internal/HxObject.hx"
				java.lang.Object __temp_expr3 = ((java.lang.Object) (null) );
				//line 204 "/usr/share/haxe/std/java/internal/HxObject.hx"
				ret.add(haxe.lang.Runtime.toString(f));
				//line 204 "/usr/share/haxe/std/java/internal/HxObject.hx"
				java.lang.Object __temp_expr4 = ((java.lang.Object) (null) );
				//line 205 "/usr/share/haxe/std/java/internal/HxObject.hx"
				ret.add(haxe.lang.Runtime.toString(" : "));
				//line 205 "/usr/share/haxe/std/java/internal/HxObject.hx"
				java.lang.Object __temp_expr5 = ((java.lang.Object) (null) );
				//line 206 "/usr/share/haxe/std/java/internal/HxObject.hx"
				ret.add(((java.lang.Object) (haxe.root.Reflect.field(this, f)) ));
				//line 206 "/usr/share/haxe/std/java/internal/HxObject.hx"
				java.lang.Object __temp_expr6 = ((java.lang.Object) (null) );
			}
			
		}
		
		//line 208 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if ( ! (first) ) 
		{
			//line 209 "/usr/share/haxe/std/java/internal/HxObject.hx"
			ret.add(haxe.lang.Runtime.toString(" "));
			//line 209 "/usr/share/haxe/std/java/internal/HxObject.hx"
			java.lang.Object __temp_expr7 = ((java.lang.Object) (null) );
		}
		
		//line 210 "/usr/share/haxe/std/java/internal/HxObject.hx"
		ret.add(haxe.lang.Runtime.toString("}"));
		//line 210 "/usr/share/haxe/std/java/internal/HxObject.hx"
		java.lang.Object __temp_expr8 = ((java.lang.Object) (null) );
		//line 211 "/usr/share/haxe/std/java/internal/HxObject.hx"
		return ret.toString();
	}
	
	
}


