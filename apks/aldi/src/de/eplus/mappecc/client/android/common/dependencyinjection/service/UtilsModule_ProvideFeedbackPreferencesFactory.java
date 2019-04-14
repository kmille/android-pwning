package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.utils.preferences.Preferences;
import de.eplus.mappecc.client.android.feature.rating.RatingPreferences;
import javax.inject.Provider;

public final class UtilsModule_ProvideFeedbackPreferencesFactory
  implements Factory<RatingPreferences>
{
  private final Provider<Preferences> preferencesProvider;
  
  public UtilsModule_ProvideFeedbackPreferencesFactory(Provider<Preferences> paramProvider)
  {
    this.preferencesProvider = paramProvider;
  }
  
  public static UtilsModule_ProvideFeedbackPreferencesFactory create(Provider<Preferences> paramProvider)
  {
    return new UtilsModule_ProvideFeedbackPreferencesFactory(paramProvider);
  }
  
  public static RatingPreferences provideInstance(Provider<Preferences> paramProvider)
  {
    return proxyProvideFeedbackPreferences((Preferences)paramProvider.get());
  }
  
  public static RatingPreferences proxyProvideFeedbackPreferences(Preferences paramPreferences)
  {
    return (RatingPreferences)Preconditions.checkNotNull(UtilsModule.provideFeedbackPreferences(paramPreferences), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final RatingPreferences get()
  {
    return provideInstance(this.preferencesProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvideFeedbackPreferencesFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */