package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

final class zzl
  extends BaseImplementation.ApiMethodImpl<Result, zzr>
{
  zzl(zzh paramzzh, Api paramApi, GoogleApiClient paramGoogleApiClient, Account paramAccount)
  {
    super(paramApi, paramGoogleApiClient);
  }
  
  public final Result createFailedResult(Status paramStatus)
  {
    return new zzq(paramStatus);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */