package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap.Config;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.bumptech.glide.util.Preconditions;

public final class PreFillType
{
  @VisibleForTesting
  static final Bitmap.Config DEFAULT_CONFIG = Bitmap.Config.RGB_565;
  private final Bitmap.Config config;
  private final int height;
  private final int weight;
  private final int width;
  
  PreFillType(int paramInt1, int paramInt2, Bitmap.Config paramConfig, int paramInt3)
  {
    this.config = ((Bitmap.Config)Preconditions.checkNotNull(paramConfig, "Config must not be null"));
    this.width = paramInt1;
    this.height = paramInt2;
    this.weight = paramInt3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof PreFillType))
    {
      paramObject = (PreFillType)paramObject;
      if ((this.height == ((PreFillType)paramObject).height) && (this.width == ((PreFillType)paramObject).width) && (this.weight == ((PreFillType)paramObject).weight) && (this.config == ((PreFillType)paramObject).config)) {
        return true;
      }
    }
    return false;
  }
  
  final Bitmap.Config getConfig()
  {
    return this.config;
  }
  
  final int getHeight()
  {
    return this.height;
  }
  
  final int getWeight()
  {
    return this.weight;
  }
  
  final int getWidth()
  {
    return this.width;
  }
  
  public final int hashCode()
  {
    return ((this.width * 31 + this.height) * 31 + this.config.hashCode()) * 31 + this.weight;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("PreFillSize{width=");
    localStringBuilder.append(this.width);
    localStringBuilder.append(", height=");
    localStringBuilder.append(this.height);
    localStringBuilder.append(", config=");
    localStringBuilder.append(this.config);
    localStringBuilder.append(", weight=");
    localStringBuilder.append(this.weight);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public static class Builder
  {
    private Bitmap.Config config;
    private final int height;
    private int weight = 1;
    private final int width;
    
    public Builder(int paramInt)
    {
      this(paramInt, paramInt);
    }
    
    public Builder(int paramInt1, int paramInt2)
    {
      if (paramInt1 > 0)
      {
        if (paramInt2 > 0)
        {
          this.width = paramInt1;
          this.height = paramInt2;
          return;
        }
        throw new IllegalArgumentException("Height must be > 0");
      }
      throw new IllegalArgumentException("Width must be > 0");
    }
    
    PreFillType build()
    {
      return new PreFillType(this.width, this.height, this.config, this.weight);
    }
    
    Bitmap.Config getConfig()
    {
      return this.config;
    }
    
    public Builder setConfig(@Nullable Bitmap.Config paramConfig)
    {
      this.config = paramConfig;
      return this;
    }
    
    public Builder setWeight(int paramInt)
    {
      if (paramInt > 0)
      {
        this.weight = paramInt;
        return this;
      }
      throw new IllegalArgumentException("Weight must be > 0");
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/prefill/PreFillType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */