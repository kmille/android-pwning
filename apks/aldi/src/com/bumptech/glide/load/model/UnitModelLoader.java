package com.bumptech.glide.load.model;

import android.support.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.signature.ObjectKey;

public class UnitModelLoader<Model>
  implements ModelLoader<Model, Model>
{
  private static final UnitModelLoader<?> INSTANCE = new UnitModelLoader();
  
  public static <T> UnitModelLoader<T> getInstance()
  {
    return INSTANCE;
  }
  
  public ModelLoader.LoadData<Model> buildLoadData(@NonNull Model paramModel, int paramInt1, int paramInt2, @NonNull Options paramOptions)
  {
    return new ModelLoader.LoadData(new ObjectKey(paramModel), new UnitFetcher(paramModel));
  }
  
  public boolean handles(@NonNull Model paramModel)
  {
    return true;
  }
  
  public static class Factory<Model>
    implements ModelLoaderFactory<Model, Model>
  {
    private static final Factory<?> FACTORY = new Factory();
    
    public static <T> Factory<T> getInstance()
    {
      return FACTORY;
    }
    
    @NonNull
    public ModelLoader<Model, Model> build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
    {
      return UnitModelLoader.getInstance();
    }
    
    public void teardown() {}
  }
  
  static class UnitFetcher<Model>
    implements DataFetcher<Model>
  {
    private final Model resource;
    
    UnitFetcher(Model paramModel)
    {
      this.resource = paramModel;
    }
    
    public void cancel() {}
    
    public void cleanup() {}
    
    @NonNull
    public Class<Model> getDataClass()
    {
      return this.resource.getClass();
    }
    
    @NonNull
    public DataSource getDataSource()
    {
      return DataSource.LOCAL;
    }
    
    public void loadData(@NonNull Priority paramPriority, @NonNull DataFetcher.DataCallback<? super Model> paramDataCallback)
    {
      paramDataCallback.onDataReady(this.resource);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/model/UnitModelLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */