package com.bumptech.glide.load;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;

public abstract interface ResourceDecoder<T, Z>
{
  @Nullable
  public abstract Resource<Z> decode(@NonNull T paramT, int paramInt1, int paramInt2, @NonNull Options paramOptions)
    throws IOException;
  
  public abstract boolean handles(@NonNull T paramT, @NonNull Options paramOptions)
    throws IOException;
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/ResourceDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */