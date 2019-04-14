package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzar;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzbe;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzck;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzdc;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzde;
import com.google.android.gms.internal.measurement.zzu;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

@VisibleForTesting
public class Tracker
  extends zzar
{
  private boolean zzsl;
  private final Map<String, String> zzsm = new HashMap();
  private final Map<String, String> zzsn = new HashMap();
  private final zzck zzso;
  private final zza zzsp;
  private ExceptionReporter zzsq;
  private zzdc zzsr;
  
  Tracker(zzat paramzzat, String paramString, zzck paramzzck)
  {
    super(paramzzat);
    if (paramString != null) {
      this.zzsm.put("&tid", paramString);
    }
    this.zzsm.put("useSecure", "1");
    this.zzsm.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
    this.zzso = new zzck("tracking", zzbt());
    this.zzsp = new zza(paramzzat);
  }
  
  private static String zza(Map.Entry<String, String> paramEntry)
  {
    String str = (String)paramEntry.getKey();
    int i;
    if ((str.startsWith("&")) && (str.length() >= 2)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return null;
    }
    return ((String)paramEntry.getKey()).substring(1);
  }
  
  private static void zza(Map<String, String> paramMap1, Map<String, String> paramMap2)
  {
    Preconditions.checkNotNull(paramMap2);
    if (paramMap1 == null) {
      return;
    }
    paramMap1 = paramMap1.entrySet().iterator();
    while (paramMap1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap1.next();
      String str = zza(localEntry);
      if (str != null) {
        paramMap2.put(str, (String)localEntry.getValue());
      }
    }
  }
  
  public void enableAdvertisingIdCollection(boolean paramBoolean)
  {
    this.zzsl = paramBoolean;
  }
  
  public void enableAutoActivityTracking(boolean paramBoolean)
  {
    this.zzsp.enableAutoActivityTracking(paramBoolean);
  }
  
  public void enableExceptionReporting(boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        if (this.zzsq != null)
        {
          bool = true;
          if (bool == paramBoolean) {
            return;
          }
          Object localObject1;
          if (paramBoolean)
          {
            localObject1 = getContext();
            this.zzsq = new ExceptionReporter(this, Thread.getDefaultUncaughtExceptionHandler(), (Context)localObject1);
            Thread.setDefaultUncaughtExceptionHandler(this.zzsq);
            localObject1 = "Uncaught exceptions will be reported to Google Analytics";
            zzq((String)localObject1);
          }
          else
          {
            Thread.setDefaultUncaughtExceptionHandler(this.zzsq.zzl());
            localObject1 = "Uncaught exceptions will not be reported to Google Analytics";
            continue;
          }
          return;
        }
      }
      finally {}
      boolean bool = false;
    }
  }
  
  public String get(String paramString)
  {
    zzch();
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    if (this.zzsm.containsKey(paramString)) {
      return (String)this.zzsm.get(paramString);
    }
    if (paramString.equals("&ul")) {
      return zzdd.zza(Locale.getDefault());
    }
    if (paramString.equals("&cid")) {
      return zzcc().zzdn();
    }
    if (paramString.equals("&sr")) {
      return zzcf().zzeh();
    }
    if (paramString.equals("&aid")) {
      return zzce().zzdb().zzah();
    }
    if (paramString.equals("&an")) {
      return zzce().zzdb().zzaf();
    }
    if (paramString.equals("&av")) {
      return zzce().zzdb().zzag();
    }
    if (paramString.equals("&aiid")) {
      return zzce().zzdb().zzai();
    }
    return null;
  }
  
  public void send(Map<String, String> paramMap)
  {
    long l = zzbt().currentTimeMillis();
    if (zzbx().getAppOptOut())
    {
      zzr("AppOptOut is set to true. Not sending Google Analytics hit");
      return;
    }
    boolean bool1 = zzbx().isDryRunEnabled();
    HashMap localHashMap = new HashMap();
    zza(this.zzsm, localHashMap);
    zza(paramMap, localHashMap);
    boolean bool2 = zzdd.zzb((String)this.zzsm.get("useSecure"), true);
    paramMap = this.zzsn;
    Preconditions.checkNotNull(localHashMap);
    if (paramMap != null)
    {
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        localObject = (Map.Entry)paramMap.next();
        String str = zza((Map.Entry)localObject);
        if ((str != null) && (!localHashMap.containsKey(str))) {
          localHashMap.put(str, (String)((Map.Entry)localObject).getValue());
        }
      }
    }
    this.zzsn.clear();
    paramMap = (String)localHashMap.get("t");
    if (TextUtils.isEmpty(paramMap))
    {
      zzbu().zza(localHashMap, "Missing hit type parameter");
      return;
    }
    Object localObject = (String)localHashMap.get("tid");
    if (TextUtils.isEmpty((CharSequence)localObject))
    {
      zzbu().zza(localHashMap, "Missing tracking id parameter");
      return;
    }
    boolean bool3 = this.zzsl;
    try
    {
      if (("screenview".equalsIgnoreCase(paramMap)) || ("pageview".equalsIgnoreCase(paramMap)) || ("appview".equalsIgnoreCase(paramMap)) || (TextUtils.isEmpty(paramMap)))
      {
        int j = Integer.parseInt((String)this.zzsm.get("&a")) + 1;
        int i = j;
        if (j >= Integer.MAX_VALUE) {
          i = 1;
        }
        this.zzsm.put("&a", Integer.toString(i));
      }
      zzbw().zza(new zzp(this, localHashMap, bool3, paramMap, l, bool1, bool2, (String)localObject));
      return;
    }
    finally {}
  }
  
  public void set(String paramString1, String paramString2)
  {
    Preconditions.checkNotNull(paramString1, "Key should be non-null");
    if (TextUtils.isEmpty(paramString1)) {
      return;
    }
    this.zzsm.put(paramString1, paramString2);
  }
  
  public void setAnonymizeIp(boolean paramBoolean)
  {
    set("&aip", zzdd.zzc(paramBoolean));
  }
  
  public void setAppId(String paramString)
  {
    set("&aid", paramString);
  }
  
  public void setAppInstallerId(String paramString)
  {
    set("&aiid", paramString);
  }
  
  public void setAppName(String paramString)
  {
    set("&an", paramString);
  }
  
  public void setAppVersion(String paramString)
  {
    set("&av", paramString);
  }
  
  public void setCampaignParamsOnNextHit(Uri paramUri)
  {
    if (paramUri != null)
    {
      if (paramUri.isOpaque()) {
        return;
      }
      paramUri = paramUri.getQueryParameter("referrer");
      if (TextUtils.isEmpty(paramUri)) {
        return;
      }
      paramUri = String.valueOf(paramUri);
      if (paramUri.length() != 0) {
        paramUri = "http://hostname/?".concat(paramUri);
      } else {
        paramUri = new String("http://hostname/?");
      }
      paramUri = Uri.parse(paramUri);
      String str = paramUri.getQueryParameter("utm_id");
      if (str != null) {
        this.zzsn.put("&ci", str);
      }
      str = paramUri.getQueryParameter("anid");
      if (str != null) {
        this.zzsn.put("&anid", str);
      }
      str = paramUri.getQueryParameter("utm_campaign");
      if (str != null) {
        this.zzsn.put("&cn", str);
      }
      str = paramUri.getQueryParameter("utm_content");
      if (str != null) {
        this.zzsn.put("&cc", str);
      }
      str = paramUri.getQueryParameter("utm_medium");
      if (str != null) {
        this.zzsn.put("&cm", str);
      }
      str = paramUri.getQueryParameter("utm_source");
      if (str != null) {
        this.zzsn.put("&cs", str);
      }
      str = paramUri.getQueryParameter("utm_term");
      if (str != null) {
        this.zzsn.put("&ck", str);
      }
      str = paramUri.getQueryParameter("dclid");
      if (str != null) {
        this.zzsn.put("&dclid", str);
      }
      str = paramUri.getQueryParameter("gclid");
      if (str != null) {
        this.zzsn.put("&gclid", str);
      }
      paramUri = paramUri.getQueryParameter("aclid");
      if (paramUri != null) {
        this.zzsn.put("&aclid", paramUri);
      }
    }
  }
  
  public void setClientId(String paramString)
  {
    set("&cid", paramString);
  }
  
  public void setEncoding(String paramString)
  {
    set("&de", paramString);
  }
  
  public void setHostname(String paramString)
  {
    set("&dh", paramString);
  }
  
  public void setLanguage(String paramString)
  {
    set("&ul", paramString);
  }
  
  public void setLocation(String paramString)
  {
    set("&dl", paramString);
  }
  
  public void setPage(String paramString)
  {
    set("&dp", paramString);
  }
  
  public void setReferrer(String paramString)
  {
    set("&dr", paramString);
  }
  
  public void setSampleRate(double paramDouble)
  {
    set("&sf", Double.toString(paramDouble));
  }
  
  public void setScreenColors(String paramString)
  {
    set("&sd", paramString);
  }
  
  public void setScreenName(String paramString)
  {
    set("&cd", paramString);
  }
  
  public void setScreenResolution(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) && (paramInt2 < 0))
    {
      zzt("Invalid width or height. The values should be non-negative.");
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder(23);
    localStringBuilder.append(paramInt1);
    localStringBuilder.append("x");
    localStringBuilder.append(paramInt2);
    set("&sr", localStringBuilder.toString());
  }
  
  public void setSessionTimeout(long paramLong)
  {
    this.zzsp.setSessionTimeout(paramLong * 1000L);
  }
  
  public void setTitle(String paramString)
  {
    set("&dt", paramString);
  }
  
  public void setUseSecure(boolean paramBoolean)
  {
    set("useSecure", zzdd.zzc(paramBoolean));
  }
  
  public void setViewportSize(String paramString)
  {
    set("&vp", paramString);
  }
  
  final void zza(zzdc paramzzdc)
  {
    zzq("Loading Tracker config values");
    this.zzsr = paramzzdc;
    paramzzdc = this.zzsr.zzabv;
    boolean bool2 = false;
    int i;
    if (paramzzdc != null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      paramzzdc = this.zzsr.zzabv;
      set("&tid", paramzzdc);
      zza("trackingId loaded", paramzzdc);
    }
    if (this.zzsr.zzabw >= 0.0D) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      paramzzdc = Double.toString(this.zzsr.zzabw);
      set("&sf", paramzzdc);
      zza("Sample frequency loaded", paramzzdc);
    }
    if (this.zzsr.zzabx >= 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      i = this.zzsr.zzabx;
      setSessionTimeout(i);
      zza("Session timeout loaded", Integer.valueOf(i));
    }
    if (this.zzsr.zzaby != -1)
    {
      if (this.zzsr.zzaby == 1) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      enableAutoActivityTracking(bool1);
      zza("Auto activity tracking loaded", Boolean.valueOf(bool1));
    }
    if (this.zzsr.zzabz != -1)
    {
      if (this.zzsr.zzabz == 1) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      if (bool1) {
        set("&aip", "1");
      }
      zza("Anonymize ip loaded", Boolean.valueOf(bool1));
    }
    boolean bool1 = bool2;
    if (this.zzsr.zzaca == 1) {
      bool1 = true;
    }
    enableExceptionReporting(bool1);
  }
  
  public final void zzac()
  {
    this.zzsp.zzm();
    String str = zzca().zzaf();
    if (str != null) {
      set("&an", str);
    }
    str = zzca().zzag();
    if (str != null) {
      set("&av", str);
    }
  }
  
  final class zza
    extends zzar
    implements GoogleAnalytics.zza
  {
    private boolean zzta;
    private int zztb;
    private long zztc = -1L;
    private boolean zztd;
    private long zzte;
    
    protected zza(zzat paramzzat)
    {
      super();
    }
    
    private final void zzae()
    {
      if ((this.zztc < 0L) && (!this.zzta))
      {
        zzbx().zzb(Tracker.zza(Tracker.this));
        return;
      }
      zzbx().zza(Tracker.zza(Tracker.this));
    }
    
    public final void enableAutoActivityTracking(boolean paramBoolean)
    {
      this.zzta = paramBoolean;
      zzae();
    }
    
    public final void setSessionTimeout(long paramLong)
    {
      this.zztc = paramLong;
      zzae();
    }
    
    public final void zzac() {}
    
    public final boolean zzad()
    {
      try
      {
        boolean bool = this.zztd;
        this.zztd = false;
        return bool;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public final void zzc(Activity paramActivity)
    {
      if (this.zztb == 0)
      {
        int i;
        if (zzbt().elapsedRealtime() >= this.zzte + Math.max(1000L, this.zztc)) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0) {
          this.zztd = true;
        }
      }
      this.zztb += 1;
      if (this.zzta)
      {
        Object localObject1 = paramActivity.getIntent();
        if (localObject1 != null) {
          Tracker.this.setCampaignParamsOnNextHit(((Intent)localObject1).getData());
        }
        HashMap localHashMap = new HashMap();
        localHashMap.put("&t", "screenview");
        Tracker localTracker = Tracker.this;
        if (Tracker.zzk(Tracker.this) != null)
        {
          Object localObject2 = Tracker.zzk(Tracker.this);
          localObject1 = paramActivity.getClass().getCanonicalName();
          localObject2 = (String)((zzdc)localObject2).zzacb.get(localObject1);
          if (localObject2 != null) {
            localObject1 = localObject2;
          }
        }
        else
        {
          localObject1 = paramActivity.getClass().getCanonicalName();
        }
        localTracker.set("&cd", (String)localObject1);
        if (TextUtils.isEmpty((CharSequence)localHashMap.get("&dr")))
        {
          Preconditions.checkNotNull(paramActivity);
          localObject1 = paramActivity.getIntent();
          paramActivity = null;
          if (localObject1 != null)
          {
            localObject1 = ((Intent)localObject1).getStringExtra("android.intent.extra.REFERRER_NAME");
            if (!TextUtils.isEmpty((CharSequence)localObject1)) {
              paramActivity = (Activity)localObject1;
            }
          }
          if (!TextUtils.isEmpty(paramActivity)) {
            localHashMap.put("&dr", paramActivity);
          }
        }
        Tracker.this.send(localHashMap);
      }
    }
    
    public final void zzd(Activity paramActivity)
    {
      this.zztb -= 1;
      this.zztb = Math.max(0, this.zztb);
      if (this.zztb == 0) {
        this.zzte = zzbt().elapsedRealtime();
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/analytics/Tracker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */