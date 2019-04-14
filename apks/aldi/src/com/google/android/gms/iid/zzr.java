package com.google.android.gms.iid;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

public final class zzr
{
  private final ScheduledExecutorService zzbz;
  @GuardedBy("this")
  private zzt zzca = new zzt(this, null);
  @GuardedBy("this")
  private int zzcb = 1;
  private final Context zzk;
  
  public zzr(Context paramContext)
  {
    this(paramContext, Executors.newSingleThreadScheduledExecutor());
  }
  
  @VisibleForTesting
  private zzr(Context paramContext, ScheduledExecutorService paramScheduledExecutorService)
  {
    this.zzk = paramContext.getApplicationContext();
    this.zzbz = paramScheduledExecutorService;
  }
  
  private final <T> Task<T> zzd(zzz<T> paramzzz)
  {
    try
    {
      if (Log.isLoggable("MessengerIpcClient", 3))
      {
        String str = String.valueOf(paramzzz);
        StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 9);
        localStringBuilder.append("Queueing ");
        localStringBuilder.append(str);
      }
      if (!this.zzca.zze(paramzzz))
      {
        this.zzca = new zzt(this, null);
        this.zzca.zze(paramzzz);
      }
      paramzzz = paramzzz.zzcl.getTask();
      return paramzzz;
    }
    finally {}
  }
  
  private final int zzq()
  {
    try
    {
      int i = this.zzcb;
      this.zzcb = (i + 1);
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Task<Bundle> zzd(int paramInt, Bundle paramBundle)
  {
    return zzd(new zzab(zzq(), 1, paramBundle));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/iid/zzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */