package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.GoogleApiAvailabilityLight;

public final class zzas
{
  public static final String VERSION = String.valueOf(GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
  public static final String zzvo;
  
  static
  {
    String str = String.valueOf(VERSION);
    if (str.length() != 0) {
      str = "ma".concat(str);
    } else {
      str = new String("ma");
    }
    zzvo = str;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */