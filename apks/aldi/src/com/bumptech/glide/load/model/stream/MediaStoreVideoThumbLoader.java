package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.data.mediastore.ThumbFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.signature.ObjectKey;
import java.io.InputStream;

public class MediaStoreVideoThumbLoader
  implements ModelLoader<Uri, InputStream>
{
  private final Context context;
  
  public MediaStoreVideoThumbLoader(Context paramContext)
  {
    this.context = paramContext.getApplicationContext();
  }
  
  private boolean isRequestingDefaultFrame(Options paramOptions)
  {
    paramOptions = (Long)paramOptions.get(VideoDecoder.TARGET_FRAME);
    return (paramOptions != null) && (paramOptions.longValue() == -1L);
  }
  
  @Nullable
  public ModelLoader.LoadData<InputStream> buildLoadData(@NonNull Uri paramUri, int paramInt1, int paramInt2, @NonNull Options paramOptions)
  {
    if ((MediaStoreUtil.isThumbnailSize(paramInt1, paramInt2)) && (isRequestingDefaultFrame(paramOptions))) {
      return new ModelLoader.LoadData(new ObjectKey(paramUri), ThumbFetcher.buildVideoFetcher(this.context, paramUri));
    }
    return null;
  }
  
  public boolean handles(@NonNull Uri paramUri)
  {
    return MediaStoreUtil.isMediaStoreVideoUri(paramUri);
  }
  
  public static class Factory
    implements ModelLoaderFactory<Uri, InputStream>
  {
    private final Context context;
    
    public Factory(Context paramContext)
    {
      this.context = paramContext;
    }
    
    @NonNull
    public ModelLoader<Uri, InputStream> build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
    {
      return new MediaStoreVideoThumbLoader(this.context);
    }
    
    public void teardown() {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/model/stream/MediaStoreVideoThumbLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */