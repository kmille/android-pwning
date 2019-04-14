package b.f.b;

import b.j;
import java.util.Iterator;
import java.util.NoSuchElementException;

@j(a={1, 1, 13}, b={"\000\"\n\002\030\002\n\000\n\002\020(\n\000\n\002\020\021\n\002\b\005\n\002\020\b\n\000\n\002\020\013\n\002\b\003\b\002\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\023\022\f\020\003\032\b\022\004\022\0028\0000\004¢\006\002\020\005J\t\020\013\032\0020\fH\002J\016\020\r\032\0028\000H\002¢\006\002\020\016R\031\020\003\032\b\022\004\022\0028\0000\004¢\006\n\n\002\020\b\032\004\b\006\020\007R\016\020\t\032\0020\nX\016¢\006\002\n\000¨\006\017"}, c={"Lkotlin/jvm/internal/ArrayIterator;", "T", "", "array", "", "([Ljava/lang/Object;)V", "getArray", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "index", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
final class a<T>
  implements b.f.b.a.a, Iterator<T>
{
  private int a;
  private final T[] b;
  
  public a(T[] paramArrayOfT)
  {
    this.b = paramArrayOfT;
  }
  
  public final boolean hasNext()
  {
    return this.a < this.b.length;
  }
  
  public final T next()
  {
    try
    {
      Object localObject = this.b;
      int i = this.a;
      this.a = (i + 1);
      localObject = localObject[i];
      return (T)localObject;
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      this.a -= 1;
      throw ((Throwable)new NoSuchElementException(localArrayIndexOutOfBoundsException.getMessage()));
    }
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/f/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */