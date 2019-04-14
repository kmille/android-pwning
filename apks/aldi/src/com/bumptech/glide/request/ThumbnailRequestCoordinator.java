package com.bumptech.glide.request;

import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;

public class ThumbnailRequestCoordinator
  implements Request, RequestCoordinator
{
  private Request full;
  private boolean isRunning;
  @Nullable
  private final RequestCoordinator parent;
  private Request thumb;
  
  @VisibleForTesting
  ThumbnailRequestCoordinator()
  {
    this(null);
  }
  
  public ThumbnailRequestCoordinator(@Nullable RequestCoordinator paramRequestCoordinator)
  {
    this.parent = paramRequestCoordinator;
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
  
  public void begin()
  {
    this.isRunning = true;
    if ((!this.full.isComplete()) && (!this.thumb.isRunning())) {
      this.thumb.begin();
    }
    if ((this.isRunning) && (!this.full.isRunning())) {
      this.full.begin();
    }
  }
  
  public boolean canNotifyCleared(Request paramRequest)
  {
    return (parentCanNotifyCleared()) && (paramRequest.equals(this.full));
  }
  
  public boolean canNotifyStatusChanged(Request paramRequest)
  {
    return (parentCanNotifyStatusChanged()) && (paramRequest.equals(this.full)) && (!isAnyResourceSet());
  }
  
  public boolean canSetImage(Request paramRequest)
  {
    return (parentCanSetImage()) && ((paramRequest.equals(this.full)) || (!this.full.isResourceSet()));
  }
  
  public void clear()
  {
    this.isRunning = false;
    this.thumb.clear();
    this.full.clear();
  }
  
  public boolean isAnyResourceSet()
  {
    return (parentIsAnyResourceSet()) || (isResourceSet());
  }
  
  public boolean isCleared()
  {
    return this.full.isCleared();
  }
  
  public boolean isComplete()
  {
    return (this.full.isComplete()) || (this.thumb.isComplete());
  }
  
  public boolean isEquivalentTo(Request paramRequest)
  {
    if ((paramRequest instanceof ThumbnailRequestCoordinator))
    {
      paramRequest = (ThumbnailRequestCoordinator)paramRequest;
      if ((this.full == null ? paramRequest.full == null : this.full.isEquivalentTo(paramRequest.full)) && (this.thumb == null ? paramRequest.thumb == null : this.thumb.isEquivalentTo(paramRequest.thumb))) {
        return true;
      }
    }
    return false;
  }
  
  public boolean isFailed()
  {
    return this.full.isFailed();
  }
  
  public boolean isResourceSet()
  {
    return (this.full.isResourceSet()) || (this.thumb.isResourceSet());
  }
  
  public boolean isRunning()
  {
    return this.full.isRunning();
  }
  
  public void onRequestFailed(Request paramRequest)
  {
    if (!paramRequest.equals(this.full)) {
      return;
    }
    if (this.parent != null) {
      this.parent.onRequestFailed(this);
    }
  }
  
  public void onRequestSuccess(Request paramRequest)
  {
    if (paramRequest.equals(this.thumb)) {
      return;
    }
    if (this.parent != null) {
      this.parent.onRequestSuccess(this);
    }
    if (!this.thumb.isComplete()) {
      this.thumb.clear();
    }
  }
  
  public void recycle()
  {
    this.full.recycle();
    this.thumb.recycle();
  }
  
  public void setRequests(Request paramRequest1, Request paramRequest2)
  {
    this.full = paramRequest1;
    this.thumb = paramRequest2;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/ThumbnailRequestCoordinator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */