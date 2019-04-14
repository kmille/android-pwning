package dagger.android;

import android.app.Fragment;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class DaggerFragment_MembersInjector
  implements MembersInjector<DaggerFragment>
{
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;
  
  public DaggerFragment_MembersInjector(Provider<DispatchingAndroidInjector<Fragment>> paramProvider)
  {
    this.childFragmentInjectorProvider = paramProvider;
  }
  
  public static MembersInjector<DaggerFragment> create(Provider<DispatchingAndroidInjector<Fragment>> paramProvider)
  {
    return new DaggerFragment_MembersInjector(paramProvider);
  }
  
  public static void injectChildFragmentInjector(DaggerFragment paramDaggerFragment, DispatchingAndroidInjector<Fragment> paramDispatchingAndroidInjector)
  {
    paramDaggerFragment.childFragmentInjector = paramDispatchingAndroidInjector;
  }
  
  public final void injectMembers(DaggerFragment paramDaggerFragment)
  {
    injectChildFragmentInjector(paramDaggerFragment, (DispatchingAndroidInjector)this.childFragmentInjectorProvider.get());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/DaggerFragment_MembersInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */