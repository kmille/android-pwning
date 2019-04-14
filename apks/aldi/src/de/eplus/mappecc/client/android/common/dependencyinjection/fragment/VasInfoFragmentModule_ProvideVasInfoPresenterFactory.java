package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.feature.pack.vas.VasInfoPresenter;
import javax.inject.Provider;

public final class VasInfoFragmentModule_ProvideVasInfoPresenterFactory
  implements Factory<VasInfoPresenter>
{
  private final Provider<Box7SubscriptionManager> box7SubscriptionManagerProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  
  public VasInfoFragmentModule_ProvideVasInfoPresenterFactory(Provider<Localizer> paramProvider, Provider<Box7SubscriptionManager> paramProvider1, Provider<TrackingHelper> paramProvider2)
  {
    this.localizerProvider = paramProvider;
    this.box7SubscriptionManagerProvider = paramProvider1;
    this.trackingHelperProvider = paramProvider2;
  }
  
  public static VasInfoFragmentModule_ProvideVasInfoPresenterFactory create(Provider<Localizer> paramProvider, Provider<Box7SubscriptionManager> paramProvider1, Provider<TrackingHelper> paramProvider2)
  {
    return new VasInfoFragmentModule_ProvideVasInfoPresenterFactory(paramProvider, paramProvider1, paramProvider2);
  }
  
  public static VasInfoPresenter provideInstance(Provider<Localizer> paramProvider, Provider<Box7SubscriptionManager> paramProvider1, Provider<TrackingHelper> paramProvider2)
  {
    return proxyProvideVasInfoPresenter((Localizer)paramProvider.get(), (Box7SubscriptionManager)paramProvider1.get(), (TrackingHelper)paramProvider2.get());
  }
  
  public static VasInfoPresenter proxyProvideVasInfoPresenter(Localizer paramLocalizer, Box7SubscriptionManager paramBox7SubscriptionManager, TrackingHelper paramTrackingHelper)
  {
    return (VasInfoPresenter)Preconditions.checkNotNull(VasInfoFragmentModule.provideVasInfoPresenter(paramLocalizer, paramBox7SubscriptionManager, paramTrackingHelper), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final VasInfoPresenter get()
  {
    return provideInstance(this.localizerProvider, this.box7SubscriptionManagerProvider, this.trackingHelperProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/VasInfoFragmentModule_ProvideVasInfoPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */