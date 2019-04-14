package de.eplus.mappecc.client.android.common.restclient.config;

import de.eplus.mappecc.client.android.common.restclient.Box7MonitoringInterceptor;
import de.eplus.mappecc.client.android.common.restclient.endpoint.LoginEndpoint;
import de.eplus.mappecc.client.android.common.restclient.endpoint.ServiceEndpoint;
import java.util.List;
import okhttp3.ConnectionSpec;

public abstract interface ConfigObject
{
  public abstract String getBrand();
  
  public abstract String getBuildModel();
  
  public abstract String getClientId();
  
  public abstract String getClientType();
  
  public abstract String getClientVersion();
  
  public abstract List<ConnectionSpec> getConnectionSpecs();
  
  public abstract String getLanguage();
  
  public abstract Box7MonitoringInterceptor getLogging();
  
  public abstract LoginEndpoint getLoginEndpoint();
  
  public abstract ServiceEndpoint getServiceEndpoint();
  
  public abstract void setLoginEndpoint(LoginEndpoint paramLoginEndpoint);
  
  public abstract void setServiceEndpoint(ServiceEndpoint paramServiceEndpoint);
  
  public abstract boolean useRFC2047MIMEEncoding();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/config/ConfigObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */