package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;
import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Map;

final class zzea
  extends zzbq
{
  private static final String ID = zza.zzx.toString();
  
  public zzea()
  {
    super(ID, new String[0]);
  }
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    return zzgj.zzj(Build.VERSION.RELEASE);
  }
  
  public final boolean zzmj()
  {
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */