package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

abstract class zzap
  extends BaseImplementation.ApiMethodImpl<ProxyApi.ProxyResult, zzak>
{
  public zzap(GoogleApiClient paramGoogleApiClient)
  {
    super(AuthProxy.API, paramGoogleApiClient);
  }
  
  protected abstract void zza(Context paramContext, zzan paramzzan)
    throws RemoteException;
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */