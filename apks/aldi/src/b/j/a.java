package b.j;

import b.j;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

@j(a={1, 1, 13}, b={"\000\034\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020(\n\000\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\023\022\f\020\003\032\b\022\004\022\0028\0000\002¢\006\002\020\004J\017\020\b\032\b\022\004\022\0028\0000\tH\002R(\020\005\032\034\022\030\022\026\022\004\022\0028\000 \007*\n\022\004\022\0028\000\030\0010\0020\0020\006X\004¢\006\002\n\000¨\006\n"}, c={"Lkotlin/sequences/ConstrainedOnceSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "(Lkotlin/sequences/Sequence;)V", "sequenceRef", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "iterator", "", "kotlin-stdlib"})
public final class a<T>
  implements h<T>
{
  private final AtomicReference<h<T>> a;
  
  public a(h<? extends T> paramh)
  {
    this.a = new AtomicReference(paramh);
  }
  
  public final Iterator<T> a()
  {
    h localh = (h)this.a.getAndSet(null);
    if (localh != null) {
      return localh.a();
    }
    throw ((Throwable)new IllegalStateException("This sequence can be consumed only once."));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/j/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */