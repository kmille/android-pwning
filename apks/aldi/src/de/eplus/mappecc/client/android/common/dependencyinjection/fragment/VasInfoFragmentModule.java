package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.feature.pack.vas.IVasInfoView;
import de.eplus.mappecc.client.android.feature.pack.vas.VasInfoFragment;
import de.eplus.mappecc.client.android.feature.pack.vas.VasInfoPresenter;

@Module
public abstract class VasInfoFragmentModule
{
  @Provides
  static VasInfoPresenter provideVasInfoPresenter(Localizer paramLocalizer, Box7SubscriptionManager paramBox7SubscriptionManager, TrackingHelper paramTrackingHelper)
  {
    return new VasInfoPresenter(paramLocalizer, paramBox7SubscriptionManager, paramTrackingHelper);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract VasInfoFragment vasInfoFragmentInjector();
  
  @Binds
  public abstract IVasInfoView view(VasInfoFragment paramVasInfoFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/VasInfoFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */