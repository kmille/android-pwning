package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.IBalanceModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ICustomerModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ILoginAccountModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.IPacksRepository;
import de.eplus.mappecc.client.android.feature.directdebit.paymentchoice.DirectDebitPaymentChoiceFragmentPresenter;
import javax.inject.Provider;

public final class DirectDebitPaymentChoiceFragmentModule_ProvideDirectDebitPaymentChoiceFragmentPresenterFactory
  implements Factory<DirectDebitPaymentChoiceFragmentPresenter>
{
  private final Provider<IBalanceModelRepository> balanceModelRepositoryProvider;
  private final Provider<ICustomerModelRepository> customerModelRepositoryProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<ILoginAccountModelRepository> loginAccountModelRepositoryProvider;
  private final Provider<IPacksRepository> packsRepositoryProvider;
  
  public DirectDebitPaymentChoiceFragmentModule_ProvideDirectDebitPaymentChoiceFragmentPresenterFactory(Provider<Localizer> paramProvider, Provider<ICustomerModelRepository> paramProvider1, Provider<IBalanceModelRepository> paramProvider2, Provider<IPacksRepository> paramProvider3, Provider<ILoginAccountModelRepository> paramProvider4)
  {
    this.localizerProvider = paramProvider;
    this.customerModelRepositoryProvider = paramProvider1;
    this.balanceModelRepositoryProvider = paramProvider2;
    this.packsRepositoryProvider = paramProvider3;
    this.loginAccountModelRepositoryProvider = paramProvider4;
  }
  
  public static DirectDebitPaymentChoiceFragmentModule_ProvideDirectDebitPaymentChoiceFragmentPresenterFactory create(Provider<Localizer> paramProvider, Provider<ICustomerModelRepository> paramProvider1, Provider<IBalanceModelRepository> paramProvider2, Provider<IPacksRepository> paramProvider3, Provider<ILoginAccountModelRepository> paramProvider4)
  {
    return new DirectDebitPaymentChoiceFragmentModule_ProvideDirectDebitPaymentChoiceFragmentPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4);
  }
  
  public static DirectDebitPaymentChoiceFragmentPresenter provideInstance(Provider<Localizer> paramProvider, Provider<ICustomerModelRepository> paramProvider1, Provider<IBalanceModelRepository> paramProvider2, Provider<IPacksRepository> paramProvider3, Provider<ILoginAccountModelRepository> paramProvider4)
  {
    return proxyProvideDirectDebitPaymentChoiceFragmentPresenter((Localizer)paramProvider.get(), (ICustomerModelRepository)paramProvider1.get(), (IBalanceModelRepository)paramProvider2.get(), (IPacksRepository)paramProvider3.get(), (ILoginAccountModelRepository)paramProvider4.get());
  }
  
  public static DirectDebitPaymentChoiceFragmentPresenter proxyProvideDirectDebitPaymentChoiceFragmentPresenter(Localizer paramLocalizer, ICustomerModelRepository paramICustomerModelRepository, IBalanceModelRepository paramIBalanceModelRepository, IPacksRepository paramIPacksRepository, ILoginAccountModelRepository paramILoginAccountModelRepository)
  {
    return (DirectDebitPaymentChoiceFragmentPresenter)Preconditions.checkNotNull(DirectDebitPaymentChoiceFragmentModule.provideDirectDebitPaymentChoiceFragmentPresenter(paramLocalizer, paramICustomerModelRepository, paramIBalanceModelRepository, paramIPacksRepository, paramILoginAccountModelRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final DirectDebitPaymentChoiceFragmentPresenter get()
  {
    return provideInstance(this.localizerProvider, this.customerModelRepositoryProvider, this.balanceModelRepositoryProvider, this.packsRepositoryProvider, this.loginAccountModelRepositoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/DirectDebitPaymentChoiceFragmentModule_ProvideDirectDebitPaymentChoiceFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */