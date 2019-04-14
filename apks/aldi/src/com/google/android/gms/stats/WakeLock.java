package com.google.android.gms.stats;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.WorkSource;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.providers.PooledExecutorsProvider;
import com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory;
import com.google.android.gms.common.stats.StatsUtils;
import com.google.android.gms.common.stats.WakeLockTracker;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

@KeepForSdk
@ShowFirstParty
@ThreadSafe
public class WakeLock
{
  private static ScheduledExecutorService zzn;
  private static volatile zza zzo = new zza();
  private final Object zza = this;
  private final PowerManager.WakeLock zzb;
  private WorkSource zzc;
  private final int zzd;
  private final String zze;
  private final String zzf;
  private final String zzg;
  private final Context zzh;
  private boolean zzi = true;
  private final Map<String, Integer[]> zzj = new HashMap();
  private final Set<Future<?>> zzk = Collections.synchronizedSet(new HashSet());
  private int zzl;
  private AtomicInteger zzm = new AtomicInteger(0);
  
  @KeepForSdk
  public WakeLock(@NonNull Context paramContext, int paramInt, @NonNull String paramString)
  {
    this(paramContext, paramInt, paramString, null, str);
  }
  
  private WakeLock(@NonNull Context paramContext, int paramInt, @NonNull String paramString1, @Nullable String paramString2, @NonNull String paramString3)
  {
    this(paramContext, paramInt, paramString1, null, paramString3, null);
  }
  
  @SuppressLint({"UnwrappedWakeLock"})
  private WakeLock(@NonNull Context paramContext, int paramInt, @NonNull String paramString1, @Nullable String paramString2, @NonNull String paramString3, @Nullable String paramString4)
  {
    Preconditions.checkNotNull(paramContext, "WakeLock: context must not be null");
    Preconditions.checkNotEmpty(paramString1, "WakeLock: wakeLockName must not be empty");
    this.zzd = paramInt;
    this.zzf = null;
    this.zzg = null;
    this.zzh = paramContext.getApplicationContext();
    if (!"com.google.android.gms".equals(paramContext.getPackageName()))
    {
      paramString2 = String.valueOf("*gcore*:");
      paramString4 = String.valueOf(paramString1);
      if (paramString4.length() != 0) {
        paramString2 = paramString2.concat(paramString4);
      } else {
        paramString2 = new String(paramString2);
      }
      this.zze = paramString2;
    }
    else
    {
      this.zze = paramString1;
    }
    this.zzb = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(paramInt, paramString1);
    if (WorkSourceUtil.hasWorkSourcePermission(paramContext))
    {
      paramString1 = paramString3;
      if (Strings.isEmptyOrWhitespace(paramString3)) {
        paramString1 = paramContext.getPackageName();
      }
      this.zzc = WorkSourceUtil.fromPackage(paramContext, paramString1);
      paramContext = this.zzc;
      if ((paramContext != null) && (WorkSourceUtil.hasWorkSourcePermission(this.zzh)))
      {
        if (this.zzc != null) {
          this.zzc.add(paramContext);
        } else {
          this.zzc = paramContext;
        }
        paramContext = this.zzc;
        try
        {
          this.zzb.setWorkSource(paramContext);
        }
        catch (IllegalArgumentException|ArrayIndexOutOfBoundsException paramContext)
        {
          Log.wtf("WakeLock", paramContext.toString());
        }
      }
    }
    if (zzn == null) {
      zzn = PooledExecutorsProvider.getInstance().newSingleThreadScheduledExecutor();
    }
  }
  
  private final String zza(String paramString)
  {
    if (this.zzi)
    {
      if (!TextUtils.isEmpty(paramString)) {
        return paramString;
      }
      return this.zzf;
    }
    return this.zzf;
  }
  
  private final List<String> zza()
  {
    return WorkSourceUtil.getNames(this.zzc);
  }
  
  private final void zza(int paramInt)
  {
    if (this.zzb.isHeld())
    {
      try
      {
        this.zzb.release();
      }
      catch (RuntimeException localRuntimeException)
      {
        if (!localRuntimeException.getClass().equals(RuntimeException.class)) {
          break label61;
        }
      }
      Log.e("WakeLock", String.valueOf(this.zze).concat(" was already released!"), localRuntimeException);
      this.zzb.isHeld();
      return;
      label61:
      throw localRuntimeException;
    }
  }
  
  @KeepForSdk
  public void acquire(long paramLong)
  {
    this.zzm.incrementAndGet();
    String str = zza(null);
    for (;;)
    {
      int i;
      synchronized (this.zza)
      {
        boolean bool = this.zzj.isEmpty();
        i = 0;
        if (((!bool) || (this.zzl > 0)) && (!this.zzb.isHeld()))
        {
          this.zzj.clear();
          this.zzl = 0;
        }
        if (this.zzi)
        {
          Integer[] arrayOfInteger = (Integer[])this.zzj.get(str);
          if (arrayOfInteger == null)
          {
            this.zzj.put(str, new Integer[] { Integer.valueOf(1) });
            i = 1;
          }
          else
          {
            arrayOfInteger[0] = Integer.valueOf(arrayOfInteger[0].intValue() + 1);
          }
        }
        else
        {
          if ((!this.zzi) && (this.zzl == 0))
          {
            WakeLockTracker.getInstance().registerEvent(this.zzh, StatsUtils.getEventKey(this.zzb, str), 7, this.zze, str, null, this.zzd, zza(), paramLong);
            this.zzl += 1;
          }
          this.zzb.acquire();
          if (paramLong > 0L) {
            zzn.schedule(new zzb(this), paramLong, TimeUnit.MILLISECONDS);
          }
          return;
        }
      }
      if (i != 0) {}
    }
  }
  
  @KeepForSdk
  public boolean isHeld()
  {
    return this.zzb.isHeld();
  }
  
  @KeepForSdk
  public void release()
  {
    if (this.zzm.decrementAndGet() < 0) {
      Log.e("WakeLock", String.valueOf(this.zze).concat(" release without a matched acquire!"));
    }
    String str = zza(null);
    for (;;)
    {
      synchronized (this.zza)
      {
        if (this.zzi)
        {
          Integer[] arrayOfInteger = (Integer[])this.zzj.get(str);
          if (arrayOfInteger != null)
          {
            if (arrayOfInteger[0].intValue() == 1)
            {
              this.zzj.remove(str);
              i = 1;
              break label192;
            }
            arrayOfInteger[0] = Integer.valueOf(arrayOfInteger[0].intValue() - 1);
          }
        }
        else
        {
          if ((!this.zzi) && (this.zzl == 1))
          {
            WakeLockTracker.getInstance().registerEvent(this.zzh, StatsUtils.getEventKey(this.zzb, str), 8, this.zze, str, null, this.zzd, zza());
            this.zzl -= 1;
          }
          zza(0);
          return;
        }
      }
      int i = 0;
      label192:
      if (i != 0) {}
    }
  }
  
  @KeepForSdk
  public void setReferenceCounted(boolean paramBoolean)
  {
    this.zzb.setReferenceCounted(paramBoolean);
    this.zzi = paramBoolean;
  }
  
  public static abstract interface zza {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/stats/WakeLock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */