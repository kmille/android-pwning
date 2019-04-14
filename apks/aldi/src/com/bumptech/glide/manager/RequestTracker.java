package com.bumptech.glide.manager;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public class RequestTracker
{
  private static final String TAG = "RequestTracker";
  private boolean isPaused;
  private final List<Request> pendingRequests = new ArrayList();
  private final Set<Request> requests = Collections.newSetFromMap(new WeakHashMap());
  
  private boolean clearRemoveAndMaybeRecycle(@Nullable Request paramRequest, boolean paramBoolean)
  {
    boolean bool2 = true;
    if (paramRequest == null) {
      return true;
    }
    boolean bool3 = this.requests.remove(paramRequest);
    boolean bool1 = bool2;
    if (!this.pendingRequests.remove(paramRequest)) {
      if (bool3) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    if (bool1)
    {
      paramRequest.clear();
      if (paramBoolean) {
        paramRequest.recycle();
      }
    }
    return bool1;
  }
  
  @VisibleForTesting
  void addRequest(Request paramRequest)
  {
    this.requests.add(paramRequest);
  }
  
  public boolean clearRemoveAndRecycle(@Nullable Request paramRequest)
  {
    return clearRemoveAndMaybeRecycle(paramRequest, true);
  }
  
  public void clearRequests()
  {
    Iterator localIterator = Util.getSnapshot(this.requests).iterator();
    while (localIterator.hasNext()) {
      clearRemoveAndMaybeRecycle((Request)localIterator.next(), false);
    }
    this.pendingRequests.clear();
  }
  
  public boolean isPaused()
  {
    return this.isPaused;
  }
  
  public void pauseAllRequests()
  {
    this.isPaused = true;
    Iterator localIterator = Util.getSnapshot(this.requests).iterator();
    while (localIterator.hasNext())
    {
      Request localRequest = (Request)localIterator.next();
      if ((localRequest.isRunning()) || (localRequest.isComplete()))
      {
        localRequest.clear();
        this.pendingRequests.add(localRequest);
      }
    }
  }
  
  public void pauseRequests()
  {
    this.isPaused = true;
    Iterator localIterator = Util.getSnapshot(this.requests).iterator();
    while (localIterator.hasNext())
    {
      Request localRequest = (Request)localIterator.next();
      if (localRequest.isRunning())
      {
        localRequest.clear();
        this.pendingRequests.add(localRequest);
      }
    }
  }
  
  public void restartRequests()
  {
    Iterator localIterator = Util.getSnapshot(this.requests).iterator();
    while (localIterator.hasNext())
    {
      Request localRequest = (Request)localIterator.next();
      if ((!localRequest.isComplete()) && (!localRequest.isCleared()))
      {
        localRequest.clear();
        if (!this.isPaused) {
          localRequest.begin();
        } else {
          this.pendingRequests.add(localRequest);
        }
      }
    }
  }
  
  public void resumeRequests()
  {
    this.isPaused = false;
    Iterator localIterator = Util.getSnapshot(this.requests).iterator();
    while (localIterator.hasNext())
    {
      Request localRequest = (Request)localIterator.next();
      if ((!localRequest.isComplete()) && (!localRequest.isRunning())) {
        localRequest.begin();
      }
    }
    this.pendingRequests.clear();
  }
  
  public void runRequest(@NonNull Request paramRequest)
  {
    this.requests.add(paramRequest);
    if (!this.isPaused)
    {
      paramRequest.begin();
      return;
    }
    paramRequest.clear();
    Log.isLoggable("RequestTracker", 2);
    this.pendingRequests.add(paramRequest);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    localStringBuilder.append("{numRequests=");
    localStringBuilder.append(this.requests.size());
    localStringBuilder.append(", isPaused=");
    localStringBuilder.append(this.isPaused);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/manager/RequestTracker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */