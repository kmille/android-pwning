package com.google.android.gms.internal.auth-api-phone;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class zzh
  extends zzb
  implements zzg
{
  public zzh()
  {
    super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      zza((Status)zzc.zza(paramParcel1, Status.CREATOR));
      return true;
    }
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth-api-phone/zzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */