package com.bumptech.glide.provider;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.ResourceDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ResourceDecoderRegistry
{
  private final List<String> bucketPriorityList = new ArrayList();
  private final Map<String, List<Entry<?, ?>>> decoders = new HashMap();
  
  @NonNull
  private List<Entry<?, ?>> getOrAddEntryList(@NonNull String paramString)
  {
    try
    {
      if (!this.bucketPriorityList.contains(paramString)) {
        this.bucketPriorityList.add(paramString);
      }
      List localList = (List)this.decoders.get(paramString);
      Object localObject = localList;
      if (localList == null)
      {
        localObject = new ArrayList();
        this.decoders.put(paramString, localObject);
      }
      return (List<Entry<?, ?>>)localObject;
    }
    finally {}
  }
  
  public <T, R> void append(@NonNull String paramString, @NonNull ResourceDecoder<T, R> paramResourceDecoder, @NonNull Class<T> paramClass, @NonNull Class<R> paramClass1)
  {
    try
    {
      getOrAddEntryList(paramString).add(new Entry(paramClass, paramClass1, paramResourceDecoder));
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  @NonNull
  public <T, R> List<ResourceDecoder<T, R>> getDecoders(@NonNull Class<T> paramClass, @NonNull Class<R> paramClass1)
  {
    try
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = this.bucketPriorityList.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (String)localIterator.next();
        localObject = (List)this.decoders.get(localObject);
        if (localObject != null)
        {
          localObject = ((List)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            Entry localEntry = (Entry)((Iterator)localObject).next();
            if (localEntry.handles(paramClass, paramClass1)) {
              localArrayList.add(localEntry.decoder);
            }
          }
        }
      }
      return localArrayList;
    }
    finally {}
  }
  
  @NonNull
  public <T, R> List<Class<R>> getResourceClasses(@NonNull Class<T> paramClass, @NonNull Class<R> paramClass1)
  {
    try
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = this.bucketPriorityList.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (String)localIterator.next();
        localObject = (List)this.decoders.get(localObject);
        if (localObject != null)
        {
          localObject = ((List)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            Entry localEntry = (Entry)((Iterator)localObject).next();
            if ((localEntry.handles(paramClass, paramClass1)) && (!localArrayList.contains(localEntry.resourceClass))) {
              localArrayList.add(localEntry.resourceClass);
            }
          }
        }
      }
      return localArrayList;
    }
    finally {}
  }
  
  public <T, R> void prepend(@NonNull String paramString, @NonNull ResourceDecoder<T, R> paramResourceDecoder, @NonNull Class<T> paramClass, @NonNull Class<R> paramClass1)
  {
    try
    {
      getOrAddEntryList(paramString).add(0, new Entry(paramClass, paramClass1, paramResourceDecoder));
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void setBucketPriorityList(@NonNull List<String> paramList)
  {
    try
    {
      Object localObject = new ArrayList(this.bucketPriorityList);
      this.bucketPriorityList.clear();
      this.bucketPriorityList.addAll(paramList);
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        if (!paramList.contains(str)) {
          this.bucketPriorityList.add(str);
        }
      }
      return;
    }
    finally {}
  }
  
  static class Entry<T, R>
  {
    private final Class<T> dataClass;
    final ResourceDecoder<T, R> decoder;
    final Class<R> resourceClass;
    
    public Entry(@NonNull Class<T> paramClass, @NonNull Class<R> paramClass1, ResourceDecoder<T, R> paramResourceDecoder)
    {
      this.dataClass = paramClass;
      this.resourceClass = paramClass1;
      this.decoder = paramResourceDecoder;
    }
    
    public boolean handles(@NonNull Class<?> paramClass1, @NonNull Class<?> paramClass2)
    {
      return (this.dataClass.isAssignableFrom(paramClass1)) && (paramClass2.isAssignableFrom(this.resourceClass));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/provider/ResourceDecoderRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */