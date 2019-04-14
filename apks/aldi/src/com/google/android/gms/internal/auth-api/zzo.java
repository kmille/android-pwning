package com.google.android.gms.internal.auth-api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;

final class zzo
  extends zzg
{
  private BaseImplementation.ResultHolder<Status> zzap;
  
  zzo(BaseImplementation.ResultHolder<Status> paramResultHolder)
  {
    this.zzap = paramResultHolder;
  }
  
  public final void zzc(Status paramStatus)
  {
    this.zzap.setResult(paramStatus);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth-api/zzo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */