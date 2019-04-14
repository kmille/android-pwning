package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.ICustomerModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.IPrepaidTopupConfigurationModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionModelRepository;
import de.eplus.mappecc.client.android.common.utils.HotlineUtils;
import de.eplus.mappecc.client.android.feature.directdebit.method.DirectDebitMethodFragmentPresenter;
import de.eplus.mappecc.client.android.feature.directdebit.recharge.RechargeSettingsModel;
import de.eplus.mappecc.client.android.feature.directdebit.recharge.RechargeSettingsSendManager;
import de.eplus.mappecc.client.android.feature.directdebit.recharge.RechargeSettingsViewHelper;
import javax.inject.Provider;

public final class DirectDebitMethodFragmentModule_ProvideDirectDebitMethodFragmentPresenterFactory
  implements Factory<DirectDebitMethodFragmentPresenter>
{
  private final Provider<ICustomerModelRepository> customerModelRepositoryProvider;
  private final Provider<HotlineUtils> hotlineUtilsProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<IPrepaidTopupConfigurationModelRepository> prepaidTopupConfigurationModelRepositoryProvider;
  private final Provider<RechargeSettingsModel> rechargeSettingsModelProvider;
  private final Provider<RechargeSettingsSendManager> rechargeSettingsSendManagerProvider;
  private final Provider<RechargeSettingsViewHelper> rechargeSettingsViewHelperProvider;
  private final Provider<ISubscriptionModelRepository> subscriptionModelRepositoryProvider;
  
  public DirectDebitMethodFragmentModule_ProvideDirectDebitMethodFragmentPresenterFactory(Provider<HotlineUtils> paramProvider, Provider<ICustomerModelRepository> paramProvider1, Provider<ISubscriptionModelRepository> paramProvider2, Provider<RechargeSettingsModel> paramProvider3, Provider<RechargeSettingsViewHelper> paramProvider4, Provider<IPrepaidTopupConfigurationModelRepository> paramProvider5, Provider<Localizer> paramProvider6, Provider<RechargeSettingsSendManager> paramProvider7)
  {
    this.hotlineUtilsProvider = paramProvider;
    this.customerModelRepositoryProvider = paramProvider1;
    this.subscriptionModelRepositoryProvider = paramProvider2;
    this.rechargeSettingsModelProvider = paramProvider3;
    this.rechargeSettingsViewHelperProvider = paramProvider4;
    this.prepaidTopupConfigurationModelRepositoryProvider = paramProvider5;
    this.localizerProvider = paramProvider6;
    this.rechargeSettingsSendManagerProvider = paramProvider7;
  }
  
  public static DirectDebitMethodFragmentModule_ProvideDirectDebitMethodFragmentPresenterFactory create(Provider<HotlineUtils> paramProvider, Provider<ICustomerModelRepository> paramProvider1, Provider<ISubscriptionModelRepository> paramProvider2, Provider<RechargeSettingsModel> paramProvider3, Provider<RechargeSettingsViewHelper> paramProvider4, Provider<IPrepaidTopupConfigurationModelRepository> paramProvider5, Provider<Localizer> paramProvider6, Provider<RechargeSettingsSendManager> paramProvider7)
  {
    return new DirectDebitMethodFragmentModule_ProvideDirectDebitMethodFragmentPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5, paramProvider6, paramProvider7);
  }
  
  public static DirectDebitMethodFragmentPresenter provideInstance(Provider<HotlineUtils> paramProvider, Provider<ICustomerModelRepository> paramProvider1, Provider<ISubscriptionModelRepository> paramProvider2, Provider<RechargeSettingsModel> paramProvider3, Provider<RechargeSettingsViewHelper> paramProvider4, Provider<IPrepaidTopupConfigurationModelRepository> paramProvider5, Provider<Localizer> paramProvider6, Provider<RechargeSettingsSendManager> paramProvider7)
  {
    return proxyProvideDirectDebitMethodFragmentPresenter((HotlineUtils)paramProvider.get(), (ICustomerModelRepository)paramProvider1.get(), (ISubscriptionModelRepository)paramProvider2.get(), (RechargeSettingsModel)paramProvider3.get(), (RechargeSettingsViewHelper)paramProvider4.get(), (IPrepaidTopupConfigurationModelRepository)paramProvider5.get(), (Localizer)paramProvider6.get(), (RechargeSettingsSendManager)paramProvider7.get());
  }
  
  public static DirectDebitMethodFragmentPresenter proxyProvideDirectDebitMethodFragmentPresenter(HotlineUtils paramHotlineUtils, ICustomerModelRepository paramICustomerModelRepository, ISubscriptionModelRepository paramISubscriptionModelRepository, RechargeSettingsModel paramRechargeSettingsModel, RechargeSettingsViewHelper paramRechargeSettingsViewHelper, IPrepaidTopupConfigurationModelRepository paramIPrepaidTopupConfigurationModelRepository, Localizer paramLocalizer, RechargeSettingsSendManager paramRechargeSettingsSendManager)
  {
    return (DirectDebitMethodFragmentPresenter)Preconditions.checkNotNull(DirectDebitMethodFragmentModule.provideDirectDebitMethodFragmentPresenter(paramHotlineUtils, paramICustomerModelRepository, paramISubscriptionModelRepository, paramRechargeSettingsModel, paramRechargeSettingsViewHelper, paramIPrepaidTopupConfigurationModelRepository, paramLocalizer, paramRechargeSettingsSendManager), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final DirectDebitMethodFragmentPresenter get()
  {
    return provideInstance(this.hotlineUtilsProvider, this.customerModelRepositoryProvider, this.subscriptionModelRepositoryProvider, this.rechargeSettingsModelProvider, this.rechargeSettingsViewHelperProvider, this.prepaidTopupConfigurationModelRepositoryProvider, this.localizerProvider, this.rechargeSettingsSendManagerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/DirectDebitMethodFragmentModule_ProvideDirectDebitMethodFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */