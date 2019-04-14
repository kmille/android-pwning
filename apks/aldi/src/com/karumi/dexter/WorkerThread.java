package com.karumi.dexter;

import android.os.Handler;
import android.os.Looper;

final class WorkerThread
  implements Thread
{
  private final Handler handler;
  private boolean wasLooperNull = false;
  
  WorkerThread()
  {
    if (Looper.myLooper() == null)
    {
      this.wasLooperNull = true;
      Looper.prepare();
    }
    this.handler = new Handler();
  }
  
  public final void execute(Runnable paramRunnable)
  {
    this.handler.post(paramRunnable);
  }
  
  public final void loop()
  {
    if (this.wasLooperNull) {
      Looper.loop();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/WorkerThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */