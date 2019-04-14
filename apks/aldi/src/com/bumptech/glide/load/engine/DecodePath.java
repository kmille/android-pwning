package com.bumptech.glide.load.engine;

import android.support.annotation.NonNull;
import android.support.v4.util.Pools.Pool;
import android.util.Log;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DecodePath<DataType, ResourceType, Transcode>
{
  private static final String TAG = "DecodePath";
  private final Class<DataType> dataClass;
  private final List<? extends ResourceDecoder<DataType, ResourceType>> decoders;
  private final String failureMessage;
  private final Pools.Pool<List<Throwable>> listPool;
  private final ResourceTranscoder<ResourceType, Transcode> transcoder;
  
  public DecodePath(Class<DataType> paramClass, Class<ResourceType> paramClass1, Class<Transcode> paramClass2, List<? extends ResourceDecoder<DataType, ResourceType>> paramList, ResourceTranscoder<ResourceType, Transcode> paramResourceTranscoder, Pools.Pool<List<Throwable>> paramPool)
  {
    this.dataClass = paramClass;
    this.decoders = paramList;
    this.transcoder = paramResourceTranscoder;
    this.listPool = paramPool;
    paramList = new StringBuilder("Failed DecodePath{");
    paramList.append(paramClass.getSimpleName());
    paramList.append("->");
    paramList.append(paramClass1.getSimpleName());
    paramList.append("->");
    paramList.append(paramClass2.getSimpleName());
    paramList.append("}");
    this.failureMessage = paramList.toString();
  }
  
  @NonNull
  private Resource<ResourceType> decodeResource(DataRewinder<DataType> paramDataRewinder, int paramInt1, int paramInt2, @NonNull Options paramOptions)
    throws GlideException
  {
    List localList = (List)Preconditions.checkNotNull(this.listPool.acquire());
    try
    {
      paramDataRewinder = decodeResourceWithList(paramDataRewinder, paramInt1, paramInt2, paramOptions, localList);
      return paramDataRewinder;
    }
    finally
    {
      this.listPool.release(localList);
    }
  }
  
  @NonNull
  private Resource<ResourceType> decodeResourceWithList(DataRewinder<DataType> paramDataRewinder, int paramInt1, int paramInt2, @NonNull Options paramOptions, List<Throwable> paramList)
    throws GlideException
  {
    int j = this.decoders.size();
    Object localObject1 = null;
    int i = 0;
    Object localObject4;
    for (;;)
    {
      localObject4 = localObject1;
      if (i >= j) {
        break;
      }
      localObject4 = (ResourceDecoder)this.decoders.get(i);
      Object localObject2 = localObject1;
      Object localObject3;
      try
      {
        if (((ResourceDecoder)localObject4).handles(paramDataRewinder.rewindAndGet(), paramOptions)) {
          localObject2 = ((ResourceDecoder)localObject4).decode(paramDataRewinder.rewindAndGet(), paramInt1, paramInt2, paramOptions);
        }
      }
      catch (IOException|RuntimeException|OutOfMemoryError localIOException)
      {
        if (Log.isLoggable("DecodePath", 2)) {
          new StringBuilder("Failed to decode data for ").append(localObject4);
        }
        paramList.add(localIOException);
        localObject3 = localObject1;
      }
      localObject4 = localObject3;
      if (localObject3 != null) {
        break;
      }
      i += 1;
      localObject1 = localObject3;
    }
    if (localObject4 != null) {
      return (Resource<ResourceType>)localObject4;
    }
    throw new GlideException(this.failureMessage, new ArrayList(paramList));
  }
  
  public Resource<Transcode> decode(DataRewinder<DataType> paramDataRewinder, int paramInt1, int paramInt2, @NonNull Options paramOptions, DecodeCallback<ResourceType> paramDecodeCallback)
    throws GlideException
  {
    paramDataRewinder = paramDecodeCallback.onResourceDecoded(decodeResource(paramDataRewinder, paramInt1, paramInt2, paramOptions));
    return this.transcoder.transcode(paramDataRewinder, paramOptions);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("DecodePath{ dataClass=");
    localStringBuilder.append(this.dataClass);
    localStringBuilder.append(", decoders=");
    localStringBuilder.append(this.decoders);
    localStringBuilder.append(", transcoder=");
    localStringBuilder.append(this.transcoder);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  static abstract interface DecodeCallback<ResourceType>
  {
    @NonNull
    public abstract Resource<ResourceType> onResourceDecoded(@NonNull Resource<ResourceType> paramResource);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/DecodePath.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */