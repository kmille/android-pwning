package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.feature.directdebit.setting.DirectDebitSettingsActivity;
import de.eplus.mappecc.client.android.feature.directdebit.setting.DirectDebitSettingsPresenter;
import de.eplus.mappecc.client.android.feature.directdebit.setting.IDirectDebitSettingsActivityView;

@Module
public abstract class DirectDebitSettingsActivityModule
{
  @Provides
  static DirectDebitSettingsPresenter provideDirectDebitSettingsPresenter()
  {
    return new DirectDebitSettingsPresenter();
  }
  
  @Binds
  public abstract IDirectDebitSettingsActivityView view(DirectDebitSettingsActivity paramDirectDebitSettingsActivity);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/DirectDebitSettingsActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */