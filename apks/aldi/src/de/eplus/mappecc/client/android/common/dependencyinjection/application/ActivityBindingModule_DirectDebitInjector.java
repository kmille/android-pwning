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
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.DirectDebitActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.PerActivity;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.DirectDebitConfirmationFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.DirectDebitFragmentModule;
import de.eplus.mappecc.client.android.feature.directdebit.bankaccountchange.DirectDebitActivity;

@Module(subcomponents={DirectDebitActivitySubcomponent.class})
public abstract class ActivityBindingModule_DirectDebitInjector
{
  @Binds
  @IntoMap
  @ActivityKey(DirectDebitActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(ActivityBindingModule_DirectDebitInjector.DirectDebitActivitySubcomponent.Builder paramBuilder);
  
  @Subcomponent(modules={DirectDebitActivityModule.class, DirectDebitFragmentModule.class, DirectDebitConfirmationFragmentModule.class})
  @PerActivity
  public static abstract interface DirectDebitActivitySubcomponent
    extends AndroidInjector<DirectDebitActivity>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<DirectDebitActivity>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/ActivityBindingModule_DirectDebitInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */