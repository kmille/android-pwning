package com.google.android.gms.auth;

import android.os.IBinder;
import android.os.RemoteException;
import java.io.IOException;

abstract interface zzj<T>
{
  public abstract T zzb(IBinder paramIBinder)
    throws RemoteException, IOException, GoogleAuthException;
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */