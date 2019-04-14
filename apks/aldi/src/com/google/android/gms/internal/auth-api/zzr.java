package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.google.android.gms.auth.api.Auth.AuthCredentialsOptions;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

public final class zzr
  extends GmsClient<zzw>
{
  @Nullable
  private final Auth.AuthCredentialsOptions zzaq;
  
  public zzr(Context paramContext, Looper paramLooper, ClientSettings paramClientSettings, Auth.AuthCredentialsOptions paramAuthCredentialsOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 68, paramClientSettings, paramConnectionCallbacks, paramOnConnectionFailedListener);
    this.zzaq = paramAuthCredentialsOptions;
  }
  
  public final Bundle getGetServiceRequestExtraArgs()
  {
    if (this.zzaq == null) {
      return new Bundle();
    }
    return this.zzaq.toBundle();
  }
  
  public final int getMinApkVersion()
  {
    return 12800000;
  }
  
  public final String getServiceDescriptor()
  {
    return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
  }
  
  public final String getStartServiceAction()
  {
    return "com.google.android.gms.auth.api.credentials.service.START";
  }
  
  final Auth.AuthCredentialsOptions zzd()
  {
    return this.zzaq;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth-api/zzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */