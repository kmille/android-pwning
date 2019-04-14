package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.loginaccount.Box7LoginAccountManager;
import de.eplus.mappecc.client.android.common.network.piranha.ILoginManager;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.preferences.LoginPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.TimeoutPreferences;
import de.eplus.mappecc.client.android.feature.resetpassword.password.ResetPasswordFragmentPresenter;
import javax.inject.Provider;

public final class ResetPasswordFragmentModule_ProvideResetPasswordFragmentPresenterFactory
  implements Factory<ResetPasswordFragmentPresenter>
{
  private final Provider<IB2pView> b2pViewProvider;
  private final Provider<Box7LoginAccountManager> box7LoginAccountManagerProvider;
  private final Provider<ILoginManager> loginManagerProvider;
  private final Provider<LoginPreferences> loginPreferencesProvider;
  private final Provider<TimeoutPreferences> timeoutPreferencesProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  
  public ResetPasswordFragmentModule_ProvideResetPasswordFragmentPresenterFactory(Provider<IB2pView> paramProvider, Provider<Box7LoginAccountManager> paramProvider1, Provider<ILoginManager> paramProvider2, Provider<LoginPreferences> paramProvider3, Provider<TimeoutPreferences> paramProvider4, Provider<TrackingHelper> paramProvider5)
  {
    this.b2pViewProvider = paramProvider;
    this.box7LoginAccountManagerProvider = paramProvider1;
    this.loginManagerProvider = paramProvider2;
    this.loginPreferencesProvider = paramProvider3;
    this.timeoutPreferencesProvider = paramProvider4;
    this.trackingHelperProvider = paramProvider5;
  }
  
  public static ResetPasswordFragmentModule_ProvideResetPasswordFragmentPresenterFactory create(Provider<IB2pView> paramProvider, Provider<Box7LoginAccountManager> paramProvider1, Provider<ILoginManager> paramProvider2, Provider<LoginPreferences> paramProvider3, Provider<TimeoutPreferences> paramProvider4, Provider<TrackingHelper> paramProvider5)
  {
    return new ResetPasswordFragmentModule_ProvideResetPasswordFragmentPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5);
  }
  
  public static ResetPasswordFragmentPresenter provideInstance(Provider<IB2pView> paramProvider, Provider<Box7LoginAccountManager> paramProvider1, Provider<ILoginManager> paramProvider2, Provider<LoginPreferences> paramProvider3, Provider<TimeoutPreferences> paramProvider4, Provider<TrackingHelper> paramProvider5)
  {
    return proxyProvideResetPasswordFragmentPresenter((IB2pView)paramProvider.get(), (Box7LoginAccountManager)paramProvider1.get(), (ILoginManager)paramProvider2.get(), (LoginPreferences)paramProvider3.get(), (TimeoutPreferences)paramProvider4.get(), (TrackingHelper)paramProvider5.get());
  }
  
  public static ResetPasswordFragmentPresenter proxyProvideResetPasswordFragmentPresenter(IB2pView paramIB2pView, Box7LoginAccountManager paramBox7LoginAccountManager, ILoginManager paramILoginManager, LoginPreferences paramLoginPreferences, TimeoutPreferences paramTimeoutPreferences, TrackingHelper paramTrackingHelper)
  {
    return (ResetPasswordFragmentPresenter)Preconditions.checkNotNull(ResetPasswordFragmentModule.provideResetPasswordFragmentPresenter(paramIB2pView, paramBox7LoginAccountManager, paramILoginManager, paramLoginPreferences, paramTimeoutPreferences, paramTrackingHelper), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ResetPasswordFragmentPresenter get()
  {
    return provideInstance(this.b2pViewProvider, this.box7LoginAccountManagerProvider, this.loginManagerProvider, this.loginPreferencesProvider, this.timeoutPreferencesProvider, this.trackingHelperProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/ResetPasswordFragmentModule_ProvideResetPasswordFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */