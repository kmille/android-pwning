package com.bumptech.glide.load.engine.bitmap_recycle;

public final class IntegerArrayAdapter
  implements ArrayAdapterInterface<int[]>
{
  private static final String TAG = "IntegerArrayPool";
  
  public final int getArrayLength(int[] paramArrayOfInt)
  {
    return paramArrayOfInt.length;
  }
  
  public final int getElementSizeInBytes()
  {
    return 4;
  }
  
  public final String getTag()
  {
    return "IntegerArrayPool";
  }
  
  public final int[] newArray(int paramInt)
  {
    return new int[paramInt];
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/bitmap_recycle/IntegerArrayAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */