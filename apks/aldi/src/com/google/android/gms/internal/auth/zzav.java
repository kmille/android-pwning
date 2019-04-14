package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

final class zzav
  extends zzaj
{
  zzav(zzau paramzzau) {}
  
  public final void zzb(String paramString)
  {
    if (paramString != null)
    {
      this.zzcg.setResult(new zzax(paramString));
      return;
    }
    this.zzcg.setResult(zzau.zzc(new Status(3006)));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */