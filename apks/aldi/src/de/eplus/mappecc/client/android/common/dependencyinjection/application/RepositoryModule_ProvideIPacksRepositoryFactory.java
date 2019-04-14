package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.repository.implementation.IPacksRepository;
import de.eplus.mappecc.client.android.common.restclient.api.PacksApi;
import javax.inject.Provider;

public final class RepositoryModule_ProvideIPacksRepositoryFactory
  implements Factory<IPacksRepository>
{
  private final Provider<Box7Cache> box7CacheProvider;
  private final RepositoryModule module;
  private final Provider<PacksApi> packsApiProvider;
  
  public RepositoryModule_ProvideIPacksRepositoryFactory(RepositoryModule paramRepositoryModule, Provider<PacksApi> paramProvider, Provider<Box7Cache> paramProvider1)
  {
    this.module = paramRepositoryModule;
    this.packsApiProvider = paramProvider;
    this.box7CacheProvider = paramProvider1;
  }
  
  public static RepositoryModule_ProvideIPacksRepositoryFactory create(RepositoryModule paramRepositoryModule, Provider<PacksApi> paramProvider, Provider<Box7Cache> paramProvider1)
  {
    return new RepositoryModule_ProvideIPacksRepositoryFactory(paramRepositoryModule, paramProvider, paramProvider1);
  }
  
  public static IPacksRepository provideInstance(RepositoryModule paramRepositoryModule, Provider<PacksApi> paramProvider, Provider<Box7Cache> paramProvider1)
  {
    return proxyProvideIPacksRepository(paramRepositoryModule, (PacksApi)paramProvider.get(), (Box7Cache)paramProvider1.get());
  }
  
  public static IPacksRepository proxyProvideIPacksRepository(RepositoryModule paramRepositoryModule, PacksApi paramPacksApi, Box7Cache paramBox7Cache)
  {
    return (IPacksRepository)Preconditions.checkNotNull(paramRepositoryModule.provideIPacksRepository(paramPacksApi, paramBox7Cache), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final IPacksRepository get()
  {
    return provideInstance(this.module, this.packsApiProvider, this.box7CacheProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/RepositoryModule_ProvideIPacksRepositoryFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */