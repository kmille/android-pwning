package dagger.android.support;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

public final class DaggerApplication_MembersInjector
  implements MembersInjector<DaggerApplication>
{
  private final Provider<DispatchingAndroidInjector<Activity>> activityInjectorProvider;
  private final Provider<DispatchingAndroidInjector<BroadcastReceiver>> broadcastReceiverInjectorProvider;
  private final Provider<DispatchingAndroidInjector<ContentProvider>> contentProviderInjectorProvider;
  private final Provider<DispatchingAndroidInjector<android.app.Fragment>> fragmentInjectorProvider;
  private final Provider<DispatchingAndroidInjector<Service>> serviceInjectorProvider;
  private final Provider<DispatchingAndroidInjector<android.support.v4.app.Fragment>> supportFragmentInjectorProvider;
  
  public DaggerApplication_MembersInjector(Provider<DispatchingAndroidInjector<Activity>> paramProvider, Provider<DispatchingAndroidInjector<BroadcastReceiver>> paramProvider1, Provider<DispatchingAndroidInjector<android.app.Fragment>> paramProvider2, Provider<DispatchingAndroidInjector<Service>> paramProvider3, Provider<DispatchingAndroidInjector<ContentProvider>> paramProvider4, Provider<DispatchingAndroidInjector<android.support.v4.app.Fragment>> paramProvider5)
  {
    this.activityInjectorProvider = paramProvider;
    this.broadcastReceiverInjectorProvider = paramProvider1;
    this.fragmentInjectorProvider = paramProvider2;
    this.serviceInjectorProvider = paramProvider3;
    this.contentProviderInjectorProvider = paramProvider4;
    this.supportFragmentInjectorProvider = paramProvider5;
  }
  
  public static MembersInjector<DaggerApplication> create(Provider<DispatchingAndroidInjector<Activity>> paramProvider, Provider<DispatchingAndroidInjector<BroadcastReceiver>> paramProvider1, Provider<DispatchingAndroidInjector<android.app.Fragment>> paramProvider2, Provider<DispatchingAndroidInjector<Service>> paramProvider3, Provider<DispatchingAndroidInjector<ContentProvider>> paramProvider4, Provider<DispatchingAndroidInjector<android.support.v4.app.Fragment>> paramProvider5)
  {
    return new DaggerApplication_MembersInjector(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5);
  }
  
  public static void injectSupportFragmentInjector(DaggerApplication paramDaggerApplication, DispatchingAndroidInjector<android.support.v4.app.Fragment> paramDispatchingAndroidInjector)
  {
    paramDaggerApplication.supportFragmentInjector = paramDispatchingAndroidInjector;
  }
  
  public final void injectMembers(DaggerApplication paramDaggerApplication)
  {
    dagger.android.DaggerApplication_MembersInjector.injectActivityInjector(paramDaggerApplication, (DispatchingAndroidInjector)this.activityInjectorProvider.get());
    dagger.android.DaggerApplication_MembersInjector.injectBroadcastReceiverInjector(paramDaggerApplication, (DispatchingAndroidInjector)this.broadcastReceiverInjectorProvider.get());
    dagger.android.DaggerApplication_MembersInjector.injectFragmentInjector(paramDaggerApplication, (DispatchingAndroidInjector)this.fragmentInjectorProvider.get());
    dagger.android.DaggerApplication_MembersInjector.injectServiceInjector(paramDaggerApplication, (DispatchingAndroidInjector)this.serviceInjectorProvider.get());
    dagger.android.DaggerApplication_MembersInjector.injectContentProviderInjector(paramDaggerApplication, (DispatchingAndroidInjector)this.contentProviderInjectorProvider.get());
    dagger.android.DaggerApplication_MembersInjector.injectSetInjected(paramDaggerApplication);
    injectSupportFragmentInjector(paramDaggerApplication, (DispatchingAndroidInjector)this.supportFragmentInjectorProvider.get());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/support/DaggerApplication_MembersInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */