package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.repository.implementation.ISimcardModelRepository;
import de.eplus.mappecc.client.android.common.restclient.api.SimCardsApi;
import javax.inject.Provider;

public final class RepositoryModule_ProvideISimCardModelRepositoryFactory
  implements Factory<ISimcardModelRepository>
{
  private final Provider<Box7Cache> box7CacheProvider;
  private final RepositoryModule module;
  private final Provider<SimCardsApi> simCardsApiProvider;
  
  public RepositoryModule_ProvideISimCardModelRepositoryFactory(RepositoryModule paramRepositoryModule, Provider<Box7Cache> paramProvider, Provider<SimCardsApi> paramProvider1)
  {
    this.module = paramRepositoryModule;
    this.box7CacheProvider = paramProvider;
    this.simCardsApiProvider = paramProvider1;
  }
  
  public static RepositoryModule_ProvideISimCardModelRepositoryFactory create(RepositoryModule paramRepositoryModule, Provider<Box7Cache> paramProvider, Provider<SimCardsApi> paramProvider1)
  {
    return new RepositoryModule_ProvideISimCardModelRepositoryFactory(paramRepositoryModule, paramProvider, paramProvider1);
  }
  
  public static ISimcardModelRepository provideInstance(RepositoryModule paramRepositoryModule, Provider<Box7Cache> paramProvider, Provider<SimCardsApi> paramProvider1)
  {
    return proxyProvideISimCardModelRepository(paramRepositoryModule, (Box7Cache)paramProvider.get(), (SimCardsApi)paramProvider1.get());
  }
  
  public static ISimcardModelRepository proxyProvideISimCardModelRepository(RepositoryModule paramRepositoryModule, Box7Cache paramBox7Cache, SimCardsApi paramSimCardsApi)
  {
    return (ISimcardModelRepository)Preconditions.checkNotNull(paramRepositoryModule.provideISimCardModelRepository(paramBox7Cache, paramSimCardsApi), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ISimcardModelRepository get()
  {
    return provideInstance(this.module, this.box7CacheProvider, this.simCardsApiProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/RepositoryModule_ProvideISimCardModelRepositoryFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */