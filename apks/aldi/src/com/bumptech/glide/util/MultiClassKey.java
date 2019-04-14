package com.bumptech.glide.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class MultiClassKey
{
  private Class<?> first;
  private Class<?> second;
  private Class<?> third;
  
  public MultiClassKey() {}
  
  public MultiClassKey(@NonNull Class<?> paramClass1, @NonNull Class<?> paramClass2)
  {
    set(paramClass1, paramClass2);
  }
  
  public MultiClassKey(@NonNull Class<?> paramClass1, @NonNull Class<?> paramClass2, @Nullable Class<?> paramClass3)
  {
    set(paramClass1, paramClass2, paramClass3);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject != null)
    {
      if (getClass() != paramObject.getClass()) {
        return false;
      }
      paramObject = (MultiClassKey)paramObject;
      if (!this.first.equals(((MultiClassKey)paramObject).first)) {
        return false;
      }
      if (!this.second.equals(((MultiClassKey)paramObject).second)) {
        return false;
      }
      return Util.bothNullOrEqual(this.third, ((MultiClassKey)paramObject).third);
    }
    return false;
  }
  
  public int hashCode()
  {
    int j = this.first.hashCode();
    int k = this.second.hashCode();
    int i;
    if (this.third != null) {
      i = this.third.hashCode();
    } else {
      i = 0;
    }
    return (j * 31 + k) * 31 + i;
  }
  
  public void set(@NonNull Class<?> paramClass1, @NonNull Class<?> paramClass2)
  {
    set(paramClass1, paramClass2, null);
  }
  
  public void set(@NonNull Class<?> paramClass1, @NonNull Class<?> paramClass2, @Nullable Class<?> paramClass3)
  {
    this.first = paramClass1;
    this.second = paramClass2;
    this.third = paramClass3;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("MultiClassKey{first=");
    localStringBuilder.append(this.first);
    localStringBuilder.append(", second=");
    localStringBuilder.append(this.second);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/util/MultiClassKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */