package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

public abstract class zzn
  extends zzb
  implements zzm
{
  public static zzm zzc(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
    if ((localIInterface instanceof zzm)) {
      return (zzm)localIInterface;
    }
    return new zzo(paramIBinder);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/internal/zzn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */