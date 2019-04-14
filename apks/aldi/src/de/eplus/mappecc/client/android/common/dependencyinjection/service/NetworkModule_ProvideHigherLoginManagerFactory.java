package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.network.piranha.LoginHelper;
import de.eplus.mappecc.client.android.common.network.piranha.model.higherlogin.IHigherLoginManager;
import de.eplus.mappecc.client.android.common.restclient.Box7RestApiLib;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.Timer;
import de.eplus.mappecc.client.android.common.utils.preferences.LoginPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.TimeoutPreferences;
import javax.inject.Provider;

public final class NetworkModule_ProvideHigherLoginManagerFactory
  implements Factory<IHigherLoginManager>
{
  private final Provider<Box7RestApiLib> box7RestApiLibProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<LoginHelper> loginHelperProvider;
  private final Provider<LoginPreferences> loginPreferencesProvider;
  private final Provider<TimeoutPreferences> timeoutPreferencesProvider;
  private final Provider<Timer> timerProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  
  public NetworkModule_ProvideHigherLoginManagerFactory(Provider<Box7RestApiLib> paramProvider, Provider<LoginHelper> paramProvider1, Provider<LoginPreferences> paramProvider2, Provider<TimeoutPreferences> paramProvider3, Provider<Localizer> paramProvider4, Provider<TrackingHelper> paramProvider5, Provider<Timer> paramProvider6)
  {
    this.box7RestApiLibProvider = paramProvider;
    this.loginHelperProvider = paramProvider1;
    this.loginPreferencesProvider = paramProvider2;
    this.timeoutPreferencesProvider = paramProvider3;
    this.localizerProvider = paramProvider4;
    this.trackingHelperProvider = paramProvider5;
    this.timerProvider = paramProvider6;
  }
  
  public static NetworkModule_ProvideHigherLoginManagerFactory create(Provider<Box7RestApiLib> paramProvider, Provider<LoginHelper> paramProvider1, Provider<LoginPreferences> paramProvider2, Provider<TimeoutPreferences> paramProvider3, Provider<Localizer> paramProvider4, Provider<TrackingHelper> paramProvider5, Provider<Timer> paramProvider6)
  {
    return new NetworkModule_ProvideHigherLoginManagerFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5, paramProvider6);
  }
  
  public static IHigherLoginManager provideInstance(Provider<Box7RestApiLib> paramProvider, Provider<LoginHelper> paramProvider1, Provider<LoginPreferences> paramProvider2, Provider<TimeoutPreferences> paramProvider3, Provider<Localizer> paramProvider4, Provider<TrackingHelper> paramProvider5, Provider<Timer> paramProvider6)
  {
    return proxyProvideHigherLoginManager((Box7RestApiLib)paramProvider.get(), (LoginHelper)paramProvider1.get(), (LoginPreferences)paramProvider2.get(), (TimeoutPreferences)paramProvider3.get(), (Localizer)paramProvider4.get(), (TrackingHelper)paramProvider5.get(), (Timer)paramProvider6.get());
  }
  
  public static IHigherLoginManager proxyProvideHigherLoginManager(Box7RestApiLib paramBox7RestApiLib, LoginHelper paramLoginHelper, LoginPreferences paramLoginPreferences, TimeoutPreferences paramTimeoutPreferences, Localizer paramLocalizer, TrackingHelper paramTrackingHelper, Timer paramTimer)
  {
    return (IHigherLoginManager)Preconditions.checkNotNull(NetworkModule.provideHigherLoginManager(paramBox7RestApiLib, paramLoginHelper, paramLoginPreferences, paramTimeoutPreferences, paramLocalizer, paramTrackingHelper, paramTimer), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final IHigherLoginManager get()
  {
    return provideInstance(this.box7RestApiLibProvider, this.loginHelperProvider, this.loginPreferencesProvider, this.timeoutPreferencesProvider, this.localizerProvider, this.trackingHelperProvider, this.timerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/NetworkModule_ProvideHigherLoginManagerFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */