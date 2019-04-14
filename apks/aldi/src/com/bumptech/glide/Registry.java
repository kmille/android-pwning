package com.bumptech.glide;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.Pools.Pool;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.data.DataRewinder.Factory;
import com.bumptech.glide.load.data.DataRewinderRegistry;
import com.bumptech.glide.load.engine.DecodePath;
import com.bumptech.glide.load.engine.LoadPath;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.ModelLoaderRegistry;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.load.resource.transcode.TranscoderRegistry;
import com.bumptech.glide.provider.EncoderRegistry;
import com.bumptech.glide.provider.ImageHeaderParserRegistry;
import com.bumptech.glide.provider.LoadPathCache;
import com.bumptech.glide.provider.ModelToResourceClassCache;
import com.bumptech.glide.provider.ResourceDecoderRegistry;
import com.bumptech.glide.provider.ResourceEncoderRegistry;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Registry
{
  private static final String BUCKET_APPEND_ALL = "legacy_append";
  public static final String BUCKET_BITMAP = "Bitmap";
  public static final String BUCKET_BITMAP_DRAWABLE = "BitmapDrawable";
  public static final String BUCKET_GIF = "Gif";
  private static final String BUCKET_PREPEND_ALL = "legacy_prepend_all";
  private final DataRewinderRegistry dataRewinderRegistry = new DataRewinderRegistry();
  private final ResourceDecoderRegistry decoderRegistry = new ResourceDecoderRegistry();
  private final EncoderRegistry encoderRegistry = new EncoderRegistry();
  private final ImageHeaderParserRegistry imageHeaderParserRegistry = new ImageHeaderParserRegistry();
  private final LoadPathCache loadPathCache = new LoadPathCache();
  private final ModelLoaderRegistry modelLoaderRegistry = new ModelLoaderRegistry(this.throwableListPool);
  private final ModelToResourceClassCache modelToResourceClassCache = new ModelToResourceClassCache();
  private final ResourceEncoderRegistry resourceEncoderRegistry = new ResourceEncoderRegistry();
  private final Pools.Pool<List<Throwable>> throwableListPool = FactoryPools.threadSafeList();
  private final TranscoderRegistry transcoderRegistry = new TranscoderRegistry();
  
  public Registry()
  {
    setResourceDecoderBucketPriorityList(Arrays.asList(new String[] { "Gif", "Bitmap", "BitmapDrawable" }));
  }
  
  @NonNull
  private <Data, TResource, Transcode> List<DecodePath<Data, TResource, Transcode>> getDecodePaths(@NonNull Class<Data> paramClass, @NonNull Class<TResource> paramClass1, @NonNull Class<Transcode> paramClass2)
  {
    ArrayList localArrayList = new ArrayList();
    paramClass1 = this.decoderRegistry.getResourceClasses(paramClass, paramClass1).iterator();
    while (paramClass1.hasNext())
    {
      Class localClass1 = (Class)paramClass1.next();
      Iterator localIterator = this.transcoderRegistry.getTranscodeClasses(localClass1, paramClass2).iterator();
      while (localIterator.hasNext())
      {
        Class localClass2 = (Class)localIterator.next();
        localArrayList.add(new DecodePath(paramClass, localClass1, localClass2, this.decoderRegistry.getDecoders(paramClass, localClass1), this.transcoderRegistry.get(localClass1, localClass2), this.throwableListPool));
      }
    }
    return localArrayList;
  }
  
  @NonNull
  public <Data> Registry append(@NonNull Class<Data> paramClass, @NonNull Encoder<Data> paramEncoder)
  {
    this.encoderRegistry.append(paramClass, paramEncoder);
    return this;
  }
  
  @NonNull
  public <TResource> Registry append(@NonNull Class<TResource> paramClass, @NonNull ResourceEncoder<TResource> paramResourceEncoder)
  {
    this.resourceEncoderRegistry.append(paramClass, paramResourceEncoder);
    return this;
  }
  
  @NonNull
  public <Data, TResource> Registry append(@NonNull Class<Data> paramClass, @NonNull Class<TResource> paramClass1, @NonNull ResourceDecoder<Data, TResource> paramResourceDecoder)
  {
    append("legacy_append", paramClass, paramClass1, paramResourceDecoder);
    return this;
  }
  
  @NonNull
  public <Model, Data> Registry append(@NonNull Class<Model> paramClass, @NonNull Class<Data> paramClass1, @NonNull ModelLoaderFactory<Model, Data> paramModelLoaderFactory)
  {
    this.modelLoaderRegistry.append(paramClass, paramClass1, paramModelLoaderFactory);
    return this;
  }
  
  @NonNull
  public <Data, TResource> Registry append(@NonNull String paramString, @NonNull Class<Data> paramClass, @NonNull Class<TResource> paramClass1, @NonNull ResourceDecoder<Data, TResource> paramResourceDecoder)
  {
    this.decoderRegistry.append(paramString, paramResourceDecoder, paramClass, paramClass1);
    return this;
  }
  
  @NonNull
  public List<ImageHeaderParser> getImageHeaderParsers()
  {
    List localList = this.imageHeaderParserRegistry.getParsers();
    if (!localList.isEmpty()) {
      return localList;
    }
    throw new NoImageHeaderParserException();
  }
  
  @Nullable
  public <Data, TResource, Transcode> LoadPath<Data, TResource, Transcode> getLoadPath(@NonNull Class<Data> paramClass, @NonNull Class<TResource> paramClass1, @NonNull Class<Transcode> paramClass2)
  {
    LoadPath localLoadPath = this.loadPathCache.get(paramClass, paramClass1, paramClass2);
    if (this.loadPathCache.isEmptyLoadPath(localLoadPath)) {
      return null;
    }
    Object localObject = localLoadPath;
    if (localLoadPath == null)
    {
      localObject = getDecodePaths(paramClass, paramClass1, paramClass2);
      if (((List)localObject).isEmpty()) {
        localObject = null;
      } else {
        localObject = new LoadPath(paramClass, paramClass1, paramClass2, (List)localObject, this.throwableListPool);
      }
      this.loadPathCache.put(paramClass, paramClass1, paramClass2, (LoadPath)localObject);
    }
    return (LoadPath<Data, TResource, Transcode>)localObject;
  }
  
  @NonNull
  public <Model> List<ModelLoader<Model, ?>> getModelLoaders(@NonNull Model paramModel)
  {
    List localList = this.modelLoaderRegistry.getModelLoaders(paramModel);
    if (!localList.isEmpty()) {
      return localList;
    }
    throw new NoModelLoaderAvailableException(paramModel);
  }
  
  @NonNull
  public <Model, TResource, Transcode> List<Class<?>> getRegisteredResourceClasses(@NonNull Class<Model> paramClass, @NonNull Class<TResource> paramClass1, @NonNull Class<Transcode> paramClass2)
  {
    Object localObject2 = this.modelToResourceClassCache.get(paramClass, paramClass1);
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = new ArrayList();
      localObject2 = this.modelLoaderRegistry.getDataClasses(paramClass).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Object localObject3 = (Class)((Iterator)localObject2).next();
        localObject3 = this.decoderRegistry.getResourceClasses((Class)localObject3, paramClass1).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          Class localClass = (Class)((Iterator)localObject3).next();
          if ((!this.transcoderRegistry.getTranscodeClasses(localClass, paramClass2).isEmpty()) && (!((List)localObject1).contains(localClass))) {
            ((List)localObject1).add(localClass);
          }
        }
      }
      this.modelToResourceClassCache.put(paramClass, paramClass1, Collections.unmodifiableList((List)localObject1));
    }
    return (List<Class<?>>)localObject1;
  }
  
  @NonNull
  public <X> ResourceEncoder<X> getResultEncoder(@NonNull Resource<X> paramResource)
    throws Registry.NoResultEncoderAvailableException
  {
    ResourceEncoder localResourceEncoder = this.resourceEncoderRegistry.get(paramResource.getResourceClass());
    if (localResourceEncoder != null) {
      return localResourceEncoder;
    }
    throw new NoResultEncoderAvailableException(paramResource.getResourceClass());
  }
  
  @NonNull
  public <X> DataRewinder<X> getRewinder(@NonNull X paramX)
  {
    return this.dataRewinderRegistry.build(paramX);
  }
  
  @NonNull
  public <X> Encoder<X> getSourceEncoder(@NonNull X paramX)
    throws Registry.NoSourceEncoderAvailableException
  {
    Encoder localEncoder = this.encoderRegistry.getEncoder(paramX.getClass());
    if (localEncoder != null) {
      return localEncoder;
    }
    throw new NoSourceEncoderAvailableException(paramX.getClass());
  }
  
  public boolean isResourceEncoderAvailable(@NonNull Resource<?> paramResource)
  {
    return this.resourceEncoderRegistry.get(paramResource.getResourceClass()) != null;
  }
  
  @NonNull
  public <Data> Registry prepend(@NonNull Class<Data> paramClass, @NonNull Encoder<Data> paramEncoder)
  {
    this.encoderRegistry.prepend(paramClass, paramEncoder);
    return this;
  }
  
  @NonNull
  public <TResource> Registry prepend(@NonNull Class<TResource> paramClass, @NonNull ResourceEncoder<TResource> paramResourceEncoder)
  {
    this.resourceEncoderRegistry.prepend(paramClass, paramResourceEncoder);
    return this;
  }
  
  @NonNull
  public <Data, TResource> Registry prepend(@NonNull Class<Data> paramClass, @NonNull Class<TResource> paramClass1, @NonNull ResourceDecoder<Data, TResource> paramResourceDecoder)
  {
    prepend("legacy_prepend_all", paramClass, paramClass1, paramResourceDecoder);
    return this;
  }
  
  @NonNull
  public <Model, Data> Registry prepend(@NonNull Class<Model> paramClass, @NonNull Class<Data> paramClass1, @NonNull ModelLoaderFactory<Model, Data> paramModelLoaderFactory)
  {
    this.modelLoaderRegistry.prepend(paramClass, paramClass1, paramModelLoaderFactory);
    return this;
  }
  
  @NonNull
  public <Data, TResource> Registry prepend(@NonNull String paramString, @NonNull Class<Data> paramClass, @NonNull Class<TResource> paramClass1, @NonNull ResourceDecoder<Data, TResource> paramResourceDecoder)
  {
    this.decoderRegistry.prepend(paramString, paramResourceDecoder, paramClass, paramClass1);
    return this;
  }
  
  @NonNull
  public Registry register(@NonNull ImageHeaderParser paramImageHeaderParser)
  {
    this.imageHeaderParserRegistry.add(paramImageHeaderParser);
    return this;
  }
  
  @NonNull
  public Registry register(@NonNull DataRewinder.Factory<?> paramFactory)
  {
    this.dataRewinderRegistry.register(paramFactory);
    return this;
  }
  
  @Deprecated
  @NonNull
  public <Data> Registry register(@NonNull Class<Data> paramClass, @NonNull Encoder<Data> paramEncoder)
  {
    return append(paramClass, paramEncoder);
  }
  
  @Deprecated
  @NonNull
  public <TResource> Registry register(@NonNull Class<TResource> paramClass, @NonNull ResourceEncoder<TResource> paramResourceEncoder)
  {
    return append(paramClass, paramResourceEncoder);
  }
  
  @NonNull
  public <TResource, Transcode> Registry register(@NonNull Class<TResource> paramClass, @NonNull Class<Transcode> paramClass1, @NonNull ResourceTranscoder<TResource, Transcode> paramResourceTranscoder)
  {
    this.transcoderRegistry.register(paramClass, paramClass1, paramResourceTranscoder);
    return this;
  }
  
  @NonNull
  public <Model, Data> Registry replace(@NonNull Class<Model> paramClass, @NonNull Class<Data> paramClass1, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> paramModelLoaderFactory)
  {
    this.modelLoaderRegistry.replace(paramClass, paramClass1, paramModelLoaderFactory);
    return this;
  }
  
  @NonNull
  public final Registry setResourceDecoderBucketPriorityList(@NonNull List<String> paramList)
  {
    paramList = new ArrayList(paramList);
    paramList.add(0, "legacy_prepend_all");
    paramList.add("legacy_append");
    this.decoderRegistry.setBucketPriorityList(paramList);
    return this;
  }
  
  public static class MissingComponentException
    extends RuntimeException
  {
    public MissingComponentException(@NonNull String paramString)
    {
      super();
    }
  }
  
  public static final class NoImageHeaderParserException
    extends Registry.MissingComponentException
  {
    public NoImageHeaderParserException()
    {
      super();
    }
  }
  
  public static class NoModelLoaderAvailableException
    extends Registry.MissingComponentException
  {
    public NoModelLoaderAvailableException(@NonNull Class<?> paramClass1, @NonNull Class<?> paramClass2)
    {
      super();
    }
    
    public NoModelLoaderAvailableException(@NonNull Object paramObject)
    {
      super();
    }
  }
  
  public static class NoResultEncoderAvailableException
    extends Registry.MissingComponentException
  {
    public NoResultEncoderAvailableException(@NonNull Class<?> paramClass)
    {
      super();
    }
  }
  
  public static class NoSourceEncoderAvailableException
    extends Registry.MissingComponentException
  {
    public NoSourceEncoderAvailableException(@NonNull Class<?> paramClass)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/Registry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */