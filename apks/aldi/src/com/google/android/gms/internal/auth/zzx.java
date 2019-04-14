package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.auth.api.accounttransfer.zzt;
import com.google.android.gms.common.api.Status;

public abstract interface zzx
  extends IInterface
{
  public abstract void onFailure(Status paramStatus)
    throws RemoteException;
  
  public abstract void zza(DeviceMetaData paramDeviceMetaData)
    throws RemoteException;
  
  public abstract void zza(Status paramStatus, zzl paramzzl)
    throws RemoteException;
  
  public abstract void zza(Status paramStatus, zzt paramzzt)
    throws RemoteException;
  
  public abstract void zza(byte[] paramArrayOfByte)
    throws RemoteException;
  
  public abstract void zzb(Status paramStatus)
    throws RemoteException;
  
  public abstract void zzd()
    throws RemoteException;
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */