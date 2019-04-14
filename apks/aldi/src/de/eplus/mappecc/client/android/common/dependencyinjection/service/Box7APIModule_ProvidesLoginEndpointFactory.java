package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.restclient.endpoint.LoginEndpoint;

public final class Box7APIModule_ProvidesLoginEndpointFactory
  implements Factory<LoginEndpoint>
{
  private final Box7APIModule module;
  
  public Box7APIModule_ProvidesLoginEndpointFactory(Box7APIModule paramBox7APIModule)
  {
    this.module = paramBox7APIModule;
  }
  
  public static Box7APIModule_ProvidesLoginEndpointFactory create(Box7APIModule paramBox7APIModule)
  {
    return new Box7APIModule_ProvidesLoginEndpointFactory(paramBox7APIModule);
  }
  
  public static LoginEndpoint provideInstance(Box7APIModule paramBox7APIModule)
  {
    return proxyProvidesLoginEndpoint(paramBox7APIModule);
  }
  
  public static LoginEndpoint proxyProvidesLoginEndpoint(Box7APIModule paramBox7APIModule)
  {
    return (LoginEndpoint)Preconditions.checkNotNull(paramBox7APIModule.providesLoginEndpoint(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final LoginEndpoint get()
  {
    return provideInstance(this.module);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/Box7APIModule_ProvidesLoginEndpointFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */