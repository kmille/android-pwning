package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gcm.zzd;

public final class zzh
  extends zzd
  implements zzg
{
  zzh(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.gcm.INetworkTaskCallback");
  }
  
  public final void zzf(int paramInt)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    localParcel.writeInt(paramInt);
    transactAndReadExceptionReturnVoid(2, localParcel);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/gcm/zzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */