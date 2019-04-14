package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

final class zzi
  extends BaseImplementation.ApiMethodImpl<Result, zzr>
{
  zzi(zzh paramzzh, Api paramApi, GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    super(paramApi, paramGoogleApiClient);
  }
  
  public final Result createFailedResult(Status paramStatus)
  {
    return new zzp(paramStatus);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */