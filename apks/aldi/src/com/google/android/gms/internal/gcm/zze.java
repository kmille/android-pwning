package com.google.android.gms.internal.gcm;

import android.os.Parcel;
import android.os.Parcelable;

public class zze
{
  private static final ClassLoader zzf = zze.class.getClassLoader();
  
  public static void zzd(Parcel paramParcel, Parcelable paramParcelable)
  {
    if (paramParcelable == null)
    {
      paramParcel.writeInt(0);
      return;
    }
    paramParcel.writeInt(1);
    paramParcelable.writeToParcel(paramParcel, 0);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/gcm/zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */