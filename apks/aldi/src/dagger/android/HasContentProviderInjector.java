package dagger.android;

import android.content.ContentProvider;

public abstract interface HasContentProviderInjector
{
  public abstract AndroidInjector<ContentProvider> contentProviderInjector();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/HasContentProviderInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */