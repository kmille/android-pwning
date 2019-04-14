package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.model.Box7ClientConfig;
import de.eplus.mappecc.client.android.common.restclient.endpoint.LoginEndpoint;
import de.eplus.mappecc.client.android.common.restclient.endpoint.ServiceEndpoint;
import javax.inject.Provider;

public final class Box7APIModule_ProvidesBox7ClientConfigFactory
  implements Factory<Box7ClientConfig>
{
  private final Provider<LoginEndpoint> loginEndpointProvider;
  private final Box7APIModule module;
  private final Provider<ServiceEndpoint> serviceEndpointProvider;
  
  public Box7APIModule_ProvidesBox7ClientConfigFactory(Box7APIModule paramBox7APIModule, Provider<LoginEndpoint> paramProvider, Provider<ServiceEndpoint> paramProvider1)
  {
    this.module = paramBox7APIModule;
    this.loginEndpointProvider = paramProvider;
    this.serviceEndpointProvider = paramProvider1;
  }
  
  public static Box7APIModule_ProvidesBox7ClientConfigFactory create(Box7APIModule paramBox7APIModule, Provider<LoginEndpoint> paramProvider, Provider<ServiceEndpoint> paramProvider1)
  {
    return new Box7APIModule_ProvidesBox7ClientConfigFactory(paramBox7APIModule, paramProvider, paramProvider1);
  }
  
  public static Box7ClientConfig provideInstance(Box7APIModule paramBox7APIModule, Provider<LoginEndpoint> paramProvider, Provider<ServiceEndpoint> paramProvider1)
  {
    return proxyProvidesBox7ClientConfig(paramBox7APIModule, (LoginEndpoint)paramProvider.get(), (ServiceEndpoint)paramProvider1.get());
  }
  
  public static Box7ClientConfig proxyProvidesBox7ClientConfig(Box7APIModule paramBox7APIModule, LoginEndpoint paramLoginEndpoint, ServiceEndpoint paramServiceEndpoint)
  {
    return (Box7ClientConfig)Preconditions.checkNotNull(paramBox7APIModule.providesBox7ClientConfig(paramLoginEndpoint, paramServiceEndpoint), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final Box7ClientConfig get()
  {
    return provideInstance(this.module, this.loginEndpointProvider, this.serviceEndpointProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/Box7APIModule_ProvidesBox7ClientConfigFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */