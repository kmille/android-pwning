package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.Status;

public final class zzh
  implements CredentialRequestResult
{
  private final Status mStatus;
  private final Credential zzal;
  
  public zzh(Status paramStatus, Credential paramCredential)
  {
    this.mStatus = paramStatus;
    this.zzal = paramCredential;
  }
  
  public static zzh zzd(Status paramStatus)
  {
    return new zzh(paramStatus, null);
  }
  
  public final Credential getCredential()
  {
    return this.zzal;
  }
  
  public final Status getStatus()
  {
    return this.mStatus;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth-api/zzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */