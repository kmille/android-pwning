package com.bumptech.glide.signature;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

public final class ObjectKey
  implements Key
{
  private final Object object;
  
  public ObjectKey(@NonNull Object paramObject)
  {
    this.object = Preconditions.checkNotNull(paramObject);
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof ObjectKey))
    {
      paramObject = (ObjectKey)paramObject;
      return this.object.equals(((ObjectKey)paramObject).object);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.object.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ObjectKey{object=");
    localStringBuilder.append(this.object);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public final void updateDiskCacheKey(@NonNull MessageDigest paramMessageDigest)
  {
    paramMessageDigest.update(this.object.toString().getBytes(CHARSET));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/signature/ObjectKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */