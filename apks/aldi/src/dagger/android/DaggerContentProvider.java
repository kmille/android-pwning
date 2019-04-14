package dagger.android;

import android.content.ContentProvider;
import android.support.annotation.CallSuper;

public abstract class DaggerContentProvider
  extends ContentProvider
{
  @CallSuper
  public boolean onCreate()
  {
    AndroidInjection.inject(this);
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/DaggerContentProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */