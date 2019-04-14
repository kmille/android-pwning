package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import android.support.annotation.NonNull;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.feature.help.analytics.AnalyticsPresenter;
import de.eplus.mappecc.client.android.feature.help.analytics.IAnalyticsView;
import de.eplus.mappecc.client.android.feature.help.analytics.activity.AnalyticsActivity;

@Module
public abstract class AnalyticsActivityModule
{
  @Provides
  static AnalyticsPresenter provideAnalyticsPresenter(@NonNull IAnalyticsView paramIAnalyticsView, @NonNull TrackingHelper paramTrackingHelper, @NonNull IB2pView paramIB2pView, @NonNull Localizer paramLocalizer)
  {
    return new AnalyticsPresenter(paramIAnalyticsView, paramTrackingHelper, paramIB2pView, paramLocalizer);
  }
  
  @Binds
  public abstract IAnalyticsView view(AnalyticsActivity paramAnalyticsActivity);
  
  @Binds
  public abstract IB2pView viewDialog(AnalyticsActivity paramAnalyticsActivity);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/AnalyticsActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */