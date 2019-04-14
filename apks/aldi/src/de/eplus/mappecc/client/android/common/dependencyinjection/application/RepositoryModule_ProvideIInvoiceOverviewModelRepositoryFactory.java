package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.repository.implementation.IInvoiceOverviewModelRepository;
import de.eplus.mappecc.client.android.common.restclient.api.BillingsApi;
import javax.inject.Provider;

public final class RepositoryModule_ProvideIInvoiceOverviewModelRepositoryFactory
  implements Factory<IInvoiceOverviewModelRepository>
{
  private final Provider<BillingsApi> billingsApiProvider;
  private final Provider<Box7Cache> box7CacheProvider;
  private final RepositoryModule module;
  
  public RepositoryModule_ProvideIInvoiceOverviewModelRepositoryFactory(RepositoryModule paramRepositoryModule, Provider<BillingsApi> paramProvider, Provider<Box7Cache> paramProvider1)
  {
    this.module = paramRepositoryModule;
    this.billingsApiProvider = paramProvider;
    this.box7CacheProvider = paramProvider1;
  }
  
  public static RepositoryModule_ProvideIInvoiceOverviewModelRepositoryFactory create(RepositoryModule paramRepositoryModule, Provider<BillingsApi> paramProvider, Provider<Box7Cache> paramProvider1)
  {
    return new RepositoryModule_ProvideIInvoiceOverviewModelRepositoryFactory(paramRepositoryModule, paramProvider, paramProvider1);
  }
  
  public static IInvoiceOverviewModelRepository provideInstance(RepositoryModule paramRepositoryModule, Provider<BillingsApi> paramProvider, Provider<Box7Cache> paramProvider1)
  {
    return proxyProvideIInvoiceOverviewModelRepository(paramRepositoryModule, (BillingsApi)paramProvider.get(), (Box7Cache)paramProvider1.get());
  }
  
  public static IInvoiceOverviewModelRepository proxyProvideIInvoiceOverviewModelRepository(RepositoryModule paramRepositoryModule, BillingsApi paramBillingsApi, Box7Cache paramBox7Cache)
  {
    return (IInvoiceOverviewModelRepository)Preconditions.checkNotNull(paramRepositoryModule.provideIInvoiceOverviewModelRepository(paramBillingsApi, paramBox7Cache), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final IInvoiceOverviewModelRepository get()
  {
    return provideInstance(this.module, this.billingsApiProvider, this.box7CacheProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/RepositoryModule_ProvideIInvoiceOverviewModelRepositoryFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */