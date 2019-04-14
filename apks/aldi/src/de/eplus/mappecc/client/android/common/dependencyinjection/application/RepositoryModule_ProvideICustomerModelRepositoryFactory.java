package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.repository.implementation.ICustomerModelRepository;
import de.eplus.mappecc.client.android.common.restclient.api.CustomersApi;
import javax.inject.Provider;

public final class RepositoryModule_ProvideICustomerModelRepositoryFactory
  implements Factory<ICustomerModelRepository>
{
  private final Provider<Box7Cache> box7CacheProvider;
  private final Provider<CustomersApi> customersApiProvider;
  private final RepositoryModule module;
  
  public RepositoryModule_ProvideICustomerModelRepositoryFactory(RepositoryModule paramRepositoryModule, Provider<Box7Cache> paramProvider, Provider<CustomersApi> paramProvider1)
  {
    this.module = paramRepositoryModule;
    this.box7CacheProvider = paramProvider;
    this.customersApiProvider = paramProvider1;
  }
  
  public static RepositoryModule_ProvideICustomerModelRepositoryFactory create(RepositoryModule paramRepositoryModule, Provider<Box7Cache> paramProvider, Provider<CustomersApi> paramProvider1)
  {
    return new RepositoryModule_ProvideICustomerModelRepositoryFactory(paramRepositoryModule, paramProvider, paramProvider1);
  }
  
  public static ICustomerModelRepository provideInstance(RepositoryModule paramRepositoryModule, Provider<Box7Cache> paramProvider, Provider<CustomersApi> paramProvider1)
  {
    return proxyProvideICustomerModelRepository(paramRepositoryModule, (Box7Cache)paramProvider.get(), (CustomersApi)paramProvider1.get());
  }
  
  public static ICustomerModelRepository proxyProvideICustomerModelRepository(RepositoryModule paramRepositoryModule, Box7Cache paramBox7Cache, CustomersApi paramCustomersApi)
  {
    return (ICustomerModelRepository)Preconditions.checkNotNull(paramRepositoryModule.provideICustomerModelRepository(paramBox7Cache, paramCustomersApi), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ICustomerModelRepository get()
  {
    return provideInstance(this.module, this.box7CacheProvider, this.customersApiProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/RepositoryModule_ProvideICustomerModelRepositoryFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */