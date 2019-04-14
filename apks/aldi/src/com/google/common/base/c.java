package com.google.common.base;

import javax.annotation.Nullable;

public abstract class c<T>
{
  public final int a(@Nullable T paramT)
  {
    if (paramT == null) {
      return 0;
    }
    return b();
  }
  
  protected abstract boolean a();
  
  public final boolean a(@Nullable T paramT1, @Nullable T paramT2)
  {
    if (paramT1 == paramT2) {
      return true;
    }
    if ((paramT1 != null) && (paramT2 != null)) {
      return a();
    }
    return false;
  }
  
  protected abstract int b();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/base/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */