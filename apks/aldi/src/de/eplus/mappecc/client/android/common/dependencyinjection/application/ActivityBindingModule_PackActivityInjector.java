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
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.PackBookConfirmFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.PackBookFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.PackCancelConfirmFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.PackCancelFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.PackOverviewFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.VasInfoFragmentModule;
import de.eplus.mappecc.client.android.feature.pack.PackActivity;

@Module(subcomponents={PackActivitySubcomponent.class})
public abstract class ActivityBindingModule_PackActivityInjector
{
  @Binds
  @IntoMap
  @ActivityKey(PackActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(ActivityBindingModule_PackActivityInjector.PackActivitySubcomponent.Builder paramBuilder);
  
  @Subcomponent(modules={PackOverviewFragmentModule.class, PackBookFragmentModule.class, PackBookConfirmFragmentModule.class, PackCancelFragmentModule.class, PackCancelConfirmFragmentModule.class, VasInfoFragmentModule.class})
  @PerActivity
  public static abstract interface PackActivitySubcomponent
    extends AndroidInjector<PackActivity>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<PackActivity>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/ActivityBindingModule_PackActivityInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */