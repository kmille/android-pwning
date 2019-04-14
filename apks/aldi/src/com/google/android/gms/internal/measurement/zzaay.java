package com.google.android.gms.internal.measurement;

import java.lang.reflect.Constructor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzaay
{
  private static final zzaay zzbvx = new zzaay();
  private final zzabb zzbvy;
  private final ConcurrentMap<Class<?>, zzaba<?>> zzbvz = new ConcurrentHashMap();
  
  private zzaay()
  {
    Object localObject1 = null;
    int i = 0;
    while (i <= 0)
    {
      localObject2 = zzfq(new String[] { "com.google.protobuf.AndroidProto3SchemaFactory" }[0]);
      localObject1 = localObject2;
      if (localObject2 != null) {
        break;
      }
      i += 1;
      localObject1 = localObject2;
    }
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new zzaai();
    }
    this.zzbvy = ((zzabb)localObject2);
  }
  
  private static zzabb zzfq(String paramString)
  {
    try
    {
      paramString = (zzabb)Class.forName(paramString).getConstructor(new Class[0]).newInstance(new Object[0]);
      return paramString;
    }
    catch (Throwable paramString)
    {
      for (;;) {}
    }
    return null;
  }
  
  public static zzaay zzus()
  {
    return zzbvx;
  }
  
  public final <T> zzaba<T> zzt(T paramT)
  {
    Class localClass = paramT.getClass();
    zzzw.zza(localClass, "messageType");
    zzaba localzzaba = (zzaba)this.zzbvz.get(localClass);
    paramT = localzzaba;
    if (localzzaba == null)
    {
      paramT = this.zzbvy.zzg(localClass);
      zzzw.zza(localClass, "messageType");
      zzzw.zza(paramT, "schema");
      localzzaba = (zzaba)this.zzbvz.putIfAbsent(localClass, paramT);
      if (localzzaba != null) {
        paramT = localzzaba;
      }
    }
    return paramT;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzaay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */