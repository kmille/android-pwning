package b.j;

import b.f.a.b;
import b.f.b.a.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

@b.j(a={1, 1, 13}, b={"\000\036\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020(\n\002\b\002\b\000\030\000*\004\b\000\020\001*\004\b\001\020\002*\004\b\002\020\0032\b\022\004\022\002H\0030\004BA\022\f\020\005\032\b\022\004\022\0028\0000\004\022\022\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007\022\030\020\b\032\024\022\004\022\0028\001\022\n\022\b\022\004\022\0028\0020\t0\007¢\006\002\020\nJ\017\020\b\032\b\022\004\022\0028\0020\tH\002R \020\b\032\024\022\004\022\0028\001\022\n\022\b\022\004\022\0028\0020\t0\007X\004¢\006\002\n\000R\024\020\005\032\b\022\004\022\0028\0000\004X\004¢\006\002\n\000R\032\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007X\004¢\006\002\n\000¨\006\013"}, c={"Lkotlin/sequences/FlatteningSequence;", "T", "R", "E", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "iterator", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"})
public final class f<T, R, E>
  implements h<E>
{
  final h<T> a;
  final b<T, R> b;
  final b<R, Iterator<E>> c;
  
  public f(h<? extends T> paramh, b<? super T, ? extends R> paramb, b<? super R, ? extends Iterator<? extends E>> paramb1)
  {
    this.a = paramh;
    this.b = paramb;
    this.c = paramb1;
  }
  
  public final Iterator<E> a()
  {
    return (Iterator)new a(this);
  }
  
  @b.j(a={1, 1, 13}, b={"\000\025\n\000\n\002\020(\n\002\b\b\n\002\020\013\n\002\b\004*\001\000\b\n\030\0002\b\022\004\022\0028\0000\001J\b\020\t\032\0020\nH\002J\t\020\013\032\0020\nH\002J\016\020\f\032\0028\000H\002¢\006\002\020\rR\"\020\002\032\n\022\004\022\0028\000\030\0010\001X\016¢\006\016\n\000\032\004\b\003\020\004\"\004\b\005\020\006R\027\020\007\032\b\022\004\022\0028\0010\001¢\006\b\n\000\032\004\b\b\020\004¨\006\016"}, c={"kotlin/sequences/FlatteningSequence$iterator$1", "", "itemIterator", "getItemIterator", "()Ljava/util/Iterator;", "setItemIterator", "(Ljava/util/Iterator;)V", "iterator", "getIterator", "ensureItemIterator", "", "hasNext", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
  public static final class a
    implements a, Iterator<E>
  {
    private final Iterator<T> b;
    private Iterator<? extends E> c;
    
    a()
    {
      this.b = localf.a.a();
    }
    
    private final boolean a()
    {
      Object localObject = this.c;
      if ((localObject != null) && (!((Iterator)localObject).hasNext())) {
        this.c = null;
      }
      while (this.c == null)
      {
        if (!this.b.hasNext()) {
          return false;
        }
        localObject = this.b.next();
        localObject = (Iterator)this.a.c.a(this.a.b.a(localObject));
        if (((Iterator)localObject).hasNext()) {
          this.c = ((Iterator)localObject);
        }
      }
      return true;
    }
    
    public final boolean hasNext()
    {
      return a();
    }
    
    public final E next()
    {
      if (a())
      {
        Iterator localIterator = this.c;
        if (localIterator == null) {
          b.f.b.j.a();
        }
        return (E)localIterator.next();
      }
      throw ((Throwable)new NoSuchElementException());
    }
    
    public final void remove()
    {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/j/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */