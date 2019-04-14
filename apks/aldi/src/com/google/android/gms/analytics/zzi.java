package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

@VisibleForTesting
public abstract class zzi<T extends zzi>
{
  public static String zza(Object paramObject)
  {
    return zza(paramObject, 0);
  }
  
  private static String zza(Object paramObject, int paramInt)
  {
    if (paramInt > 10) {
      return "ERROR: Recursive toString calls";
    }
    if (paramObject == null) {
      return "";
    }
    if ((paramObject instanceof String))
    {
      if (TextUtils.isEmpty((String)paramObject)) {
        return "";
      }
      return paramObject.toString();
    }
    if ((paramObject instanceof Integer))
    {
      if (((Integer)paramObject).intValue() == 0) {
        return "";
      }
      return paramObject.toString();
    }
    if ((paramObject instanceof Long))
    {
      if (((Long)paramObject).longValue() == 0L) {
        return "";
      }
      return paramObject.toString();
    }
    if ((paramObject instanceof Double))
    {
      if (((Double)paramObject).doubleValue() == 0.0D) {
        return "";
      }
      return paramObject.toString();
    }
    if ((paramObject instanceof Boolean))
    {
      if (!((Boolean)paramObject).booleanValue()) {
        return "";
      }
      return paramObject.toString();
    }
    StringBuilder localStringBuilder;
    int i;
    Object localObject;
    if ((paramObject instanceof List))
    {
      localStringBuilder = new StringBuilder();
      if (paramInt > 0) {
        localStringBuilder.append("[");
      }
      paramObject = (List)paramObject;
      i = localStringBuilder.length();
      paramObject = ((List)paramObject).iterator();
      while (((Iterator)paramObject).hasNext())
      {
        localObject = ((Iterator)paramObject).next();
        if (localStringBuilder.length() > i) {
          localStringBuilder.append(", ");
        }
        localStringBuilder.append(zza(localObject, paramInt + 1));
      }
      if (paramInt > 0) {
        localStringBuilder.append("]");
      }
      return localStringBuilder.toString();
    }
    if ((paramObject instanceof Map))
    {
      localStringBuilder = new StringBuilder();
      paramObject = new TreeMap((Map)paramObject).entrySet().iterator();
      int k = 0;
      i = 0;
      while (((Iterator)paramObject).hasNext())
      {
        localObject = (Map.Entry)((Iterator)paramObject).next();
        String str = zza(((Map.Entry)localObject).getValue(), paramInt + 1);
        if (!TextUtils.isEmpty(str))
        {
          int m = k;
          int j = i;
          if (paramInt > 0)
          {
            m = k;
            j = i;
            if (k == 0)
            {
              localStringBuilder.append("{");
              j = localStringBuilder.length();
              m = 1;
            }
          }
          if (localStringBuilder.length() > j) {
            localStringBuilder.append(", ");
          }
          localStringBuilder.append((String)((Map.Entry)localObject).getKey());
          localStringBuilder.append('=');
          localStringBuilder.append(str);
          k = m;
          i = j;
        }
      }
      if (k != 0) {
        localStringBuilder.append("}");
      }
      return localStringBuilder.toString();
    }
    return paramObject.toString();
  }
  
  public static String zza(Map paramMap)
  {
    return zza(paramMap, 1);
  }
  
  public abstract void zzb(T paramT);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/analytics/zzi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */