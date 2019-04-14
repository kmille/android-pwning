package dagger.android;

import android.app.Fragment;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class DaggerDialogFragment_MembersInjector
  implements MembersInjector<DaggerDialogFragment>
{
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;
  
  public DaggerDialogFragment_MembersInjector(Provider<DispatchingAndroidInjector<Fragment>> paramProvider)
  {
    this.childFragmentInjectorProvider = paramProvider;
  }
  
  public static MembersInjector<DaggerDialogFragment> create(Provider<DispatchingAndroidInjector<Fragment>> paramProvider)
  {
    return new DaggerDialogFragment_MembersInjector(paramProvider);
  }
  
  public static void injectChildFragmentInjector(DaggerDialogFragment paramDaggerDialogFragment, DispatchingAndroidInjector<Fragment> paramDispatchingAndroidInjector)
  {
    paramDaggerDialogFragment.childFragmentInjector = paramDispatchingAndroidInjector;
  }
  
  public final void injectMembers(DaggerDialogFragment paramDaggerDialogFragment)
  {
    injectChildFragmentInjector(paramDaggerDialogFragment, (DispatchingAndroidInjector)this.childFragmentInjectorProvider.get());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/DaggerDialogFragment_MembersInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */