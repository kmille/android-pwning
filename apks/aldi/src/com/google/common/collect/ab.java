package com.google.common.collect;

import java.util.Iterator;

public abstract class ab<E>
  implements Iterator<E>
{
  @Deprecated
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */