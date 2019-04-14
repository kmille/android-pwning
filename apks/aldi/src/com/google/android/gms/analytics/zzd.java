package com.google.android.gms.analytics;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzcl;

@VisibleForTesting
public final class zzd
{
  private static String zza(String paramString, int paramInt)
  {
    if (paramInt <= 0)
    {
      zzcl.zzf("index out of range for prefix", paramString);
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 11);
    localStringBuilder.append(paramString);
    localStringBuilder.append(paramInt);
    return localStringBuilder.toString();
  }
  
  public static String zzb(int paramInt)
  {
    return zza("&cd", paramInt);
  }
  
  public static String zzc(int paramInt)
  {
    return zza("cd", paramInt);
  }
  
  public static String zzd(int paramInt)
  {
    return zza("&cm", paramInt);
  }
  
  public static String zze(int paramInt)
  {
    return zza("cm", paramInt);
  }
  
  public static String zzf(int paramInt)
  {
    return zza("&pr", paramInt);
  }
  
  public static String zzg(int paramInt)
  {
    return zza("pr", paramInt);
  }
  
  public static String zzh(int paramInt)
  {
    return zza("&promo", paramInt);
  }
  
  public static String zzi(int paramInt)
  {
    return zza("promo", paramInt);
  }
  
  public static String zzj(int paramInt)
  {
    return zza("pi", paramInt);
  }
  
  public static String zzk(int paramInt)
  {
    return zza("&il", paramInt);
  }
  
  public static String zzl(int paramInt)
  {
    return zza("il", paramInt);
  }
  
  public static String zzm(int paramInt)
  {
    return zza("cd", paramInt);
  }
  
  public static String zzn(int paramInt)
  {
    return zza("cm", paramInt);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/analytics/zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */