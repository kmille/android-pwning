package com.bumptech.glide.request;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.Resource;

public abstract interface ResourceCallback
{
  public abstract void onLoadFailed(GlideException paramGlideException);
  
  public abstract void onResourceReady(Resource<?> paramResource, DataSource paramDataSource);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/ResourceCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */