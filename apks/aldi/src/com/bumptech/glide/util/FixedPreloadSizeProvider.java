package com.bumptech.glide.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.ListPreloader.PreloadSizeProvider;

public class FixedPreloadSizeProvider<T>
  implements ListPreloader.PreloadSizeProvider<T>
{
  private final int[] size;
  
  public FixedPreloadSizeProvider(int paramInt1, int paramInt2)
  {
    this.size = new int[] { paramInt1, paramInt2 };
  }
  
  @Nullable
  public int[] getPreloadSize(@NonNull T paramT, int paramInt1, int paramInt2)
  {
    return this.size;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/util/FixedPreloadSizeProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */