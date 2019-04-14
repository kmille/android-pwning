package dagger.android.support;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasFragmentInjector;
import javax.inject.Inject;

public abstract class DaggerAppCompatActivity
  extends AppCompatActivity
  implements HasFragmentInjector, HasSupportFragmentInjector
{
  @Inject
  DispatchingAndroidInjector<android.app.Fragment> frameworkFragmentInjector;
  @Inject
  DispatchingAndroidInjector<android.support.v4.app.Fragment> supportFragmentInjector;
  
  public AndroidInjector<android.app.Fragment> fragmentInjector()
  {
    return this.frameworkFragmentInjector;
  }
  
  public void onCreate(@Nullable Bundle paramBundle)
  {
    AndroidInjection.inject(this);
    super.onCreate(paramBundle);
  }
  
  public AndroidInjector<android.support.v4.app.Fragment> supportFragmentInjector()
  {
    return this.supportFragmentInjector;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/support/DaggerAppCompatActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */