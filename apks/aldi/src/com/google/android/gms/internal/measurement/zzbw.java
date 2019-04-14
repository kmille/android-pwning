package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

abstract class zzbw
{
  private static volatile Handler handler;
  private final zzat zzvm;
  private final Runnable zzyc;
  private volatile long zzyd;
  
  zzbw(zzat paramzzat)
  {
    Preconditions.checkNotNull(paramzzat);
    this.zzvm = paramzzat;
    this.zzyc = new zzbx(this);
  }
  
  private final Handler getHandler()
  {
    if (handler != null) {
      return handler;
    }
    try
    {
      if (handler == null) {
        handler = new Handler(this.zzvm.getContext().getMainLooper());
      }
      Handler localHandler = handler;
      return localHandler;
    }
    finally {}
  }
  
  public final void cancel()
  {
    this.zzyd = 0L;
    getHandler().removeCallbacks(this.zzyc);
  }
  
  public abstract void run();
  
  public final long zzee()
  {
    if (this.zzyd == 0L) {
      return 0L;
    }
    return Math.abs(this.zzvm.zzbt().currentTimeMillis() - this.zzyd);
  }
  
  public final boolean zzef()
  {
    return this.zzyd != 0L;
  }
  
  public final void zzh(long paramLong)
  {
    cancel();
    if (paramLong >= 0L)
    {
      this.zzyd = this.zzvm.zzbt().currentTimeMillis();
      if (!getHandler().postDelayed(this.zzyc, paramLong)) {
        this.zzvm.zzbu().zze("Failed to schedule delayed post. time", Long.valueOf(paramLong));
      }
    }
  }
  
  public final void zzi(long paramLong)
  {
    if (!zzef()) {
      return;
    }
    if (paramLong < 0L)
    {
      cancel();
      return;
    }
    long l = paramLong - Math.abs(this.zzvm.zzbt().currentTimeMillis() - this.zzyd);
    paramLong = l;
    if (l < 0L) {
      paramLong = 0L;
    }
    getHandler().removeCallbacks(this.zzyc);
    if (!getHandler().postDelayed(this.zzyc, paramLong)) {
      this.zzvm.zzbu().zze("Failed to adjust delayed post. time", Long.valueOf(paramLong));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzbw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */