package de.eplus.mappecc.client.android.common.broadcastreceiver;

import dagger.MembersInjector;
import de.eplus.mappecc.client.android.common.eventbus.MainThreadBus;
import javax.inject.Provider;

public final class TimeoutReceiver_MembersInjector
  implements MembersInjector<TimeoutReceiver>
{
  private final Provider<MainThreadBus> busProvider;
  
  public TimeoutReceiver_MembersInjector(Provider<MainThreadBus> paramProvider)
  {
    this.busProvider = paramProvider;
  }
  
  public static MembersInjector<TimeoutReceiver> create(Provider<MainThreadBus> paramProvider)
  {
    return new TimeoutReceiver_MembersInjector(paramProvider);
  }
  
  public static void injectBus(TimeoutReceiver paramTimeoutReceiver, MainThreadBus paramMainThreadBus)
  {
    paramTimeoutReceiver.bus = paramMainThreadBus;
  }
  
  public final void injectMembers(TimeoutReceiver paramTimeoutReceiver)
  {
    injectBus(paramTimeoutReceiver, (MainThreadBus)this.busProvider.get());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/broadcastreceiver/TimeoutReceiver_MembersInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */