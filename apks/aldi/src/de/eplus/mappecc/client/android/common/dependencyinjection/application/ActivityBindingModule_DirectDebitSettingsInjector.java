package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.Subcomponent.Builder;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.AndroidInjector.Builder;
import dagger.android.AndroidInjector.Factory;
import dagger.multibindings.IntoMap;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.DirectDebitSettingsActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.PerActivity;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.DirectDebitSettingsFragmentModule;
import de.eplus.mappecc.client.android.feature.directdebit.setting.DirectDebitSettingsActivity;

@Module(subcomponents={DirectDebitSettingsActivitySubcomponent.class})
public abstract class ActivityBindingModule_DirectDebitSettingsInjector
{
  @Binds
  @IntoMap
  @ActivityKey(DirectDebitSettingsActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(ActivityBindingModule_DirectDebitSettingsInjector.DirectDebitSettingsActivitySubcomponent.Builder paramBuilder);
  
  @Subcomponent(modules={DirectDebitSettingsActivityModule.class, DirectDebitSettingsFragmentModule.class})
  @PerActivity
  public static abstract interface DirectDebitSettingsActivitySubcomponent
    extends AndroidInjector<DirectDebitSettingsActivity>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<DirectDebitSettingsActivity>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/ActivityBindingModule_DirectDebitSettingsInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */