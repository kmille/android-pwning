package b.a;

import b.f.b.a.a;
import b.j;
import java.util.Iterator;

@j(a={1, 1, 13}, b={"\000 \n\002\030\002\n\000\n\002\020(\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\020\013\n\002\b\002\b\000\030\000*\006\b\000\020\001 \0012\016\022\n\022\b\022\004\022\002H\0010\0030\002B\023\022\f\020\004\032\b\022\004\022\0028\0000\002¢\006\002\020\005J\t\020\b\032\0020\tH\002J\017\020\n\032\b\022\004\022\0028\0000\003H\002R\016\020\006\032\0020\007X\016¢\006\002\n\000R\024\020\004\032\b\022\004\022\0028\0000\002X\004¢\006\002\n\000¨\006\013"}, c={"Lkotlin/collections/IndexingIterator;", "T", "", "Lkotlin/collections/IndexedValue;", "iterator", "(Ljava/util/Iterator;)V", "index", "", "hasNext", "", "next", "kotlin-stdlib"})
public final class aa<T>
  implements a, Iterator<y<? extends T>>
{
  private int a;
  private final Iterator<T> b;
  
  public aa(Iterator<? extends T> paramIterator)
  {
    this.b = paramIterator;
  }
  
  public final boolean hasNext()
  {
    return this.b.hasNext();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/a/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */