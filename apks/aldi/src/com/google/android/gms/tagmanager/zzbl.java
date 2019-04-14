package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Map;

final class zzbl
  extends zzfz
{
  private static final String ID = zza.zzbl.toString();
  
  public zzbl()
  {
    super(ID);
  }
  
  protected final boolean zza(String paramString1, String paramString2, Map<String, zzm> paramMap)
  {
    return paramString1.endsWith(paramString2);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzbl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */