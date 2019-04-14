package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.feature.help.term.ITermsView;
import de.eplus.mappecc.client.android.feature.help.term.TermsActivity;
import de.eplus.mappecc.client.android.feature.help.term.TermsPresenter;

@Module
public abstract class TermsActivityModule
{
  @Provides
  static TermsPresenter provideTermsPresenter(ITermsView paramITermsView, Localizer paramLocalizer, TrackingHelper paramTrackingHelper)
  {
    return new TermsPresenter(paramITermsView, paramLocalizer, paramTrackingHelper);
  }
  
  @Binds
  public abstract ITermsView view(TermsActivity paramTermsActivity);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/TermsActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */