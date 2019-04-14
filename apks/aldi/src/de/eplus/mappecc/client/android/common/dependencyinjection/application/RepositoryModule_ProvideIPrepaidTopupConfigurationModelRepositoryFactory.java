package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.repository.implementation.IPrepaidTopupConfigurationModelRepository;
import de.eplus.mappecc.client.android.common.restclient.api.TopupsApi;
import javax.inject.Provider;

public final class RepositoryModule_ProvideIPrepaidTopupConfigurationModelRepositoryFactory
  implements Factory<IPrepaidTopupConfigurationModelRepository>
{
  private final Provider<Box7Cache> box7CacheProvider;
  private final RepositoryModule module;
  private final Provider<TopupsApi> topupsApiProvider;
  
  public RepositoryModule_ProvideIPrepaidTopupConfigurationModelRepositoryFactory(RepositoryModule paramRepositoryModule, Provider<Box7Cache> paramProvider, Provider<TopupsApi> paramProvider1)
  {
    this.module = paramRepositoryModule;
    this.box7CacheProvider = paramProvider;
    this.topupsApiProvider = paramProvider1;
  }
  
  public static RepositoryModule_ProvideIPrepaidTopupConfigurationModelRepositoryFactory create(RepositoryModule paramRepositoryModule, Provider<Box7Cache> paramProvider, Provider<TopupsApi> paramProvider1)
  {
    return new RepositoryModule_ProvideIPrepaidTopupConfigurationModelRepositoryFactory(paramRepositoryModule, paramProvider, paramProvider1);
  }
  
  public static IPrepaidTopupConfigurationModelRepository provideInstance(RepositoryModule paramRepositoryModule, Provider<Box7Cache> paramProvider, Provider<TopupsApi> paramProvider1)
  {
    return proxyProvideIPrepaidTopupConfigurationModelRepository(paramRepositoryModule, (Box7Cache)paramProvider.get(), (TopupsApi)paramProvider1.get());
  }
  
  public static IPrepaidTopupConfigurationModelRepository proxyProvideIPrepaidTopupConfigurationModelRepository(RepositoryModule paramRepositoryModule, Box7Cache paramBox7Cache, TopupsApi paramTopupsApi)
  {
    return (IPrepaidTopupConfigurationModelRepository)Preconditions.checkNotNull(paramRepositoryModule.provideIPrepaidTopupConfigurationModelRepository(paramBox7Cache, paramTopupsApi), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final IPrepaidTopupConfigurationModelRepository get()
  {
    return provideInstance(this.module, this.box7CacheProvider, this.topupsApiProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/RepositoryModule_ProvideIPrepaidTopupConfigurationModelRepositoryFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */