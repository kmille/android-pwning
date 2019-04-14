package com.karumi.dexter;

import android.os.Looper;

final class ThreadFactory
{
  public static Thread makeMainThread()
  {
    return new MainThread();
  }
  
  public static Thread makeSameThread()
  {
    if (runningMainThread()) {
      return new MainThread();
    }
    return new WorkerThread();
  }
  
  private static boolean runningMainThread()
  {
    return Looper.getMainLooper().getThread() == java.lang.Thread.currentThread();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/ThreadFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */