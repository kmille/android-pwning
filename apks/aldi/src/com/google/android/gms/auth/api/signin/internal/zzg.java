package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import java.util.Iterator;
import java.util.Set;

public final class zzg
  extends GmsClient<zzu>
{
  private final GoogleSignInOptions zzbi;
  
  public zzg(Context paramContext, Looper paramLooper, ClientSettings paramClientSettings, GoogleSignInOptions paramGoogleSignInOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 91, paramClientSettings, paramConnectionCallbacks, paramOnConnectionFailedListener);
    if (paramGoogleSignInOptions == null) {
      paramGoogleSignInOptions = new GoogleSignInOptions.Builder().build();
    }
    paramContext = paramGoogleSignInOptions;
    if (!paramClientSettings.getAllRequestedScopes().isEmpty())
    {
      paramContext = new GoogleSignInOptions.Builder(paramGoogleSignInOptions);
      paramLooper = paramClientSettings.getAllRequestedScopes().iterator();
      while (paramLooper.hasNext()) {
        paramContext.requestScopes((Scope)paramLooper.next(), new Scope[0]);
      }
      paramContext = paramContext.build();
    }
    this.zzbi = paramContext;
  }
  
  public final int getMinApkVersion()
  {
    return 12451000;
  }
  
  public final String getServiceDescriptor()
  {
    return "com.google.android.gms.auth.api.signin.internal.ISignInService";
  }
  
  public final Intent getSignInIntent()
  {
    return zzh.zzc(getContext(), this.zzbi);
  }
  
  public final String getStartServiceAction()
  {
    return "com.google.android.gms.auth.api.signin.service.START";
  }
  
  public final boolean providesSignIn()
  {
    return true;
  }
  
  public final GoogleSignInOptions zzg()
  {
    return this.zzbi;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */