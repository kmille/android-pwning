package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.feature.directdebit.recharge.RechargeSettingsSendManager;
import javax.inject.Provider;

public final class RechargeSettingsModule_ProvideRechargeSettingsSendManagerFactory
  implements Factory<RechargeSettingsSendManager>
{
  private final Provider<Box7SubscriptionManager> box7SubscriptionManagerProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  
  public RechargeSettingsModule_ProvideRechargeSettingsSendManagerFactory(Provider<Box7SubscriptionManager> paramProvider, Provider<TrackingHelper> paramProvider1)
  {
    this.box7SubscriptionManagerProvider = paramProvider;
    this.trackingHelperProvider = paramProvider1;
  }
  
  public static RechargeSettingsModule_ProvideRechargeSettingsSendManagerFactory create(Provider<Box7SubscriptionManager> paramProvider, Provider<TrackingHelper> paramProvider1)
  {
    return new RechargeSettingsModule_ProvideRechargeSettingsSendManagerFactory(paramProvider, paramProvider1);
  }
  
  public static RechargeSettingsSendManager provideInstance(Provider<Box7SubscriptionManager> paramProvider, Provider<TrackingHelper> paramProvider1)
  {
    return proxyProvideRechargeSettingsSendManager((Box7SubscriptionManager)paramProvider.get(), (TrackingHelper)paramProvider1.get());
  }
  
  public static RechargeSettingsSendManager proxyProvideRechargeSettingsSendManager(Box7SubscriptionManager paramBox7SubscriptionManager, TrackingHelper paramTrackingHelper)
  {
    return (RechargeSettingsSendManager)Preconditions.checkNotNull(RechargeSettingsModule.provideRechargeSettingsSendManager(paramBox7SubscriptionManager, paramTrackingHelper), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final RechargeSettingsSendManager get()
  {
    return provideInstance(this.box7SubscriptionManagerProvider, this.trackingHelperProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/RechargeSettingsModule_ProvideRechargeSettingsSendManagerFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */