package com.bumptech.glide.provider;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.Encoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EncoderRegistry
{
  private final List<Entry<?>> encoders = new ArrayList();
  
  public <T> void append(@NonNull Class<T> paramClass, @NonNull Encoder<T> paramEncoder)
  {
    try
    {
      this.encoders.add(new Entry(paramClass, paramEncoder));
      return;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  @Nullable
  public <T> Encoder<T> getEncoder(@NonNull Class<T> paramClass)
  {
    try
    {
      Iterator localIterator = this.encoders.iterator();
      while (localIterator.hasNext())
      {
        Entry localEntry = (Entry)localIterator.next();
        if (localEntry.handles(paramClass))
        {
          paramClass = localEntry.encoder;
          return paramClass;
        }
      }
      return null;
    }
    finally {}
  }
  
  public <T> void prepend(@NonNull Class<T> paramClass, @NonNull Encoder<T> paramEncoder)
  {
    try
    {
      this.encoders.add(0, new Entry(paramClass, paramEncoder));
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
    private final Class<T> dataClass;
    final Encoder<T> encoder;
    
    Entry(@NonNull Class<T> paramClass, @NonNull Encoder<T> paramEncoder)
    {
      this.dataClass = paramClass;
      this.encoder = paramEncoder;
    }
    
    final boolean handles(@NonNull Class<?> paramClass)
    {
      return this.dataClass.isAssignableFrom(paramClass);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/provider/EncoderRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */