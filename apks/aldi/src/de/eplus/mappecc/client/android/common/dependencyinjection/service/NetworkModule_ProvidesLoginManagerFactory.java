package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.eventbus.MainThreadBus;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.misc.Box7MiscManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.network.piranha.ILoginManager;
import de.eplus.mappecc.client.android.common.network.piranha.LoginHelper;
import de.eplus.mappecc.client.android.common.network.piranha.model.higherlogin.IHigherLoginManager;
import de.eplus.mappecc.client.android.common.restclient.Box7RestApiLib;
import de.eplus.mappecc.client.android.common.utils.DeviceUtils;
import de.eplus.mappecc.client.android.common.utils.JsonUtil;
import de.eplus.mappecc.client.android.common.utils.SimUtils;
import de.eplus.mappecc.client.android.common.utils.Timer;
import de.eplus.mappecc.client.android.common.utils.preferences.LoginPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.TimeoutPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.UserPreferences;
import javax.inject.Provider;

public final class NetworkModule_ProvidesLoginManagerFactory
  implements Factory<ILoginManager>
{
  private final Provider<Box7Cache> box7CacheProvider;
  private final Provider<Box7MiscManager> box7MiscManagerProvider;
  private final Provider<MainThreadBus> busProvider;
  private final Provider<DeviceUtils> deviceUtilsProvider;
  private final Provider<IHigherLoginManager> higherLoginManagerProvider;
  private final Provider<JsonUtil> jsonUtilProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<LoginHelper> loginHelperProvider;
  private final Provider<LoginPreferences> loginPreferencesProvider;
  private final Provider<Box7RestApiLib> restApiLibProvider;
  private final Provider<SimUtils> simUtilsProvider;
  private final Provider<TimeoutPreferences> timeoutPreferencesProvider;
  private final Provider<Timer> timerProvider;
  private final Provider<UserPreferences> userPreferencesProvider;
  
  public NetworkModule_ProvidesLoginManagerFactory(Provider<Box7RestApiLib> paramProvider, Provider<LoginPreferences> paramProvider1, Provider<TimeoutPreferences> paramProvider2, Provider<MainThreadBus> paramProvider3, Provider<DeviceUtils> paramProvider4, Provider<Timer> paramProvider5, Provider<Box7Cache> paramProvider6, Provider<Localizer> paramProvider7, Provider<SimUtils> paramProvider8, Provider<UserPreferences> paramProvider9, Provider<Box7MiscManager> paramProvider10, Provider<JsonUtil> paramProvider11, Provider<LoginHelper> paramProvider12, Provider<IHigherLoginManager> paramProvider13)
  {
    this.restApiLibProvider = paramProvider;
    this.loginPreferencesProvider = paramProvider1;
    this.timeoutPreferencesProvider = paramProvider2;
    this.busProvider = paramProvider3;
    this.deviceUtilsProvider = paramProvider4;
    this.timerProvider = paramProvider5;
    this.box7CacheProvider = paramProvider6;
    this.localizerProvider = paramProvider7;
    this.simUtilsProvider = paramProvider8;
    this.userPreferencesProvider = paramProvider9;
    this.box7MiscManagerProvider = paramProvider10;
    this.jsonUtilProvider = paramProvider11;
    this.loginHelperProvider = paramProvider12;
    this.higherLoginManagerProvider = paramProvider13;
  }
  
  public static NetworkModule_ProvidesLoginManagerFactory create(Provider<Box7RestApiLib> paramProvider, Provider<LoginPreferences> paramProvider1, Provider<TimeoutPreferences> paramProvider2, Provider<MainThreadBus> paramProvider3, Provider<DeviceUtils> paramProvider4, Provider<Timer> paramProvider5, Provider<Box7Cache> paramProvider6, Provider<Localizer> paramProvider7, Provider<SimUtils> paramProvider8, Provider<UserPreferences> paramProvider9, Provider<Box7MiscManager> paramProvider10, Provider<JsonUtil> paramProvider11, Provider<LoginHelper> paramProvider12, Provider<IHigherLoginManager> paramProvider13)
  {
    return new NetworkModule_ProvidesLoginManagerFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5, paramProvider6, paramProvider7, paramProvider8, paramProvider9, paramProvider10, paramProvider11, paramProvider12, paramProvider13);
  }
  
  public static ILoginManager provideInstance(Provider<Box7RestApiLib> paramProvider, Provider<LoginPreferences> paramProvider1, Provider<TimeoutPreferences> paramProvider2, Provider<MainThreadBus> paramProvider3, Provider<DeviceUtils> paramProvider4, Provider<Timer> paramProvider5, Provider<Box7Cache> paramProvider6, Provider<Localizer> paramProvider7, Provider<SimUtils> paramProvider8, Provider<UserPreferences> paramProvider9, Provider<Box7MiscManager> paramProvider10, Provider<JsonUtil> paramProvider11, Provider<LoginHelper> paramProvider12, Provider<IHigherLoginManager> paramProvider13)
  {
    return proxyProvidesLoginManager((Box7RestApiLib)paramProvider.get(), (LoginPreferences)paramProvider1.get(), (TimeoutPreferences)paramProvider2.get(), (MainThreadBus)paramProvider3.get(), (DeviceUtils)paramProvider4.get(), (Timer)paramProvider5.get(), (Box7Cache)paramProvider6.get(), (Localizer)paramProvider7.get(), (SimUtils)paramProvider8.get(), (UserPreferences)paramProvider9.get(), (Box7MiscManager)paramProvider10.get(), (JsonUtil)paramProvider11.get(), (LoginHelper)paramProvider12.get(), (IHigherLoginManager)paramProvider13.get());
  }
  
  public static ILoginManager proxyProvidesLoginManager(Box7RestApiLib paramBox7RestApiLib, LoginPreferences paramLoginPreferences, TimeoutPreferences paramTimeoutPreferences, MainThreadBus paramMainThreadBus, DeviceUtils paramDeviceUtils, Timer paramTimer, Box7Cache paramBox7Cache, Localizer paramLocalizer, SimUtils paramSimUtils, UserPreferences paramUserPreferences, Box7MiscManager paramBox7MiscManager, JsonUtil paramJsonUtil, LoginHelper paramLoginHelper, IHigherLoginManager paramIHigherLoginManager)
  {
    return (ILoginManager)Preconditions.checkNotNull(NetworkModule.providesLoginManager(paramBox7RestApiLib, paramLoginPreferences, paramTimeoutPreferences, paramMainThreadBus, paramDeviceUtils, paramTimer, paramBox7Cache, paramLocalizer, paramSimUtils, paramUserPreferences, paramBox7MiscManager, paramJsonUtil, paramLoginHelper, paramIHigherLoginManager), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ILoginManager get()
  {
    return provideInstance(this.restApiLibProvider, this.loginPreferencesProvider, this.timeoutPreferencesProvider, this.busProvider, this.deviceUtilsProvider, this.timerProvider, this.box7CacheProvider, this.localizerProvider, this.simUtilsProvider, this.userPreferencesProvider, this.box7MiscManagerProvider, this.jsonUtilProvider, this.loginHelperProvider, this.higherLoginManagerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/NetworkModule_ProvidesLoginManagerFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */