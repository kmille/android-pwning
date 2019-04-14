package com.bumptech.glide.load.engine;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import java.io.File;
import java.util.List;

class DataCacheGenerator
  implements DataFetcher.DataCallback<Object>, DataFetcherGenerator
{
  private File cacheFile;
  private final List<Key> cacheKeys;
  private final DataFetcherGenerator.FetcherReadyCallback cb;
  private final DecodeHelper<?> helper;
  private volatile ModelLoader.LoadData<?> loadData;
  private int modelLoaderIndex;
  private List<ModelLoader<File, ?>> modelLoaders;
  private int sourceIdIndex = -1;
  private Key sourceKey;
  
  DataCacheGenerator(DecodeHelper<?> paramDecodeHelper, DataFetcherGenerator.FetcherReadyCallback paramFetcherReadyCallback)
  {
    this(paramDecodeHelper.getCacheKeys(), paramDecodeHelper, paramFetcherReadyCallback);
  }
  
  DataCacheGenerator(List<Key> paramList, DecodeHelper<?> paramDecodeHelper, DataFetcherGenerator.FetcherReadyCallback paramFetcherReadyCallback)
  {
    this.cacheKeys = paramList;
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
    this.cb.onDataFetcherReady(this.sourceKey, paramObject, this.loadData.fetcher, DataSource.DATA_DISK_CACHE, this.sourceKey);
  }
  
  public void onLoadFailed(@NonNull Exception paramException)
  {
    this.cb.onDataFetcherFailed(this.sourceKey, paramException, this.loadData.fetcher, DataSource.DATA_DISK_CACHE);
  }
  
  public boolean startNext()
  {
    for (;;)
    {
      Object localObject = this.modelLoaders;
      boolean bool = false;
      if ((localObject != null) && (hasNextModelLoader()))
      {
        this.loadData = null;
        while ((!bool) && (hasNextModelLoader()))
        {
          localObject = this.modelLoaders;
          int i = this.modelLoaderIndex;
          this.modelLoaderIndex = (i + 1);
          this.loadData = ((ModelLoader)((List)localObject).get(i)).buildLoadData(this.cacheFile, this.helper.getWidth(), this.helper.getHeight(), this.helper.getOptions());
          if ((this.loadData != null) && (this.helper.hasLoadPath(this.loadData.fetcher.getDataClass())))
          {
            this.loadData.fetcher.loadData(this.helper.getPriority(), this);
            bool = true;
          }
        }
        return bool;
      }
      this.sourceIdIndex += 1;
      if (this.sourceIdIndex >= this.cacheKeys.size()) {
        return false;
      }
      localObject = (Key)this.cacheKeys.get(this.sourceIdIndex);
      DataCacheKey localDataCacheKey = new DataCacheKey((Key)localObject, this.helper.getSignature());
      this.cacheFile = this.helper.getDiskCache().get(localDataCacheKey);
      if (this.cacheFile != null)
      {
        this.sourceKey = ((Key)localObject);
        this.modelLoaders = this.helper.getModelLoaders(this.cacheFile);
        this.modelLoaderIndex = 0;
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/DataCacheGenerator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */