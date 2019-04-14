package com.bumptech.glide.load.engine.bitmap_recycle;

public abstract interface ArrayPool
{
  public static final int STANDARD_BUFFER_SIZE_BYTES = 65536;
  
  public abstract void clearMemory();
  
  public abstract <T> T get(int paramInt, Class<T> paramClass);
  
  public abstract <T> T getExact(int paramInt, Class<T> paramClass);
  
  public abstract <T> void put(T paramT);
  
  @Deprecated
  public abstract <T> void put(T paramT, Class<T> paramClass);
  
  public abstract void trimMemory(int paramInt);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/bitmap_recycle/ArrayPool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */