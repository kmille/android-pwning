package com.google.android.gms.analytics;

import com.google.android.gms.common.util.VisibleForTesting;

@Deprecated
@VisibleForTesting
public abstract interface Logger
{
  @Deprecated
  public abstract void error(Exception paramException);
  
  @Deprecated
  public abstract void error(String paramString);
  
  @Deprecated
  public abstract int getLogLevel();
  
  @Deprecated
  public abstract void info(String paramString);
  
  @Deprecated
  public abstract void setLogLevel(int paramInt);
  
  @Deprecated
  public abstract void verbose(String paramString);
  
  @Deprecated
  public abstract void warn(String paramString);
  
  @Deprecated
  public static class LogLevel
  {
    public static final int ERROR = 3;
    public static final int INFO = 1;
    public static final int VERBOSE = 0;
    public static final int WARNING = 2;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/analytics/Logger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */