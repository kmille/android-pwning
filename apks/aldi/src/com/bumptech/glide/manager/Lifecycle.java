package com.bumptech.glide.manager;

import android.support.annotation.NonNull;

public abstract interface Lifecycle
{
  public abstract void addListener(@NonNull LifecycleListener paramLifecycleListener);
  
  public abstract void removeListener(@NonNull LifecycleListener paramLifecycleListener);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/manager/Lifecycle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */