package com.google.android.gms.internal.gcm;

import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class zzh
{
  private final ConcurrentHashMap<zzi, List<Throwable>> zzdf = new ConcurrentHashMap(16, 0.75F, 10);
  private final ReferenceQueue<Throwable> zzdg = new ReferenceQueue();
  
  public final List<Throwable> zzd(Throwable paramThrowable, boolean paramBoolean)
  {
    for (;;)
    {
      localObject = this.zzdg.poll();
      if (localObject == null) {
        break;
      }
      this.zzdf.remove(localObject);
    }
    Object localObject = new zzi(paramThrowable, null);
    localObject = (List)this.zzdf.get(localObject);
    if (localObject != null) {
      return (List<Throwable>)localObject;
    }
    localObject = new Vector(2);
    paramThrowable = (List)this.zzdf.putIfAbsent(new zzi(paramThrowable, this.zzdg), localObject);
    if (paramThrowable == null) {
      return (List<Throwable>)localObject;
    }
    return paramThrowable;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/gcm/zzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */