package b.i.b.a;

import b.j;
import java.lang.ref.WeakReference;

@j(a={1, 1, 13}, b={"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001H\002J\b\020\024\032\0020\006H\026J\b\020\025\032\0020\026H\026R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\007\020\bR\027\020\t\032\b\022\004\022\0020\0030\n¢\006\b\n\000\032\004\b\013\020\fR\034\020\r\032\004\030\0010\003X\016¢\006\016\n\000\032\004\b\016\020\017\"\004\b\020\020\004¨\006\027"}, c={"Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;", "", "classLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "identityHashCode", "", "getIdentityHashCode", "()I", "ref", "Ljava/lang/ref/WeakReference;", "getRef", "()Ljava/lang/ref/WeakReference;", "temporaryStrongRef", "getTemporaryStrongRef", "()Ljava/lang/ClassLoader;", "setTemporaryStrongRef", "equals", "", "other", "hashCode", "toString", "", "kotlin-reflect-api"})
final class ah
{
  ClassLoader a;
  private final WeakReference<ClassLoader> b;
  private final int c;
  
  public ah(ClassLoader paramClassLoader)
  {
    this.b = new WeakReference(paramClassLoader);
    this.c = System.identityHashCode(paramClassLoader);
    this.a = paramClassLoader;
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof ah)) && ((ClassLoader)this.b.get() == (ClassLoader)((ah)paramObject).b.get());
  }
  
  public final int hashCode()
  {
    return this.c;
  }
  
  public final String toString()
  {
    Object localObject = (ClassLoader)this.b.get();
    if (localObject != null)
    {
      String str = ((ClassLoader)localObject).toString();
      localObject = str;
      if (str != null) {}
    }
    else
    {
      localObject = "<null>";
    }
    return (String)localObject;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */