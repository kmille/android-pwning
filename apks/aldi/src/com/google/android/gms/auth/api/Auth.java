package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzf;
import com.google.android.gms.auth.api.signin.internal.zzg;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.internal.auth-api.zzi;
import com.google.android.gms.internal.auth-api.zzr;

public final class Auth
{
  public static final Api<AuthCredentialsOptions> CREDENTIALS_API;
  public static final CredentialsApi CredentialsApi = new zzi();
  public static final Api<GoogleSignInOptions> GOOGLE_SIGN_IN_API;
  public static final GoogleSignInApi GoogleSignInApi = new zzf();
  @Deprecated
  @KeepForSdk
  public static final Api<AuthProxyOptions> PROXY_API;
  @Deprecated
  @KeepForSdk
  public static final ProxyApi ProxyApi;
  public static final Api.ClientKey<zzr> zzg = new Api.ClientKey();
  public static final Api.ClientKey<zzg> zzh = new Api.ClientKey();
  private static final Api.AbstractClientBuilder<zzr, AuthCredentialsOptions> zzi = new zzc();
  private static final Api.AbstractClientBuilder<zzg, GoogleSignInOptions> zzj = new zzd();
  
  static
  {
    PROXY_API = AuthProxy.API;
    CREDENTIALS_API = new Api("Auth.CREDENTIALS_API", zzi, zzg);
    GOOGLE_SIGN_IN_API = new Api("Auth.GOOGLE_SIGN_IN_API", zzj, zzh);
    ProxyApi = AuthProxy.ProxyApi;
  }
  
  @Deprecated
  public static class AuthCredentialsOptions
    implements Api.ApiOptions.Optional
  {
    private static final AuthCredentialsOptions zzk = new Builder().zzc();
    private final String zzl = null;
    private final boolean zzm;
    
    public AuthCredentialsOptions(Builder paramBuilder)
    {
      this.zzm = paramBuilder.zzn.booleanValue();
    }
    
    public final Bundle toBundle()
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("consumer_package", null);
      localBundle.putBoolean("force_save_dialog", this.zzm);
      return localBundle;
    }
    
    @Deprecated
    public static class Builder
    {
      protected Boolean zzn = Boolean.FALSE;
      
      public Builder forceEnableSaveDialog()
      {
        this.zzn = Boolean.TRUE;
        return this;
      }
      
      public Auth.AuthCredentialsOptions zzc()
      {
        return new Auth.AuthCredentialsOptions(this);
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/Auth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */