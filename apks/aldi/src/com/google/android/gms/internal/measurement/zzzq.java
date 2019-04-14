package com.google.android.gms.internal.measurement;

import java.lang.reflect.Constructor;

final class zzzq
{
  private static final zzzo<?> zzbtx = new zzzp();
  private static final zzzo<?> zzbty = zztu();
  
  private static zzzo<?> zztu()
  {
    try
    {
      zzzo localzzzo = (zzzo)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localzzzo;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return null;
  }
  
  static zzzo<?> zztv()
  {
    return zzbtx;
  }
  
  static zzzo<?> zztw()
  {
    if (zzbty != null) {
      return zzbty;
    }
    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzzq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */