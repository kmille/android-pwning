package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import android.support.annotation.NonNull;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
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
import de.eplus.mappecc.client.android.feature.login.LoginActivity;
import de.eplus.mappecc.client.android.feature.login.LoginPresenter;

@Module
public abstract class LoginActivityModule
{
  @Provides
  static LoginPresenter provideLoginPresenter(@NonNull ILoginView paramILoginView, @NonNull IB2pView paramIB2pView, @NonNull LoginManager paramLoginManager, @NonNull LoginPreferences paramLoginPreferences, @NonNull TimeoutPreferences paramTimeoutPreferences, @NonNull MainThreadBus paramMainThreadBus, @NonNull Timer paramTimer, @NonNull TrackingHelper paramTrackingHelper, @NonNull ErrorUtils paramErrorUtils, @NonNull SimUtils paramSimUtils, @NonNull UserPreferences paramUserPreferences, @NonNull Localizer paramLocalizer)
  {
    return new LoginPresenter(paramILoginView, paramIB2pView, paramLoginManager, paramLoginPreferences, paramTimeoutPreferences, paramMainThreadBus, paramTimer, paramTrackingHelper, paramErrorUtils, paramSimUtils, paramUserPreferences, paramLocalizer);
  }
  
  @Binds
  public abstract IB2pView b2pView(LoginActivity paramLoginActivity);
  
  @Binds
  public abstract ILoginView loginView(LoginActivity paramLoginActivity);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/LoginActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */