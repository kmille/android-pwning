package dagger.android;

import android.app.Service;

public abstract interface HasServiceInjector
{
  public abstract AndroidInjector<Service> serviceInjector();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/HasServiceInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */