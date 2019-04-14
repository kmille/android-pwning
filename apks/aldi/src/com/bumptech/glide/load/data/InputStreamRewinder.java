package com.bumptech.glide.load.data;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class InputStreamRewinder
  implements DataRewinder<InputStream>
{
  private static final int MARK_LIMIT = 5242880;
  private final RecyclableBufferedInputStream bufferedStream;
  
  InputStreamRewinder(InputStream paramInputStream, ArrayPool paramArrayPool)
  {
    this.bufferedStream = new RecyclableBufferedInputStream(paramInputStream, paramArrayPool);
    this.bufferedStream.mark(5242880);
  }
  
  public final void cleanup()
  {
    this.bufferedStream.release();
  }
  
  @NonNull
  public final InputStream rewindAndGet()
    throws IOException
  {
    this.bufferedStream.reset();
    return this.bufferedStream;
  }
  
  public static final class Factory
    implements DataRewinder.Factory<InputStream>
  {
    private final ArrayPool byteArrayPool;
    
    public Factory(ArrayPool paramArrayPool)
    {
      this.byteArrayPool = paramArrayPool;
    }
    
    @NonNull
    public final DataRewinder<InputStream> build(InputStream paramInputStream)
    {
      return new InputStreamRewinder(paramInputStream, this.byteArrayPool);
    }
    
    @NonNull
    public final Class<InputStream> getDataClass()
    {
      return InputStream.class;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/data/InputStreamRewinder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */