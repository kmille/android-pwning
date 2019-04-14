package com.google.android.gms.internal.measurement;

import java.lang.reflect.Constructor;

final class zzabc
{
  private static final Class<?> zzbwa = ;
  private static final zzabo<?, ?> zzbwb = zzu(false);
  private static final zzabo<?, ?> zzbwc = zzu(true);
  private static final zzabo<?, ?> zzbwd = new zzabq();
  
  public static void zzh(Class<?> paramClass)
  {
    if ((!zzzv.class.isAssignableFrom(paramClass)) && (zzbwa != null))
    {
      if (zzbwa.isAssignableFrom(paramClass)) {
        return;
      }
      throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
    }
  }
  
  private static zzabo<?, ?> zzu(boolean paramBoolean)
  {
    try
    {
      Object localObject = zzux();
      if (localObject == null) {
        return null;
      }
      localObject = (zzabo)((Class)localObject).getConstructor(new Class[] { Boolean.TYPE }).newInstance(new Object[] { Boolean.valueOf(paramBoolean) });
      return (zzabo<?, ?>)localObject;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  public static zzabo<?, ?> zzut()
  {
    return zzbwb;
  }
  
  public static zzabo<?, ?> zzuu()
  {
    return zzbwc;
  }
  
  public static zzabo<?, ?> zzuv()
  {
    return zzbwd;
  }
  
  private static Class<?> zzuw()
  {
    try
    {
      Class localClass = Class.forName("com.google.protobuf.GeneratedMessage");
      return localClass;
    }
    catch (Throwable localThrowable)
    {
      for (;;) {}
    }
    return null;
  }
  
  private static Class<?> zzux()
  {
    try
    {
      Class localClass = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
      return localClass;
    }
    catch (Throwable localThrowable)
    {
      for (;;) {}
    }
    return null;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzabc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */