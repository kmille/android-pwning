package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.accounts.Box7AccountsManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.IPrepaidTopupConfigurationModelRepository;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.bank.BankUtils;
import de.eplus.mappecc.client.android.feature.directdebit.confirmation.DirectDebitConfirmationFragmentPresenter;
import javax.inject.Provider;

public final class DirectDebitConfirmationFragmentModule_ProvideDirectDebitConfirmationFragmentPresenterFactory
  implements Factory<DirectDebitConfirmationFragmentPresenter>
{
  private final Provider<IB2pView> b2pViewProvider;
  private final Provider<BankUtils> bankUtilsProvider;
  private final Provider<Box7AccountsManager> box7AccountsManagerProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<IPrepaidTopupConfigurationModelRepository> prepaidTopupConfigurationModelRepositoryProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  
  public DirectDebitConfirmationFragmentModule_ProvideDirectDebitConfirmationFragmentPresenterFactory(Provider<Localizer> paramProvider, Provider<IB2pView> paramProvider1, Provider<TrackingHelper> paramProvider2, Provider<Box7AccountsManager> paramProvider3, Provider<BankUtils> paramProvider4, Provider<IPrepaidTopupConfigurationModelRepository> paramProvider5)
  {
    this.localizerProvider = paramProvider;
    this.b2pViewProvider = paramProvider1;
    this.trackingHelperProvider = paramProvider2;
    this.box7AccountsManagerProvider = paramProvider3;
    this.bankUtilsProvider = paramProvider4;
    this.prepaidTopupConfigurationModelRepositoryProvider = paramProvider5;
  }
  
  public static DirectDebitConfirmationFragmentModule_ProvideDirectDebitConfirmationFragmentPresenterFactory create(Provider<Localizer> paramProvider, Provider<IB2pView> paramProvider1, Provider<TrackingHelper> paramProvider2, Provider<Box7AccountsManager> paramProvider3, Provider<BankUtils> paramProvider4, Provider<IPrepaidTopupConfigurationModelRepository> paramProvider5)
  {
    return new DirectDebitConfirmationFragmentModule_ProvideDirectDebitConfirmationFragmentPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5);
  }
  
  public static DirectDebitConfirmationFragmentPresenter provideInstance(Provider<Localizer> paramProvider, Provider<IB2pView> paramProvider1, Provider<TrackingHelper> paramProvider2, Provider<Box7AccountsManager> paramProvider3, Provider<BankUtils> paramProvider4, Provider<IPrepaidTopupConfigurationModelRepository> paramProvider5)
  {
    return proxyProvideDirectDebitConfirmationFragmentPresenter((Localizer)paramProvider.get(), (IB2pView)paramProvider1.get(), (TrackingHelper)paramProvider2.get(), (Box7AccountsManager)paramProvider3.get(), (BankUtils)paramProvider4.get(), (IPrepaidTopupConfigurationModelRepository)paramProvider5.get());
  }
  
  public static DirectDebitConfirmationFragmentPresenter proxyProvideDirectDebitConfirmationFragmentPresenter(Localizer paramLocalizer, IB2pView paramIB2pView, TrackingHelper paramTrackingHelper, Box7AccountsManager paramBox7AccountsManager, BankUtils paramBankUtils, IPrepaidTopupConfigurationModelRepository paramIPrepaidTopupConfigurationModelRepository)
  {
    return (DirectDebitConfirmationFragmentPresenter)Preconditions.checkNotNull(DirectDebitConfirmationFragmentModule.provideDirectDebitConfirmationFragmentPresenter(paramLocalizer, paramIB2pView, paramTrackingHelper, paramBox7AccountsManager, paramBankUtils, paramIPrepaidTopupConfigurationModelRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final DirectDebitConfirmationFragmentPresenter get()
  {
    return provideInstance(this.localizerProvider, this.b2pViewProvider, this.trackingHelperProvider, this.box7AccountsManagerProvider, this.bankUtilsProvider, this.prepaidTopupConfigurationModelRepositoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/DirectDebitConfirmationFragmentModule_ProvideDirectDebitConfirmationFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */