package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.feature.directdebit.recharge.RechargeSettingsModel;
import de.eplus.mappecc.client.android.feature.directdebit.recharge.RechargeSettingsSendManager;
import de.eplus.mappecc.client.android.feature.directdebit.recharge.RechargeSettingsViewHelper;
import javax.inject.Singleton;

@Module
public class RechargeSettingsModule
{
  @Provides
  @Singleton
  static RechargeSettingsModel provideRechargeSettingsModel(Localizer paramLocalizer)
  {
    return new RechargeSettingsModel(paramLocalizer);
  }
  
  @Provides
  @Singleton
  static RechargeSettingsSendManager provideRechargeSettingsSendManager(Box7SubscriptionManager paramBox7SubscriptionManager, TrackingHelper paramTrackingHelper)
  {
    return new RechargeSettingsSendManager(paramBox7SubscriptionManager, paramTrackingHelper);
  }
  
  @Provides
  @Singleton
  static RechargeSettingsViewHelper provideRechargeSettingsViewHelper(Localizer paramLocalizer)
  {
    return new RechargeSettingsViewHelper(paramLocalizer);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/RechargeSettingsModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */