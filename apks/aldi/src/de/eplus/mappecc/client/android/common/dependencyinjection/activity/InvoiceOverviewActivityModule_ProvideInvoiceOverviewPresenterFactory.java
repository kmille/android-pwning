package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.repository.implementation.IInvoiceOverviewModelRepository;
import de.eplus.mappecc.client.android.feature.customer.invoice.IInvoiceOverviewView;
import de.eplus.mappecc.client.android.feature.customer.invoice.InvoiceOverviewPresenter;
import javax.inject.Provider;

public final class InvoiceOverviewActivityModule_ProvideInvoiceOverviewPresenterFactory
  implements Factory<InvoiceOverviewPresenter>
{
  private final Provider<IInvoiceOverviewView> iInvoiceOverviewViewProvider;
  private final Provider<IInvoiceOverviewModelRepository> invoiceOverviewModelRepositoryProvider;
  
  public InvoiceOverviewActivityModule_ProvideInvoiceOverviewPresenterFactory(Provider<IInvoiceOverviewView> paramProvider, Provider<IInvoiceOverviewModelRepository> paramProvider1)
  {
    this.iInvoiceOverviewViewProvider = paramProvider;
    this.invoiceOverviewModelRepositoryProvider = paramProvider1;
  }
  
  public static InvoiceOverviewActivityModule_ProvideInvoiceOverviewPresenterFactory create(Provider<IInvoiceOverviewView> paramProvider, Provider<IInvoiceOverviewModelRepository> paramProvider1)
  {
    return new InvoiceOverviewActivityModule_ProvideInvoiceOverviewPresenterFactory(paramProvider, paramProvider1);
  }
  
  public static InvoiceOverviewPresenter provideInstance(Provider<IInvoiceOverviewView> paramProvider, Provider<IInvoiceOverviewModelRepository> paramProvider1)
  {
    return proxyProvideInvoiceOverviewPresenter((IInvoiceOverviewView)paramProvider.get(), (IInvoiceOverviewModelRepository)paramProvider1.get());
  }
  
  public static InvoiceOverviewPresenter proxyProvideInvoiceOverviewPresenter(IInvoiceOverviewView paramIInvoiceOverviewView, IInvoiceOverviewModelRepository paramIInvoiceOverviewModelRepository)
  {
    return (InvoiceOverviewPresenter)Preconditions.checkNotNull(InvoiceOverviewActivityModule.provideInvoiceOverviewPresenter(paramIInvoiceOverviewView, paramIInvoiceOverviewModelRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final InvoiceOverviewPresenter get()
  {
    return provideInstance(this.iInvoiceOverviewViewProvider, this.invoiceOverviewModelRepositoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/InvoiceOverviewActivityModule_ProvideInvoiceOverviewPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */