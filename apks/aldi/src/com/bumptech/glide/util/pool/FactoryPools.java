package com.bumptech.glide.util.pool;

import android.support.annotation.NonNull;
import android.support.v4.util.Pools.Pool;
import android.support.v4.util.Pools.SimplePool;
import android.support.v4.util.Pools.SynchronizedPool;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class FactoryPools
{
  private static final int DEFAULT_POOL_SIZE = 20;
  private static final Resetter<Object> EMPTY_RESETTER = new Resetter()
  {
    public void reset(@NonNull Object paramAnonymousObject) {}
  };
  private static final String TAG = "FactoryPools";
  
  @NonNull
  private static <T extends Poolable> Pools.Pool<T> build(@NonNull Pools.Pool<T> paramPool, @NonNull Factory<T> paramFactory)
  {
    return build(paramPool, paramFactory, emptyResetter());
  }
  
  @NonNull
  private static <T> Pools.Pool<T> build(@NonNull Pools.Pool<T> paramPool, @NonNull Factory<T> paramFactory, @NonNull Resetter<T> paramResetter)
  {
    return new FactoryPool(paramPool, paramFactory, paramResetter);
  }
  
  @NonNull
  private static <T> Resetter<T> emptyResetter()
  {
    return EMPTY_RESETTER;
  }
  
  @NonNull
  public static <T extends Poolable> Pools.Pool<T> simple(int paramInt, @NonNull Factory<T> paramFactory)
  {
    return build(new Pools.SimplePool(paramInt), paramFactory);
  }
  
  @NonNull
  public static <T extends Poolable> Pools.Pool<T> threadSafe(int paramInt, @NonNull Factory<T> paramFactory)
  {
    return build(new Pools.SynchronizedPool(paramInt), paramFactory);
  }
  
  @NonNull
  public static <T> Pools.Pool<List<T>> threadSafeList()
  {
    return threadSafeList(20);
  }
  
  @NonNull
  public static <T> Pools.Pool<List<T>> threadSafeList(int paramInt)
  {
    build(new Pools.SynchronizedPool(paramInt), new Factory()new Resetter
    {
      @NonNull
      public List<T> create()
      {
        return new ArrayList();
      }
    }, new Resetter()
    {
      public void reset(@NonNull List<T> paramAnonymousList)
      {
        paramAnonymousList.clear();
      }
    });
  }
  
  public static abstract interface Factory<T>
  {
    public abstract T create();
  }
  
  static final class FactoryPool<T>
    implements Pools.Pool<T>
  {
    private final FactoryPools.Factory<T> factory;
    private final Pools.Pool<T> pool;
    private final FactoryPools.Resetter<T> resetter;
    
    FactoryPool(@NonNull Pools.Pool<T> paramPool, @NonNull FactoryPools.Factory<T> paramFactory, @NonNull FactoryPools.Resetter<T> paramResetter)
    {
      this.pool = paramPool;
      this.factory = paramFactory;
      this.resetter = paramResetter;
    }
    
    public final T acquire()
    {
      Object localObject2 = this.pool.acquire();
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject2 = this.factory.create();
        localObject1 = localObject2;
        if (Log.isLoggable("FactoryPools", 2))
        {
          new StringBuilder("Created new ").append(localObject2.getClass());
          localObject1 = localObject2;
        }
      }
      if ((localObject1 instanceof FactoryPools.Poolable)) {
        ((FactoryPools.Poolable)localObject1).getVerifier().setRecycled(false);
      }
      return (T)localObject1;
    }
    
    public final boolean release(@NonNull T paramT)
    {
      if ((paramT instanceof FactoryPools.Poolable)) {
        ((FactoryPools.Poolable)paramT).getVerifier().setRecycled(true);
      }
      this.resetter.reset(paramT);
      return this.pool.release(paramT);
    }
  }
  
  public static abstract interface Poolable
  {
    @NonNull
    public abstract StateVerifier getVerifier();
  }
  
  public static abstract interface Resetter<T>
  {
    public abstract void reset(@NonNull T paramT);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/util/pool/FactoryPools.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */