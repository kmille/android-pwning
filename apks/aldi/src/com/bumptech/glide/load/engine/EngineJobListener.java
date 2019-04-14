package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;

abstract interface EngineJobListener
{
  public abstract void onEngineJobCancelled(EngineJob<?> paramEngineJob, Key paramKey);
  
  public abstract void onEngineJobComplete(EngineJob<?> paramEngineJob, Key paramKey, EngineResource<?> paramEngineResource);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/EngineJobListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */