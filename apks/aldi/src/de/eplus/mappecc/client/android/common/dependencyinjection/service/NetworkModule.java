package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import android.support.annotation.NonNull;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.eventbus.MainThreadBus;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.misc.Box7MiscManager;
import de.eplus.mappecc.client.android.common.network.moe.ImageManager;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationManagerFactory;
import de.eplus.mappecc.client.android.common.network.moe.MoeUpdateManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.network.moe.core.MoeTaskFactory;
import de.eplus.mappecc.client.android.common.network.piranha.ILoginManager;
import de.eplus.mappecc.client.android.common.network.piranha.LoginHelper;
import de.eplus.mappecc.client.android.common.network.piranha.LoginManager;
import de.eplus.mappecc.client.android.common.network.piranha.model.higherlogin.HigherLoginManager;
import de.eplus.mappecc.client.android.common.network.piranha.model.higherlogin.IHigherLoginManager;
import de.eplus.mappecc.client.android.common.restclient.Box7RestApiLib;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.DeviceUtils;
import de.eplus.mappecc.client.android.common.utils.JsonUtil;
import de.eplus.mappecc.client.android.common.utils.SimUtils;
import de.eplus.mappecc.client.android.common.utils.Timer;
import de.eplus.mappecc.client.android.common.utils.UiUtils;
import de.eplus.mappecc.client.android.common.utils.preferences.LoginPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.NetworkPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.TimeoutPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.UserPreferences;
import javax.inject.Singleton;

@Module
public class NetworkModule
{
  @Provides
  @Singleton
  static IHigherLoginManager provideHigherLoginManager(@NonNull Box7RestApiLib paramBox7RestApiLib, @NonNull LoginHelper paramLoginHelper, @NonNull LoginPreferences paramLoginPreferences, @NonNull TimeoutPreferences paramTimeoutPreferences, @NonNull Localizer paramLocalizer, @NonNull TrackingHelper paramTrackingHelper, @NonNull Timer paramTimer)
  {
    return new HigherLoginManager(paramBox7RestApiLib.getLoginClient(), paramLoginHelper, paramLoginPreferences, paramTimeoutPreferences, paramLocalizer, paramTrackingHelper, paramTimer);
  }
  
  @Provides
  @Singleton
  static ImageManager provideImageManager(UiUtils paramUiUtils)
  {
    return new ImageManager(paramUiUtils);
  }
  
  @Provides
  @Singleton
  static LoginHelper provideLoginHelper(@NonNull LoginPreferences paramLoginPreferences)
  {
    return new LoginHelper(paramLoginPreferences);
  }
  
  @Provides
  @Singleton
  static MoeUpdateManager provideMoeUpdateManager(LocalizationManagerFactory paramLocalizationManagerFactory, DeviceUtils paramDeviceUtils, NetworkPreferences paramNetworkPreferences, MoeTaskFactory paramMoeTaskFactory)
  {
    return new MoeUpdateManager(paramLocalizationManagerFactory, paramDeviceUtils, paramNetworkPreferences, paramMoeTaskFactory);
  }
  
  @Provides
  @Singleton
  static ILoginManager providesLoginManager(@NonNull Box7RestApiLib paramBox7RestApiLib, @NonNull LoginPreferences paramLoginPreferences, @NonNull TimeoutPreferences paramTimeoutPreferences, @NonNull MainThreadBus paramMainThreadBus, @NonNull DeviceUtils paramDeviceUtils, @NonNull Timer paramTimer, @NonNull Box7Cache paramBox7Cache, @NonNull Localizer paramLocalizer, @NonNull SimUtils paramSimUtils, @NonNull UserPreferences paramUserPreferences, @NonNull Box7MiscManager paramBox7MiscManager, @NonNull JsonUtil paramJsonUtil, @NonNull LoginHelper paramLoginHelper, @NonNull IHigherLoginManager paramIHigherLoginManager)
  {
    return new LoginManager(paramBox7RestApiLib, paramLoginPreferences, paramTimeoutPreferences, paramMainThreadBus, paramDeviceUtils, paramTimer, paramBox7Cache, paramLocalizer, paramSimUtils, paramUserPreferences, paramBox7MiscManager, paramJsonUtil, paramLoginHelper, paramIHigherLoginManager);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/NetworkModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */