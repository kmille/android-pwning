package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.preferences.UserPreferences;
import javax.inject.Provider;

public final class UtilsModule_ProvideTrackingHelperFactory
  implements Factory<TrackingHelper>
{
  private final Provider<Context> contextProvider;
  private final Provider<UserPreferences> userPreferencesProvider;
  
  public UtilsModule_ProvideTrackingHelperFactory(Provider<Context> paramProvider, Provider<UserPreferences> paramProvider1)
  {
    this.contextProvider = paramProvider;
    this.userPreferencesProvider = paramProvider1;
  }
  
  public static UtilsModule_ProvideTrackingHelperFactory create(Provider<Context> paramProvider, Provider<UserPreferences> paramProvider1)
  {
    return new UtilsModule_ProvideTrackingHelperFactory(paramProvider, paramProvider1);
  }
  
  public static TrackingHelper provideInstance(Provider<Context> paramProvider, Provider<UserPreferences> paramProvider1)
  {
    return proxyProvideTrackingHelper((Context)paramProvider.get(), (UserPreferences)paramProvider1.get());
  }
  
  public static TrackingHelper proxyProvideTrackingHelper(Context paramContext, UserPreferences paramUserPreferences)
  {
    return (TrackingHelper)Preconditions.checkNotNull(UtilsModule.provideTrackingHelper(paramContext, paramUserPreferences), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final TrackingHelper get()
  {
    return provideInstance(this.contextProvider, this.userPreferencesProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvideTrackingHelperFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */