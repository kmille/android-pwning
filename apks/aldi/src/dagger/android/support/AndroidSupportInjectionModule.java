package dagger.android.support;

import android.support.v4.app.Fragment;
import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector.Factory;
import dagger.multibindings.Multibinds;
import java.util.Map;

@Module(includes={AndroidInjectionModule.class})
public abstract class AndroidSupportInjectionModule
{
  @Multibinds
  abstract Map<Class<? extends Fragment>, AndroidInjector.Factory<? extends Fragment>> supportFragmentInjectorFactories();
  
  @Multibinds
  abstract Map<String, AndroidInjector.Factory<? extends Fragment>> supportFragmentInjectorFactoriesWithStringKeys();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/support/AndroidSupportInjectionModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */