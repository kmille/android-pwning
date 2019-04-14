package com.a.a.c;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class c<T>
  implements Iterator<T>
{
  public abstract T a();
  
  public final T next()
  {
    if (hasNext()) {
      return (T)a();
    }
    throw new NoSuchElementException();
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException("remove not supported");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/a/a/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */