package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.Option;

public abstract class DownsampleStrategy
{
  public static final DownsampleStrategy AT_LEAST;
  public static final DownsampleStrategy AT_MOST;
  public static final DownsampleStrategy CENTER_INSIDE;
  public static final DownsampleStrategy CENTER_OUTSIDE;
  public static final DownsampleStrategy DEFAULT = CENTER_OUTSIDE;
  public static final DownsampleStrategy FIT_CENTER = new FitCenter();
  public static final DownsampleStrategy NONE;
  public static final Option<DownsampleStrategy> OPTION = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", DEFAULT);
  
  static
  {
    CENTER_OUTSIDE = new CenterOutside();
    AT_LEAST = new AtLeast();
    AT_MOST = new AtMost();
    CENTER_INSIDE = new CenterInside();
    NONE = new None();
  }
  
  public abstract SampleSizeRounding getSampleSizeRounding(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract float getScaleFactor(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  static class AtLeast
    extends DownsampleStrategy
  {
    public DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return DownsampleStrategy.SampleSizeRounding.QUALITY;
    }
    
    public float getScaleFactor(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramInt1 = Math.min(paramInt2 / paramInt4, paramInt1 / paramInt3);
      if (paramInt1 == 0) {
        return 1.0F;
      }
      return 1.0F / Integer.highestOneBit(paramInt1);
    }
  }
  
  static class AtMost
    extends DownsampleStrategy
  {
    public DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return DownsampleStrategy.SampleSizeRounding.MEMORY;
    }
    
    public float getScaleFactor(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramInt3 = (int)Math.ceil(Math.max(paramInt2 / paramInt4, paramInt1 / paramInt3));
      paramInt2 = Integer.highestOneBit(paramInt3);
      paramInt1 = 1;
      paramInt2 = Math.max(1, paramInt2);
      if (paramInt2 >= paramInt3) {
        paramInt1 = 0;
      }
      return 1.0F / (paramInt2 << paramInt1);
    }
  }
  
  static class CenterInside
    extends DownsampleStrategy
  {
    public DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return DownsampleStrategy.SampleSizeRounding.QUALITY;
    }
    
    public float getScaleFactor(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return Math.min(1.0F, FIT_CENTER.getScaleFactor(paramInt1, paramInt2, paramInt3, paramInt4));
    }
  }
  
  static class CenterOutside
    extends DownsampleStrategy
  {
    public DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return DownsampleStrategy.SampleSizeRounding.QUALITY;
    }
    
    public float getScaleFactor(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return Math.max(paramInt3 / paramInt1, paramInt4 / paramInt2);
    }
  }
  
  static class FitCenter
    extends DownsampleStrategy
  {
    public DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return DownsampleStrategy.SampleSizeRounding.QUALITY;
    }
    
    public float getScaleFactor(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return Math.min(paramInt3 / paramInt1, paramInt4 / paramInt2);
    }
  }
  
  static class None
    extends DownsampleStrategy
  {
    public DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return DownsampleStrategy.SampleSizeRounding.QUALITY;
    }
    
    public float getScaleFactor(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return 1.0F;
    }
  }
  
  public static enum SampleSizeRounding
  {
    MEMORY,  QUALITY;
    
    private SampleSizeRounding() {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/DownsampleStrategy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */