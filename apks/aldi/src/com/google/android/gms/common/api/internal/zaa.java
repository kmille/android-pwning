package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.support.annotation.MainThread;
import android.support.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zaa
  extends ActivityLifecycleObserver
{
  private final WeakReference<zaa> zack;
  
  public zaa(Activity paramActivity)
  {
    this(zaa.zab(paramActivity));
  }
  
  @VisibleForTesting(otherwise=2)
  private zaa(zaa paramzaa)
  {
    this.zack = new WeakReference(paramzaa);
  }
  
  public final ActivityLifecycleObserver onStopCallOnce(Runnable paramRunnable)
  {
    zaa localzaa = (zaa)this.zack.get();
    if (localzaa != null)
    {
      zaa.zaa(localzaa, paramRunnable);
      return this;
    }
    throw new IllegalStateException("The target activity has already been GC'd");
  }
  
  @VisibleForTesting(otherwise=2)
  static class zaa
    extends LifecycleCallback
  {
    private List<Runnable> zacl = new ArrayList();
    
    private zaa(LifecycleFragment paramLifecycleFragment)
    {
      super();
      this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
    }
    
    private static zaa zaa(Activity paramActivity)
    {
      try
      {
        LifecycleFragment localLifecycleFragment = getFragment(paramActivity);
        zaa localzaa2 = (zaa)localLifecycleFragment.getCallbackOrNull("LifecycleObserverOnStop", zaa.class);
        zaa localzaa1 = localzaa2;
        if (localzaa2 == null) {
          localzaa1 = new zaa(localLifecycleFragment);
        }
        return localzaa1;
      }
      finally {}
    }
    
    private final void zaa(Runnable paramRunnable)
    {
      try
      {
        this.zacl.add(paramRunnable);
        return;
      }
      finally
      {
        paramRunnable = finally;
        throw paramRunnable;
      }
    }
    
    @MainThread
    public void onStop()
    {
      try
      {
        Object localObject1 = this.zacl;
        this.zacl = new ArrayList();
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext()) {
          ((Runnable)((Iterator)localObject1).next()).run();
        }
        return;
      }
      finally {}
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */