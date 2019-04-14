package de.eplus.mappecc.client.android.common.base;

import android.app.Application;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import de.eplus.mappecc.client.android.common.eventbus.BusEventReceiver;
import de.eplus.mappecc.client.android.common.eventbus.MainThreadBus;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.performance.IPerformanceTimingManager;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationManagerFactory;
import de.eplus.mappecc.client.android.common.network.moe.ViewSetterFactory;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.network.piranha.LoginManager;
import de.eplus.mappecc.client.android.common.network.piranha.model.higherlogin.IHigherLoginManager;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.SimUtils;
import de.eplus.mappecc.client.android.common.utils.preferences.UserPreferences;
import javax.inject.Provider;

public final class B2PActivity_MembersInjector<T extends IPresenter>
  implements MembersInjector<B2PActivity<T>>
{
  private final Provider<Application> applicationProvider;
  private final Provider<Box7Cache> box7CacheProvider;
  private final Provider<MainThreadBus> busAndMainThreadBusProvider;
  private final Provider<BusEventReceiver> busEventReceiverProvider;
  private final Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider;
  private final Provider<IHigherLoginManager> higherLoginManagerProvider;
  private final Provider<LocalizationManagerFactory> localizationManagerFactoryProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<LoginManager> loginManagerProvider;
  private final Provider<IPerformanceTimingManager> performanceTimingManagerProvider;
  private final Provider<SimUtils> simUtilsProvider;
  private final Provider<DispatchingAndroidInjector<android.support.v4.app.Fragment>> supportFragmentInjectorProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  private final Provider<UserPreferences> userPreferencesProvider;
  private final Provider<ViewSetterFactory> viewSetterFactoryProvider;
  
  public B2PActivity_MembersInjector(Provider<DispatchingAndroidInjector<android.support.v4.app.Fragment>> paramProvider, Provider<DispatchingAndroidInjector<android.app.Fragment>> paramProvider1, Provider<Localizer> paramProvider2, Provider<TrackingHelper> paramProvider3, Provider<LoginManager> paramProvider4, Provider<IHigherLoginManager> paramProvider5, Provider<Box7Cache> paramProvider6, Provider<MainThreadBus> paramProvider7, Provider<IPerformanceTimingManager> paramProvider8, Provider<Application> paramProvider9, Provider<ViewSetterFactory> paramProvider10, Provider<LocalizationManagerFactory> paramProvider11, Provider<BusEventReceiver> paramProvider12, Provider<UserPreferences> paramProvider13, Provider<SimUtils> paramProvider14)
  {
    this.supportFragmentInjectorProvider = paramProvider;
    this.frameworkFragmentInjectorProvider = paramProvider1;
    this.localizerProvider = paramProvider2;
    this.trackingHelperProvider = paramProvider3;
    this.loginManagerProvider = paramProvider4;
    this.higherLoginManagerProvider = paramProvider5;
    this.box7CacheProvider = paramProvider6;
    this.busAndMainThreadBusProvider = paramProvider7;
    this.performanceTimingManagerProvider = paramProvider8;
    this.applicationProvider = paramProvider9;
    this.viewSetterFactoryProvider = paramProvider10;
    this.localizationManagerFactoryProvider = paramProvider11;
    this.busEventReceiverProvider = paramProvider12;
    this.userPreferencesProvider = paramProvider13;
    this.simUtilsProvider = paramProvider14;
  }
  
  public static <T extends IPresenter> MembersInjector<B2PActivity<T>> create(Provider<DispatchingAndroidInjector<android.support.v4.app.Fragment>> paramProvider, Provider<DispatchingAndroidInjector<android.app.Fragment>> paramProvider1, Provider<Localizer> paramProvider2, Provider<TrackingHelper> paramProvider3, Provider<LoginManager> paramProvider4, Provider<IHigherLoginManager> paramProvider5, Provider<Box7Cache> paramProvider6, Provider<MainThreadBus> paramProvider7, Provider<IPerformanceTimingManager> paramProvider8, Provider<Application> paramProvider9, Provider<ViewSetterFactory> paramProvider10, Provider<LocalizationManagerFactory> paramProvider11, Provider<BusEventReceiver> paramProvider12, Provider<UserPreferences> paramProvider13, Provider<SimUtils> paramProvider14)
  {
    return new B2PActivity_MembersInjector(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5, paramProvider6, paramProvider7, paramProvider8, paramProvider9, paramProvider10, paramProvider11, paramProvider12, paramProvider13, paramProvider14);
  }
  
  public static <T extends IPresenter> void injectApplication(B2PActivity<T> paramB2PActivity, Application paramApplication)
  {
    paramB2PActivity.application = paramApplication;
  }
  
  public static <T extends IPresenter> void injectBox7Cache(B2PActivity<T> paramB2PActivity, Box7Cache paramBox7Cache)
  {
    paramB2PActivity.box7Cache = paramBox7Cache;
  }
  
  public static <T extends IPresenter> void injectBus(B2PActivity<T> paramB2PActivity, MainThreadBus paramMainThreadBus)
  {
    paramB2PActivity.bus = paramMainThreadBus;
  }
  
  public static <T extends IPresenter> void injectBusEventReceiver(B2PActivity<T> paramB2PActivity, BusEventReceiver paramBusEventReceiver)
  {
    paramB2PActivity.busEventReceiver = paramBusEventReceiver;
  }
  
  public static <T extends IPresenter> void injectLocalizationManagerFactory(B2PActivity<T> paramB2PActivity, LocalizationManagerFactory paramLocalizationManagerFactory)
  {
    paramB2PActivity.localizationManagerFactory = paramLocalizationManagerFactory;
  }
  
  public static <T extends IPresenter> void injectLoginManager(B2PActivity<T> paramB2PActivity, LoginManager paramLoginManager)
  {
    paramB2PActivity.loginManager = paramLoginManager;
  }
  
  public static <T extends IPresenter> void injectSimUtils(B2PActivity<T> paramB2PActivity, SimUtils paramSimUtils)
  {
    paramB2PActivity.simUtils = paramSimUtils;
  }
  
  public static <T extends IPresenter> void injectUserPreferences(B2PActivity<T> paramB2PActivity, UserPreferences paramUserPreferences)
  {
    paramB2PActivity.userPreferences = paramUserPreferences;
  }
  
  public static <T extends IPresenter> void injectViewSetterFactory(B2PActivity<T> paramB2PActivity, ViewSetterFactory paramViewSetterFactory)
  {
    paramB2PActivity.viewSetterFactory = paramViewSetterFactory;
  }
  
  public final void injectMembers(B2PActivity<T> paramB2PActivity)
  {
    DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(paramB2PActivity, (DispatchingAndroidInjector)this.supportFragmentInjectorProvider.get());
    DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(paramB2PActivity, (DispatchingAndroidInjector)this.frameworkFragmentInjectorProvider.get());
    B2PDialogActivity_MembersInjector.injectLocalizer(paramB2PActivity, (Localizer)this.localizerProvider.get());
    B2PDialogActivity_MembersInjector.injectTrackingHelper(paramB2PActivity, (TrackingHelper)this.trackingHelperProvider.get());
    B2PDialogActivity_MembersInjector.injectLoginManager(paramB2PActivity, (LoginManager)this.loginManagerProvider.get());
    B2PDialogActivity_MembersInjector.injectHigherLoginManager(paramB2PActivity, (IHigherLoginManager)this.higherLoginManagerProvider.get());
    B2PDialogActivity_MembersInjector.injectBox7Cache(paramB2PActivity, (Box7Cache)this.box7CacheProvider.get());
    B2PDialogActivity_MembersInjector.injectMainThreadBus(paramB2PActivity, (MainThreadBus)this.busAndMainThreadBusProvider.get());
    B2PDialogActivity_MembersInjector.injectPerformanceTimingManager(paramB2PActivity, (IPerformanceTimingManager)this.performanceTimingManagerProvider.get());
    injectApplication(paramB2PActivity, (Application)this.applicationProvider.get());
    injectBus(paramB2PActivity, (MainThreadBus)this.busAndMainThreadBusProvider.get());
    injectViewSetterFactory(paramB2PActivity, (ViewSetterFactory)this.viewSetterFactoryProvider.get());
    injectLocalizationManagerFactory(paramB2PActivity, (LocalizationManagerFactory)this.localizationManagerFactoryProvider.get());
    injectBusEventReceiver(paramB2PActivity, (BusEventReceiver)this.busEventReceiverProvider.get());
    injectUserPreferences(paramB2PActivity, (UserPreferences)this.userPreferencesProvider.get());
    injectLoginManager(paramB2PActivity, (LoginManager)this.loginManagerProvider.get());
    injectBox7Cache(paramB2PActivity, (Box7Cache)this.box7CacheProvider.get());
    injectSimUtils(paramB2PActivity, (SimUtils)this.simUtilsProvider.get());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/base/B2PActivity_MembersInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */