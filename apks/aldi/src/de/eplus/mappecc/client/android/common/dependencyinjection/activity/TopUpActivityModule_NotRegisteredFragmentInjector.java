package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

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
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.PerFragment;
import de.eplus.mappecc.client.android.feature.customer.NotRegisteredFragment;

@Module(subcomponents={NotRegisteredFragmentSubcomponent.class})
public abstract class TopUpActivityModule_NotRegisteredFragmentInjector
{
  @Binds
  @IntoMap
  @FragmentKey(NotRegisteredFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(TopUpActivityModule_NotRegisteredFragmentInjector.NotRegisteredFragmentSubcomponent.Builder paramBuilder);
  
  @Subcomponent
  @PerFragment
  public static abstract interface NotRegisteredFragmentSubcomponent
    extends AndroidInjector<NotRegisteredFragment>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<NotRegisteredFragment>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/TopUpActivityModule_NotRegisteredFragmentInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */