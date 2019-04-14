package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.feature.onboarding.IOnBoardingView;
import de.eplus.mappecc.client.android.feature.onboarding.OnBoardingPresenter;
import javax.inject.Provider;

public final class OnBoardingActivityModule_ProvideOnBoardingActivityPresenterFactory
  implements Factory<OnBoardingPresenter>
{
  private final Provider<IOnBoardingView> onBoardingViewProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  
  public OnBoardingActivityModule_ProvideOnBoardingActivityPresenterFactory(Provider<IOnBoardingView> paramProvider, Provider<TrackingHelper> paramProvider1)
  {
    this.onBoardingViewProvider = paramProvider;
    this.trackingHelperProvider = paramProvider1;
  }
  
  public static OnBoardingActivityModule_ProvideOnBoardingActivityPresenterFactory create(Provider<IOnBoardingView> paramProvider, Provider<TrackingHelper> paramProvider1)
  {
    return new OnBoardingActivityModule_ProvideOnBoardingActivityPresenterFactory(paramProvider, paramProvider1);
  }
  
  public static OnBoardingPresenter provideInstance(Provider<IOnBoardingView> paramProvider, Provider<TrackingHelper> paramProvider1)
  {
    return proxyProvideOnBoardingActivityPresenter((IOnBoardingView)paramProvider.get(), (TrackingHelper)paramProvider1.get());
  }
  
  public static OnBoardingPresenter proxyProvideOnBoardingActivityPresenter(IOnBoardingView paramIOnBoardingView, TrackingHelper paramTrackingHelper)
  {
    return (OnBoardingPresenter)Preconditions.checkNotNull(OnBoardingActivityModule.provideOnBoardingActivityPresenter(paramIOnBoardingView, paramTrackingHelper), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final OnBoardingPresenter get()
  {
    return provideInstance(this.onBoardingViewProvider, this.trackingHelperProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/OnBoardingActivityModule_ProvideOnBoardingActivityPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */