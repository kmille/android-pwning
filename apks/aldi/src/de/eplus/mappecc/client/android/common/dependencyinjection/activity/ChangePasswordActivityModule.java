package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.loginaccount.Box7LoginAccountManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.network.piranha.LoginManager;
import de.eplus.mappecc.client.android.common.repository.implementation.ICustomerModelRepository;
import de.eplus.mappecc.client.android.common.restclient.Box7RestApiLib;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.helper.TEFPasswordHelper;
import de.eplus.mappecc.client.android.common.utils.preferences.LoginPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.TimeoutPreferences;
import de.eplus.mappecc.client.android.feature.customer.ChangePasswordActivity;
import de.eplus.mappecc.client.android.feature.customer.ChangePasswordPresenter;
import de.eplus.mappecc.client.android.feature.customer.IChangePasswordView;
import lombok.NonNull;

@Module
public abstract class ChangePasswordActivityModule
{
  @Provides
  static ChangePasswordPresenter provideChangePasswordPresenter(@NonNull IChangePasswordView paramIChangePasswordView, @NonNull IB2pView paramIB2pView, @NonNull Box7Cache paramBox7Cache, @NonNull Localizer paramLocalizer, @NonNull Box7LoginAccountManager paramBox7LoginAccountManager, @NonNull LoginPreferences paramLoginPreferences, @NonNull TEFPasswordHelper paramTEFPasswordHelper, @NonNull TrackingHelper paramTrackingHelper, @NonNull Box7RestApiLib paramBox7RestApiLib, @NonNull ICustomerModelRepository paramICustomerModelRepository, @NonNull TimeoutPreferences paramTimeoutPreferences, @NonNull LoginManager paramLoginManager)
  {
    if (paramIChangePasswordView != null)
    {
      if (paramIB2pView != null)
      {
        if (paramBox7Cache != null)
        {
          if (paramLocalizer != null)
          {
            if (paramBox7LoginAccountManager != null)
            {
              if (paramLoginPreferences != null)
              {
                if (paramTEFPasswordHelper != null)
                {
                  if (paramTrackingHelper != null)
                  {
                    if (paramBox7RestApiLib != null)
                    {
                      if (paramICustomerModelRepository != null)
                      {
                        if (paramTimeoutPreferences != null)
                        {
                          if (paramLoginManager != null) {
                            return new ChangePasswordPresenter(paramIChangePasswordView, paramIB2pView, paramBox7Cache, paramLocalizer, paramBox7LoginAccountManager, paramLoginPreferences, paramTEFPasswordHelper, paramTrackingHelper, paramBox7RestApiLib.getLoginClient(), paramICustomerModelRepository, paramTimeoutPreferences, paramLoginManager);
                          }
                          throw new NullPointerException("loginManager");
                        }
                        throw new NullPointerException("timeoutPreferences");
                      }
                      throw new NullPointerException("customerModelRepository");
                    }
                    throw new NullPointerException("box7RestApiLib");
                  }
                  throw new NullPointerException("trackingHelper");
                }
                throw new NullPointerException("tefPasswordHelper");
              }
              throw new NullPointerException("loginPreferences");
            }
            throw new NullPointerException("box7LoginAccountManager");
          }
          throw new NullPointerException("localizer");
        }
        throw new NullPointerException("box7Cache");
      }
      throw new NullPointerException("b2pView");
    }
    throw new NullPointerException("changePasswordView");
  }
  
  @Binds
  public abstract IB2pView b2pView(ChangePasswordActivity paramChangePasswordActivity);
  
  @Binds
  public abstract IChangePasswordView view(ChangePasswordActivity paramChangePasswordActivity);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/ChangePasswordActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */