package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

final class zzv
  implements Runnable
{
  zzv(zzu paramzzu, Callable paramCallable) {}
  
  public final void run()
  {
    try
    {
      this.zzad.setResult(this.val$callable.call());
      return;
    }
    catch (Exception localException)
    {
      this.zzad.setException(localException);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tasks/zzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */