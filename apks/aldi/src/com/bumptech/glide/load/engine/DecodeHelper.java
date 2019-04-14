package com.bumptech.glide.load.engine;

import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.Registry.NoModelLoaderAvailableException;
import com.bumptech.glide.Registry.NoSourceEncoderAvailableException;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import com.bumptech.glide.load.resource.UnitTransformation;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class DecodeHelper<Transcode>
{
  private final List<Key> cacheKeys = new ArrayList();
  private DecodeJob.DiskCacheProvider diskCacheProvider;
  private DiskCacheStrategy diskCacheStrategy;
  private GlideContext glideContext;
  private int height;
  private boolean isCacheKeysSet;
  private boolean isLoadDataSet;
  private boolean isScaleOnlyOrNoTransform;
  private boolean isTransformationRequired;
  private final List<ModelLoader.LoadData<?>> loadData = new ArrayList();
  private Object model;
  private Options options;
  private Priority priority;
  private Class<?> resourceClass;
  private Key signature;
  private Class<Transcode> transcodeClass;
  private Map<Class<?>, Transformation<?>> transformations;
  private int width;
  
  final void clear()
  {
    this.glideContext = null;
    this.model = null;
    this.signature = null;
    this.resourceClass = null;
    this.transcodeClass = null;
    this.options = null;
    this.priority = null;
    this.transformations = null;
    this.diskCacheStrategy = null;
    this.loadData.clear();
    this.isLoadDataSet = false;
    this.cacheKeys.clear();
    this.isCacheKeysSet = false;
  }
  
  final ArrayPool getArrayPool()
  {
    return this.glideContext.getArrayPool();
  }
  
  final List<Key> getCacheKeys()
  {
    if (!this.isCacheKeysSet)
    {
      this.isCacheKeysSet = true;
      this.cacheKeys.clear();
      List localList = getLoadData();
      int k = localList.size();
      int i = 0;
      while (i < k)
      {
        ModelLoader.LoadData localLoadData = (ModelLoader.LoadData)localList.get(i);
        if (!this.cacheKeys.contains(localLoadData.sourceKey)) {
          this.cacheKeys.add(localLoadData.sourceKey);
        }
        int j = 0;
        while (j < localLoadData.alternateKeys.size())
        {
          if (!this.cacheKeys.contains(localLoadData.alternateKeys.get(j))) {
            this.cacheKeys.add(localLoadData.alternateKeys.get(j));
          }
          j += 1;
        }
        i += 1;
      }
    }
    return this.cacheKeys;
  }
  
  final DiskCache getDiskCache()
  {
    return this.diskCacheProvider.getDiskCache();
  }
  
  final DiskCacheStrategy getDiskCacheStrategy()
  {
    return this.diskCacheStrategy;
  }
  
  final int getHeight()
  {
    return this.height;
  }
  
  final List<ModelLoader.LoadData<?>> getLoadData()
  {
    if (!this.isLoadDataSet)
    {
      this.isLoadDataSet = true;
      this.loadData.clear();
      List localList = this.glideContext.getRegistry().getModelLoaders(this.model);
      int i = 0;
      int j = localList.size();
      while (i < j)
      {
        ModelLoader.LoadData localLoadData = ((ModelLoader)localList.get(i)).buildLoadData(this.model, this.width, this.height, this.options);
        if (localLoadData != null) {
          this.loadData.add(localLoadData);
        }
        i += 1;
      }
    }
    return this.loadData;
  }
  
  final <Data> LoadPath<Data, ?, Transcode> getLoadPath(Class<Data> paramClass)
  {
    return this.glideContext.getRegistry().getLoadPath(paramClass, this.resourceClass, this.transcodeClass);
  }
  
  final Class<?> getModelClass()
  {
    return this.model.getClass();
  }
  
  final List<ModelLoader<File, ?>> getModelLoaders(File paramFile)
    throws Registry.NoModelLoaderAvailableException
  {
    return this.glideContext.getRegistry().getModelLoaders(paramFile);
  }
  
  final Options getOptions()
  {
    return this.options;
  }
  
  final Priority getPriority()
  {
    return this.priority;
  }
  
  final List<Class<?>> getRegisteredResourceClasses()
  {
    return this.glideContext.getRegistry().getRegisteredResourceClasses(this.model.getClass(), this.resourceClass, this.transcodeClass);
  }
  
  final <Z> ResourceEncoder<Z> getResultEncoder(Resource<Z> paramResource)
  {
    return this.glideContext.getRegistry().getResultEncoder(paramResource);
  }
  
  final Key getSignature()
  {
    return this.signature;
  }
  
  final <X> Encoder<X> getSourceEncoder(X paramX)
    throws Registry.NoSourceEncoderAvailableException
  {
    return this.glideContext.getRegistry().getSourceEncoder(paramX);
  }
  
  final Class<?> getTranscodeClass()
  {
    return this.transcodeClass;
  }
  
  final <Z> Transformation<Z> getTransformation(Class<Z> paramClass)
  {
    Transformation localTransformation = (Transformation)this.transformations.get(paramClass);
    Object localObject = localTransformation;
    if (localTransformation == null)
    {
      Iterator localIterator = this.transformations.entrySet().iterator();
      do
      {
        localObject = localTransformation;
        if (!localIterator.hasNext()) {
          break;
        }
        localObject = (Map.Entry)localIterator.next();
      } while (!((Class)((Map.Entry)localObject).getKey()).isAssignableFrom(paramClass));
      localObject = (Transformation)((Map.Entry)localObject).getValue();
    }
    if (localObject == null)
    {
      if ((this.transformations.isEmpty()) && (this.isTransformationRequired))
      {
        localObject = new StringBuilder("Missing transformation for ");
        ((StringBuilder)localObject).append(paramClass);
        ((StringBuilder)localObject).append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
        throw new IllegalArgumentException(((StringBuilder)localObject).toString());
      }
      return UnitTransformation.get();
    }
    return (Transformation<Z>)localObject;
  }
  
  final int getWidth()
  {
    return this.width;
  }
  
  final boolean hasLoadPath(Class<?> paramClass)
  {
    return getLoadPath(paramClass) != null;
  }
  
  final <R> void init(GlideContext paramGlideContext, Object paramObject, Key paramKey, int paramInt1, int paramInt2, DiskCacheStrategy paramDiskCacheStrategy, Class<?> paramClass, Class<R> paramClass1, Priority paramPriority, Options paramOptions, Map<Class<?>, Transformation<?>> paramMap, boolean paramBoolean1, boolean paramBoolean2, DecodeJob.DiskCacheProvider paramDiskCacheProvider)
  {
    this.glideContext = paramGlideContext;
    this.model = paramObject;
    this.signature = paramKey;
    this.width = paramInt1;
    this.height = paramInt2;
    this.diskCacheStrategy = paramDiskCacheStrategy;
    this.resourceClass = paramClass;
    this.diskCacheProvider = paramDiskCacheProvider;
    this.transcodeClass = paramClass1;
    this.priority = paramPriority;
    this.options = paramOptions;
    this.transformations = paramMap;
    this.isTransformationRequired = paramBoolean1;
    this.isScaleOnlyOrNoTransform = paramBoolean2;
  }
  
  final boolean isResourceEncoderAvailable(Resource<?> paramResource)
  {
    return this.glideContext.getRegistry().isResourceEncoderAvailable(paramResource);
  }
  
  final boolean isScaleOnlyOrNoTransform()
  {
    return this.isScaleOnlyOrNoTransform;
  }
  
  final boolean isSourceKey(Key paramKey)
  {
    List localList = getLoadData();
    int j = localList.size();
    int i = 0;
    while (i < j)
    {
      if (((ModelLoader.LoadData)localList.get(i)).sourceKey.equals(paramKey)) {
        return true;
      }
      i += 1;
    }
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/DecodeHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */