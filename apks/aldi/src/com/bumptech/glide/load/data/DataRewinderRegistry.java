package com.bumptech.glide.load.data;

import android.support.annotation.NonNull;
import com.bumptech.glide.util.Preconditions;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DataRewinderRegistry
{
  private static final DataRewinder.Factory<?> DEFAULT_FACTORY = new DataRewinder.Factory()
  {
    @NonNull
    public DataRewinder<Object> build(@NonNull Object paramAnonymousObject)
    {
      return new DataRewinderRegistry.DefaultRewinder(paramAnonymousObject);
    }
    
    @NonNull
    public Class<Object> getDataClass()
    {
      throw new UnsupportedOperationException("Not implemented");
    }
  };
  private final Map<Class<?>, DataRewinder.Factory<?>> rewinders = new HashMap();
  
  @NonNull
  public <T> DataRewinder<T> build(@NonNull T paramT)
  {
    try
    {
      Preconditions.checkNotNull(paramT);
      Object localObject2 = (DataRewinder.Factory)this.rewinders.get(paramT.getClass());
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        Iterator localIterator = this.rewinders.values().iterator();
        do
        {
          localObject1 = localObject2;
          if (!localIterator.hasNext()) {
            break;
          }
          localObject1 = (DataRewinder.Factory)localIterator.next();
        } while (!((DataRewinder.Factory)localObject1).getDataClass().isAssignableFrom(paramT.getClass()));
      }
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = DEFAULT_FACTORY;
      }
      paramT = ((DataRewinder.Factory)localObject2).build(paramT);
      return paramT;
    }
    finally {}
  }
  
  public void register(@NonNull DataRewinder.Factory<?> paramFactory)
  {
    try
    {
      this.rewinders.put(paramFactory.getDataClass(), paramFactory);
      return;
    }
    finally
    {
      paramFactory = finally;
      throw paramFactory;
    }
  }
  
  static final class DefaultRewinder
    implements DataRewinder<Object>
  {
    private final Object data;
    
    DefaultRewinder(@NonNull Object paramObject)
    {
      this.data = paramObject;
    }
    
    public final void cleanup() {}
    
    @NonNull
    public final Object rewindAndGet()
    {
      return this.data;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/data/DataRewinderRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */