package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.loginaccount.Box7LoginAccountManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.MailVerificationUtil;
import de.eplus.mappecc.client.android.common.utils.NetworkUtils;
import de.eplus.mappecc.client.android.common.utils.SimUtils;
import de.eplus.mappecc.client.android.feature.resetpassword.overview.IResetView;
import de.eplus.mappecc.client.android.feature.resetpassword.overview.ResetFragment;
import de.eplus.mappecc.client.android.feature.resetpassword.overview.ResetFragmentPresenter;

@Module
public abstract class ResetFragmentModule
{
  @Provides
  static ResetFragmentPresenter provideResetFragmentPresenter(SimUtils paramSimUtils, NetworkUtils paramNetworkUtils, MailVerificationUtil paramMailVerificationUtil, Box7LoginAccountManager paramBox7LoginAccountManager, TrackingHelper paramTrackingHelper, Localizer paramLocalizer, IB2pView paramIB2pView)
  {
    return new ResetFragmentPresenter(paramSimUtils, paramNetworkUtils, paramMailVerificationUtil, paramBox7LoginAccountManager, paramTrackingHelper, paramLocalizer, paramIB2pView);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract ResetFragment resetFragmentInjector();
  
  @Binds
  public abstract IResetView view(ResetFragment paramResetFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/ResetFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */