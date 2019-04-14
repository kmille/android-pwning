package dagger.android;

import android.content.BroadcastReceiver;

public abstract interface HasBroadcastReceiverInjector
{
  public abstract AndroidInjector<BroadcastReceiver> broadcastReceiverInjector();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/HasBroadcastReceiverInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */