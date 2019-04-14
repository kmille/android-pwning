package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.feature.help.analytics.AnalyticsPresenter;
import de.eplus.mappecc.client.android.feature.help.analytics.IAnalyticsView;
import javax.inject.Provider;

public final class AnalyticsActivityModule_ProvideAnalyticsPresenterFactory
  implements Factory<AnalyticsPresenter>
{
  private final Provider<IAnalyticsView> analyticsViewProvider;
  private final Provider<IB2pView> b2pViewProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  
  public AnalyticsActivityModule_ProvideAnalyticsPresenterFactory(Provider<IAnalyticsView> paramProvider, Provider<TrackingHelper> paramProvider1, Provider<IB2pView> paramProvider2, Provider<Localizer> paramProvider3)
  {
    this.analyticsViewProvider = paramProvider;
    this.trackingHelperProvider = paramProvider1;
    this.b2pViewProvider = paramProvider2;
    this.localizerProvider = paramProvider3;
  }
  
  public static AnalyticsActivityModule_ProvideAnalyticsPresenterFactory create(Provider<IAnalyticsView> paramProvider, Provider<TrackingHelper> paramProvider1, Provider<IB2pView> paramProvider2, Provider<Localizer> paramProvider3)
  {
    return new AnalyticsActivityModule_ProvideAnalyticsPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3);
  }
  
  public static AnalyticsPresenter provideInstance(Provider<IAnalyticsView> paramProvider, Provider<TrackingHelper> paramProvider1, Provider<IB2pView> paramProvider2, Provider<Localizer> paramProvider3)
  {
    return proxyProvideAnalyticsPresenter((IAnalyticsView)paramProvider.get(), (TrackingHelper)paramProvider1.get(), (IB2pView)paramProvider2.get(), (Localizer)paramProvider3.get());
  }
  
  public static AnalyticsPresenter proxyProvideAnalyticsPresenter(IAnalyticsView paramIAnalyticsView, TrackingHelper paramTrackingHelper, IB2pView paramIB2pView, Localizer paramLocalizer)
  {
    return (AnalyticsPresenter)Preconditions.checkNotNull(AnalyticsActivityModule.provideAnalyticsPresenter(paramIAnalyticsView, paramTrackingHelper, paramIB2pView, paramLocalizer), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final AnalyticsPresenter get()
  {
    return provideInstance(this.analyticsViewProvider, this.trackingHelperProvider, this.b2pViewProvider, this.localizerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/AnalyticsActivityModule_ProvideAnalyticsPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */