package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.eventbus.BusEventReceiver;
import de.eplus.mappecc.client.android.common.eventbus.MainThreadBus;
import javax.inject.Provider;

public final class OttoModule_ProvideBusEventReceiverFactory
  implements Factory<BusEventReceiver>
{
  private final Provider<MainThreadBus> busProvider;
  
  public OttoModule_ProvideBusEventReceiverFactory(Provider<MainThreadBus> paramProvider)
  {
    this.busProvider = paramProvider;
  }
  
  public static OttoModule_ProvideBusEventReceiverFactory create(Provider<MainThreadBus> paramProvider)
  {
    return new OttoModule_ProvideBusEventReceiverFactory(paramProvider);
  }
  
  public static BusEventReceiver provideInstance(Provider<MainThreadBus> paramProvider)
  {
    return proxyProvideBusEventReceiver((MainThreadBus)paramProvider.get());
  }
  
  public static BusEventReceiver proxyProvideBusEventReceiver(MainThreadBus paramMainThreadBus)
  {
    return (BusEventReceiver)Preconditions.checkNotNull(OttoModule.provideBusEventReceiver(paramMainThreadBus), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final BusEventReceiver get()
  {
    return provideInstance(this.busProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/OttoModule_ProvideBusEventReceiverFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */