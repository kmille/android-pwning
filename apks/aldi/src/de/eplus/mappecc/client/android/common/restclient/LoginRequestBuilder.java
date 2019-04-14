package de.eplus.mappecc.client.android.common.restclient;

import de.eplus.mappecc.client.android.common.restclient.constant.Header;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;

public class LoginRequestBuilder
{
  private static final RequestBody EMPTY_BODY = RequestBody.create(null, new byte[0]);
  private static final RequestBody EMPTY_JSON_BODY = RequestBody.create(MediaType.parse("application/json;charset=UTF-8"), "{}");
  private final Request.Builder builder = new Request.Builder();
  
  public static LoginRequestBuilder builder()
  {
    return new LoginRequestBuilder();
  }
  
  public static LoginRequestBuilder builderJSONRequest()
  {
    return builder().addEmptyPOSTBody().addHeaderContentTypeApplicationJSON();
  }
  
  public static LoginRequestBuilder builderJSONRequestEmptyJSONBody()
  {
    return builderJSONRequest().addEmptyPOSTJSONBody();
  }
  
  public LoginRequestBuilder addAcceptApiHeader()
  {
    this.builder.addHeader("Accept-API-Version", "resource=2.0, protocol=1.0");
    return this;
  }
  
  public LoginRequestBuilder addEmptyPOSTBody()
  {
    this.builder.method("POST", EMPTY_BODY);
    return this;
  }
  
  public LoginRequestBuilder addEmptyPOSTJSONBody()
  {
    this.builder.method("POST", EMPTY_JSON_BODY);
    return this;
  }
  
  public LoginRequestBuilder addHeader(String paramString1, String paramString2)
  {
    this.builder.addHeader(paramString1, paramString2);
    return this;
  }
  
  public LoginRequestBuilder addHeader(String paramString, boolean paramBoolean)
  {
    return addHeader(paramString, Boolean.toString(paramBoolean));
  }
  
  public LoginRequestBuilder addHeaderContentTypeApplicationJSON()
  {
    this.builder.addHeader("Content-Type", "application/json;charset=UTF-8");
    return this;
  }
  
  public LoginRequestBuilder addPassword(String paramString, boolean paramBoolean)
  {
    String str = Header.encode(paramString);
    Request.Builder localBuilder = this.builder;
    if (paramBoolean) {
      paramString = str;
    }
    localBuilder.addHeader("X-OpenAM-Password", paramString);
    return this;
  }
  
  public LoginRequestBuilder addRequestBody(String paramString)
  {
    this.builder.method("POST", RequestBody.create(MediaType.parse("application/json;charset=UTF-8"), paramString));
    return this;
  }
  
  public LoginRequestBuilder addUrl(String paramString)
  {
    this.builder.url(paramString.replace("//", "/"));
    return this;
  }
  
  public LoginRequestBuilder addUsername(String paramString)
  {
    this.builder.addHeader("X-OpenAM-Username", paramString);
    return this;
  }
  
  public LoginRequestBuilder addUsernamePassword(String paramString1, String paramString2, boolean paramBoolean)
  {
    return addUsername(paramString1).addPassword(paramString2, paramBoolean);
  }
  
  public Call build(OkHttpClient paramOkHttpClient)
  {
    return paramOkHttpClient.newCall(build());
  }
  
  public Request build()
  {
    return this.builder.build();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/LoginRequestBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */