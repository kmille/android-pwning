package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

abstract class zzp<R extends Result>
  extends BaseImplementation.ApiMethodImpl<R, zzr>
{
  zzp(GoogleApiClient paramGoogleApiClient)
  {
    super(Auth.CREDENTIALS_API, paramGoogleApiClient);
  }
  
  protected abstract void zzc(Context paramContext, zzw paramzzw)
    throws DeadObjectException, RemoteException;
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth-api/zzp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */