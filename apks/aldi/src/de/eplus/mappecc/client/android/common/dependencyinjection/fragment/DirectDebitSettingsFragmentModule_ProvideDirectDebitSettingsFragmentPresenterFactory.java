package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.ICustomerModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.IPrepaidTopupConfigurationModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionModelRepository;
import de.eplus.mappecc.client.android.common.utils.HotlineUtils;
import de.eplus.mappecc.client.android.feature.directdebit.recharge.RechargeSettingsModel;
import de.eplus.mappecc.client.android.feature.directdebit.recharge.RechargeSettingsSendManager;
import de.eplus.mappecc.client.android.feature.directdebit.recharge.RechargeSettingsViewHelper;
import de.eplus.mappecc.client.android.feature.directdebit.setting.DirectDebitSettingsFragmentPresenter;
import javax.inject.Provider;

public final class DirectDebitSettingsFragmentModule_ProvideDirectDebitSettingsFragmentPresenterFactory
  implements Factory<DirectDebitSettingsFragmentPresenter>
{
  private final Provider<ICustomerModelRepository> customerModelRepositoryProvider;
  private final Provider<HotlineUtils> hotlineUtilsProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<IPrepaidTopupConfigurationModelRepository> prepaidTopupConfigurationModelRepositoryProvider;
  private final Provider<RechargeSettingsModel> rechargeSettingsModelProvider;
  private final Provider<RechargeSettingsSendManager> rechargeSettingsSendManagerProvider;
  private final Provider<RechargeSettingsViewHelper> rechargeSettingsViewHelperProvider;
  private final Provider<ISubscriptionModelRepository> subscriptionModelRepositoryProvider;
  
  public DirectDebitSettingsFragmentModule_ProvideDirectDebitSettingsFragmentPresenterFactory(Provider<Localizer> paramProvider, Provider<RechargeSettingsModel> paramProvider1, Provider<RechargeSettingsViewHelper> paramProvider2, Provider<HotlineUtils> paramProvider3, Provider<RechargeSettingsSendManager> paramProvider4, Provider<ICustomerModelRepository> paramProvider5, Provider<ISubscriptionModelRepository> paramProvider6, Provider<IPrepaidTopupConfigurationModelRepository> paramProvider7)
  {
    this.localizerProvider = paramProvider;
    this.rechargeSettingsModelProvider = paramProvider1;
    this.rechargeSettingsViewHelperProvider = paramProvider2;
    this.hotlineUtilsProvider = paramProvider3;
    this.rechargeSettingsSendManagerProvider = paramProvider4;
    this.customerModelRepositoryProvider = paramProvider5;
    this.subscriptionModelRepositoryProvider = paramProvider6;
    this.prepaidTopupConfigurationModelRepositoryProvider = paramProvider7;
  }
  
  public static DirectDebitSettingsFragmentModule_ProvideDirectDebitSettingsFragmentPresenterFactory create(Provider<Localizer> paramProvider, Provider<RechargeSettingsModel> paramProvider1, Provider<RechargeSettingsViewHelper> paramProvider2, Provider<HotlineUtils> paramProvider3, Provider<RechargeSettingsSendManager> paramProvider4, Provider<ICustomerModelRepository> paramProvider5, Provider<ISubscriptionModelRepository> paramProvider6, Provider<IPrepaidTopupConfigurationModelRepository> paramProvider7)
  {
    return new DirectDebitSettingsFragmentModule_ProvideDirectDebitSettingsFragmentPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5, paramProvider6, paramProvider7);
  }
  
  public static DirectDebitSettingsFragmentPresenter provideInstance(Provider<Localizer> paramProvider, Provider<RechargeSettingsModel> paramProvider1, Provider<RechargeSettingsViewHelper> paramProvider2, Provider<HotlineUtils> paramProvider3, Provider<RechargeSettingsSendManager> paramProvider4, Provider<ICustomerModelRepository> paramProvider5, Provider<ISubscriptionModelRepository> paramProvider6, Provider<IPrepaidTopupConfigurationModelRepository> paramProvider7)
  {
    return proxyProvideDirectDebitSettingsFragmentPresenter((Localizer)paramProvider.get(), (RechargeSettingsModel)paramProvider1.get(), (RechargeSettingsViewHelper)paramProvider2.get(), (HotlineUtils)paramProvider3.get(), (RechargeSettingsSendManager)paramProvider4.get(), (ICustomerModelRepository)paramProvider5.get(), (ISubscriptionModelRepository)paramProvider6.get(), (IPrepaidTopupConfigurationModelRepository)paramProvider7.get());
  }
  
  public static DirectDebitSettingsFragmentPresenter proxyProvideDirectDebitSettingsFragmentPresenter(Localizer paramLocalizer, RechargeSettingsModel paramRechargeSettingsModel, RechargeSettingsViewHelper paramRechargeSettingsViewHelper, HotlineUtils paramHotlineUtils, RechargeSettingsSendManager paramRechargeSettingsSendManager, ICustomerModelRepository paramICustomerModelRepository, ISubscriptionModelRepository paramISubscriptionModelRepository, IPrepaidTopupConfigurationModelRepository paramIPrepaidTopupConfigurationModelRepository)
  {
    return (DirectDebitSettingsFragmentPresenter)Preconditions.checkNotNull(DirectDebitSettingsFragmentModule.provideDirectDebitSettingsFragmentPresenter(paramLocalizer, paramRechargeSettingsModel, paramRechargeSettingsViewHelper, paramHotlineUtils, paramRechargeSettingsSendManager, paramICustomerModelRepository, paramISubscriptionModelRepository, paramIPrepaidTopupConfigurationModelRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final DirectDebitSettingsFragmentPresenter get()
  {
    return provideInstance(this.localizerProvider, this.rechargeSettingsModelProvider, this.rechargeSettingsViewHelperProvider, this.hotlineUtilsProvider, this.rechargeSettingsSendManagerProvider, this.customerModelRepositoryProvider, this.subscriptionModelRepositoryProvider, this.prepaidTopupConfigurationModelRepositoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/DirectDebitSettingsFragmentModule_ProvideDirectDebitSettingsFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */