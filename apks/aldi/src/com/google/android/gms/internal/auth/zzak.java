package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.auth.api.AuthProxyOptions;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import java.util.Set;

public final class zzak
  extends GmsClient<zzan>
{
  private final Bundle zzbv;
  
  public zzak(Context paramContext, Looper paramLooper, ClientSettings paramClientSettings, AuthProxyOptions paramAuthProxyOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 16, paramClientSettings, paramConnectionCallbacks, paramOnConnectionFailedListener);
    if (paramAuthProxyOptions == null)
    {
      this.zzbv = new Bundle();
      return;
    }
    throw new NoSuchMethodError();
  }
  
  public final Bundle getGetServiceRequestExtraArgs()
  {
    return this.zzbv;
  }
  
  public final int getMinApkVersion()
  {
    return 12451000;
  }
  
  public final String getServiceDescriptor()
  {
    return "com.google.android.gms.auth.api.internal.IAuthService";
  }
  
  public final String getStartServiceAction()
  {
    return "com.google.android.gms.auth.service.START";
  }
  
  public final boolean requiresSignIn()
  {
    ClientSettings localClientSettings = getClientSettings();
    return (!TextUtils.isEmpty(localClientSettings.getAccountName())) && (!localClientSettings.getApplicableScopes(AuthProxy.API).isEmpty());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */