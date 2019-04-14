package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.repository.implementation.ILoginAccountModelRepository;
import de.eplus.mappecc.client.android.common.restclient.api.LoginAccountsApi;
import javax.inject.Provider;

public final class RepositoryModule_ProvideILoginAccountModelRepositoryFactory
  implements Factory<ILoginAccountModelRepository>
{
  private final Provider<LoginAccountsApi> loginAccountsApiProvider;
  private final RepositoryModule module;
  
  public RepositoryModule_ProvideILoginAccountModelRepositoryFactory(RepositoryModule paramRepositoryModule, Provider<LoginAccountsApi> paramProvider)
  {
    this.module = paramRepositoryModule;
    this.loginAccountsApiProvider = paramProvider;
  }
  
  public static RepositoryModule_ProvideILoginAccountModelRepositoryFactory create(RepositoryModule paramRepositoryModule, Provider<LoginAccountsApi> paramProvider)
  {
    return new RepositoryModule_ProvideILoginAccountModelRepositoryFactory(paramRepositoryModule, paramProvider);
  }
  
  public static ILoginAccountModelRepository provideInstance(RepositoryModule paramRepositoryModule, Provider<LoginAccountsApi> paramProvider)
  {
    return proxyProvideILoginAccountModelRepository(paramRepositoryModule, (LoginAccountsApi)paramProvider.get());
  }
  
  public static ILoginAccountModelRepository proxyProvideILoginAccountModelRepository(RepositoryModule paramRepositoryModule, LoginAccountsApi paramLoginAccountsApi)
  {
    return (ILoginAccountModelRepository)Preconditions.checkNotNull(paramRepositoryModule.provideILoginAccountModelRepository(paramLoginAccountsApi), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ILoginAccountModelRepository get()
  {
    return provideInstance(this.module, this.loginAccountsApiProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/RepositoryModule_ProvideILoginAccountModelRepositoryFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */