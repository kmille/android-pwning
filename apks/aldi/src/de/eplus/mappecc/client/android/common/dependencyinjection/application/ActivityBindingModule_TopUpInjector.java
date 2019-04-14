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
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.TopUpActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.TopUpBankModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.TopUpChoiceFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.TopUpOverviewFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.TopUpVoucherFragmentModule;
import de.eplus.mappecc.client.android.feature.topup.TopUpActivity;

@Module(subcomponents={TopUpActivitySubcomponent.class})
public abstract class ActivityBindingModule_TopUpInjector
{
  @Binds
  @IntoMap
  @ActivityKey(TopUpActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(ActivityBindingModule_TopUpInjector.TopUpActivitySubcomponent.Builder paramBuilder);
  
  @Subcomponent(modules={TopUpActivityModule.class, TopUpBankModule.class, TopUpVoucherFragmentModule.class, TopUpChoiceFragmentModule.class, TopUpOverviewFragmentModule.class})
  @PerActivity
  public static abstract interface TopUpActivitySubcomponent
    extends AndroidInjector<TopUpActivity>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<TopUpActivity>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/ActivityBindingModule_TopUpInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */