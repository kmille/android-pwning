package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.performance.IPerformanceTimingManager;
import de.eplus.mappecc.client.android.common.network.moe.MoeUpdateManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.DeviceUtils;
import de.eplus.mappecc.client.android.common.utils.PermissionUtils;
import de.eplus.mappecc.client.android.common.utils.preferences.TimeoutPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.UserPreferences;
import de.eplus.mappecc.client.android.feature.splashscreen.ISplashView;
import de.eplus.mappecc.client.android.feature.splashscreen.SplashPresenter;
import de.eplus.mappecc.client.android.feature.splashscreen.endpoint.EndpointManager;
import javax.inject.Provider;

public final class SplashActivityModule_ProvideSplashPresenterFactory
  implements Factory<SplashPresenter>
{
  private final Provider<DeviceUtils> deviceUtilsProvider;
  private final Provider<EndpointManager> endpointManagerProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<MoeUpdateManager> moeUpdateManagerProvider;
  private final Provider<IPerformanceTimingManager> performanceTimingManagerProvider;
  private final Provider<PermissionUtils> permissionUtilsProvider;
  private final Provider<ISplashView> splashViewProvider;
  private final Provider<TimeoutPreferences> timeoutPreferencesProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  private final Provider<UserPreferences> userPreferencesProvider;
  
  public SplashActivityModule_ProvideSplashPresenterFactory(Provider<ISplashView> paramProvider, Provider<PermissionUtils> paramProvider1, Provider<IPerformanceTimingManager> paramProvider2, Provider<MoeUpdateManager> paramProvider3, Provider<Localizer> paramProvider4, Provider<TimeoutPreferences> paramProvider5, Provider<UserPreferences> paramProvider6, Provider<TrackingHelper> paramProvider7, Provider<DeviceUtils> paramProvider8, Provider<EndpointManager> paramProvider9)
  {
    this.splashViewProvider = paramProvider;
    this.permissionUtilsProvider = paramProvider1;
    this.performanceTimingManagerProvider = paramProvider2;
    this.moeUpdateManagerProvider = paramProvider3;
    this.localizerProvider = paramProvider4;
    this.timeoutPreferencesProvider = paramProvider5;
    this.userPreferencesProvider = paramProvider6;
    this.trackingHelperProvider = paramProvider7;
    this.deviceUtilsProvider = paramProvider8;
    this.endpointManagerProvider = paramProvider9;
  }
  
  public static SplashActivityModule_ProvideSplashPresenterFactory create(Provider<ISplashView> paramProvider, Provider<PermissionUtils> paramProvider1, Provider<IPerformanceTimingManager> paramProvider2, Provider<MoeUpdateManager> paramProvider3, Provider<Localizer> paramProvider4, Provider<TimeoutPreferences> paramProvider5, Provider<UserPreferences> paramProvider6, Provider<TrackingHelper> paramProvider7, Provider<DeviceUtils> paramProvider8, Provider<EndpointManager> paramProvider9)
  {
    return new SplashActivityModule_ProvideSplashPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5, paramProvider6, paramProvider7, paramProvider8, paramProvider9);
  }
  
  public static SplashPresenter provideInstance(Provider<ISplashView> paramProvider, Provider<PermissionUtils> paramProvider1, Provider<IPerformanceTimingManager> paramProvider2, Provider<MoeUpdateManager> paramProvider3, Provider<Localizer> paramProvider4, Provider<TimeoutPreferences> paramProvider5, Provider<UserPreferences> paramProvider6, Provider<TrackingHelper> paramProvider7, Provider<DeviceUtils> paramProvider8, Provider<EndpointManager> paramProvider9)
  {
    return proxyProvideSplashPresenter((ISplashView)paramProvider.get(), (PermissionUtils)paramProvider1.get(), (IPerformanceTimingManager)paramProvider2.get(), (MoeUpdateManager)paramProvider3.get(), (Localizer)paramProvider4.get(), (TimeoutPreferences)paramProvider5.get(), (UserPreferences)paramProvider6.get(), (TrackingHelper)paramProvider7.get(), (DeviceUtils)paramProvider8.get(), (EndpointManager)paramProvider9.get());
  }
  
  public static SplashPresenter proxyProvideSplashPresenter(ISplashView paramISplashView, PermissionUtils paramPermissionUtils, IPerformanceTimingManager paramIPerformanceTimingManager, MoeUpdateManager paramMoeUpdateManager, Localizer paramLocalizer, TimeoutPreferences paramTimeoutPreferences, UserPreferences paramUserPreferences, TrackingHelper paramTrackingHelper, DeviceUtils paramDeviceUtils, EndpointManager paramEndpointManager)
  {
    return (SplashPresenter)Preconditions.checkNotNull(SplashActivityModule.provideSplashPresenter(paramISplashView, paramPermissionUtils, paramIPerformanceTimingManager, paramMoeUpdateManager, paramLocalizer, paramTimeoutPreferences, paramUserPreferences, paramTrackingHelper, paramDeviceUtils, paramEndpointManager), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final SplashPresenter get()
  {
    return provideInstance(this.splashViewProvider, this.permissionUtilsProvider, this.performanceTimingManagerProvider, this.moeUpdateManagerProvider, this.localizerProvider, this.timeoutPreferencesProvider, this.userPreferencesProvider, this.trackingHelperProvider, this.deviceUtilsProvider, this.endpointManagerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/SplashActivityModule_ProvideSplashPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */