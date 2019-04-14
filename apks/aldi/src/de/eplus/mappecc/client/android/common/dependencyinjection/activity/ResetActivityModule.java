package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.feature.resetpassword.IResetActivityView;
import de.eplus.mappecc.client.android.feature.resetpassword.ResetActivity;
import de.eplus.mappecc.client.android.feature.resetpassword.ResetPresenter;

@Module
public abstract class ResetActivityModule
{
  @Provides
  static ResetPresenter provideResetPresenter(IResetActivityView paramIResetActivityView)
  {
    return new ResetPresenter(paramIResetActivityView);
  }
  
  @Binds
  public abstract IB2pView b2pView(ResetActivity paramResetActivity);
  
  @Binds
  public abstract IResetActivityView view(ResetActivity paramResetActivity);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/ResetActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */