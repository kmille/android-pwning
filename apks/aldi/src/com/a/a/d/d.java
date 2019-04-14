package com.a.a.d;

import com.a.a.c.c;
import java.util.Iterator;

public final class d<T>
  extends c<T>
{
  private final Iterator<? extends T> a;
  private final long b;
  private long c;
  
  public d(Iterator<? extends T> paramIterator)
  {
    this.a = paramIterator;
    this.b = 10L;
    this.c = 0L;
  }
  
  public final T a()
  {
    this.c += 1L;
    return (T)this.a.next();
  }
  
  public final boolean hasNext()
  {
    return (this.c < this.b) && (this.a.hasNext());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/a/a/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */