package com.google.android.gms.internal.measurement;

import android.os.Looper;
import com.google.android.gms.analytics.zzk;

final class zzbx
  implements Runnable
{
  zzbx(zzbw paramzzbw) {}
  
  public final void run()
  {
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      zzbw.zza(this.zzye).zzbw().zza(this);
      return;
    }
    boolean bool = this.zzye.zzef();
    zzbw.zza(this.zzye, 0L);
    if (bool) {
      this.zzye.run();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzbx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */