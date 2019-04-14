package com.google.android.gms.internal.auth-api;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.Auth.AuthCredentialsOptions;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

public final class zzi
  implements CredentialsApi
{
  public final PendingResult<Status> delete(GoogleApiClient paramGoogleApiClient, Credential paramCredential)
  {
    Preconditions.checkNotNull(paramGoogleApiClient, "client must not be null");
    Preconditions.checkNotNull(paramCredential, "credential must not be null");
    return paramGoogleApiClient.execute(new zzm(this, paramGoogleApiClient, paramCredential));
  }
  
  public final PendingResult<Status> disableAutoSignIn(GoogleApiClient paramGoogleApiClient)
  {
    Preconditions.checkNotNull(paramGoogleApiClient, "client must not be null");
    return paramGoogleApiClient.execute(new zzn(this, paramGoogleApiClient));
  }
  
  public final PendingIntent getHintPickerIntent(GoogleApiClient paramGoogleApiClient, HintRequest paramHintRequest)
  {
    Preconditions.checkNotNull(paramGoogleApiClient, "client must not be null");
    Preconditions.checkNotNull(paramHintRequest, "request must not be null");
    Auth.AuthCredentialsOptions localAuthCredentialsOptions = ((zzr)paramGoogleApiClient.getClient(Auth.zzg)).zzd();
    return zzq.zzc(paramGoogleApiClient.getContext(), localAuthCredentialsOptions, paramHintRequest);
  }
  
  public final PendingResult<CredentialRequestResult> request(GoogleApiClient paramGoogleApiClient, CredentialRequest paramCredentialRequest)
  {
    Preconditions.checkNotNull(paramGoogleApiClient, "client must not be null");
    Preconditions.checkNotNull(paramCredentialRequest, "request must not be null");
    return paramGoogleApiClient.enqueue(new zzj(this, paramGoogleApiClient, paramCredentialRequest));
  }
  
  public final PendingResult<Status> save(GoogleApiClient paramGoogleApiClient, Credential paramCredential)
  {
    Preconditions.checkNotNull(paramGoogleApiClient, "client must not be null");
    Preconditions.checkNotNull(paramCredential, "credential must not be null");
    return paramGoogleApiClient.execute(new zzl(this, paramGoogleApiClient, paramCredential));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth-api/zzi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */