package de.eplus.mappecc.client.android.common.restclient;

import android.content.SharedPreferences;
import de.eplus.mappecc.client.android.common.restclient.config.ConfigObject;
import de.eplus.mappecc.client.android.common.restclient.cookie.O2Cookiejar;
import de.eplus.mappecc.client.android.common.restclient.endpoint.LoginEndpoint;
import de.eplus.mappecc.client.android.common.restclient.endpoint.ServiceEndpoint;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import retrofit2.Retrofit.Builder;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public abstract class Box7RestApiLib
{
  private final ApiClient client;
  protected final ConfigObject config;
  private LoginClient loginClient;
  private O2Cookiejar o2Cookiejar;
  private OkHttpClient okHttpClient;
  
  public Box7RestApiLib(ConfigObject paramConfigObject)
  {
    this.config = paramConfigObject;
    this.client = new ApiClient();
  }
  
  public void configure()
  {
    this.o2Cookiejar = O2Cookiejar.getInstance(getUserSharedPreferences());
    this.okHttpClient = getClientBuilder().build();
    this.client.configureFromOkclient(this.okHttpClient);
    Retrofit.Builder localBuilder = new Retrofit.Builder().baseUrl(this.config.getServiceEndpoint().asUrl(this.config.getBrand())).addConverterFactory(ScalarsConverterFactory.create()).addConverterFactory(GsonCustomConverterFactory.create(new JSON().getGson()));
    this.client.setAdapterBuilder(localBuilder);
    this.loginClient = new LoginClient(this.okHttpClient, this.config.getLoginEndpoint(), this.config.useRFC2047MIMEEncoding(), this.config.getBrand());
  }
  
  public <S> S createService(Class<S> paramClass)
  {
    try
    {
      paramClass = this.client.createService(paramClass);
      return paramClass;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  public ApiClient getClient()
  {
    try
    {
      ApiClient localApiClient = this.client;
      return localApiClient;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public OkHttpClient.Builder getClientBuilder()
  {
    return new OkHttpClient.Builder().writeTimeout(20L, TimeUnit.SECONDS).readTimeout(20L, TimeUnit.SECONDS).connectTimeout(20L, TimeUnit.SECONDS).connectionSpecs(this.config.getConnectionSpecs()).addInterceptor(new Box7Interceptor(this.config)).addInterceptor(this.config.getLogging()).cookieJar(this.o2Cookiejar).retryOnConnectionFailure(true);
  }
  
  public LoginClient getLoginClient()
  {
    try
    {
      if (this.loginClient == null)
      {
        if (this.okHttpClient == null) {
          this.okHttpClient = getClientBuilder().build();
        }
        localLoginClient = new LoginClient(this.okHttpClient, this.config.getLoginEndpoint(), this.config.useRFC2047MIMEEncoding(), this.config.getBrand());
        return localLoginClient;
      }
      LoginClient localLoginClient = this.loginClient;
      return localLoginClient;
    }
    finally {}
  }
  
  public O2Cookiejar getO2Cookiejar()
  {
    return this.o2Cookiejar;
  }
  
  protected OkHttpClient getOkHttpClient()
  {
    return this.okHttpClient;
  }
  
  public abstract SharedPreferences getUserSharedPreferences();
  
  public void setLoginEndpoint(LoginEndpoint paramLoginEndpoint)
  {
    try
    {
      this.config.setLoginEndpoint(paramLoginEndpoint);
      return;
    }
    finally
    {
      paramLoginEndpoint = finally;
      throw paramLoginEndpoint;
    }
  }
  
  public void setServiceEndpoint(ServiceEndpoint paramServiceEndpoint)
  {
    try
    {
      this.config.setServiceEndpoint(paramServiceEndpoint);
      paramServiceEndpoint = new Retrofit.Builder().baseUrl(this.config.getServiceEndpoint().asUrl(this.config.getBrand())).addConverterFactory(ScalarsConverterFactory.create()).addConverterFactory(GsonCustomConverterFactory.create(new JSON().getGson()));
      this.client.setAdapterBuilder(paramServiceEndpoint);
      return;
    }
    finally
    {
      paramServiceEndpoint = finally;
      throw paramServiceEndpoint;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/Box7RestApiLib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */