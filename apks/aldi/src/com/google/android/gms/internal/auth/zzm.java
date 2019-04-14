package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

final class zzm
  extends zzn
{
  zzm(zzl paramzzl) {}
  
  public final void zza(boolean paramBoolean)
  {
    zzl localzzl = this.zzag;
    Status localStatus;
    if (paramBoolean) {
      localStatus = Status.RESULT_SUCCESS;
    } else {
      localStatus = zzh.zzc();
    }
    localzzl.setResult(new zzq(localStatus));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */