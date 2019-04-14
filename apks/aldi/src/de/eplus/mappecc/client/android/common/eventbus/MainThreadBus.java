package de.eplus.mappecc.client.android.common.eventbus;

import android.os.Handler;
import android.os.Looper;
import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;
import javax.inject.Singleton;

@Singleton
public class MainThreadBus
  extends Bus
{
  private final Handler handler = new Handler(Looper.getMainLooper());
  
  public MainThreadBus()
  {
    super(ThreadEnforcer.ANY);
  }
  
  public void post(Object paramObject)
  {
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      super.post(paramObject);
      return;
    }
    this.handler.post(new -..Lambda.MainThreadBus.24D7-UO60er7NcrsjCpvTYKVOnU(this, paramObject));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/eventbus/MainThreadBus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */