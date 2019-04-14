package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzm;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class zzcx
  extends zzbq
{
  private static final String ID = zza.zzan.toString();
  private static final String zzbaa = zzb.zzef.toString();
  private static final String zzbat = zzb.zzip.toString();
  private static final String zzbau = zzb.zzit.toString();
  private static final String zzbav = zzb.zzhj.toString();
  
  public zzcx()
  {
    super(ID, new String[] { zzbaa });
  }
  
  private static String zza(String paramString, Integer paramInteger, Set<Character> paramSet)
  {
    switch (zzcy.zzbaw[(paramInteger - 1)])
    {
    default: 
      return paramString;
    case 2: 
      paramString = paramString.replace("\\", "\\\\");
      Iterator localIterator = paramSet.iterator();
      while (localIterator.hasNext())
      {
        String str = ((Character)localIterator.next()).toString();
        paramSet = String.valueOf(str);
        if (paramSet.length() != 0) {
          paramSet = "\\".concat(paramSet);
        } else {
          paramSet = new String("\\");
        }
        paramString = paramString.replace(str, paramSet);
      }
      return paramString;
    }
    try
    {
      paramSet = zzgn.zzdv(paramString);
      return paramSet;
    }
    catch (UnsupportedEncodingException paramSet)
    {
      zzdi.zza("Joiner: unsupported encoding", paramSet);
    }
    return paramString;
  }
  
  private static void zza(StringBuilder paramStringBuilder, String paramString, Integer paramInteger, Set<Character> paramSet)
  {
    paramStringBuilder.append(zza(paramString, paramInteger, paramSet));
  }
  
  private static void zza(Set<Character> paramSet, String paramString)
  {
    int i = 0;
    while (i < paramString.length())
    {
      paramSet.add(Character.valueOf(paramString.charAt(i)));
      i += 1;
    }
  }
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    zzm localzzm = (zzm)paramMap.get(zzbaa);
    if (localzzm == null) {
      return zzgj.zzpo();
    }
    Object localObject1 = (zzm)paramMap.get(zzbat);
    if (localObject1 != null) {
      localObject1 = zzgj.zzc((zzm)localObject1);
    } else {
      localObject1 = "";
    }
    Object localObject2 = (zzm)paramMap.get(zzbau);
    if (localObject2 != null) {
      localObject2 = zzgj.zzc((zzm)localObject2);
    } else {
      localObject2 = "=";
    }
    int i = zzcz.zzbax;
    Object localObject3 = (zzm)paramMap.get(zzbav);
    StringBuilder localStringBuilder = null;
    paramMap = localStringBuilder;
    if (localObject3 != null)
    {
      paramMap = zzgj.zzc((zzm)localObject3);
      if ("url".equals(paramMap))
      {
        i = zzcz.zzbay;
        paramMap = localStringBuilder;
      }
      else if ("backslash".equals(paramMap))
      {
        i = zzcz.zzbaz;
        paramMap = new HashSet();
        zza(paramMap, (String)localObject1);
        zza(paramMap, (String)localObject2);
        paramMap.remove(Character.valueOf('\\'));
      }
      else
      {
        paramMap = String.valueOf(paramMap);
        if (paramMap.length() != 0) {
          paramMap = "Joiner: unsupported escape type: ".concat(paramMap);
        } else {
          paramMap = new String("Joiner: unsupported escape type: ");
        }
        zzdi.e(paramMap);
        return zzgj.zzpo();
      }
    }
    localStringBuilder = new StringBuilder();
    int k = localzzm.type;
    int j = 0;
    switch (k)
    {
    default: 
      zza(localStringBuilder, zzgj.zzc(localzzm), i, paramMap);
      break;
    case 3: 
    case 2: 
      while (j < localzzm.zzpz.length)
      {
        if (j > 0) {
          localStringBuilder.append((String)localObject1);
        }
        localObject3 = zzgj.zzc(localzzm.zzpz[j]);
        String str = zzgj.zzc(localzzm.zzqa[j]);
        zza(localStringBuilder, (String)localObject3, i, paramMap);
        localStringBuilder.append((String)localObject2);
        zza(localStringBuilder, str, i, paramMap);
        j += 1;
        continue;
        localObject2 = localzzm.zzpy;
        int m = localObject2.length;
        j = 0;
        for (k = 1; j < m; k = 0)
        {
          localzzm = localObject2[j];
          if (k == 0) {
            localStringBuilder.append((String)localObject1);
          }
          zza(localStringBuilder, zzgj.zzc(localzzm), i, paramMap);
          j += 1;
        }
      }
    }
    return zzgj.zzj(localStringBuilder.toString());
  }
  
  public final boolean zzmj()
  {
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzcx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */