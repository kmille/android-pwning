package de.eplus.mappecc.client.android.common.restclient.endpoint;

import de.eplus.mappecc.client.android.common.restclient.endpoint.exception.InvalidEndpointException;
import okhttp3.HttpUrl;

public abstract class Endpoint
{
  public static HttpUrl get(String paramString1, String paramString2)
    throws InvalidEndpointException
  {
    return Placeholder.replace(paramString1, paramString2);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/endpoint/Endpoint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */