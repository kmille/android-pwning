package de.eplus.mappecc.client.android.common.restclient.auth;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.oltu.oauth2.client.HttpClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthClientResponse;
import org.apache.oltu.oauth2.client.response.OAuthClientResponseFactory;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;

public class OAuthOkHttpClient
  implements HttpClient
{
  private OkHttpClient client;
  
  public OAuthOkHttpClient()
  {
    this.client = new OkHttpClient();
  }
  
  public OAuthOkHttpClient(OkHttpClient paramOkHttpClient)
  {
    this.client = paramOkHttpClient;
  }
  
  public <T extends OAuthClientResponse> T execute(OAuthClientRequest paramOAuthClientRequest, Map<String, String> paramMap, String paramString, Class<T> paramClass)
    throws OAuthSystemException, OAuthProblemException
  {
    MediaType localMediaType = MediaType.parse("application/json");
    Request.Builder localBuilder = new Request.Builder().url(paramOAuthClientRequest.getLocationUri());
    Object localObject = localMediaType;
    if (paramMap != null)
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      paramMap = localMediaType;
      for (;;)
      {
        localObject = paramMap;
        if (!localIterator.hasNext()) {
          break;
        }
        localObject = (Map.Entry)localIterator.next();
        if (((String)((Map.Entry)localObject).getKey()).equalsIgnoreCase("Content-Type")) {
          paramMap = MediaType.parse((String)((Map.Entry)localObject).getValue());
        } else {
          localBuilder.addHeader((String)((Map.Entry)localObject).getKey(), (String)((Map.Entry)localObject).getValue());
        }
      }
    }
    if (paramOAuthClientRequest.getBody() != null) {
      paramOAuthClientRequest = RequestBody.create((MediaType)localObject, paramOAuthClientRequest.getBody());
    } else {
      paramOAuthClientRequest = null;
    }
    localBuilder.method(paramString, paramOAuthClientRequest);
    try
    {
      paramOAuthClientRequest = this.client.newCall(localBuilder.build()).execute();
      paramOAuthClientRequest = OAuthClientResponseFactory.createCustomResponse(paramOAuthClientRequest.body().string(), paramOAuthClientRequest.body().contentType().toString(), paramOAuthClientRequest.code(), paramClass);
      return paramOAuthClientRequest;
    }
    catch (IOException paramOAuthClientRequest)
    {
      throw new OAuthSystemException(paramOAuthClientRequest);
    }
  }
  
  public void shutdown() {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/auth/OAuthOkHttpClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */