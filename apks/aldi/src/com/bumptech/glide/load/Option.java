package com.bumptech.glide.load;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

public final class Option<T>
{
  private static final CacheKeyUpdater<Object> EMPTY_UPDATER = new CacheKeyUpdater()
  {
    public void update(@NonNull byte[] paramAnonymousArrayOfByte, @NonNull Object paramAnonymousObject, @NonNull MessageDigest paramAnonymousMessageDigest) {}
  };
  private final CacheKeyUpdater<T> cacheKeyUpdater;
  private final T defaultValue;
  private final String key;
  private volatile byte[] keyBytes;
  
  private Option(@NonNull String paramString, @Nullable T paramT, @NonNull CacheKeyUpdater<T> paramCacheKeyUpdater)
  {
    this.key = Preconditions.checkNotEmpty(paramString);
    this.defaultValue = paramT;
    this.cacheKeyUpdater = ((CacheKeyUpdater)Preconditions.checkNotNull(paramCacheKeyUpdater));
  }
  
  @NonNull
  public static <T> Option<T> disk(@NonNull String paramString, @NonNull CacheKeyUpdater<T> paramCacheKeyUpdater)
  {
    return new Option(paramString, null, paramCacheKeyUpdater);
  }
  
  @NonNull
  public static <T> Option<T> disk(@NonNull String paramString, @Nullable T paramT, @NonNull CacheKeyUpdater<T> paramCacheKeyUpdater)
  {
    return new Option(paramString, paramT, paramCacheKeyUpdater);
  }
  
  @NonNull
  private static <T> CacheKeyUpdater<T> emptyUpdater()
  {
    return EMPTY_UPDATER;
  }
  
  @NonNull
  private byte[] getKeyBytes()
  {
    if (this.keyBytes == null) {
      this.keyBytes = this.key.getBytes(Key.CHARSET);
    }
    return this.keyBytes;
  }
  
  @NonNull
  public static <T> Option<T> memory(@NonNull String paramString)
  {
    return new Option(paramString, null, emptyUpdater());
  }
  
  @NonNull
  public static <T> Option<T> memory(@NonNull String paramString, @NonNull T paramT)
  {
    return new Option(paramString, paramT, emptyUpdater());
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Option))
    {
      paramObject = (Option)paramObject;
      return this.key.equals(((Option)paramObject).key);
    }
    return false;
  }
  
  @Nullable
  public final T getDefaultValue()
  {
    return (T)this.defaultValue;
  }
  
  public final int hashCode()
  {
    return this.key.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Option{key='");
    localStringBuilder.append(this.key);
    localStringBuilder.append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public final void update(@NonNull T paramT, @NonNull MessageDigest paramMessageDigest)
  {
    this.cacheKeyUpdater.update(getKeyBytes(), paramT, paramMessageDigest);
  }
  
  public static abstract interface CacheKeyUpdater<T>
  {
    public abstract void update(@NonNull byte[] paramArrayOfByte, @NonNull T paramT, @NonNull MessageDigest paramMessageDigest);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/Option.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */