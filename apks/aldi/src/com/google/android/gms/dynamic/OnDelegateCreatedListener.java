package com.google.android.gms.dynamic;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public abstract interface OnDelegateCreatedListener<T extends LifecycleDelegate>
{
  @KeepForSdk
  public abstract void onDelegateCreated(T paramT);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/dynamic/OnDelegateCreatedListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */