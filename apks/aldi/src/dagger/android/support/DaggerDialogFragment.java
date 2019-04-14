package dagger.android.support;

import android.content.Context;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Inject;

public abstract class DaggerDialogFragment
  extends DialogFragment
  implements HasSupportFragmentInjector
{
  @Inject
  DispatchingAndroidInjector<Fragment> childFragmentInjector;
  
  public void onAttach(Context paramContext)
  {
    AndroidSupportInjection.inject(this);
    super.onAttach(paramContext);
  }
  
  public AndroidInjector<Fragment> supportFragmentInjector()
  {
    return this.childFragmentInjector;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/support/DaggerDialogFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */