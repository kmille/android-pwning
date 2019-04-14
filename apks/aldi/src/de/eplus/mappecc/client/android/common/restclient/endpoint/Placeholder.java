package de.eplus.mappecc.client.android.common.restclient.endpoint;

import okhttp3.HttpUrl;

public abstract class Placeholder
{
  public static final String BRAND = "{brand}";
  
  public static HttpUrl replace(String paramString1, String paramString2)
  {
    return HttpUrl.parse(paramString1.replace("{brand}", replaceBrand(paramString2)));
  }
  
  private static String replaceBrand(String paramString)
  {
    int i = paramString.hashCode();
    if (i != -1253967074)
    {
      if (i != 3491)
      {
        if ((i == 1578464924) && (paramString.equals("alditalk")))
        {
          i = 0;
          break label71;
        }
      }
      else if (paramString.equals("o2"))
      {
        i = 1;
        break label71;
      }
    }
    else if (paramString.equals("normamobil"))
    {
      i = 2;
      break label71;
    }
    i = -1;
    switch (i)
    {
    default: 
      return paramString;
    case 2: 
      return "norma-mobil";
    case 1: 
      label71:
      return "o2online";
    }
    return "alditalk-kundenbetreuung";
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/endpoint/Placeholder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */