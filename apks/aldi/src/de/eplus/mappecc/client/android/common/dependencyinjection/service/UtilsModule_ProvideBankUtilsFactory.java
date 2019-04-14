package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.utils.bank.BankUtils;
import javax.inject.Provider;

public final class UtilsModule_ProvideBankUtilsFactory
  implements Factory<BankUtils>
{
  private final Provider<Localizer> localizerProvider;
  
  public UtilsModule_ProvideBankUtilsFactory(Provider<Localizer> paramProvider)
  {
    this.localizerProvider = paramProvider;
  }
  
  public static UtilsModule_ProvideBankUtilsFactory create(Provider<Localizer> paramProvider)
  {
    return new UtilsModule_ProvideBankUtilsFactory(paramProvider);
  }
  
  public static BankUtils provideInstance(Provider<Localizer> paramProvider)
  {
    return proxyProvideBankUtils((Localizer)paramProvider.get());
  }
  
  public static BankUtils proxyProvideBankUtils(Localizer paramLocalizer)
  {
    return (BankUtils)Preconditions.checkNotNull(UtilsModule.provideBankUtils(paramLocalizer), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final BankUtils get()
  {
    return provideInstance(this.localizerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvideBankUtilsFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */