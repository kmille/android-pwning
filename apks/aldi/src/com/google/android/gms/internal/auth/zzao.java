package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

public final class zzao
  extends zza
  implements zzan
{
  zzao(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.auth.api.internal.IAuthService");
  }
  
  public final void zza(zzal paramzzal)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zzc.zza(localParcel, paramzzal);
    transactAndReadExceptionReturnVoid(3, localParcel);
  }
  
  public final void zza(zzal paramzzal, ProxyRequest paramProxyRequest)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zzc.zza(localParcel, paramzzal);
    zzc.zza(localParcel, paramProxyRequest);
    transactAndReadExceptionReturnVoid(1, localParcel);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */