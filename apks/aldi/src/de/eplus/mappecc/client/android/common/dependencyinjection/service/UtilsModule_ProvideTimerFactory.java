package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.utils.Timer;

public final class UtilsModule_ProvideTimerFactory
  implements Factory<Timer>
{
  private static final UtilsModule_ProvideTimerFactory INSTANCE = new UtilsModule_ProvideTimerFactory();
  
  public static UtilsModule_ProvideTimerFactory create()
  {
    return INSTANCE;
  }
  
  public static Timer provideInstance()
  {
    return proxyProvideTimer();
  }
  
  public static Timer proxyProvideTimer()
  {
    return (Timer)Preconditions.checkNotNull(UtilsModule.provideTimer(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final Timer get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvideTimerFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */