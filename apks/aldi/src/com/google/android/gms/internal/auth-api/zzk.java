package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

final class zzk
  extends zzg
{
  zzk(zzj paramzzj) {}
  
  public final void zzc(Status paramStatus)
  {
    this.zzan.setResult(zzh.zzd(paramStatus));
  }
  
  public final void zzc(Status paramStatus, Credential paramCredential)
  {
    this.zzan.setResult(new zzh(paramStatus, paramCredential));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth-api/zzk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */