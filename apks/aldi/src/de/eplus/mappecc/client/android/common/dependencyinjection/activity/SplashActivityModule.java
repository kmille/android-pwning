package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import android.support.annotation.NonNull;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.network.box7.performance.IPerformanceTimingManager;
import de.eplus.mappecc.client.android.common.network.moe.MoeUpdateManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.DeviceUtils;
import de.eplus.mappecc.client.android.common.utils.PermissionUtils;
import de.eplus.mappecc.client.android.common.utils.preferences.TimeoutPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.UserPreferences;
import de.eplus.mappecc.client.android.feature.splashscreen.ISplashView;
import de.eplus.mappecc.client.android.feature.splashscreen.SplashActivity;
import de.eplus.mappecc.client.android.feature.splashscreen.SplashPresenter;
import de.eplus.mappecc.client.android.feature.splashscreen.endpoint.EndpointManager;

@Module
public abstract class SplashActivityModule
{
  @Provides
  static SplashPresenter provideSplashPresenter(@NonNull ISplashView paramISplashView, @NonNull PermissionUtils paramPermissionUtils, @NonNull IPerformanceTimingManager paramIPerformanceTimingManager, @NonNull MoeUpdateManager paramMoeUpdateManager, @NonNull Localizer paramLocalizer, @NonNull TimeoutPreferences paramTimeoutPreferences, @NonNull UserPreferences paramUserPreferences, @NonNull TrackingHelper paramTrackingHelper, @NonNull DeviceUtils paramDeviceUtils, @NonNull EndpointManager paramEndpointManager)
  {
    return new SplashPresenter(paramISplashView, paramPermissionUtils, paramIPerformanceTimingManager, paramMoeUpdateManager, paramLocalizer, paramTimeoutPreferences, paramUserPreferences, paramTrackingHelper, paramDeviceUtils, paramEndpointManager);
  }
  
  @Binds
  public abstract ISplashView view(SplashActivity paramSplashActivity);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/SplashActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */