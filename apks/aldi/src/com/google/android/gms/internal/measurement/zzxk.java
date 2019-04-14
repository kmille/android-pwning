package com.google.android.gms.internal.measurement;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

final class zzxk
{
  private final ConcurrentHashMap<zzxl, List<Throwable>> zzbqd = new ConcurrentHashMap(16, 0.75F, 10);
  private final ReferenceQueue<Throwable> zzbqe = new ReferenceQueue();
  
  public final List<Throwable> zza(Throwable paramThrowable, boolean paramBoolean)
  {
    for (;;)
    {
      Reference localReference = this.zzbqe.poll();
      if (localReference == null) {
        break;
      }
      this.zzbqd.remove(localReference);
    }
    paramThrowable = new zzxl(paramThrowable, null);
    return (List)this.zzbqd.get(paramThrowable);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzxk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */