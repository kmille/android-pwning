package de.eplus.mappecc.client.android.common.restclient.auth;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.Response;

public class ApiKeyAuth
  implements Interceptor
{
  private String apiKey;
  private final String location;
  private final String paramName;
  
  public ApiKeyAuth(String paramString1, String paramString2)
  {
    this.location = paramString1;
    this.paramName = paramString2;
  }
  
  public String getApiKey()
  {
    return this.apiKey;
  }
  
  public String getLocation()
  {
    return this.location;
  }
  
  public String getParamName()
  {
    return this.paramName;
  }
  
  public Response intercept(Interceptor.Chain paramChain)
    throws IOException
  {
    Request localRequest = paramChain.request();
    if ("query".equals(this.location))
    {
      String str = localRequest.url().uri().getQuery();
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(this.paramName);
      ((StringBuilder)localObject).append("=");
      ((StringBuilder)localObject).append(this.apiKey);
      localObject = ((StringBuilder)localObject).toString();
      if (str != null) {
        for (;;)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(str);
          localStringBuilder.append("&");
          localStringBuilder.append((String)localObject);
          localObject = localStringBuilder.toString();
        }
      }
      try
      {
        localObject = new URI(localRequest.url().uri().getScheme(), localRequest.url().uri().getAuthority(), localRequest.url().uri().getPath(), (String)localObject, localRequest.url().uri().getFragment());
        localObject = localRequest.newBuilder().url(((URI)localObject).toURL());
      }
      catch (URISyntaxException paramChain)
      {
        throw new IOException(paramChain);
      }
    }
    else
    {
      localObject = localRequest;
      if (!"header".equals(this.location)) {
        break label227;
      }
      localObject = localRequest.newBuilder().addHeader(this.paramName, this.apiKey);
    }
    Object localObject = ((Request.Builder)localObject).build();
    label227:
    return paramChain.proceed((Request)localObject);
  }
  
  public void setApiKey(String paramString)
  {
    this.apiKey = paramString;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/auth/ApiKeyAuth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */