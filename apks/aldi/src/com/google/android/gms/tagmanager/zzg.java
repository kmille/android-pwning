package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.Map;

final class zzg
  implements DataLayer.zzb
{
  private final Context zzqx;
  
  public zzg(Context paramContext)
  {
    this.zzqx = paramContext;
  }
  
  public final void zzf(Map<String, Object> paramMap)
  {
    Object localObject2 = paramMap.get("gtm.url");
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      paramMap = paramMap.get("gtm");
      localObject1 = localObject2;
      if (paramMap != null)
      {
        localObject1 = localObject2;
        if ((paramMap instanceof Map)) {
          localObject1 = ((Map)paramMap).get("url");
        }
      }
    }
    if (localObject1 != null)
    {
      if (!(localObject1 instanceof String)) {
        return;
      }
      paramMap = Uri.parse((String)localObject1).getQueryParameter("referrer");
      if (paramMap != null) {
        zzcw.zzh(this.zzqx, paramMap);
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */