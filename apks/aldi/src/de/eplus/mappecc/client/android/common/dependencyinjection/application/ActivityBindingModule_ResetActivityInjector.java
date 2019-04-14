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
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.ResetActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.ResetFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.ResetPasswordFragmentModule;
import de.eplus.mappecc.client.android.feature.resetpassword.ResetActivity;

@Module(subcomponents={ResetActivitySubcomponent.class})
public abstract class ActivityBindingModule_ResetActivityInjector
{
  @Binds
  @IntoMap
  @ActivityKey(ResetActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(ActivityBindingModule_ResetActivityInjector.ResetActivitySubcomponent.Builder paramBuilder);
  
  @Subcomponent(modules={ResetActivityModule.class, ResetFragmentModule.class, ResetPasswordFragmentModule.class})
  @PerActivity
  public static abstract interface ResetActivitySubcomponent
    extends AndroidInjector<ResetActivity>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<ResetActivity>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/ActivityBindingModule_ResetActivityInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */