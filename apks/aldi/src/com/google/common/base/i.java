package com.google.common.base;

import java.util.Locale;
import java.util.logging.Logger;
import javax.annotation.Nullable;

public final class i
{
  private static final Logger a = Logger.getLogger(i.class.getName());
  private static final h b = new a((byte)0);
  
  static long a()
  {
    return System.nanoTime();
  }
  
  static String a(double paramDouble)
  {
    return String.format(Locale.ROOT, "%.4g", new Object[] { Double.valueOf(paramDouble) });
  }
  
  public static boolean a(@Nullable String paramString)
  {
    return (paramString == null) || (paramString.isEmpty());
  }
  
  static final class a
    implements h
  {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/base/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */