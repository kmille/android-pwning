package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.net.Uri.Builder;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzb;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class zzm
  extends zzgh
{
  private static final String ID = zza.zzbu.toString();
  private static final String URL = zzb.zzmz.toString();
  private static final String zzaxg = zzb.zzds.toString();
  private static final String zzaxh = zzb.zzmy.toString();
  private static final String zzaxi;
  private static final Set<String> zzaxj = new HashSet();
  private final zza zzaxk;
  private final Context zzqx;
  
  static
  {
    String str = ID;
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 17);
    localStringBuilder.append("gtm_");
    localStringBuilder.append(str);
    localStringBuilder.append("_unrepeatable");
    zzaxi = localStringBuilder.toString();
  }
  
  public zzm(Context paramContext)
  {
    this(paramContext, new zzn(paramContext));
  }
  
  @VisibleForTesting
  private zzm(Context paramContext, zza paramzza)
  {
    super(ID, new String[] { URL });
    this.zzaxk = paramzza;
    this.zzqx = paramContext;
  }
  
  private final boolean zzco(String paramString)
  {
    try
    {
      boolean bool = zzaxj.contains(paramString);
      if (bool) {
        return true;
      }
      if (this.zzqx.getSharedPreferences(zzaxi, 0).contains(paramString))
      {
        zzaxj.add(paramString);
        return true;
      }
      return false;
    }
    finally {}
  }
  
  public final void zzg(Map<String, com.google.android.gms.internal.measurement.zzm> paramMap)
  {
    String str;
    if (paramMap.get(zzaxh) != null) {
      str = zzgj.zzc((com.google.android.gms.internal.measurement.zzm)paramMap.get(zzaxh));
    } else {
      str = null;
    }
    if ((str != null) && (zzco(str))) {
      return;
    }
    Uri.Builder localBuilder = Uri.parse(zzgj.zzc((com.google.android.gms.internal.measurement.zzm)paramMap.get(URL))).buildUpon();
    paramMap = (com.google.android.gms.internal.measurement.zzm)paramMap.get(zzaxg);
    if (paramMap != null)
    {
      paramMap = zzgj.zzh(paramMap);
      if (!(paramMap instanceof List))
      {
        paramMap = String.valueOf(localBuilder.build().toString());
        if (paramMap.length() != 0) {
          paramMap = "ArbitraryPixel: additional params not a list: not sending partial hit: ".concat(paramMap);
        } else {
          paramMap = new String("ArbitraryPixel: additional params not a list: not sending partial hit: ");
        }
        zzdi.e(paramMap);
        return;
      }
      paramMap = ((List)paramMap).iterator();
      while (paramMap.hasNext())
      {
        Object localObject = paramMap.next();
        if (!(localObject instanceof Map))
        {
          paramMap = String.valueOf(localBuilder.build().toString());
          if (paramMap.length() != 0) {
            paramMap = "ArbitraryPixel: additional params contains non-map: not sending partial hit: ".concat(paramMap);
          } else {
            paramMap = new String("ArbitraryPixel: additional params contains non-map: not sending partial hit: ");
          }
          zzdi.e(paramMap);
          return;
        }
        localObject = ((Map)localObject).entrySet().iterator();
        while (((Iterator)localObject).hasNext())
        {
          Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
          localBuilder.appendQueryParameter(localEntry.getKey().toString(), localEntry.getValue().toString());
        }
      }
    }
    paramMap = localBuilder.build().toString();
    this.zzaxk.zzmk().zzdb(paramMap);
    paramMap = String.valueOf(paramMap);
    if (paramMap.length() != 0) {
      paramMap = "ArbitraryPixel: url = ".concat(paramMap);
    } else {
      paramMap = new String("ArbitraryPixel: url = ");
    }
    zzdi.v(paramMap);
    if (str != null) {
      try
      {
        zzaxj.add(str);
        zzft.zza(this.zzqx, zzaxi, str, "true");
        return;
      }
      finally {}
    }
  }
  
  public static abstract interface zza
  {
    public abstract zzbx zzmk();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */