package dagger.internal;

import dagger.Lazy;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;

public final class MapProviderFactory<K, V>
  implements Lazy<Map<K, Provider<V>>>, Factory<Map<K, Provider<V>>>
{
  private final Map<K, Provider<V>> contributingMap;
  
  private MapProviderFactory(Map<K, Provider<V>> paramMap)
  {
    this.contributingMap = Collections.unmodifiableMap(paramMap);
  }
  
  public static <K, V> Builder<K, V> builder(int paramInt)
  {
    return new Builder(paramInt, null);
  }
  
  public final Map<K, Provider<V>> get()
  {
    return this.contributingMap;
  }
  
  public static final class Builder<K, V>
  {
    private final LinkedHashMap<K, Provider<V>> map;
    
    private Builder(int paramInt)
    {
      this.map = DaggerCollections.newLinkedHashMapWithExpectedSize(paramInt);
    }
    
    public final MapProviderFactory<K, V> build()
    {
      return new MapProviderFactory(this.map, null);
    }
    
    public final Builder<K, V> put(K paramK, Provider<V> paramProvider)
    {
      this.map.put(Preconditions.checkNotNull(paramK, "key"), Preconditions.checkNotNull(paramProvider, "provider"));
      return this;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/internal/MapProviderFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */