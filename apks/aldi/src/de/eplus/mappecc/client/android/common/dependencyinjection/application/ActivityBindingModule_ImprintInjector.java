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
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.ImprintActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.PerActivity;
import de.eplus.mappecc.client.android.feature.help.imprint.ImprintActivity;

@Module(subcomponents={ImprintActivitySubcomponent.class})
public abstract class ActivityBindingModule_ImprintInjector
{
  @Binds
  @IntoMap
  @ActivityKey(ImprintActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(ActivityBindingModule_ImprintInjector.ImprintActivitySubcomponent.Builder paramBuilder);
  
  @Subcomponent(modules={ImprintActivityModule.class})
  @PerActivity
  public static abstract interface ImprintActivitySubcomponent
    extends AndroidInjector<ImprintActivity>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<ImprintActivity>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/ActivityBindingModule_ImprintInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */