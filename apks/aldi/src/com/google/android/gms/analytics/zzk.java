package com.google.android.gms.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzu;
import com.google.android.gms.internal.measurement.zzz;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"StaticFieldLeak"})
@VisibleForTesting
public final class zzk
{
  private static volatile zzk zzsa;
  private final Context zzqx;
  private final List<zzn> zzsb;
  private final zze zzsc;
  private final zza zzsd;
  private volatile zzu zzse;
  private Thread.UncaughtExceptionHandler zzsf;
  
  @VisibleForTesting
  private zzk(Context paramContext)
  {
    paramContext = paramContext.getApplicationContext();
    Preconditions.checkNotNull(paramContext);
    this.zzqx = paramContext;
    this.zzsd = new zza();
    this.zzsb = new CopyOnWriteArrayList();
    this.zzsc = new zze();
  }
  
  public static void zzab()
  {
    if ((Thread.currentThread() instanceof zzc)) {
      return;
    }
    throw new IllegalStateException("Call expected from worker thread");
  }
  
  public static zzk zzb(Context paramContext)
  {
    Preconditions.checkNotNull(paramContext);
    if (zzsa == null) {
      try
      {
        if (zzsa == null) {
          zzsa = new zzk(paramContext);
        }
      }
      finally {}
    }
    return zzsa;
  }
  
  private static void zzb(zzg paramzzg)
  {
    Preconditions.checkNotMainThread("deliver should be called from worker thread");
    Preconditions.checkArgument(paramzzg.zzt(), "Measurement must be submitted");
    Object localObject = paramzzg.zzq();
    if (((List)localObject).isEmpty()) {
      return;
    }
    HashSet localHashSet = new HashSet();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      zzo localzzo = (zzo)((Iterator)localObject).next();
      Uri localUri = localzzo.zzk();
      if (!localHashSet.contains(localUri))
      {
        localHashSet.add(localUri);
        localzzo.zzb(paramzzg);
      }
    }
  }
  
  public final Context getContext()
  {
    return this.zzqx;
  }
  
  public final <V> Future<V> zza(Callable<V> paramCallable)
  {
    Preconditions.checkNotNull(paramCallable);
    if ((Thread.currentThread() instanceof zzc))
    {
      paramCallable = new FutureTask(paramCallable);
      paramCallable.run();
      return paramCallable;
    }
    return this.zzsd.submit(paramCallable);
  }
  
  public final void zza(Runnable paramRunnable)
  {
    Preconditions.checkNotNull(paramRunnable);
    this.zzsd.submit(paramRunnable);
  }
  
  public final void zza(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler)
  {
    this.zzsf = paramUncaughtExceptionHandler;
  }
  
  public final zzz zzaa()
  {
    DisplayMetrics localDisplayMetrics = this.zzqx.getResources().getDisplayMetrics();
    zzz localzzz = new zzz();
    localzzz.setLanguage(zzdd.zza(Locale.getDefault()));
    localzzz.zztv = localDisplayMetrics.widthPixels;
    localzzz.zztw = localDisplayMetrics.heightPixels;
    return localzzz;
  }
  
  final void zze(zzg paramzzg)
  {
    if (!paramzzg.zzw())
    {
      if (!paramzzg.zzt())
      {
        paramzzg = paramzzg.zzo();
        paramzzg.zzu();
        this.zzsd.execute(new zzl(this, paramzzg));
        return;
      }
      throw new IllegalStateException("Measurement can only be submitted once");
    }
    throw new IllegalStateException("Measurement prototype can't be submitted");
  }
  
  public final zzu zzz()
  {
    if (this.zzse == null) {}
    for (;;)
    {
      zzu localzzu;
      PackageManager localPackageManager;
      String str;
      Object localObject5;
      Object localObject3;
      PackageInfo localPackageInfo;
      Object localObject1;
      Object localObject4;
      try
      {
        if (this.zzse == null)
        {
          localzzu = new zzu();
          localPackageManager = this.zzqx.getPackageManager();
          str = this.zzqx.getPackageName();
          localzzu.setAppId(str);
          localzzu.setAppInstallerId(localPackageManager.getInstallerPackageName(str));
          localObject5 = null;
          localObject3 = str;
        }
      }
      finally {}
      try
      {
        localPackageInfo = localPackageManager.getPackageInfo(this.zzqx.getPackageName(), 0);
        localObject1 = str;
        localObject4 = localObject5;
        if (localPackageInfo == null) {
          continue;
        }
        localObject3 = str;
        localObject4 = localPackageManager.getApplicationLabel(localPackageInfo.applicationInfo);
        localObject1 = str;
        localObject3 = str;
        if (!TextUtils.isEmpty((CharSequence)localObject4))
        {
          localObject3 = str;
          localObject1 = ((CharSequence)localObject4).toString();
        }
        localObject3 = localObject1;
        localObject4 = localPackageInfo.versionName;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    }
    localObject1 = String.valueOf(localObject3);
    if (((String)localObject1).length() != 0) {
      localObject1 = "Error retrieving package info: appName set to ".concat((String)localObject1);
    } else {
      localObject1 = new String("Error retrieving package info: appName set to ");
    }
    Log.e("GAv4", (String)localObject1);
    localObject4 = localObject5;
    localObject1 = localObject3;
    localzzu.setAppName((String)localObject1);
    localzzu.setAppVersion((String)localObject4);
    this.zzse = localzzu;
    return this.zzse;
  }
  
  final class zza
    extends ThreadPoolExecutor
  {
    public zza()
    {
      super(1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
      setThreadFactory(new zzk.zzb(null));
      allowCoreThreadTimeOut(true);
    }
    
    protected final <T> RunnableFuture<T> newTaskFor(Runnable paramRunnable, T paramT)
    {
      return new zzm(this, paramRunnable, paramT);
    }
  }
  
  static final class zzb
    implements ThreadFactory
  {
    private static final AtomicInteger zzsj = new AtomicInteger();
    
    public final Thread newThread(Runnable paramRunnable)
    {
      int i = zzsj.incrementAndGet();
      StringBuilder localStringBuilder = new StringBuilder(23);
      localStringBuilder.append("measurement-");
      localStringBuilder.append(i);
      return new zzk.zzc(paramRunnable, localStringBuilder.toString());
    }
  }
  
  static final class zzc
    extends Thread
  {
    zzc(Runnable paramRunnable, String paramString)
    {
      super(paramString);
    }
    
    public final void run()
    {
      Process.setThreadPriority(10);
      super.run();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/analytics/zzk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */