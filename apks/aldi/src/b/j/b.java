package b.j;

import b.f.b.a.a;
import b.j;
import java.util.Iterator;

@j(a={1, 1, 13}, b={"\000\"\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\004\n\002\020(\n\002\b\002\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003B\033\022\f\020\004\032\b\022\004\022\0028\0000\002\022\006\020\005\032\0020\006¢\006\002\020\007J\026\020\b\032\b\022\004\022\0028\0000\0022\006\020\t\032\0020\006H\026J\017\020\n\032\b\022\004\022\0028\0000\013H\002J\026\020\f\032\b\022\004\022\0028\0000\0022\006\020\t\032\0020\006H\026R\016\020\005\032\0020\006X\004¢\006\002\n\000R\024\020\004\032\b\022\004\022\0028\0000\002X\004¢\006\002\n\000¨\006\r"}, c={"Lkotlin/sequences/DropSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "count", "", "(Lkotlin/sequences/Sequence;I)V", "drop", "n", "iterator", "", "take", "kotlin-stdlib"})
public final class b<T>
  implements c<T>, h<T>
{
  final h<T> a;
  final int b;
  
  public b(h<? extends T> paramh, int paramInt)
  {
    this.a = paramh;
    this.b = paramInt;
    if (this.b >= 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if (paramInt != 0) {
      return;
    }
    paramh = new StringBuilder("count must be non-negative, but was ");
    paramh.append(this.b);
    paramh.append('.');
    throw ((Throwable)new IllegalArgumentException(paramh.toString().toString()));
  }
  
  public final Iterator<T> a()
  {
    return (Iterator)new a(this);
  }
  
  public final h<T> b()
  {
    int i = this.b + 1;
    if (i < 0) {
      return (h)new b((h)this, 1);
    }
    return (h)new b(this.a, i);
  }
  
  @j(a={1, 1, 13}, b={"\000#\n\000\n\002\020(\n\002\b\004\n\002\020\b\n\002\b\005\n\002\020\002\n\000\n\002\020\013\n\002\b\003*\001\000\b\n\030\0002\b\022\004\022\0028\0000\001J\b\020\013\032\0020\fH\002J\t\020\r\032\0020\016H\002J\016\020\017\032\0028\000H\002¢\006\002\020\020R\027\020\002\032\b\022\004\022\0028\0000\001¢\006\b\n\000\032\004\b\003\020\004R\032\020\005\032\0020\006X\016¢\006\016\n\000\032\004\b\007\020\b\"\004\b\t\020\n¨\006\021"}, c={"kotlin/sequences/DropSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "left", "", "getLeft", "()I", "setLeft", "(I)V", "drop", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
  public static final class a
    implements a, Iterator<T>
  {
    private final Iterator<T> b;
    private int c;
    
    a()
    {
      this.b = localb.a.a();
      this.c = localb.b;
    }
    
    private final void a()
    {
      while ((this.c > 0) && (this.b.hasNext()))
      {
        this.b.next();
        this.c -= 1;
      }
    }
    
    public final boolean hasNext()
    {
      a();
      return this.b.hasNext();
    }
    
    public final T next()
    {
      a();
      return (T)this.b.next();
    }
    
    public final void remove()
    {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/j/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */