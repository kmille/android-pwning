package dagger.android.support;

import android.support.v4.app.Fragment;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Inject;

public abstract class DaggerApplication
  extends dagger.android.DaggerApplication
  implements HasSupportFragmentInjector
{
  @Inject
  DispatchingAndroidInjector<Fragment> supportFragmentInjector;
  
  public abstract AndroidInjector<? extends DaggerApplication> applicationInjector();
  
  public DispatchingAndroidInjector<Fragment> supportFragmentInjector()
  {
    return this.supportFragmentInjector;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/support/DaggerApplication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */