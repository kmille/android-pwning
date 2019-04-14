package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public abstract class zzv
  extends zzd
  implements zzu
{
  public zzv()
  {
    super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 3: 
      zzc((Status)zze.zzc(paramParcel1, Status.CREATOR), paramParcel1.readString());
      break;
    case 2: 
      zzc((Status)zze.zzc(paramParcel1, Status.CREATOR));
      break;
    case 1: 
      zzc((Status)zze.zzc(paramParcel1, Status.CREATOR), (Credential)zze.zzc(paramParcel1, Credential.CREATOR));
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth-api/zzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */