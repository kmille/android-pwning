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
import de.eplus.mappecc.client.android.feature.directdebit.method.DirectDebitMethodFragment;
import de.eplus.mappecc.client.android.feature.directdebit.method.DirectDebitMethodFragmentPresenter;
import de.eplus.mappecc.client.android.feature.directdebit.method.IDirectDebitMethodView;
import de.eplus.mappecc.client.android.feature.directdebit.recharge.RechargeSettingsModel;
import de.eplus.mappecc.client.android.feature.directdebit.recharge.RechargeSettingsSendManager;
import de.eplus.mappecc.client.android.feature.directdebit.recharge.RechargeSettingsViewHelper;

@Module
public abstract class DirectDebitMethodFragmentModule
{
  @Provides
  static DirectDebitMethodFragmentPresenter provideDirectDebitMethodFragmentPresenter(@NonNull HotlineUtils paramHotlineUtils, @NonNull ICustomerModelRepository paramICustomerModelRepository, @NonNull ISubscriptionModelRepository paramISubscriptionModelRepository, @NonNull RechargeSettingsModel paramRechargeSettingsModel, @NonNull RechargeSettingsViewHelper paramRechargeSettingsViewHelper, @NonNull IPrepaidTopupConfigurationModelRepository paramIPrepaidTopupConfigurationModelRepository, @NonNull Localizer paramLocalizer, @NonNull RechargeSettingsSendManager paramRechargeSettingsSendManager)
  {
    return new DirectDebitMethodFragmentPresenter(paramHotlineUtils, paramICustomerModelRepository, paramISubscriptionModelRepository, paramRechargeSettingsModel, paramRechargeSettingsViewHelper, paramIPrepaidTopupConfigurationModelRepository, paramLocalizer, paramRechargeSettingsSendManager);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract DirectDebitMethodFragment directDebitMethodFragmentInjector();
  
  @Binds
  public abstract IDirectDebitMethodView view(DirectDebitMethodFragment paramDirectDebitMethodFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/DirectDebitMethodFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */