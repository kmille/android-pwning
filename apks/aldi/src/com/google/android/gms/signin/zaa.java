package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.signin.internal.SignInClientImpl;

public final class zaa
{
  public static final Api<SignInOptions> API = new Api("SignIn.API", zapg, CLIENT_KEY);
  private static final Api.ClientKey<SignInClientImpl> CLIENT_KEY = new Api.ClientKey();
  public static final Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> zapg;
  private static final Scope zar;
  @ShowFirstParty
  private static final Api.ClientKey<SignInClientImpl> zarp = new Api.ClientKey();
  private static final Api.AbstractClientBuilder<SignInClientImpl, Object> zarq;
  private static final Api<Object> zarr = new Api("SignIn.INTERNAL_API", zarq, zarp);
  private static final Scope zas;
  
  static
  {
    zapg = new zab();
    zarq = new zac();
    zar = new Scope("profile");
    zas = new Scope("email");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/signin/zaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */