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
import de.eplus.mappecc.client.android.feature.topup.voucher.TopUpVoucherFragment;

@Module(subcomponents={TopUpVoucherFragmentSubcomponent.class})
public abstract class TopUpVoucherFragmentModule_TopUpVoucherFragmentInjector
{
  @Binds
  @IntoMap
  @FragmentKey(TopUpVoucherFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(TopUpVoucherFragmentModule_TopUpVoucherFragmentInjector.TopUpVoucherFragmentSubcomponent.Builder paramBuilder);
  
  @Subcomponent
  @PerFragment
  public static abstract interface TopUpVoucherFragmentSubcomponent
    extends AndroidInjector<TopUpVoucherFragment>
  {
    @Subcomponent.Builder
    public static abstract class Builder
      extends AndroidInjector.Builder<TopUpVoucherFragment>
    {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/TopUpVoucherFragmentModule_TopUpVoucherFragmentInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */