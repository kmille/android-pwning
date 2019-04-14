package com.google.android.gms.internal.measurement;

import java.io.PrintStream;
import java.lang.reflect.Field;

public final class zzxi
{
  private static final zzxj zzbqa;
  private static final int zzbqb;
  
  static
  {
    int i = 1;
    try
    {
      localInteger = zzsr();
      if (localInteger != null) {}
      Object localObject;
      localPrintStream = System.err;
    }
    catch (Throwable localThrowable1)
    {
      try
      {
        if (localInteger.intValue() >= 19) {
          localObject = new zzxn();
        } else if ((Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ true)) {
          localObject = new zzxm();
        } else {
          localObject = new zza();
        }
      }
      catch (Throwable localThrowable2)
      {
        Integer localInteger;
        PrintStream localPrintStream;
        String str;
        StringBuilder localStringBuilder;
        zza localzza;
        for (;;) {}
      }
      localThrowable1 = localThrowable1;
      localInteger = null;
    }
    str = zza.class.getName();
    localStringBuilder = new StringBuilder(String.valueOf(str).length() + 132);
    localStringBuilder.append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ");
    localStringBuilder.append(str);
    localStringBuilder.append("will be used. The error is: ");
    localPrintStream.println(localStringBuilder.toString());
    localThrowable1.printStackTrace(System.err);
    localzza = new zza();
    zzbqa = localzza;
    if (localInteger != null) {
      i = localInteger.intValue();
    }
    zzbqb = i;
  }
  
  public static void zza(Throwable paramThrowable, PrintStream paramPrintStream)
  {
    zzbqa.zza(paramThrowable, paramPrintStream);
  }
  
  private static Integer zzsr()
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
  
  static final class zza
    extends zzxj
  {
    public final void zza(Throwable paramThrowable, PrintStream paramPrintStream)
    {
      paramThrowable.printStackTrace(paramPrintStream);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzxi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */