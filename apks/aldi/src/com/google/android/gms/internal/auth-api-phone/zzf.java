package com.google.android.gms.internal.auth-api-phone;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzf
  extends zza
  implements zze
{
  zzf(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
  }
  
  public final void zza(zzg paramzzg)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zzc.zza(localParcel, paramzzg);
    transactAndReadExceptionReturnVoid(1, localParcel);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth-api-phone/zzf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */