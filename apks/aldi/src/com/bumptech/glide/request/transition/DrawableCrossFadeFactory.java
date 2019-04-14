package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;

public class DrawableCrossFadeFactory
  implements TransitionFactory<Drawable>
{
  private final int duration;
  private final boolean isCrossFadeEnabled;
  private DrawableCrossFadeTransition resourceTransition;
  
  protected DrawableCrossFadeFactory(int paramInt, boolean paramBoolean)
  {
    this.duration = paramInt;
    this.isCrossFadeEnabled = paramBoolean;
  }
  
  private Transition<Drawable> getResourceTransition()
  {
    if (this.resourceTransition == null) {
      this.resourceTransition = new DrawableCrossFadeTransition(this.duration, this.isCrossFadeEnabled);
    }
    return this.resourceTransition;
  }
  
  public Transition<Drawable> build(DataSource paramDataSource, boolean paramBoolean)
  {
    if (paramDataSource == DataSource.MEMORY_CACHE) {
      return NoTransition.get();
    }
    return getResourceTransition();
  }
  
  public static class Builder
  {
    private static final int DEFAULT_DURATION_MS = 300;
    private final int durationMillis;
    private boolean isCrossFadeEnabled;
    
    public Builder()
    {
      this(300);
    }
    
    public Builder(int paramInt)
    {
      this.durationMillis = paramInt;
    }
    
    public DrawableCrossFadeFactory build()
    {
      return new DrawableCrossFadeFactory(this.durationMillis, this.isCrossFadeEnabled);
    }
    
    public Builder setCrossFadeEnabled(boolean paramBoolean)
    {
      this.isCrossFadeEnabled = paramBoolean;
      return this;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/transition/DrawableCrossFadeFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */