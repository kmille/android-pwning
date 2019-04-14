package com.google.android.gms.auth.api;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.internal.auth.zzak;
import com.google.android.gms.internal.auth.zzar;

@KeepForSdk
public final class AuthProxy
{
  @KeepForSdk
  public static final Api<AuthProxyOptions> API = new Api("Auth.PROXY_API", zzai, zzah);
  @KeepForSdk
  public static final ProxyApi ProxyApi = new zzar();
  private static final Api.ClientKey<zzak> zzah = new Api.ClientKey();
  private static final Api.AbstractClientBuilder<zzak, AuthProxyOptions> zzai = new zza();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/AuthProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */