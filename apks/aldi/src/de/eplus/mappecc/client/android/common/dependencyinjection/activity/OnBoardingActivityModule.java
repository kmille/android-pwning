package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.feature.onboarding.IOnBoardingView;
import de.eplus.mappecc.client.android.feature.onboarding.OnBoardingActivity;
import de.eplus.mappecc.client.android.feature.onboarding.OnBoardingPresenter;

@Module
public abstract class OnBoardingActivityModule
{
  @Provides
  static OnBoardingPresenter provideOnBoardingActivityPresenter(IOnBoardingView paramIOnBoardingView, TrackingHelper paramTrackingHelper)
  {
    return new OnBoardingPresenter(paramIOnBoardingView, paramTrackingHelper);
  }
  
  @Binds
  public abstract IOnBoardingView onBoardingView(OnBoardingActivity paramOnBoardingActivity);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/OnBoardingActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */