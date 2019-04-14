package com.bumptech.glide.load.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.Pools.Pool;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ModelLoaderRegistry
{
  private final ModelLoaderCache cache = new ModelLoaderCache();
  private final MultiModelLoaderFactory multiModelLoaderFactory;
  
  public ModelLoaderRegistry(@NonNull Pools.Pool<List<Throwable>> paramPool)
  {
    this(new MultiModelLoaderFactory(paramPool));
  }
  
  private ModelLoaderRegistry(@NonNull MultiModelLoaderFactory paramMultiModelLoaderFactory)
  {
    this.multiModelLoaderFactory = paramMultiModelLoaderFactory;
  }
  
  @NonNull
  private static <A> Class<A> getClass(@NonNull A paramA)
  {
    return paramA.getClass();
  }
  
  @NonNull
  private <A> List<ModelLoader<A, ?>> getModelLoadersForClass(@NonNull Class<A> paramClass)
  {
    try
    {
      List localList2 = this.cache.get(paramClass);
      List localList1 = localList2;
      if (localList2 == null)
      {
        localList1 = Collections.unmodifiableList(this.multiModelLoaderFactory.build(paramClass));
        this.cache.put(paramClass, localList1);
      }
      return localList1;
    }
    finally {}
  }
  
  private <Model, Data> void tearDown(@NonNull List<ModelLoaderFactory<? extends Model, ? extends Data>> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      ((ModelLoaderFactory)paramList.next()).teardown();
    }
  }
  
  public <Model, Data> void append(@NonNull Class<Model> paramClass, @NonNull Class<Data> paramClass1, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> paramModelLoaderFactory)
  {
    try
    {
      this.multiModelLoaderFactory.append(paramClass, paramClass1, paramModelLoaderFactory);
      this.cache.clear();
      return;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  public <Model, Data> ModelLoader<Model, Data> build(@NonNull Class<Model> paramClass, @NonNull Class<Data> paramClass1)
  {
    try
    {
      paramClass = this.multiModelLoaderFactory.build(paramClass, paramClass1);
      return paramClass;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  @NonNull
  public List<Class<?>> getDataClasses(@NonNull Class<?> paramClass)
  {
    try
    {
      paramClass = this.multiModelLoaderFactory.getDataClasses(paramClass);
      return paramClass;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  @NonNull
  public <A> List<ModelLoader<A, ?>> getModelLoaders(@NonNull A paramA)
  {
    List localList = getModelLoadersForClass(getClass(paramA));
    int m = localList.size();
    Object localObject1 = Collections.emptyList();
    int k = 0;
    int j;
    for (int i = 1; k < m; i = j)
    {
      ModelLoader localModelLoader = (ModelLoader)localList.get(k);
      Object localObject2 = localObject1;
      j = i;
      if (localModelLoader.handles(paramA))
      {
        j = i;
        if (i != 0)
        {
          localObject1 = new ArrayList(m - k);
          j = 0;
        }
        ((List)localObject1).add(localModelLoader);
        localObject2 = localObject1;
      }
      k += 1;
      localObject1 = localObject2;
    }
    return (List<ModelLoader<A, ?>>)localObject1;
  }
  
  public <Model, Data> void prepend(@NonNull Class<Model> paramClass, @NonNull Class<Data> paramClass1, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> paramModelLoaderFactory)
  {
    try
    {
      this.multiModelLoaderFactory.prepend(paramClass, paramClass1, paramModelLoaderFactory);
      this.cache.clear();
      return;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  public <Model, Data> void remove(@NonNull Class<Model> paramClass, @NonNull Class<Data> paramClass1)
  {
    try
    {
      tearDown(this.multiModelLoaderFactory.remove(paramClass, paramClass1));
      this.cache.clear();
      return;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  public <Model, Data> void replace(@NonNull Class<Model> paramClass, @NonNull Class<Data> paramClass1, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> paramModelLoaderFactory)
  {
    try
    {
      tearDown(this.multiModelLoaderFactory.replace(paramClass, paramClass1, paramModelLoaderFactory));
      this.cache.clear();
      return;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  static class ModelLoaderCache
  {
    private final Map<Class<?>, Entry<?>> cachedModelLoaders = new HashMap();
    
    public void clear()
    {
      this.cachedModelLoaders.clear();
    }
    
    @Nullable
    public <Model> List<ModelLoader<Model, ?>> get(Class<Model> paramClass)
    {
      paramClass = (Entry)this.cachedModelLoaders.get(paramClass);
      if (paramClass == null) {
        return null;
      }
      return paramClass.loaders;
    }
    
    public <Model> void put(Class<Model> paramClass, List<ModelLoader<Model, ?>> paramList)
    {
      if ((Entry)this.cachedModelLoaders.put(paramClass, new Entry(paramList)) == null) {
        return;
      }
      throw new IllegalStateException("Already cached loaders for model: ".concat(String.valueOf(paramClass)));
    }
    
    static class Entry<Model>
    {
      final List<ModelLoader<Model, ?>> loaders;
      
      public Entry(List<ModelLoader<Model, ?>> paramList)
      {
        this.loaders = paramList;
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/model/ModelLoaderRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */