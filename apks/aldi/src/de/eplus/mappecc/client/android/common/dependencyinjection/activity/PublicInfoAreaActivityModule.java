package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.feature.trash.IPublicInfoAreaView;
import de.eplus.mappecc.client.android.feature.trash.PublicInfoAreaActivity;
import de.eplus.mappecc.client.android.feature.trash.PublicInfoAreaPresenter;

@Module
public abstract class PublicInfoAreaActivityModule
{
  @Provides
  static PublicInfoAreaPresenter providePublicInfoAreaPresenter(IPublicInfoAreaView paramIPublicInfoAreaView, Localizer paramLocalizer, TrackingHelper paramTrackingHelper)
  {
    return new PublicInfoAreaPresenter(paramIPublicInfoAreaView, paramLocalizer, paramTrackingHelper);
  }
  
  @Binds
  public abstract IPublicInfoAreaView view(PublicInfoAreaActivity paramPublicInfoAreaActivity);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/PublicInfoAreaActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */