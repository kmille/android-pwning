package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult;
import com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Preconditions;

public final class zzar
  implements ProxyApi
{
  public final PendingResult<ProxyApi.SpatulaHeaderResult> getSpatulaHeader(GoogleApiClient paramGoogleApiClient)
  {
    Preconditions.checkNotNull(paramGoogleApiClient);
    return paramGoogleApiClient.execute(new zzau(this, paramGoogleApiClient));
  }
  
  public final PendingResult<ProxyApi.ProxyResult> performProxyRequest(GoogleApiClient paramGoogleApiClient, ProxyRequest paramProxyRequest)
  {
    Preconditions.checkNotNull(paramGoogleApiClient);
    Preconditions.checkNotNull(paramProxyRequest);
    return paramGoogleApiClient.execute(new zzas(this, paramGoogleApiClient, paramProxyRequest));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */