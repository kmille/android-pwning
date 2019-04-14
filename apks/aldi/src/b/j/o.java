package b.j;

import b.f.a.b;
import b.f.b.a.a;
import b.j;
import java.util.Iterator;
import java.util.NoSuchElementException;

@j(a={1, 1, 13}, b={"\000 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\013\n\002\b\002\n\002\020(\n\000\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B'\022\f\020\003\032\b\022\004\022\0028\0000\002\022\022\020\004\032\016\022\004\022\0028\000\022\004\022\0020\0060\005¢\006\002\020\007J\017\020\b\032\b\022\004\022\0028\0000\tH\002R\032\020\004\032\016\022\004\022\0028\000\022\004\022\0020\0060\005X\004¢\006\002\n\000R\024\020\003\032\b\022\004\022\0028\0000\002X\004¢\006\002\n\000¨\006\n"}, c={"Lkotlin/sequences/TakeWhileSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "predicate", "Lkotlin/Function1;", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"})
public final class o<T>
  implements h<T>
{
  final h<T> a;
  final b<T, Boolean> b;
  
  public o(h<? extends T> paramh, b<? super T, Boolean> paramb)
  {
    this.a = paramh;
    this.b = paramb;
  }
  
  public final Iterator<T> a()
  {
    return (Iterator)new a(this);
  }
  
  @j(a={1, 1, 13}, b={"\000#\n\000\n\002\020(\n\002\b\n\n\002\020\b\n\002\b\005\n\002\020\002\n\000\n\002\020\013\n\002\b\002*\001\000\b\n\030\0002\b\022\004\022\0028\0000\001J\b\020\021\032\0020\022H\002J\t\020\023\032\0020\024H\002J\016\020\025\032\0028\000H\002¢\006\002\020\007R\027\020\002\032\b\022\004\022\0028\0000\001¢\006\b\n\000\032\004\b\003\020\004R\036\020\005\032\004\030\0018\000X\016¢\006\020\n\002\020\n\032\004\b\006\020\007\"\004\b\b\020\tR\032\020\013\032\0020\fX\016¢\006\016\n\000\032\004\b\r\020\016\"\004\b\017\020\020¨\006\026"}, c={"kotlin/sequences/TakeWhileSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"})
  public static final class a
    implements a, Iterator<T>
  {
    private final Iterator<T> b;
    private int c;
    private T d;
    
    a()
    {
      this.b = localo.a.a();
      this.c = -1;
    }
    
    private final void a()
    {
      if (this.b.hasNext())
      {
        Object localObject = this.b.next();
        if (((Boolean)this.a.b.a(localObject)).booleanValue())
        {
          this.c = 1;
          this.d = localObject;
          return;
        }
      }
      this.c = 0;
    }
    
    public final boolean hasNext()
    {
      if (this.c == -1) {
        a();
      }
      return this.c == 1;
    }
    
    public final T next()
    {
      if (this.c == -1) {
        a();
      }
      if (this.c != 0)
      {
        Object localObject = this.d;
        this.d = null;
        this.c = -1;
        return (T)localObject;
      }
      throw ((Throwable)new NoSuchElementException());
    }
    
    public final void remove()
    {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/j/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */