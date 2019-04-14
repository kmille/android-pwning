package dagger.android;

import android.app.IntentService;

public abstract class DaggerIntentService
  extends IntentService
{
  public DaggerIntentService(String paramString)
  {
    super(paramString);
  }
  
  public void onCreate()
  {
    AndroidInjection.inject(this);
    super.onCreate();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/DaggerIntentService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */