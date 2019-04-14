package de.eplus.mappecc.client.android.common.restclient;

import de.eplus.mappecc.client.android.common.restclient.cookie.O2Cookiejar;
import de.eplus.mappecc.client.android.common.restclient.endpoint.LoginEndpoint;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import org.joda.time.DateTime;

public class LoginClient
{
  private static String logincall = "";
  private final String brand;
  private final OkHttpClient client;
  private final LoginEndpoint loginEndpoint;
  private final boolean useRFC2047MIMEEncoding;
  
  public LoginClient(OkHttpClient paramOkHttpClient, LoginEndpoint paramLoginEndpoint, boolean paramBoolean, String paramString)
  {
    this.loginEndpoint = paramLoginEndpoint;
    this.client = paramOkHttpClient.newBuilder().build();
    this.brand = paramString;
    this.useRFC2047MIMEEncoding = paramBoolean;
  }
  
  public static String getLogincall()
  {
    return logincall;
  }
  
  public void clearPersistentCookie()
  {
    ((O2Cookiejar)this.client.cookieJar()).clearCookies();
  }
  
  public Call doAutoLogin()
  {
    LoginRequestBuilder localLoginRequestBuilder = LoginRequestBuilder.builderJSONRequest();
    logincall = "networkLogin";
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.loginEndpoint.asString(this.brand));
    localStringBuilder.append("applogin/optionalautologin");
    return localLoginRequestBuilder.addUrl(localStringBuilder.toString()).addAcceptApiHeader().build(this.client);
  }
  
  public Call doHigherLogin(String paramString1, String paramString2)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(this.loginEndpoint.asString(this.brand));
    ((StringBuilder)localObject).append("applogin/higher-login");
    localObject = ((StringBuilder)localObject).toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("?sessionUpgradeSSOTokenId=");
    localStringBuilder.append(paramString1);
    paramString1 = localStringBuilder.toString();
    logincall = "higherLogin";
    return LoginRequestBuilder.builderJSONRequest().addUrl(paramString1).addPassword(paramString2, this.useRFC2047MIMEEncoding).addAcceptApiHeader().build(this.client);
  }
  
  public Call doLogin(String paramString1, String paramString2, boolean paramBoolean)
  {
    LoginRequestBuilder localLoginRequestBuilder = LoginRequestBuilder.builderJSONRequest();
    if (paramBoolean) {
      localObject = "remainOnlineLogin";
    } else {
      localObject = "manualLogin";
    }
    logincall = (String)localObject;
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(this.loginEndpoint.asString(this.brand));
    ((StringBuilder)localObject).append("applogin/login");
    localLoginRequestBuilder.addUrl(((StringBuilder)localObject).toString()).addAcceptApiHeader().addUsernamePassword(paramString1, paramString2, this.useRFC2047MIMEEncoding);
    return localLoginRequestBuilder.build(this.client);
  }
  
  public Call doLogout()
  {
    LoginRequestBuilder localLoginRequestBuilder = LoginRequestBuilder.builderJSONRequest();
    logincall = "logout";
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.loginEndpoint.asString(this.brand));
    localStringBuilder.append("applogin/logout");
    return localLoginRequestBuilder.addUrl(localStringBuilder.toString()).build(this.client);
  }
  
  public Call doOptionalPersistentLogin()
  {
    LoginRequestBuilder localLoginRequestBuilder = LoginRequestBuilder.builder();
    logincall = "optionalPersistentLogin";
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.loginEndpoint.asString(this.brand));
    localStringBuilder.append("applogin/optionalpersistentlogin");
    return localLoginRequestBuilder.addUrl(localStringBuilder.toString()).addAcceptApiHeader().addEmptyPOSTBody().build(this.client);
  }
  
  public Call doSMSLogin_finish_piranha(String paramString1, String paramString2)
  {
    LoginRequestBuilder localLoginRequestBuilder = LoginRequestBuilder.builder();
    logincall = "smsLoginFinished";
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.loginEndpoint.asString(this.brand));
    localStringBuilder.append("applogin/appHOTPlogin");
    return localLoginRequestBuilder.addUrl(localStringBuilder.toString()).addUsername(paramString1).addRequestBody(paramString2).build(this.client);
  }
  
  public Call doSMSLogin_start_piranha(String paramString)
  {
    LoginRequestBuilder localLoginRequestBuilder = LoginRequestBuilder.builderJSONRequestEmptyJSONBody();
    logincall = "smsLoginInit";
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.loginEndpoint.asString(this.brand));
    localStringBuilder.append("applogin/appHOTPlogin");
    return localLoginRequestBuilder.addUrl(localStringBuilder.toString()).addUsername(paramString).build(this.client);
  }
  
  public boolean isLoginCookieValid(DateTime paramDateTime)
  {
    return ((O2Cookiejar)this.client.cookieJar()).isCookieValid(paramDateTime);
  }
  
  public boolean isPersistentCookieValid()
  {
    return ((O2Cookiejar)this.client.cookieJar()).isPersistentOnlineCookieValid();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/LoginClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */