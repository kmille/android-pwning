package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class zzwn
{
  private static final Integer zzboj = Integer.valueOf(0);
  private static final Integer zzbok = Integer.valueOf(1);
  private final ExecutorService executor;
  private final Context zzqx;
  
  public zzwn(Context paramContext)
  {
    this(paramContext, Executors.newSingleThreadExecutor());
  }
  
  @VisibleForTesting
  private zzwn(Context paramContext, ExecutorService paramExecutorService)
  {
    this.zzqx = paramContext;
    this.executor = paramExecutorService;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzwn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */