package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

@VisibleForTesting
final class zzel
  extends zzfz
{
  private static final String ID = zza.zzbj.toString();
  private static final String zzbcj = zzb.zzii.toString();
  
  public zzel()
  {
    super(ID);
  }
  
  protected final boolean zza(String paramString1, String paramString2, Map<String, zzm> paramMap)
  {
    int i;
    if (zzgj.zzg((zzm)paramMap.get(zzbcj)).booleanValue()) {
      i = 66;
    } else {
      i = 64;
    }
    try
    {
      boolean bool = Pattern.compile(paramString2, i).matcher(paramString1).find();
      return bool;
    }
    catch (PatternSyntaxException paramString1)
    {
      for (;;) {}
    }
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */