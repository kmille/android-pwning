package com.bumptech.glide.load.resource.bytes;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.data.DataRewinder.Factory;
import java.nio.ByteBuffer;

public class ByteBufferRewinder
  implements DataRewinder<ByteBuffer>
{
  private final ByteBuffer buffer;
  
  public ByteBufferRewinder(ByteBuffer paramByteBuffer)
  {
    this.buffer = paramByteBuffer;
  }
  
  public void cleanup() {}
  
  @NonNull
  public ByteBuffer rewindAndGet()
  {
    this.buffer.position(0);
    return this.buffer;
  }
  
  public static class Factory
    implements DataRewinder.Factory<ByteBuffer>
  {
    @NonNull
    public DataRewinder<ByteBuffer> build(ByteBuffer paramByteBuffer)
    {
      return new ByteBufferRewinder(paramByteBuffer);
    }
    
    @NonNull
    public Class<ByteBuffer> getDataClass()
    {
      return ByteBuffer.class;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bytes/ByteBufferRewinder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */