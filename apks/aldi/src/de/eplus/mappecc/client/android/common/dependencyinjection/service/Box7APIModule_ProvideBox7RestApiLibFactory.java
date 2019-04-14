package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.model.Box7ClientConfig;
import de.eplus.mappecc.client.android.common.restclient.Box7RestApiLib;
import javax.inject.Provider;

public final class Box7APIModule_ProvideBox7RestApiLibFactory
  implements Factory<Box7RestApiLib>
{
  private final Provider<Box7ClientConfig> box7ClientConfigProvider;
  private final Box7APIModule module;
  
  public Box7APIModule_ProvideBox7RestApiLibFactory(Box7APIModule paramBox7APIModule, Provider<Box7ClientConfig> paramProvider)
  {
    this.module = paramBox7APIModule;
    this.box7ClientConfigProvider = paramProvider;
  }
  
  public static Box7APIModule_ProvideBox7RestApiLibFactory create(Box7APIModule paramBox7APIModule, Provider<Box7ClientConfig> paramProvider)
  {
    return new Box7APIModule_ProvideBox7RestApiLibFactory(paramBox7APIModule, paramProvider);
  }
  
  public static Box7RestApiLib provideInstance(Box7APIModule paramBox7APIModule, Provider<Box7ClientConfig> paramProvider)
  {
    return proxyProvideBox7RestApiLib(paramBox7APIModule, (Box7ClientConfig)paramProvider.get());
  }
  
  public static Box7RestApiLib proxyProvideBox7RestApiLib(Box7APIModule paramBox7APIModule, Box7ClientConfig paramBox7ClientConfig)
  {
    return (Box7RestApiLib)Preconditions.checkNotNull(paramBox7APIModule.provideBox7RestApiLib(paramBox7ClientConfig), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final Box7RestApiLib get()
  {
    return provideInstance(this.module, this.box7ClientConfigProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/Box7APIModule_ProvideBox7RestApiLibFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */