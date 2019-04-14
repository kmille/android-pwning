package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public abstract interface BiConsumer<T, U>
{
  @KeepForSdk
  public abstract void accept(T paramT, U paramU);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/util/BiConsumer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */