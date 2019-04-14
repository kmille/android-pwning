package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.restclient.endpoint.ServiceEndpoint;

public final class Box7APIModule_ProvidesServiceEndpointFactory
  implements Factory<ServiceEndpoint>
{
  private final Box7APIModule module;
  
  public Box7APIModule_ProvidesServiceEndpointFactory(Box7APIModule paramBox7APIModule)
  {
    this.module = paramBox7APIModule;
  }
  
  public static Box7APIModule_ProvidesServiceEndpointFactory create(Box7APIModule paramBox7APIModule)
  {
    return new Box7APIModule_ProvidesServiceEndpointFactory(paramBox7APIModule);
  }
  
  public static ServiceEndpoint provideInstance(Box7APIModule paramBox7APIModule)
  {
    return proxyProvidesServiceEndpoint(paramBox7APIModule);
  }
  
  public static ServiceEndpoint proxyProvidesServiceEndpoint(Box7APIModule paramBox7APIModule)
  {
    return (ServiceEndpoint)Preconditions.checkNotNull(paramBox7APIModule.providesServiceEndpoint(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ServiceEndpoint get()
  {
    return provideInstance(this.module);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/Box7APIModule_ProvidesServiceEndpointFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */