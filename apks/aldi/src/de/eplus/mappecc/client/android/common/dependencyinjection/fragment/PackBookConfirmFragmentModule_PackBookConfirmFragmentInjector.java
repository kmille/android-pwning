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
import de.eplus.mappecc.client.android.feature.pack.bookconfirm.PackBookConfirmFragment;

@Module(subcomponents={PackBookConfirmFragmentSubcomponent.class})
public abstract class PackBookConfirmFragmentModule_PackBookConfirmFragmentInjector
{
  @Binds
  @IntoMap
  @FragmentKey(PackBookConfirmFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(PackBookConfirmFragmentModule_PackBookConfirmFragmentInjector.PackBookConfirmFragmentSubcomponent.Builder paramBuilder);
  
  @Subcomponent
  @PerFragment
  public static abstract interface PackBookConfirmFragmentSubcomponent
    extends AndroidInjector<PackBookConfirmFragment>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<PackBookConfirmFragment>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/PackBookConfirmFragmentModule_PackBookConfirmFragmentInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */