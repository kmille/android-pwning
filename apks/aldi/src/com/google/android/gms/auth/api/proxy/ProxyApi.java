package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

@KeepForSdk
public abstract interface ProxyApi
{
  @KeepForSdk
  public abstract PendingResult<SpatulaHeaderResult> getSpatulaHeader(GoogleApiClient paramGoogleApiClient);
  
  @KeepForSdk
  public abstract PendingResult<ProxyResult> performProxyRequest(GoogleApiClient paramGoogleApiClient, ProxyRequest paramProxyRequest);
  
  @KeepForSdk
  public static abstract interface ProxyResult
    extends Result
  {
    @KeepForSdk
    public abstract ProxyResponse getResponse();
  }
  
  @KeepForSdk
  public static abstract interface SpatulaHeaderResult
    extends Result
  {
    @KeepForSdk
    public abstract String getSpatulaHeader();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/proxy/ProxyApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */