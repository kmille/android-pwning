package android.arch.lifecycle;

import android.support.annotation.NonNull;

public abstract interface LifecycleOwner
{
  @NonNull
  public abstract Lifecycle getLifecycle();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/arch/lifecycle/LifecycleOwner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */