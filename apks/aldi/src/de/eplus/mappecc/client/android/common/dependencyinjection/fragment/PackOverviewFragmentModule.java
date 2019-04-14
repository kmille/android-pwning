package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import android.support.annotation.NonNull;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.performance.IPerformanceTimingManager;
import de.eplus.mappecc.client.android.common.network.moe.MoeUpdateManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionModelRepository;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.BrandUtils;
import de.eplus.mappecc.client.android.common.utils.NetworkUtils;
import de.eplus.mappecc.client.android.feature.pack.PackActivity;
import de.eplus.mappecc.client.android.feature.pack.overview.IPackOverviewView;
import de.eplus.mappecc.client.android.feature.pack.overview.PackDataModelFactory;
import de.eplus.mappecc.client.android.feature.pack.overview.PackOverviewFragment;
import de.eplus.mappecc.client.android.feature.pack.overview.PackOverviewFragmentPresenter;

@Module
public abstract class PackOverviewFragmentModule
{
  @Provides
  static PackOverviewFragmentPresenter providePackOverviewFragmentPresenter(@NonNull MoeUpdateManager paramMoeUpdateManager, @NonNull Box7Cache paramBox7Cache, @NonNull Localizer paramLocalizer, @NonNull IPerformanceTimingManager paramIPerformanceTimingManager, @NonNull TrackingHelper paramTrackingHelper, @NonNull IB2pView paramIB2pView, @NonNull BrandUtils paramBrandUtils, @NonNull PackDataModelFactory paramPackDataModelFactory, @NonNull NetworkUtils paramNetworkUtils, @NonNull ISubscriptionModelRepository paramISubscriptionModelRepository)
  {
    return new PackOverviewFragmentPresenter(paramMoeUpdateManager, paramBox7Cache, paramLocalizer, paramIPerformanceTimingManager, paramTrackingHelper, paramIB2pView, paramBrandUtils, paramPackDataModelFactory, paramNetworkUtils, paramISubscriptionModelRepository);
  }
  
  @Binds
  public abstract IB2pView ib2pView(PackActivity paramPackActivity);
  
  @PerFragment
  @ContributesAndroidInjector
  abstract PackOverviewFragment packOverviewFragmentInjector();
  
  @Binds
  public abstract IPackOverviewView view(PackOverviewFragment paramPackOverviewFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/PackOverviewFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */