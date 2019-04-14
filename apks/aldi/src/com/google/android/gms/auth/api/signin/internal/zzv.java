package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.auth-api.zzc;
import com.google.android.gms.internal.auth-api.zze;

public final class zzv
  extends zzc
  implements zzu
{
  zzv(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
  }
  
  public final void zzc(zzs paramzzs, GoogleSignInOptions paramGoogleSignInOptions)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zze.zzc(localParcel, paramzzs);
    zze.zzc(localParcel, paramGoogleSignInOptions);
    transactAndReadExceptionReturnVoid(101, localParcel);
  }
  
  public final void zzd(zzs paramzzs, GoogleSignInOptions paramGoogleSignInOptions)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zze.zzc(localParcel, paramzzs);
    zze.zzc(localParcel, paramGoogleSignInOptions);
    transactAndReadExceptionReturnVoid(102, localParcel);
  }
  
  public final void zze(zzs paramzzs, GoogleSignInOptions paramGoogleSignInOptions)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zze.zzc(localParcel, paramzzs);
    zze.zzc(localParcel, paramGoogleSignInOptions);
    transactAndReadExceptionReturnVoid(103, localParcel);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/zzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */