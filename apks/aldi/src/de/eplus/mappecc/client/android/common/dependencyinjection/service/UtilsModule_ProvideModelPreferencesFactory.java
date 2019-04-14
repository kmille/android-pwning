package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.utils.preferences.ModelPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.Preferences;
import javax.inject.Provider;

public final class UtilsModule_ProvideModelPreferencesFactory
  implements Factory<ModelPreferences>
{
  private final Provider<Preferences> preferencesProvider;
  
  public UtilsModule_ProvideModelPreferencesFactory(Provider<Preferences> paramProvider)
  {
    this.preferencesProvider = paramProvider;
  }
  
  public static UtilsModule_ProvideModelPreferencesFactory create(Provider<Preferences> paramProvider)
  {
    return new UtilsModule_ProvideModelPreferencesFactory(paramProvider);
  }
  
  public static ModelPreferences provideInstance(Provider<Preferences> paramProvider)
  {
    return proxyProvideModelPreferences((Preferences)paramProvider.get());
  }
  
  public static ModelPreferences proxyProvideModelPreferences(Preferences paramPreferences)
  {
    return (ModelPreferences)Preconditions.checkNotNull(UtilsModule.provideModelPreferences(paramPreferences), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ModelPreferences get()
  {
    return provideInstance(this.preferencesProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvideModelPreferencesFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */