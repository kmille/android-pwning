package com.google.android.gms.tagmanager;

import android.util.Base64;
import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Map;

final class zzbk
  extends zzbq
{
  private static final String ID = zza.zzaj.toString();
  private static final String zzbaa = zzb.zzef.toString();
  private static final String zzbab = zzb.zzjr.toString();
  private static final String zzbac = zzb.zzik.toString();
  private static final String zzbad = zzb.zzkb.toString();
  
  public zzbk()
  {
    super(ID, new String[] { zzbaa });
  }
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    Object localObject = (zzm)paramMap.get(zzbaa);
    if ((localObject != null) && (localObject != zzgj.zzpo()))
    {
      String str2 = zzgj.zzc((zzm)localObject);
      localObject = (zzm)paramMap.get(zzbac);
      String str1;
      if (localObject == null) {
        str1 = "text";
      } else {
        str1 = zzgj.zzc((zzm)localObject);
      }
      localObject = (zzm)paramMap.get(zzbad);
      if (localObject == null) {
        localObject = "base16";
      } else {
        localObject = zzgj.zzc((zzm)localObject);
      }
      int j = 2;
      paramMap = (zzm)paramMap.get(zzbab);
      int i = j;
      if (paramMap != null)
      {
        i = j;
        if (zzgj.zzg(paramMap).booleanValue()) {
          i = 3;
        }
      }
      for (;;)
      {
        try
        {
          if ("text".equals(str1))
          {
            paramMap = str2.getBytes();
          }
          else if ("base16".equals(str1))
          {
            paramMap = zzo.decode(str2);
          }
          else if ("base64".equals(str1))
          {
            paramMap = Base64.decode(str2, i);
          }
          else
          {
            if (!"base64url".equals(str1)) {
              continue;
            }
            paramMap = Base64.decode(str2, i | 0x8);
          }
          if ("base16".equals(localObject))
          {
            paramMap = zzo.encode(paramMap);
          }
          else if ("base64".equals(localObject))
          {
            paramMap = Base64.encodeToString(paramMap, i);
          }
          else
          {
            if (!"base64url".equals(localObject)) {
              continue;
            }
            paramMap = Base64.encodeToString(paramMap, i | 0x8);
          }
          return zzgj.zzj(paramMap);
          paramMap = String.valueOf(localObject);
          if (paramMap.length() != 0) {
            paramMap = "Encode: unknown output format: ".concat(paramMap);
          } else {
            paramMap = new String("Encode: unknown output format: ");
          }
          zzdi.e(paramMap);
          return zzgj.zzpo();
          paramMap = String.valueOf(str1);
          if (paramMap.length() != 0) {
            paramMap = "Encode: unknown input format: ".concat(paramMap);
          } else {
            paramMap = new String("Encode: unknown input format: ");
          }
          zzdi.e(paramMap);
          paramMap = zzgj.zzpo();
          return paramMap;
        }
        catch (IllegalArgumentException paramMap)
        {
          continue;
        }
        paramMap = "Encode: invalid input:";
      }
    }
    return zzgj.zzpo();
  }
  
  public final boolean zzmj()
  {
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzbk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */