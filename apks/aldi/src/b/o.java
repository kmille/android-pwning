package b;

import b.f.a.a;
import java.io.Serializable;

@j(a={1, 1, 13}, b={"\0000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\000\n\002\b\006\n\002\020\013\n\000\n\002\020\016\n\002\b\002\b\002\030\000*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\0022\0060\003j\002`\004B\037\022\f\020\005\032\b\022\004\022\0028\0000\006\022\n\b\002\020\007\032\004\030\0010\b¢\006\002\020\tJ\b\020\016\032\0020\017H\026J\b\020\020\032\0020\021H\026J\b\020\022\032\0020\bH\002R\020\020\n\032\004\030\0010\bX\016¢\006\002\n\000R\026\020\005\032\n\022\004\022\0028\000\030\0010\006X\016¢\006\002\n\000R\016\020\007\032\0020\bX\004¢\006\002\n\000R\024\020\013\032\0028\0008VX\004¢\006\006\032\004\b\f\020\r¨\006\023"}, c={"Lkotlin/SynchronizedLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "lock", "", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "_value", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "kotlin-stdlib"})
final class o<T>
  implements d<T>, Serializable
{
  private a<? extends T> a;
  private volatile Object b;
  private final Object c;
  
  private o(a<? extends T> parama)
  {
    this.a = parama;
    this.b = s.a;
    this.c = this;
  }
  
  public final T a()
  {
    Object localObject1 = this.b;
    if (localObject1 != s.a) {
      return (T)localObject1;
    }
    synchronized (this.c)
    {
      localObject1 = this.b;
      if (localObject1 == s.a)
      {
        localObject1 = this.a;
        if (localObject1 == null) {
          b.f.b.j.a();
        }
        localObject1 = ((a)localObject1).b_();
        this.b = localObject1;
        this.a = null;
      }
      return (T)localObject1;
    }
  }
  
  public final String toString()
  {
    int i;
    if (this.b != s.a) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return String.valueOf(a());
    }
    return "Lazy value not initialized yet.";
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */