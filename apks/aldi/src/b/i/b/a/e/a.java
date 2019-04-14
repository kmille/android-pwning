package b.i.b.a.e;

import b.r;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@b.j(a={1, 1, 13}, b={"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\002\bÂ\002\030\0002\0020\001:\001\017B\007\b\002¢\006\002\020\002J\016\020\t\032\0020\0042\006\020\n\032\0020\013J\026\020\f\032\n\022\004\022\0020\016\030\0010\r2\006\020\n\032\0020\013R\034\020\003\032\004\030\0010\004X\016¢\006\016\n\000\032\004\b\005\020\006\"\004\b\007\020\b¨\006\020"}, c={"Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader;", "", "()V", "cache", "Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "getCache", "()Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "setCache", "(Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;)V", "buildCache", "member", "Ljava/lang/reflect/Member;", "loadParameterNames", "", "", "Cache", "descriptors.runtime"})
final class a
{
  public static final a a = new a();
  private static a b;
  
  public static List<String> a(Member paramMember)
  {
    b.f.b.j.b(paramMember, "member");
    Object localObject2 = b;
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = b(paramMember);
      b = (a)localObject1;
    }
    localObject2 = ((a)localObject1).a;
    if (localObject2 == null) {
      return null;
    }
    localObject1 = ((a)localObject1).b;
    if (localObject1 == null) {
      return null;
    }
    paramMember = ((Method)localObject2).invoke(paramMember, new Object[0]);
    if (paramMember != null)
    {
      paramMember = (Object[])paramMember;
      localObject2 = (Collection)new ArrayList(paramMember.length);
      int j = paramMember.length;
      int i = 0;
      while (i < j)
      {
        Object localObject3 = ((Method)localObject1).invoke(paramMember[i], new Object[0]);
        if (localObject3 != null)
        {
          ((Collection)localObject2).add((String)localObject3);
          i += 1;
        }
        else
        {
          throw new r("null cannot be cast to non-null type kotlin.String");
        }
      }
      return (List)localObject2;
    }
    throw new r("null cannot be cast to non-null type kotlin.Array<*>");
  }
  
  private static a b(Member paramMember)
  {
    b.f.b.j.b(paramMember, "member");
    paramMember = paramMember.getClass();
    try
    {
      Method localMethod = paramMember.getMethod("getParameters", new Class[0]);
      return new a(localMethod, b.a(paramMember).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
    }
    catch (NoSuchMethodException paramMember)
    {
      for (;;) {}
    }
    return new a(null, null);
  }
  
  @b.j(a={1, 1, 13}, b={"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\006\030\0002\0020\001B\031\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003¢\006\002\020\005R\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\006\020\007R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\b\020\007¨\006\t"}, c={"Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "", "getParameters", "Ljava/lang/reflect/Method;", "getName", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getGetName", "()Ljava/lang/reflect/Method;", "getGetParameters", "descriptors.runtime"})
  public static final class a
  {
    final Method a;
    final Method b;
    
    public a(Method paramMethod1, Method paramMethod2)
    {
      this.a = paramMethod1;
      this.b = paramMethod2;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */