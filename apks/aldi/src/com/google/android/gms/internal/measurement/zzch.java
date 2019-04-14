package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzch
{
  private final List<zzbo> zzaai;
  private final long zzaaj;
  private final long zzaak;
  private final int zzaal;
  private final boolean zzaam;
  private final String zzaan;
  private final Map<String, String> zzsm;
  
  public zzch(zzaq paramzzaq, Map<String, String> paramMap, long paramLong, boolean paramBoolean)
  {
    this(paramzzaq, paramMap, paramLong, paramBoolean, 0L, 0, null);
  }
  
  public zzch(zzaq paramzzaq, Map<String, String> paramMap, long paramLong1, boolean paramBoolean, long paramLong2, int paramInt)
  {
    this(paramzzaq, paramMap, paramLong1, paramBoolean, paramLong2, paramInt, null);
  }
  
  public zzch(zzaq paramzzaq, Map<String, String> paramMap, long paramLong1, boolean paramBoolean, long paramLong2, int paramInt, List<zzbo> paramList)
  {
    Preconditions.checkNotNull(paramzzaq);
    Preconditions.checkNotNull(paramMap);
    this.zzaak = paramLong1;
    this.zzaam = paramBoolean;
    this.zzaaj = paramLong2;
    this.zzaal = paramInt;
    if (paramList != null) {
      localObject1 = paramList;
    } else {
      localObject1 = Collections.emptyList();
    }
    this.zzaai = ((List)localObject1);
    Object localObject1 = null;
    Object localObject2;
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        localObject2 = (zzbo)paramList.next();
        if ("appendVersion".equals(((zzbo)localObject2).getId()))
        {
          paramList = ((zzbo)localObject2).getValue();
          break label125;
        }
      }
    }
    paramList = null;
    label125:
    if (TextUtils.isEmpty(paramList)) {
      paramList = (List<zzbo>)localObject1;
    }
    this.zzaan = paramList;
    paramList = new HashMap();
    localObject1 = paramMap.entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Map.Entry)((Iterator)localObject1).next();
      if (zzc(((Map.Entry)localObject2).getKey()))
      {
        String str = zza(paramzzaq, ((Map.Entry)localObject2).getKey());
        if (str != null) {
          paramList.put(str, zzb(paramzzaq, ((Map.Entry)localObject2).getValue()));
        }
      }
    }
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      localObject1 = (Map.Entry)paramMap.next();
      if (!zzc(((Map.Entry)localObject1).getKey()))
      {
        localObject2 = zza(paramzzaq, ((Map.Entry)localObject1).getKey());
        if (localObject2 != null) {
          paramList.put(localObject2, zzb(paramzzaq, ((Map.Entry)localObject1).getValue()));
        }
      }
    }
    if (!TextUtils.isEmpty(this.zzaan))
    {
      zzdd.zzb(paramList, "_v", this.zzaan);
      if ((this.zzaan.equals("ma4.0.0")) || (this.zzaan.equals("ma4.0.1"))) {
        paramList.remove("adid");
      }
    }
    this.zzsm = Collections.unmodifiableMap(paramList);
  }
  
  private static String zza(zzaq paramzzaq, Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    Object localObject = paramObject.toString();
    paramObject = localObject;
    if (((String)localObject).startsWith("&")) {
      paramObject = ((String)localObject).substring(1);
    }
    int i = ((String)paramObject).length();
    localObject = paramObject;
    if (i > 256)
    {
      localObject = ((String)paramObject).substring(0, 256);
      paramzzaq.zzc("Hit param name is too long and will be trimmed", Integer.valueOf(i), localObject);
    }
    if (TextUtils.isEmpty((CharSequence)localObject)) {
      return null;
    }
    return (String)localObject;
  }
  
  private static String zzb(zzaq paramzzaq, Object paramObject)
  {
    if (paramObject == null) {
      paramObject = "";
    } else {
      paramObject = paramObject.toString();
    }
    int i = ((String)paramObject).length();
    Object localObject = paramObject;
    if (i > 8192)
    {
      localObject = ((String)paramObject).substring(0, 8192);
      paramzzaq.zzc("Hit param value is too long and will be trimmed", Integer.valueOf(i), localObject);
    }
    return (String)localObject;
  }
  
  private static boolean zzc(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    return paramObject.toString().startsWith("&");
  }
  
  private final String zzd(String paramString1, String paramString2)
  {
    Preconditions.checkNotEmpty(paramString1);
    Preconditions.checkArgument(paramString1.startsWith("&") ^ true, "Short param name required");
    paramString1 = (String)this.zzsm.get(paramString1);
    if (paramString1 != null) {
      return paramString1;
    }
    return paramString2;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ht=");
    localStringBuilder.append(this.zzaak);
    if (this.zzaaj != 0L)
    {
      localStringBuilder.append(", dbId=");
      localStringBuilder.append(this.zzaaj);
    }
    if (this.zzaal != 0)
    {
      localStringBuilder.append(", appUID=");
      localStringBuilder.append(this.zzaal);
    }
    ArrayList localArrayList = new ArrayList(this.zzsm.keySet());
    Collections.sort(localArrayList);
    localArrayList = (ArrayList)localArrayList;
    int j = localArrayList.size();
    int i = 0;
    while (i < j)
    {
      Object localObject = localArrayList.get(i);
      i += 1;
      localObject = (String)localObject;
      localStringBuilder.append(", ");
      localStringBuilder.append((String)localObject);
      localStringBuilder.append("=");
      localStringBuilder.append((String)this.zzsm.get(localObject));
    }
    return localStringBuilder.toString();
  }
  
  public final Map<String, String> zzcs()
  {
    return this.zzsm;
  }
  
  public final int zzel()
  {
    return this.zzaal;
  }
  
  public final long zzem()
  {
    return this.zzaaj;
  }
  
  public final long zzen()
  {
    return this.zzaak;
  }
  
  public final List<zzbo> zzeo()
  {
    return this.zzaai;
  }
  
  public final boolean zzep()
  {
    return this.zzaam;
  }
  
  public final long zzeq()
  {
    return zzdd.zzaf(zzd("_s", "0"));
  }
  
  public final String zzer()
  {
    return zzd("_m", "");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */