package dagger.android;

import android.app.Fragment;
import android.content.Context;
import javax.inject.Inject;

@Deprecated
public abstract class DaggerFragment
  extends Fragment
  implements HasFragmentInjector
{
  @Inject
  DispatchingAndroidInjector<Fragment> childFragmentInjector;
  
  public AndroidInjector<Fragment> fragmentInjector()
  {
    return this.childFragmentInjector;
  }
  
  public void onAttach(Context paramContext)
  {
    AndroidInjection.inject(this);
    super.onAttach(paramContext);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/DaggerFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */