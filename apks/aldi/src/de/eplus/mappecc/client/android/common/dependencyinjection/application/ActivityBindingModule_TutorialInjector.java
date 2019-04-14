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
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.OnBoardingActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.PerActivity;
import de.eplus.mappecc.client.android.feature.onboarding.OnBoardingActivity;

@Module(subcomponents={OnBoardingActivitySubcomponent.class})
public abstract class ActivityBindingModule_TutorialInjector
{
  @Binds
  @IntoMap
  @ActivityKey(OnBoardingActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(ActivityBindingModule_TutorialInjector.OnBoardingActivitySubcomponent.Builder paramBuilder);
  
  @Subcomponent(modules={OnBoardingActivityModule.class})
  @PerActivity
  public static abstract interface OnBoardingActivitySubcomponent
    extends AndroidInjector<OnBoardingActivity>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<OnBoardingActivity>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/ActivityBindingModule_TutorialInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */