package com.bumptech.glide.load.engine;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;
import java.util.Map;

class EngineKey
  implements Key
{
  private int hashCode;
  private final int height;
  private final Object model;
  private final Options options;
  private final Class<?> resourceClass;
  private final Key signature;
  private final Class<?> transcodeClass;
  private final Map<Class<?>, Transformation<?>> transformations;
  private final int width;
  
  EngineKey(Object paramObject, Key paramKey, int paramInt1, int paramInt2, Map<Class<?>, Transformation<?>> paramMap, Class<?> paramClass1, Class<?> paramClass2, Options paramOptions)
  {
    this.model = Preconditions.checkNotNull(paramObject);
    this.signature = ((Key)Preconditions.checkNotNull(paramKey, "Signature must not be null"));
    this.width = paramInt1;
    this.height = paramInt2;
    this.transformations = ((Map)Preconditions.checkNotNull(paramMap));
    this.resourceClass = ((Class)Preconditions.checkNotNull(paramClass1, "Resource class must not be null"));
    this.transcodeClass = ((Class)Preconditions.checkNotNull(paramClass2, "Transcode class must not be null"));
    this.options = ((Options)Preconditions.checkNotNull(paramOptions));
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof EngineKey))
    {
      paramObject = (EngineKey)paramObject;
      if ((this.model.equals(((EngineKey)paramObject).model)) && (this.signature.equals(((EngineKey)paramObject).signature)) && (this.height == ((EngineKey)paramObject).height) && (this.width == ((EngineKey)paramObject).width) && (this.transformations.equals(((EngineKey)paramObject).transformations)) && (this.resourceClass.equals(((EngineKey)paramObject).resourceClass)) && (this.transcodeClass.equals(((EngineKey)paramObject).transcodeClass)) && (this.options.equals(((EngineKey)paramObject).options))) {
        return true;
      }
    }
    return false;
  }
  
  public int hashCode()
  {
    if (this.hashCode == 0)
    {
      this.hashCode = this.model.hashCode();
      this.hashCode = (this.hashCode * 31 + this.signature.hashCode());
      this.hashCode = (this.hashCode * 31 + this.width);
      this.hashCode = (this.hashCode * 31 + this.height);
      this.hashCode = (this.hashCode * 31 + this.transformations.hashCode());
      this.hashCode = (this.hashCode * 31 + this.resourceClass.hashCode());
      this.hashCode = (this.hashCode * 31 + this.transcodeClass.hashCode());
      this.hashCode = (this.hashCode * 31 + this.options.hashCode());
    }
    return this.hashCode;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("EngineKey{model=");
    localStringBuilder.append(this.model);
    localStringBuilder.append(", width=");
    localStringBuilder.append(this.width);
    localStringBuilder.append(", height=");
    localStringBuilder.append(this.height);
    localStringBuilder.append(", resourceClass=");
    localStringBuilder.append(this.resourceClass);
    localStringBuilder.append(", transcodeClass=");
    localStringBuilder.append(this.transcodeClass);
    localStringBuilder.append(", signature=");
    localStringBuilder.append(this.signature);
    localStringBuilder.append(", hashCode=");
    localStringBuilder.append(this.hashCode);
    localStringBuilder.append(", transformations=");
    localStringBuilder.append(this.transformations);
    localStringBuilder.append(", options=");
    localStringBuilder.append(this.options);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void updateDiskCacheKey(@NonNull MessageDigest paramMessageDigest)
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/EngineKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */