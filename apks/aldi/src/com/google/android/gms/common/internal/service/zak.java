package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.zab;

public abstract class zak
  extends zab
  implements zaj
{
  public zak()
  {
    super("com.google.android.gms.common.internal.service.ICommonCallbacks");
  }
  
  public boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      zaj(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    }
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/internal/service/zak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */