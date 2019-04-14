package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@VisibleForTesting
public final class zzg
{
  private final Clock clock;
  private final zzj zzrn;
  private boolean zzro;
  private long zzrp;
  private long zzrq;
  private long zzrr;
  private long zzrs;
  private long zzrt;
  private boolean zzru;
  private final Map<Class<? extends zzi>, zzi> zzrv;
  private final List<zzo> zzrw;
  
  private zzg(zzg paramzzg)
  {
    this.zzrn = paramzzg.zzrn;
    this.clock = paramzzg.clock;
    this.zzrp = paramzzg.zzrp;
    this.zzrq = paramzzg.zzrq;
    this.zzrr = paramzzg.zzrr;
    this.zzrs = paramzzg.zzrs;
    this.zzrt = paramzzg.zzrt;
    this.zzrw = new ArrayList(paramzzg.zzrw);
    this.zzrv = new HashMap(paramzzg.zzrv.size());
    paramzzg = paramzzg.zzrv.entrySet().iterator();
    while (paramzzg.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramzzg.next();
      zzi localzzi = zzc((Class)localEntry.getKey());
      ((zzi)localEntry.getValue()).zzb(localzzi);
      this.zzrv.put((Class)localEntry.getKey(), localzzi);
    }
  }
  
  @VisibleForTesting
  zzg(zzj paramzzj, Clock paramClock)
  {
    Preconditions.checkNotNull(paramzzj);
    Preconditions.checkNotNull(paramClock);
    this.zzrn = paramzzj;
    this.clock = paramClock;
    this.zzrs = 1800000L;
    this.zzrt = 3024000000L;
    this.zzrv = new HashMap();
    this.zzrw = new ArrayList();
  }
  
  @TargetApi(19)
  private static <T extends zzi> T zzc(Class<T> paramClass)
  {
    try
    {
      paramClass = (zzi)paramClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return paramClass;
    }
    catch (Exception paramClass)
    {
      if (!(paramClass instanceof InstantiationException))
      {
        if (!(paramClass instanceof IllegalAccessException))
        {
          if ((Build.VERSION.SDK_INT >= 19) && ((paramClass instanceof ReflectiveOperationException))) {
            throw new IllegalArgumentException("Linkage exception", paramClass);
          }
          throw new RuntimeException(paramClass);
        }
        throw new IllegalArgumentException("dataType default constructor is not accessible", paramClass);
      }
      throw new IllegalArgumentException("dataType doesn't have default constructor", paramClass);
    }
  }
  
  @VisibleForTesting
  public final <T extends zzi> T zza(Class<T> paramClass)
  {
    return (zzi)this.zzrv.get(paramClass);
  }
  
  @VisibleForTesting
  public final void zza(long paramLong)
  {
    this.zzrq = paramLong;
  }
  
  @VisibleForTesting
  public final void zza(zzi paramzzi)
  {
    Preconditions.checkNotNull(paramzzi);
    Class localClass = paramzzi.getClass();
    if (localClass.getSuperclass() == zzi.class)
    {
      paramzzi.zzb(zzb(localClass));
      return;
    }
    throw new IllegalArgumentException();
  }
  
  @VisibleForTesting
  public final <T extends zzi> T zzb(Class<T> paramClass)
  {
    zzi localzzi2 = (zzi)this.zzrv.get(paramClass);
    zzi localzzi1 = localzzi2;
    if (localzzi2 == null)
    {
      localzzi1 = zzc(paramClass);
      this.zzrv.put(paramClass, localzzi1);
    }
    return localzzi1;
  }
  
  @VisibleForTesting
  public final zzg zzo()
  {
    return new zzg(this);
  }
  
  @VisibleForTesting
  public final Collection<zzi> zzp()
  {
    return this.zzrv.values();
  }
  
  public final List<zzo> zzq()
  {
    return this.zzrw;
  }
  
  @VisibleForTesting
  public final long zzr()
  {
    return this.zzrp;
  }
  
  @VisibleForTesting
  public final void zzs()
  {
    this.zzrn.zzy().zze(this);
  }
  
  @VisibleForTesting
  public final boolean zzt()
  {
    return this.zzro;
  }
  
  @VisibleForTesting
  final void zzu()
  {
    this.zzrr = this.clock.elapsedRealtime();
    if (this.zzrq != 0L) {}
    for (long l = this.zzrq;; l = this.clock.currentTimeMillis())
    {
      this.zzrp = l;
      break;
    }
    this.zzro = true;
  }
  
  final zzj zzv()
  {
    return this.zzrn;
  }
  
  @VisibleForTesting
  final boolean zzw()
  {
    return this.zzru;
  }
  
  @VisibleForTesting
  final void zzx()
  {
    this.zzru = true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/analytics/zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */