package com.google.android.gms.internal.gcm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zzd
  implements IInterface
{
  private final IBinder zzd;
  private final String zze;
  
  protected zzd(IBinder paramIBinder, String paramString)
  {
    this.zzd = paramIBinder;
    this.zze = paramString;
  }
  
  public IBinder asBinder()
  {
    return this.zzd;
  }
  
  protected final Parcel obtainAndWriteInterfaceToken()
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.writeInterfaceToken(this.zze);
    return localParcel;
  }
  
  protected final void transactAndReadExceptionReturnVoid(int paramInt, Parcel paramParcel)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      this.zzd.transact(2, paramParcel, localParcel, 0);
      localParcel.readException();
      return;
    }
    finally
    {
      paramParcel.recycle();
      localParcel.recycle();
    }
  }
  
  protected final void transactOneway(int paramInt, Parcel paramParcel)
    throws RemoteException
  {
    try
    {
      this.zzd.transact(1, paramParcel, null, 1);
      return;
    }
    finally
    {
      paramParcel.recycle();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/gcm/zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */