package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.feature.rating.feedback.FeedbackScreenFragmentPresenter;
import javax.inject.Provider;

public final class FeedbackScreenFragmentModule_ProvideFeedbackScreenFragmentPresenterFactory
  implements Factory<FeedbackScreenFragmentPresenter>
{
  private final Provider<Localizer> localizerProvider;
  
  public FeedbackScreenFragmentModule_ProvideFeedbackScreenFragmentPresenterFactory(Provider<Localizer> paramProvider)
  {
    this.localizerProvider = paramProvider;
  }
  
  public static FeedbackScreenFragmentModule_ProvideFeedbackScreenFragmentPresenterFactory create(Provider<Localizer> paramProvider)
  {
    return new FeedbackScreenFragmentModule_ProvideFeedbackScreenFragmentPresenterFactory(paramProvider);
  }
  
  public static FeedbackScreenFragmentPresenter provideInstance(Provider<Localizer> paramProvider)
  {
    return proxyProvideFeedbackScreenFragmentPresenter((Localizer)paramProvider.get());
  }
  
  public static FeedbackScreenFragmentPresenter proxyProvideFeedbackScreenFragmentPresenter(Localizer paramLocalizer)
  {
    return (FeedbackScreenFragmentPresenter)Preconditions.checkNotNull(FeedbackScreenFragmentModule.provideFeedbackScreenFragmentPresenter(paramLocalizer), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final FeedbackScreenFragmentPresenter get()
  {
    return provideInstance(this.localizerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/FeedbackScreenFragmentModule_ProvideFeedbackScreenFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */