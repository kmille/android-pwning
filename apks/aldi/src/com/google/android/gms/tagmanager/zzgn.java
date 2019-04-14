package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzm;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

final class zzgn
{
  private static zzdz<zzm> zza(zzdz<zzm> paramzzdz)
  {
    try
    {
      zzdz localzzdz = new zzdz(zzgj.zzj(zzdv(zzgj.zzc((zzm)paramzzdz.getObject()))), paramzzdz.zzog());
      return localzzdz;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      zzdi.zza("Escape URI: unsupported encoding", localUnsupportedEncodingException);
    }
    return paramzzdz;
  }
  
  static zzdz<zzm> zza(zzdz<zzm> paramzzdz, int... paramVarArgs)
  {
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      int k = paramVarArgs[i];
      if (!(zzgj.zzh((zzm)paramzzdz.getObject()) instanceof String)) {}
      for (Object localObject = "Escaping can only be applied to strings.";; localObject = ((StringBuilder)localObject).toString())
      {
        zzdi.e((String)localObject);
        break label92;
        if (k == 12) {
          break;
        }
        localObject = new StringBuilder(39);
        ((StringBuilder)localObject).append("Unsupported Value Escaping: ");
        ((StringBuilder)localObject).append(k);
      }
      paramzzdz = zza(paramzzdz);
      label92:
      i += 1;
    }
    return paramzzdz;
  }
  
  static String zzdv(String paramString)
    throws UnsupportedEncodingException
  {
    return URLEncoder.encode(paramString, "UTF-8").replaceAll("\\+", "%20");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzgn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */