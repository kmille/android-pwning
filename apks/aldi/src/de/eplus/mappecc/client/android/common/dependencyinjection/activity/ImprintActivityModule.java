package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.feature.help.imprint.IImprintView;
import de.eplus.mappecc.client.android.feature.help.imprint.ImprintActivity;
import de.eplus.mappecc.client.android.feature.help.imprint.ImprintActivityPresenter;

@Module
public abstract class ImprintActivityModule
{
  @Provides
  static ImprintActivityPresenter provideImprintActivityPresenter(IImprintView paramIImprintView, Localizer paramLocalizer)
  {
    return new ImprintActivityPresenter(paramIImprintView, paramLocalizer);
  }
  
  @Binds
  public abstract IImprintView imprintView(ImprintActivity paramImprintActivity);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/ImprintActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */