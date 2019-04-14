package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzah;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzaw;
import com.google.android.gms.internal.measurement.zzbe;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzch;
import com.google.android.gms.internal.measurement.zzck;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzu;
import com.google.android.gms.internal.measurement.zzz;
import java.util.HashMap;
import java.util.Map;

final class zzp
  implements Runnable
{
  zzp(Tracker paramTracker, Map paramMap, boolean paramBoolean1, String paramString1, long paramLong, boolean paramBoolean2, boolean paramBoolean3, String paramString2) {}
  
  public final void run()
  {
    if (Tracker.zza(this.zzsz).zzad()) {
      this.zzss.put("sc", "start");
    }
    Object localObject1 = this.zzss;
    Object localObject2 = this.zzsz.zzbx();
    Preconditions.checkNotMainThread("getClientId can not be called from the main thread");
    zzdd.zzc((Map)localObject1, "cid", ((zza)localObject2).zzh().zzcn().zzdn());
    localObject1 = (String)this.zzss.get("sf");
    if (localObject1 != null)
    {
      double d = zzdd.zza((String)localObject1, 100.0D);
      if (zzdd.zza(d, (String)this.zzss.get("cid")))
      {
        this.zzsz.zzb("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d));
        return;
      }
    }
    localObject1 = Tracker.zzb(this.zzsz);
    if (this.zzst)
    {
      zzdd.zzb(this.zzss, "ate", ((zzah)localObject1).zzbc());
      zzdd.zzb(this.zzss, "adid", ((zzah)localObject1).zzbj());
    }
    else
    {
      this.zzss.remove("ate");
      this.zzss.remove("adid");
    }
    localObject1 = Tracker.zzc(this.zzsz).zzdb();
    zzdd.zzb(this.zzss, "an", ((zzu)localObject1).zzaf());
    zzdd.zzb(this.zzss, "av", ((zzu)localObject1).zzag());
    zzdd.zzb(this.zzss, "aid", ((zzu)localObject1).zzah());
    zzdd.zzb(this.zzss, "aiid", ((zzu)localObject1).zzai());
    this.zzss.put("v", "1");
    this.zzss.put("_v", zzas.zzvo);
    zzdd.zzb(this.zzss, "ul", Tracker.zzd(this.zzsz).zzeg().getLanguage());
    zzdd.zzb(this.zzss, "sr", Tracker.zze(this.zzsz).zzeh());
    int i;
    if ((!this.zzsu.equals("transaction")) && (!this.zzsu.equals("item"))) {
      i = 0;
    } else {
      i = 1;
    }
    if ((i == 0) && (!Tracker.zzf(this.zzsz).zzes()))
    {
      Tracker.zzg(this.zzsz).zza(this.zzss, "Too many hits sent too quickly, rate limiting invoked");
      return;
    }
    long l2 = zzdd.zzaf((String)this.zzss.get("ht"));
    long l1 = l2;
    if (l2 == 0L) {
      l1 = this.zzsv;
    }
    if (this.zzsw)
    {
      localObject1 = new zzch(this.zzsz, this.zzss, l1, this.zzsx);
      Tracker.zzh(this.zzsz).zzc("Dry run enabled. Would have sent hit", localObject1);
      return;
    }
    localObject1 = (String)this.zzss.get("cid");
    localObject2 = new HashMap();
    zzdd.zza((Map)localObject2, "uid", this.zzss);
    zzdd.zza((Map)localObject2, "an", this.zzss);
    zzdd.zza((Map)localObject2, "aid", this.zzss);
    zzdd.zza((Map)localObject2, "av", this.zzss);
    zzdd.zza((Map)localObject2, "aiid", this.zzss);
    localObject1 = new zzaw(0L, (String)localObject1, this.zzsy, TextUtils.isEmpty((CharSequence)this.zzss.get("adid")) ^ true, 0L, (Map)localObject2);
    l2 = Tracker.zzi(this.zzsz).zza((zzaw)localObject1);
    this.zzss.put("_s", String.valueOf(l2));
    localObject1 = new zzch(this.zzsz, this.zzss, l1, this.zzsx);
    Tracker.zzj(this.zzsz).zza((zzch)localObject1);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/analytics/zzp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */