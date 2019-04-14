package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.feature.directdebit.recharge.RechargeSettingsViewHelper;
import javax.inject.Provider;

public final class RechargeSettingsModule_ProvideRechargeSettingsViewHelperFactory
  implements Factory<RechargeSettingsViewHelper>
{
  private final Provider<Localizer> localizerProvider;
  
  public RechargeSettingsModule_ProvideRechargeSettingsViewHelperFactory(Provider<Localizer> paramProvider)
  {
    this.localizerProvider = paramProvider;
  }
  
  public static RechargeSettingsModule_ProvideRechargeSettingsViewHelperFactory create(Provider<Localizer> paramProvider)
  {
    return new RechargeSettingsModule_ProvideRechargeSettingsViewHelperFactory(paramProvider);
  }
  
  public static RechargeSettingsViewHelper provideInstance(Provider<Localizer> paramProvider)
  {
    return proxyProvideRechargeSettingsViewHelper((Localizer)paramProvider.get());
  }
  
  public static RechargeSettingsViewHelper proxyProvideRechargeSettingsViewHelper(Localizer paramLocalizer)
  {
    return (RechargeSettingsViewHelper)Preconditions.checkNotNull(RechargeSettingsModule.provideRechargeSettingsViewHelper(paramLocalizer), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final RechargeSettingsViewHelper get()
  {
    return provideInstance(this.localizerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/RechargeSettingsModule_ProvideRechargeSettingsViewHelperFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */