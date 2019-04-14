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
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.TermsActivityModule;
import de.eplus.mappecc.client.android.feature.help.term.TermsActivity;

@Module(subcomponents={TermsActivitySubcomponent.class})
public abstract class ActivityBindingModule_TermsInjector
{
  @Binds
  @IntoMap
  @ActivityKey(TermsActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(ActivityBindingModule_TermsInjector.TermsActivitySubcomponent.Builder paramBuilder);
  
  @Subcomponent(modules={TermsActivityModule.class})
  @PerActivity
  public static abstract interface TermsActivitySubcomponent
    extends AndroidInjector<TermsActivity>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<TermsActivity>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/ActivityBindingModule_TermsInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */