package com.bumptech.glide.load;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;

public final class Options
  implements Key
{
  private final ArrayMap<Option<?>, Object> values = new CachedHashCodeArrayMap();
  
  private static <T> void updateDiskCacheKey(@NonNull Option<T> paramOption, @NonNull Object paramObject, @NonNull MessageDigest paramMessageDigest)
  {
    paramOption.update(paramObject, paramMessageDigest);
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Options))
    {
      paramObject = (Options)paramObject;
      return this.values.equals(((Options)paramObject).values);
    }
    return false;
  }
  
  @Nullable
  public final <T> T get(@NonNull Option<T> paramOption)
  {
    if (this.values.containsKey(paramOption)) {
      return (T)this.values.get(paramOption);
    }
    return (T)paramOption.getDefaultValue();
  }
  
  public final int hashCode()
  {
    return this.values.hashCode();
  }
  
  public final void putAll(@NonNull Options paramOptions)
  {
    this.values.putAll(paramOptions.values);
  }
  
  @NonNull
  public final <T> Options set(@NonNull Option<T> paramOption, @NonNull T paramT)
  {
    this.values.put(paramOption, paramT);
    return this;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Options{values=");
    localStringBuilder.append(this.values);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public final void updateDiskCacheKey(@NonNull MessageDigest paramMessageDigest)
  {
    int i = 0;
    while (i < this.values.size())
    {
      updateDiskCacheKey((Option)this.values.keyAt(i), this.values.valueAt(i), paramMessageDigest);
      i += 1;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/Options.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */