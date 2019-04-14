package com.a.a.d;

import com.a.a.a.d;
import com.a.a.c.b;
import com.a.a.f;
import java.util.Iterator;

public final class c<T, R>
  extends b<R>
{
  private final Iterator<? extends T> d;
  private final d<? super T, ? extends f<? extends R>> e;
  private Iterator<? extends R> f;
  private f<? extends R> g;
  
  public c(Iterator<? extends T> paramIterator, d<? super T, ? extends f<? extends R>> paramd)
  {
    this.d = paramIterator;
    this.e = paramd;
  }
  
  public final void a()
  {
    if ((this.f != null) && (this.f.hasNext())) {}
    for (;;)
    {
      this.a = this.f.next();
      this.b = true;
      return;
      do
      {
        if (!this.d.hasNext()) {
          break;
        }
        if ((this.f == null) || (!this.f.hasNext()))
        {
          if (this.g != null)
          {
            this.g.close();
            this.g = null;
          }
          Object localObject = this.d.next();
          localObject = (f)this.e.apply(localObject);
          if (localObject != null)
          {
            this.f = ((f)localObject).a;
            this.g = ((f)localObject);
          }
        }
      } while ((this.f == null) || (!this.f.hasNext()));
    }
    this.b = false;
    if (this.g != null)
    {
      this.g.close();
      this.g = null;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/a/a/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */