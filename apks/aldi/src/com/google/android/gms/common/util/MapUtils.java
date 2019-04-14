package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

@KeepForSdk
public class MapUtils
{
  @KeepForSdk
  public static void writeStringMapToJson(StringBuilder paramStringBuilder, HashMap<String, String> paramHashMap)
  {
    paramStringBuilder.append("{");
    Iterator localIterator = paramHashMap.keySet().iterator();
    int i = 1;
    if (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      if (i == 0) {
        paramStringBuilder.append(",");
      } else {
        i = 0;
      }
      String str2 = (String)paramHashMap.get(str1);
      paramStringBuilder.append("\"");
      paramStringBuilder.append(str1);
      paramStringBuilder.append("\":");
      if (str2 == null) {}
      for (str1 = "null";; str1 = "\"")
      {
        paramStringBuilder.append(str1);
        break;
        paramStringBuilder.append("\"");
        paramStringBuilder.append(str2);
      }
    }
    paramStringBuilder.append("}");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/util/MapUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */