package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.ClientKey;

public final class Common
{
  @KeepForSdk
  public static final Api<Api.ApiOptions.NoOptions> API = new Api("Common.API", zapg, CLIENT_KEY);
  @KeepForSdk
  public static final Api.ClientKey<zai> CLIENT_KEY = new Api.ClientKey();
  private static final Api.AbstractClientBuilder<zai, Api.ApiOptions.NoOptions> zapg = new zab();
  public static final zac zaph = new zad();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/internal/service/Common.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */