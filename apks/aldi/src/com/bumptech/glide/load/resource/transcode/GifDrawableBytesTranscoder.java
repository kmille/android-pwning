package com.bumptech.glide.load.resource.transcode;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bytes.BytesResource;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.ByteBufferUtil;

public class GifDrawableBytesTranscoder
  implements ResourceTranscoder<GifDrawable, byte[]>
{
  @Nullable
  public Resource<byte[]> transcode(@NonNull Resource<GifDrawable> paramResource, @NonNull Options paramOptions)
  {
    return new BytesResource(ByteBufferUtil.toBytes(((GifDrawable)paramResource.get()).getBuffer()));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/transcode/GifDrawableBytesTranscoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */