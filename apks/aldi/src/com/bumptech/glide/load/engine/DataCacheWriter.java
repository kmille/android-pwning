package com.bumptech.glide.load.engine;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.cache.DiskCache.Writer;
import java.io.File;

class DataCacheWriter<DataType>
  implements DiskCache.Writer
{
  private final DataType data;
  private final Encoder<DataType> encoder;
  private final Options options;
  
  DataCacheWriter(Encoder<DataType> paramEncoder, DataType paramDataType, Options paramOptions)
  {
    this.encoder = paramEncoder;
    this.data = paramDataType;
    this.options = paramOptions;
  }
  
  public boolean write(@NonNull File paramFile)
  {
    return this.encoder.encode(this.data, paramFile, this.options);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/DataCacheWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */