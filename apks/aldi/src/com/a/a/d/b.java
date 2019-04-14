package com.a.a.d;

import com.a.a.a.e;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class b<T>
  implements Iterator<T>
{
  private final Iterator<? extends T> a;
  private final e<? super T> b;
  private boolean c;
  private boolean d;
  private T e;
  
  public b(Iterator<? extends T> paramIterator, e<? super T> parame)
  {
    this.a = paramIterator;
    this.b = parame;
  }
  
  public final boolean hasNext()
  {
    if (!this.d)
    {
      while (this.a.hasNext())
      {
        this.e = this.a.next();
        if (this.b.test(this.e))
        {
          this.c = true;
          break label61;
        }
      }
      this.c = false;
      label61:
      this.d = true;
    }
    return this.c;
  }
  
  public final T next()
  {
    if (!this.d) {
      this.c = hasNext();
    }
    if (this.c)
    {
      this.d = false;
      return (T)this.e;
    }
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("remove not supported");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/a/a/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */