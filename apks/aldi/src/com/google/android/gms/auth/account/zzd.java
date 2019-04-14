package com.google.android.gms.auth.account;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.auth.zzb;

public abstract class zzd
  extends zzb
  implements zzc
{
  public static zzc zzc(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
    if ((localIInterface instanceof zzc)) {
      return (zzc)localIInterface;
    }
    return new zze(paramIBinder);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/account/zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */