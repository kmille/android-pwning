package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.analytics.zza;
import com.google.android.gms.analytics.zzg;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class zzbf
  extends zzar
{
  private boolean started;
  private final zzbc zzwz;
  private final zzco zzxa;
  private final zzcn zzxb;
  private final zzax zzxc;
  private long zzxd;
  private final zzbw zzxe;
  private final zzbw zzxf;
  private final zzcz zzxg;
  private long zzxh;
  private boolean zzxi;
  
  protected zzbf(zzat paramzzat, zzav paramzzav)
  {
    super(paramzzat);
    Preconditions.checkNotNull(paramzzav);
    this.zzxd = Long.MIN_VALUE;
    this.zzxb = new zzcn(paramzzat);
    this.zzwz = new zzbc(paramzzat);
    this.zzxa = new zzco(paramzzat);
    this.zzxc = new zzax(paramzzat);
    this.zzxg = new zzcz(zzbt());
    this.zzxe = new zzbg(this, paramzzat);
    this.zzxf = new zzbh(this, paramzzat);
  }
  
  private final void zza(zzaw paramzzaw, zzv paramzzv)
  {
    Preconditions.checkNotNull(paramzzaw);
    Preconditions.checkNotNull(paramzzv);
    Object localObject1 = new zza(zzbs());
    ((zza)localObject1).zza(paramzzaw.zzcp());
    ((zza)localObject1).enableAdvertisingIdCollection(paramzzaw.zzcq());
    localObject1 = ((zzj)localObject1).zzi();
    zzad localzzad = (zzad)((zzg)localObject1).zzb(zzad.class);
    localzzad.zzl("data");
    localzzad.zzb(true);
    ((zzg)localObject1).zza(paramzzv);
    zzy localzzy = (zzy)((zzg)localObject1).zzb(zzy.class);
    zzu localzzu = (zzu)((zzg)localObject1).zzb(zzu.class);
    Iterator localIterator = paramzzaw.zzcs().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject2).getKey();
      localObject2 = (String)((Map.Entry)localObject2).getValue();
      if ("an".equals(str)) {
        localzzu.setAppName((String)localObject2);
      } else if ("av".equals(str)) {
        localzzu.setAppVersion((String)localObject2);
      } else if ("aid".equals(str)) {
        localzzu.setAppId((String)localObject2);
      } else if ("aiid".equals(str)) {
        localzzu.setAppInstallerId((String)localObject2);
      } else if ("uid".equals(str)) {
        localzzad.setUserId((String)localObject2);
      } else {
        localzzy.set(str, (String)localObject2);
      }
    }
    zzb("Sending installation campaign to", paramzzaw.zzcp(), paramzzv);
    ((zzg)localObject1).zza(zzcb().zzfb());
    ((zzg)localObject1).zzs();
  }
  
  private final long zzcy()
  {
    zzk.zzab();
    zzch();
    try
    {
      long l = this.zzwz.zzcy();
      return l;
    }
    catch (SQLiteException localSQLiteException)
    {
      zze("Failed to get min/max hit times from local store", localSQLiteException);
    }
    return 0L;
  }
  
  private final void zzdd()
  {
    zzb(new zzbj(this));
  }
  
  private final void zzde()
  {
    try
    {
      this.zzwz.zzcx();
      zzdi();
    }
    catch (SQLiteException localSQLiteException)
    {
      zzd("Failed to delete stale hits", localSQLiteException);
    }
    this.zzxf.zzh(86400000L);
  }
  
  private final void zzdf()
  {
    if (this.zzxi) {
      return;
    }
    if (!zzbu.zzdt()) {
      return;
    }
    if (this.zzxc.isConnected()) {
      return;
    }
    long l = ((Long)zzcc.zzzx.get()).longValue();
    if (this.zzxg.zzj(l))
    {
      this.zzxg.start();
      zzq("Connecting to service");
      if (this.zzxc.connect())
      {
        zzq("Connected to service");
        this.zzxg.clear();
        onServiceConnected();
      }
    }
  }
  
  private final boolean zzdg()
  {
    zzk.zzab();
    zzch();
    zzq("Dispatching a batch of local hits");
    boolean bool1 = this.zzxc.isConnected();
    boolean bool2 = this.zzxa.zzex();
    if (((bool1 ^ true)) && ((bool2 ^ true)))
    {
      zzq("No network or service available. Will retry later");
      return false;
    }
    long l3 = Math.max(zzbu.zzdx(), zzbu.zzdy());
    ArrayList localArrayList = new ArrayList();
    long l2 = 0L;
    try
    {
      for (;;)
      {
        this.zzwz.beginTransaction();
        localArrayList.clear();
        try
        {
          List localList = this.zzwz.zzd(l3);
          if (localList.isEmpty())
          {
            zzq("Store is empty, nothing to dispatch");
            zzdk();
            try
            {
              this.zzwz.setTransactionSuccessful();
              this.zzwz.endTransaction();
              return false;
            }
            catch (SQLiteException localSQLiteException1)
            {
              zze("Failed to commit local dispatch transaction", localSQLiteException1);
              zzdk();
              return false;
            }
          }
          zza("Hits loaded from store. count", Integer.valueOf(localList.size()));
          Object localObject2 = localList.iterator();
          while (((Iterator)localObject2).hasNext()) {
            if (((zzch)((Iterator)localObject2).next()).zzem() == l2)
            {
              zzd("Database contains successfully uploaded hit", Long.valueOf(l2), Integer.valueOf(localList.size()));
              zzdk();
              try
              {
                this.zzwz.setTransactionSuccessful();
                this.zzwz.endTransaction();
                return false;
              }
              catch (SQLiteException localSQLiteException2)
              {
                zze("Failed to commit local dispatch transaction", localSQLiteException2);
                zzdk();
                return false;
              }
            }
          }
          long l1 = l2;
          if (this.zzxc.isConnected())
          {
            zzq("Service connected, sending hits to the service");
            for (;;)
            {
              l1 = l2;
              if (!localList.isEmpty())
              {
                localObject2 = (zzch)localList.get(0);
                l1 = l2;
                if (this.zzxc.zzb((zzch)localObject2))
                {
                  l2 = Math.max(l2, ((zzch)localObject2).zzem());
                  localList.remove(localObject2);
                  zzb("Hit sent do device AnalyticsService for delivery", localObject2);
                  try
                  {
                    this.zzwz.zze(((zzch)localObject2).zzem());
                    localSQLiteException2.add(Long.valueOf(((zzch)localObject2).zzem()));
                  }
                  catch (SQLiteException localSQLiteException3)
                  {
                    zze("Failed to remove hit that was send for delivery", localSQLiteException3);
                    zzdk();
                    try
                    {
                      this.zzwz.setTransactionSuccessful();
                      this.zzwz.endTransaction();
                      return false;
                    }
                    catch (SQLiteException localSQLiteException4)
                    {
                      zze("Failed to commit local dispatch transaction", localSQLiteException4);
                      zzdk();
                      return false;
                    }
                  }
                }
              }
            }
          }
          l2 = l1;
          if (this.zzxa.zzex())
          {
            localList = this.zzxa.zzb(localList);
            localObject2 = localList.iterator();
            while (((Iterator)localObject2).hasNext()) {
              l1 = Math.max(l1, ((Long)((Iterator)localObject2).next()).longValue());
            }
            try
            {
              this.zzwz.zza(localList);
              localSQLiteException4.addAll(localList);
              l2 = l1;
            }
            catch (SQLiteException localSQLiteException5)
            {
              zze("Failed to remove successfully uploaded hits", localSQLiteException5);
              zzdk();
              try
              {
                this.zzwz.setTransactionSuccessful();
                this.zzwz.endTransaction();
                return false;
              }
              catch (SQLiteException localSQLiteException6)
              {
                zze("Failed to commit local dispatch transaction", localSQLiteException6);
                zzdk();
                return false;
              }
            }
          }
          bool1 = localSQLiteException6.isEmpty();
          if (bool1) {
            try
            {
              this.zzwz.setTransactionSuccessful();
              this.zzwz.endTransaction();
              return false;
            }
            catch (SQLiteException localSQLiteException7)
            {
              zze("Failed to commit local dispatch transaction", localSQLiteException7);
              zzdk();
              return false;
            }
          }
          try
          {
            this.zzwz.setTransactionSuccessful();
            this.zzwz.endTransaction();
          }
          catch (SQLiteException localSQLiteException8)
          {
            zze("Failed to commit local dispatch transaction", localSQLiteException8);
            zzdk();
            return false;
          }
          localObject1 = finally;
        }
        catch (SQLiteException localSQLiteException9)
        {
          zzd("Failed to read hits from persisted store", localSQLiteException9);
          zzdk();
          try
          {
            this.zzwz.setTransactionSuccessful();
            this.zzwz.endTransaction();
            return false;
          }
          catch (SQLiteException localSQLiteException10)
          {
            zze("Failed to commit local dispatch transaction", localSQLiteException10);
            zzdk();
            return false;
          }
        }
      }
      return false;
    }
    finally
    {
      try
      {
        this.zzwz.setTransactionSuccessful();
        this.zzwz.endTransaction();
        throw ((Throwable)localObject1);
      }
      catch (SQLiteException localSQLiteException11)
      {
        zze("Failed to commit local dispatch transaction", localSQLiteException11);
        zzdk();
      }
    }
  }
  
  private final void zzdj()
  {
    zzbz localzzbz = zzbz();
    if (!localzzbz.zzei()) {
      return;
    }
    if (!localzzbz.zzef())
    {
      long l = zzcy();
      if ((l != 0L) && (Math.abs(zzbt().currentTimeMillis() - l) <= ((Long)zzcc.zzyw.get()).longValue()))
      {
        zza("Dispatch alarm scheduled (ms)", Long.valueOf(zzbu.zzdw()));
        localzzbz.zzej();
      }
    }
  }
  
  private final void zzdk()
  {
    if (this.zzxe.zzef()) {
      zzq("All hits dispatched or no network/service. Going to power save mode");
    }
    this.zzxe.cancel();
    zzbz localzzbz = zzbz();
    if (localzzbz.zzef()) {
      localzzbz.cancel();
    }
  }
  
  private final long zzdl()
  {
    if (this.zzxd != Long.MIN_VALUE) {
      return this.zzxd;
    }
    long l = ((Long)zzcc.zzyr.get()).longValue();
    zzde localzzde = zzca();
    localzzde.zzch();
    if (localzzde.zzace)
    {
      localzzde = zzca();
      localzzde.zzch();
      l = localzzde.zzaag * 1000L;
    }
    return l;
  }
  
  private final void zzdm()
  {
    zzch();
    zzk.zzab();
    this.zzxi = true;
    this.zzxc.disconnect();
    zzdi();
  }
  
  private final boolean zzx(String paramString)
  {
    return Wrappers.packageManager(getContext()).checkCallingOrSelfPermission(paramString) == 0;
  }
  
  protected final void onServiceConnected()
  {
    zzk.zzab();
    zzk.zzab();
    zzch();
    if (!zzbu.zzdt()) {
      zzt("Service client disabled. Can't dispatch local hits to device AnalyticsService");
    }
    if (!this.zzxc.isConnected())
    {
      zzq("Service not connected");
      return;
    }
    if (!this.zzwz.isEmpty())
    {
      zzq("Dispatching local hits to device AnalyticsService");
      try
      {
        List localList = this.zzwz.zzd(zzbu.zzdx());
        if (localList.isEmpty())
        {
          zzdi();
          return;
        }
        while (!localList.isEmpty())
        {
          zzch localzzch = (zzch)localList.get(0);
          if (!this.zzxc.zzb(localzzch))
          {
            zzdi();
            return;
          }
          localList.remove(localzzch);
          try
          {
            this.zzwz.zze(localzzch.zzem());
          }
          catch (SQLiteException localSQLiteException1)
          {
            zze("Failed to remove hit that was send for delivery", localSQLiteException1);
            zzdk();
            return;
          }
        }
        return;
      }
      catch (SQLiteException localSQLiteException2)
      {
        zze("Failed to read hits from store", localSQLiteException2);
        zzdk();
      }
    }
  }
  
  final void start()
  {
    zzch();
    Preconditions.checkState(this.started ^ true, "Analytics backend already started");
    this.started = true;
    zzbw().zza(new zzbi(this));
  }
  
  public final long zza(zzaw paramzzaw, boolean paramBoolean)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final void zza(zzch paramzzch)
  {
    Preconditions.checkNotNull(paramzzch);
    zzk.zzab();
    zzch();
    if (this.zzxi) {
      zzr("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
    } else {
      zza("Delivering hit", paramzzch);
    }
    if (TextUtils.isEmpty(paramzzch.zzer()))
    {
      Object localObject1 = zzcb().zzfg().zzfi();
      if (localObject1 != null)
      {
        Object localObject2 = (Long)((Pair)localObject1).second;
        localObject1 = (String)((Pair)localObject1).first;
        localObject2 = String.valueOf(localObject2);
        StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject2).length() + 1 + String.valueOf(localObject1).length());
        localStringBuilder.append((String)localObject2);
        localStringBuilder.append(":");
        localStringBuilder.append((String)localObject1);
        localObject1 = localStringBuilder.toString();
        localObject2 = new HashMap(paramzzch.zzcs());
        ((Map)localObject2).put("_m", localObject1);
        paramzzch = new zzch(this, (Map)localObject2, paramzzch.zzen(), paramzzch.zzep(), paramzzch.zzem(), paramzzch.zzel(), paramzzch.zzeo());
      }
    }
    zzdf();
    if (this.zzxc.zzb(paramzzch))
    {
      zzr("Hit sent to the device AnalyticsService for delivery");
      return;
    }
    try
    {
      this.zzwz.zzc(paramzzch);
      zzdi();
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      zze("Delivery failed to save hit to a database", localSQLiteException);
      zzbu().zza(paramzzch, "deliver: failed to insert hit to database");
    }
  }
  
  protected final void zzac()
  {
    this.zzwz.zzm();
    this.zzxa.zzm();
    this.zzxc.zzm();
  }
  
  protected final void zzb(zzaw paramzzaw)
  {
    zzk.zzab();
    zzb("Sending first hit to property", paramzzaw.zzcp());
    if (zzcb().zzfc().zzj(zzbu.zzed())) {
      return;
    }
    Object localObject = zzcb().zzff();
    if (TextUtils.isEmpty((CharSequence)localObject)) {
      return;
    }
    localObject = zzdd.zza(zzbu(), (String)localObject);
    zzb("Found relevant installation campaign", localObject);
    zza(paramzzaw, (zzv)localObject);
  }
  
  public final void zzb(zzca paramzzca)
  {
    long l2 = this.zzxh;
    zzk.zzab();
    zzch();
    long l1 = zzcb().zzfd();
    if (l1 != 0L) {
      l1 = Math.abs(zzbt().currentTimeMillis() - l1);
    } else {
      l1 = -1L;
    }
    zzb("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(l1));
    zzdf();
    try
    {
      zzdg();
      zzcb().zzfe();
      zzdi();
      if (paramzzca != null) {
        paramzzca.zza(null);
      }
      if (this.zzxh != l2) {
        this.zzxb.zzew();
      }
      return;
    }
    catch (Exception localException)
    {
      zze("Local dispatch failed", localException);
      zzcb().zzfe();
      zzdi();
      if (paramzzca != null) {
        paramzzca.zza(localException);
      }
    }
  }
  
  public final void zzbn()
  {
    zzk.zzab();
    zzch();
    zzq("Delete all hits from local store");
    try
    {
      zzbc localzzbc = this.zzwz;
      zzk.zzab();
      localzzbc.zzch();
      localzzbc.getWritableDatabase().delete("hits2", null, null);
      localzzbc = this.zzwz;
      zzk.zzab();
      localzzbc.zzch();
      localzzbc.getWritableDatabase().delete("properties", null, null);
      zzdi();
    }
    catch (SQLiteException localSQLiteException)
    {
      zzd("Failed to delete hits from store", localSQLiteException);
    }
    zzdf();
    if (this.zzxc.zzct()) {
      zzq("Device service unavailable. Can't clear hits stored on the device service.");
    }
  }
  
  final void zzbr()
  {
    zzk.zzab();
    this.zzxh = zzbt().currentTimeMillis();
  }
  
  protected final void zzdc()
  {
    zzch();
    zzk.zzab();
    Context localContext = zzbs().getContext();
    if (!zzct.zza(localContext)) {
      zzt("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
    } else if (!zzcu.zze(localContext)) {
      zzu("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
    }
    if (!CampaignTrackingReceiver.zza(localContext)) {
      zzt("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
    }
    zzcb().zzfb();
    if (!zzx("android.permission.ACCESS_NETWORK_STATE"))
    {
      zzu("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
      zzdm();
    }
    if (!zzx("android.permission.INTERNET"))
    {
      zzu("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
      zzdm();
    }
    if (zzcu.zze(getContext())) {
      zzq("AnalyticsService registered in the app manifest and enabled");
    } else {
      zzt("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
    }
    if ((!this.zzxi) && (!this.zzwz.isEmpty())) {
      zzdf();
    }
    zzdi();
  }
  
  public final void zzdh()
  {
    zzk.zzab();
    zzch();
    zzr("Sync dispatching local hits");
    long l = this.zzxh;
    zzdf();
    try
    {
      zzdg();
      zzcb().zzfe();
      zzdi();
      if (this.zzxh != l) {
        this.zzxb.zzew();
      }
      return;
    }
    catch (Exception localException)
    {
      zze("Sync local dispatch failed", localException);
      zzdi();
    }
  }
  
  public final void zzdi()
  {
    zzk.zzab();
    zzch();
    boolean bool2 = this.zzxi;
    boolean bool1 = true;
    int i;
    if ((!bool2) && (zzdl() > 0L)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0)
    {
      this.zzxb.unregister();
      zzdk();
      return;
    }
    if (this.zzwz.isEmpty())
    {
      this.zzxb.unregister();
      zzdk();
      return;
    }
    if (!((Boolean)zzcc.zzzs.get()).booleanValue())
    {
      this.zzxb.zzeu();
      bool1 = this.zzxb.isConnected();
    }
    if (bool1)
    {
      zzdj();
      long l2 = zzdl();
      long l1 = zzcb().zzfd();
      if (l1 != 0L)
      {
        l1 = l2 - Math.abs(zzbt().currentTimeMillis() - l1);
        if (l1 > 0L) {}
      }
      else
      {
        l1 = Math.min(zzbu.zzdv(), l2);
      }
      zza("Dispatch scheduled (ms)", Long.valueOf(l1));
      if (this.zzxe.zzef())
      {
        l1 = Math.max(1L, l1 + this.zzxe.zzee());
        this.zzxe.zzi(l1);
        return;
      }
      this.zzxe.zzh(l1);
      return;
    }
    zzdk();
    zzdj();
  }
  
  public final void zzg(long paramLong)
  {
    zzk.zzab();
    zzch();
    long l = paramLong;
    if (paramLong < 0L) {
      l = 0L;
    }
    this.zzxd = l;
    zzdi();
  }
  
  public final void zzy(String paramString)
  {
    Preconditions.checkNotEmpty(paramString);
    zzk.zzab();
    zzv localzzv = zzdd.zza(zzbu(), paramString);
    if (localzzv == null)
    {
      zzd("Parsing failed. Ignoring invalid campaign data", paramString);
      return;
    }
    String str = zzcb().zzff();
    if (paramString.equals(str))
    {
      zzt("Ignoring duplicate install campaign");
      return;
    }
    if (!TextUtils.isEmpty(str))
    {
      zzd("Ignoring multiple install campaigns. original, new", str, paramString);
      return;
    }
    zzcb().zzac(paramString);
    if (zzcb().zzfc().zzj(zzbu.zzed()))
    {
      zzd("Campaign received too late, ignoring", localzzv);
      return;
    }
    zzb("Received installation campaign", localzzv);
    paramString = this.zzwz.zzf(0L).iterator();
    while (paramString.hasNext()) {
      zza((zzaw)paramString.next(), localzzv);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzbf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */