package com.a.a.d;

import com.a.a.c.c;
import java.util.Iterator;

public final class f<T>
  extends c<T>
{
  private final Iterator<? extends T> a;
  private final long b;
  private long c;
  
  public f(Iterator<? extends T> paramIterator, long paramLong)
  {
    this.a = paramIterator;
    this.b = paramLong;
    this.c = 0L;
  }
  
  public final T a()
  {
    return (T)this.a.next();
  }
  
  public final boolean hasNext()
  {
    while (this.c < this.b)
    {
      if (!this.a.hasNext()) {
        return false;
      }
      this.a.next();
      this.c += 1L;
    }
    return this.a.hasNext();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/a/a/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */