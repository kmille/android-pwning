package com.google.android.gms.common.internal;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class GmsLogger
{
  private static final int zzef = 15;
  private static final String zzeg;
  private final String zzeh;
  private final String zzei;
  
  public GmsLogger(String paramString)
  {
    this(paramString, null);
  }
  
  public GmsLogger(String paramString1, String paramString2)
  {
    Preconditions.checkNotNull(paramString1, "log tag cannot be null");
    boolean bool;
    if (paramString1.length() <= 23) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "tag \"%s\" is longer than the %d character maximum", new Object[] { paramString1, Integer.valueOf(23) });
    this.zzeh = paramString1;
    if ((paramString2 != null) && (paramString2.length() > 0))
    {
      this.zzei = paramString2;
      return;
    }
    this.zzei = null;
  }
  
  private final String zza(String paramString, Object... paramVarArgs)
  {
    paramString = String.format(paramString, paramVarArgs);
    if (this.zzei == null) {
      return paramString;
    }
    return this.zzei.concat(paramString);
  }
  
  private final String zzh(String paramString)
  {
    if (this.zzei == null) {
      return paramString;
    }
    return this.zzei.concat(paramString);
  }
  
  @KeepForSdk
  public final boolean canLog(int paramInt)
  {
    return Log.isLoggable(this.zzeh, paramInt);
  }
  
  @KeepForSdk
  public final boolean canLogPii()
  {
    return false;
  }
  
  @KeepForSdk
  public final void d(String paramString1, String paramString2)
  {
    if (canLog(3)) {
      zzh(paramString2);
    }
  }
  
  @KeepForSdk
  public final void d(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (canLog(3)) {
      zzh(paramString2);
    }
  }
  
  @KeepForSdk
  public final void e(String paramString1, String paramString2)
  {
    if (canLog(6)) {
      Log.e(paramString1, zzh(paramString2));
    }
  }
  
  @KeepForSdk
  public final void e(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (canLog(6)) {
      Log.e(paramString1, zzh(paramString2), paramThrowable);
    }
  }
  
  @KeepForSdk
  public final void efmt(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (canLog(6)) {
      Log.e(paramString1, zza(paramString2, paramVarArgs));
    }
  }
  
  @KeepForSdk
  public final void i(String paramString1, String paramString2)
  {
    if (canLog(4)) {
      zzh(paramString2);
    }
  }
  
  @KeepForSdk
  public final void i(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (canLog(4)) {
      zzh(paramString2);
    }
  }
  
  @KeepForSdk
  public final void pii(String paramString1, String paramString2)
  {
    if (canLogPii())
    {
      paramString1 = String.valueOf(paramString1);
      String str = String.valueOf(" PII_LOG");
      if (str.length() != 0) {
        paramString1.concat(str);
      } else {
        new String(paramString1);
      }
      zzh(paramString2);
    }
  }
  
  @KeepForSdk
  public final void pii(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (canLogPii())
    {
      paramString1 = String.valueOf(paramString1);
      paramThrowable = String.valueOf(" PII_LOG");
      if (paramThrowable.length() != 0) {
        paramString1.concat(paramThrowable);
      } else {
        new String(paramString1);
      }
      zzh(paramString2);
    }
  }
  
  @KeepForSdk
  public final void v(String paramString1, String paramString2)
  {
    if (canLog(2)) {
      zzh(paramString2);
    }
  }
  
  @KeepForSdk
  public final void v(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (canLog(2)) {
      zzh(paramString2);
    }
  }
  
  @KeepForSdk
  public final void w(String paramString1, String paramString2)
  {
    if (canLog(5)) {
      zzh(paramString2);
    }
  }
  
  @KeepForSdk
  public final void w(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (canLog(5)) {
      zzh(paramString2);
    }
  }
  
  @KeepForSdk
  public final void wfmt(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (canLog(5)) {
      zza(paramString2, paramVarArgs);
    }
  }
  
  @KeepForSdk
  public final void wtf(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (canLog(7))
    {
      Log.e(paramString1, zzh(paramString2), paramThrowable);
      Log.wtf(paramString1, zzh(paramString2), paramThrowable);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/internal/GmsLogger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */