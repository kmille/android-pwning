package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.loginaccount.Box7LoginAccountManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.MailVerificationUtil;
import de.eplus.mappecc.client.android.common.utils.NetworkUtils;
import de.eplus.mappecc.client.android.common.utils.SimUtils;
import de.eplus.mappecc.client.android.feature.resetpassword.overview.ResetFragmentPresenter;
import javax.inject.Provider;

public final class ResetFragmentModule_ProvideResetFragmentPresenterFactory
  implements Factory<ResetFragmentPresenter>
{
  private final Provider<Box7LoginAccountManager> box7LoginAccountManagerProvider;
  private final Provider<IB2pView> ib2pViewProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<MailVerificationUtil> mailVerificationUtilProvider;
  private final Provider<NetworkUtils> networkUtilsProvider;
  private final Provider<SimUtils> simUtilsProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  
  public ResetFragmentModule_ProvideResetFragmentPresenterFactory(Provider<SimUtils> paramProvider, Provider<NetworkUtils> paramProvider1, Provider<MailVerificationUtil> paramProvider2, Provider<Box7LoginAccountManager> paramProvider3, Provider<TrackingHelper> paramProvider4, Provider<Localizer> paramProvider5, Provider<IB2pView> paramProvider6)
  {
    this.simUtilsProvider = paramProvider;
    this.networkUtilsProvider = paramProvider1;
    this.mailVerificationUtilProvider = paramProvider2;
    this.box7LoginAccountManagerProvider = paramProvider3;
    this.trackingHelperProvider = paramProvider4;
    this.localizerProvider = paramProvider5;
    this.ib2pViewProvider = paramProvider6;
  }
  
  public static ResetFragmentModule_ProvideResetFragmentPresenterFactory create(Provider<SimUtils> paramProvider, Provider<NetworkUtils> paramProvider1, Provider<MailVerificationUtil> paramProvider2, Provider<Box7LoginAccountManager> paramProvider3, Provider<TrackingHelper> paramProvider4, Provider<Localizer> paramProvider5, Provider<IB2pView> paramProvider6)
  {
    return new ResetFragmentModule_ProvideResetFragmentPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5, paramProvider6);
  }
  
  public static ResetFragmentPresenter provideInstance(Provider<SimUtils> paramProvider, Provider<NetworkUtils> paramProvider1, Provider<MailVerificationUtil> paramProvider2, Provider<Box7LoginAccountManager> paramProvider3, Provider<TrackingHelper> paramProvider4, Provider<Localizer> paramProvider5, Provider<IB2pView> paramProvider6)
  {
    return proxyProvideResetFragmentPresenter((SimUtils)paramProvider.get(), (NetworkUtils)paramProvider1.get(), (MailVerificationUtil)paramProvider2.get(), (Box7LoginAccountManager)paramProvider3.get(), (TrackingHelper)paramProvider4.get(), (Localizer)paramProvider5.get(), (IB2pView)paramProvider6.get());
  }
  
  public static ResetFragmentPresenter proxyProvideResetFragmentPresenter(SimUtils paramSimUtils, NetworkUtils paramNetworkUtils, MailVerificationUtil paramMailVerificationUtil, Box7LoginAccountManager paramBox7LoginAccountManager, TrackingHelper paramTrackingHelper, Localizer paramLocalizer, IB2pView paramIB2pView)
  {
    return (ResetFragmentPresenter)Preconditions.checkNotNull(ResetFragmentModule.provideResetFragmentPresenter(paramSimUtils, paramNetworkUtils, paramMailVerificationUtil, paramBox7LoginAccountManager, paramTrackingHelper, paramLocalizer, paramIB2pView), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ResetFragmentPresenter get()
  {
    return provideInstance(this.simUtilsProvider, this.networkUtilsProvider, this.mailVerificationUtilProvider, this.box7LoginAccountManagerProvider, this.trackingHelperProvider, this.localizerProvider, this.ib2pViewProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/ResetFragmentModule_ProvideResetFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */