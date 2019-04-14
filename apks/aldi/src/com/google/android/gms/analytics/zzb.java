package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzab;
import com.google.android.gms.internal.measurement.zzac;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.internal.measurement.zzaf;
import com.google.android.gms.internal.measurement.zzag;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzaw;
import com.google.android.gms.internal.measurement.zzch;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzu;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.internal.measurement.zzw;
import com.google.android.gms.internal.measurement.zzx;
import com.google.android.gms.internal.measurement.zzy;
import com.google.android.gms.internal.measurement.zzz;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzb
  extends zzaq
  implements zzo
{
  private static DecimalFormat zzqq;
  private final zzat zzqm;
  private final String zzqr;
  private final Uri zzqs;
  
  public zzb(zzat paramzzat, String paramString)
  {
    this(paramzzat, paramString, true, false);
  }
  
  private zzb(zzat paramzzat, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramzzat);
    Preconditions.checkNotEmpty(paramString);
    this.zzqm = paramzzat;
    this.zzqr = paramString;
    this.zzqs = zzb(this.zzqr);
  }
  
  private static String zza(double paramDouble)
  {
    if (zzqq == null) {
      zzqq = new DecimalFormat("0.######");
    }
    return zzqq.format(paramDouble);
  }
  
  private static void zza(Map<String, String> paramMap, String paramString, double paramDouble)
  {
    if (paramDouble != 0.0D) {
      paramMap.put(paramString, zza(paramDouble));
    }
  }
  
  private static void zza(Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2)
  {
    if ((paramInt1 > 0) && (paramInt2 > 0))
    {
      StringBuilder localStringBuilder = new StringBuilder(23);
      localStringBuilder.append(paramInt1);
      localStringBuilder.append("x");
      localStringBuilder.append(paramInt2);
      paramMap.put(paramString, localStringBuilder.toString());
    }
  }
  
  private static void zza(Map<String, String> paramMap, String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString2)) {
      paramMap.put(paramString1, paramString2);
    }
  }
  
  private static void zza(Map<String, String> paramMap, String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramMap.put(paramString, "1");
    }
  }
  
  static Uri zzb(String paramString)
  {
    Preconditions.checkNotEmpty(paramString);
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme("uri");
    localBuilder.authority("google-analytics.com");
    localBuilder.path(paramString);
    return localBuilder.build();
  }
  
  @VisibleForTesting
  private static Map<String, String> zzc(zzg paramzzg)
  {
    HashMap localHashMap = new HashMap();
    Object localObject1 = (zzy)paramzzg.zza(zzy.class);
    Object localObject3;
    Object localObject4;
    if (localObject1 != null)
    {
      localObject3 = ((zzy)localObject1).zzas().entrySet().iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (Map.Entry)((Iterator)localObject3).next();
        localObject2 = ((Map.Entry)localObject4).getValue();
        localObject1 = null;
        if (localObject2 != null) {
          if ((localObject2 instanceof String))
          {
            localObject2 = (String)localObject2;
            if (!TextUtils.isEmpty((CharSequence)localObject2)) {
              localObject1 = localObject2;
            }
          }
          else if ((localObject2 instanceof Double))
          {
            localObject2 = (Double)localObject2;
            if (((Double)localObject2).doubleValue() != 0.0D) {
              localObject1 = zza(((Double)localObject2).doubleValue());
            }
          }
          else if ((localObject2 instanceof Boolean))
          {
            if (localObject2 != Boolean.FALSE) {
              localObject1 = "1";
            }
          }
          else
          {
            localObject1 = String.valueOf(localObject2);
          }
        }
        if (localObject1 != null) {
          localHashMap.put((String)((Map.Entry)localObject4).getKey(), localObject1);
        }
      }
    }
    localObject1 = (zzad)paramzzg.zza(zzad.class);
    if (localObject1 != null)
    {
      zza(localHashMap, "t", ((zzad)localObject1).zzay());
      zza(localHashMap, "cid", ((zzad)localObject1).zzaz());
      zza(localHashMap, "uid", ((zzad)localObject1).zzba());
      zza(localHashMap, "sc", ((zzad)localObject1).zzbd());
      zza(localHashMap, "sf", ((zzad)localObject1).zzbf());
      zza(localHashMap, "ni", ((zzad)localObject1).zzbe());
      zza(localHashMap, "adid", ((zzad)localObject1).zzbb());
      zza(localHashMap, "ate", ((zzad)localObject1).zzbc());
    }
    localObject1 = (zzae)paramzzg.zza(zzae.class);
    if (localObject1 != null)
    {
      zza(localHashMap, "cd", ((zzae)localObject1).zzbg());
      zza(localHashMap, "a", ((zzae)localObject1).zzbh());
      zza(localHashMap, "dr", ((zzae)localObject1).zzbi());
    }
    localObject1 = (zzab)paramzzg.zza(zzab.class);
    if (localObject1 != null)
    {
      zza(localHashMap, "ec", ((zzab)localObject1).zzax());
      zza(localHashMap, "ea", ((zzab)localObject1).getAction());
      zza(localHashMap, "el", ((zzab)localObject1).getLabel());
      zza(localHashMap, "ev", ((zzab)localObject1).getValue());
    }
    localObject1 = (zzv)paramzzg.zza(zzv.class);
    if (localObject1 != null)
    {
      zza(localHashMap, "cn", ((zzv)localObject1).getName());
      zza(localHashMap, "cs", ((zzv)localObject1).getSource());
      zza(localHashMap, "cm", ((zzv)localObject1).zzaj());
      zza(localHashMap, "ck", ((zzv)localObject1).zzak());
      zza(localHashMap, "cc", ((zzv)localObject1).zzal());
      zza(localHashMap, "ci", ((zzv)localObject1).getId());
      zza(localHashMap, "anid", ((zzv)localObject1).zzam());
      zza(localHashMap, "gclid", ((zzv)localObject1).zzan());
      zza(localHashMap, "dclid", ((zzv)localObject1).zzao());
      zza(localHashMap, "aclid", ((zzv)localObject1).zzap());
    }
    localObject1 = (zzac)paramzzg.zza(zzac.class);
    if (localObject1 != null)
    {
      zza(localHashMap, "exd", ((zzac)localObject1).zzua);
      zza(localHashMap, "exf", ((zzac)localObject1).zzub);
    }
    localObject1 = (zzaf)paramzzg.zza(zzaf.class);
    if (localObject1 != null)
    {
      zza(localHashMap, "sn", ((zzaf)localObject1).zzur);
      zza(localHashMap, "sa", ((zzaf)localObject1).zzus);
      zza(localHashMap, "st", ((zzaf)localObject1).zzut);
    }
    localObject1 = (zzag)paramzzg.zza(zzag.class);
    if (localObject1 != null)
    {
      zza(localHashMap, "utv", ((zzag)localObject1).zzuu);
      zza(localHashMap, "utt", ((zzag)localObject1).zzuv);
      zza(localHashMap, "utc", ((zzag)localObject1).mCategory);
      zza(localHashMap, "utl", ((zzag)localObject1).zzuw);
    }
    localObject1 = (zzw)paramzzg.zza(zzw.class);
    if (localObject1 != null)
    {
      localObject1 = ((zzw)localObject1).zzaq().entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        localObject3 = zzd.zzc(((Integer)((Map.Entry)localObject2).getKey()).intValue());
        if (!TextUtils.isEmpty((CharSequence)localObject3)) {
          localHashMap.put(localObject3, (String)((Map.Entry)localObject2).getValue());
        }
      }
    }
    localObject1 = (zzx)paramzzg.zza(zzx.class);
    if (localObject1 != null)
    {
      localObject1 = ((zzx)localObject1).zzar().entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        localObject3 = zzd.zze(((Integer)((Map.Entry)localObject2).getKey()).intValue());
        if (!TextUtils.isEmpty((CharSequence)localObject3)) {
          localHashMap.put(localObject3, zza(((Double)((Map.Entry)localObject2).getValue()).doubleValue()));
        }
      }
    }
    Object localObject2 = (zzaa)paramzzg.zza(zzaa.class);
    if (localObject2 != null)
    {
      localObject1 = ((zzaa)localObject2).zzat();
      if (localObject1 != null)
      {
        localObject3 = ((ProductAction)localObject1).build().entrySet().iterator();
        if (((Iterator)localObject3).hasNext())
        {
          localObject4 = (Map.Entry)((Iterator)localObject3).next();
          if (((String)((Map.Entry)localObject4).getKey()).startsWith("&")) {}
          for (localObject1 = ((String)((Map.Entry)localObject4).getKey()).substring(1);; localObject1 = (String)((Map.Entry)localObject4).getKey())
          {
            localHashMap.put(localObject1, (String)((Map.Entry)localObject4).getValue());
            break;
          }
        }
      }
      localObject1 = ((zzaa)localObject2).zzaw().iterator();
      int i = 1;
      while (((Iterator)localObject1).hasNext())
      {
        localHashMap.putAll(((Promotion)((Iterator)localObject1).next()).zzn(zzd.zzi(i)));
        i += 1;
      }
      localObject1 = ((zzaa)localObject2).zzau().iterator();
      i = 1;
      while (((Iterator)localObject1).hasNext())
      {
        localHashMap.putAll(((Product)((Iterator)localObject1).next()).zzn(zzd.zzg(i)));
        i += 1;
      }
      localObject2 = ((zzaa)localObject2).zzav().entrySet().iterator();
      i = 1;
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Map.Entry)((Iterator)localObject2).next();
        localObject1 = (List)((Map.Entry)localObject3).getValue();
        localObject4 = zzd.zzl(i);
        Iterator localIterator = ((List)localObject1).iterator();
        int j = 1;
        while (localIterator.hasNext())
        {
          Product localProduct = (Product)localIterator.next();
          localObject1 = String.valueOf(localObject4);
          String str = String.valueOf(zzd.zzj(j));
          if (str.length() != 0) {
            localObject1 = ((String)localObject1).concat(str);
          } else {
            localObject1 = new String((String)localObject1);
          }
          localHashMap.putAll(localProduct.zzn((String)localObject1));
          j += 1;
        }
        if (!TextUtils.isEmpty((CharSequence)((Map.Entry)localObject3).getKey()))
        {
          localObject1 = String.valueOf(localObject4);
          localObject4 = String.valueOf("nm");
          if (((String)localObject4).length() != 0) {
            localObject1 = ((String)localObject1).concat((String)localObject4);
          } else {
            localObject1 = new String((String)localObject1);
          }
          localHashMap.put(localObject1, (String)((Map.Entry)localObject3).getKey());
        }
        i += 1;
      }
    }
    localObject1 = (zzz)paramzzg.zza(zzz.class);
    if (localObject1 != null)
    {
      zza(localHashMap, "ul", ((zzz)localObject1).getLanguage());
      zza(localHashMap, "sd", ((zzz)localObject1).zztu);
      zza(localHashMap, "sr", ((zzz)localObject1).zztv, ((zzz)localObject1).zztw);
      zza(localHashMap, "vp", ((zzz)localObject1).zztx, ((zzz)localObject1).zzty);
    }
    paramzzg = (zzu)paramzzg.zza(zzu.class);
    if (paramzzg != null)
    {
      zza(localHashMap, "an", paramzzg.zzaf());
      zza(localHashMap, "aid", paramzzg.zzah());
      zza(localHashMap, "aiid", paramzzg.zzai());
      zza(localHashMap, "av", paramzzg.zzag());
    }
    return localHashMap;
  }
  
  public final void zzb(zzg paramzzg)
  {
    Preconditions.checkNotNull(paramzzg);
    Preconditions.checkArgument(paramzzg.zzt(), "Can't deliver not submitted measurement");
    Preconditions.checkNotMainThread("deliver should be called on worker thread");
    Object localObject1 = paramzzg.zzo();
    Object localObject2 = (zzad)((zzg)localObject1).zzb(zzad.class);
    if (TextUtils.isEmpty(((zzad)localObject2).zzay()))
    {
      zzbu().zza(zzc((zzg)localObject1), "Ignoring measurement without type");
      return;
    }
    if (TextUtils.isEmpty(((zzad)localObject2).zzaz()))
    {
      zzbu().zza(zzc((zzg)localObject1), "Ignoring measurement without client id");
      return;
    }
    if (this.zzqm.zzck().getAppOptOut()) {
      return;
    }
    double d = ((zzad)localObject2).zzbf();
    if (zzdd.zza(d, ((zzad)localObject2).zzaz()))
    {
      zzb("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d));
      return;
    }
    localObject1 = zzc((zzg)localObject1);
    ((Map)localObject1).put("v", "1");
    ((Map)localObject1).put("_v", zzas.zzvo);
    ((Map)localObject1).put("tid", this.zzqr);
    if (this.zzqm.zzck().isDryRunEnabled())
    {
      paramzzg = new StringBuilder();
      localObject1 = ((Map)localObject1).entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        if (paramzzg.length() != 0) {
          paramzzg.append(", ");
        }
        paramzzg.append((String)((Map.Entry)localObject2).getKey());
        paramzzg.append("=");
        paramzzg.append((String)((Map.Entry)localObject2).getValue());
      }
      zzc("Dry run is enabled. GoogleAnalytics would have sent", paramzzg.toString());
      return;
    }
    HashMap localHashMap = new HashMap();
    zzdd.zzb(localHashMap, "uid", ((zzad)localObject2).zzba());
    zzu localzzu = (zzu)paramzzg.zza(zzu.class);
    if (localzzu != null)
    {
      zzdd.zzb(localHashMap, "an", localzzu.zzaf());
      zzdd.zzb(localHashMap, "aid", localzzu.zzah());
      zzdd.zzb(localHashMap, "av", localzzu.zzag());
      zzdd.zzb(localHashMap, "aiid", localzzu.zzai());
    }
    localObject2 = new zzaw(0L, ((zzad)localObject2).zzaz(), this.zzqr, TextUtils.isEmpty(((zzad)localObject2).zzbb()) ^ true, 0L, localHashMap);
    ((Map)localObject1).put("_s", String.valueOf(zzby().zza((zzaw)localObject2)));
    paramzzg = new zzch(zzbu(), (Map)localObject1, paramzzg.zzr(), true);
    zzby().zza(paramzzg);
  }
  
  public final Uri zzk()
  {
    return this.zzqs;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/analytics/zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */