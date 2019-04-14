package com.google.android.gms.common.logging;

import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;

@KeepForSdk
public class Logger
{
  private final String mTag;
  private final String zzei;
  private final GmsLogger zzew;
  private final int zzex;
  
  private Logger(String paramString1, String paramString2)
  {
    this.zzei = paramString2;
    this.mTag = paramString1;
    this.zzew = new GmsLogger(paramString1);
    int i = 2;
    while ((7 >= i) && (!Log.isLoggable(this.mTag, i))) {
      i += 1;
    }
    this.zzex = i;
  }
  
  @KeepForSdk
  public Logger(String paramString, String... paramVarArgs)
  {
    this(paramString, paramVarArgs);
  }
  
  private final String format(String paramString, @Nullable Object... paramVarArgs)
  {
    String str = paramString;
    if (paramVarArgs != null)
    {
      str = paramString;
      if (paramVarArgs.length > 0) {
        str = String.format(Locale.US, paramString, paramVarArgs);
      }
    }
    return this.zzei.concat(str);
  }
  
  @KeepForSdk
  public void d(String paramString, @Nullable Object... paramVarArgs)
  {
    if (isLoggable(3)) {
      format(paramString, paramVarArgs);
    }
  }
  
  @KeepForSdk
  public void e(String paramString, Throwable paramThrowable, @Nullable Object... paramVarArgs)
  {
    Log.e(this.mTag, format(paramString, paramVarArgs), paramThrowable);
  }
  
  @KeepForSdk
  public void e(String paramString, @Nullable Object... paramVarArgs)
  {
    Log.e(this.mTag, format(paramString, paramVarArgs));
  }
  
  @KeepForSdk
  public void i(String paramString, @Nullable Object... paramVarArgs)
  {
    format(paramString, paramVarArgs);
  }
  
  @KeepForSdk
  public boolean isLoggable(int paramInt)
  {
    return this.zzex <= paramInt;
  }
  
  @KeepForSdk
  public void v(String paramString, @Nullable Object... paramVarArgs)
  {
    if (isLoggable(2)) {
      format(paramString, paramVarArgs);
    }
  }
  
  @KeepForSdk
  public void w(String paramString, @Nullable Object... paramVarArgs)
  {
    format(paramString, paramVarArgs);
  }
  
  @KeepForSdk
  public void wtf(String paramString, Throwable paramThrowable, @Nullable Object... paramVarArgs)
  {
    Log.wtf(this.mTag, format(paramString, paramVarArgs), paramThrowable);
  }
  
  @KeepForSdk
  public void wtf(Throwable paramThrowable)
  {
    Log.wtf(this.mTag, paramThrowable);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/logging/Logger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */