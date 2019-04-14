package com.bumptech.glide.request;

public abstract interface Request
{
  public abstract void begin();
  
  public abstract void clear();
  
  public abstract boolean isCleared();
  
  public abstract boolean isComplete();
  
  public abstract boolean isEquivalentTo(Request paramRequest);
  
  public abstract boolean isFailed();
  
  public abstract boolean isResourceSet();
  
  public abstract boolean isRunning();
  
  public abstract void recycle();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/Request.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */