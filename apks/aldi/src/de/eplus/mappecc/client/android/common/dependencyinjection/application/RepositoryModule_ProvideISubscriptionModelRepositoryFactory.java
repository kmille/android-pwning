package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionModelRepository;
import de.eplus.mappecc.client.android.common.restclient.api.SubscriptionsApi;
import javax.inject.Provider;

public final class RepositoryModule_ProvideISubscriptionModelRepositoryFactory
  implements Factory<ISubscriptionModelRepository>
{
  private final Provider<Box7Cache> box7CacheProvider;
  private final RepositoryModule module;
  private final Provider<SubscriptionsApi> subscriptionsApiProvider;
  
  public RepositoryModule_ProvideISubscriptionModelRepositoryFactory(RepositoryModule paramRepositoryModule, Provider<Box7Cache> paramProvider, Provider<SubscriptionsApi> paramProvider1)
  {
    this.module = paramRepositoryModule;
    this.box7CacheProvider = paramProvider;
    this.subscriptionsApiProvider = paramProvider1;
  }
  
  public static RepositoryModule_ProvideISubscriptionModelRepositoryFactory create(RepositoryModule paramRepositoryModule, Provider<Box7Cache> paramProvider, Provider<SubscriptionsApi> paramProvider1)
  {
    return new RepositoryModule_ProvideISubscriptionModelRepositoryFactory(paramRepositoryModule, paramProvider, paramProvider1);
  }
  
  public static ISubscriptionModelRepository provideInstance(RepositoryModule paramRepositoryModule, Provider<Box7Cache> paramProvider, Provider<SubscriptionsApi> paramProvider1)
  {
    return proxyProvideISubscriptionModelRepository(paramRepositoryModule, (Box7Cache)paramProvider.get(), (SubscriptionsApi)paramProvider1.get());
  }
  
  public static ISubscriptionModelRepository proxyProvideISubscriptionModelRepository(RepositoryModule paramRepositoryModule, Box7Cache paramBox7Cache, SubscriptionsApi paramSubscriptionsApi)
  {
    return (ISubscriptionModelRepository)Preconditions.checkNotNull(paramRepositoryModule.provideISubscriptionModelRepository(paramBox7Cache, paramSubscriptionsApi), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ISubscriptionModelRepository get()
  {
    return provideInstance(this.module, this.box7CacheProvider, this.subscriptionsApiProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/RepositoryModule_ProvideISubscriptionModelRepositoryFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */