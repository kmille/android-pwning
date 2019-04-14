package com.a.a.d;

import com.a.a.a.d;
import com.a.a.c.c;
import java.util.Iterator;

public final class e<T, R>
  extends c<R>
{
  private final Iterator<? extends T> a;
  private final d<? super T, ? extends R> b;
  
  public e(Iterator<? extends T> paramIterator, d<? super T, ? extends R> paramd)
  {
    this.a = paramIterator;
    this.b = paramd;
  }
  
  public final R a()
  {
    return (R)this.b.apply(this.a.next());
  }
  
  public final boolean hasNext()
  {
    return this.a.hasNext();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/a/a/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */