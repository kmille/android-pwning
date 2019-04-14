package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Map;

final class zzj
  extends zzbq
{
  private static final String ID = zza.zzd.toString();
  private final Context zzqx;
  
  public zzj(Context paramContext)
  {
    super(ID, new String[0]);
    this.zzqx = paramContext;
  }
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    try
    {
      paramMap = this.zzqx.getPackageManager();
      paramMap = zzgj.zzj(paramMap.getApplicationLabel(paramMap.getApplicationInfo(this.zzqx.getPackageName(), 0)).toString());
      return paramMap;
    }
    catch (PackageManager.NameNotFoundException paramMap)
    {
      zzdi.zza("App name is not found.", paramMap);
    }
    return zzgj.zzpo();
  }
  
  public final boolean zzmj()
  {
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */