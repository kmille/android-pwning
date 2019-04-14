package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

final class zzek
  extends zzbq
{
  private static final String ID = zza.zzap.toString();
  private static final String zzbch = zzb.zzef.toString();
  private static final String zzbci = zzb.zzeg.toString();
  private static final String zzbcj = zzb.zzii.toString();
  private static final String zzbck = zzb.zzib.toString();
  
  public zzek()
  {
    super(ID, new String[] { zzbch, zzbci });
  }
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    Object localObject = (zzm)paramMap.get(zzbch);
    zzm localzzm = (zzm)paramMap.get(zzbci);
    int i;
    int j;
    if ((localObject != null) && (localObject != zzgj.zzpo()) && (localzzm != null) && (localzzm != zzgj.zzpo()))
    {
      i = 64;
      if (zzgj.zzg((zzm)paramMap.get(zzbcj)).booleanValue()) {
        i = 66;
      }
      j = 1;
      paramMap = (zzm)paramMap.get(zzbck);
      if (paramMap != null)
      {
        paramMap = zzgj.zze(paramMap);
        if (paramMap == zzgj.zzpj()) {
          return zzgj.zzpo();
        }
        int k = paramMap.intValue();
        j = k;
        if (k < 0) {
          return zzgj.zzpo();
        }
      }
    }
    try
    {
      paramMap = zzgj.zzc((zzm)localObject);
      localObject = zzgj.zzc(localzzm);
      localzzm = null;
      localObject = Pattern.compile((String)localObject, i).matcher(paramMap);
      paramMap = localzzm;
      if (((Matcher)localObject).find())
      {
        paramMap = localzzm;
        if (((Matcher)localObject).groupCount() >= j) {
          paramMap = ((Matcher)localObject).group(j);
        }
      }
      if (paramMap == null) {
        return zzgj.zzpo();
      }
      paramMap = zzgj.zzj(paramMap);
      return paramMap;
    }
    catch (PatternSyntaxException paramMap)
    {
      for (;;) {}
    }
    return zzgj.zzpo();
    return zzgj.zzpo();
  }
  
  public final boolean zzmj()
  {
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */