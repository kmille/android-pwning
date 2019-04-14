package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzaa
  extends zza
  implements zzz
{
  zzaa(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
  }
  
  public final void zza(zzx paramzzx, zzab paramzzab)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zzc.zza(localParcel, paramzzx);
    zzc.zza(localParcel, paramzzab);
    transactAndReadExceptionReturnVoid(9, localParcel);
  }
  
  public final void zza(zzx paramzzx, zzad paramzzad)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zzc.zza(localParcel, paramzzx);
    zzc.zza(localParcel, paramzzad);
    transactAndReadExceptionReturnVoid(6, localParcel);
  }
  
  public final void zza(zzx paramzzx, zzaf paramzzaf)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zzc.zza(localParcel, paramzzx);
    zzc.zza(localParcel, paramzzaf);
    transactAndReadExceptionReturnVoid(5, localParcel);
  }
  
  public final void zza(zzx paramzzx, zzah paramzzah)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zzc.zza(localParcel, paramzzx);
    zzc.zza(localParcel, paramzzah);
    transactAndReadExceptionReturnVoid(8, localParcel);
  }
  
  public final void zza(zzx paramzzx, zzv paramzzv)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zzc.zza(localParcel, paramzzx);
    zzc.zza(localParcel, paramzzv);
    transactAndReadExceptionReturnVoid(7, localParcel);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */