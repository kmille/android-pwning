package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.accounts.Box7AccountsManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.ICustomerModelRepository;
import de.eplus.mappecc.client.android.common.utils.HotlineUtils;
import de.eplus.mappecc.client.android.common.utils.bank.BankUtils;
import de.eplus.mappecc.client.android.feature.directdebit.bankaccountchange.DirectDebitFragmentPresenter;
import javax.inject.Provider;

public final class DirectDebitFragmentModule_ProvideDirectDebitFragmentPresenterFactory
  implements Factory<DirectDebitFragmentPresenter>
{
  private final Provider<IB2pView> b2pViewProvider;
  private final Provider<BankUtils> bankUtilsProvider;
  private final Provider<Box7AccountsManager> box7AccountsManagerProvider;
  private final Provider<ICustomerModelRepository> customerModelRepositoryProvider;
  private final Provider<HotlineUtils> hotlineUtilsProvider;
  private final Provider<Localizer> localizerProvider;
  
  public DirectDebitFragmentModule_ProvideDirectDebitFragmentPresenterFactory(Provider<Localizer> paramProvider, Provider<IB2pView> paramProvider1, Provider<Box7AccountsManager> paramProvider2, Provider<HotlineUtils> paramProvider3, Provider<BankUtils> paramProvider4, Provider<ICustomerModelRepository> paramProvider5)
  {
    this.localizerProvider = paramProvider;
    this.b2pViewProvider = paramProvider1;
    this.box7AccountsManagerProvider = paramProvider2;
    this.hotlineUtilsProvider = paramProvider3;
    this.bankUtilsProvider = paramProvider4;
    this.customerModelRepositoryProvider = paramProvider5;
  }
  
  public static DirectDebitFragmentModule_ProvideDirectDebitFragmentPresenterFactory create(Provider<Localizer> paramProvider, Provider<IB2pView> paramProvider1, Provider<Box7AccountsManager> paramProvider2, Provider<HotlineUtils> paramProvider3, Provider<BankUtils> paramProvider4, Provider<ICustomerModelRepository> paramProvider5)
  {
    return new DirectDebitFragmentModule_ProvideDirectDebitFragmentPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5);
  }
  
  public static DirectDebitFragmentPresenter provideInstance(Provider<Localizer> paramProvider, Provider<IB2pView> paramProvider1, Provider<Box7AccountsManager> paramProvider2, Provider<HotlineUtils> paramProvider3, Provider<BankUtils> paramProvider4, Provider<ICustomerModelRepository> paramProvider5)
  {
    return proxyProvideDirectDebitFragmentPresenter((Localizer)paramProvider.get(), (IB2pView)paramProvider1.get(), (Box7AccountsManager)paramProvider2.get(), (HotlineUtils)paramProvider3.get(), (BankUtils)paramProvider4.get(), (ICustomerModelRepository)paramProvider5.get());
  }
  
  public static DirectDebitFragmentPresenter proxyProvideDirectDebitFragmentPresenter(Localizer paramLocalizer, IB2pView paramIB2pView, Box7AccountsManager paramBox7AccountsManager, HotlineUtils paramHotlineUtils, BankUtils paramBankUtils, ICustomerModelRepository paramICustomerModelRepository)
  {
    return (DirectDebitFragmentPresenter)Preconditions.checkNotNull(DirectDebitFragmentModule.provideDirectDebitFragmentPresenter(paramLocalizer, paramIB2pView, paramBox7AccountsManager, paramHotlineUtils, paramBankUtils, paramICustomerModelRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final DirectDebitFragmentPresenter get()
  {
    return provideInstance(this.localizerProvider, this.b2pViewProvider, this.box7AccountsManagerProvider, this.hotlineUtilsProvider, this.bankUtilsProvider, this.customerModelRepositoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/DirectDebitFragmentModule_ProvideDirectDebitFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */