package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.util.Log;
import com.google.android.gms.analytics.Logger;
import com.google.android.gms.common.util.VisibleForTesting;

@Deprecated
@VisibleForTesting
public final class zzcl
{
  private static volatile Logger zzaat = new zzbv();
  
  @VisibleForTesting
  public static Logger getLogger()
  {
    return zzaat;
  }
  
  private static boolean isLoggable(int paramInt)
  {
    return (zzaat != null) && (zzaat.getLogLevel() <= paramInt);
  }
  
  @VisibleForTesting
  public static void setLogger(Logger paramLogger)
  {
    zzaat = paramLogger;
  }
  
  @SuppressLint({"LogTagMismatch"})
  public static void v(String paramString)
  {
    Object localObject = zzcm.zzet();
    if (localObject != null) {
      ((zzaq)localObject).zzq(paramString);
    } else if (isLoggable(0)) {
      zzcc.zzyl.get();
    }
    localObject = zzaat;
    if (localObject != null) {
      ((Logger)localObject).verbose(paramString);
    }
  }
  
  @SuppressLint({"LogTagMismatch"})
  public static void zzab(String paramString)
  {
    Object localObject = zzcm.zzet();
    if (localObject != null) {
      ((zzaq)localObject).zzt(paramString);
    } else if (isLoggable(2)) {
      zzcc.zzyl.get();
    }
    localObject = zzaat;
    if (localObject != null) {
      ((Logger)localObject).warn(paramString);
    }
  }
  
  @SuppressLint({"LogTagMismatch"})
  public static void zzf(String paramString, Object paramObject)
  {
    Object localObject = zzcm.zzet();
    if (localObject != null)
    {
      ((zzaq)localObject).zze(paramString, paramObject);
    }
    else if (isLoggable(3))
    {
      if (paramObject != null)
      {
        paramObject = String.valueOf(paramObject);
        localObject = new StringBuilder(String.valueOf(paramString).length() + 1 + String.valueOf(paramObject).length());
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append(":");
        ((StringBuilder)localObject).append((String)paramObject);
        paramObject = ((StringBuilder)localObject).toString();
      }
      else
      {
        paramObject = paramString;
      }
      Log.e((String)zzcc.zzyl.get(), (String)paramObject);
    }
    paramObject = zzaat;
    if (paramObject != null) {
      ((Logger)paramObject).error(paramString);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzcl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */