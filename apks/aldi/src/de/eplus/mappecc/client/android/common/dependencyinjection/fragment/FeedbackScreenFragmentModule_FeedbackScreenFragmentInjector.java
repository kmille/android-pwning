package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.Subcomponent.Builder;
import dagger.android.AndroidInjector;
import dagger.android.AndroidInjector.Builder;
import dagger.android.AndroidInjector.Factory;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import de.eplus.mappecc.client.android.feature.rating.feedback.FeedbackScreenFragment;

@Module(subcomponents={FeedbackScreenFragmentSubcomponent.class})
public abstract class FeedbackScreenFragmentModule_FeedbackScreenFragmentInjector
{
  @Binds
  @IntoMap
  @FragmentKey(FeedbackScreenFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(FeedbackScreenFragmentModule_FeedbackScreenFragmentInjector.FeedbackScreenFragmentSubcomponent.Builder paramBuilder);
  
  @Subcomponent
  @PerFragment
  public static abstract interface FeedbackScreenFragmentSubcomponent
    extends AndroidInjector<FeedbackScreenFragment>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<FeedbackScreenFragment>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/FeedbackScreenFragmentModule_FeedbackScreenFragmentInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */