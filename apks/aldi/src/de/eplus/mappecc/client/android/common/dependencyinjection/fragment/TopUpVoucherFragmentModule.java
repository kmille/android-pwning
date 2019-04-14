package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.network.box7.performance.IPerformanceTimingManager;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.TopUpByVoucherHelper;
import de.eplus.mappecc.client.android.feature.topup.voucher.ITopUpVoucherView;
import de.eplus.mappecc.client.android.feature.topup.voucher.TopUpVoucherFragment;
import de.eplus.mappecc.client.android.feature.topup.voucher.TopUpVoucherFragmentPresenter;

@Module
public abstract class TopUpVoucherFragmentModule
{
  @Provides
  static TopUpByVoucherHelper provideTopUpByVoucherHelper()
  {
    return new TopUpByVoucherHelper();
  }
  
  @Provides
  static TopUpVoucherFragmentPresenter provideTopUpVoucherFragmentPresenter(TopUpByVoucherHelper paramTopUpByVoucherHelper, Box7SubscriptionManager paramBox7SubscriptionManager, Localizer paramLocalizer, TrackingHelper paramTrackingHelper, IPerformanceTimingManager paramIPerformanceTimingManager)
  {
    return new TopUpVoucherFragmentPresenter(paramTopUpByVoucherHelper, paramBox7SubscriptionManager, paramLocalizer, paramTrackingHelper, paramIPerformanceTimingManager);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract TopUpVoucherFragment topUpVoucherFragmentInjector();
  
  @Binds
  public abstract ITopUpVoucherView view(TopUpVoucherFragment paramTopUpVoucherFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/TopUpVoucherFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */