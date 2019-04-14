package com.bumptech.glide.load.model;

import java.util.Collections;
import java.util.Map;

public abstract interface Headers
{
  public static final Headers DEFAULT = new LazyHeaders.Builder().build();
  @Deprecated
  public static final Headers NONE = new Headers()
  {
    public Map<String, String> getHeaders()
    {
      return Collections.emptyMap();
    }
  };
  
  public abstract Map<String, String> getHeaders();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/model/Headers.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */