package dagger.android;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import javax.inject.Inject;

public abstract class DaggerApplication
  extends Application
  implements HasActivityInjector, HasBroadcastReceiverInjector, HasContentProviderInjector, HasFragmentInjector, HasServiceInjector
{
  @Inject
  DispatchingAndroidInjector<Activity> activityInjector;
  @Inject
  DispatchingAndroidInjector<BroadcastReceiver> broadcastReceiverInjector;
  @Inject
  DispatchingAndroidInjector<ContentProvider> contentProviderInjector;
  @Inject
  DispatchingAndroidInjector<Fragment> fragmentInjector;
  private volatile boolean needToInject = true;
  @Inject
  DispatchingAndroidInjector<Service> serviceInjector;
  
  private void injectIfNecessary()
  {
    if (this.needToInject) {
      try
      {
        if (this.needToInject)
        {
          applicationInjector().inject(this);
          if (this.needToInject) {
            throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
          }
        }
        return;
      }
      finally {}
    }
  }
  
  public DispatchingAndroidInjector<Activity> activityInjector()
  {
    return this.activityInjector;
  }
  
  protected abstract AndroidInjector<? extends DaggerApplication> applicationInjector();
  
  public DispatchingAndroidInjector<BroadcastReceiver> broadcastReceiverInjector()
  {
    return this.broadcastReceiverInjector;
  }
  
  public AndroidInjector<ContentProvider> contentProviderInjector()
  {
    injectIfNecessary();
    return this.contentProviderInjector;
  }
  
  public DispatchingAndroidInjector<Fragment> fragmentInjector()
  {
    return this.fragmentInjector;
  }
  
  public void onCreate()
  {
    super.onCreate();
    injectIfNecessary();
  }
  
  public DispatchingAndroidInjector<Service> serviceInjector()
  {
    return this.serviceInjector;
  }
  
  @Inject
  void setInjected()
  {
    this.needToInject = false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/DaggerApplication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */