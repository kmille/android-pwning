package com.google.common.collect;

import com.google.common.base.j;
import java.util.Iterator;

abstract class aa<F, T>
  implements Iterator<T>
{
  final Iterator<? extends F> b;
  
  aa(Iterator<? extends F> paramIterator)
  {
    this.b = ((Iterator)j.a(paramIterator));
  }
  
  abstract T a(F paramF);
  
  public final boolean hasNext()
  {
    return this.b.hasNext();
  }
  
  public final T next()
  {
    return (T)a(this.b.next());
  }
  
  public final void remove()
  {
    this.b.remove();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */