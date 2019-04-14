package de.eplus.mappecc.client.android.common.restclient;

import de.eplus.mappecc.client.android.common.restclient.auth.ApiKeyAuth;
import de.eplus.mappecc.client.android.common.restclient.auth.HttpBasicAuth;
import de.eplus.mappecc.client.android.common.restclient.auth.OAuth;
import de.eplus.mappecc.client.android.common.restclient.auth.OAuth.AccessTokenListener;
import java.text.DateFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.AuthenticationRequestBuilder;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.TokenRequestBuilder;
import org.joda.time.format.DateTimeFormatter;
import retrofit2.Retrofit;
import retrofit2.Retrofit.Builder;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class ApiClient
{
  private Retrofit.Builder adapterBuilder;
  private Map<String, Interceptor> apiAuthorizations = new LinkedHashMap();
  private JSON json;
  private OkHttpClient.Builder okBuilder;
  
  public ApiClient()
  {
    createDefaultAdapter();
  }
  
  public ApiClient(String paramString)
  {
    this(new String[] { paramString });
  }
  
  public ApiClient(String paramString1, String paramString2)
  {
    this(paramString1);
    setApiKey(paramString2);
  }
  
  public ApiClient(String paramString1, String paramString2, String paramString3)
  {
    this(paramString1);
    setCredentials(paramString2, paramString3);
  }
  
  public ApiClient(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this(paramString1);
    getTokenEndPoint().setClientId(paramString2).setClientSecret(paramString3).setUsername(paramString4).setPassword(paramString5);
  }
  
  public ApiClient(String[] paramArrayOfString)
  {
    this();
    if (paramArrayOfString.length <= 0) {
      return;
    }
    paramArrayOfString = paramArrayOfString[0];
    StringBuilder localStringBuilder = new StringBuilder("auth name \"");
    localStringBuilder.append(paramArrayOfString);
    localStringBuilder.append("\" not found in available auth names");
    throw new RuntimeException(localStringBuilder.toString());
  }
  
  public ApiClient addAuthorization(String paramString, Interceptor paramInterceptor)
  {
    if (!this.apiAuthorizations.containsKey(paramString))
    {
      this.apiAuthorizations.put(paramString, paramInterceptor);
      this.okBuilder.addInterceptor(paramInterceptor);
      return this;
    }
    paramInterceptor = new StringBuilder("auth name \"");
    paramInterceptor.append(paramString);
    paramInterceptor.append("\" already in api authorizations");
    throw new RuntimeException(paramInterceptor.toString());
  }
  
  public void addAuthsToOkBuilder(OkHttpClient.Builder paramBuilder)
  {
    Iterator localIterator = this.apiAuthorizations.values().iterator();
    while (localIterator.hasNext()) {
      paramBuilder.addInterceptor((Interceptor)localIterator.next());
    }
  }
  
  public ApiClient configureAuthorizationFlow(String paramString1, String paramString2, String paramString3)
  {
    Object localObject = this.apiAuthorizations.values().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Interceptor localInterceptor = (Interceptor)((Iterator)localObject).next();
      if ((localInterceptor instanceof OAuth))
      {
        localObject = (OAuth)localInterceptor;
        ((OAuth)localObject).getTokenRequestBuilder().setClientId(paramString1).setClientSecret(paramString2).setRedirectURI(paramString3);
        ((OAuth)localObject).getAuthenticationRequestBuilder().setClientId(paramString1).setRedirectURI(paramString3);
      }
    }
    return this;
  }
  
  public void configureFromOkclient(OkHttpClient paramOkHttpClient)
  {
    this.okBuilder = paramOkHttpClient.newBuilder();
    addAuthsToOkBuilder(this.okBuilder);
  }
  
  public void createDefaultAdapter()
  {
    this.json = new JSON();
    this.okBuilder = new OkHttpClient.Builder();
    Object localObject = "https://apps.o2online.de/apps2mce/services";
    if (!"https://apps.o2online.de/apps2mce/services".endsWith("/"))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("https://apps.o2online.de/apps2mce/services");
      ((StringBuilder)localObject).append("/");
      localObject = ((StringBuilder)localObject).toString();
    }
    this.adapterBuilder = new Retrofit.Builder().baseUrl((String)localObject).addConverterFactory(ScalarsConverterFactory.create()).addConverterFactory(GsonCustomConverterFactory.create(this.json.getGson()));
  }
  
  public <S> S createService(Class<S> paramClass)
  {
    return (S)this.adapterBuilder.client(this.okBuilder.build()).build().create(paramClass);
  }
  
  public Retrofit.Builder getAdapterBuilder()
  {
    return this.adapterBuilder;
  }
  
  public Map<String, Interceptor> getApiAuthorizations()
  {
    return this.apiAuthorizations;
  }
  
  public OAuthClientRequest.AuthenticationRequestBuilder getAuthorizationEndPoint()
  {
    Iterator localIterator = this.apiAuthorizations.values().iterator();
    while (localIterator.hasNext())
    {
      Interceptor localInterceptor = (Interceptor)localIterator.next();
      if ((localInterceptor instanceof OAuth)) {
        return ((OAuth)localInterceptor).getAuthenticationRequestBuilder();
      }
    }
    return null;
  }
  
  public OkHttpClient.Builder getOkBuilder()
  {
    return this.okBuilder;
  }
  
  public OAuthClientRequest.TokenRequestBuilder getTokenEndPoint()
  {
    Iterator localIterator = this.apiAuthorizations.values().iterator();
    while (localIterator.hasNext())
    {
      Interceptor localInterceptor = (Interceptor)localIterator.next();
      if ((localInterceptor instanceof OAuth)) {
        return ((OAuth)localInterceptor).getTokenRequestBuilder();
      }
    }
    return null;
  }
  
  public ApiClient registerAccessTokenListener(OAuth.AccessTokenListener paramAccessTokenListener)
  {
    Iterator localIterator = this.apiAuthorizations.values().iterator();
    while (localIterator.hasNext())
    {
      Interceptor localInterceptor = (Interceptor)localIterator.next();
      if ((localInterceptor instanceof OAuth)) {
        ((OAuth)localInterceptor).registerAccessTokenListener(paramAccessTokenListener);
      }
    }
    return this;
  }
  
  public ApiClient setAccessToken(String paramString)
  {
    Iterator localIterator = this.apiAuthorizations.values().iterator();
    while (localIterator.hasNext())
    {
      Interceptor localInterceptor = (Interceptor)localIterator.next();
      if ((localInterceptor instanceof OAuth)) {
        ((OAuth)localInterceptor).setAccessToken(paramString);
      }
    }
    return this;
  }
  
  public ApiClient setAdapterBuilder(Retrofit.Builder paramBuilder)
  {
    this.adapterBuilder = paramBuilder;
    return this;
  }
  
  public ApiClient setApiAuthorizations(Map<String, Interceptor> paramMap)
  {
    this.apiAuthorizations = paramMap;
    return this;
  }
  
  public ApiClient setApiKey(String paramString)
  {
    Iterator localIterator = this.apiAuthorizations.values().iterator();
    while (localIterator.hasNext())
    {
      Interceptor localInterceptor = (Interceptor)localIterator.next();
      if ((localInterceptor instanceof ApiKeyAuth)) {
        ((ApiKeyAuth)localInterceptor).setApiKey(paramString);
      }
    }
    return this;
  }
  
  public ApiClient setCredentials(String paramString1, String paramString2)
  {
    Iterator localIterator = this.apiAuthorizations.values().iterator();
    while (localIterator.hasNext())
    {
      Interceptor localInterceptor = (Interceptor)localIterator.next();
      if ((localInterceptor instanceof HttpBasicAuth))
      {
        ((HttpBasicAuth)localInterceptor).setCredentials(paramString1, paramString2);
        return this;
      }
      if ((localInterceptor instanceof OAuth)) {
        ((OAuth)localInterceptor).getTokenRequestBuilder().setUsername(paramString1).setPassword(paramString2);
      }
    }
    return this;
  }
  
  public ApiClient setDateFormat(DateFormat paramDateFormat)
  {
    this.json.setDateFormat(paramDateFormat);
    return this;
  }
  
  public ApiClient setDateTimeFormat(DateTimeFormatter paramDateTimeFormatter)
  {
    this.json.setDateTimeFormat(paramDateTimeFormatter);
    return this;
  }
  
  public ApiClient setLocalDateFormat(DateTimeFormatter paramDateTimeFormatter)
  {
    this.json.setLocalDateFormat(paramDateTimeFormatter);
    return this;
  }
  
  public ApiClient setSqlDateFormat(DateFormat paramDateFormat)
  {
    this.json.setSqlDateFormat(paramDateFormat);
    return this;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/ApiClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */