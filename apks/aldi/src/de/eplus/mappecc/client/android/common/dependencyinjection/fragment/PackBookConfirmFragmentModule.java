package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.performance.IPerformanceTimingManager;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.ErrorUtils;
import de.eplus.mappecc.client.android.feature.pack.bookconfirm.IPackBookConfirmView;
import de.eplus.mappecc.client.android.feature.pack.bookconfirm.PackBookConfirmFragment;
import de.eplus.mappecc.client.android.feature.pack.bookconfirm.PackBookConfirmFragmentPresenter;

@Module
public abstract class PackBookConfirmFragmentModule
{
  @Provides
  static PackBookConfirmFragmentPresenter providePackBookConfirmFragmentPresenter(Localizer paramLocalizer, TrackingHelper paramTrackingHelper, Box7SubscriptionManager paramBox7SubscriptionManager, IPerformanceTimingManager paramIPerformanceTimingManager, Box7Cache paramBox7Cache, IB2pView paramIB2pView, ErrorUtils paramErrorUtils)
  {
    return new PackBookConfirmFragmentPresenter(paramLocalizer, paramTrackingHelper, paramBox7SubscriptionManager, paramIPerformanceTimingManager, paramBox7Cache, paramIB2pView, paramErrorUtils);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract PackBookConfirmFragment packBookConfirmFragmentInjector();
  
  @Binds
  public abstract IPackBookConfirmView view(PackBookConfirmFragment paramPackBookConfirmFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/PackBookConfirmFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */