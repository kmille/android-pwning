package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.GoogleApiClient;

final class zzj
  extends zzp<CredentialRequestResult>
{
  zzj(zzi paramzzi, GoogleApiClient paramGoogleApiClient, CredentialRequest paramCredentialRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected final void zzc(Context paramContext, zzw paramzzw)
    throws RemoteException
  {
    paramzzw.zzc(new zzk(this), this.zzam);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth-api/zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */