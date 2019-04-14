package de.eplus.mappecc.client.android.common.restclient;

import de.eplus.mappecc.client.android.common.restclient.config.ConfigObject;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.Response;

public class Box7Interceptor
  implements Interceptor
{
  private final ConfigObject config;
  
  public Box7Interceptor(ConfigObject paramConfigObject)
  {
    this.config = paramConfigObject;
  }
  
  public Response intercept(Interceptor.Chain paramChain)
    throws IOException
  {
    Request localRequest = paramChain.request();
    Request.Builder localBuilder = localRequest.newBuilder();
    StringBuilder localStringBuilder = new StringBuilder("B2P-Whitelabel Android App for ");
    localStringBuilder.append(this.config.getBrand());
    localStringBuilder.append(" with version ");
    localStringBuilder.append(this.config.getClientVersion());
    localStringBuilder.append(this.config.getBuildModel());
    return paramChain.proceed(localBuilder.addHeader("User-Agent", localStringBuilder.toString()).addHeader("X-Box7-ClientId", this.config.getClientId()).addHeader("Accept-Language", this.config.getLanguage()).addHeader("Accept", "application/json").removeHeader("Content-Length").method(localRequest.method(), localRequest.body()).build());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/Box7Interceptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */