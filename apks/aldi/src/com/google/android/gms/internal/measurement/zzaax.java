package com.google.android.gms.internal.measurement;

import java.lang.reflect.Constructor;

final class zzaax
{
  private static final zzaav zzbvv = ;
  private static final zzaav zzbvw = new zzaaw();
  
  static zzaav zzup()
  {
    return zzbvv;
  }
  
  static zzaav zzuq()
  {
    return zzbvw;
  }
  
  private static zzaav zzur()
  {
    try
    {
      zzaav localzzaav = (zzaav)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localzzaav;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return null;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzaax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */