package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gcm.zzd;
import com.google.android.gms.internal.gcm.zze;

public final class zzm
  extends zzd
  implements zzl
{
  zzm(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.iid.IMessengerCompat");
  }
  
  public final void send(Message paramMessage)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zze.zzd(localParcel, paramMessage);
    transactOneway(1, localParcel);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/iid/zzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */