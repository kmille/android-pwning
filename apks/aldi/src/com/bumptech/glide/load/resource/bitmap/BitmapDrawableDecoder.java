package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;

public class BitmapDrawableDecoder<DataType>
  implements ResourceDecoder<DataType, BitmapDrawable>
{
  private final ResourceDecoder<DataType, Bitmap> decoder;
  private final Resources resources;
  
  public BitmapDrawableDecoder(Context paramContext, ResourceDecoder<DataType, Bitmap> paramResourceDecoder)
  {
    this(paramContext.getResources(), paramResourceDecoder);
  }
  
  public BitmapDrawableDecoder(@NonNull Resources paramResources, @NonNull ResourceDecoder<DataType, Bitmap> paramResourceDecoder)
  {
    this.resources = ((Resources)Preconditions.checkNotNull(paramResources));
    this.decoder = ((ResourceDecoder)Preconditions.checkNotNull(paramResourceDecoder));
  }
  
  @Deprecated
  public BitmapDrawableDecoder(Resources paramResources, BitmapPool paramBitmapPool, ResourceDecoder<DataType, Bitmap> paramResourceDecoder)
  {
    this(paramResources, paramResourceDecoder);
  }
  
  public Resource<BitmapDrawable> decode(@NonNull DataType paramDataType, int paramInt1, int paramInt2, @NonNull Options paramOptions)
    throws IOException
  {
    paramDataType = this.decoder.decode(paramDataType, paramInt1, paramInt2, paramOptions);
    return LazyBitmapDrawableResource.obtain(this.resources, paramDataType);
  }
  
  public boolean handles(@NonNull DataType paramDataType, @NonNull Options paramOptions)
    throws IOException
  {
    return this.decoder.handles(paramDataType, paramOptions);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/BitmapDrawableDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */