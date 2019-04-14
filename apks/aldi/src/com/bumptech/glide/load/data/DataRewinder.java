package com.bumptech.glide.load.data;

import android.support.annotation.NonNull;
import java.io.IOException;

public abstract interface DataRewinder<T>
{
  public abstract void cleanup();
  
  @NonNull
  public abstract T rewindAndGet()
    throws IOException;
  
  public static abstract interface Factory<T>
  {
    @NonNull
    public abstract DataRewinder<T> build(@NonNull T paramT);
    
    @NonNull
    public abstract Class<T> getDataClass();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/data/DataRewinder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */