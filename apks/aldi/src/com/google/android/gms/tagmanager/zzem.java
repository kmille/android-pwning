package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Map;

final class zzem
  extends zzbq
{
  private static final String ID = zza.zzab.toString();
  private final Context zzqx;
  
  public zzem(Context paramContext)
  {
    super(ID, new String[0]);
    this.zzqx = paramContext;
  }
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    paramMap = new DisplayMetrics();
    ((WindowManager)this.zzqx.getSystemService("window")).getDefaultDisplay().getMetrics(paramMap);
    int i = paramMap.widthPixels;
    int j = paramMap.heightPixels;
    paramMap = new StringBuilder(23);
    paramMap.append(i);
    paramMap.append("x");
    paramMap.append(j);
    return zzgj.zzj(paramMap.toString());
  }
  
  public final boolean zzmj()
  {
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */