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
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.ChangeAddressActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.PerActivity;
import de.eplus.mappecc.client.android.feature.customer.ChangeAddressActivity;

@Module(subcomponents={ChangeAddressActivitySubcomponent.class})
public abstract class ActivityBindingModule_ChangeAddressInjector
{
  @Binds
  @IntoMap
  @ActivityKey(ChangeAddressActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(ActivityBindingModule_ChangeAddressInjector.ChangeAddressActivitySubcomponent.Builder paramBuilder);
  
  @Subcomponent(modules={ChangeAddressActivityModule.class})
  @PerActivity
  public static abstract interface ChangeAddressActivitySubcomponent
    extends AndroidInjector<ChangeAddressActivity>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<ChangeAddressActivity>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/ActivityBindingModule_ChangeAddressInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */