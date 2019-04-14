package de.eplus.mappecc.client.android.common.component.button;

import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;

public abstract class OnSingleClickListener
  implements View.OnClickListener
{
  private static final int MIN_TIME_TO_DISABLE_CLICK = 1000;
  private long lastClickTime;
  
  public void onClick(View paramView)
  {
    long l = SystemClock.elapsedRealtime();
    if (l - this.lastClickTime < 1000L) {
      return;
    }
    this.lastClickTime = l;
    onSingleClick(paramView);
  }
  
  public abstract void onSingleClick(View paramView);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/button/OnSingleClickListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */