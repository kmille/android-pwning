package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult;
import com.google.android.gms.common.api.Status;

final class zzo
  implements WorkAccountApi.AddAccountResult
{
  private final Status mStatus;
  private final Account zzk;
  
  public zzo(Status paramStatus, Account paramAccount)
  {
    this.mStatus = paramStatus;
    this.zzk = paramAccount;
  }
  
  public final Account getAccount()
  {
    return this.zzk;
  }
  
  public final Status getStatus()
  {
    return this.mStatus;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */