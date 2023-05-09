package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Type extends haxe.lang.HxObject
{
	public Type(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Type()
	{
		//line 39 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		haxe.root.Type.__hx_ctor__Type(this);
	}
	
	
	protected static void __hx_ctor__Type(haxe.root.Type __hx_this)
	{
	}
	
	
	public static <T> java.lang.Class getClass(T o)
	{
		//line 41 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		if (( ( ( o == null ) || haxe.root.Std.isOfType(o, haxe.lang.DynamicObject.class) ) || haxe.root.Std.isOfType(o, java.lang.Class.class) )) 
		{
			//line 42 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			return null;
		}
		
		//line 44 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		return ((java.lang.Class) (((java.lang.Class) (((java.lang.Class) (o.getClass()) )) )) );
	}
	
	
	public static java.lang.Class getEnum(java.lang.Object o)
	{
		//line 48 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		if (( ( o instanceof java.lang.Enum ) || ( o instanceof haxe.lang.Enum ) )) 
		{
			//line 49 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			return o.getClass();
		}
		
		//line 51 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		return null;
	}
	
	
	public static haxe.root.Array<java.lang.String> getInstanceFields(java.lang.Class c)
	{
		
		if (c == java.lang.String.class)
		{
			return haxe.lang.StringRefl.fields;
		}

		Array<String> ret = new Array<String>();
		for (java.lang.reflect.Field f : c.getFields())
		{
			java.lang.String fname = f.getName();
			if (!java.lang.reflect.Modifier.isStatic(f.getModifiers()) && !fname.startsWith("__hx_"))
				ret.push(fname);
		}

		for (java.lang.reflect.Method m : c.getMethods())
		{
			if (m.getDeclaringClass() == java.lang.Object.class)
				continue;
			java.lang.String mname = m.getName();
			if (!java.lang.reflect.Modifier.isStatic(m.getModifiers()) && !mname.startsWith("__hx_"))
				ret.push(mname);
		}

		return ret;
	
	}
	
	
	public static haxe.root.Array<java.lang.String> getClassFields(java.lang.Class c)
	{
		
		Array<String> ret = new Array<String>();
		if (c == java.lang.String.class)
		{
			ret.push("fromCharCode");
			return ret;
		}

		for (java.lang.reflect.Field f : c.getDeclaredFields())
		{
			java.lang.String fname = f.getName();
			if (java.lang.reflect.Modifier.isStatic(f.getModifiers()) && !fname.startsWith("__hx_"))
			ret.push(fname);
		}

		for (java.lang.reflect.Method m : c.getDeclaredMethods())
		{
			if (m.getDeclaringClass() == java.lang.Object.class)
				continue;
			java.lang.String mname = m.getName();
			if (java.lang.reflect.Modifier.isStatic(m.getModifiers()) && !mname.startsWith("__hx_"))
				ret.push(mname);
		}

		return ret;
	
	}
	
	
	public static haxe.root.ValueType typeof(java.lang.Object v)
	{
		
		if (v == null) return ValueType.TNull;

		if (v instanceof haxe.lang.IHxObject) {
			haxe.lang.IHxObject vobj = (haxe.lang.IHxObject) v;
			java.lang.Class cl = vobj.getClass();
			if (v instanceof haxe.lang.DynamicObject)
				return ValueType.TObject;
			else
				return ValueType.TClass(cl);
		} else if (v instanceof java.lang.Number) {
			java.lang.Number n = (java.lang.Number) v;
			if (n.intValue() == n.doubleValue())
				return ValueType.TInt;
			else
				return ValueType.TFloat;
		} else if (v instanceof haxe.lang.Function) {
			return ValueType.TFunction;
		} else if (v instanceof java.lang.Enum || v instanceof haxe.lang.Enum) {
			return ValueType.TEnum(v.getClass());
		} else if (v instanceof java.lang.Boolean) {
			return ValueType.TBool;
		} else if (v instanceof java.lang.Class) {
			return ValueType.TObject;
		} else {
			return ValueType.TClass(v.getClass());
		}
	
	}
	
	
	public static <T> boolean enumEq(T a, T b)
	{
		
			if (a instanceof haxe.lang.Enum)
				return a.equals(b);
			else
				return haxe.lang.Runtime.eq(a, b);
	
	}
	
	
	public static int enumIndex(java.lang.Object e)
	{
		
		if (e instanceof java.lang.Enum)
			return ((java.lang.Enum) e).ordinal();
		else
			return ((haxe.lang.Enum) e).index;
	
	}
	
	
}


