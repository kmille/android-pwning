package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import android.support.annotation.NonNull;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.feature.rating.starpage.StarRatingFragment;
import de.eplus.mappecc.client.android.feature.rating.starpage.StarRatingPresenter;
import de.eplus.mappecc.client.android.feature.rating.starpage.StarRatingView;

@Module
public abstract class StarRatingModule
{
  @Provides
  static StarRatingPresenter provideStarRatingFragmentPresenter(@NonNull Localizer paramLocalizer)
  {
    return new StarRatingPresenter(paramLocalizer);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract StarRatingFragment starRatingFragmentInjector();
  
  @Binds
  public abstract StarRatingView view(StarRatingFragment paramStarRatingFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/StarRatingModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */