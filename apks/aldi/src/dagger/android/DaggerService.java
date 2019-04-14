package dagger.android;

import android.app.Service;

public abstract class DaggerService
  extends Service
{
  public void onCreate()
  {
    AndroidInjection.inject(this);
    super.onCreate();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/DaggerService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */