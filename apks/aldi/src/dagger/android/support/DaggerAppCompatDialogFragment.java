package dagger.android.support;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatDialogFragment;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Inject;

public abstract class DaggerAppCompatDialogFragment
  extends AppCompatDialogFragment
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


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/support/DaggerAppCompatDialogFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */