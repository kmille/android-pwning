package com.google.android.gms.internal.measurement;

final class zzza
{
  private static final Class<?> zzbtc = zzfm("libcore.io.Memory");
  private static final boolean zzbtd;
  
  static
  {
    boolean bool;
    if (zzfm("org.robolectric.Robolectric") != null) {
      bool = true;
    } else {
      bool = false;
    }
    zzbtd = bool;
  }
  
  private static <T> Class<T> zzfm(String paramString)
  {
    try
    {
      paramString = Class.forName(paramString);
      return paramString;
    }
    catch (Throwable paramString)
    {
      for (;;) {}
    }
    return null;
  }
  
  static boolean zztk()
  {
    return (zzbtc != null) && (!zzbtd);
  }
  
  static Class<?> zztl()
  {
    return zzbtc;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */