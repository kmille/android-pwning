package de.eplus.mappecc.client.android.common.eventbus;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class BusEventReceiver_Factory
  implements Factory<BusEventReceiver>
{
  private final Provider<MainThreadBus> busProvider;
  
  public BusEventReceiver_Factory(Provider<MainThreadBus> paramProvider)
  {
    this.busProvider = paramProvider;
  }
  
  public static BusEventReceiver_Factory create(Provider<MainThreadBus> paramProvider)
  {
    return new BusEventReceiver_Factory(paramProvider);
  }
  
  public static BusEventReceiver newBusEventReceiver(MainThreadBus paramMainThreadBus)
  {
    return new BusEventReceiver(paramMainThreadBus);
  }
  
  public static BusEventReceiver provideInstance(Provider<MainThreadBus> paramProvider)
  {
    return new BusEventReceiver((MainThreadBus)paramProvider.get());
  }
  
  public final BusEventReceiver get()
  {
    return provideInstance(this.busProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/eventbus/BusEventReceiver_Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */