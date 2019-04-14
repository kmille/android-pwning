package de.eplus.mappecc.client.android.common.broadcastreceiver;

import dagger.MembersInjector;
import de.eplus.mappecc.client.android.common.eventbus.MainThreadBus;
import javax.inject.Provider;

public final class SimSwapReceiver_MembersInjector
  implements MembersInjector<SimSwapReceiver>
{
  private final Provider<MainThreadBus> busProvider;
  
  public SimSwapReceiver_MembersInjector(Provider<MainThreadBus> paramProvider)
  {
    this.busProvider = paramProvider;
  }
  
  public static MembersInjector<SimSwapReceiver> create(Provider<MainThreadBus> paramProvider)
  {
    return new SimSwapReceiver_MembersInjector(paramProvider);
  }
  
  public static void injectBus(SimSwapReceiver paramSimSwapReceiver, MainThreadBus paramMainThreadBus)
  {
    paramSimSwapReceiver.bus = paramMainThreadBus;
  }
  
  public final void injectMembers(SimSwapReceiver paramSimSwapReceiver)
  {
    injectBus(paramSimSwapReceiver, (MainThreadBus)this.busProvider.get());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/broadcastreceiver/SimSwapReceiver_MembersInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */