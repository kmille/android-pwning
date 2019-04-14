package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.common.api.Response;

public class CredentialRequestResponse
  extends Response<CredentialRequestResult>
{
  public Credential getCredential()
  {
    return ((CredentialRequestResult)getResult()).getCredential();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/credentials/CredentialRequestResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */