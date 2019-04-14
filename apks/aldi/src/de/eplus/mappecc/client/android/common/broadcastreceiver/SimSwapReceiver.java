package de.eplus.mappecc.client.android.common.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import c.a.a;
import de.eplus.mappecc.client.android.common.base.B2PApplication;
import de.eplus.mappecc.client.android.common.dependencyinjection.application.AppComponent;
import de.eplus.mappecc.client.android.common.eventbus.BusEvent;
import de.eplus.mappecc.client.android.common.eventbus.MainThreadBus;
import javax.inject.Inject;

public class SimSwapReceiver
  extends BroadcastReceiver
{
  private static final String EXTRA_SIM_STATE = "ss";
  private static final String SIM_STATE_LOADED = "LOADED";
  @Inject
  protected MainThreadBus bus;
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = new StringBuilder("onReceive() entered.. sim card was removed ");
    paramContext.append(paramIntent.getStringExtra("ss"));
    a.b(paramContext.toString(), new Object[0]);
    B2PApplication.component.inject(this);
    if ((paramIntent != null) && ("LOADED".equals(paramIntent.getStringExtra("ss")))) {
      this.bus.post(new BusEvent(12, null));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/broadcastreceiver/SimSwapReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */