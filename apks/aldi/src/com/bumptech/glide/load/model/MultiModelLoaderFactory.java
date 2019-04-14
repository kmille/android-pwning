package com.bumptech.glide.load.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.v4.util.Pools.Pool;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MultiModelLoaderFactory
{
  private static final Factory DEFAULT_FACTORY = new Factory();
  private static final ModelLoader<Object, Object> EMPTY_MODEL_LOADER = new EmptyModelLoader();
  private final Set<Entry<?, ?>> alreadyUsedEntries = new HashSet();
  private final List<Entry<?, ?>> entries = new ArrayList();
  private final Factory factory;
  private final Pools.Pool<List<Throwable>> throwableListPool;
  
  public MultiModelLoaderFactory(@NonNull Pools.Pool<List<Throwable>> paramPool)
  {
    this(paramPool, DEFAULT_FACTORY);
  }
  
  @VisibleForTesting
  MultiModelLoaderFactory(@NonNull Pools.Pool<List<Throwable>> paramPool, @NonNull Factory paramFactory)
  {
    this.throwableListPool = paramPool;
    this.factory = paramFactory;
  }
  
  private <Model, Data> void add(@NonNull Class<Model> paramClass, @NonNull Class<Data> paramClass1, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> paramModelLoaderFactory, boolean paramBoolean)
  {
    paramClass = new Entry(paramClass, paramClass1, paramModelLoaderFactory);
    paramClass1 = this.entries;
    int i;
    if (paramBoolean) {
      i = this.entries.size();
    } else {
      i = 0;
    }
    paramClass1.add(i, paramClass);
  }
  
  @NonNull
  private <Model, Data> ModelLoader<Model, Data> build(@NonNull Entry<?, ?> paramEntry)
  {
    return (ModelLoader)Preconditions.checkNotNull(paramEntry.factory.build(this));
  }
  
  @NonNull
  private static <Model, Data> ModelLoader<Model, Data> emptyModelLoader()
  {
    return EMPTY_MODEL_LOADER;
  }
  
  @NonNull
  private <Model, Data> ModelLoaderFactory<Model, Data> getFactory(@NonNull Entry<?, ?> paramEntry)
  {
    return paramEntry.factory;
  }
  
  <Model, Data> void append(@NonNull Class<Model> paramClass, @NonNull Class<Data> paramClass1, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> paramModelLoaderFactory)
  {
    try
    {
      add(paramClass, paramClass1, paramModelLoaderFactory, true);
      return;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  /* Error */
  @NonNull
  public <Model, Data> ModelLoader<Model, Data> build(@NonNull Class<Model> paramClass, @NonNull Class<Data> paramClass1)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 51	java/util/ArrayList
    //   5: dup
    //   6: invokespecial 52	java/util/ArrayList:<init>	()V
    //   9: astore 4
    //   11: aload_0
    //   12: getfield 54	com/bumptech/glide/load/model/MultiModelLoaderFactory:entries	Ljava/util/List;
    //   15: invokeinterface 116 1 0
    //   20: astore 5
    //   22: iconst_0
    //   23: istore_3
    //   24: aload 5
    //   26: invokeinterface 122 1 0
    //   31: ifeq +85 -> 116
    //   34: aload 5
    //   36: invokeinterface 126 1 0
    //   41: checkcast 9	com/bumptech/glide/load/model/MultiModelLoaderFactory$Entry
    //   44: astore 6
    //   46: aload_0
    //   47: getfield 59	com/bumptech/glide/load/model/MultiModelLoaderFactory:alreadyUsedEntries	Ljava/util/Set;
    //   50: aload 6
    //   52: invokeinterface 132 2 0
    //   57: ifeq +8 -> 65
    //   60: iconst_1
    //   61: istore_3
    //   62: goto -38 -> 24
    //   65: aload 6
    //   67: aload_1
    //   68: aload_2
    //   69: invokevirtual 136	com/bumptech/glide/load/model/MultiModelLoaderFactory$Entry:handles	(Ljava/lang/Class;Ljava/lang/Class;)Z
    //   72: ifeq -48 -> 24
    //   75: aload_0
    //   76: getfield 59	com/bumptech/glide/load/model/MultiModelLoaderFactory:alreadyUsedEntries	Ljava/util/Set;
    //   79: aload 6
    //   81: invokeinterface 138 2 0
    //   86: pop
    //   87: aload 4
    //   89: aload_0
    //   90: aload 6
    //   92: invokespecial 140	com/bumptech/glide/load/model/MultiModelLoaderFactory:build	(Lcom/bumptech/glide/load/model/MultiModelLoaderFactory$Entry;)Lcom/bumptech/glide/load/model/ModelLoader;
    //   95: invokeinterface 141 2 0
    //   100: pop
    //   101: aload_0
    //   102: getfield 59	com/bumptech/glide/load/model/MultiModelLoaderFactory:alreadyUsedEntries	Ljava/util/Set;
    //   105: aload 6
    //   107: invokeinterface 144 2 0
    //   112: pop
    //   113: goto -89 -> 24
    //   116: aload 4
    //   118: invokeinterface 76 1 0
    //   123: iconst_1
    //   124: if_icmple +21 -> 145
    //   127: aload_0
    //   128: getfield 63	com/bumptech/glide/load/model/MultiModelLoaderFactory:factory	Lcom/bumptech/glide/load/model/MultiModelLoaderFactory$Factory;
    //   131: aload 4
    //   133: aload_0
    //   134: getfield 61	com/bumptech/glide/load/model/MultiModelLoaderFactory:throwableListPool	Landroid/support/v4/util/Pools$Pool;
    //   137: invokevirtual 147	com/bumptech/glide/load/model/MultiModelLoaderFactory$Factory:build	(Ljava/util/List;Landroid/support/v4/util/Pools$Pool;)Lcom/bumptech/glide/load/model/MultiModelLoader;
    //   140: astore_1
    //   141: aload_0
    //   142: monitorexit
    //   143: aload_1
    //   144: areturn
    //   145: aload 4
    //   147: invokeinterface 76 1 0
    //   152: iconst_1
    //   153: if_icmpne +19 -> 172
    //   156: aload 4
    //   158: iconst_0
    //   159: invokeinterface 151 2 0
    //   164: checkcast 98	com/bumptech/glide/load/model/ModelLoader
    //   167: astore_1
    //   168: aload_0
    //   169: monitorexit
    //   170: aload_1
    //   171: areturn
    //   172: iload_3
    //   173: ifeq +11 -> 184
    //   176: invokestatic 153	com/bumptech/glide/load/model/MultiModelLoaderFactory:emptyModelLoader	()Lcom/bumptech/glide/load/model/ModelLoader;
    //   179: astore_1
    //   180: aload_0
    //   181: monitorexit
    //   182: aload_1
    //   183: areturn
    //   184: new 155	com/bumptech/glide/Registry$NoModelLoaderAvailableException
    //   187: dup
    //   188: aload_1
    //   189: aload_2
    //   190: invokespecial 158	com/bumptech/glide/Registry$NoModelLoaderAvailableException:<init>	(Ljava/lang/Class;Ljava/lang/Class;)V
    //   193: athrow
    //   194: astore_1
    //   195: goto +15 -> 210
    //   198: astore_1
    //   199: aload_0
    //   200: getfield 59	com/bumptech/glide/load/model/MultiModelLoaderFactory:alreadyUsedEntries	Ljava/util/Set;
    //   203: invokeinterface 161 1 0
    //   208: aload_1
    //   209: athrow
    //   210: aload_0
    //   211: monitorexit
    //   212: aload_1
    //   213: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	214	0	this	MultiModelLoaderFactory
    //   0	214	1	paramClass	Class<Model>
    //   0	214	2	paramClass1	Class<Data>
    //   23	150	3	i	int
    //   9	148	4	localArrayList	ArrayList
    //   20	15	5	localIterator	Iterator
    //   44	62	6	localEntry	Entry
    // Exception table:
    //   from	to	target	type
    //   2	22	194	finally
    //   24	60	194	finally
    //   65	113	194	finally
    //   116	141	194	finally
    //   145	168	194	finally
    //   176	180	194	finally
    //   184	194	194	finally
    //   199	210	194	finally
    //   2	22	198	java/lang/Throwable
    //   24	60	198	java/lang/Throwable
    //   65	113	198	java/lang/Throwable
    //   116	141	198	java/lang/Throwable
    //   145	168	198	java/lang/Throwable
    //   176	180	198	java/lang/Throwable
    //   184	194	198	java/lang/Throwable
  }
  
  /* Error */
  @NonNull
  <Model> List<ModelLoader<Model, ?>> build(@NonNull Class<Model> paramClass)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 51	java/util/ArrayList
    //   5: dup
    //   6: invokespecial 52	java/util/ArrayList:<init>	()V
    //   9: astore_2
    //   10: aload_0
    //   11: getfield 54	com/bumptech/glide/load/model/MultiModelLoaderFactory:entries	Ljava/util/List;
    //   14: invokeinterface 116 1 0
    //   19: astore_3
    //   20: aload_3
    //   21: invokeinterface 122 1 0
    //   26: ifeq +77 -> 103
    //   29: aload_3
    //   30: invokeinterface 126 1 0
    //   35: checkcast 9	com/bumptech/glide/load/model/MultiModelLoaderFactory$Entry
    //   38: astore 4
    //   40: aload_0
    //   41: getfield 59	com/bumptech/glide/load/model/MultiModelLoaderFactory:alreadyUsedEntries	Ljava/util/Set;
    //   44: aload 4
    //   46: invokeinterface 132 2 0
    //   51: ifne -31 -> 20
    //   54: aload 4
    //   56: aload_1
    //   57: invokevirtual 166	com/bumptech/glide/load/model/MultiModelLoaderFactory$Entry:handles	(Ljava/lang/Class;)Z
    //   60: ifeq -40 -> 20
    //   63: aload_0
    //   64: getfield 59	com/bumptech/glide/load/model/MultiModelLoaderFactory:alreadyUsedEntries	Ljava/util/Set;
    //   67: aload 4
    //   69: invokeinterface 138 2 0
    //   74: pop
    //   75: aload_2
    //   76: aload_0
    //   77: aload 4
    //   79: invokespecial 140	com/bumptech/glide/load/model/MultiModelLoaderFactory:build	(Lcom/bumptech/glide/load/model/MultiModelLoaderFactory$Entry;)Lcom/bumptech/glide/load/model/ModelLoader;
    //   82: invokeinterface 141 2 0
    //   87: pop
    //   88: aload_0
    //   89: getfield 59	com/bumptech/glide/load/model/MultiModelLoaderFactory:alreadyUsedEntries	Ljava/util/Set;
    //   92: aload 4
    //   94: invokeinterface 144 2 0
    //   99: pop
    //   100: goto -80 -> 20
    //   103: aload_0
    //   104: monitorexit
    //   105: aload_2
    //   106: areturn
    //   107: astore_1
    //   108: goto +15 -> 123
    //   111: astore_1
    //   112: aload_0
    //   113: getfield 59	com/bumptech/glide/load/model/MultiModelLoaderFactory:alreadyUsedEntries	Ljava/util/Set;
    //   116: invokeinterface 161 1 0
    //   121: aload_1
    //   122: athrow
    //   123: aload_0
    //   124: monitorexit
    //   125: aload_1
    //   126: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	this	MultiModelLoaderFactory
    //   0	127	1	paramClass	Class<Model>
    //   9	97	2	localArrayList	ArrayList
    //   19	11	3	localIterator	Iterator
    //   38	55	4	localEntry	Entry
    // Exception table:
    //   from	to	target	type
    //   2	20	107	finally
    //   20	100	107	finally
    //   112	123	107	finally
    //   2	20	111	java/lang/Throwable
    //   20	100	111	java/lang/Throwable
  }
  
  @NonNull
  List<Class<?>> getDataClasses(@NonNull Class<?> paramClass)
  {
    try
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = this.entries.iterator();
      while (localIterator.hasNext())
      {
        Entry localEntry = (Entry)localIterator.next();
        if ((!localArrayList.contains(localEntry.dataClass)) && (localEntry.handles(paramClass))) {
          localArrayList.add(localEntry.dataClass);
        }
      }
      return localArrayList;
    }
    finally {}
  }
  
  <Model, Data> void prepend(@NonNull Class<Model> paramClass, @NonNull Class<Data> paramClass1, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> paramModelLoaderFactory)
  {
    try
    {
      add(paramClass, paramClass1, paramModelLoaderFactory, false);
      return;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  @NonNull
  <Model, Data> List<ModelLoaderFactory<? extends Model, ? extends Data>> remove(@NonNull Class<Model> paramClass, @NonNull Class<Data> paramClass1)
  {
    try
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = this.entries.iterator();
      while (localIterator.hasNext())
      {
        Entry localEntry = (Entry)localIterator.next();
        if (localEntry.handles(paramClass, paramClass1))
        {
          localIterator.remove();
          localArrayList.add(getFactory(localEntry));
        }
      }
      return localArrayList;
    }
    finally {}
  }
  
  @NonNull
  <Model, Data> List<ModelLoaderFactory<? extends Model, ? extends Data>> replace(@NonNull Class<Model> paramClass, @NonNull Class<Data> paramClass1, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> paramModelLoaderFactory)
  {
    try
    {
      List localList = remove(paramClass, paramClass1);
      append(paramClass, paramClass1, paramModelLoaderFactory);
      return localList;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  static class EmptyModelLoader
    implements ModelLoader<Object, Object>
  {
    @Nullable
    public ModelLoader.LoadData<Object> buildLoadData(@NonNull Object paramObject, int paramInt1, int paramInt2, @NonNull Options paramOptions)
    {
      return null;
    }
    
    public boolean handles(@NonNull Object paramObject)
    {
      return false;
    }
  }
  
  static class Entry<Model, Data>
  {
    final Class<Data> dataClass;
    final ModelLoaderFactory<? extends Model, ? extends Data> factory;
    private final Class<Model> modelClass;
    
    public Entry(@NonNull Class<Model> paramClass, @NonNull Class<Data> paramClass1, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> paramModelLoaderFactory)
    {
      this.modelClass = paramClass;
      this.dataClass = paramClass1;
      this.factory = paramModelLoaderFactory;
    }
    
    public boolean handles(@NonNull Class<?> paramClass)
    {
      return this.modelClass.isAssignableFrom(paramClass);
    }
    
    public boolean handles(@NonNull Class<?> paramClass1, @NonNull Class<?> paramClass2)
    {
      return (handles(paramClass1)) && (this.dataClass.isAssignableFrom(paramClass2));
    }
  }
  
  static class Factory
  {
    @NonNull
    public <Model, Data> MultiModelLoader<Model, Data> build(@NonNull List<ModelLoader<Model, Data>> paramList, @NonNull Pools.Pool<List<Throwable>> paramPool)
    {
      return new MultiModelLoader(paramList, paramPool);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/model/MultiModelLoaderFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */