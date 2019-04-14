package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zam
  extends zaa
  implements zal
{
  zam(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.common.internal.service.ICommonService");
  }
  
  public final void zaa(zaj paramzaj)
    throws RemoteException
  {
    Parcel localParcel = zaa();
    zac.zaa(localParcel, paramzaj);
    zac(1, localParcel);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/internal/service/zam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */