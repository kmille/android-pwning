package b.i.b.a.a;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

@b.j(a={1, 1, 13}, b={"\000.\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\002\b\004\n\002\020 \n\002\030\002\n\002\b\007\n\002\020\021\n\002\b\002\n\002\020\002\n\002\b\002\b`\030\000*\f\b\000\020\001 \001*\004\030\0010\0022\0020\003J\033\020\017\032\004\030\0010\0032\n\020\020\032\006\022\002\b\0030\021H&¢\006\002\020\022J\031\020\023\032\0020\0242\n\020\020\032\006\022\002\b\0030\021H\026¢\006\002\020\025R\022\020\004\032\0028\000X¦\004¢\006\006\032\004\b\005\020\006R\030\020\007\032\b\022\004\022\0020\t0\bX¦\004¢\006\006\032\004\b\n\020\013R\022\020\f\032\0020\tX¦\004¢\006\006\032\004\b\r\020\016¨\006\026"}, c={"Lkotlin/reflect/jvm/internal/calls/Caller;", "M", "Ljava/lang/reflect/Member;", "", "member", "getMember", "()Ljava/lang/reflect/Member;", "parameterTypes", "", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "checkArguments", "", "([Ljava/lang/Object;)V", "kotlin-reflect-api"})
public abstract interface d<M extends Member>
{
  public abstract Object a(Object[] paramArrayOfObject);
  
  public abstract M a();
  
  public abstract Type b();
  
  public abstract List<Type> c();
  
  @b.j(a={1, 1, 13})
  public static final class a
  {
    public static <M extends Member> void a(d<? extends M> paramd, Object[] paramArrayOfObject)
    {
      b.f.b.j.b(paramArrayOfObject, "args");
      if (f.a(paramd) == paramArrayOfObject.length) {
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder("Callable expects ");
      localStringBuilder.append(f.a(paramd));
      localStringBuilder.append(" arguments, but ");
      localStringBuilder.append(paramArrayOfObject.length);
      localStringBuilder.append(" were provided.");
      throw ((Throwable)new IllegalArgumentException(localStringBuilder.toString()));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */