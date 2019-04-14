package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
import de.eplus.mappecc.client.android.feature.customer.ChangePasswordPresenter;
import de.eplus.mappecc.client.android.feature.customer.IChangePasswordView;
import javax.inject.Provider;

public final class ChangePasswordActivityModule_ProvideChangePasswordPresenterFactory
  implements Factory<ChangePasswordPresenter>
{
  private final Provider<IB2pView> b2pViewProvider;
  private final Provider<Box7Cache> box7CacheProvider;
  private final Provider<Box7LoginAccountManager> box7LoginAccountManagerProvider;
  private final Provider<Box7RestApiLib> box7RestApiLibProvider;
  private final Provider<IChangePasswordView> changePasswordViewProvider;
  private final Provider<ICustomerModelRepository> customerModelRepositoryProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<LoginManager> loginManagerProvider;
  private final Provider<LoginPreferences> loginPreferencesProvider;
  private final Provider<TEFPasswordHelper> tefPasswordHelperProvider;
  private final Provider<TimeoutPreferences> timeoutPreferencesProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  
  public ChangePasswordActivityModule_ProvideChangePasswordPresenterFactory(Provider<IChangePasswordView> paramProvider, Provider<IB2pView> paramProvider1, Provider<Box7Cache> paramProvider2, Provider<Localizer> paramProvider3, Provider<Box7LoginAccountManager> paramProvider4, Provider<LoginPreferences> paramProvider5, Provider<TEFPasswordHelper> paramProvider6, Provider<TrackingHelper> paramProvider7, Provider<Box7RestApiLib> paramProvider8, Provider<ICustomerModelRepository> paramProvider9, Provider<TimeoutPreferences> paramProvider10, Provider<LoginManager> paramProvider11)
  {
    this.changePasswordViewProvider = paramProvider;
    this.b2pViewProvider = paramProvider1;
    this.box7CacheProvider = paramProvider2;
    this.localizerProvider = paramProvider3;
    this.box7LoginAccountManagerProvider = paramProvider4;
    this.loginPreferencesProvider = paramProvider5;
    this.tefPasswordHelperProvider = paramProvider6;
    this.trackingHelperProvider = paramProvider7;
    this.box7RestApiLibProvider = paramProvider8;
    this.customerModelRepositoryProvider = paramProvider9;
    this.timeoutPreferencesProvider = paramProvider10;
    this.loginManagerProvider = paramProvider11;
  }
  
  public static ChangePasswordActivityModule_ProvideChangePasswordPresenterFactory create(Provider<IChangePasswordView> paramProvider, Provider<IB2pView> paramProvider1, Provider<Box7Cache> paramProvider2, Provider<Localizer> paramProvider3, Provider<Box7LoginAccountManager> paramProvider4, Provider<LoginPreferences> paramProvider5, Provider<TEFPasswordHelper> paramProvider6, Provider<TrackingHelper> paramProvider7, Provider<Box7RestApiLib> paramProvider8, Provider<ICustomerModelRepository> paramProvider9, Provider<TimeoutPreferences> paramProvider10, Provider<LoginManager> paramProvider11)
  {
    return new ChangePasswordActivityModule_ProvideChangePasswordPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5, paramProvider6, paramProvider7, paramProvider8, paramProvider9, paramProvider10, paramProvider11);
  }
  
  public static ChangePasswordPresenter provideInstance(Provider<IChangePasswordView> paramProvider, Provider<IB2pView> paramProvider1, Provider<Box7Cache> paramProvider2, Provider<Localizer> paramProvider3, Provider<Box7LoginAccountManager> paramProvider4, Provider<LoginPreferences> paramProvider5, Provider<TEFPasswordHelper> paramProvider6, Provider<TrackingHelper> paramProvider7, Provider<Box7RestApiLib> paramProvider8, Provider<ICustomerModelRepository> paramProvider9, Provider<TimeoutPreferences> paramProvider10, Provider<LoginManager> paramProvider11)
  {
    return proxyProvideChangePasswordPresenter((IChangePasswordView)paramProvider.get(), (IB2pView)paramProvider1.get(), (Box7Cache)paramProvider2.get(), (Localizer)paramProvider3.get(), (Box7LoginAccountManager)paramProvider4.get(), (LoginPreferences)paramProvider5.get(), (TEFPasswordHelper)paramProvider6.get(), (TrackingHelper)paramProvider7.get(), (Box7RestApiLib)paramProvider8.get(), (ICustomerModelRepository)paramProvider9.get(), (TimeoutPreferences)paramProvider10.get(), (LoginManager)paramProvider11.get());
  }
  
  public static ChangePasswordPresenter proxyProvideChangePasswordPresenter(IChangePasswordView paramIChangePasswordView, IB2pView paramIB2pView, Box7Cache paramBox7Cache, Localizer paramLocalizer, Box7LoginAccountManager paramBox7LoginAccountManager, LoginPreferences paramLoginPreferences, TEFPasswordHelper paramTEFPasswordHelper, TrackingHelper paramTrackingHelper, Box7RestApiLib paramBox7RestApiLib, ICustomerModelRepository paramICustomerModelRepository, TimeoutPreferences paramTimeoutPreferences, LoginManager paramLoginManager)
  {
    return (ChangePasswordPresenter)Preconditions.checkNotNull(ChangePasswordActivityModule.provideChangePasswordPresenter(paramIChangePasswordView, paramIB2pView, paramBox7Cache, paramLocalizer, paramBox7LoginAccountManager, paramLoginPreferences, paramTEFPasswordHelper, paramTrackingHelper, paramBox7RestApiLib, paramICustomerModelRepository, paramTimeoutPreferences, paramLoginManager), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ChangePasswordPresenter get()
  {
    return provideInstance(this.changePasswordViewProvider, this.b2pViewProvider, this.box7CacheProvider, this.localizerProvider, this.box7LoginAccountManagerProvider, this.loginPreferencesProvider, this.tefPasswordHelperProvider, this.trackingHelperProvider, this.box7RestApiLibProvider, this.customerModelRepositoryProvider, this.timeoutPreferencesProvider, this.loginManagerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/ChangePasswordActivityModule_ProvideChangePasswordPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */