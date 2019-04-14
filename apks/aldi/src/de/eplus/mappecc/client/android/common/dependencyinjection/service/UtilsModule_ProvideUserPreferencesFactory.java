package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.utils.preferences.Preferences;
import de.eplus.mappecc.client.android.common.utils.preferences.UserPreferences;
import javax.inject.Provider;

public final class UtilsModule_ProvideUserPreferencesFactory
  implements Factory<UserPreferences>
{
  private final Provider<Preferences> preferencesProvider;
  
  public UtilsModule_ProvideUserPreferencesFactory(Provider<Preferences> paramProvider)
  {
    this.preferencesProvider = paramProvider;
  }
  
  public static UtilsModule_ProvideUserPreferencesFactory create(Provider<Preferences> paramProvider)
  {
    return new UtilsModule_ProvideUserPreferencesFactory(paramProvider);
  }
  
  public static UserPreferences provideInstance(Provider<Preferences> paramProvider)
  {
    return proxyProvideUserPreferences((Preferences)paramProvider.get());
  }
  
  public static UserPreferences proxyProvideUserPreferences(Preferences paramPreferences)
  {
    return (UserPreferences)Preconditions.checkNotNull(UtilsModule.provideUserPreferences(paramPreferences), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final UserPreferences get()
  {
    return provideInstance(this.preferencesProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvideUserPreferencesFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */