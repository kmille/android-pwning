package b.i.b.a.a;

import b.d;
import b.i.b.a.x;
import b.r;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@b.j(a={1, 1, 13}, b={"\0004\n\002\b\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020$\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\020\001\n\000\n\002\020\b\n\002\b\007\032I\020\000\032\002H\001\"\b\b\000\020\001*\0020\0022\f\020\003\032\b\022\004\022\002H\0010\0042\022\020\005\032\016\022\004\022\0020\007\022\004\022\0020\0020\0062\016\b\002\020\b\032\b\022\004\022\0020\n0\tH\000¢\006\002\020\013\032$\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\0072\n\020\021\032\006\022\002\b\0030\004H\002\032\034\020\022\032\004\030\0010\002*\004\030\0010\0022\n\020\023\032\006\022\002\b\0030\004H\002¨\006\024²\006\024\020\025\032\0020\017\"\b\b\000\020\001*\0020\002X\002²\006\024\020\026\032\0020\007\"\b\b\000\020\001*\0020\002X\002"}, c={"createAnnotationInstance", "T", "", "annotationClass", "Ljava/lang/Class;", "values", "", "", "methods", "", "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "throwIllegalArgumentType", "", "index", "", "name", "expectedJvmType", "transformKotlinToJvm", "expectedType", "kotlin-reflect-api", "hashCode", "toString"})
public final class b
{
  public static final <T> T a(Class<T> paramClass, final Map<String, ? extends Object> paramMap, final List<Method> paramList)
  {
    b.f.b.j.b(paramClass, "annotationClass");
    b.f.b.j.b(paramMap, "values");
    b.f.b.j.b(paramList, "methods");
    final a locala = new a(paramClass, paramList, paramMap);
    final d locald1 = b.e.a((b.f.a.a)new b(paramMap));
    final b.i.k localk1 = a[0];
    final d locald2 = b.e.a((b.f.a.a)new d(paramClass, paramMap));
    final b.i.k localk2 = a[1];
    paramList = paramClass.getClassLoader();
    paramMap = (InvocationHandler)new c(paramClass, locald2, localk2, locald1, localk1, locala, paramMap);
    paramClass = Proxy.newProxyInstance(paramList, new Class[] { paramClass }, paramMap);
    if (paramClass != null) {
      return paramClass;
    }
    throw new r("null cannot be cast to non-null type T");
  }
  
  @b.j(a={1, 1, 13}, b={"\000\020\n\000\n\002\020\013\n\000\n\002\020\000\n\002\b\002\020\000\032\0020\001\"\b\b\000\020\002*\0020\0032\b\020\004\032\004\030\0010\003H\n¢\006\002\b\005"}, c={"equals", "", "T", "", "other", "invoke"})
  static final class a
    extends b.f.b.k
    implements b.f.a.b<Object, Boolean>
  {
    a(Class paramClass, List paramList, Map paramMap)
    {
      super();
    }
    
    public final boolean b(Object paramObject)
    {
      boolean bool = paramObject instanceof Annotation;
      Object localObject2 = null;
      if (!bool) {
        localObject1 = null;
      } else {
        localObject1 = paramObject;
      }
      Object localObject3 = (Annotation)localObject1;
      Object localObject1 = localObject2;
      if (localObject3 != null)
      {
        localObject3 = b.f.a.a((Annotation)localObject3);
        localObject1 = localObject2;
        if (localObject3 != null) {
          localObject1 = b.f.a.a((b.i.b)localObject3);
        }
      }
      if (b.f.b.j.a(localObject1, this.a))
      {
        localObject1 = (Iterable)paramList;
        if ((!(localObject1 instanceof Collection)) || (!((Collection)localObject1).isEmpty()))
        {
          localObject1 = ((Iterable)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (Method)((Iterator)localObject1).next();
            localObject3 = paramMap.get(((Method)localObject2).getName());
            localObject2 = ((Method)localObject2).invoke(paramObject, new Object[0]);
            if ((localObject3 instanceof boolean[]))
            {
              localObject3 = (boolean[])localObject3;
              if (localObject2 != null) {
                bool = Arrays.equals((boolean[])localObject3, (boolean[])localObject2);
              } else {
                throw new r("null cannot be cast to non-null type kotlin.BooleanArray");
              }
            }
            else if ((localObject3 instanceof char[]))
            {
              localObject3 = (char[])localObject3;
              if (localObject2 != null) {
                bool = Arrays.equals((char[])localObject3, (char[])localObject2);
              } else {
                throw new r("null cannot be cast to non-null type kotlin.CharArray");
              }
            }
            else if ((localObject3 instanceof byte[]))
            {
              localObject3 = (byte[])localObject3;
              if (localObject2 != null) {
                bool = Arrays.equals((byte[])localObject3, (byte[])localObject2);
              } else {
                throw new r("null cannot be cast to non-null type kotlin.ByteArray");
              }
            }
            else if ((localObject3 instanceof short[]))
            {
              localObject3 = (short[])localObject3;
              if (localObject2 != null) {
                bool = Arrays.equals((short[])localObject3, (short[])localObject2);
              } else {
                throw new r("null cannot be cast to non-null type kotlin.ShortArray");
              }
            }
            else if ((localObject3 instanceof int[]))
            {
              localObject3 = (int[])localObject3;
              if (localObject2 != null) {
                bool = Arrays.equals((int[])localObject3, (int[])localObject2);
              } else {
                throw new r("null cannot be cast to non-null type kotlin.IntArray");
              }
            }
            else if ((localObject3 instanceof float[]))
            {
              localObject3 = (float[])localObject3;
              if (localObject2 != null) {
                bool = Arrays.equals((float[])localObject3, (float[])localObject2);
              } else {
                throw new r("null cannot be cast to non-null type kotlin.FloatArray");
              }
            }
            else if ((localObject3 instanceof long[]))
            {
              localObject3 = (long[])localObject3;
              if (localObject2 != null) {
                bool = Arrays.equals((long[])localObject3, (long[])localObject2);
              } else {
                throw new r("null cannot be cast to non-null type kotlin.LongArray");
              }
            }
            else if ((localObject3 instanceof double[]))
            {
              localObject3 = (double[])localObject3;
              if (localObject2 != null) {
                bool = Arrays.equals((double[])localObject3, (double[])localObject2);
              } else {
                throw new r("null cannot be cast to non-null type kotlin.DoubleArray");
              }
            }
            else if ((localObject3 instanceof Object[]))
            {
              localObject3 = (Object[])localObject3;
              if (localObject2 != null) {
                bool = Arrays.equals((Object[])localObject3, (Object[])localObject2);
              } else {
                throw new r("null cannot be cast to non-null type kotlin.Array<*>");
              }
            }
            else
            {
              bool = b.f.b.j.a(localObject3, localObject2);
            }
            if (!bool)
            {
              i = 0;
              break label576;
            }
          }
        }
        int i = 1;
        label576:
        if (i != 0) {
          return true;
        }
      }
      return false;
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\016\n\000\n\002\020\b\n\000\n\002\020\000\n\000\020\000\032\0020\001\"\b\b\000\020\002*\0020\003H\n¢\006\002\b\004"}, c={"<anonymous>", "", "T", "", "invoke"})
  static final class b
    extends b.f.b.k
    implements b.f.a.a<Integer>
  {
    b(Map paramMap)
    {
      super();
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\030\n\000\n\002\020\000\n\002\b\004\n\002\030\002\n\000\n\002\020\021\n\002\b\002\020\000\032\004\030\0010\001\"\b\b\000\020\002*\0020\0012\016\020\003\032\n \004*\004\030\0010\0010\0012\016\020\005\032\n \004*\004\030\0010\0060\0062,\020\007\032(\022\f\022\n \004*\004\030\0010\0010\001 \004*\024\022\016\b\001\022\n \004*\004\030\0010\0010\001\030\0010\b0\bH\n¢\006\004\b\t\020\n"}, c={"<anonymous>", "", "T", "<anonymous parameter 0>", "kotlin.jvm.PlatformType", "method", "Ljava/lang/reflect/Method;", "args", "", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;"})
  static final class c
    implements InvocationHandler
  {
    c(Class paramClass, d paramd1, b.i.k paramk1, d paramd2, b.i.k paramk2, b.a parama, Map paramMap) {}
    
    public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      b.f.b.j.a(paramMethod, "method");
      paramObject = paramMethod.getName();
      if (paramObject != null)
      {
        int i = ((String)paramObject).hashCode();
        if (i != -1776922004)
        {
          if (i != 147696667)
          {
            if ((i == 1444986633) && (((String)paramObject).equals("annotationType"))) {
              return this.a;
            }
          }
          else if (((String)paramObject).equals("hashCode")) {
            return locald1.a();
          }
        }
        else if (((String)paramObject).equals("toString")) {
          return locald2.a();
        }
      }
      if ((b.f.b.j.a(paramObject, "equals")) && (paramArrayOfObject != null) && (paramArrayOfObject.length == 1)) {
        return Boolean.valueOf(locala.b(b.a.e.e(paramArrayOfObject)));
      }
      if (paramMap.containsKey(paramObject)) {
        return paramMap.get(paramObject);
      }
      StringBuilder localStringBuilder = new StringBuilder("Method is not supported: ");
      localStringBuilder.append(paramMethod);
      localStringBuilder.append(" (args: ");
      paramObject = paramArrayOfObject;
      if (paramArrayOfObject == null) {
        paramObject = new Object[0];
      }
      localStringBuilder.append(b.a.e.g((Object[])paramObject));
      localStringBuilder.append(')');
      throw ((Throwable)new x(localStringBuilder.toString()));
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\016\n\000\n\002\020\016\n\000\n\002\020\000\n\000\020\000\032\0020\001\"\b\b\000\020\002*\0020\003H\n¢\006\002\b\004"}, c={"<anonymous>", "", "T", "", "invoke"})
  static final class d
    extends b.f.b.k
    implements b.f.a.a<String>
  {
    d(Class paramClass, Map paramMap)
    {
      super();
    }
    
    @b.j(a={1, 1, 13}, b={"\000\024\n\000\n\002\020\016\n\000\n\002\020\000\n\000\n\002\020&\n\000\020\000\032\0020\001\"\b\b\000\020\002*\0020\0032\022\020\004\032\016\022\004\022\0020\001\022\004\022\0020\0030\005H\n¢\006\002\b\006"}, c={"<anonymous>", "", "T", "", "entry", "", "invoke"})
    static final class a
      extends b.f.b.k
      implements b.f.a.b<Map.Entry<? extends String, ? extends Object>, String>
    {
      public static final a a = new a();
      
      a()
      {
        super();
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */