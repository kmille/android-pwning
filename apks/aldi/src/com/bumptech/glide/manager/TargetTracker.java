package com.bumptech.glide.manager;

import android.support.annotation.NonNull;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class TargetTracker
  implements LifecycleListener
{
  private final Set<Target<?>> targets = Collections.newSetFromMap(new WeakHashMap());
  
  public final void clear()
  {
    this.targets.clear();
  }
  
  @NonNull
  public final List<Target<?>> getAll()
  {
    return Util.getSnapshot(this.targets);
  }
  
  public final void onDestroy()
  {
    Iterator localIterator = Util.getSnapshot(this.targets).iterator();
    while (localIterator.hasNext()) {
      ((Target)localIterator.next()).onDestroy();
    }
  }
  
  public final void onStart()
  {
    Iterator localIterator = Util.getSnapshot(this.targets).iterator();
    while (localIterator.hasNext()) {
      ((Target)localIterator.next()).onStart();
    }
  }
  
  public final void onStop()
  {
    Iterator localIterator = Util.getSnapshot(this.targets).iterator();
    while (localIterator.hasNext()) {
      ((Target)localIterator.next()).onStop();
    }
  }
  
  public final void track(@NonNull Target<?> paramTarget)
  {
    this.targets.add(paramTarget);
  }
  
  public final void untrack(@NonNull Target<?> paramTarget)
  {
    this.targets.remove(paramTarget);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/manager/TargetTracker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */