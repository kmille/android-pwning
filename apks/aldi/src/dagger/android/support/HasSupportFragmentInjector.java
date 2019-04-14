package dagger.android.support;

import android.support.v4.app.Fragment;
import dagger.android.AndroidInjector;

public abstract interface HasSupportFragmentInjector
{
  public abstract AndroidInjector<Fragment> supportFragmentInjector();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/support/HasSupportFragmentInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */