package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.feature.help.HelpActivity;
import de.eplus.mappecc.client.android.feature.help.HelpActivityPresenter;
import de.eplus.mappecc.client.android.feature.help.IHelpView;

@Module
public abstract class HelpActivityModule
{
  @Provides
  static HelpActivityPresenter provideHelpActivityPresenter(IHelpView paramIHelpView, Localizer paramLocalizer)
  {
    return new HelpActivityPresenter(paramIHelpView, paramLocalizer);
  }
  
  @Binds
  public abstract IHelpView helpView(HelpActivity paramHelpActivity);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/HelpActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */