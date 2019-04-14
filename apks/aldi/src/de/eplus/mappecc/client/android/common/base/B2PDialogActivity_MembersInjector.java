package de.eplus.mappecc.client.android.common.base;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import de.eplus.mappecc.client.android.common.eventbus.MainThreadBus;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.performance.IPerformanceTimingManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.network.piranha.LoginManager;
import de.eplus.mappecc.client.android.common.network.piranha.model.higherlogin.IHigherLoginManager;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import javax.inject.Provider;

public final class B2PDialogActivity_MembersInjector
  implements MembersInjector<B2PDialogActivity>
{
  private final Provider<Box7Cache> box7CacheProvider;
  private final Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider;
  private final Provider<IHigherLoginManager> higherLoginManagerProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<LoginManager> loginManagerProvider;
  private final Provider<MainThreadBus> mainThreadBusProvider;
  private final Provider<IPerformanceTimingManager> performanceTimingManagerProvider;
  private final Provider<DispatchingAndroidInjector<android.support.v4.app.Fragment>> supportFragmentInjectorProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  
  public B2PDialogActivity_MembersInjector(Provider<DispatchingAndroidInjector<android.support.v4.app.Fragment>> paramProvider, Provider<DispatchingAndroidInjector<android.app.Fragment>> paramProvider1, Provider<Localizer> paramProvider2, Provider<TrackingHelper> paramProvider3, Provider<LoginManager> paramProvider4, Provider<IHigherLoginManager> paramProvider5, Provider<Box7Cache> paramProvider6, Provider<MainThreadBus> paramProvider7, Provider<IPerformanceTimingManager> paramProvider8)
  {
    this.supportFragmentInjectorProvider = paramProvider;
    this.frameworkFragmentInjectorProvider = paramProvider1;
    this.localizerProvider = paramProvider2;
    this.trackingHelperProvider = paramProvider3;
    this.loginManagerProvider = paramProvider4;
    this.higherLoginManagerProvider = paramProvider5;
    this.box7CacheProvider = paramProvider6;
    this.mainThreadBusProvider = paramProvider7;
    this.performanceTimingManagerProvider = paramProvider8;
  }
  
  public static MembersInjector<B2PDialogActivity> create(Provider<DispatchingAndroidInjector<android.support.v4.app.Fragment>> paramProvider, Provider<DispatchingAndroidInjector<android.app.Fragment>> paramProvider1, Provider<Localizer> paramProvider2, Provider<TrackingHelper> paramProvider3, Provider<LoginManager> paramProvider4, Provider<IHigherLoginManager> paramProvider5, Provider<Box7Cache> paramProvider6, Provider<MainThreadBus> paramProvider7, Provider<IPerformanceTimingManager> paramProvider8)
  {
    return new B2PDialogActivity_MembersInjector(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5, paramProvider6, paramProvider7, paramProvider8);
  }
  
  public static void injectBox7Cache(B2PDialogActivity paramB2PDialogActivity, Box7Cache paramBox7Cache)
  {
    paramB2PDialogActivity.box7Cache = paramBox7Cache;
  }
  
  public static void injectHigherLoginManager(B2PDialogActivity paramB2PDialogActivity, IHigherLoginManager paramIHigherLoginManager)
  {
    paramB2PDialogActivity.higherLoginManager = paramIHigherLoginManager;
  }
  
  public static void injectLocalizer(B2PDialogActivity paramB2PDialogActivity, Localizer paramLocalizer)
  {
    paramB2PDialogActivity.localizer = paramLocalizer;
  }
  
  public static void injectLoginManager(B2PDialogActivity paramB2PDialogActivity, LoginManager paramLoginManager)
  {
    paramB2PDialogActivity.loginManager = paramLoginManager;
  }
  
  public static void injectMainThreadBus(B2PDialogActivity paramB2PDialogActivity, MainThreadBus paramMainThreadBus)
  {
    paramB2PDialogActivity.mainThreadBus = paramMainThreadBus;
  }
  
  public static void injectPerformanceTimingManager(B2PDialogActivity paramB2PDialogActivity, IPerformanceTimingManager paramIPerformanceTimingManager)
  {
    paramB2PDialogActivity.performanceTimingManager = paramIPerformanceTimingManager;
  }
  
  public static void injectTrackingHelper(B2PDialogActivity paramB2PDialogActivity, TrackingHelper paramTrackingHelper)
  {
    paramB2PDialogActivity.trackingHelper = paramTrackingHelper;
  }
  
  public final void injectMembers(B2PDialogActivity paramB2PDialogActivity)
  {
    DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(paramB2PDialogActivity, (DispatchingAndroidInjector)this.supportFragmentInjectorProvider.get());
    DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(paramB2PDialogActivity, (DispatchingAndroidInjector)this.frameworkFragmentInjectorProvider.get());
    injectLocalizer(paramB2PDialogActivity, (Localizer)this.localizerProvider.get());
    injectTrackingHelper(paramB2PDialogActivity, (TrackingHelper)this.trackingHelperProvider.get());
    injectLoginManager(paramB2PDialogActivity, (LoginManager)this.loginManagerProvider.get());
    injectHigherLoginManager(paramB2PDialogActivity, (IHigherLoginManager)this.higherLoginManagerProvider.get());
    injectBox7Cache(paramB2PDialogActivity, (Box7Cache)this.box7CacheProvider.get());
    injectMainThreadBus(paramB2PDialogActivity, (MainThreadBus)this.mainThreadBusProvider.get());
    injectPerformanceTimingManager(paramB2PDialogActivity, (IPerformanceTimingManager)this.performanceTimingManagerProvider.get());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/base/B2PDialogActivity_MembersInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */