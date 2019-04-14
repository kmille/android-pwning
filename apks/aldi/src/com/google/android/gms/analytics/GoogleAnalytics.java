package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzar;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzcd;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.internal.measurement.zzdc;
import com.google.android.gms.internal.measurement.zzde;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@VisibleForTesting
public final class GoogleAnalytics
  extends zza
{
  private static List<Runnable> zzra = new ArrayList();
  private boolean zzrb;
  private Set<zza> zzrc = new HashSet();
  private boolean zzrd;
  private boolean zzre;
  private volatile boolean zzrf;
  private boolean zzrg;
  
  @VisibleForTesting
  public GoogleAnalytics(zzat paramzzat)
  {
    super(paramzzat);
  }
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public static GoogleAnalytics getInstance(Context paramContext)
  {
    return zzat.zzc(paramContext).zzck();
  }
  
  public static void zzn()
  {
    try
    {
      if (zzra != null)
      {
        Iterator localIterator = zzra.iterator();
        while (localIterator.hasNext()) {
          ((Runnable)localIterator.next()).run();
        }
        zzra = null;
      }
      return;
    }
    finally {}
  }
  
  public final void dispatchLocalHits()
  {
    zzh().zzby().zzbo();
  }
  
  @TargetApi(14)
  public final void enableAutoActivityReports(Application paramApplication)
  {
    if (!this.zzrd)
    {
      paramApplication.registerActivityLifecycleCallbacks(new zzb());
      this.zzrd = true;
    }
  }
  
  public final boolean getAppOptOut()
  {
    return this.zzrf;
  }
  
  @Deprecated
  public final Logger getLogger()
  {
    return zzcl.getLogger();
  }
  
  public final boolean isDryRunEnabled()
  {
    return this.zzre;
  }
  
  public final boolean isInitialized()
  {
    return this.zzrb;
  }
  
  public final Tracker newTracker(int paramInt)
  {
    try
    {
      Tracker localTracker = new Tracker(zzh(), null, null);
      if (paramInt > 0)
      {
        zzdc localzzdc = (zzdc)new zzda(zzh()).zzo(paramInt);
        if (localzzdc != null) {
          localTracker.zza(localzzdc);
        }
      }
      localTracker.zzm();
      return localTracker;
    }
    finally {}
  }
  
  public final Tracker newTracker(String paramString)
  {
    try
    {
      paramString = new Tracker(zzh(), paramString, null);
      paramString.zzm();
      return paramString;
    }
    finally {}
  }
  
  public final void reportActivityStart(Activity paramActivity)
  {
    if (!this.zzrd) {
      zza(paramActivity);
    }
  }
  
  public final void reportActivityStop(Activity paramActivity)
  {
    if (!this.zzrd) {
      zzb(paramActivity);
    }
  }
  
  public final void setAppOptOut(boolean paramBoolean)
  {
    this.zzrf = paramBoolean;
    if (this.zzrf) {
      zzh().zzby().zzbn();
    }
  }
  
  public final void setDryRun(boolean paramBoolean)
  {
    this.zzre = paramBoolean;
  }
  
  public final void setLocalDispatchPeriod(int paramInt)
  {
    zzh().zzby().setLocalDispatchPeriod(paramInt);
  }
  
  @Deprecated
  public final void setLogger(Logger paramLogger)
  {
    zzcl.setLogger(paramLogger);
    if (!this.zzrg)
    {
      zzcc.zzyl.get();
      paramLogger = (String)zzcc.zzyl.get();
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramLogger).length() + 112);
      localStringBuilder.append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.");
      localStringBuilder.append(paramLogger);
      localStringBuilder.append(" DEBUG");
      this.zzrg = true;
    }
  }
  
  @VisibleForTesting
  final void zza(Activity paramActivity)
  {
    Iterator localIterator = this.zzrc.iterator();
    while (localIterator.hasNext()) {
      ((zza)localIterator.next()).zzc(paramActivity);
    }
  }
  
  final void zza(zza paramzza)
  {
    this.zzrc.add(paramzza);
    paramzza = zzh().getContext();
    if ((paramzza instanceof Application)) {
      enableAutoActivityReports((Application)paramzza);
    }
  }
  
  @VisibleForTesting
  final void zzb(Activity paramActivity)
  {
    Iterator localIterator = this.zzrc.iterator();
    while (localIterator.hasNext()) {
      ((zza)localIterator.next()).zzd(paramActivity);
    }
  }
  
  final void zzb(zza paramzza)
  {
    this.zzrc.remove(paramzza);
  }
  
  public final void zzm()
  {
    zzde localzzde = zzh().zzca();
    localzzde.zzfn();
    if (localzzde.zzfo()) {
      setDryRun(localzzde.zzfp());
    }
    localzzde.zzfn();
    this.zzrb = true;
  }
  
  static abstract interface zza
  {
    public abstract void zzc(Activity paramActivity);
    
    public abstract void zzd(Activity paramActivity);
  }
  
  @TargetApi(14)
  final class zzb
    implements Application.ActivityLifecycleCallbacks
  {
    zzb() {}
    
    public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
    
    public final void onActivityDestroyed(Activity paramActivity) {}
    
    public final void onActivityPaused(Activity paramActivity) {}
    
    public final void onActivityResumed(Activity paramActivity) {}
    
    public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
    
    public final void onActivityStarted(Activity paramActivity)
    {
      GoogleAnalytics.this.zza(paramActivity);
    }
    
    public final void onActivityStopped(Activity paramActivity)
    {
      GoogleAnalytics.this.zzb(paramActivity);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/analytics/GoogleAnalytics.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */