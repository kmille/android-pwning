package com.bumptech.glide.load.resource.bytes;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;

public class BytesResource
  implements Resource<byte[]>
{
  private final byte[] bytes;
  
  public BytesResource(byte[] paramArrayOfByte)
  {
    this.bytes = ((byte[])Preconditions.checkNotNull(paramArrayOfByte));
  }
  
  @NonNull
  public byte[] get()
  {
    return this.bytes;
  }
  
  @NonNull
  public Class<byte[]> getResourceClass()
  {
    return byte[].class;
  }
  
  public int getSize()
  {
    return this.bytes.length;
  }
  
  public void recycle() {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bytes/BytesResource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */