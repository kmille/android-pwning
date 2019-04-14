package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzm;
import com.google.android.gms.internal.measurement.zzwg;
import com.google.android.gms.internal.measurement.zzwh;
import com.google.android.gms.internal.measurement.zzwi;
import com.google.android.gms.internal.measurement.zzwj;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class zzda
{
  public static zzwi zzdi(String paramString)
    throws JSONException
  {
    paramString = zzgj.zzj(zzh(new JSONObject(paramString)));
    zzwj localzzwj = zzwi.zzrz();
    int i = 0;
    while (i < paramString.zzpz.length)
    {
      localzzwj.zzc(zzwg.zzrx().zzb(zzb.zzil.toString(), paramString.zzpz[i]).zzb(zzb.zzhz.toString(), zzgj.zzds(zzt.zzml())).zzb(zzt.zzmm(), paramString.zzqa[i]).zzry());
      i += 1;
    }
    return localzzwj.zzsb();
  }
  
  @VisibleForTesting
  private static Object zzh(Object paramObject)
    throws JSONException
  {
    if (!(paramObject instanceof JSONArray))
    {
      if (!JSONObject.NULL.equals(paramObject))
      {
        if ((paramObject instanceof JSONObject))
        {
          paramObject = (JSONObject)paramObject;
          HashMap localHashMap = new HashMap();
          Iterator localIterator = ((JSONObject)paramObject).keys();
          while (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            localHashMap.put(str, zzh(((JSONObject)paramObject).get(str)));
          }
          return localHashMap;
        }
        return paramObject;
      }
      throw new RuntimeException("JSON nulls are not supported");
    }
    throw new RuntimeException("JSONArrays are not supported");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */