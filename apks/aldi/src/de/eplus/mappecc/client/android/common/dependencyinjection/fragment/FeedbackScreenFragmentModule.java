package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.feature.rating.feedback.FeedbackScreenFragment;
import de.eplus.mappecc.client.android.feature.rating.feedback.FeedbackScreenFragmentPresenter;
import de.eplus.mappecc.client.android.feature.rating.feedback.FeedbackScreenView;

@Module
public abstract class FeedbackScreenFragmentModule
{
  @Provides
  static FeedbackScreenFragmentPresenter provideFeedbackScreenFragmentPresenter(Localizer paramLocalizer)
  {
    return new FeedbackScreenFragmentPresenter(paramLocalizer);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract FeedbackScreenFragment feedbackScreenFragmentInjector();
  
  @Binds
  public abstract FeedbackScreenView view(FeedbackScreenFragment paramFeedbackScreenFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/FeedbackScreenFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */