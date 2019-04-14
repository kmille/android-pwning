package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@KeepForSdk
@VisibleForTesting
public final class JsonUtils
{
  private static final Pattern zzhb = Pattern.compile("\\\\.");
  private static final Pattern zzhc = Pattern.compile("[\\\\\"/\b\f\n\r\t]");
  
  @KeepForSdk
  public static boolean areJsonValuesEquivalent(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == null) && (paramObject2 == null)) {
      return true;
    }
    Iterator localIterator;
    if (paramObject1 != null)
    {
      if (paramObject2 == null) {
        return false;
      }
      if (((paramObject1 instanceof JSONObject)) && ((paramObject2 instanceof JSONObject)))
      {
        paramObject1 = (JSONObject)paramObject1;
        paramObject2 = (JSONObject)paramObject2;
        if (((JSONObject)paramObject1).length() != ((JSONObject)paramObject2).length()) {
          return false;
        }
        localIterator = ((JSONObject)paramObject1).keys();
      }
    }
    for (;;)
    {
      String str;
      if (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        if (!((JSONObject)paramObject2).has(str)) {
          return false;
        }
      }
      try
      {
        bool = areJsonValuesEquivalent(((JSONObject)paramObject1).get(str), ((JSONObject)paramObject2).get(str));
        if (!bool) {
          return false;
        }
      }
      catch (JSONException paramObject1)
      {
        boolean bool;
        int i;
        return false;
      }
    }
    return true;
    if (((paramObject1 instanceof JSONArray)) && ((paramObject2 instanceof JSONArray)))
    {
      paramObject1 = (JSONArray)paramObject1;
      paramObject2 = (JSONArray)paramObject2;
      if (((JSONArray)paramObject1).length() != ((JSONArray)paramObject2).length()) {
        return false;
      }
      i = 0;
    }
    for (;;)
    {
      if (i < ((JSONArray)paramObject1).length()) {}
      try
      {
        bool = areJsonValuesEquivalent(((JSONArray)paramObject1).get(i), ((JSONArray)paramObject2).get(i));
        if (!bool) {
          return false;
        }
        i += 1;
      }
      catch (JSONException paramObject1) {}
    }
    return true;
    return paramObject1.equals(paramObject2);
    return false;
    return false;
  }
  
  @KeepForSdk
  public static String escapeString(String paramString)
  {
    Object localObject1 = paramString;
    if (!TextUtils.isEmpty(paramString))
    {
      Matcher localMatcher = zzhc.matcher(paramString);
      localObject1 = null;
      while (localMatcher.find())
      {
        Object localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new StringBuffer();
        }
        int i = localMatcher.group().charAt(0);
        if (i != 34) {
          if (i != 47) {
            if (i != 92) {
              switch (i)
              {
              default: 
                switch (i)
                {
                default: 
                  localObject1 = localObject2;
                  break;
                case 13: 
                  localObject1 = "\\\\r";
                  break;
                case 12: 
                  localObject1 = "\\\\f";
                }
                break;
              case 10: 
                localObject1 = "\\\\n";
                break;
              case 9: 
                localObject1 = "\\\\t";
              }
            }
          }
        }
        for (;;)
        {
          localMatcher.appendReplacement((StringBuffer)localObject2, (String)localObject1);
          localObject1 = localObject2;
          break;
          localObject1 = "\\\\b";
          continue;
          localObject1 = "\\\\\\\\";
          continue;
          localObject1 = "\\\\/";
          continue;
          localObject1 = "\\\\\\\"";
        }
      }
      if (localObject1 == null) {
        return paramString;
      }
      localMatcher.appendTail((StringBuffer)localObject1);
      localObject1 = ((StringBuffer)localObject1).toString();
    }
    return (String)localObject1;
  }
  
  @KeepForSdk
  public static String unescapeString(String paramString)
  {
    Object localObject = paramString;
    if (!TextUtils.isEmpty(paramString))
    {
      String str = zzd.unescape(paramString);
      Matcher localMatcher = zzhb.matcher(str);
      for (paramString = null; localMatcher.find(); paramString = (String)localObject)
      {
        localObject = paramString;
        if (paramString == null) {
          localObject = new StringBuffer();
        }
        int i = localMatcher.group().charAt(1);
        if (i != 34)
        {
          if (i != 47)
          {
            if (i != 92)
            {
              if (i != 98)
              {
                if (i != 102)
                {
                  if (i != 110)
                  {
                    if (i != 114)
                    {
                      if (i == 116) {
                        paramString = "\t";
                      } else {
                        throw new IllegalStateException("Found an escaped character that should never be.");
                      }
                    }
                    else {
                      paramString = "\r";
                    }
                  }
                  else {
                    paramString = "\n";
                  }
                }
                else {
                  paramString = "\f";
                }
              }
              else {
                paramString = "\b";
              }
            }
            else {
              paramString = "\\\\";
            }
          }
          else {
            paramString = "/";
          }
        }
        else {
          paramString = "\"";
        }
        localMatcher.appendReplacement((StringBuffer)localObject, paramString);
      }
      if (paramString == null) {
        return str;
      }
      localMatcher.appendTail(paramString);
      localObject = paramString.toString();
    }
    return (String)localObject;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/util/JsonUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */