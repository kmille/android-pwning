package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.repository.implementation.IBalanceModelRepository;
import de.eplus.mappecc.client.android.common.restclient.api.BalancesApi;
import javax.inject.Provider;

public final class RepositoryModule_ProvideIBalanceModelRepositoryFactory
  implements Factory<IBalanceModelRepository>
{
  private final Provider<BalancesApi> balancesApiProvider;
  private final RepositoryModule module;
  
  public RepositoryModule_ProvideIBalanceModelRepositoryFactory(RepositoryModule paramRepositoryModule, Provider<BalancesApi> paramProvider)
  {
    this.module = paramRepositoryModule;
    this.balancesApiProvider = paramProvider;
  }
  
  public static RepositoryModule_ProvideIBalanceModelRepositoryFactory create(RepositoryModule paramRepositoryModule, Provider<BalancesApi> paramProvider)
  {
    return new RepositoryModule_ProvideIBalanceModelRepositoryFactory(paramRepositoryModule, paramProvider);
  }
  
  public static IBalanceModelRepository provideInstance(RepositoryModule paramRepositoryModule, Provider<BalancesApi> paramProvider)
  {
    return proxyProvideIBalanceModelRepository(paramRepositoryModule, (BalancesApi)paramProvider.get());
  }
  
  public static IBalanceModelRepository proxyProvideIBalanceModelRepository(RepositoryModule paramRepositoryModule, BalancesApi paramBalancesApi)
  {
    return (IBalanceModelRepository)Preconditions.checkNotNull(paramRepositoryModule.provideIBalanceModelRepository(paramBalancesApi), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final IBalanceModelRepository get()
  {
    return provideInstance(this.module, this.balancesApiProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/RepositoryModule_ProvideIBalanceModelRepositoryFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */