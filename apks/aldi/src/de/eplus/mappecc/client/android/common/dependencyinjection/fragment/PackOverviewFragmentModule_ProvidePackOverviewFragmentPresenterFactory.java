package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.performance.IPerformanceTimingManager;
import de.eplus.mappecc.client.android.common.network.moe.MoeUpdateManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionModelRepository;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.BrandUtils;
import de.eplus.mappecc.client.android.common.utils.NetworkUtils;
import de.eplus.mappecc.client.android.feature.pack.overview.PackDataModelFactory;
import de.eplus.mappecc.client.android.feature.pack.overview.PackOverviewFragmentPresenter;
import javax.inject.Provider;

public final class PackOverviewFragmentModule_ProvidePackOverviewFragmentPresenterFactory
  implements Factory<PackOverviewFragmentPresenter>
{
  private final Provider<IB2pView> b2pViewProvider;
  private final Provider<Box7Cache> box7CacheProvider;
  private final Provider<BrandUtils> brandUtilsProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<MoeUpdateManager> moeUpdateManagerProvider;
  private final Provider<NetworkUtils> networkUtilsProvider;
  private final Provider<PackDataModelFactory> packDataModelFactoryProvider;
  private final Provider<IPerformanceTimingManager> performanceTimingManagerProvider;
  private final Provider<ISubscriptionModelRepository> subscriptionModelRepositoryProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  
  public PackOverviewFragmentModule_ProvidePackOverviewFragmentPresenterFactory(Provider<MoeUpdateManager> paramProvider, Provider<Box7Cache> paramProvider1, Provider<Localizer> paramProvider2, Provider<IPerformanceTimingManager> paramProvider3, Provider<TrackingHelper> paramProvider4, Provider<IB2pView> paramProvider5, Provider<BrandUtils> paramProvider6, Provider<PackDataModelFactory> paramProvider7, Provider<NetworkUtils> paramProvider8, Provider<ISubscriptionModelRepository> paramProvider9)
  {
    this.moeUpdateManagerProvider = paramProvider;
    this.box7CacheProvider = paramProvider1;
    this.localizerProvider = paramProvider2;
    this.performanceTimingManagerProvider = paramProvider3;
    this.trackingHelperProvider = paramProvider4;
    this.b2pViewProvider = paramProvider5;
    this.brandUtilsProvider = paramProvider6;
    this.packDataModelFactoryProvider = paramProvider7;
    this.networkUtilsProvider = paramProvider8;
    this.subscriptionModelRepositoryProvider = paramProvider9;
  }
  
  public static PackOverviewFragmentModule_ProvidePackOverviewFragmentPresenterFactory create(Provider<MoeUpdateManager> paramProvider, Provider<Box7Cache> paramProvider1, Provider<Localizer> paramProvider2, Provider<IPerformanceTimingManager> paramProvider3, Provider<TrackingHelper> paramProvider4, Provider<IB2pView> paramProvider5, Provider<BrandUtils> paramProvider6, Provider<PackDataModelFactory> paramProvider7, Provider<NetworkUtils> paramProvider8, Provider<ISubscriptionModelRepository> paramProvider9)
  {
    return new PackOverviewFragmentModule_ProvidePackOverviewFragmentPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5, paramProvider6, paramProvider7, paramProvider8, paramProvider9);
  }
  
  public static PackOverviewFragmentPresenter provideInstance(Provider<MoeUpdateManager> paramProvider, Provider<Box7Cache> paramProvider1, Provider<Localizer> paramProvider2, Provider<IPerformanceTimingManager> paramProvider3, Provider<TrackingHelper> paramProvider4, Provider<IB2pView> paramProvider5, Provider<BrandUtils> paramProvider6, Provider<PackDataModelFactory> paramProvider7, Provider<NetworkUtils> paramProvider8, Provider<ISubscriptionModelRepository> paramProvider9)
  {
    return proxyProvidePackOverviewFragmentPresenter((MoeUpdateManager)paramProvider.get(), (Box7Cache)paramProvider1.get(), (Localizer)paramProvider2.get(), (IPerformanceTimingManager)paramProvider3.get(), (TrackingHelper)paramProvider4.get(), (IB2pView)paramProvider5.get(), (BrandUtils)paramProvider6.get(), (PackDataModelFactory)paramProvider7.get(), (NetworkUtils)paramProvider8.get(), (ISubscriptionModelRepository)paramProvider9.get());
  }
  
  public static PackOverviewFragmentPresenter proxyProvidePackOverviewFragmentPresenter(MoeUpdateManager paramMoeUpdateManager, Box7Cache paramBox7Cache, Localizer paramLocalizer, IPerformanceTimingManager paramIPerformanceTimingManager, TrackingHelper paramTrackingHelper, IB2pView paramIB2pView, BrandUtils paramBrandUtils, PackDataModelFactory paramPackDataModelFactory, NetworkUtils paramNetworkUtils, ISubscriptionModelRepository paramISubscriptionModelRepository)
  {
    return (PackOverviewFragmentPresenter)Preconditions.checkNotNull(PackOverviewFragmentModule.providePackOverviewFragmentPresenter(paramMoeUpdateManager, paramBox7Cache, paramLocalizer, paramIPerformanceTimingManager, paramTrackingHelper, paramIB2pView, paramBrandUtils, paramPackDataModelFactory, paramNetworkUtils, paramISubscriptionModelRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final PackOverviewFragmentPresenter get()
  {
    return provideInstance(this.moeUpdateManagerProvider, this.box7CacheProvider, this.localizerProvider, this.performanceTimingManagerProvider, this.trackingHelperProvider, this.b2pViewProvider, this.brandUtilsProvider, this.packDataModelFactoryProvider, this.networkUtilsProvider, this.subscriptionModelRepositoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/PackOverviewFragmentModule_ProvidePackOverviewFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */