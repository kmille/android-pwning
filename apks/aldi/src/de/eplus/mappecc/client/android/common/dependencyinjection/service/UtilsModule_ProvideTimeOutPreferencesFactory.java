package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.utils.preferences.Preferences;
import de.eplus.mappecc.client.android.common.utils.preferences.TimeoutPreferences;
import javax.inject.Provider;

public final class UtilsModule_ProvideTimeOutPreferencesFactory
  implements Factory<TimeoutPreferences>
{
  private final Provider<Localizer> localizerProvider;
  private final Provider<Preferences> preferencesProvider;
  
  public UtilsModule_ProvideTimeOutPreferencesFactory(Provider<Preferences> paramProvider, Provider<Localizer> paramProvider1)
  {
    this.preferencesProvider = paramProvider;
    this.localizerProvider = paramProvider1;
  }
  
  public static UtilsModule_ProvideTimeOutPreferencesFactory create(Provider<Preferences> paramProvider, Provider<Localizer> paramProvider1)
  {
    return new UtilsModule_ProvideTimeOutPreferencesFactory(paramProvider, paramProvider1);
  }
  
  public static TimeoutPreferences provideInstance(Provider<Preferences> paramProvider, Provider<Localizer> paramProvider1)
  {
    return proxyProvideTimeOutPreferences((Preferences)paramProvider.get(), (Localizer)paramProvider1.get());
  }
  
  public static TimeoutPreferences proxyProvideTimeOutPreferences(Preferences paramPreferences, Localizer paramLocalizer)
  {
    return (TimeoutPreferences)Preconditions.checkNotNull(UtilsModule.provideTimeOutPreferences(paramPreferences, paramLocalizer), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final TimeoutPreferences get()
  {
    return provideInstance(this.preferencesProvider, this.localizerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvideTimeOutPreferencesFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */