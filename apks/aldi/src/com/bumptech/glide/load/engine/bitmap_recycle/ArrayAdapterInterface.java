package com.bumptech.glide.load.engine.bitmap_recycle;

abstract interface ArrayAdapterInterface<T>
{
  public abstract int getArrayLength(T paramT);
  
  public abstract int getElementSizeInBytes();
  
  public abstract String getTag();
  
  public abstract T newArray(int paramInt);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/bitmap_recycle/ArrayAdapterInterface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */