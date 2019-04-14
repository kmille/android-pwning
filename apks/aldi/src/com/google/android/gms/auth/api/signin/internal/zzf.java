package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public final class zzf
  implements GoogleSignInApi
{
  private static GoogleSignInOptions zzc(GoogleApiClient paramGoogleApiClient)
  {
    return ((zzg)paramGoogleApiClient.getClient(Auth.zzh)).zzg();
  }
  
  public final Intent getSignInIntent(GoogleApiClient paramGoogleApiClient)
  {
    return zzh.zzc(paramGoogleApiClient.getContext(), zzc(paramGoogleApiClient));
  }
  
  public final GoogleSignInResult getSignInResultFromIntent(Intent paramIntent)
  {
    return zzh.getSignInResultFromIntent(paramIntent);
  }
  
  public final PendingResult<Status> revokeAccess(GoogleApiClient paramGoogleApiClient)
  {
    return zzh.zzd(paramGoogleApiClient, paramGoogleApiClient.getContext(), false);
  }
  
  public final PendingResult<Status> signOut(GoogleApiClient paramGoogleApiClient)
  {
    return zzh.zzc(paramGoogleApiClient, paramGoogleApiClient.getContext(), false);
  }
  
  public final OptionalPendingResult<GoogleSignInResult> silentSignIn(GoogleApiClient paramGoogleApiClient)
  {
    return zzh.zzc(paramGoogleApiClient, paramGoogleApiClient.getContext(), zzc(paramGoogleApiClient), false);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/zzf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */