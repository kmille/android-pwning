package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

@Deprecated
public class VideoBitmapDecoder
  extends VideoDecoder<ParcelFileDescriptor>
{
  public VideoBitmapDecoder(Context paramContext)
  {
    this(Glide.get(paramContext).getBitmapPool());
  }
  
  public VideoBitmapDecoder(BitmapPool paramBitmapPool)
  {
    super(paramBitmapPool, new VideoDecoder.ParcelFileDescriptorInitializer());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/VideoBitmapDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */