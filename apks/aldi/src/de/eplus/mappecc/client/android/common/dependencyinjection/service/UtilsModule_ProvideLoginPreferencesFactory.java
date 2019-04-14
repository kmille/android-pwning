package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.utils.preferences.LoginPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.Preferences;
import javax.inject.Provider;

public final class UtilsModule_ProvideLoginPreferencesFactory
  implements Factory<LoginPreferences>
{
  private final Provider<Preferences> preferencesProvider;
  
  public UtilsModule_ProvideLoginPreferencesFactory(Provider<Preferences> paramProvider)
  {
    this.preferencesProvider = paramProvider;
  }
  
  public static UtilsModule_ProvideLoginPreferencesFactory create(Provider<Preferences> paramProvider)
  {
    return new UtilsModule_ProvideLoginPreferencesFactory(paramProvider);
  }
  
  public static LoginPreferences provideInstance(Provider<Preferences> paramProvider)
  {
    return proxyProvideLoginPreferences((Preferences)paramProvider.get());
  }
  
  public static LoginPreferences proxyProvideLoginPreferences(Preferences paramPreferences)
  {
    return (LoginPreferences)Preconditions.checkNotNull(UtilsModule.provideLoginPreferences(paramPreferences), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final LoginPreferences get()
  {
    return provideInstance(this.preferencesProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvideLoginPreferencesFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */