package com.bumptech.glide.load.engine;

import android.support.annotation.VisibleForTesting;
import com.bumptech.glide.load.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class Jobs
{
  private final Map<Key, EngineJob<?>> jobs = new HashMap();
  private final Map<Key, EngineJob<?>> onlyCacheJobs = new HashMap();
  
  private Map<Key, EngineJob<?>> getJobMap(boolean paramBoolean)
  {
    if (paramBoolean) {
      return this.onlyCacheJobs;
    }
    return this.jobs;
  }
  
  final EngineJob<?> get(Key paramKey, boolean paramBoolean)
  {
    return (EngineJob)getJobMap(paramBoolean).get(paramKey);
  }
  
  @VisibleForTesting
  final Map<Key, EngineJob<?>> getAll()
  {
    return Collections.unmodifiableMap(this.jobs);
  }
  
  final void put(Key paramKey, EngineJob<?> paramEngineJob)
  {
    getJobMap(paramEngineJob.onlyRetrieveFromCache()).put(paramKey, paramEngineJob);
  }
  
  final void removeIfCurrent(Key paramKey, EngineJob<?> paramEngineJob)
  {
    Map localMap = getJobMap(paramEngineJob.onlyRetrieveFromCache());
    if (paramEngineJob.equals(localMap.get(paramKey))) {
      localMap.remove(paramKey);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/Jobs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */