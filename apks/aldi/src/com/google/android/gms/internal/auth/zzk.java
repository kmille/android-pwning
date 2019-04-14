package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

final class zzk
  extends zzn
{
  zzk(zzj paramzzj) {}
  
  public final void zzc(Account paramAccount)
  {
    zzj localzzj = this.zzaf;
    Status localStatus;
    if (paramAccount != null) {
      localStatus = Status.RESULT_SUCCESS;
    } else {
      localStatus = zzh.zzc();
    }
    localzzj.setResult(new zzo(localStatus, paramAccount));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */