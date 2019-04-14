package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.repository.implementation.IConsentRepository;
import de.eplus.mappecc.client.android.common.restclient.api.ConsentsApi;
import javax.inject.Provider;

public final class RepositoryModule_ProvideIConsentRepositoryFactory
  implements Factory<IConsentRepository>
{
  private final Provider<Box7Cache> box7CacheProvider;
  private final Provider<ConsentsApi> consentsApiProvider;
  private final RepositoryModule module;
  
  public RepositoryModule_ProvideIConsentRepositoryFactory(RepositoryModule paramRepositoryModule, Provider<ConsentsApi> paramProvider, Provider<Box7Cache> paramProvider1)
  {
    this.module = paramRepositoryModule;
    this.consentsApiProvider = paramProvider;
    this.box7CacheProvider = paramProvider1;
  }
  
  public static RepositoryModule_ProvideIConsentRepositoryFactory create(RepositoryModule paramRepositoryModule, Provider<ConsentsApi> paramProvider, Provider<Box7Cache> paramProvider1)
  {
    return new RepositoryModule_ProvideIConsentRepositoryFactory(paramRepositoryModule, paramProvider, paramProvider1);
  }
  
  public static IConsentRepository provideInstance(RepositoryModule paramRepositoryModule, Provider<ConsentsApi> paramProvider, Provider<Box7Cache> paramProvider1)
  {
    return proxyProvideIConsentRepository(paramRepositoryModule, (ConsentsApi)paramProvider.get(), (Box7Cache)paramProvider1.get());
  }
  
  public static IConsentRepository proxyProvideIConsentRepository(RepositoryModule paramRepositoryModule, ConsentsApi paramConsentsApi, Box7Cache paramBox7Cache)
  {
    return (IConsentRepository)Preconditions.checkNotNull(paramRepositoryModule.provideIConsentRepository(paramConsentsApi, paramBox7Cache), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final IConsentRepository get()
  {
    return provideInstance(this.module, this.consentsApiProvider, this.box7CacheProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/RepositoryModule_ProvideIConsentRepositoryFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */