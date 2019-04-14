package de.eplus.mappecc.client.android.common.restclient.auth;

import java.io.IOException;
import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.Response;

public class HttpBasicAuth
  implements Interceptor
{
  private String password;
  private String username;
  
  public String getPassword()
  {
    return this.password;
  }
  
  public String getUsername()
  {
    return this.username;
  }
  
  public Response intercept(Interceptor.Chain paramChain)
    throws IOException
  {
    Request localRequest = paramChain.request();
    Object localObject = localRequest;
    if (localRequest.header("Authorization") == null)
    {
      localObject = Credentials.basic(this.username, this.password);
      localObject = localRequest.newBuilder().addHeader("Authorization", (String)localObject).build();
    }
    return paramChain.proceed((Request)localObject);
  }
  
  public void setCredentials(String paramString1, String paramString2)
  {
    this.username = paramString1;
    this.password = paramString2;
  }
  
  public void setPassword(String paramString)
  {
    this.password = paramString;
  }
  
  public void setUsername(String paramString)
  {
    this.username = paramString;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/auth/HttpBasicAuth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */