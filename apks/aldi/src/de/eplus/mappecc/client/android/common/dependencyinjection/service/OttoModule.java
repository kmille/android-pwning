package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.eventbus.BusEventReceiver;
import de.eplus.mappecc.client.android.common.eventbus.MainThreadBus;
import javax.inject.Singleton;

@Module
public class OttoModule
{
  @Provides
  @Singleton
  static BusEventReceiver provideBusEventReceiver(MainThreadBus paramMainThreadBus)
  {
    return new BusEventReceiver(paramMainThreadBus);
  }
  
  @Provides
  @Singleton
  static MainThreadBus provideMainThreadBus()
  {
    return new MainThreadBus();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/OttoModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */