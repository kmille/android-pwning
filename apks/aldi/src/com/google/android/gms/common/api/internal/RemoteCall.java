package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public abstract interface RemoteCall<T, U>
{
  @KeepForSdk
  public abstract void accept(T paramT, U paramU)
    throws RemoteException;
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/RemoteCall.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */