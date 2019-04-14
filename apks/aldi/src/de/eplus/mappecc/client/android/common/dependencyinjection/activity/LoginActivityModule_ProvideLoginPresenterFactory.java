package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.eventbus.MainThreadBus;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.network.piranha.LoginManager;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.ErrorUtils;
import de.eplus.mappecc.client.android.common.utils.SimUtils;
import de.eplus.mappecc.client.android.common.utils.Timer;
import de.eplus.mappecc.client.android.common.utils.preferences.LoginPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.TimeoutPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.UserPreferences;
import de.eplus.mappecc.client.android.feature.login.ILoginView;
import de.eplus.mappecc.client.android.feature.login.LoginPresenter;
import javax.inject.Provider;

public final class LoginActivityModule_ProvideLoginPresenterFactory
  implements Factory<LoginPresenter>
{
  private final Provider<IB2pView> b2pViewProvider;
  private final Provider<MainThreadBus> busProvider;
  private final Provider<ErrorUtils> errorUtilsProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<LoginManager> loginManagerProvider;
  private final Provider<LoginPreferences> loginPreferencesProvider;
  private final Provider<ILoginView> loginViewProvider;
  private final Provider<SimUtils> simUtilsProvider;
  private final Provider<TimeoutPreferences> timeoutPreferencesProvider;
  private final Provider<Timer> timerProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  private final Provider<UserPreferences> userPreferencesProvider;
  
  public LoginActivityModule_ProvideLoginPresenterFactory(Provider<ILoginView> paramProvider, Provider<IB2pView> paramProvider1, Provider<LoginManager> paramProvider2, Provider<LoginPreferences> paramProvider3, Provider<TimeoutPreferences> paramProvider4, Provider<MainThreadBus> paramProvider5, Provider<Timer> paramProvider6, Provider<TrackingHelper> paramProvider7, Provider<ErrorUtils> paramProvider8, Provider<SimUtils> paramProvider9, Provider<UserPreferences> paramProvider10, Provider<Localizer> paramProvider11)
  {
    this.loginViewProvider = paramProvider;
    this.b2pViewProvider = paramProvider1;
    this.loginManagerProvider = paramProvider2;
    this.loginPreferencesProvider = paramProvider3;
    this.timeoutPreferencesProvider = paramProvider4;
    this.busProvider = paramProvider5;
    this.timerProvider = paramProvider6;
    this.trackingHelperProvider = paramProvider7;
    this.errorUtilsProvider = paramProvider8;
    this.simUtilsProvider = paramProvider9;
    this.userPreferencesProvider = paramProvider10;
    this.localizerProvider = paramProvider11;
  }
  
  public static LoginActivityModule_ProvideLoginPresenterFactory create(Provider<ILoginView> paramProvider, Provider<IB2pView> paramProvider1, Provider<LoginManager> paramProvider2, Provider<LoginPreferences> paramProvider3, Provider<TimeoutPreferences> paramProvider4, Provider<MainThreadBus> paramProvider5, Provider<Timer> paramProvider6, Provider<TrackingHelper> paramProvider7, Provider<ErrorUtils> paramProvider8, Provider<SimUtils> paramProvider9, Provider<UserPreferences> paramProvider10, Provider<Localizer> paramProvider11)
  {
    return new LoginActivityModule_ProvideLoginPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5, paramProvider6, paramProvider7, paramProvider8, paramProvider9, paramProvider10, paramProvider11);
  }
  
  public static LoginPresenter provideInstance(Provider<ILoginView> paramProvider, Provider<IB2pView> paramProvider1, Provider<LoginManager> paramProvider2, Provider<LoginPreferences> paramProvider3, Provider<TimeoutPreferences> paramProvider4, Provider<MainThreadBus> paramProvider5, Provider<Timer> paramProvider6, Provider<TrackingHelper> paramProvider7, Provider<ErrorUtils> paramProvider8, Provider<SimUtils> paramProvider9, Provider<UserPreferences> paramProvider10, Provider<Localizer> paramProvider11)
  {
    return proxyProvideLoginPresenter((ILoginView)paramProvider.get(), (IB2pView)paramProvider1.get(), (LoginManager)paramProvider2.get(), (LoginPreferences)paramProvider3.get(), (TimeoutPreferences)paramProvider4.get(), (MainThreadBus)paramProvider5.get(), (Timer)paramProvider6.get(), (TrackingHelper)paramProvider7.get(), (ErrorUtils)paramProvider8.get(), (SimUtils)paramProvider9.get(), (UserPreferences)paramProvider10.get(), (Localizer)paramProvider11.get());
  }
  
  public static LoginPresenter proxyProvideLoginPresenter(ILoginView paramILoginView, IB2pView paramIB2pView, LoginManager paramLoginManager, LoginPreferences paramLoginPreferences, TimeoutPreferences paramTimeoutPreferences, MainThreadBus paramMainThreadBus, Timer paramTimer, TrackingHelper paramTrackingHelper, ErrorUtils paramErrorUtils, SimUtils paramSimUtils, UserPreferences paramUserPreferences, Localizer paramLocalizer)
  {
    return (LoginPresenter)Preconditions.checkNotNull(LoginActivityModule.provideLoginPresenter(paramILoginView, paramIB2pView, paramLoginManager, paramLoginPreferences, paramTimeoutPreferences, paramMainThreadBus, paramTimer, paramTrackingHelper, paramErrorUtils, paramSimUtils, paramUserPreferences, paramLocalizer), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final LoginPresenter get()
  {
    return provideInstance(this.loginViewProvider, this.b2pViewProvider, this.loginManagerProvider, this.loginPreferencesProvider, this.timeoutPreferencesProvider, this.busProvider, this.timerProvider, this.trackingHelperProvider, this.errorUtilsProvider, this.simUtilsProvider, this.userPreferencesProvider, this.localizerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/LoginActivityModule_ProvideLoginPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */