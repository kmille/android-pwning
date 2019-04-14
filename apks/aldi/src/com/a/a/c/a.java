package com.a.a.c;

import java.util.Iterator;

public final class a<T>
  implements Iterator<T>
{
  private final Iterable<? extends T> a;
  private Iterator<? extends T> b;
  
  public a(Iterable<? extends T> paramIterable)
  {
    this.a = paramIterable;
  }
  
  private void a()
  {
    if (this.b != null) {
      return;
    }
    this.b = this.a.iterator();
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
    a();
    this.b.remove();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/a/a/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */