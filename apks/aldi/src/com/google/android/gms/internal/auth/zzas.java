package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;

final class zzas
  extends zzap
{
  zzas(zzar paramzzar, GoogleApiClient paramGoogleApiClient, ProxyRequest paramProxyRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected final void zza(Context paramContext, zzan paramzzan)
    throws RemoteException
  {
    paramzzan.zza(new zzat(this), this.zzce);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */