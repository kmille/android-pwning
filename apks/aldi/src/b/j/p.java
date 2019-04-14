package b.j;

import b.f.a.b;
import b.f.b.a.a;
import b.j;
import java.util.Iterator;

@j(a={1, 1, 13}, b={"\000 \n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020(\n\002\b\002\b\000\030\000*\004\b\000\020\001*\004\b\001\020\0022\b\022\004\022\002H\0020\003B'\022\f\020\004\032\b\022\004\022\0028\0000\003\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006¢\006\002\020\007J3\020\b\032\b\022\004\022\002H\t0\003\"\004\b\002\020\t2\030\020\n\032\024\022\004\022\0028\001\022\n\022\b\022\004\022\002H\t0\0130\006H\000¢\006\002\b\fJ\017\020\n\032\b\022\004\022\0028\0010\013H\002R\024\020\004\032\b\022\004\022\0028\0000\003X\004¢\006\002\n\000R\032\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006X\004¢\006\002\n\000¨\006\r"}, c={"Lkotlin/sequences/TransformingSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "flatten", "E", "iterator", "", "flatten$kotlin_stdlib", "kotlin-stdlib"})
public final class p<T, R>
  implements h<R>
{
  public final h<T> a;
  public final b<T, R> b;
  
  public p(h<? extends T> paramh, b<? super T, ? extends R> paramb)
  {
    this.a = paramh;
    this.b = paramb;
  }
  
  public final Iterator<R> a()
  {
    return (Iterator)new a(this);
  }
  
  @j(a={1, 1, 13}, b={"\000\025\n\000\n\002\020(\n\002\b\004\n\002\020\013\n\002\b\003*\001\000\b\n\030\0002\b\022\004\022\0028\0000\001J\t\020\005\032\0020\006H\002J\016\020\007\032\0028\000H\002¢\006\002\020\bR\027\020\002\032\b\022\004\022\0028\0010\001¢\006\b\n\000\032\004\b\003\020\004¨\006\t"}, c={"kotlin/sequences/TransformingSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
  public static final class a
    implements a, Iterator<R>
  {
    private final Iterator<T> b;
    
    a()
    {
      this.b = localp.a.a();
    }
    
    public final boolean hasNext()
    {
      return this.b.hasNext();
    }
    
    public final R next()
    {
      return (R)this.a.b.a(this.b.next());
    }
    
    public final void remove()
    {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/j/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */