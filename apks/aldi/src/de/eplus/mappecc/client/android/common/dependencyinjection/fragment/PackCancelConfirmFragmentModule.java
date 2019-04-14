package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.ErrorUtils;
import de.eplus.mappecc.client.android.feature.pack.cancelconfirm.IPackCancelConfirmView;
import de.eplus.mappecc.client.android.feature.pack.cancelconfirm.PackCancelConfirmFragment;
import de.eplus.mappecc.client.android.feature.pack.cancelconfirm.PackCancelConfirmFragmentPresenter;

@Module
public abstract class PackCancelConfirmFragmentModule
{
  @Provides
  static PackCancelConfirmFragmentPresenter providePackCancelConfirmFragmentPresenter(Box7SubscriptionManager paramBox7SubscriptionManager, TrackingHelper paramTrackingHelper, Box7Cache paramBox7Cache, ErrorUtils paramErrorUtils)
  {
    return new PackCancelConfirmFragmentPresenter(paramBox7SubscriptionManager, paramTrackingHelper, paramBox7Cache, paramErrorUtils);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract PackCancelConfirmFragment packCancelConfirmFragmentInjector();
  
  @Binds
  public abstract IPackCancelConfirmView view(PackCancelConfirmFragment paramPackCancelConfirmFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/PackCancelConfirmFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */