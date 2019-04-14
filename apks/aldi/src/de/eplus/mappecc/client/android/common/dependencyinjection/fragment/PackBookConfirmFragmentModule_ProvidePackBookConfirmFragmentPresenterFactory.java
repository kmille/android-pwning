package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.performance.IPerformanceTimingManager;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.ErrorUtils;
import de.eplus.mappecc.client.android.feature.pack.bookconfirm.PackBookConfirmFragmentPresenter;
import javax.inject.Provider;

public final class PackBookConfirmFragmentModule_ProvidePackBookConfirmFragmentPresenterFactory
  implements Factory<PackBookConfirmFragmentPresenter>
{
  private final Provider<IB2pView> b2pViewProvider;
  private final Provider<Box7Cache> box7CacheProvider;
  private final Provider<Box7SubscriptionManager> box7SubscriptionManagerProvider;
  private final Provider<ErrorUtils> errorUtilsProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<IPerformanceTimingManager> performanceTimingManagerProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  
  public PackBookConfirmFragmentModule_ProvidePackBookConfirmFragmentPresenterFactory(Provider<Localizer> paramProvider, Provider<TrackingHelper> paramProvider1, Provider<Box7SubscriptionManager> paramProvider2, Provider<IPerformanceTimingManager> paramProvider3, Provider<Box7Cache> paramProvider4, Provider<IB2pView> paramProvider5, Provider<ErrorUtils> paramProvider6)
  {
    this.localizerProvider = paramProvider;
    this.trackingHelperProvider = paramProvider1;
    this.box7SubscriptionManagerProvider = paramProvider2;
    this.performanceTimingManagerProvider = paramProvider3;
    this.box7CacheProvider = paramProvider4;
    this.b2pViewProvider = paramProvider5;
    this.errorUtilsProvider = paramProvider6;
  }
  
  public static PackBookConfirmFragmentModule_ProvidePackBookConfirmFragmentPresenterFactory create(Provider<Localizer> paramProvider, Provider<TrackingHelper> paramProvider1, Provider<Box7SubscriptionManager> paramProvider2, Provider<IPerformanceTimingManager> paramProvider3, Provider<Box7Cache> paramProvider4, Provider<IB2pView> paramProvider5, Provider<ErrorUtils> paramProvider6)
  {
    return new PackBookConfirmFragmentModule_ProvidePackBookConfirmFragmentPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5, paramProvider6);
  }
  
  public static PackBookConfirmFragmentPresenter provideInstance(Provider<Localizer> paramProvider, Provider<TrackingHelper> paramProvider1, Provider<Box7SubscriptionManager> paramProvider2, Provider<IPerformanceTimingManager> paramProvider3, Provider<Box7Cache> paramProvider4, Provider<IB2pView> paramProvider5, Provider<ErrorUtils> paramProvider6)
  {
    return proxyProvidePackBookConfirmFragmentPresenter((Localizer)paramProvider.get(), (TrackingHelper)paramProvider1.get(), (Box7SubscriptionManager)paramProvider2.get(), (IPerformanceTimingManager)paramProvider3.get(), (Box7Cache)paramProvider4.get(), (IB2pView)paramProvider5.get(), (ErrorUtils)paramProvider6.get());
  }
  
  public static PackBookConfirmFragmentPresenter proxyProvidePackBookConfirmFragmentPresenter(Localizer paramLocalizer, TrackingHelper paramTrackingHelper, Box7SubscriptionManager paramBox7SubscriptionManager, IPerformanceTimingManager paramIPerformanceTimingManager, Box7Cache paramBox7Cache, IB2pView paramIB2pView, ErrorUtils paramErrorUtils)
  {
    return (PackBookConfirmFragmentPresenter)Preconditions.checkNotNull(PackBookConfirmFragmentModule.providePackBookConfirmFragmentPresenter(paramLocalizer, paramTrackingHelper, paramBox7SubscriptionManager, paramIPerformanceTimingManager, paramBox7Cache, paramIB2pView, paramErrorUtils), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final PackBookConfirmFragmentPresenter get()
  {
    return provideInstance(this.localizerProvider, this.trackingHelperProvider, this.box7SubscriptionManagerProvider, this.performanceTimingManagerProvider, this.box7CacheProvider, this.b2pViewProvider, this.errorUtilsProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/PackBookConfirmFragmentModule_ProvidePackBookConfirmFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */