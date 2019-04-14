package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;

public final class zzw
  extends zzr
{
  private final Context mContext;
  
  public zzw(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  private final void zzl()
  {
    if (GooglePlayServicesUtil.isGooglePlayServicesUid(this.mContext, Binder.getCallingUid())) {
      return;
    }
    int i = Binder.getCallingUid();
    StringBuilder localStringBuilder = new StringBuilder(52);
    localStringBuilder.append("Calling UID ");
    localStringBuilder.append(i);
    localStringBuilder.append(" is not Google Play services.");
    throw new SecurityException(localStringBuilder.toString());
  }
  
  public final void zzj()
  {
    zzl();
    Storage localStorage = Storage.getInstance(this.mContext);
    GoogleSignInAccount localGoogleSignInAccount = localStorage.getSavedDefaultGoogleSignInAccount();
    Object localObject1 = GoogleSignInOptions.DEFAULT_SIGN_IN;
    if (localGoogleSignInAccount != null) {
      localObject1 = localStorage.getSavedDefaultGoogleSignInOptions();
    }
    localObject1 = new GoogleApiClient.Builder(this.mContext).addApi(Auth.GOOGLE_SIGN_IN_API, (Api.ApiOptions.HasOptions)localObject1).build();
    try
    {
      if (((GoogleApiClient)localObject1).blockingConnect().isSuccess()) {
        if (localGoogleSignInAccount != null) {
          Auth.GoogleSignInApi.revokeAccess((GoogleApiClient)localObject1);
        } else {
          ((GoogleApiClient)localObject1).clearDefaultAccountAndReconnect();
        }
      }
      return;
    }
    finally
    {
      ((GoogleApiClient)localObject1).disconnect();
    }
  }
  
  public final void zzk()
  {
    zzl();
    zzp.zzd(this.mContext).clear();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/zzw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */