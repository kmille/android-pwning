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
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.DirectDebitPaymentChoiceActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.PerActivity;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.DirectDebitPaymentChoiceConfirmFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.DirectDebitPaymentChoiceFragmentModule;
import de.eplus.mappecc.client.android.feature.directdebit.paymentchoice.DirectDebitPaymentChoiceActivity;

@Module(subcomponents={DirectDebitPaymentChoiceActivitySubcomponent.class})
public abstract class ActivityBindingModule_DirectDebitPaymentChoiceInjector
{
  @Binds
  @IntoMap
  @ActivityKey(DirectDebitPaymentChoiceActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(ActivityBindingModule_DirectDebitPaymentChoiceInjector.DirectDebitPaymentChoiceActivitySubcomponent.Builder paramBuilder);
  
  @Subcomponent(modules={DirectDebitPaymentChoiceActivityModule.class, DirectDebitPaymentChoiceFragmentModule.class, DirectDebitPaymentChoiceConfirmFragmentModule.class})
  @PerActivity
  public static abstract interface DirectDebitPaymentChoiceActivitySubcomponent
    extends AndroidInjector<DirectDebitPaymentChoiceActivity>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<DirectDebitPaymentChoiceActivity>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/ActivityBindingModule_DirectDebitPaymentChoiceInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */