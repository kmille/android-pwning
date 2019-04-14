package com.google.common.base;

public final class a
{
  public static String a(String paramString)
  {
    int j = paramString.length();
    int i = 0;
    while (i < j)
    {
      if (a(paramString.charAt(i)))
      {
        paramString = paramString.toCharArray();
        while (i < j)
        {
          char c = paramString[i];
          if (a(c)) {
            paramString[i] = ((char)(c ^ 0x20));
          }
          i += 1;
        }
        return String.valueOf(paramString);
      }
      i += 1;
    }
    return paramString;
  }
  
  private static boolean a(char paramChar)
  {
    return (paramChar >= 'A') && (paramChar <= 'Z');
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/base/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */