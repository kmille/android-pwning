package com.bumptech.glide.load.resource.gif;

import android.support.annotation.NonNull;
import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.File;
import java.io.IOException;

public class GifDrawableEncoder
  implements ResourceEncoder<GifDrawable>
{
  private static final String TAG = "GifEncoder";
  
  public boolean encode(@NonNull Resource<GifDrawable> paramResource, @NonNull File paramFile, @NonNull Options paramOptions)
  {
    paramResource = (GifDrawable)paramResource.get();
    try
    {
      ByteBufferUtil.toFile(paramResource.getBuffer(), paramFile);
      return true;
    }
    catch (IOException paramResource)
    {
      for (;;) {}
    }
    Log.isLoggable("GifEncoder", 5);
    return false;
  }
  
  @NonNull
  public EncodeStrategy getEncodeStrategy(@NonNull Options paramOptions)
  {
    return EncodeStrategy.SOURCE;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/gif/GifDrawableEncoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */