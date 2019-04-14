package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import android.support.annotation.NonNull;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.ICustomerModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.IPrepaidTopupConfigurationModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionModelRepository;
import de.eplus.mappecc.client.android.common.utils.HotlineUtils;
import de.eplus.mappecc.client.android.feature.directdebit.recharge.RechargeSettingsModel;
import de.eplus.mappecc.client.android.feature.directdebit.recharge.RechargeSettingsSendManager;
import de.eplus.mappecc.client.android.feature.directdebit.recharge.RechargeSettingsViewHelper;
import de.eplus.mappecc.client.android.feature.directdebit.setting.DirectDebitSettingsFragment;
import de.eplus.mappecc.client.android.feature.directdebit.setting.DirectDebitSettingsFragmentPresenter;
import de.eplus.mappecc.client.android.feature.directdebit.setting.IDirectDebitSettingsView;

@Module
public abstract class DirectDebitSettingsFragmentModule
{
  @Provides
  static DirectDebitSettingsFragmentPresenter provideDirectDebitSettingsFragmentPresenter(@NonNull Localizer paramLocalizer, @NonNull RechargeSettingsModel paramRechargeSettingsModel, @NonNull RechargeSettingsViewHelper paramRechargeSettingsViewHelper, @NonNull HotlineUtils paramHotlineUtils, @NonNull RechargeSettingsSendManager paramRechargeSettingsSendManager, @NonNull ICustomerModelRepository paramICustomerModelRepository, @NonNull ISubscriptionModelRepository paramISubscriptionModelRepository, @NonNull IPrepaidTopupConfigurationModelRepository paramIPrepaidTopupConfigurationModelRepository)
  {
    return new DirectDebitSettingsFragmentPresenter(paramLocalizer, paramRechargeSettingsModel, paramRechargeSettingsViewHelper, paramHotlineUtils, paramRechargeSettingsSendManager, paramICustomerModelRepository, paramISubscriptionModelRepository, paramIPrepaidTopupConfigurationModelRepository);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract DirectDebitSettingsFragment directDebitSettingsFragmentInjector();
  
  @Binds
  public abstract IDirectDebitSettingsView view(DirectDebitSettingsFragment paramDirectDebitSettingsFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/DirectDebitSettingsFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */