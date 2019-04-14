package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zze
  extends com.google.android.gms.internal.auth.zza
  implements zzc
{
  zze(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.auth.account.IWorkAccountService");
  }
  
  public final void zza(zza paramzza, Account paramAccount)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    com.google.android.gms.internal.auth.zzc.zza(localParcel, paramzza);
    com.google.android.gms.internal.auth.zzc.zza(localParcel, paramAccount);
    transactAndReadExceptionReturnVoid(3, localParcel);
  }
  
  public final void zza(zza paramzza, String paramString)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    com.google.android.gms.internal.auth.zzc.zza(localParcel, paramzza);
    localParcel.writeString(paramString);
    transactAndReadExceptionReturnVoid(2, localParcel);
  }
  
  public final void zzb(boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    com.google.android.gms.internal.auth.zzc.writeBoolean(localParcel, paramBoolean);
    transactAndReadExceptionReturnVoid(1, localParcel);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/account/zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */