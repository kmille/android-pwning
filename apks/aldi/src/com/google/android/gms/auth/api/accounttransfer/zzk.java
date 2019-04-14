package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzs;

final class zzk
  extends zzs
{
  zzk(AccountTransferClient.zzc paramzzc) {}
  
  public final void onFailure(Status paramStatus)
  {
    this.zzay.zza(paramStatus);
  }
  
  public final void zzd()
  {
    this.zzay.setResult(null);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/accounttransfer/zzk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */