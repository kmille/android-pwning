package com.bumptech.glide.provider;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.ResourceEncoder;
import java.util.ArrayList;
import java.util.List;

public class ResourceEncoderRegistry
{
  private final List<Entry<?>> encoders = new ArrayList();
  
  public <Z> void append(@NonNull Class<Z> paramClass, @NonNull ResourceEncoder<Z> paramResourceEncoder)
  {
    try
    {
      this.encoders.add(new Entry(paramClass, paramResourceEncoder));
      return;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  @Nullable
  public <Z> ResourceEncoder<Z> get(@NonNull Class<Z> paramClass)
  {
    int i = 0;
    try
    {
      int j = this.encoders.size();
      while (i < j)
      {
        Entry localEntry = (Entry)this.encoders.get(i);
        if (localEntry.handles(paramClass))
        {
          paramClass = localEntry.encoder;
          return paramClass;
        }
        i += 1;
      }
      return null;
    }
    finally {}
  }
  
  public <Z> void prepend(@NonNull Class<Z> paramClass, @NonNull ResourceEncoder<Z> paramResourceEncoder)
  {
    try
    {
      this.encoders.add(0, new Entry(paramClass, paramResourceEncoder));
      return;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  static final class Entry<T>
  {
    final ResourceEncoder<T> encoder;
    private final Class<T> resourceClass;
    
    Entry(@NonNull Class<T> paramClass, @NonNull ResourceEncoder<T> paramResourceEncoder)
    {
      this.resourceClass = paramClass;
      this.encoder = paramResourceEncoder;
    }
    
    final boolean handles(@NonNull Class<?> paramClass)
    {
      return this.resourceClass.isAssignableFrom(paramClass);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/provider/ResourceEncoderRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */