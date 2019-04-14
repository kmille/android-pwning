package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth-api.zzd;
import com.google.android.gms.internal.auth-api.zze;

public abstract class zzt
  extends zzd
  implements zzs
{
  public zzt()
  {
    super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
  }
  
  public final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 103: 
      zzf((Status)zze.zzc(paramParcel1, Status.CREATOR));
      break;
    case 102: 
      zze((Status)zze.zzc(paramParcel1, Status.CREATOR));
      break;
    case 101: 
      zzc((GoogleSignInAccount)zze.zzc(paramParcel1, GoogleSignInAccount.CREATOR), (Status)zze.zzc(paramParcel1, Status.CREATOR));
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/zzt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */