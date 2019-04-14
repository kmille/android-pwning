package com.bumptech.glide.load.engine;

import android.support.annotation.NonNull;
import android.support.v4.util.Pools.Pool;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoadPath<Data, ResourceType, Transcode>
{
  private final Class<Data> dataClass;
  private final List<? extends DecodePath<Data, ResourceType, Transcode>> decodePaths;
  private final String failureMessage;
  private final Pools.Pool<List<Throwable>> listPool;
  
  public LoadPath(Class<Data> paramClass, Class<ResourceType> paramClass1, Class<Transcode> paramClass2, List<DecodePath<Data, ResourceType, Transcode>> paramList, Pools.Pool<List<Throwable>> paramPool)
  {
    this.dataClass = paramClass;
    this.listPool = paramPool;
    this.decodePaths = ((List)Preconditions.checkNotEmpty(paramList));
    paramList = new StringBuilder("Failed LoadPath{");
    paramList.append(paramClass.getSimpleName());
    paramList.append("->");
    paramList.append(paramClass1.getSimpleName());
    paramList.append("->");
    paramList.append(paramClass2.getSimpleName());
    paramList.append("}");
    this.failureMessage = paramList.toString();
  }
  
  private Resource<Transcode> loadWithExceptionList(DataRewinder<Data> paramDataRewinder, @NonNull Options paramOptions, int paramInt1, int paramInt2, DecodePath.DecodeCallback<ResourceType> paramDecodeCallback, List<Throwable> paramList)
    throws GlideException
  {
    int j = this.decodePaths.size();
    int i = 0;
    Object localObject1 = null;
    Object localObject3;
    for (;;)
    {
      Object localObject2 = localObject1;
      if (i >= j) {
        break;
      }
      localObject2 = (DecodePath)this.decodePaths.get(i);
      try
      {
        localObject2 = ((DecodePath)localObject2).decode(paramDataRewinder, paramInt1, paramInt2, paramOptions, paramDecodeCallback);
        localObject1 = localObject2;
      }
      catch (GlideException localGlideException)
      {
        paramList.add(localGlideException);
      }
      localObject3 = localObject1;
      if (localObject1 != null) {
        break;
      }
      i += 1;
    }
    if (localObject3 != null) {
      return (Resource<Transcode>)localObject3;
    }
    throw new GlideException(this.failureMessage, new ArrayList(paramList));
  }
  
  public Class<Data> getDataClass()
  {
    return this.dataClass;
  }
  
  public Resource<Transcode> load(DataRewinder<Data> paramDataRewinder, @NonNull Options paramOptions, int paramInt1, int paramInt2, DecodePath.DecodeCallback<ResourceType> paramDecodeCallback)
    throws GlideException
  {
    List localList = (List)Preconditions.checkNotNull(this.listPool.acquire());
    try
    {
      paramDataRewinder = loadWithExceptionList(paramDataRewinder, paramOptions, paramInt1, paramInt2, paramDecodeCallback, localList);
      return paramDataRewinder;
    }
    finally
    {
      this.listPool.release(localList);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("LoadPath{decodePaths=");
    localStringBuilder.append(Arrays.toString(this.decodePaths.toArray()));
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/LoadPath.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */