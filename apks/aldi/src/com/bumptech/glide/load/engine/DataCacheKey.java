package com.bumptech.glide.load.engine;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

final class DataCacheKey
  implements Key
{
  private final Key signature;
  private final Key sourceKey;
  
  DataCacheKey(Key paramKey1, Key paramKey2)
  {
    this.sourceKey = paramKey1;
    this.signature = paramKey2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof DataCacheKey))
    {
      paramObject = (DataCacheKey)paramObject;
      if ((this.sourceKey.equals(((DataCacheKey)paramObject).sourceKey)) && (this.signature.equals(((DataCacheKey)paramObject).signature))) {
        return true;
      }
    }
    return false;
  }
  
  final Key getSourceKey()
  {
    return this.sourceKey;
  }
  
  public final int hashCode()
  {
    return this.sourceKey.hashCode() * 31 + this.signature.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("DataCacheKey{sourceKey=");
    localStringBuilder.append(this.sourceKey);
    localStringBuilder.append(", signature=");
    localStringBuilder.append(this.signature);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public final void updateDiskCacheKey(@NonNull MessageDigest paramMessageDigest)
  {
    this.sourceKey.updateDiskCacheKey(paramMessageDigest);
    this.signature.updateDiskCacheKey(paramMessageDigest);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/DataCacheKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */