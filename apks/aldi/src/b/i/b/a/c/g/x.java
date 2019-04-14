package b.i.b.a.c.g;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class x
  extends AbstractList<String>
  implements o, RandomAccess
{
  private final o a;
  
  public x(o paramo)
  {
    this.a = paramo;
  }
  
  public final d a(int paramInt)
  {
    return this.a.a(paramInt);
  }
  
  public final List<?> a()
  {
    return this.a.a();
  }
  
  public final void a(d paramd)
  {
    throw new UnsupportedOperationException();
  }
  
  public final o b()
  {
    return this;
  }
  
  public final Iterator<String> iterator()
  {
    new Iterator()
    {
      Iterator<String> a = x.a(x.this).iterator();
      
      public final boolean hasNext()
      {
        return this.a.hasNext();
      }
      
      public final void remove()
      {
        throw new UnsupportedOperationException();
      }
    };
  }
  
  public final ListIterator<String> listIterator(final int paramInt)
  {
    new ListIterator()
    {
      ListIterator<String> a = x.a(x.this).listIterator(paramInt);
      
      public final boolean hasNext()
      {
        return this.a.hasNext();
      }
      
      public final boolean hasPrevious()
      {
        return this.a.hasPrevious();
      }
      
      public final int nextIndex()
      {
        return this.a.nextIndex();
      }
      
      public final int previousIndex()
      {
        return this.a.previousIndex();
      }
      
      public final void remove()
      {
        throw new UnsupportedOperationException();
      }
    };
  }
  
  public final int size()
  {
    return this.a.size();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/g/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */