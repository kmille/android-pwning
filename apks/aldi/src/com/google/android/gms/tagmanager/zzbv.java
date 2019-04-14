package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzm;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

final class zzbv
  extends zzbq
{
  private static final String ID = zza.zzal.toString();
  private static final String zzbaa = zzb.zzef.toString();
  private static final String zzbac = zzb.zzik.toString();
  private static final String zzbaf = zzb.zzdv.toString();
  
  public zzbv()
  {
    super(ID, new String[] { zzbaa });
  }
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    Object localObject1 = (zzm)paramMap.get(zzbaa);
    Object localObject2;
    if ((localObject1 != null) && (localObject1 != zzgj.zzpo()))
    {
      localObject2 = zzgj.zzc((zzm)localObject1);
      localObject1 = (zzm)paramMap.get(zzbaf);
      if (localObject1 == null) {
        localObject1 = "MD5";
      } else {
        localObject1 = zzgj.zzc((zzm)localObject1);
      }
      paramMap = (zzm)paramMap.get(zzbac);
      if (paramMap == null) {
        paramMap = "text";
      } else {
        paramMap = zzgj.zzc(paramMap);
      }
      if ("text".equals(paramMap))
      {
        paramMap = ((String)localObject2).getBytes();
      }
      else
      {
        if (!"base16".equals(paramMap)) {
          break label182;
        }
        paramMap = zzo.decode((String)localObject2);
      }
    }
    try
    {
      localObject2 = MessageDigest.getInstance((String)localObject1);
      ((MessageDigest)localObject2).update(paramMap);
      paramMap = zzgj.zzj(zzo.encode(((MessageDigest)localObject2).digest()));
      return paramMap;
    }
    catch (NoSuchAlgorithmException paramMap)
    {
      label182:
      for (;;) {}
    }
    paramMap = String.valueOf(localObject1);
    if (paramMap.length() != 0) {
      paramMap = "Hash: unknown algorithm: ".concat(paramMap);
    } else {
      paramMap = new String("Hash: unknown algorithm: ");
    }
    for (;;)
    {
      zzdi.e(paramMap);
      return zzgj.zzpo();
      paramMap = String.valueOf(paramMap);
      if (paramMap.length() != 0) {
        paramMap = "Hash: unknown input format: ".concat(paramMap);
      } else {
        paramMap = new String("Hash: unknown input format: ");
      }
    }
    return zzgj.zzpo();
  }
  
  public final boolean zzmj()
  {
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzbv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */