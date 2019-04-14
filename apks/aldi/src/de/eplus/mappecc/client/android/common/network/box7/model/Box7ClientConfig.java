package de.eplus.mappecc.client.android.common.network.box7.model;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import c.a.a;
import com.google.common.collect.Lists;
import de.eplus.mappecc.client.android.BuildConfig;
import de.eplus.mappecc.client.android.common.restclient.Box7MonitoringInterceptor;
import de.eplus.mappecc.client.android.common.restclient.config.ConfigObject;
import de.eplus.mappecc.client.android.common.restclient.endpoint.LoginEndpoint;
import de.eplus.mappecc.client.android.common.restclient.endpoint.ServiceEndpoint;
import de.eplus.mappecc.client.android.common.utils.LogUtils;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import okhttp3.ConnectionSpec;
import okhttp3.ConnectionSpec.Builder;
import okhttp3.TlsVersion;
import org.apache.a.c.a.f;

public class Box7ClientConfig
  implements ConfigObject
{
  private static final String CLIENT_ID_B2P_APPS = "b2p-apps";
  private static final String CLIENT_ID_O2APPS = "o2apps";
  private static final String CLIENT_TYPE_ANDROID = "a";
  private String brand;
  private String clientId;
  private String clientType;
  private String clientVersion;
  private String language;
  private LoginEndpoint loginEndpoint;
  private final String model;
  private ServiceEndpoint serviceEndpoint;
  
  public Box7ClientConfig(@NonNull Box7ClientConfig paramBox7ClientConfig)
  {
    this.serviceEndpoint = paramBox7ClientConfig.serviceEndpoint;
    this.loginEndpoint = paramBox7ClientConfig.loginEndpoint;
    this.language = paramBox7ClientConfig.language;
    this.clientType = paramBox7ClientConfig.clientType;
    this.clientVersion = paramBox7ClientConfig.clientVersion;
    this.clientId = paramBox7ClientConfig.clientId;
    this.brand = paramBox7ClientConfig.brand;
    paramBox7ClientConfig = new StringBuilder("(");
    paramBox7ClientConfig.append(Build.MANUFACTURER);
    paramBox7ClientConfig.append(" ");
    paramBox7ClientConfig.append(Build.MODEL);
    paramBox7ClientConfig.append("; ");
    paramBox7ClientConfig.append(Build.DEVICE);
    paramBox7ClientConfig.append("; ");
    paramBox7ClientConfig.append(Build.DISPLAY);
    paramBox7ClientConfig.append("; Android ");
    paramBox7ClientConfig.append(Build.VERSION.RELEASE);
    paramBox7ClientConfig.append(" ");
    paramBox7ClientConfig.append(Build.VERSION.INCREMENTAL);
    paramBox7ClientConfig.append("; sdk ");
    paramBox7ClientConfig.append(Build.VERSION.SDK_INT);
    paramBox7ClientConfig.append(")");
    this.model = paramBox7ClientConfig.toString();
  }
  
  private Box7ClientConfig(LoginEndpoint paramLoginEndpoint, ServiceEndpoint paramServiceEndpoint, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.loginEndpoint = paramLoginEndpoint;
    this.serviceEndpoint = paramServiceEndpoint;
    this.clientId = paramString1;
    this.clientVersion = paramString2;
    this.clientType = paramString3;
    this.brand = paramString4;
    this.language = paramString5;
    paramLoginEndpoint = new StringBuilder(" ( ");
    paramLoginEndpoint.append(Build.MANUFACTURER);
    paramLoginEndpoint.append(" ");
    paramLoginEndpoint.append(Build.MODEL);
    paramLoginEndpoint.append("; ");
    paramLoginEndpoint.append(Build.DEVICE);
    paramLoginEndpoint.append("; ");
    paramLoginEndpoint.append(Build.DISPLAY);
    paramLoginEndpoint.append("; Android ");
    paramLoginEndpoint.append(Build.VERSION.RELEASE);
    paramLoginEndpoint.append(" ");
    paramLoginEndpoint.append(Build.VERSION.INCREMENTAL);
    paramLoginEndpoint.append("; sdk ");
    paramLoginEndpoint.append(Build.VERSION.SDK_INT);
    paramLoginEndpoint.append(" ) ");
    this.model = paramLoginEndpoint.toString();
  }
  
  @NonNull
  public static Box7ClientConfig fromBuildConfig()
  {
    LoginEndpoint localLoginEndpoint = BuildConfig.LOGIN_ENDPOINT;
    ServiceEndpoint localServiceEndpoint = BuildConfig.SERVICE_ENDPOINT;
    if (org.apache.a.c.h.a("alditalk", "o2")) {}
    for (String str1 = "o2apps";; str1 = "b2p-apps") {
      break;
    }
    Object localObject = getDefaultLocale();
    if (localObject == null) {
      localObject = Locale.GERMANY;
    }
    String str2 = toLanguage((Locale)localObject);
    if ("alditalk".equals("default")) {}
    for (localObject = "ayyildiz";; localObject = "alditalk") {
      break;
    }
    return new Box7ClientConfig(localLoginEndpoint, localServiceEndpoint, str1, "6.2.1", "a", (String)localObject, str2);
  }
  
  @NonNull
  public static Box7ClientConfig fromBuildConfig(LoginEndpoint paramLoginEndpoint, ServiceEndpoint paramServiceEndpoint)
  {
    Box7ClientConfig localBox7ClientConfig = fromBuildConfig();
    localBox7ClientConfig.setLoginEndpoint(paramLoginEndpoint);
    localBox7ClientConfig.setServiceEndpoint(paramServiceEndpoint);
    return localBox7ClientConfig;
  }
  
  private static Locale getDefaultLocale()
  {
    Locale localLocale1 = Locale.getDefault();
    try
    {
      Locale localLocale2 = Resources.getSystem().getConfiguration().locale;
      return localLocale2;
    }
    catch (Exception localException)
    {
      a.c(localException, "getDefaultLocale", new Object[0]);
    }
    return localLocale1;
  }
  
  private static String toLanguage(@NonNull Locale paramLocale)
  {
    return paramLocale.toString().toLowerCase().replace("_", "-");
  }
  
  public String getBrand()
  {
    return this.brand;
  }
  
  public String getBuildModel()
  {
    return this.model;
  }
  
  public String getClientId()
  {
    return this.clientId;
  }
  
  public String getClientType()
  {
    return this.clientType;
  }
  
  public String getClientVersion()
  {
    return this.clientVersion;
  }
  
  public List<ConnectionSpec> getConnectionSpecs()
  {
    LinkedList localLinkedList = Lists.b();
    localLinkedList.add(new ConnectionSpec.Builder(ConnectionSpec.COMPATIBLE_TLS).allEnabledCipherSuites().allEnabledTlsVersions().build());
    if (Build.VERSION.SDK_INT >= 21) {
      localLinkedList.add(new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(new TlsVersion[] { TlsVersion.TLS_1_2 }).allEnabledCipherSuites().allEnabledTlsVersions().build());
    }
    localLinkedList.add(new ConnectionSpec.Builder(ConnectionSpec.CLEARTEXT).build());
    a.f("Warning allowing non SSL-Connection %s", new Object[] { localLinkedList });
    return localLinkedList;
  }
  
  public String getLanguage()
  {
    return this.language;
  }
  
  public Box7MonitoringInterceptor getLogging()
  {
    return LogUtils.getLogging("RESTCalls");
  }
  
  public LoginEndpoint getLoginEndpoint()
  {
    return this.loginEndpoint;
  }
  
  public ServiceEndpoint getServiceEndpoint()
  {
    return this.serviceEndpoint;
  }
  
  public void setBrand(String paramString)
  {
    this.brand = paramString;
  }
  
  public void setClientId(String paramString)
  {
    this.clientId = paramString;
  }
  
  public void setClientType(String paramString)
  {
    this.clientType = paramString;
  }
  
  public void setClientVersion(String paramString)
  {
    this.clientVersion = paramString;
  }
  
  public void setLanguage(@NonNull Locale paramLocale)
  {
    this.language = toLanguage(paramLocale);
  }
  
  public void setLoginEndpoint(LoginEndpoint paramLoginEndpoint)
  {
    this.loginEndpoint = paramLoginEndpoint;
  }
  
  public void setServiceEndpoint(ServiceEndpoint paramServiceEndpoint)
  {
    this.serviceEndpoint = paramServiceEndpoint;
  }
  
  public String toString()
  {
    return f.a(this, org.apache.a.c.a.h.g);
  }
  
  public boolean useRFC2047MIMEEncoding()
  {
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/model/Box7ClientConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */