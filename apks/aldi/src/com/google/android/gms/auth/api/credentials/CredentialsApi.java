package com.google.android.gms.auth.api.credentials;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public abstract interface CredentialsApi
{
  public static final int ACTIVITY_RESULT_ADD_ACCOUNT = 1000;
  public static final int ACTIVITY_RESULT_NO_HINTS_AVAILABLE = 1002;
  public static final int ACTIVITY_RESULT_OTHER_ACCOUNT = 1001;
  public static final int CREDENTIAL_PICKER_REQUEST_CODE = 2000;
  
  public abstract PendingResult<Status> delete(GoogleApiClient paramGoogleApiClient, Credential paramCredential);
  
  public abstract PendingResult<Status> disableAutoSignIn(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingIntent getHintPickerIntent(GoogleApiClient paramGoogleApiClient, HintRequest paramHintRequest);
  
  public abstract PendingResult<CredentialRequestResult> request(GoogleApiClient paramGoogleApiClient, CredentialRequest paramCredentialRequest);
  
  public abstract PendingResult<Status> save(GoogleApiClient paramGoogleApiClient, Credential paramCredential);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/credentials/CredentialsApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */