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
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.AnalyticsActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.PerActivity;
import de.eplus.mappecc.client.android.feature.help.analytics.activity.AnalyticsActivity;

@Module(subcomponents={AnalyticsActivitySubcomponent.class})
public abstract class ActivityBindingModule_AnalyticsInjector
{
  @Binds
  @IntoMap
  @ActivityKey(AnalyticsActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(ActivityBindingModule_AnalyticsInjector.AnalyticsActivitySubcomponent.Builder paramBuilder);
  
  @Subcomponent(modules={AnalyticsActivityModule.class})
  @PerActivity
  public static abstract interface AnalyticsActivitySubcomponent
    extends AndroidInjector<AnalyticsActivity>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<AnalyticsActivity>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/ActivityBindingModule_AnalyticsInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */