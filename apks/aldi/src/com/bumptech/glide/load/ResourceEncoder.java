package com.bumptech.glide.load;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;

public abstract interface ResourceEncoder<T>
  extends Encoder<Resource<T>>
{
  @NonNull
  public abstract EncodeStrategy getEncodeStrategy(@NonNull Options paramOptions);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/ResourceEncoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */