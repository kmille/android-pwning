package com.google.android.gms.auth.account;

import android.accounts.Account;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

@Deprecated
public abstract interface WorkAccountApi
{
  @Deprecated
  public abstract PendingResult<AddAccountResult> addWorkAccount(GoogleApiClient paramGoogleApiClient, String paramString);
  
  @Deprecated
  public abstract PendingResult<Result> removeWorkAccount(GoogleApiClient paramGoogleApiClient, Account paramAccount);
  
  @Deprecated
  public abstract void setWorkAuthenticatorEnabled(GoogleApiClient paramGoogleApiClient, boolean paramBoolean);
  
  @Deprecated
  public abstract PendingResult<Result> setWorkAuthenticatorEnabledWithResult(GoogleApiClient paramGoogleApiClient, boolean paramBoolean);
  
  @Deprecated
  public static abstract interface AddAccountResult
    extends Result
  {
    public abstract Account getAccount();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/account/WorkAccountApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */