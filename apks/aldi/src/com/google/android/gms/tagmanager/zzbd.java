package com.google.android.gms.tagmanager;

import android.os.Build;
import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Map;

final class zzbd
  extends zzbq
{
  private static final String ID = zza.zzl.toString();
  
  public zzbd()
  {
    super(ID, new String[0]);
  }
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    String str2 = Build.MANUFACTURER;
    String str1 = Build.MODEL;
    paramMap = str1;
    if (!str1.startsWith(str2))
    {
      paramMap = str1;
      if (!str2.equals("unknown"))
      {
        paramMap = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str1).length());
        paramMap.append(str2);
        paramMap.append(" ");
        paramMap.append(str1);
        paramMap = paramMap.toString();
      }
    }
    return zzgj.zzj(paramMap);
  }
  
  public final boolean zzmj()
  {
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzbd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */