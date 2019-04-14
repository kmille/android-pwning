package com.karumi.dexter;

import android.os.Handler;
import android.os.Looper;

final class MainThread
  implements Thread
{
  private static boolean runningMainThread()
  {
    return Looper.getMainLooper() == Looper.myLooper();
  }
  
  public final void execute(Runnable paramRunnable)
  {
    if (runningMainThread())
    {
      paramRunnable.run();
      return;
    }
    new Handler(Looper.getMainLooper()).post(paramRunnable);
  }
  
  public final void loop() {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/MainThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */