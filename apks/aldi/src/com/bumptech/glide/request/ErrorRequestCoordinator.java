package com.bumptech.glide.request;

import android.support.annotation.Nullable;

public final class ErrorRequestCoordinator
  implements Request, RequestCoordinator
{
  private Request error;
  @Nullable
  private final RequestCoordinator parent;
  private Request primary;
  
  public ErrorRequestCoordinator(@Nullable RequestCoordinator paramRequestCoordinator)
  {
    this.parent = paramRequestCoordinator;
  }
  
  private boolean isValidRequest(Request paramRequest)
  {
    return (paramRequest.equals(this.primary)) || ((this.primary.isFailed()) && (paramRequest.equals(this.error)));
  }
  
  private boolean parentCanNotifyCleared()
  {
    return (this.parent == null) || (this.parent.canNotifyCleared(this));
  }
  
  private boolean parentCanNotifyStatusChanged()
  {
    return (this.parent == null) || (this.parent.canNotifyStatusChanged(this));
  }
  
  private boolean parentCanSetImage()
  {
    return (this.parent == null) || (this.parent.canSetImage(this));
  }
  
  private boolean parentIsAnyResourceSet()
  {
    return (this.parent != null) && (this.parent.isAnyResourceSet());
  }
  
  public final void begin()
  {
    if (!this.primary.isRunning()) {
      this.primary.begin();
    }
  }
  
  public final boolean canNotifyCleared(Request paramRequest)
  {
    return (parentCanNotifyCleared()) && (isValidRequest(paramRequest));
  }
  
  public final boolean canNotifyStatusChanged(Request paramRequest)
  {
    return (parentCanNotifyStatusChanged()) && (isValidRequest(paramRequest));
  }
  
  public final boolean canSetImage(Request paramRequest)
  {
    return (parentCanSetImage()) && (isValidRequest(paramRequest));
  }
  
  public final void clear()
  {
    this.primary.clear();
    if (this.error.isRunning()) {
      this.error.clear();
    }
  }
  
  public final boolean isAnyResourceSet()
  {
    return (parentIsAnyResourceSet()) || (isResourceSet());
  }
  
  public final boolean isCleared()
  {
    if (this.primary.isFailed()) {}
    for (Request localRequest = this.error;; localRequest = this.primary) {
      return localRequest.isCleared();
    }
  }
  
  public final boolean isComplete()
  {
    if (this.primary.isFailed()) {}
    for (Request localRequest = this.error;; localRequest = this.primary) {
      return localRequest.isComplete();
    }
  }
  
  public final boolean isEquivalentTo(Request paramRequest)
  {
    if ((paramRequest instanceof ErrorRequestCoordinator))
    {
      paramRequest = (ErrorRequestCoordinator)paramRequest;
      if ((this.primary.isEquivalentTo(paramRequest.primary)) && (this.error.isEquivalentTo(paramRequest.error))) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean isFailed()
  {
    return (this.primary.isFailed()) && (this.error.isFailed());
  }
  
  public final boolean isResourceSet()
  {
    if (this.primary.isFailed()) {}
    for (Request localRequest = this.error;; localRequest = this.primary) {
      return localRequest.isResourceSet();
    }
  }
  
  public final boolean isRunning()
  {
    if (this.primary.isFailed()) {}
    for (Request localRequest = this.error;; localRequest = this.primary) {
      return localRequest.isRunning();
    }
  }
  
  public final void onRequestFailed(Request paramRequest)
  {
    if (!paramRequest.equals(this.error))
    {
      if (!this.error.isRunning()) {
        this.error.begin();
      }
      return;
    }
    if (this.parent != null) {
      this.parent.onRequestFailed(this);
    }
  }
  
  public final void onRequestSuccess(Request paramRequest)
  {
    if (this.parent != null) {
      this.parent.onRequestSuccess(this);
    }
  }
  
  public final void recycle()
  {
    this.primary.recycle();
    this.error.recycle();
  }
  
  public final void setRequests(Request paramRequest1, Request paramRequest2)
  {
    this.primary = paramRequest1;
    this.error = paramRequest2;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/ErrorRequestCoordinator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */