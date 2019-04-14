package de.eplus.mappecc.client.android.common.restclient.constant;

import org.apache.b.a.a.c;
import org.apache.b.a.a.d;
import org.apache.b.a.a.e;
import org.apache.b.a.a.e.a;
import org.apache.b.a.a.e.b;
import org.apache.b.a.b.b;

public class Header
{
  public static final String ACCEPT_API_VERSION = "Accept-API-Version";
  public static final String ACCEPT_API_VERSION_KEY_VALUE = "resource=2.0, protocol=1.0";
  public static final String CONTENT_TYPE_KEY = "Content-Type";
  public static final String CONTENT_TYPE_VALUE_APPLICATION_JSON_CHARSET_UTF_8 = "application/json;charset=UTF-8";
  public static final String X_OPEN_AM_PASSWORD = "X-OpenAM-Password";
  public static final String X_OPEN_AM_USERNAME = "X-OpenAM-Username";
  
  public static final String decode(String paramString)
  {
    return d.a(paramString, c.a);
  }
  
  public static final String encode(String paramString)
  {
    return e.a(paramString, e.b.b, b.c, e.a.a);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/constant/Header.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */