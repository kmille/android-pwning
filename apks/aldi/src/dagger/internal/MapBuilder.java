package dagger.internal;

import java.util.Collections;
import java.util.Map;

public final class MapBuilder<K, V>
{
  private final Map<K, V> contributions;
  
  private MapBuilder(int paramInt)
  {
    this.contributions = DaggerCollections.newLinkedHashMapWithExpectedSize(paramInt);
  }
  
  public static <K, V> MapBuilder<K, V> newMapBuilder(int paramInt)
  {
    return new MapBuilder(paramInt);
  }
  
  public final Map<K, V> build()
  {
    if (this.contributions.size() != 0) {
      return Collections.unmodifiableMap(this.contributions);
    }
    return Collections.emptyMap();
  }
  
  public final MapBuilder<K, V> put(K paramK, V paramV)
  {
    this.contributions.put(paramK, paramV);
    return this;
  }
  
  public final MapBuilder<K, V> putAll(Map<K, V> paramMap)
  {
    this.contributions.putAll(paramMap);
    return this;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/internal/MapBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */