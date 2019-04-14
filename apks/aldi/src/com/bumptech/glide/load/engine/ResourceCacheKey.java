package com.bumptech.glide.load.engine;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class ResourceCacheKey
  implements Key
{
  private static final LruCache<Class<?>, byte[]> RESOURCE_CLASS_BYTES = new LruCache(50L);
  private final ArrayPool arrayPool;
  private final Class<?> decodedResourceClass;
  private final int height;
  private final Options options;
  private final Key signature;
  private final Key sourceKey;
  private final Transformation<?> transformation;
  private final int width;
  
  ResourceCacheKey(ArrayPool paramArrayPool, Key paramKey1, Key paramKey2, int paramInt1, int paramInt2, Transformation<?> paramTransformation, Class<?> paramClass, Options paramOptions)
  {
    this.arrayPool = paramArrayPool;
    this.sourceKey = paramKey1;
    this.signature = paramKey2;
    this.width = paramInt1;
    this.height = paramInt2;
    this.transformation = paramTransformation;
    this.decodedResourceClass = paramClass;
    this.options = paramOptions;
  }
  
  private byte[] getResourceClassBytes()
  {
    byte[] arrayOfByte2 = (byte[])RESOURCE_CLASS_BYTES.get(this.decodedResourceClass);
    byte[] arrayOfByte1 = arrayOfByte2;
    if (arrayOfByte2 == null)
    {
      arrayOfByte1 = this.decodedResourceClass.getName().getBytes(CHARSET);
      RESOURCE_CLASS_BYTES.put(this.decodedResourceClass, arrayOfByte1);
    }
    return arrayOfByte1;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof ResourceCacheKey))
    {
      paramObject = (ResourceCacheKey)paramObject;
      if ((this.height == ((ResourceCacheKey)paramObject).height) && (this.width == ((ResourceCacheKey)paramObject).width) && (Util.bothNullOrEqual(this.transformation, ((ResourceCacheKey)paramObject).transformation)) && (this.decodedResourceClass.equals(((ResourceCacheKey)paramObject).decodedResourceClass)) && (this.sourceKey.equals(((ResourceCacheKey)paramObject).sourceKey)) && (this.signature.equals(((ResourceCacheKey)paramObject).signature)) && (this.options.equals(((ResourceCacheKey)paramObject).options))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int j = ((this.sourceKey.hashCode() * 31 + this.signature.hashCode()) * 31 + this.width) * 31 + this.height;
    int i = j;
    if (this.transformation != null) {
      i = j * 31 + this.transformation.hashCode();
    }
    return (i * 31 + this.decodedResourceClass.hashCode()) * 31 + this.options.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ResourceCacheKey{sourceKey=");
    localStringBuilder.append(this.sourceKey);
    localStringBuilder.append(", signature=");
    localStringBuilder.append(this.signature);
    localStringBuilder.append(", width=");
    localStringBuilder.append(this.width);
    localStringBuilder.append(", height=");
    localStringBuilder.append(this.height);
    localStringBuilder.append(", decodedResourceClass=");
    localStringBuilder.append(this.decodedResourceClass);
    localStringBuilder.append(", transformation='");
    localStringBuilder.append(this.transformation);
    localStringBuilder.append('\'');
    localStringBuilder.append(", options=");
    localStringBuilder.append(this.options);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public final void updateDiskCacheKey(@NonNull MessageDigest paramMessageDigest)
  {
    byte[] arrayOfByte = (byte[])this.arrayPool.getExact(8, byte[].class);
    ByteBuffer.wrap(arrayOfByte).putInt(this.width).putInt(this.height).array();
    this.signature.updateDiskCacheKey(paramMessageDigest);
    this.sourceKey.updateDiskCacheKey(paramMessageDigest);
    paramMessageDigest.update(arrayOfByte);
    if (this.transformation != null) {
      this.transformation.updateDiskCacheKey(paramMessageDigest);
    }
    this.options.updateDiskCacheKey(paramMessageDigest);
    paramMessageDigest.update(getResourceClassBytes());
    this.arrayPool.put(arrayOfByte);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/ResourceCacheKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */