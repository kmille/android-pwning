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
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.PerActivity;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.SplashActivityModule;
import de.eplus.mappecc.client.android.feature.splashscreen.SplashActivity;

@Module(subcomponents={SplashActivitySubcomponent.class})
public abstract class ActivityBindingModule_SplashInjector
{
  @Binds
  @IntoMap
  @ActivityKey(SplashActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(ActivityBindingModule_SplashInjector.SplashActivitySubcomponent.Builder paramBuilder);
  
  @Subcomponent(modules={SplashActivityModule.class})
  @PerActivity
  public static abstract interface SplashActivitySubcomponent
    extends AndroidInjector<SplashActivity>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<SplashActivity>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/ActivityBindingModule_SplashInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */