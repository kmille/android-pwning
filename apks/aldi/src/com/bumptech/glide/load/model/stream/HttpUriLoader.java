package com.bumptech.glide.load.model.stream;

import android.net.Uri;
import android.support.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HttpUriLoader
  implements ModelLoader<Uri, InputStream>
{
  private static final Set<String> SCHEMES = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] { "http", "https" })));
  private final ModelLoader<GlideUrl, InputStream> urlLoader;
  
  public HttpUriLoader(ModelLoader<GlideUrl, InputStream> paramModelLoader)
  {
    this.urlLoader = paramModelLoader;
  }
  
  public ModelLoader.LoadData<InputStream> buildLoadData(@NonNull Uri paramUri, int paramInt1, int paramInt2, @NonNull Options paramOptions)
  {
    return this.urlLoader.buildLoadData(new GlideUrl(paramUri.toString()), paramInt1, paramInt2, paramOptions);
  }
  
  public boolean handles(@NonNull Uri paramUri)
  {
    return SCHEMES.contains(paramUri.getScheme());
  }
  
  public static class Factory
    implements ModelLoaderFactory<Uri, InputStream>
  {
    @NonNull
    public ModelLoader<Uri, InputStream> build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
    {
      return new HttpUriLoader(paramMultiModelLoaderFactory.build(GlideUrl.class, InputStream.class));
    }
    
    public void teardown() {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/model/stream/HttpUriLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */