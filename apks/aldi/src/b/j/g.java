package b.j;

import b.f.a.b;
import b.r;
import java.util.Iterator;
import java.util.NoSuchElementException;

@b.j(a={1, 1, 13}, b={"\000$\n\002\030\002\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020(\n\000\b\002\030\000*\b\b\000\020\001*\0020\0022\b\022\004\022\002H\0010\003B+\022\016\020\004\032\n\022\006\022\004\030\0018\0000\005\022\024\020\006\032\020\022\004\022\0028\000\022\006\022\004\030\0018\0000\007¢\006\002\020\bJ\017\020\t\032\b\022\004\022\0028\0000\nH\002R\026\020\004\032\n\022\006\022\004\030\0018\0000\005X\004¢\006\002\n\000R\034\020\006\032\020\022\004\022\0028\000\022\006\022\004\030\0018\0000\007X\004¢\006\002\n\000¨\006\013"}, c={"Lkotlin/sequences/GeneratorSequence;", "T", "", "Lkotlin/sequences/Sequence;", "getInitialValue", "Lkotlin/Function0;", "getNextValue", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"})
final class g<T>
  implements h<T>
{
  final b.f.a.a<T> a;
  final b<T, T> b;
  
  public g(b.f.a.a<? extends T> parama, b<? super T, ? extends T> paramb)
  {
    this.a = parama;
    this.b = paramb;
  }
  
  public final Iterator<T> a()
  {
    return (Iterator)new a(this);
  }
  
  @b.j(a={1, 1, 13}, b={"\000#\n\000\n\002\020(\n\002\b\007\n\002\020\b\n\002\b\005\n\002\020\002\n\000\n\002\020\013\n\002\b\002*\001\000\b\n\030\0002\b\022\004\022\0028\0000\001J\b\020\016\032\0020\017H\002J\t\020\020\032\0020\021H\002J\016\020\022\032\0028\000H\002¢\006\002\020\004R\036\020\002\032\004\030\0018\000X\016¢\006\020\n\002\020\007\032\004\b\003\020\004\"\004\b\005\020\006R\032\020\b\032\0020\tX\016¢\006\016\n\000\032\004\b\n\020\013\"\004\b\f\020\r¨\006\023"}, c={"kotlin/sequences/GeneratorSequence$iterator$1", "", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"})
  public static final class a
    implements b.f.b.a.a, Iterator<T>
  {
    private T b;
    private int c = -2;
    
    private final void a()
    {
      Object localObject1;
      if (this.c == -2)
      {
        localObject1 = this.a.a.b_();
      }
      else
      {
        localObject1 = this.a.b;
        Object localObject2 = this.b;
        if (localObject2 == null) {
          b.f.b.j.a();
        }
        localObject1 = ((b)localObject1).a(localObject2);
      }
      this.b = localObject1;
      int i;
      if (this.b == null) {
        i = 0;
      } else {
        i = 1;
      }
      this.c = i;
    }
    
    public final boolean hasNext()
    {
      if (this.c < 0) {
        a();
      }
      return this.c == 1;
    }
    
    public final T next()
    {
      if (this.c < 0) {
        a();
      }
      if (this.c != 0)
      {
        Object localObject = this.b;
        if (localObject != null)
        {
          this.c = -1;
          return (T)localObject;
        }
        throw new r("null cannot be cast to non-null type T");
      }
      throw ((Throwable)new NoSuchElementException());
    }
    
    public final void remove()
    {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/j/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */