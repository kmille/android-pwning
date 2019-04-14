package com.bumptech.glide.manager;

import android.support.annotation.NonNull;

class ApplicationLifecycle
  implements Lifecycle
{
  public void addListener(@NonNull LifecycleListener paramLifecycleListener)
  {
    paramLifecycleListener.onStart();
  }
  
  public void removeListener(@NonNull LifecycleListener paramLifecycleListener) {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/manager/ApplicationLifecycle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */