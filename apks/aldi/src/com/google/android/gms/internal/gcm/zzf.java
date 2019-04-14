package com.google.android.gms.internal.gcm;

import java.io.PrintStream;
import java.lang.reflect.Field;

public final class zzf
{
  private static final zzg zzdc;
  private static final int zzdd;
  
  static
  {
    int i = 1;
    try
    {
      localInteger = zzy();
      if (localInteger != null) {}
      Object localObject;
      localPrintStream = System.err;
    }
    catch (Throwable localThrowable1)
    {
      try
      {
        if (localInteger.intValue() >= 19) {
          localObject = new zzk();
        } else if ((Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ true)) {
          localObject = new zzj();
        } else {
          localObject = new zzd();
        }
      }
      catch (Throwable localThrowable2)
      {
        Integer localInteger;
        PrintStream localPrintStream;
        String str;
        StringBuilder localStringBuilder;
        zzd localzzd;
        for (;;) {}
      }
      localThrowable1 = localThrowable1;
      localInteger = null;
    }
    str = zzd.class.getName();
    localStringBuilder = new StringBuilder(String.valueOf(str).length() + 132);
    localStringBuilder.append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ");
    localStringBuilder.append(str);
    localStringBuilder.append("will be used. The error is: ");
    localPrintStream.println(localStringBuilder.toString());
    localThrowable1.printStackTrace(System.err);
    localzzd = new zzd();
    zzdc = localzzd;
    if (localInteger != null) {
      i = localInteger.intValue();
    }
    zzdd = i;
  }
  
  public static void zzd(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    zzdc.zzd(paramThrowable1, paramThrowable2);
  }
  
  private static Integer zzy()
  {
    try
    {
      Integer localInteger = (Integer)Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
      return localInteger;
    }
    catch (Exception localException)
    {
      System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
      localException.printStackTrace(System.err);
    }
    return null;
  }
  
  static final class zzd
    extends zzg
  {
    public final void zzd(Throwable paramThrowable1, Throwable paramThrowable2) {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/gcm/zzf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */