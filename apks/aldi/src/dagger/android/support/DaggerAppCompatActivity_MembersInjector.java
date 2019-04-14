package dagger.android.support;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

public final class DaggerAppCompatActivity_MembersInjector
  implements MembersInjector<DaggerAppCompatActivity>
{
  private final Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider;
  private final Provider<DispatchingAndroidInjector<android.support.v4.app.Fragment>> supportFragmentInjectorProvider;
  
  public DaggerAppCompatActivity_MembersInjector(Provider<DispatchingAndroidInjector<android.support.v4.app.Fragment>> paramProvider, Provider<DispatchingAndroidInjector<android.app.Fragment>> paramProvider1)
  {
    this.supportFragmentInjectorProvider = paramProvider;
    this.frameworkFragmentInjectorProvider = paramProvider1;
  }
  
  public static MembersInjector<DaggerAppCompatActivity> create(Provider<DispatchingAndroidInjector<android.support.v4.app.Fragment>> paramProvider, Provider<DispatchingAndroidInjector<android.app.Fragment>> paramProvider1)
  {
    return new DaggerAppCompatActivity_MembersInjector(paramProvider, paramProvider1);
  }
  
  public static void injectFrameworkFragmentInjector(DaggerAppCompatActivity paramDaggerAppCompatActivity, DispatchingAndroidInjector<android.app.Fragment> paramDispatchingAndroidInjector)
  {
    paramDaggerAppCompatActivity.frameworkFragmentInjector = paramDispatchingAndroidInjector;
  }
  
  public static void injectSupportFragmentInjector(DaggerAppCompatActivity paramDaggerAppCompatActivity, DispatchingAndroidInjector<android.support.v4.app.Fragment> paramDispatchingAndroidInjector)
  {
    paramDaggerAppCompatActivity.supportFragmentInjector = paramDispatchingAndroidInjector;
  }
  
  public final void injectMembers(DaggerAppCompatActivity paramDaggerAppCompatActivity)
  {
    injectSupportFragmentInjector(paramDaggerAppCompatActivity, (DispatchingAndroidInjector)this.supportFragmentInjectorProvider.get());
    injectFrameworkFragmentInjector(paramDaggerAppCompatActivity, (DispatchingAndroidInjector)this.frameworkFragmentInjectorProvider.get());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/support/DaggerAppCompatActivity_MembersInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */