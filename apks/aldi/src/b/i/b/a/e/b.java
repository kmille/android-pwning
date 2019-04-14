package b.i.b.a.e;

import b.a.ac;
import b.f.a.d;
import b.f.a.g;
import b.f.a.m;
import b.f.a.n;
import b.f.a.o;
import b.f.a.p;
import b.f.a.s;
import b.f.a.t;
import b.f.a.u;
import b.f.a.w;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@b.j(a={1, 1, 13}, b={"\000J\n\000\n\002\020$\n\002\030\002\n\002\030\002\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\006\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\006\n\002\020\013\n\000\032\022\020#\032\006\022\002\b\0030\002*\006\022\002\b\0030\002\032\016\020$\032\0020%*\006\022\002\b\0030\002\"&\020\000\032\032\022\020\022\016\022\n\b\001\022\006\022\002\b\0030\0030\002\022\004\022\0020\0040\001X\004¢\006\002\n\000\"\034\020\005\032\020\022\f\022\n\022\006\b\001\022\0020\b0\0070\006X\004¢\006\002\n\000\",\020\t\032 \022\016\022\f\022\006\b\001\022\0020\b\030\0010\002\022\f\022\n\022\006\b\001\022\0020\b0\0020\001X\004¢\006\002\n\000\",\020\n\032 \022\f\022\n\022\006\b\001\022\0020\b0\002\022\016\022\f\022\006\b\001\022\0020\b\030\0010\0020\001X\004¢\006\002\n\000\"\031\020\013\032\0020\f*\006\022\002\b\0030\0028F¢\006\006\032\004\b\r\020\016\"\031\020\017\032\0020\020*\006\022\002\b\0030\0028F¢\006\006\032\004\b\021\020\022\"\033\020\023\032\004\030\0010\004*\006\022\002\b\0030\0028F¢\006\006\032\004\b\024\020\025\"\033\020\026\032\b\022\004\022\0020\0270\006*\0020\0278F¢\006\006\032\004\b\030\020\031\"\037\020\032\032\b\022\002\b\003\030\0010\002*\006\022\002\b\0030\0028F¢\006\006\032\004\b\033\020\034\"\031\020\035\032\0020\036*\006\022\002\b\0030\0028F¢\006\006\032\004\b\037\020 \"\037\020!\032\b\022\002\b\003\030\0010\002*\006\022\002\b\0030\0028F¢\006\006\032\004\b\"\020\034¨\006&"}, c={"FUNCTION_CLASSES", "", "Ljava/lang/Class;", "Lkotlin/Function;", "", "PRIMITIVE_CLASSES", "", "Lkotlin/reflect/KClass;", "", "PRIMITIVE_TO_WRAPPER", "WRAPPER_TO_PRIMITIVE", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/name/ClassId;", "desc", "", "getDesc", "(Ljava/lang/Class;)Ljava/lang/String;", "functionClassArity", "getFunctionClassArity", "(Ljava/lang/Class;)Ljava/lang/Integer;", "parameterizedTypeArguments", "Ljava/lang/reflect/Type;", "getParameterizedTypeArguments", "(Ljava/lang/reflect/Type;)Ljava/util/List;", "primitiveByWrapper", "getPrimitiveByWrapper", "(Ljava/lang/Class;)Ljava/lang/Class;", "safeClassLoader", "Ljava/lang/ClassLoader;", "getSafeClassLoader", "(Ljava/lang/Class;)Ljava/lang/ClassLoader;", "wrapperByPrimitive", "getWrapperByPrimitive", "createArrayType", "isEnumClassOrSpecializedEnumEntryClass", "", "descriptors.runtime"})
public final class b
{
  private static final List<b.i.b<? extends Object>> a;
  private static final Map<Class<? extends Object>, Class<? extends Object>> b;
  private static final Map<Class<? extends Object>, Class<? extends Object>> c;
  private static final Map<Class<? extends b.a<?>>, Integer> d;
  
  static
  {
    Object localObject1 = b.f.b.v.a(Boolean.TYPE);
    int i = 0;
    localObject1 = b.a.j.b(new b.i.b[] { localObject1, b.f.b.v.a(Byte.TYPE), b.f.b.v.a(Character.TYPE), b.f.b.v.a(Double.TYPE), b.f.b.v.a(Float.TYPE), b.f.b.v.a(Integer.TYPE), b.f.b.v.a(Long.TYPE), b.f.b.v.a(Short.TYPE) });
    a = (List)localObject1;
    Object localObject2 = (Iterable)localObject1;
    localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    Object localObject3;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (b.i.b)((Iterator)localObject2).next();
      ((Collection)localObject1).add(b.q.a(b.f.a.c((b.i.b)localObject3), b.f.a.b((b.i.b)localObject3)));
    }
    b = ac.a((Iterable)localObject1);
    localObject2 = (Iterable)a;
    localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (b.i.b)((Iterator)localObject2).next();
      ((Collection)localObject1).add(b.q.a(b.f.a.b((b.i.b)localObject3), b.f.a.c((b.i.b)localObject3)));
    }
    c = ac.a((Iterable)localObject1);
    localObject2 = (Iterable)b.a.j.b(new Class[] { b.f.a.a.class, b.f.a.b.class, m.class, b.f.a.q.class, b.f.a.r.class, s.class, t.class, u.class, b.f.a.v.class, w.class, b.f.a.c.class, d.class, b.f.a.e.class, b.f.a.f.class, g.class, b.f.a.h.class, b.f.a.i.class, b.f.a.j.class, b.f.a.k.class, b.f.a.l.class, n.class, o.class, p.class });
    localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = ((Iterator)localObject2).next();
      if (i < 0) {
        b.a.j.a();
      }
      ((Collection)localObject1).add(b.q.a((Class)localObject3, Integer.valueOf(i)));
      i += 1;
    }
    d = ac.a((Iterable)localObject1);
  }
  
  public static final ClassLoader a(Class<?> paramClass)
  {
    b.f.b.j.b(paramClass, "receiver$0");
    ClassLoader localClassLoader = paramClass.getClassLoader();
    paramClass = localClassLoader;
    if (localClassLoader == null)
    {
      paramClass = ClassLoader.getSystemClassLoader();
      b.f.b.j.a(paramClass, "ClassLoader.getSystemClassLoader()");
    }
    return paramClass;
  }
  
  public static final List<Type> a(Type paramType)
  {
    b.f.b.j.b(paramType, "receiver$0");
    if (!(paramType instanceof ParameterizedType)) {
      return (List)b.a.v.a;
    }
    ParameterizedType localParameterizedType = (ParameterizedType)paramType;
    if (localParameterizedType.getOwnerType() == null)
    {
      paramType = localParameterizedType.getActualTypeArguments();
      b.f.b.j.a(paramType, "actualTypeArguments");
      return b.a.e.g(paramType);
    }
    return b.j.i.c(b.j.i.c(b.j.i.a(paramType, (b.f.a.b)a.a), (b.f.a.b)b.a));
  }
  
  public static final boolean b(Class<?> paramClass)
  {
    b.f.b.j.b(paramClass, "receiver$0");
    return Enum.class.isAssignableFrom(paramClass);
  }
  
  public static final Class<?> c(Class<?> paramClass)
  {
    b.f.b.j.b(paramClass, "receiver$0");
    return (Class)b.get(paramClass);
  }
  
  public static final Class<?> d(Class<?> paramClass)
  {
    b.f.b.j.b(paramClass, "receiver$0");
    return (Class)c.get(paramClass);
  }
  
  public static final b.i.b.a.c.f.a e(Class<?> paramClass)
  {
    b.f.b.j.b(paramClass, "receiver$0");
    if (!paramClass.isPrimitive())
    {
      if (!paramClass.isArray())
      {
        if ((paramClass.getEnclosingMethod() == null) && (paramClass.getEnclosingConstructor() == null))
        {
          Object localObject = paramClass.getSimpleName();
          b.f.b.j.a(localObject, "simpleName");
          int i;
          if (((CharSequence)localObject).length() == 0) {
            i = 1;
          } else {
            i = 0;
          }
          if (i == 0)
          {
            localObject = paramClass.getDeclaringClass();
            if (localObject != null)
            {
              localObject = e((Class)localObject);
              if (localObject != null) {
                return ((b.i.b.a.c.f.a)localObject).a(b.i.b.a.c.f.f.a(paramClass.getSimpleName()));
              }
            }
            paramClass = b.i.b.a.c.f.a.a(new b.i.b.a.c.f.b(paramClass.getName()));
            b.f.b.j.a(paramClass, "ClassId.topLevel(FqName(name))");
            return paramClass;
          }
        }
        paramClass = new b.i.b.a.c.f.b(paramClass.getName());
        return new b.i.b.a.c.f.a(paramClass.b(), b.i.b.a.c.f.b.c(paramClass.b.d()), true);
      }
      throw ((Throwable)new IllegalArgumentException("Can't compute ClassId for array type: ".concat(String.valueOf(paramClass))));
    }
    throw ((Throwable)new IllegalArgumentException("Can't compute ClassId for primitive type: ".concat(String.valueOf(paramClass))));
  }
  
  public static final String f(Class<?> paramClass)
  {
    b.f.b.j.b(paramClass, "receiver$0");
    if (b.f.b.j.a(paramClass, Void.TYPE)) {
      return "V";
    }
    paramClass = g(paramClass).getName();
    b.f.b.j.a(paramClass, "createArrayType().name");
    if (paramClass != null)
    {
      paramClass = paramClass.substring(1);
      b.f.b.j.a(paramClass, "(this as java.lang.String).substring(startIndex)");
      return b.k.l.a(paramClass, '.', '/');
    }
    throw new b.r("null cannot be cast to non-null type java.lang.String");
  }
  
  public static final Class<?> g(Class<?> paramClass)
  {
    b.f.b.j.b(paramClass, "receiver$0");
    return Array.newInstance(paramClass, 0).getClass();
  }
  
  @b.j(a={1, 1, 13}, b={"\000\n\n\000\n\002\030\002\n\002\b\002\020\000\032\004\030\0010\0012\006\020\002\032\0020\001H\n¢\006\002\b\003"}, c={"<anonymous>", "Ljava/lang/reflect/ParameterizedType;", "it", "invoke"})
  static final class a
    extends b.f.b.k
    implements b.f.a.b<ParameterizedType, ParameterizedType>
  {
    public static final a a = new a();
    
    a()
    {
      super();
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\024\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\020\000\032\020\022\f\022\n \003*\004\030\0010\0020\0020\0012\006\020\004\032\0020\005H\n¢\006\002\b\006"}, c={"<anonymous>", "Lkotlin/sequences/Sequence;", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "it", "Ljava/lang/reflect/ParameterizedType;", "invoke"})
  static final class b
    extends b.f.b.k
    implements b.f.a.b<ParameterizedType, b.j.h<? extends Type>>
  {
    public static final b a = new b();
    
    b()
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */