package com.bumptech.glide.load.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.Pools.Pool;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class MultiModelLoader<Model, Data>
  implements ModelLoader<Model, Data>
{
  private final Pools.Pool<List<Throwable>> exceptionListPool;
  private final List<ModelLoader<Model, Data>> modelLoaders;
  
  MultiModelLoader(@NonNull List<ModelLoader<Model, Data>> paramList, @NonNull Pools.Pool<List<Throwable>> paramPool)
  {
    this.modelLoaders = paramList;
    this.exceptionListPool = paramPool;
  }
  
  public ModelLoader.LoadData<Data> buildLoadData(@NonNull Model paramModel, int paramInt1, int paramInt2, @NonNull Options paramOptions)
  {
    int j = this.modelLoaders.size();
    ArrayList localArrayList = new ArrayList(j);
    int i = 0;
    Object localObject2;
    for (Object localObject1 = null; i < j; localObject1 = localObject2)
    {
      Object localObject3 = (ModelLoader)this.modelLoaders.get(i);
      localObject2 = localObject1;
      if (((ModelLoader)localObject3).handles(paramModel))
      {
        localObject3 = ((ModelLoader)localObject3).buildLoadData(paramModel, paramInt1, paramInt2, paramOptions);
        localObject2 = localObject1;
        if (localObject3 != null)
        {
          localObject2 = ((ModelLoader.LoadData)localObject3).sourceKey;
          localArrayList.add(((ModelLoader.LoadData)localObject3).fetcher);
        }
      }
      i += 1;
    }
    if ((!localArrayList.isEmpty()) && (localObject1 != null)) {
      return new ModelLoader.LoadData((Key)localObject1, new MultiFetcher(localArrayList, this.exceptionListPool));
    }
    return null;
  }
  
  public boolean handles(@NonNull Model paramModel)
  {
    Iterator localIterator = this.modelLoaders.iterator();
    while (localIterator.hasNext()) {
      if (((ModelLoader)localIterator.next()).handles(paramModel)) {
        return true;
      }
    }
    return false;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("MultiModelLoader{modelLoaders=");
    localStringBuilder.append(Arrays.toString(this.modelLoaders.toArray()));
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  static class MultiFetcher<Data>
    implements DataFetcher<Data>, DataFetcher.DataCallback<Data>
  {
    private DataFetcher.DataCallback<? super Data> callback;
    private int currentIndex;
    @Nullable
    private List<Throwable> exceptions;
    private final List<DataFetcher<Data>> fetchers;
    private Priority priority;
    private final Pools.Pool<List<Throwable>> throwableListPool;
    
    MultiFetcher(@NonNull List<DataFetcher<Data>> paramList, @NonNull Pools.Pool<List<Throwable>> paramPool)
    {
      this.throwableListPool = paramPool;
      Preconditions.checkNotEmpty(paramList);
      this.fetchers = paramList;
      this.currentIndex = 0;
    }
    
    private void startNextOrFail()
    {
      if (this.currentIndex < this.fetchers.size() - 1)
      {
        this.currentIndex += 1;
        loadData(this.priority, this.callback);
        return;
      }
      Preconditions.checkNotNull(this.exceptions);
      this.callback.onLoadFailed(new GlideException("Fetch failed", new ArrayList(this.exceptions)));
    }
    
    public void cancel()
    {
      Iterator localIterator = this.fetchers.iterator();
      while (localIterator.hasNext()) {
        ((DataFetcher)localIterator.next()).cancel();
      }
    }
    
    public void cleanup()
    {
      if (this.exceptions != null) {
        this.throwableListPool.release(this.exceptions);
      }
      this.exceptions = null;
      Iterator localIterator = this.fetchers.iterator();
      while (localIterator.hasNext()) {
        ((DataFetcher)localIterator.next()).cleanup();
      }
    }
    
    @NonNull
    public Class<Data> getDataClass()
    {
      return ((DataFetcher)this.fetchers.get(0)).getDataClass();
    }
    
    @NonNull
    public DataSource getDataSource()
    {
      return ((DataFetcher)this.fetchers.get(0)).getDataSource();
    }
    
    public void loadData(@NonNull Priority paramPriority, @NonNull DataFetcher.DataCallback<? super Data> paramDataCallback)
    {
      this.priority = paramPriority;
      this.callback = paramDataCallback;
      this.exceptions = ((List)this.throwableListPool.acquire());
      ((DataFetcher)this.fetchers.get(this.currentIndex)).loadData(paramPriority, this);
    }
    
    public void onDataReady(@Nullable Data paramData)
    {
      if (paramData != null)
      {
        this.callback.onDataReady(paramData);
        return;
      }
      startNextOrFail();
    }
    
    public void onLoadFailed(@NonNull Exception paramException)
    {
      ((List)Preconditions.checkNotNull(this.exceptions)).add(paramException);
      startNextOrFail();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/model/MultiModelLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */