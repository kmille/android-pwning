package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.repository.database.B2PDatabase;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionsAuthorizedRepository;
import de.eplus.mappecc.client.android.common.restclient.api.SubscriptionsApi;
import javax.inject.Provider;

public final class RepositoryModule_ProvideISubscriptionsAuthorizedRepositoryFactory
  implements Factory<ISubscriptionsAuthorizedRepository>
{
  private final Provider<B2PDatabase> b2PDatabaseProvider;
  private final Provider<Box7Cache> box7CacheProvider;
  private final RepositoryModule module;
  private final Provider<SubscriptionsApi> subscriptionsApiProvider;
  
  public RepositoryModule_ProvideISubscriptionsAuthorizedRepositoryFactory(RepositoryModule paramRepositoryModule, Provider<Box7Cache> paramProvider, Provider<SubscriptionsApi> paramProvider1, Provider<B2PDatabase> paramProvider2)
  {
    this.module = paramRepositoryModule;
    this.box7CacheProvider = paramProvider;
    this.subscriptionsApiProvider = paramProvider1;
    this.b2PDatabaseProvider = paramProvider2;
  }
  
  public static RepositoryModule_ProvideISubscriptionsAuthorizedRepositoryFactory create(RepositoryModule paramRepositoryModule, Provider<Box7Cache> paramProvider, Provider<SubscriptionsApi> paramProvider1, Provider<B2PDatabase> paramProvider2)
  {
    return new RepositoryModule_ProvideISubscriptionsAuthorizedRepositoryFactory(paramRepositoryModule, paramProvider, paramProvider1, paramProvider2);
  }
  
  public static ISubscriptionsAuthorizedRepository provideInstance(RepositoryModule paramRepositoryModule, Provider<Box7Cache> paramProvider, Provider<SubscriptionsApi> paramProvider1, Provider<B2PDatabase> paramProvider2)
  {
    return proxyProvideISubscriptionsAuthorizedRepository(paramRepositoryModule, (Box7Cache)paramProvider.get(), (SubscriptionsApi)paramProvider1.get(), (B2PDatabase)paramProvider2.get());
  }
  
  public static ISubscriptionsAuthorizedRepository proxyProvideISubscriptionsAuthorizedRepository(RepositoryModule paramRepositoryModule, Box7Cache paramBox7Cache, SubscriptionsApi paramSubscriptionsApi, B2PDatabase paramB2PDatabase)
  {
    return (ISubscriptionsAuthorizedRepository)Preconditions.checkNotNull(paramRepositoryModule.provideISubscriptionsAuthorizedRepository(paramBox7Cache, paramSubscriptionsApi, paramB2PDatabase), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ISubscriptionsAuthorizedRepository get()
  {
    return provideInstance(this.module, this.box7CacheProvider, this.subscriptionsApiProvider, this.b2PDatabaseProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/RepositoryModule_ProvideISubscriptionsAuthorizedRepositoryFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */