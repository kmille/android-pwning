package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.auth.api.accounttransfer.zzt;
import com.google.android.gms.common.api.Status;

public abstract class zzy
  extends zzb
  implements zzx
{
  public zzy()
  {
    super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 7: 
      zza((DeviceMetaData)zzc.zza(paramParcel1, DeviceMetaData.CREATOR));
      break;
    case 6: 
      zza(paramParcel1.createByteArray());
      break;
    case 5: 
      onFailure((Status)zzc.zza(paramParcel1, Status.CREATOR));
      break;
    case 4: 
      zzd();
      break;
    case 3: 
      zza((Status)zzc.zza(paramParcel1, Status.CREATOR), (zzl)zzc.zza(paramParcel1, zzl.CREATOR));
      break;
    case 2: 
      zza((Status)zzc.zza(paramParcel1, Status.CREATOR), (zzt)zzc.zza(paramParcel1, zzt.CREATOR));
      break;
    case 1: 
      zzb((Status)zzc.zza(paramParcel1, Status.CREATOR));
    }
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */