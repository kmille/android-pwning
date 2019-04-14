package com.bumptech.glide.load.engine.bitmap_recycle;

public final class ByteArrayAdapter
  implements ArrayAdapterInterface<byte[]>
{
  private static final String TAG = "ByteArrayPool";
  
  public final int getArrayLength(byte[] paramArrayOfByte)
  {
    return paramArrayOfByte.length;
  }
  
  public final int getElementSizeInBytes()
  {
    return 1;
  }
  
  public final String getTag()
  {
    return "ByteArrayPool";
  }
  
  public final byte[] newArray(int paramInt)
  {
    return new byte[paramInt];
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/bitmap_recycle/ByteArrayAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */