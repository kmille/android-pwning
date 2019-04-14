package b.i.b.a;

import b.a.e;
import b.f.b.k;
import java.lang.reflect.Method;

@b.j(a={1, 1, 13}, b={"\000\016\n\000\n\002\020\016\n\002\030\002\n\002\b\003\"\030\020\000\032\0020\001*\0020\0028BX\004¢\006\006\032\004\b\003\020\004¨\006\005"}, c={"signature", "", "Ljava/lang/reflect/Method;", "getSignature", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "kotlin-reflect-api"})
public final class ae
{
  static final String a(Method paramMethod)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramMethod.getName());
    Class[] arrayOfClass = paramMethod.getParameterTypes();
    b.f.b.j.a(arrayOfClass, "parameterTypes");
    localStringBuilder.append(e.a(arrayOfClass, (CharSequence)"", (CharSequence)"(", (CharSequence)")", (b.f.a.b)a.a));
    paramMethod = paramMethod.getReturnType();
    b.f.b.j.a(paramMethod, "returnType");
    localStringBuilder.append(b.i.b.a.e.b.f(paramMethod));
    return localStringBuilder.toString();
  }
  
  @b.j(a={1, 1, 13}, b={"\000\020\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\026\020\002\032\022\022\002\b\003 \004*\b\022\002\b\003\030\0010\0030\003H\n¢\006\002\b\005"}, c={"<anonymous>", "", "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"})
  static final class a
    extends k
    implements b.f.a.b<Class<?>, String>
  {
    public static final a a = new a();
    
    a()
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */