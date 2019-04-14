package com.google.android.gms.common.api.internal;

import android.os.Bundle;

final class zzd
  implements Runnable
{
  zzd(zzc paramzzc, LifecycleCallback paramLifecycleCallback, String paramString) {}
  
  public final void run()
  {
    if (zzc.zza(this.zzbk) > 0)
    {
      LifecycleCallback localLifecycleCallback = this.zzbh;
      Bundle localBundle;
      if (zzc.zzb(this.zzbk) != null) {
        localBundle = zzc.zzb(this.zzbk).getBundle(this.zzbi);
      } else {
        localBundle = null;
      }
      localLifecycleCallback.onCreate(localBundle);
    }
    if (zzc.zza(this.zzbk) >= 2) {
      this.zzbh.onStart();
    }
    if (zzc.zza(this.zzbk) >= 3) {
      this.zzbh.onResume();
    }
    if (zzc.zza(this.zzbk) >= 4) {
      this.zzbh.onStop();
    }
    if (zzc.zza(this.zzbk) >= 5) {
      this.zzbh.onDestroy();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */