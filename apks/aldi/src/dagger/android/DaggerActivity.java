package dagger.android;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import javax.inject.Inject;

public abstract class DaggerActivity
  extends Activity
  implements HasFragmentInjector
{
  @Inject
  DispatchingAndroidInjector<Fragment> fragmentInjector;
  
  public AndroidInjector<Fragment> fragmentInjector()
  {
    return this.fragmentInjector;
  }
  
  protected void onCreate(@Nullable Bundle paramBundle)
  {
    AndroidInjection.inject(this);
    super.onCreate(paramBundle);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/DaggerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */