package com.bumptech.glide.load.resource;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;

public class SimpleResource<T>
  implements Resource<T>
{
  protected final T data;
  
  public SimpleResource(@NonNull T paramT)
  {
    this.data = Preconditions.checkNotNull(paramT);
  }
  
  @NonNull
  public final T get()
  {
    return (T)this.data;
  }
  
  @NonNull
  public Class<T> getResourceClass()
  {
    return this.data.getClass();
  }
  
  public final int getSize()
  {
    return 1;
  }
  
  public void recycle() {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/SimpleResource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */