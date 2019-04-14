package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

final class zzl
  extends zzp<Status>
{
  zzl(zzi paramzzi, GoogleApiClient paramGoogleApiClient, Credential paramCredential)
  {
    super(paramGoogleApiClient);
  }
  
  protected final void zzc(Context paramContext, zzw paramzzw)
    throws RemoteException
  {
    paramzzw.zzc(new zzo(this), new zzy(this.zzao));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth-api/zzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */