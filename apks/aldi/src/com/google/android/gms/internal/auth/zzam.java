package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

public abstract class zzam
  extends zzb
  implements zzal
{
  public zzam()
  {
    super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 2: 
      zzb(paramParcel1.readString());
      break;
    case 1: 
      zza((ProxyResponse)zzc.zza(paramParcel1, ProxyResponse.CREATOR));
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */