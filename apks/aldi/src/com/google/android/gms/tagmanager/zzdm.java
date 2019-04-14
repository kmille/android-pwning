package com.google.android.gms.tagmanager;

import android.content.Context;
import android.provider.Settings.Secure;
import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Map;

final class zzdm
  extends zzbq
{
  private static final String ID = zza.zzao.toString();
  private final Context zzqx;
  
  public zzdm(Context paramContext)
  {
    super(ID, new String[0]);
    this.zzqx = paramContext;
  }
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    paramMap = Settings.Secure.getString(this.zzqx.getContentResolver(), "android_id");
    if (paramMap == null) {
      return zzgj.zzpo();
    }
    return zzgj.zzj(paramMap);
  }
  
  public final boolean zzmj()
  {
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzdm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */