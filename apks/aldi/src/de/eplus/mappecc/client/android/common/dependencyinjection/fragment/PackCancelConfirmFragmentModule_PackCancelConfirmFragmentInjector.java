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
import de.eplus.mappecc.client.android.feature.pack.cancelconfirm.PackCancelConfirmFragment;

@Module(subcomponents={PackCancelConfirmFragmentSubcomponent.class})
public abstract class PackCancelConfirmFragmentModule_PackCancelConfirmFragmentInjector
{
  @Binds
  @IntoMap
  @FragmentKey(PackCancelConfirmFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(PackCancelConfirmFragmentModule_PackCancelConfirmFragmentInjector.PackCancelConfirmFragmentSubcomponent.Builder paramBuilder);
  
  @Subcomponent
  @PerFragment
  public static abstract interface PackCancelConfirmFragmentSubcomponent
    extends AndroidInjector<PackCancelConfirmFragment>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<PackCancelConfirmFragment>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/PackCancelConfirmFragmentModule_PackCancelConfirmFragmentInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */