package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Map;

final class zzk
  extends zzbq
{
  private static final String ID = zza.zze.toString();
  private final Context zzqx;
  
  public zzk(Context paramContext)
  {
    super(ID, new String[0]);
    this.zzqx = paramContext;
  }
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    try
    {
      paramMap = zzgj.zzj(Integer.valueOf(this.zzqx.getPackageManager().getPackageInfo(this.zzqx.getPackageName(), 0).versionCode));
      return paramMap;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      paramMap = this.zzqx.getPackageName();
      String str = localNameNotFoundException.getMessage();
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramMap).length() + 25 + String.valueOf(str).length());
      localStringBuilder.append("Package name ");
      localStringBuilder.append(paramMap);
      localStringBuilder.append(" not found. ");
      localStringBuilder.append(str);
      zzdi.e(localStringBuilder.toString());
    }
    return zzgj.zzpo();
  }
  
  public final boolean zzmj()
  {
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */