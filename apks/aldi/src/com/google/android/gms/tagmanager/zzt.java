package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Map;

final class zzt
  extends zzbq
{
  private static final String ID = zza.zzg.toString();
  private static final String VALUE = zzb.zznh.toString();
  
  public zzt()
  {
    super(ID, new String[] { VALUE });
  }
  
  public static String zzml()
  {
    return ID;
  }
  
  public static String zzmm()
  {
    return VALUE;
  }
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    return (zzm)paramMap.get(VALUE);
  }
  
  public final boolean zzmj()
  {
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */