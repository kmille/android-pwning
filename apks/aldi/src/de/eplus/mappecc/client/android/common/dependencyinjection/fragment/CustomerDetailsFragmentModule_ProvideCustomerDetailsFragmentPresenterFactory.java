package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.customer.Box7CustomerManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.ICustomerModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ISimcardModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionModelRepository;
import de.eplus.mappecc.client.android.feature.customer.CustomerDetailsFragmentPresenter;
import javax.inject.Provider;

public final class CustomerDetailsFragmentModule_ProvideCustomerDetailsFragmentPresenterFactory
  implements Factory<CustomerDetailsFragmentPresenter>
{
  private final Provider<IB2pView> b2pViewProvider;
  private final Provider<Box7CustomerManager> box7CustomerManagerProvider;
  private final Provider<ICustomerModelRepository> customerModelRepositoryProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<ISimcardModelRepository> simcardModelRepositoryProvider;
  private final Provider<ISubscriptionModelRepository> subscriptionModelRepositoryProvider;
  
  public CustomerDetailsFragmentModule_ProvideCustomerDetailsFragmentPresenterFactory(Provider<Box7CustomerManager> paramProvider, Provider<Localizer> paramProvider1, Provider<IB2pView> paramProvider2, Provider<ISubscriptionModelRepository> paramProvider3, Provider<ICustomerModelRepository> paramProvider4, Provider<ISimcardModelRepository> paramProvider5)
  {
    this.box7CustomerManagerProvider = paramProvider;
    this.localizerProvider = paramProvider1;
    this.b2pViewProvider = paramProvider2;
    this.subscriptionModelRepositoryProvider = paramProvider3;
    this.customerModelRepositoryProvider = paramProvider4;
    this.simcardModelRepositoryProvider = paramProvider5;
  }
  
  public static CustomerDetailsFragmentModule_ProvideCustomerDetailsFragmentPresenterFactory create(Provider<Box7CustomerManager> paramProvider, Provider<Localizer> paramProvider1, Provider<IB2pView> paramProvider2, Provider<ISubscriptionModelRepository> paramProvider3, Provider<ICustomerModelRepository> paramProvider4, Provider<ISimcardModelRepository> paramProvider5)
  {
    return new CustomerDetailsFragmentModule_ProvideCustomerDetailsFragmentPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5);
  }
  
  public static CustomerDetailsFragmentPresenter provideInstance(Provider<Box7CustomerManager> paramProvider, Provider<Localizer> paramProvider1, Provider<IB2pView> paramProvider2, Provider<ISubscriptionModelRepository> paramProvider3, Provider<ICustomerModelRepository> paramProvider4, Provider<ISimcardModelRepository> paramProvider5)
  {
    return proxyProvideCustomerDetailsFragmentPresenter((Box7CustomerManager)paramProvider.get(), (Localizer)paramProvider1.get(), (IB2pView)paramProvider2.get(), (ISubscriptionModelRepository)paramProvider3.get(), (ICustomerModelRepository)paramProvider4.get(), (ISimcardModelRepository)paramProvider5.get());
  }
  
  public static CustomerDetailsFragmentPresenter proxyProvideCustomerDetailsFragmentPresenter(Box7CustomerManager paramBox7CustomerManager, Localizer paramLocalizer, IB2pView paramIB2pView, ISubscriptionModelRepository paramISubscriptionModelRepository, ICustomerModelRepository paramICustomerModelRepository, ISimcardModelRepository paramISimcardModelRepository)
  {
    return (CustomerDetailsFragmentPresenter)Preconditions.checkNotNull(CustomerDetailsFragmentModule.provideCustomerDetailsFragmentPresenter(paramBox7CustomerManager, paramLocalizer, paramIB2pView, paramISubscriptionModelRepository, paramICustomerModelRepository, paramISimcardModelRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final CustomerDetailsFragmentPresenter get()
  {
    return provideInstance(this.box7CustomerManagerProvider, this.localizerProvider, this.b2pViewProvider, this.subscriptionModelRepositoryProvider, this.customerModelRepositoryProvider, this.simcardModelRepositoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/CustomerDetailsFragmentModule_ProvideCustomerDetailsFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */