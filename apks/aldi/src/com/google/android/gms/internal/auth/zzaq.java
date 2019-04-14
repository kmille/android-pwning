package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

abstract class zzaq
  extends BaseImplementation.ApiMethodImpl<ProxyApi.SpatulaHeaderResult, zzak>
{
  public zzaq(GoogleApiClient paramGoogleApiClient)
  {
    super(AuthProxy.API, paramGoogleApiClient);
  }
  
  protected static ProxyApi.SpatulaHeaderResult zzc(Status paramStatus)
  {
    return new zzax(paramStatus);
  }
  
  protected abstract void zza(Context paramContext, zzan paramzzan)
    throws RemoteException;
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzaq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */