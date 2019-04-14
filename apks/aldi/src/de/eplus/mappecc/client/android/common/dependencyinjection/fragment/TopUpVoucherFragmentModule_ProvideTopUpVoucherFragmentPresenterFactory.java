package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.performance.IPerformanceTimingManager;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.TopUpByVoucherHelper;
import de.eplus.mappecc.client.android.feature.topup.voucher.TopUpVoucherFragmentPresenter;
import javax.inject.Provider;

public final class TopUpVoucherFragmentModule_ProvideTopUpVoucherFragmentPresenterFactory
  implements Factory<TopUpVoucherFragmentPresenter>
{
  private final Provider<Localizer> localizerProvider;
  private final Provider<IPerformanceTimingManager> performanceTimingManagerProvider;
  private final Provider<Box7SubscriptionManager> subscriptionManagerProvider;
  private final Provider<TopUpByVoucherHelper> topUpByVoucherHelperProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  
  public TopUpVoucherFragmentModule_ProvideTopUpVoucherFragmentPresenterFactory(Provider<TopUpByVoucherHelper> paramProvider, Provider<Box7SubscriptionManager> paramProvider1, Provider<Localizer> paramProvider2, Provider<TrackingHelper> paramProvider3, Provider<IPerformanceTimingManager> paramProvider4)
  {
    this.topUpByVoucherHelperProvider = paramProvider;
    this.subscriptionManagerProvider = paramProvider1;
    this.localizerProvider = paramProvider2;
    this.trackingHelperProvider = paramProvider3;
    this.performanceTimingManagerProvider = paramProvider4;
  }
  
  public static TopUpVoucherFragmentModule_ProvideTopUpVoucherFragmentPresenterFactory create(Provider<TopUpByVoucherHelper> paramProvider, Provider<Box7SubscriptionManager> paramProvider1, Provider<Localizer> paramProvider2, Provider<TrackingHelper> paramProvider3, Provider<IPerformanceTimingManager> paramProvider4)
  {
    return new TopUpVoucherFragmentModule_ProvideTopUpVoucherFragmentPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4);
  }
  
  public static TopUpVoucherFragmentPresenter provideInstance(Provider<TopUpByVoucherHelper> paramProvider, Provider<Box7SubscriptionManager> paramProvider1, Provider<Localizer> paramProvider2, Provider<TrackingHelper> paramProvider3, Provider<IPerformanceTimingManager> paramProvider4)
  {
    return proxyProvideTopUpVoucherFragmentPresenter((TopUpByVoucherHelper)paramProvider.get(), (Box7SubscriptionManager)paramProvider1.get(), (Localizer)paramProvider2.get(), (TrackingHelper)paramProvider3.get(), (IPerformanceTimingManager)paramProvider4.get());
  }
  
  public static TopUpVoucherFragmentPresenter proxyProvideTopUpVoucherFragmentPresenter(TopUpByVoucherHelper paramTopUpByVoucherHelper, Box7SubscriptionManager paramBox7SubscriptionManager, Localizer paramLocalizer, TrackingHelper paramTrackingHelper, IPerformanceTimingManager paramIPerformanceTimingManager)
  {
    return (TopUpVoucherFragmentPresenter)Preconditions.checkNotNull(TopUpVoucherFragmentModule.provideTopUpVoucherFragmentPresenter(paramTopUpByVoucherHelper, paramBox7SubscriptionManager, paramLocalizer, paramTrackingHelper, paramIPerformanceTimingManager), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final TopUpVoucherFragmentPresenter get()
  {
    return provideInstance(this.topUpByVoucherHelperProvider, this.subscriptionManagerProvider, this.localizerProvider, this.trackingHelperProvider, this.performanceTimingManagerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/TopUpVoucherFragmentModule_ProvideTopUpVoucherFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */