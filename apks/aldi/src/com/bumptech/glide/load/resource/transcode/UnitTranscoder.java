package com.bumptech.glide.load.resource.transcode;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;

public class UnitTranscoder<Z>
  implements ResourceTranscoder<Z, Z>
{
  private static final UnitTranscoder<?> UNIT_TRANSCODER = new UnitTranscoder();
  
  public static <Z> ResourceTranscoder<Z, Z> get()
  {
    return UNIT_TRANSCODER;
  }
  
  @Nullable
  public Resource<Z> transcode(@NonNull Resource<Z> paramResource, @NonNull Options paramOptions)
  {
    return paramResource;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/transcode/UnitTranscoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */