package com.bumptech.glide.load.model.stream;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.Headers;
import com.bumptech.glide.load.model.ModelCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class BaseGlideUrlLoader<Model>
  implements ModelLoader<Model, InputStream>
{
  private final ModelLoader<GlideUrl, InputStream> concreteLoader;
  @Nullable
  private final ModelCache<Model, GlideUrl> modelCache;
  
  protected BaseGlideUrlLoader(ModelLoader<GlideUrl, InputStream> paramModelLoader)
  {
    this(paramModelLoader, null);
  }
  
  protected BaseGlideUrlLoader(ModelLoader<GlideUrl, InputStream> paramModelLoader, @Nullable ModelCache<Model, GlideUrl> paramModelCache)
  {
    this.concreteLoader = paramModelLoader;
    this.modelCache = paramModelCache;
  }
  
  private static List<Key> getAlternateKeys(Collection<String> paramCollection)
  {
    ArrayList localArrayList = new ArrayList(paramCollection.size());
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      localArrayList.add(new GlideUrl((String)paramCollection.next()));
    }
    return localArrayList;
  }
  
  @Nullable
  public ModelLoader.LoadData<InputStream> buildLoadData(@NonNull Model paramModel, int paramInt1, int paramInt2, @NonNull Options paramOptions)
  {
    Object localObject1;
    if (this.modelCache != null) {
      localObject1 = (GlideUrl)this.modelCache.get(paramModel, paramInt1, paramInt2);
    } else {
      localObject1 = null;
    }
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject1 = getUrl(paramModel, paramInt1, paramInt2, paramOptions);
      if (TextUtils.isEmpty((CharSequence)localObject1)) {
        return null;
      }
      localObject2 = new GlideUrl((String)localObject1, getHeaders(paramModel, paramInt1, paramInt2, paramOptions));
      if (this.modelCache != null) {
        this.modelCache.put(paramModel, paramInt1, paramInt2, localObject2);
      }
    }
    paramModel = getAlternateUrls(paramModel, paramInt1, paramInt2, paramOptions);
    paramOptions = this.concreteLoader.buildLoadData(localObject2, paramInt1, paramInt2, paramOptions);
    if (paramOptions != null)
    {
      if (paramModel.isEmpty()) {
        return paramOptions;
      }
      return new ModelLoader.LoadData(paramOptions.sourceKey, getAlternateKeys(paramModel), paramOptions.fetcher);
    }
    return paramOptions;
  }
  
  protected List<String> getAlternateUrls(Model paramModel, int paramInt1, int paramInt2, Options paramOptions)
  {
    return Collections.emptyList();
  }
  
  @Nullable
  protected Headers getHeaders(Model paramModel, int paramInt1, int paramInt2, Options paramOptions)
  {
    return Headers.DEFAULT;
  }
  
  protected abstract String getUrl(Model paramModel, int paramInt1, int paramInt2, Options paramOptions);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/model/stream/BaseGlideUrlLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */