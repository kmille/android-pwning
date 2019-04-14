package de.eplus.mappecc.client.android.common.restclient.auth;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.Response;
import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.request.OAuthBearerClientRequest;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.AuthenticationRequestBuilder;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.TokenRequestBuilder;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.apache.oltu.oauth2.common.token.BasicOAuthToken;

public class OAuth
  implements Interceptor
{
  private volatile String accessToken;
  private AccessTokenListener accessTokenListener;
  private OAuthClientRequest.AuthenticationRequestBuilder authenticationRequestBuilder;
  private OAuthClient oauthClient;
  private OAuthClientRequest.TokenRequestBuilder tokenRequestBuilder;
  
  public OAuth(OAuthFlow paramOAuthFlow, String paramString1, String paramString2, String paramString3)
  {
    this(OAuthClientRequest.tokenLocation(paramString2).setScope(paramString3));
    setFlow(paramOAuthFlow);
    this.authenticationRequestBuilder = OAuthClientRequest.authorizationLocation(paramString1);
  }
  
  public OAuth(OkHttpClient paramOkHttpClient, OAuthClientRequest.TokenRequestBuilder paramTokenRequestBuilder)
  {
    this.oauthClient = new OAuthClient(new OAuthOkHttpClient(paramOkHttpClient));
    this.tokenRequestBuilder = paramTokenRequestBuilder;
  }
  
  public OAuth(OAuthClientRequest.TokenRequestBuilder paramTokenRequestBuilder)
  {
    this(new OkHttpClient(), paramTokenRequestBuilder);
  }
  
  private Response retryingIntercept(Interceptor.Chain paramChain, boolean paramBoolean)
    throws IOException
  {
    for (;;)
    {
      Object localObject2 = paramChain.request();
      if (((Request)localObject2).header("Authorization") != null) {
        return paramChain.proceed((Request)localObject2);
      }
      if (getAccessToken() == null) {
        updateAccessToken(null);
      }
      if (getAccessToken() != null)
      {
        Object localObject1 = ((Request)localObject2).newBuilder();
        String str = new String(getAccessToken());
        try
        {
          localObject2 = new OAuthBearerClientRequest(((Request)localObject2).url().toString()).setAccessToken(str).buildHeaderMessage();
          Iterator localIterator = ((OAuthClientRequest)localObject2).getHeaders().entrySet().iterator();
          while (localIterator.hasNext())
          {
            Map.Entry localEntry = (Map.Entry)localIterator.next();
            ((Request.Builder)localObject1).addHeader((String)localEntry.getKey(), (String)localEntry.getValue());
          }
          ((Request.Builder)localObject1).url(((OAuthClientRequest)localObject2).getLocationUri());
          localObject1 = paramChain.proceed(((Request.Builder)localObject1).build());
          if ((localObject1 != null) && ((((Response)localObject1).code() == 401) || (((Response)localObject1).code() == 403)) && (paramBoolean) && (updateAccessToken(str))) {
            paramBoolean = false;
          } else {
            return (Response)localObject1;
          }
        }
        catch (OAuthSystemException paramChain)
        {
          throw new IOException(paramChain);
        }
      }
    }
    return paramChain.proceed(paramChain.request());
  }
  
  public String getAccessToken()
  {
    try
    {
      String str = this.accessToken;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public OAuthClientRequest.AuthenticationRequestBuilder getAuthenticationRequestBuilder()
  {
    return this.authenticationRequestBuilder;
  }
  
  public OAuthClientRequest.TokenRequestBuilder getTokenRequestBuilder()
  {
    return this.tokenRequestBuilder;
  }
  
  public Response intercept(Interceptor.Chain paramChain)
    throws IOException
  {
    return retryingIntercept(paramChain, true);
  }
  
  public void registerAccessTokenListener(AccessTokenListener paramAccessTokenListener)
  {
    this.accessTokenListener = paramAccessTokenListener;
  }
  
  public void setAccessToken(String paramString)
  {
    try
    {
      this.accessToken = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void setAuthenticationRequestBuilder(OAuthClientRequest.AuthenticationRequestBuilder paramAuthenticationRequestBuilder)
  {
    this.authenticationRequestBuilder = paramAuthenticationRequestBuilder;
  }
  
  public void setFlow(OAuthFlow paramOAuthFlow)
  {
    OAuthClientRequest.TokenRequestBuilder localTokenRequestBuilder;
    switch (paramOAuthFlow)
    {
    default: 
      return;
    case ???: 
      this.tokenRequestBuilder.setGrantType(GrantType.CLIENT_CREDENTIALS);
      return;
    case ???: 
      localTokenRequestBuilder = this.tokenRequestBuilder;
    }
    for (paramOAuthFlow = GrantType.PASSWORD;; paramOAuthFlow = GrantType.AUTHORIZATION_CODE)
    {
      localTokenRequestBuilder.setGrantType(paramOAuthFlow);
      return;
      localTokenRequestBuilder = this.tokenRequestBuilder;
    }
  }
  
  public void setTokenRequestBuilder(OAuthClientRequest.TokenRequestBuilder paramTokenRequestBuilder)
  {
    this.tokenRequestBuilder = paramTokenRequestBuilder;
  }
  
  /* Error */
  public boolean updateAccessToken(String paramString)
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 99	de/eplus/mappecc/client/android/common/restclient/auth/OAuth:getAccessToken	()Ljava/lang/String;
    //   6: ifnull +23 -> 29
    //   9: aload_0
    //   10: invokevirtual 99	de/eplus/mappecc/client/android/common/restclient/auth/OAuth:getAccessToken	()Ljava/lang/String;
    //   13: aload_1
    //   14: invokevirtual 239	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   17: istore_2
    //   18: iload_2
    //   19: ifeq +6 -> 25
    //   22: goto +7 -> 29
    //   25: aload_0
    //   26: monitorexit
    //   27: iconst_1
    //   28: ireturn
    //   29: aload_0
    //   30: getfield 64	de/eplus/mappecc/client/android/common/restclient/auth/OAuth:oauthClient	Lorg/apache/oltu/oauth2/client/OAuthClient;
    //   33: aload_0
    //   34: getfield 66	de/eplus/mappecc/client/android/common/restclient/auth/OAuth:tokenRequestBuilder	Lorg/apache/oltu/oauth2/client/request/OAuthClientRequest$TokenRequestBuilder;
    //   37: invokevirtual 242	org/apache/oltu/oauth2/client/request/OAuthClientRequest$TokenRequestBuilder:buildBodyMessage	()Lorg/apache/oltu/oauth2/client/request/OAuthClientRequest;
    //   40: invokevirtual 245	org/apache/oltu/oauth2/client/OAuthClient:accessToken	(Lorg/apache/oltu/oauth2/client/request/OAuthClientRequest;)Lorg/apache/oltu/oauth2/client/response/OAuthJSONAccessTokenResponse;
    //   43: astore_3
    //   44: aload_3
    //   45: ifnull +62 -> 107
    //   48: aload_3
    //   49: invokevirtual 248	org/apache/oltu/oauth2/client/response/OAuthJSONAccessTokenResponse:getAccessToken	()Ljava/lang/String;
    //   52: ifnull +55 -> 107
    //   55: aload_0
    //   56: aload_3
    //   57: invokevirtual 248	org/apache/oltu/oauth2/client/response/OAuthJSONAccessTokenResponse:getAccessToken	()Ljava/lang/String;
    //   60: invokevirtual 250	de/eplus/mappecc/client/android/common/restclient/auth/OAuth:setAccessToken	(Ljava/lang/String;)V
    //   63: aload_0
    //   64: getfield 205	de/eplus/mappecc/client/android/common/restclient/auth/OAuth:accessTokenListener	Lde/eplus/mappecc/client/android/common/restclient/auth/OAuth$AccessTokenListener;
    //   67: ifnull +19 -> 86
    //   70: aload_0
    //   71: getfield 205	de/eplus/mappecc/client/android/common/restclient/auth/OAuth:accessTokenListener	Lde/eplus/mappecc/client/android/common/restclient/auth/OAuth$AccessTokenListener;
    //   74: aload_3
    //   75: invokevirtual 254	org/apache/oltu/oauth2/client/response/OAuthJSONAccessTokenResponse:getOAuthToken	()Lorg/apache/oltu/oauth2/common/token/OAuthToken;
    //   78: checkcast 256	org/apache/oltu/oauth2/common/token/BasicOAuthToken
    //   81: invokeinterface 260 2 0
    //   86: aload_0
    //   87: invokevirtual 99	de/eplus/mappecc/client/android/common/restclient/auth/OAuth:getAccessToken	()Ljava/lang/String;
    //   90: aload_1
    //   91: invokevirtual 239	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   94: istore_2
    //   95: iload_2
    //   96: ifne +7 -> 103
    //   99: aload_0
    //   100: monitorexit
    //   101: iconst_1
    //   102: ireturn
    //   103: aload_0
    //   104: monitorexit
    //   105: iconst_0
    //   106: ireturn
    //   107: aload_0
    //   108: monitorexit
    //   109: iconst_0
    //   110: ireturn
    //   111: astore_1
    //   112: new 75	java/io/IOException
    //   115: dup
    //   116: aload_1
    //   117: invokespecial 190	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   120: athrow
    //   121: astore_1
    //   122: new 75	java/io/IOException
    //   125: dup
    //   126: aload_1
    //   127: invokespecial 190	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   130: athrow
    //   131: astore_1
    //   132: aload_0
    //   133: monitorexit
    //   134: aload_1
    //   135: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	136	0	this	OAuth
    //   0	136	1	paramString	String
    //   17	79	2	bool	boolean
    //   43	32	3	localOAuthJSONAccessTokenResponse	org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse
    // Exception table:
    //   from	to	target	type
    //   29	44	111	org/apache/oltu/oauth2/common/exception/OAuthProblemException
    //   48	86	111	org/apache/oltu/oauth2/common/exception/OAuthProblemException
    //   86	95	111	org/apache/oltu/oauth2/common/exception/OAuthProblemException
    //   29	44	121	org/apache/oltu/oauth2/common/exception/OAuthSystemException
    //   48	86	121	org/apache/oltu/oauth2/common/exception/OAuthSystemException
    //   86	95	121	org/apache/oltu/oauth2/common/exception/OAuthSystemException
    //   2	18	131	finally
    //   29	44	131	finally
    //   48	86	131	finally
    //   86	95	131	finally
    //   112	121	131	finally
    //   122	131	131	finally
  }
  
  public static abstract interface AccessTokenListener
  {
    public abstract void notify(BasicOAuthToken paramBasicOAuthToken);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/auth/OAuth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */