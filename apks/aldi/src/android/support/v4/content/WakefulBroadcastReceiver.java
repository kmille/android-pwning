package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;

@Deprecated
public abstract class WakefulBroadcastReceiver
  extends BroadcastReceiver
{
  private static final String EXTRA_WAKE_LOCK_ID = "android.support.content.wakelockid";
  private static int mNextId = 1;
  private static final SparseArray<PowerManager.WakeLock> sActiveWakeLocks = new SparseArray();
  
  public static boolean completeWakefulIntent(Intent arg0)
  {
    int i = ???.getIntExtra("android.support.content.wakelockid", 0);
    if (i == 0) {
      return false;
    }
    synchronized (sActiveWakeLocks)
    {
      PowerManager.WakeLock localWakeLock = (PowerManager.WakeLock)sActiveWakeLocks.get(i);
      if (localWakeLock != null)
      {
        localWakeLock.release();
        sActiveWakeLocks.remove(i);
        return true;
      }
      return true;
    }
  }
  
  public static ComponentName startWakefulService(Context paramContext, Intent paramIntent)
  {
    synchronized (sActiveWakeLocks)
    {
      int i = mNextId;
      int j = mNextId + 1;
      mNextId = j;
      if (j <= 0) {
        mNextId = 1;
      }
      paramIntent.putExtra("android.support.content.wakelockid", i);
      paramIntent = paramContext.startService(paramIntent);
      if (paramIntent == null) {
        return null;
      }
      paramContext = (PowerManager)paramContext.getSystemService("power");
      StringBuilder localStringBuilder = new StringBuilder("androidx.core:wake:");
      localStringBuilder.append(paramIntent.flattenToShortString());
      paramContext = paramContext.newWakeLock(1, localStringBuilder.toString());
      paramContext.setReferenceCounted(false);
      paramContext.acquire(60000L);
      sActiveWakeLocks.put(i, paramContext);
      return paramIntent;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/content/WakefulBroadcastReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */