package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.repository.implementation.IBrandTariffTypePropertyModelRepository;
import de.eplus.mappecc.client.android.common.restclient.api.MiscApi;
import javax.inject.Provider;

public final class RepositoryModule_ProvideIBrandTariffTypePropertyModelRepositoryFactory
  implements Factory<IBrandTariffTypePropertyModelRepository>
{
  private final Provider<Box7Cache> box7CacheProvider;
  private final Provider<MiscApi> miscApiProvider;
  private final RepositoryModule module;
  
  public RepositoryModule_ProvideIBrandTariffTypePropertyModelRepositoryFactory(RepositoryModule paramRepositoryModule, Provider<Box7Cache> paramProvider, Provider<MiscApi> paramProvider1)
  {
    this.module = paramRepositoryModule;
    this.box7CacheProvider = paramProvider;
    this.miscApiProvider = paramProvider1;
  }
  
  public static RepositoryModule_ProvideIBrandTariffTypePropertyModelRepositoryFactory create(RepositoryModule paramRepositoryModule, Provider<Box7Cache> paramProvider, Provider<MiscApi> paramProvider1)
  {
    return new RepositoryModule_ProvideIBrandTariffTypePropertyModelRepositoryFactory(paramRepositoryModule, paramProvider, paramProvider1);
  }
  
  public static IBrandTariffTypePropertyModelRepository provideInstance(RepositoryModule paramRepositoryModule, Provider<Box7Cache> paramProvider, Provider<MiscApi> paramProvider1)
  {
    return proxyProvideIBrandTariffTypePropertyModelRepository(paramRepositoryModule, (Box7Cache)paramProvider.get(), (MiscApi)paramProvider1.get());
  }
  
  public static IBrandTariffTypePropertyModelRepository proxyProvideIBrandTariffTypePropertyModelRepository(RepositoryModule paramRepositoryModule, Box7Cache paramBox7Cache, MiscApi paramMiscApi)
  {
    return (IBrandTariffTypePropertyModelRepository)Preconditions.checkNotNull(paramRepositoryModule.provideIBrandTariffTypePropertyModelRepository(paramBox7Cache, paramMiscApi), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final IBrandTariffTypePropertyModelRepository get()
  {
    return provideInstance(this.module, this.box7CacheProvider, this.miscApiProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/RepositoryModule_ProvideIBrandTariffTypePropertyModelRepositoryFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */