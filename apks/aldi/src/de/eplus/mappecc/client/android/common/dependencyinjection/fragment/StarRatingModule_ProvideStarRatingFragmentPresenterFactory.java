package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.feature.rating.starpage.StarRatingPresenter;
import javax.inject.Provider;

public final class StarRatingModule_ProvideStarRatingFragmentPresenterFactory
  implements Factory<StarRatingPresenter>
{
  private final Provider<Localizer> localizerProvider;
  
  public StarRatingModule_ProvideStarRatingFragmentPresenterFactory(Provider<Localizer> paramProvider)
  {
    this.localizerProvider = paramProvider;
  }
  
  public static StarRatingModule_ProvideStarRatingFragmentPresenterFactory create(Provider<Localizer> paramProvider)
  {
    return new StarRatingModule_ProvideStarRatingFragmentPresenterFactory(paramProvider);
  }
  
  public static StarRatingPresenter provideInstance(Provider<Localizer> paramProvider)
  {
    return proxyProvideStarRatingFragmentPresenter((Localizer)paramProvider.get());
  }
  
  public static StarRatingPresenter proxyProvideStarRatingFragmentPresenter(Localizer paramLocalizer)
  {
    return (StarRatingPresenter)Preconditions.checkNotNull(StarRatingModule.provideStarRatingFragmentPresenter(paramLocalizer), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final StarRatingPresenter get()
  {
    return provideInstance(this.localizerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/StarRatingModule_ProvideStarRatingFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */