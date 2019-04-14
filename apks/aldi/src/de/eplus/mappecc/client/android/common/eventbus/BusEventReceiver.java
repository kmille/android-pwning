package de.eplus.mappecc.client.android.common.eventbus;

import android.support.annotation.NonNull;
import c.a.a;
import com.squareup.otto.Subscribe;
import de.eplus.mappecc.client.android.common.base.B2PApplication;
import de.eplus.mappecc.client.android.common.dependencyinjection.application.AppComponent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import javax.inject.Singleton;

public class BusEventReceiver
{
  private final MainThreadBus bus;
  @Singleton
  private final ArrayList<BusEventListener> busEventListeners = new ArrayList();
  
  @Inject
  public BusEventReceiver(MainThreadBus paramMainThreadBus)
  {
    this.bus = paramMainThreadBus;
    B2PApplication.component.inject(this);
    this.bus.register(this);
  }
  
  public void addBusEventListener(BusEventListener paramBusEventListener)
  {
    this.busEventListeners.add(paramBusEventListener);
  }
  
  @Subscribe
  public void onEventReceived(BusEvent paramBusEvent)
  {
    Object localObject = new StringBuilder("onEventReceived(): ");
    ((StringBuilder)localObject).append(paramBusEvent.event);
    a.b(((StringBuilder)localObject).toString(), new Object[0]);
    localObject = this.busEventListeners.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((BusEventListener)((Iterator)localObject).next()).onBusEventReceived(paramBusEvent);
    }
  }
  
  @Subscribe
  public void onKillActivity(@NonNull KillActivityEvent paramKillActivityEvent)
  {
    a.b("onKillActivity() called ", new Object[0]);
    Iterator localIterator = this.busEventListeners.iterator();
    while (localIterator.hasNext()) {
      ((BusEventListener)localIterator.next()).onKillActivity(paramKillActivityEvent);
    }
  }
  
  @Subscribe
  public void onTimeoutReceived(TimeoutEvent paramTimeoutEvent)
  {
    a.b("entered...", new Object[0]);
    Iterator localIterator = this.busEventListeners.iterator();
    while (localIterator.hasNext()) {
      ((BusEventListener)localIterator.next()).onTimeoutReceived(paramTimeoutEvent);
    }
  }
  
  public void removeBusEventListener(BusEventListener paramBusEventListener)
  {
    this.busEventListeners.remove(paramBusEventListener);
  }
  
  public static abstract interface BusEventListener
  {
    public abstract void onBusEventReceived(BusEvent paramBusEvent);
    
    public abstract void onKillActivity(@NonNull KillActivityEvent paramKillActivityEvent);
    
    public abstract void onTimeoutReceived(@NonNull TimeoutEvent paramTimeoutEvent);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/eventbus/BusEventReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */