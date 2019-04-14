package com.google.android.gms.common;

import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
class zzm
{
  private static final zzm zzab = new zzm(true, null, null);
  private final Throwable cause;
  final boolean zzac;
  private final String zzad;
  
  zzm(boolean paramBoolean, @Nullable String paramString, @Nullable Throwable paramThrowable)
  {
    this.zzac = paramBoolean;
    this.zzad = paramString;
    this.cause = paramThrowable;
  }
  
  static zzm zza(@NonNull String paramString, @NonNull Throwable paramThrowable)
  {
    return new zzm(false, paramString, paramThrowable);
  }
  
  static zzm zza(Callable<String> paramCallable)
  {
    return new zzo(paramCallable, null);
  }
  
  static String zza(String paramString, zze paramzze, boolean paramBoolean1, boolean paramBoolean2)
  {
    String str;
    if (paramBoolean2) {
      str = "debug cert rejected";
    } else {
      str = "not whitelisted";
    }
    return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[] { str, paramString, Hex.zza(AndroidUtilsLight.zzi("SHA-1").digest(paramzze.getBytes())), Boolean.valueOf(paramBoolean1), "12451009.false" });
  }
  
  static zzm zzb(@NonNull String paramString)
  {
    return new zzm(false, paramString, null);
  }
  
  static zzm zze()
  {
    return zzab;
  }
  
  @Nullable
  String getErrorMessage()
  {
    return this.zzad;
  }
  
  final void zzf()
  {
    if ((!this.zzac) && (Log.isLoggable("GoogleCertificatesRslt", 3)))
    {
      if (this.cause != null)
      {
        getErrorMessage();
        return;
      }
      getErrorMessage();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/zzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */