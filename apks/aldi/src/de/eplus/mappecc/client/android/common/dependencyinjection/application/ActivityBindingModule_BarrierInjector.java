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
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.BarrierActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.PerActivity;
import de.eplus.mappecc.client.android.feature.customer.thirdparty.BarrierActivity;

@Module(subcomponents={BarrierActivitySubcomponent.class})
public abstract class ActivityBindingModule_BarrierInjector
{
  @Binds
  @IntoMap
  @ActivityKey(BarrierActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(ActivityBindingModule_BarrierInjector.BarrierActivitySubcomponent.Builder paramBuilder);
  
  @Subcomponent(modules={BarrierActivityModule.class})
  @PerActivity
  public static abstract interface BarrierActivitySubcomponent
    extends AndroidInjector<BarrierActivity>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<BarrierActivity>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/ActivityBindingModule_BarrierInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */