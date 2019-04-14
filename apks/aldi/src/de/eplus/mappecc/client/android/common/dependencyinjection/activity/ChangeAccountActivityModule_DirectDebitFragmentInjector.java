package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

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
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.PerFragment;
import de.eplus.mappecc.client.android.feature.customer.ChangeAccountActivity;

@Module(subcomponents={ChangeAccountActivitySubcomponent.class})
public abstract class ChangeAccountActivityModule_DirectDebitFragmentInjector
{
  @Binds
  @IntoMap
  @ActivityKey(ChangeAccountActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(ChangeAccountActivityModule_DirectDebitFragmentInjector.ChangeAccountActivitySubcomponent.Builder paramBuilder);
  
  @Subcomponent
  @PerFragment
  public static abstract interface ChangeAccountActivitySubcomponent
    extends AndroidInjector<ChangeAccountActivity>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<ChangeAccountActivity>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/ChangeAccountActivityModule_DirectDebitFragmentInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */