package com.bumptech.glide.load;

import android.content.Context;
import android.support.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MultiTransformation<T>
  implements Transformation<T>
{
  private final Collection<? extends Transformation<T>> transformations;
  
  public MultiTransformation(@NonNull Collection<? extends Transformation<T>> paramCollection)
  {
    if (!paramCollection.isEmpty())
    {
      this.transformations = paramCollection;
      return;
    }
    throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
  }
  
  @SafeVarargs
  public MultiTransformation(@NonNull Transformation<T>... paramVarArgs)
  {
    if (paramVarArgs.length != 0)
    {
      this.transformations = Arrays.asList(paramVarArgs);
      return;
    }
    throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof MultiTransformation))
    {
      paramObject = (MultiTransformation)paramObject;
      return this.transformations.equals(((MultiTransformation)paramObject).transformations);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.transformations.hashCode();
  }
  
  @NonNull
  public Resource<T> transform(@NonNull Context paramContext, @NonNull Resource<T> paramResource, int paramInt1, int paramInt2)
  {
    Iterator localIterator = this.transformations.iterator();
    Resource localResource;
    for (Object localObject = paramResource; localIterator.hasNext(); localObject = localResource)
    {
      localResource = ((Transformation)localIterator.next()).transform(paramContext, (Resource)localObject, paramInt1, paramInt2);
      if ((localObject != null) && (!localObject.equals(paramResource)) && (!localObject.equals(localResource))) {
        ((Resource)localObject).recycle();
      }
    }
    return (Resource<T>)localObject;
  }
  
  public void updateDiskCacheKey(@NonNull MessageDigest paramMessageDigest)
  {
    Iterator localIterator = this.transformations.iterator();
    while (localIterator.hasNext()) {
      ((Transformation)localIterator.next()).updateDiskCacheKey(paramMessageDigest);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/MultiTransformation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */