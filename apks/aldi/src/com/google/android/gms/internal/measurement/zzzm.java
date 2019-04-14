package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;

final class zzzm
{
  private static final Class<?> zzbts = ;
  
  private static final zzzn zzfo(String paramString)
    throws Exception
  {
    return (zzzn)zzbts.getDeclaredMethod(paramString, new Class[0]).invoke(null, new Object[0]);
  }
  
  private static Class<?> zztq()
  {
    try
    {
      Class localClass = Class.forName("com.google.protobuf.ExtensionRegistry");
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;) {}
    }
    return null;
  }
  
  public static zzzn zztr()
  {
    if (zzbts != null) {}
    try
    {
      zzzn localzzzn = zzfo("getEmptyRegistry");
      return localzzzn;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return zzzn.zzbtv;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */