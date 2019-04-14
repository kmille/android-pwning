package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

final class zzau
  extends zzaq
{
  zzau(zzar paramzzar, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected final void zza(Context paramContext, zzan paramzzan)
    throws RemoteException
  {
    paramzzan.zza(new zzav(this));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzau.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */