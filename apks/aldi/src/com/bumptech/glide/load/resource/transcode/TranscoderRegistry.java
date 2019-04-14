package com.bumptech.glide.load.resource.transcode;

import android.support.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TranscoderRegistry
{
  private final List<Entry<?, ?>> transcoders = new ArrayList();
  
  @NonNull
  public <Z, R> ResourceTranscoder<Z, R> get(@NonNull Class<Z> paramClass, @NonNull Class<R> paramClass1)
  {
    try
    {
      if (paramClass1.isAssignableFrom(paramClass))
      {
        paramClass = UnitTranscoder.get();
        return paramClass;
      }
      Object localObject = this.transcoders.iterator();
      while (((Iterator)localObject).hasNext())
      {
        Entry localEntry = (Entry)((Iterator)localObject).next();
        if (localEntry.handles(paramClass, paramClass1))
        {
          paramClass = localEntry.transcoder;
          return paramClass;
        }
      }
      localObject = new StringBuilder("No transcoder registered to transcode from ");
      ((StringBuilder)localObject).append(paramClass);
      ((StringBuilder)localObject).append(" to ");
      ((StringBuilder)localObject).append(paramClass1);
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    finally {}
  }
  
  @NonNull
  public <Z, R> List<Class<R>> getTranscodeClasses(@NonNull Class<Z> paramClass, @NonNull Class<R> paramClass1)
  {
    try
    {
      ArrayList localArrayList = new ArrayList();
      if (paramClass1.isAssignableFrom(paramClass))
      {
        localArrayList.add(paramClass1);
        return localArrayList;
      }
      Iterator localIterator = this.transcoders.iterator();
      while (localIterator.hasNext()) {
        if (((Entry)localIterator.next()).handles(paramClass, paramClass1)) {
          localArrayList.add(paramClass1);
        }
      }
      return localArrayList;
    }
    finally {}
  }
  
  public <Z, R> void register(@NonNull Class<Z> paramClass, @NonNull Class<R> paramClass1, @NonNull ResourceTranscoder<Z, R> paramResourceTranscoder)
  {
    try
    {
      this.transcoders.add(new Entry(paramClass, paramClass1, paramResourceTranscoder));
      return;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  static final class Entry<Z, R>
  {
    private final Class<Z> fromClass;
    private final Class<R> toClass;
    final ResourceTranscoder<Z, R> transcoder;
    
    Entry(@NonNull Class<Z> paramClass, @NonNull Class<R> paramClass1, @NonNull ResourceTranscoder<Z, R> paramResourceTranscoder)
    {
      this.fromClass = paramClass;
      this.toClass = paramClass1;
      this.transcoder = paramResourceTranscoder;
    }
    
    public final boolean handles(@NonNull Class<?> paramClass1, @NonNull Class<?> paramClass2)
    {
      return (this.fromClass.isAssignableFrom(paramClass1)) && (paramClass2.isAssignableFrom(this.toClass));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/transcode/TranscoderRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */