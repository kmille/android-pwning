package dagger.android;

import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;

public final class DispatchingAndroidInjector_Factory<T>
  implements Factory<DispatchingAndroidInjector<T>>
{
  private final Provider<Map<Class<? extends T>, Provider<AndroidInjector.Factory<? extends T>>>> injectorFactoriesWithClassKeysProvider;
  private final Provider<Map<String, Provider<AndroidInjector.Factory<? extends T>>>> injectorFactoriesWithStringKeysProvider;
  
  public DispatchingAndroidInjector_Factory(Provider<Map<Class<? extends T>, Provider<AndroidInjector.Factory<? extends T>>>> paramProvider, Provider<Map<String, Provider<AndroidInjector.Factory<? extends T>>>> paramProvider1)
  {
    this.injectorFactoriesWithClassKeysProvider = paramProvider;
    this.injectorFactoriesWithStringKeysProvider = paramProvider1;
  }
  
  public static <T> DispatchingAndroidInjector_Factory<T> create(Provider<Map<Class<? extends T>, Provider<AndroidInjector.Factory<? extends T>>>> paramProvider, Provider<Map<String, Provider<AndroidInjector.Factory<? extends T>>>> paramProvider1)
  {
    return new DispatchingAndroidInjector_Factory(paramProvider, paramProvider1);
  }
  
  public static <T> DispatchingAndroidInjector<T> newDispatchingAndroidInjector(Map<Class<? extends T>, Provider<AndroidInjector.Factory<? extends T>>> paramMap, Map<String, Provider<AndroidInjector.Factory<? extends T>>> paramMap1)
  {
    return new DispatchingAndroidInjector(paramMap, paramMap1);
  }
  
  public static <T> DispatchingAndroidInjector<T> provideInstance(Provider<Map<Class<? extends T>, Provider<AndroidInjector.Factory<? extends T>>>> paramProvider, Provider<Map<String, Provider<AndroidInjector.Factory<? extends T>>>> paramProvider1)
  {
    return new DispatchingAndroidInjector((Map)paramProvider.get(), (Map)paramProvider1.get());
  }
  
  public final DispatchingAndroidInjector<T> get()
  {
    return provideInstance(this.injectorFactoriesWithClassKeysProvider, this.injectorFactoriesWithStringKeysProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/DispatchingAndroidInjector_Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */