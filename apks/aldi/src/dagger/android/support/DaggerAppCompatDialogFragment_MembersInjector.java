package dagger.android.support;

import android.support.v4.app.Fragment;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

public final class DaggerAppCompatDialogFragment_MembersInjector
  implements MembersInjector<DaggerAppCompatDialogFragment>
{
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;
  
  public DaggerAppCompatDialogFragment_MembersInjector(Provider<DispatchingAndroidInjector<Fragment>> paramProvider)
  {
    this.childFragmentInjectorProvider = paramProvider;
  }
  
  public static MembersInjector<DaggerAppCompatDialogFragment> create(Provider<DispatchingAndroidInjector<Fragment>> paramProvider)
  {
    return new DaggerAppCompatDialogFragment_MembersInjector(paramProvider);
  }
  
  public static void injectChildFragmentInjector(DaggerAppCompatDialogFragment paramDaggerAppCompatDialogFragment, DispatchingAndroidInjector<Fragment> paramDispatchingAndroidInjector)
  {
    paramDaggerAppCompatDialogFragment.childFragmentInjector = paramDispatchingAndroidInjector;
  }
  
  public final void injectMembers(DaggerAppCompatDialogFragment paramDaggerAppCompatDialogFragment)
  {
    injectChildFragmentInjector(paramDaggerAppCompatDialogFragment, (DispatchingAndroidInjector)this.childFragmentInjectorProvider.get());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/support/DaggerAppCompatDialogFragment_MembersInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */