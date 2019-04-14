package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.performance.IPerformanceTimingManager;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.ICustomerModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionModelRepository;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.HotlineUtils;
import de.eplus.mappecc.client.android.common.utils.preferences.LoginPreferences;
import de.eplus.mappecc.client.android.feature.topup.overview.TopUpOverviewFragmentPresenter;
import javax.inject.Provider;

public final class TopUpOverviewFragmentModule_ProvideTopUpOverviewFragmentPresenterFactory
  implements Factory<TopUpOverviewFragmentPresenter>
{
  private final Provider<IB2pView> b2pViewProvider;
  private final Provider<Box7SubscriptionManager> box7SubscriptionManagerProvider;
  private final Provider<ICustomerModelRepository> customerModelRepositoryProvider;
  private final Provider<HotlineUtils> hotlineUtilsProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<LoginPreferences> loginPreferencesProvider;
  private final Provider<IPerformanceTimingManager> performanceTimingManagerProvider;
  private final Provider<ISubscriptionModelRepository> subscriptionModelRepositoryProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  
  public TopUpOverviewFragmentModule_ProvideTopUpOverviewFragmentPresenterFactory(Provider<TrackingHelper> paramProvider, Provider<IPerformanceTimingManager> paramProvider1, Provider<Localizer> paramProvider2, Provider<Box7SubscriptionManager> paramProvider3, Provider<IB2pView> paramProvider4, Provider<LoginPreferences> paramProvider5, Provider<HotlineUtils> paramProvider6, Provider<ISubscriptionModelRepository> paramProvider7, Provider<ICustomerModelRepository> paramProvider8)
  {
    this.trackingHelperProvider = paramProvider;
    this.performanceTimingManagerProvider = paramProvider1;
    this.localizerProvider = paramProvider2;
    this.box7SubscriptionManagerProvider = paramProvider3;
    this.b2pViewProvider = paramProvider4;
    this.loginPreferencesProvider = paramProvider5;
    this.hotlineUtilsProvider = paramProvider6;
    this.subscriptionModelRepositoryProvider = paramProvider7;
    this.customerModelRepositoryProvider = paramProvider8;
  }
  
  public static TopUpOverviewFragmentModule_ProvideTopUpOverviewFragmentPresenterFactory create(Provider<TrackingHelper> paramProvider, Provider<IPerformanceTimingManager> paramProvider1, Provider<Localizer> paramProvider2, Provider<Box7SubscriptionManager> paramProvider3, Provider<IB2pView> paramProvider4, Provider<LoginPreferences> paramProvider5, Provider<HotlineUtils> paramProvider6, Provider<ISubscriptionModelRepository> paramProvider7, Provider<ICustomerModelRepository> paramProvider8)
  {
    return new TopUpOverviewFragmentModule_ProvideTopUpOverviewFragmentPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5, paramProvider6, paramProvider7, paramProvider8);
  }
  
  public static TopUpOverviewFragmentPresenter provideInstance(Provider<TrackingHelper> paramProvider, Provider<IPerformanceTimingManager> paramProvider1, Provider<Localizer> paramProvider2, Provider<Box7SubscriptionManager> paramProvider3, Provider<IB2pView> paramProvider4, Provider<LoginPreferences> paramProvider5, Provider<HotlineUtils> paramProvider6, Provider<ISubscriptionModelRepository> paramProvider7, Provider<ICustomerModelRepository> paramProvider8)
  {
    return proxyProvideTopUpOverviewFragmentPresenter((TrackingHelper)paramProvider.get(), (IPerformanceTimingManager)paramProvider1.get(), (Localizer)paramProvider2.get(), (Box7SubscriptionManager)paramProvider3.get(), (IB2pView)paramProvider4.get(), (LoginPreferences)paramProvider5.get(), (HotlineUtils)paramProvider6.get(), (ISubscriptionModelRepository)paramProvider7.get(), (ICustomerModelRepository)paramProvider8.get());
  }
  
  public static TopUpOverviewFragmentPresenter proxyProvideTopUpOverviewFragmentPresenter(TrackingHelper paramTrackingHelper, IPerformanceTimingManager paramIPerformanceTimingManager, Localizer paramLocalizer, Box7SubscriptionManager paramBox7SubscriptionManager, IB2pView paramIB2pView, LoginPreferences paramLoginPreferences, HotlineUtils paramHotlineUtils, ISubscriptionModelRepository paramISubscriptionModelRepository, ICustomerModelRepository paramICustomerModelRepository)
  {
    return (TopUpOverviewFragmentPresenter)Preconditions.checkNotNull(TopUpOverviewFragmentModule.provideTopUpOverviewFragmentPresenter(paramTrackingHelper, paramIPerformanceTimingManager, paramLocalizer, paramBox7SubscriptionManager, paramIB2pView, paramLoginPreferences, paramHotlineUtils, paramISubscriptionModelRepository, paramICustomerModelRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final TopUpOverviewFragmentPresenter get()
  {
    return provideInstance(this.trackingHelperProvider, this.performanceTimingManagerProvider, this.localizerProvider, this.box7SubscriptionManagerProvider, this.b2pViewProvider, this.loginPreferencesProvider, this.hotlineUtilsProvider, this.subscriptionModelRepositoryProvider, this.customerModelRepositoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/TopUpOverviewFragmentModule_ProvideTopUpOverviewFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */