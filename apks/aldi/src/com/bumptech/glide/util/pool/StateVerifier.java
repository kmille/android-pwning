package com.bumptech.glide.util.pool;

import android.support.annotation.NonNull;

public abstract class StateVerifier
{
  private static final boolean DEBUG = false;
  
  @NonNull
  public static StateVerifier newInstance()
  {
    return new DefaultStateVerifier();
  }
  
  abstract void setRecycled(boolean paramBoolean);
  
  public abstract void throwIfRecycled();
  
  static class DebugStateVerifier
    extends StateVerifier
  {
    private volatile RuntimeException recycledAtStackTraceException;
    
    DebugStateVerifier()
    {
      super();
    }
    
    void setRecycled(boolean paramBoolean)
    {
      if (paramBoolean) {}
      for (RuntimeException localRuntimeException = new RuntimeException("Released");; localRuntimeException = null)
      {
        this.recycledAtStackTraceException = localRuntimeException;
        return;
      }
    }
    
    public void throwIfRecycled()
    {
      if (this.recycledAtStackTraceException == null) {
        return;
      }
      throw new IllegalStateException("Already released", this.recycledAtStackTraceException);
    }
  }
  
  static class DefaultStateVerifier
    extends StateVerifier
  {
    private volatile boolean isReleased;
    
    DefaultStateVerifier()
    {
      super();
    }
    
    public void setRecycled(boolean paramBoolean)
    {
      this.isReleased = paramBoolean;
    }
    
    public void throwIfRecycled()
    {
      if (!this.isReleased) {
        return;
      }
      throw new IllegalStateException("Already released");
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/util/pool/StateVerifier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */