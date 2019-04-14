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
import de.eplus.mappecc.client.android.feature.topup.overview.TopUpOverviewFragment;

@Module(subcomponents={TopUpOverviewFragmentSubcomponent.class})
public abstract class TopUpOverviewFragmentModule_TopUpOverviewFragmentInjector
{
  @Binds
  @IntoMap
  @FragmentKey(TopUpOverviewFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(TopUpOverviewFragmentModule_TopUpOverviewFragmentInjector.TopUpOverviewFragmentSubcomponent.Builder paramBuilder);
  
  @Subcomponent
  @PerFragment
  public static abstract interface TopUpOverviewFragmentSubcomponent
    extends AndroidInjector<TopUpOverviewFragment>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<TopUpOverviewFragment>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/TopUpOverviewFragmentModule_TopUpOverviewFragmentInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */