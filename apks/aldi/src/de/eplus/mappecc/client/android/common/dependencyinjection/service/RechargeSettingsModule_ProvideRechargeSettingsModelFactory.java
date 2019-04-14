package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.feature.directdebit.recharge.RechargeSettingsModel;
import javax.inject.Provider;

public final class RechargeSettingsModule_ProvideRechargeSettingsModelFactory
  implements Factory<RechargeSettingsModel>
{
  private final Provider<Localizer> localizerProvider;
  
  public RechargeSettingsModule_ProvideRechargeSettingsModelFactory(Provider<Localizer> paramProvider)
  {
    this.localizerProvider = paramProvider;
  }
  
  public static RechargeSettingsModule_ProvideRechargeSettingsModelFactory create(Provider<Localizer> paramProvider)
  {
    return new RechargeSettingsModule_ProvideRechargeSettingsModelFactory(paramProvider);
  }
  
  public static RechargeSettingsModel provideInstance(Provider<Localizer> paramProvider)
  {
    return proxyProvideRechargeSettingsModel((Localizer)paramProvider.get());
  }
  
  public static RechargeSettingsModel proxyProvideRechargeSettingsModel(Localizer paramLocalizer)
  {
    return (RechargeSettingsModel)Preconditions.checkNotNull(RechargeSettingsModule.provideRechargeSettingsModel(paramLocalizer), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final RechargeSettingsModel get()
  {
    return provideInstance(this.localizerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/RechargeSettingsModule_ProvideRechargeSettingsModelFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */