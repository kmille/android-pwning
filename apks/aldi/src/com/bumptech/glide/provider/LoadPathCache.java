package com.bumptech.glide.provider;

import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import com.bumptech.glide.load.engine.DecodePath;
import com.bumptech.glide.load.engine.LoadPath;
import com.bumptech.glide.load.resource.transcode.UnitTranscoder;
import com.bumptech.glide.util.MultiClassKey;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

public class LoadPathCache
{
  private static final LoadPath<?, ?, ?> NO_PATHS_SIGNAL = new LoadPath(Object.class, Object.class, Object.class, Collections.singletonList(new DecodePath(Object.class, Object.class, Object.class, Collections.emptyList(), new UnitTranscoder(), null)), null);
  private final ArrayMap<MultiClassKey, LoadPath<?, ?, ?>> cache = new ArrayMap();
  private final AtomicReference<MultiClassKey> keyRef = new AtomicReference();
  
  private MultiClassKey getKey(Class<?> paramClass1, Class<?> paramClass2, Class<?> paramClass3)
  {
    MultiClassKey localMultiClassKey2 = (MultiClassKey)this.keyRef.getAndSet(null);
    MultiClassKey localMultiClassKey1 = localMultiClassKey2;
    if (localMultiClassKey2 == null) {
      localMultiClassKey1 = new MultiClassKey();
    }
    localMultiClassKey1.set(paramClass1, paramClass2, paramClass3);
    return localMultiClassKey1;
  }
  
  @Nullable
  public <Data, TResource, Transcode> LoadPath<Data, TResource, Transcode> get(Class<Data> arg1, Class<TResource> paramClass1, Class<Transcode> paramClass2)
  {
    paramClass1 = getKey(???, paramClass1, paramClass2);
    synchronized (this.cache)
    {
      paramClass2 = (LoadPath)this.cache.get(paramClass1);
      this.keyRef.set(paramClass1);
      return paramClass2;
    }
  }
  
  public boolean isEmptyLoadPath(@Nullable LoadPath<?, ?, ?> paramLoadPath)
  {
    return NO_PATHS_SIGNAL.equals(paramLoadPath);
  }
  
  public void put(Class<?> paramClass1, Class<?> paramClass2, Class<?> paramClass3, @Nullable LoadPath<?, ?, ?> paramLoadPath)
  {
    synchronized (this.cache)
    {
      ArrayMap localArrayMap2 = this.cache;
      paramClass1 = new MultiClassKey(paramClass1, paramClass2, paramClass3);
      if (paramLoadPath == null) {
        paramLoadPath = NO_PATHS_SIGNAL;
      }
      localArrayMap2.put(paramClass1, paramLoadPath);
      return;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/provider/LoadPathCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */