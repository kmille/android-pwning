package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.account.zzc;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

public final class zzr
  extends GmsClient<zzc>
{
  public zzr(Context paramContext, Looper paramLooper, ClientSettings paramClientSettings, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 120, paramClientSettings, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  public final int getMinApkVersion()
  {
    return 12451000;
  }
  
  public final String getServiceDescriptor()
  {
    return "com.google.android.gms.auth.account.IWorkAccountService";
  }
  
  public final String getStartServiceAction()
  {
    return "com.google.android.gms.auth.account.workaccount.START";
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */