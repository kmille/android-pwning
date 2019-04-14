package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;

final class zzy
{
  final Messenger zzab;
  final MessengerCompat zzcj;
  
  zzy(IBinder paramIBinder)
    throws RemoteException
  {
    String str = paramIBinder.getInterfaceDescriptor();
    if ("android.os.IMessenger".equals(str))
    {
      this.zzab = new Messenger(paramIBinder);
      this.zzcj = null;
      return;
    }
    if ("com.google.android.gms.iid.IMessengerCompat".equals(str))
    {
      this.zzcj = new MessengerCompat(paramIBinder);
      this.zzab = null;
      return;
    }
    paramIBinder = String.valueOf(str);
    if (paramIBinder.length() != 0) {
      "Invalid interface descriptor: ".concat(paramIBinder);
    } else {
      new String("Invalid interface descriptor: ");
    }
    throw new RemoteException();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/iid/zzy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */