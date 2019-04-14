package com.bumptech.glide.load.engine;

import android.support.annotation.NonNull;
import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskCache.Writer;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import com.bumptech.glide.util.LogTime;
import java.util.Collections;
import java.util.List;

class SourceGenerator
  implements DataFetcher.DataCallback<Object>, DataFetcherGenerator, DataFetcherGenerator.FetcherReadyCallback
{
  private static final String TAG = "SourceGenerator";
  private final DataFetcherGenerator.FetcherReadyCallback cb;
  private Object dataToCache;
  private final DecodeHelper<?> helper;
  private volatile ModelLoader.LoadData<?> loadData;
  private int loadDataListIndex;
  private DataCacheKey originalKey;
  private DataCacheGenerator sourceCacheGenerator;
  
  SourceGenerator(DecodeHelper<?> paramDecodeHelper, DataFetcherGenerator.FetcherReadyCallback paramFetcherReadyCallback)
  {
    this.helper = paramDecodeHelper;
    this.cb = paramFetcherReadyCallback;
  }
  
  private void cacheData(Object paramObject)
  {
    long l = LogTime.getLogTime();
    try
    {
      Encoder localEncoder = this.helper.getSourceEncoder(paramObject);
      Object localObject = new DataCacheWriter(localEncoder, paramObject, this.helper.getOptions());
      this.originalKey = new DataCacheKey(this.loadData.sourceKey, this.helper.getSignature());
      this.helper.getDiskCache().put(this.originalKey, (DiskCache.Writer)localObject);
      if (Log.isLoggable("SourceGenerator", 2))
      {
        localObject = new StringBuilder("Finished encoding source to cache, key: ");
        ((StringBuilder)localObject).append(this.originalKey);
        ((StringBuilder)localObject).append(", data: ");
        ((StringBuilder)localObject).append(paramObject);
        ((StringBuilder)localObject).append(", encoder: ");
        ((StringBuilder)localObject).append(localEncoder);
        ((StringBuilder)localObject).append(", duration: ");
        ((StringBuilder)localObject).append(LogTime.getElapsedMillis(l));
      }
      this.loadData.fetcher.cleanup();
      this.sourceCacheGenerator = new DataCacheGenerator(Collections.singletonList(this.loadData.sourceKey), this.helper, this);
      return;
    }
    finally
    {
      this.loadData.fetcher.cleanup();
    }
  }
  
  private boolean hasNextModelLoader()
  {
    return this.loadDataListIndex < this.helper.getLoadData().size();
  }
  
  public void cancel()
  {
    ModelLoader.LoadData localLoadData = this.loadData;
    if (localLoadData != null) {
      localLoadData.fetcher.cancel();
    }
  }
  
  public void onDataFetcherFailed(Key paramKey, Exception paramException, DataFetcher<?> paramDataFetcher, DataSource paramDataSource)
  {
    this.cb.onDataFetcherFailed(paramKey, paramException, paramDataFetcher, this.loadData.fetcher.getDataSource());
  }
  
  public void onDataFetcherReady(Key paramKey1, Object paramObject, DataFetcher<?> paramDataFetcher, DataSource paramDataSource, Key paramKey2)
  {
    this.cb.onDataFetcherReady(paramKey1, paramObject, paramDataFetcher, this.loadData.fetcher.getDataSource(), paramKey1);
  }
  
  public void onDataReady(Object paramObject)
  {
    DiskCacheStrategy localDiskCacheStrategy = this.helper.getDiskCacheStrategy();
    if ((paramObject != null) && (localDiskCacheStrategy.isDataCacheable(this.loadData.fetcher.getDataSource())))
    {
      this.dataToCache = paramObject;
      this.cb.reschedule();
      return;
    }
    this.cb.onDataFetcherReady(this.loadData.sourceKey, paramObject, this.loadData.fetcher, this.loadData.fetcher.getDataSource(), this.originalKey);
  }
  
  public void onLoadFailed(@NonNull Exception paramException)
  {
    this.cb.onDataFetcherFailed(this.originalKey, paramException, this.loadData.fetcher, this.loadData.fetcher.getDataSource());
  }
  
  public void reschedule()
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean startNext()
  {
    Object localObject;
    if (this.dataToCache != null)
    {
      localObject = this.dataToCache;
      this.dataToCache = null;
      cacheData(localObject);
    }
    if ((this.sourceCacheGenerator != null) && (this.sourceCacheGenerator.startNext())) {
      return true;
    }
    this.sourceCacheGenerator = null;
    this.loadData = null;
    for (boolean bool = false; (!bool) && (hasNextModelLoader()); bool = true)
    {
      label53:
      localObject = this.helper.getLoadData();
      int i = this.loadDataListIndex;
      this.loadDataListIndex = (i + 1);
      this.loadData = ((ModelLoader.LoadData)((List)localObject).get(i));
      if ((this.loadData == null) || ((!this.helper.getDiskCacheStrategy().isDataCacheable(this.loadData.fetcher.getDataSource())) && (!this.helper.hasLoadPath(this.loadData.fetcher.getDataClass())))) {
        break label53;
      }
      this.loadData.fetcher.loadData(this.helper.getPriority(), this);
    }
    return bool;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/SourceGenerator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */