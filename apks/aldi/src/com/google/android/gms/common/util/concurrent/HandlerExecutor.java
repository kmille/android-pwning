package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zze;
import java.util.concurrent.Executor;

@KeepForSdk
public class HandlerExecutor
  implements Executor
{
  private final Handler handler;
  
  @KeepForSdk
  public HandlerExecutor(Looper paramLooper)
  {
    this.handler = new zze(paramLooper);
  }
  
  public void execute(@NonNull Runnable paramRunnable)
  {
    this.handler.post(paramRunnable);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/util/concurrent/HandlerExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */