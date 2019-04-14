package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.loginaccount.Box7LoginAccountManager;
import de.eplus.mappecc.client.android.common.network.piranha.ILoginManager;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.preferences.LoginPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.TimeoutPreferences;
import de.eplus.mappecc.client.android.feature.resetpassword.password.IResetPasswordView;
import de.eplus.mappecc.client.android.feature.resetpassword.password.ResetPasswordFragment;
import de.eplus.mappecc.client.android.feature.resetpassword.password.ResetPasswordFragmentPresenter;

@Module
public abstract class ResetPasswordFragmentModule
{
  @Provides
  static ResetPasswordFragmentPresenter provideResetPasswordFragmentPresenter(IB2pView paramIB2pView, Box7LoginAccountManager paramBox7LoginAccountManager, ILoginManager paramILoginManager, LoginPreferences paramLoginPreferences, TimeoutPreferences paramTimeoutPreferences, TrackingHelper paramTrackingHelper)
  {
    return new ResetPasswordFragmentPresenter(paramIB2pView, paramBox7LoginAccountManager, paramILoginManager, paramLoginPreferences, paramTimeoutPreferences, paramTrackingHelper);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract ResetPasswordFragment resetPasswordFragmentInjector();
  
  @Binds
  public abstract IResetPasswordView view(ResetPasswordFragment paramResetPasswordFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/ResetPasswordFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */