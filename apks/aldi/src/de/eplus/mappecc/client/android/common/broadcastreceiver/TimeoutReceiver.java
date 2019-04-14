package de.eplus.mappecc.client.android.common.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import c.a.a;
import de.eplus.mappecc.client.android.common.base.B2PApplication;
import de.eplus.mappecc.client.android.common.dependencyinjection.application.AppComponent;
import de.eplus.mappecc.client.android.common.eventbus.MainThreadBus;
import de.eplus.mappecc.client.android.common.eventbus.TimeoutEvent;
import javax.inject.Inject;

public class TimeoutReceiver
  extends BroadcastReceiver
{
  @Inject
  MainThreadBus bus;
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    a.b("onReceive() entered... ", new Object[0]);
    B2PApplication.component.inject(this);
    int i = paramIntent.getExtras().getInt("bundle_timeout_id");
    this.bus.post(new TimeoutEvent(i));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/broadcastreceiver/TimeoutReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */