package dagger.android;

import android.app.Activity;
import android.app.Fragment;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import dagger.Module;
import dagger.multibindings.Multibinds;
import java.util.Map;

@Module
public abstract class AndroidInjectionModule
{
  @Multibinds
  abstract Map<Class<? extends Activity>, AndroidInjector.Factory<? extends Activity>> activityInjectorFactories();
  
  @Multibinds
  abstract Map<String, AndroidInjector.Factory<? extends Activity>> activityInjectorFactoriesWithStringKeys();
  
  @Multibinds
  abstract Map<Class<? extends BroadcastReceiver>, AndroidInjector.Factory<? extends BroadcastReceiver>> broadcastReceiverInjectorFactories();
  
  @Multibinds
  abstract Map<String, AndroidInjector.Factory<? extends BroadcastReceiver>> broadcastReceiverInjectorFactoriesWithStringKeys();
  
  @Multibinds
  abstract Map<Class<? extends ContentProvider>, AndroidInjector.Factory<? extends ContentProvider>> contentProviderInjectorFactories();
  
  @Multibinds
  abstract Map<String, AndroidInjector.Factory<? extends ContentProvider>> contentProviderInjectorFactoriesWithStringKeys();
  
  @Multibinds
  abstract Map<Class<? extends Fragment>, AndroidInjector.Factory<? extends Fragment>> fragmentInjectorFactories();
  
  @Multibinds
  abstract Map<String, AndroidInjector.Factory<? extends Fragment>> fragmentInjectorFactoriesWithStringKeys();
  
  @Multibinds
  abstract Map<Class<? extends Service>, AndroidInjector.Factory<? extends Service>> serviceInjectorFactories();
  
  @Multibinds
  abstract Map<String, AndroidInjector.Factory<? extends Service>> serviceInjectorFactoriesWithStringKeys();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/AndroidInjectionModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */