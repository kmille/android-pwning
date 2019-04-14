package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import android.support.annotation.NonNull;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.performance.IPerformanceTimingManager;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.ICustomerModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionModelRepository;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.HotlineUtils;
import de.eplus.mappecc.client.android.common.utils.preferences.LoginPreferences;
import de.eplus.mappecc.client.android.feature.topup.overview.ITopUpOverviewView;
import de.eplus.mappecc.client.android.feature.topup.overview.TopUpOverviewFragment;
import de.eplus.mappecc.client.android.feature.topup.overview.TopUpOverviewFragmentPresenter;

@Module
public abstract class TopUpOverviewFragmentModule
{
  @Provides
  static TopUpOverviewFragmentPresenter provideTopUpOverviewFragmentPresenter(@NonNull TrackingHelper paramTrackingHelper, @NonNull IPerformanceTimingManager paramIPerformanceTimingManager, @NonNull Localizer paramLocalizer, @NonNull Box7SubscriptionManager paramBox7SubscriptionManager, @NonNull IB2pView paramIB2pView, @NonNull LoginPreferences paramLoginPreferences, @NonNull HotlineUtils paramHotlineUtils, @NonNull ISubscriptionModelRepository paramISubscriptionModelRepository, @NonNull ICustomerModelRepository paramICustomerModelRepository)
  {
    return new TopUpOverviewFragmentPresenter(paramTrackingHelper, paramIPerformanceTimingManager, paramLocalizer, paramBox7SubscriptionManager, paramIB2pView, paramLoginPreferences, paramHotlineUtils, paramISubscriptionModelRepository, paramICustomerModelRepository);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract TopUpOverviewFragment topUpOverviewFragmentInjector();
  
  @Binds
  public abstract ITopUpOverviewView view(TopUpOverviewFragment paramTopUpOverviewFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/TopUpOverviewFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */