package dagger.internal;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.inject.Provider;

public final class MapFactory<K, V>
  implements Factory<Map<K, V>>
{
  private static final Provider<Map<Object, Object>> EMPTY = InstanceFactory.create(Collections.emptyMap());
  private final Map<K, Provider<V>> contributingMap;
  
  private MapFactory(Map<K, Provider<V>> paramMap)
  {
    this.contributingMap = Collections.unmodifiableMap(paramMap);
  }
  
  public static <K, V> Builder<K, V> builder(int paramInt)
  {
    return new Builder(paramInt, null);
  }
  
  public static <K, V> Provider<Map<K, V>> emptyMapProvider()
  {
    return EMPTY;
  }
  
  public final Map<K, V> get()
  {
    LinkedHashMap localLinkedHashMap = DaggerCollections.newLinkedHashMapWithExpectedSize(this.contributingMap.size());
    Iterator localIterator = this.contributingMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localLinkedHashMap.put(localEntry.getKey(), ((Provider)localEntry.getValue()).get());
    }
    return Collections.unmodifiableMap(localLinkedHashMap);
  }
  
  public static final class Builder<K, V>
  {
    private final LinkedHashMap<K, Provider<V>> map;
    
    private Builder(int paramInt)
    {
      this.map = DaggerCollections.newLinkedHashMapWithExpectedSize(paramInt);
    }
    
    public final MapFactory<K, V> build()
    {
      return new MapFactory(this.map, null);
    }
    
    public final Builder<K, V> put(K paramK, Provider<V> paramProvider)
    {
      this.map.put(Preconditions.checkNotNull(paramK, "key"), Preconditions.checkNotNull(paramProvider, "provider"));
      return this;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/internal/MapFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */