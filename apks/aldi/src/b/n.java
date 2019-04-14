package b;

import b.f.a.a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

@j(a={1, 1, 13}, b={"\0002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\005\n\002\020\013\n\000\n\002\020\016\n\002\b\003\b\002\030\000 \023*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\0022\0060\003j\002`\004:\001\023B\023\022\f\020\005\032\b\022\004\022\0028\0000\006¢\006\002\020\007J\b\020\016\032\0020\017H\026J\b\020\020\032\0020\021H\026J\b\020\022\032\0020\tH\002R\020\020\b\032\004\030\0010\tX\016¢\006\002\n\000R\016\020\n\032\0020\tX\004¢\006\002\n\000R\026\020\005\032\n\022\004\022\0028\000\030\0010\006X\016¢\006\002\n\000R\024\020\013\032\0028\0008VX\004¢\006\006\032\004\b\f\020\r¨\006\024"}, c={"Lkotlin/SafePublicationLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "_value", "", "final", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "Companion", "kotlin-stdlib"})
final class n<T>
  implements d<T>, Serializable
{
  public static final a a = new a((byte)0);
  private static final AtomicReferenceFieldUpdater<n<?>, Object> e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "c");
  private volatile a<? extends T> b;
  private volatile Object c;
  private final Object d;
  
  public n(a<? extends T> parama)
  {
    this.b = parama;
    this.c = s.a;
    this.d = s.a;
  }
  
  public final T a()
  {
    Object localObject = this.c;
    if (localObject != s.a) {
      return (T)localObject;
    }
    localObject = this.b;
    if (localObject != null)
    {
      localObject = ((a)localObject).b_();
      if (e.compareAndSet(this, s.a, localObject))
      {
        this.b = null;
        return (T)localObject;
      }
    }
    return (T)this.c;
  }
  
  public final String toString()
  {
    int i;
    if (this.c != s.a) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return String.valueOf(a());
    }
    return "Lazy value not initialized yet.";
  }
  
  @j(a={1, 1, 13}, b={"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R^\020\003\032R\022\024\022\022\022\002\b\003 \006*\b\022\002\b\003\030\0010\0050\005\022\f\022\n \006*\004\030\0010\0010\001 \006*(\022\024\022\022\022\002\b\003 \006*\b\022\002\b\003\030\0010\0050\005\022\f\022\n \006*\004\030\0010\0010\001\030\0010\0040\004X\004¢\006\002\n\000¨\006\007"}, c={"Lkotlin/SafePublicationLazyImpl$Companion;", "", "()V", "valueUpdater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/SafePublicationLazyImpl;", "kotlin.jvm.PlatformType", "kotlin-stdlib"})
  public static final class a {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */