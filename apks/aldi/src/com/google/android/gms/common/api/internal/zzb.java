package com.google.android.gms.common.api.internal;

import android.os.Bundle;

final class zzb
  implements Runnable
{
  zzb(zza paramzza, LifecycleCallback paramLifecycleCallback, String paramString) {}
  
  public final void run()
  {
    if (zza.zza(this.zzbj) > 0)
    {
      LifecycleCallback localLifecycleCallback = this.zzbh;
      Bundle localBundle;
      if (zza.zzb(this.zzbj) != null) {
        localBundle = zza.zzb(this.zzbj).getBundle(this.zzbi);
      } else {
        localBundle = null;
      }
      localLifecycleCallback.onCreate(localBundle);
    }
    if (zza.zza(this.zzbj) >= 2) {
      this.zzbh.onStart();
    }
    if (zza.zza(this.zzbj) >= 3) {
      this.zzbh.onResume();
    }
    if (zza.zza(this.zzbj) >= 4) {
      this.zzbh.onStop();
    }
    if (zza.zza(this.zzbj) >= 5) {
      this.zzbh.onDestroy();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */