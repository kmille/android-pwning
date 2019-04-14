package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.repository.implementation.IThirdPartyServiceSettingsModelRepository;
import de.eplus.mappecc.client.android.common.restclient.api.ThirdPartyApi;
import javax.inject.Provider;

public final class RepositoryModule_ProvideIThirdPartyServiceSettingsModelRepositoryFactory
  implements Factory<IThirdPartyServiceSettingsModelRepository>
{
  private final Provider<Box7Cache> box7CacheProvider;
  private final RepositoryModule module;
  private final Provider<ThirdPartyApi> thirdPartyApiProvider;
  
  public RepositoryModule_ProvideIThirdPartyServiceSettingsModelRepositoryFactory(RepositoryModule paramRepositoryModule, Provider<Box7Cache> paramProvider, Provider<ThirdPartyApi> paramProvider1)
  {
    this.module = paramRepositoryModule;
    this.box7CacheProvider = paramProvider;
    this.thirdPartyApiProvider = paramProvider1;
  }
  
  public static RepositoryModule_ProvideIThirdPartyServiceSettingsModelRepositoryFactory create(RepositoryModule paramRepositoryModule, Provider<Box7Cache> paramProvider, Provider<ThirdPartyApi> paramProvider1)
  {
    return new RepositoryModule_ProvideIThirdPartyServiceSettingsModelRepositoryFactory(paramRepositoryModule, paramProvider, paramProvider1);
  }
  
  public static IThirdPartyServiceSettingsModelRepository provideInstance(RepositoryModule paramRepositoryModule, Provider<Box7Cache> paramProvider, Provider<ThirdPartyApi> paramProvider1)
  {
    return proxyProvideIThirdPartyServiceSettingsModelRepository(paramRepositoryModule, (Box7Cache)paramProvider.get(), (ThirdPartyApi)paramProvider1.get());
  }
  
  public static IThirdPartyServiceSettingsModelRepository proxyProvideIThirdPartyServiceSettingsModelRepository(RepositoryModule paramRepositoryModule, Box7Cache paramBox7Cache, ThirdPartyApi paramThirdPartyApi)
  {
    return (IThirdPartyServiceSettingsModelRepository)Preconditions.checkNotNull(paramRepositoryModule.provideIThirdPartyServiceSettingsModelRepository(paramBox7Cache, paramThirdPartyApi), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final IThirdPartyServiceSettingsModelRepository get()
  {
    return provideInstance(this.module, this.box7CacheProvider, this.thirdPartyApiProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/RepositoryModule_ProvideIThirdPartyServiceSettingsModelRepositoryFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */