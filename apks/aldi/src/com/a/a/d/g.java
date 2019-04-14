package com.a.a.d;

import com.a.a.c.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class g<T>
  extends b<T>
{
  private final Iterator<? extends T> d;
  private final Comparator<? super T> e;
  private Iterator<T> f;
  
  public g(Iterator<? extends T> paramIterator, Comparator<? super T> paramComparator)
  {
    this.d = paramIterator;
    this.e = paramComparator;
  }
  
  public final void a()
  {
    if (!this.c)
    {
      Iterator localIterator = this.d;
      ArrayList localArrayList = new ArrayList();
      while (localIterator.hasNext()) {
        localArrayList.add(localIterator.next());
      }
      Collections.sort(localArrayList, this.e);
      this.f = localArrayList.iterator();
    }
    this.b = this.f.hasNext();
    if (this.b) {
      this.a = this.f.next();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/a/a/d/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */