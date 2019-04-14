package com.a.a.c;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class b<T>
  implements Iterator<T>
{
  protected T a;
  protected boolean b;
  protected boolean c;
  
  protected abstract void a();
  
  public boolean hasNext()
  {
    if (!this.c)
    {
      a();
      this.c = true;
    }
    return this.b;
  }
  
  public T next()
  {
    if (!this.c) {
      hasNext();
    }
    if (this.b)
    {
      Object localObject = this.a;
      a();
      if (!this.b) {
        this.a = null;
      }
      return (T)localObject;
    }
    throw new NoSuchElementException();
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException("remove not supported");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/a/a/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */