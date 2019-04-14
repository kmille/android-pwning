package b.i.b.a;

import b.a.e;
import b.b.a;
import b.f.a.b;
import b.f.b.k;
import b.i.b.a.c.e.b.a.f.b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@b.j(a={1, 1, 13}, b={"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b0\030\0002\0020\001:\005\005\006\007\b\tB\007\b\002¢\006\002\020\002J\b\020\003\032\0020\004H&\001\005\n\013\f\r\016¨\006\017"}, c={"Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "()V", "asString", "", "FakeJavaAnnotationConstructor", "JavaConstructor", "JavaMethod", "KotlinConstructor", "KotlinFunction", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "kotlin-reflect-api"})
public abstract class c
{
  public abstract String a();
  
  @b.j(a={1, 1, 13}, b={"\000$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020 \n\002\030\002\n\002\b\004\n\002\020\016\n\000\030\0002\0020\001B\021\022\n\020\002\032\006\022\002\b\0030\003¢\006\002\020\004J\b\020\r\032\0020\016H\026R\025\020\002\032\006\022\002\b\0030\003¢\006\b\n\000\032\004\b\005\020\006R\037\020\007\032\020\022\f\022\n \n*\004\030\0010\t0\t0\b¢\006\b\n\000\032\004\b\013\020\f¨\006\017"}, c={"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "getJClass", "()Ljava/lang/Class;", "methods", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "getMethods", "()Ljava/util/List;", "asString", "", "kotlin-reflect-api"})
  public static final class a
    extends c
  {
    final List<Method> a;
    private final Class<?> b;
    
    public a(Class<?> paramClass)
    {
      super();
      this.b = paramClass;
      paramClass = this.b.getDeclaredMethods();
      b.f.b.j.a(paramClass, "jClass.declaredMethods");
      Comparator localComparator = (Comparator)new a();
      b.f.b.j.b(paramClass, "receiver$0");
      b.f.b.j.b(localComparator, "comparator");
      b.f.b.j.b(paramClass, "receiver$0");
      b.f.b.j.b(localComparator, "comparator");
      if (paramClass.length == 0) {
        i = 1;
      }
      if (i == 0)
      {
        Object[] arrayOfObject = Arrays.copyOf(paramClass, paramClass.length);
        b.f.b.j.a(arrayOfObject, "java.util.Arrays.copyOf(this, size)");
        b.f.b.j.b(arrayOfObject, "receiver$0");
        b.f.b.j.b(localComparator, "comparator");
        paramClass = arrayOfObject;
        if (arrayOfObject.length > 1)
        {
          Arrays.sort(arrayOfObject, localComparator);
          paramClass = arrayOfObject;
        }
      }
      this.a = e.a(paramClass);
    }
    
    public final String a()
    {
      return b.a.j.a((Iterable)this.a, (CharSequence)"", (CharSequence)"<init>(", (CharSequence)")V", 0, null, (b)b.a, 24);
    }
    
    @b.j(a={1, 1, 13}, b={"\000\036\n\000\n\002\020\b\n\002\b\006\n\002\b\006\n\002\b\006\n\002\b\006\n\002\b\006\n\002\b\007\020\000\032\0020\001\"\004\b\000\020\0022\016\020\003\032\n \004*\004\030\001H\002H\0022\016\020\005\032\n \004*\004\030\001H\002H\002H\n¢\006\004\b\006\020\007¨\006\b"}, c={"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
    public static final class a<T>
      implements Comparator<T>
    {
      public final int compare(T paramT1, T paramT2)
      {
        paramT1 = (Method)paramT1;
        b.f.b.j.a(paramT1, "it");
        paramT1 = (Comparable)paramT1.getName();
        paramT2 = (Method)paramT2;
        b.f.b.j.a(paramT2, "it");
        return a.a(paramT1, (Comparable)paramT2.getName());
      }
    }
    
    @b.j(a={1, 1, 13}, b={"\000\020\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\016\020\002\032\n \004*\004\030\0010\0030\003H\n¢\006\002\b\005"}, c={"<anonymous>", "", "it", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "invoke"})
    static final class b
      extends k
      implements b<Method, String>
    {
      public static final b a = new b();
      
      b()
      {
        super();
      }
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\000\030\0002\0020\001B\021\022\n\020\002\032\006\022\002\b\0030\003¢\006\002\020\004J\b\020\007\032\0020\bH\026R\025\020\002\032\006\022\002\b\0030\003¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, c={"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "constructor", "Ljava/lang/reflect/Constructor;", "(Ljava/lang/reflect/Constructor;)V", "getConstructor", "()Ljava/lang/reflect/Constructor;", "asString", "", "kotlin-reflect-api"})
  public static final class b
    extends c
  {
    final Constructor<?> a;
    
    public b(Constructor<?> paramConstructor)
    {
      super();
      this.a = paramConstructor;
    }
    
    public final String a()
    {
      Class[] arrayOfClass = this.a.getParameterTypes();
      b.f.b.j.a(arrayOfClass, "constructor.parameterTypes");
      return e.a(arrayOfClass, (CharSequence)"", (CharSequence)"<init>(", (CharSequence)")V", (b)a.a);
    }
    
    @b.j(a={1, 1, 13}, b={"\000\020\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\026\020\002\032\022\022\002\b\003 \004*\b\022\002\b\003\030\0010\0030\003H\n¢\006\002\b\005"}, c={"<anonymous>", "", "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"})
    static final class a
      extends k
      implements b<Class<?>, String>
    {
      public static final a a = new a();
      
      a()
      {
        super();
      }
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\b\020\007\032\0020\bH\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, c={"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "getMethod", "()Ljava/lang/reflect/Method;", "asString", "", "kotlin-reflect-api"})
  public static final class c
    extends c
  {
    final Method a;
    
    public c(Method paramMethod)
    {
      super();
      this.a = paramMethod;
    }
    
    public final String a()
    {
      return ae.a(this.a);
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\b\020\f\032\0020\006H\026R\016\020\005\032\0020\006X\004¢\006\002\n\000R\021\020\007\032\0020\0068F¢\006\006\032\004\b\b\020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013¨\006\r"}, c={"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "_signature", "", "constructorDesc", "getConstructorDesc", "()Ljava/lang/String;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "asString", "kotlin-reflect-api"})
  public static final class d
    extends c
  {
    final f.b a;
    private final String b;
    
    public d(f.b paramb)
    {
      super();
      this.a = paramb;
      this.b = this.a.c();
    }
    
    public final String a()
    {
      return this.b;
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\t\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\b\020\016\032\0020\006H\026R\016\020\005\032\0020\006X\004¢\006\002\n\000R\021\020\007\032\0020\0068F¢\006\006\032\004\b\b\020\tR\021\020\n\032\0020\0068F¢\006\006\032\004\b\013\020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\r¨\006\017"}, c={"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "_signature", "", "methodDesc", "getMethodDesc", "()Ljava/lang/String;", "methodName", "getMethodName", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "asString", "kotlin-reflect-api"})
  public static final class e
    extends c
  {
    final String a;
    final f.b b;
    
    public e(f.b paramb)
    {
      super();
      this.b = paramb;
      this.a = this.b.c();
    }
    
    public final String a()
    {
      return this.a;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */