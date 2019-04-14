package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.eventbus.MainThreadBus;

public final class OttoModule_ProvideMainThreadBusFactory
  implements Factory<MainThreadBus>
{
  private static final OttoModule_ProvideMainThreadBusFactory INSTANCE = new OttoModule_ProvideMainThreadBusFactory();
  
  public static OttoModule_ProvideMainThreadBusFactory create()
  {
    return INSTANCE;
  }
  
  public static MainThreadBus provideInstance()
  {
    return proxyProvideMainThreadBus();
  }
  
  public static MainThreadBus proxyProvideMainThreadBus()
  {
    return (MainThreadBus)Preconditions.checkNotNull(OttoModule.provideMainThreadBus(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final MainThreadBus get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/OttoModule_ProvideMainThreadBusFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */