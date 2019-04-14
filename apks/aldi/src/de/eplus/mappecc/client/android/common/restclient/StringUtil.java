package de.eplus.mappecc.client.android.common.restclient;

import android.support.annotation.Nullable;
import org.apache.a.c.h;

public class StringUtil
{
  @Nullable
  public static String blockFormatter(int paramInt, @Nullable String paramString)
  {
    if (paramString == null) {
      return null;
    }
    if (paramInt <= 0) {
      return paramString;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    paramString = h.b(paramString);
    int m = paramString.length();
    int j = 0;
    int i = 0;
    while (j < m)
    {
      int k = i;
      if (i >= paramInt)
      {
        localStringBuilder.append(" ");
        k = 0;
      }
      localStringBuilder.append(paramString.charAt(j));
      i = k + 1;
      j += 1;
    }
    return localStringBuilder.toString();
  }
  
  public static boolean containsIgnoreCase(String[] paramArrayOfString, String paramString)
  {
    int j = paramArrayOfString.length;
    int i = 0;
    while (i < j)
    {
      String str = paramArrayOfString[i];
      if ((paramString == null) && (str == null)) {
        return true;
      }
      if ((paramString != null) && (paramString.equalsIgnoreCase(str))) {
        return true;
      }
      i += 1;
    }
    return false;
  }
  
  @Nullable
  public static String fourBlockFormatter(@Nullable String paramString)
  {
    return blockFormatter(4, paramString);
  }
  
  public static String join(String[] paramArrayOfString, String paramString)
  {
    int j = paramArrayOfString.length;
    if (j == 0) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramArrayOfString[0]);
    int i = 1;
    while (i < j)
    {
      localStringBuilder.append(paramString);
      localStringBuilder.append(paramArrayOfString[i]);
      i += 1;
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/StringUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */