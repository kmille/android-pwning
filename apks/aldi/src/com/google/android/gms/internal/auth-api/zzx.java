package com.google.android.gms.internal.auth-api;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

public final class zzx
  extends zzc
  implements zzw
{
  zzx(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
  }
  
  public final void zzc(zzu paramzzu)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zze.zzc(localParcel, paramzzu);
    transactAndReadExceptionReturnVoid(4, localParcel);
  }
  
  public final void zzc(zzu paramzzu, CredentialRequest paramCredentialRequest)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zze.zzc(localParcel, paramzzu);
    zze.zzc(localParcel, paramCredentialRequest);
    transactAndReadExceptionReturnVoid(1, localParcel);
  }
  
  public final void zzc(zzu paramzzu, zzs paramzzs)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zze.zzc(localParcel, paramzzu);
    zze.zzc(localParcel, paramzzs);
    transactAndReadExceptionReturnVoid(3, localParcel);
  }
  
  public final void zzc(zzu paramzzu, zzy paramzzy)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zze.zzc(localParcel, paramzzu);
    zze.zzc(localParcel, paramzzy);
    transactAndReadExceptionReturnVoid(2, localParcel);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth-api/zzx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */