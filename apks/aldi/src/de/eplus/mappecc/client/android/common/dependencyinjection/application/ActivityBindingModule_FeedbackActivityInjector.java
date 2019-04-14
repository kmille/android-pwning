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
import de.eplus.mappecc.client.android.common.dependencyinjection.activity.RatingActivityModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.FeedbackScreenFragmentModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.StarRatingModule;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.ThankYouModule;
import de.eplus.mappecc.client.android.feature.rating.RatingActivity;

@Module(subcomponents={RatingActivitySubcomponent.class})
public abstract class ActivityBindingModule_FeedbackActivityInjector
{
  @Binds
  @IntoMap
  @ActivityKey(RatingActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(ActivityBindingModule_FeedbackActivityInjector.RatingActivitySubcomponent.Builder paramBuilder);
  
  @Subcomponent(modules={RatingActivityModule.class, StarRatingModule.class, ThankYouModule.class, FeedbackScreenFragmentModule.class})
  @PerActivity
  public static abstract interface RatingActivitySubcomponent
    extends AndroidInjector<RatingActivity>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<RatingActivity>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/ActivityBindingModule_FeedbackActivityInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */