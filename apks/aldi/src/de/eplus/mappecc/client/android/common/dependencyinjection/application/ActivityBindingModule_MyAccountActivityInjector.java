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
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.MyAccountActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.PerActivity;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.ConsumeFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.ConsumeOverviewFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.MyAccountFragmentModule;
import de.eplus.mappecc.client.android.feature.customer.history.MyAccountActivity;

@Module(subcomponents={MyAccountActivitySubcomponent.class})
public abstract class ActivityBindingModule_MyAccountActivityInjector
{
  @Binds
  @IntoMap
  @ActivityKey(MyAccountActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(ActivityBindingModule_MyAccountActivityInjector.MyAccountActivitySubcomponent.Builder paramBuilder);
  
  @Subcomponent(modules={MyAccountActivityModule.class, MyAccountFragmentModule.class, ConsumeFragmentModule.class, ConsumeOverviewFragmentModule.class})
  @PerActivity
  public static abstract interface MyAccountActivitySubcomponent
    extends AndroidInjector<MyAccountActivity>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<MyAccountActivity>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/ActivityBindingModule_MyAccountActivityInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */