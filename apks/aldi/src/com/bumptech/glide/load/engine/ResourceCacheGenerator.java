package com.bumptech.glide.load.engine;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import java.io.File;
import java.util.List;

class ResourceCacheGenerator
  implements DataFetcher.DataCallback<Object>, DataFetcherGenerator
{
  private File cacheFile;
  private final DataFetcherGenerator.FetcherReadyCallback cb;
  private ResourceCacheKey currentKey;
  private final DecodeHelper<?> helper;
  private volatile ModelLoader.LoadData<?> loadData;
  private int modelLoaderIndex;
  private List<ModelLoader<File, ?>> modelLoaders;
  private int resourceClassIndex = -1;
  private int sourceIdIndex;
  private Key sourceKey;
  
  ResourceCacheGenerator(DecodeHelper<?> paramDecodeHelper, DataFetcherGenerator.FetcherReadyCallback paramFetcherReadyCallback)
  {
    this.helper = paramDecodeHelper;
    this.cb = paramFetcherReadyCallback;
  }
  
  private boolean hasNextModelLoader()
  {
    return this.modelLoaderIndex < this.modelLoaders.size();
  }
  
  public void cancel()
  {
    ModelLoader.LoadData localLoadData = this.loadData;
    if (localLoadData != null) {
      localLoadData.fetcher.cancel();
    }
  }
  
  public void onDataReady(Object paramObject)
  {
    this.cb.onDataFetcherReady(this.sourceKey, paramObject, this.loadData.fetcher, DataSource.RESOURCE_DISK_CACHE, this.currentKey);
  }
  
  public void onLoadFailed(@NonNull Exception paramException)
  {
    this.cb.onDataFetcherFailed(this.currentKey, paramException, this.loadData.fetcher, DataSource.RESOURCE_DISK_CACHE);
  }
  
  public boolean startNext()
  {
    List localList1 = this.helper.getCacheKeys();
    boolean bool2 = localList1.isEmpty();
    boolean bool1 = false;
    if (bool2) {
      return false;
    }
    List localList2 = this.helper.getRegisteredResourceClasses();
    if ((localList2.isEmpty()) && (File.class.equals(this.helper.getTranscodeClass()))) {
      return false;
    }
    for (;;)
    {
      if ((this.modelLoaders != null) && (hasNextModelLoader()))
      {
        this.loadData = null;
        while ((!bool1) && (hasNextModelLoader()))
        {
          localList1 = this.modelLoaders;
          int i = this.modelLoaderIndex;
          this.modelLoaderIndex = (i + 1);
          this.loadData = ((ModelLoader)localList1.get(i)).buildLoadData(this.cacheFile, this.helper.getWidth(), this.helper.getHeight(), this.helper.getOptions());
          if ((this.loadData != null) && (this.helper.hasLoadPath(this.loadData.fetcher.getDataClass())))
          {
            this.loadData.fetcher.loadData(this.helper.getPriority(), this);
            bool1 = true;
          }
        }
        return bool1;
      }
      this.resourceClassIndex += 1;
      if (this.resourceClassIndex >= localList2.size())
      {
        this.sourceIdIndex += 1;
        if (this.sourceIdIndex >= localList1.size()) {
          return false;
        }
        this.resourceClassIndex = 0;
      }
      Key localKey = (Key)localList1.get(this.sourceIdIndex);
      Class localClass = (Class)localList2.get(this.resourceClassIndex);
      Transformation localTransformation = this.helper.getTransformation(localClass);
      this.currentKey = new ResourceCacheKey(this.helper.getArrayPool(), localKey, this.helper.getSignature(), this.helper.getWidth(), this.helper.getHeight(), localTransformation, localClass, this.helper.getOptions());
      this.cacheFile = this.helper.getDiskCache().get(this.currentKey);
      if (this.cacheFile != null)
      {
        this.sourceKey = localKey;
        this.modelLoaders = this.helper.getModelLoaders(this.cacheFile);
        this.modelLoaderIndex = 0;
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/ResourceCacheGenerator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */