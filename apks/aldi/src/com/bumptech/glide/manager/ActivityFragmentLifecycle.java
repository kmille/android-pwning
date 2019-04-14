package com.bumptech.glide.manager;

import android.support.annotation.NonNull;
import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

class ActivityFragmentLifecycle
  implements Lifecycle
{
  private boolean isDestroyed;
  private boolean isStarted;
  private final Set<LifecycleListener> lifecycleListeners = Collections.newSetFromMap(new WeakHashMap());
  
  public void addListener(@NonNull LifecycleListener paramLifecycleListener)
  {
    this.lifecycleListeners.add(paramLifecycleListener);
    if (this.isDestroyed)
    {
      paramLifecycleListener.onDestroy();
      return;
    }
    if (this.isStarted)
    {
      paramLifecycleListener.onStart();
      return;
    }
    paramLifecycleListener.onStop();
  }
  
  void onDestroy()
  {
    this.isDestroyed = true;
    Iterator localIterator = Util.getSnapshot(this.lifecycleListeners).iterator();
    while (localIterator.hasNext()) {
      ((LifecycleListener)localIterator.next()).onDestroy();
    }
  }
  
  void onStart()
  {
    this.isStarted = true;
    Iterator localIterator = Util.getSnapshot(this.lifecycleListeners).iterator();
    while (localIterator.hasNext()) {
      ((LifecycleListener)localIterator.next()).onStart();
    }
  }
  
  void onStop()
  {
    this.isStarted = false;
    Iterator localIterator = Util.getSnapshot(this.lifecycleListeners).iterator();
    while (localIterator.hasNext()) {
      ((LifecycleListener)localIterator.next()).onStop();
    }
  }
  
  public void removeListener(@NonNull LifecycleListener paramLifecycleListener)
  {
    this.lifecycleListeners.remove(paramLifecycleListener);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/manager/ActivityFragmentLifecycle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */