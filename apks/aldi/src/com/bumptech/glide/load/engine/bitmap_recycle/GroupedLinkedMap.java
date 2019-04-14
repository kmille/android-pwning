package com.bumptech.glide.load.engine.bitmap_recycle;

import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupedLinkedMap<K extends Poolable, V>
{
  private final LinkedEntry<K, V> head = new LinkedEntry();
  private final Map<K, LinkedEntry<K, V>> keyToEntry = new HashMap();
  
  private void makeHead(LinkedEntry<K, V> paramLinkedEntry)
  {
    removeEntry(paramLinkedEntry);
    paramLinkedEntry.prev = this.head;
    paramLinkedEntry.next = this.head.next;
    updateEntry(paramLinkedEntry);
  }
  
  private void makeTail(LinkedEntry<K, V> paramLinkedEntry)
  {
    removeEntry(paramLinkedEntry);
    paramLinkedEntry.prev = this.head.prev;
    paramLinkedEntry.next = this.head;
    updateEntry(paramLinkedEntry);
  }
  
  private static <K, V> void removeEntry(LinkedEntry<K, V> paramLinkedEntry)
  {
    paramLinkedEntry.prev.next = paramLinkedEntry.next;
    paramLinkedEntry.next.prev = paramLinkedEntry.prev;
  }
  
  private static <K, V> void updateEntry(LinkedEntry<K, V> paramLinkedEntry)
  {
    paramLinkedEntry.next.prev = paramLinkedEntry;
    paramLinkedEntry.prev.next = paramLinkedEntry;
  }
  
  @Nullable
  public V get(K paramK)
  {
    LinkedEntry localLinkedEntry = (LinkedEntry)this.keyToEntry.get(paramK);
    if (localLinkedEntry == null)
    {
      localLinkedEntry = new LinkedEntry(paramK);
      this.keyToEntry.put(paramK, localLinkedEntry);
      paramK = localLinkedEntry;
    }
    else
    {
      paramK.offer();
      paramK = localLinkedEntry;
    }
    makeHead(paramK);
    return (V)paramK.removeLast();
  }
  
  public void put(K paramK, V paramV)
  {
    LinkedEntry localLinkedEntry = (LinkedEntry)this.keyToEntry.get(paramK);
    if (localLinkedEntry == null)
    {
      localLinkedEntry = new LinkedEntry(paramK);
      makeTail(localLinkedEntry);
      this.keyToEntry.put(paramK, localLinkedEntry);
      paramK = localLinkedEntry;
    }
    else
    {
      paramK.offer();
      paramK = localLinkedEntry;
    }
    paramK.add(paramV);
  }
  
  @Nullable
  public V removeLast()
  {
    LinkedEntry localLinkedEntry = this.head;
    for (;;)
    {
      localLinkedEntry = localLinkedEntry.prev;
      if (localLinkedEntry.equals(this.head)) {
        break;
      }
      Object localObject = localLinkedEntry.removeLast();
      if (localObject != null) {
        return (V)localObject;
      }
      removeEntry(localLinkedEntry);
      this.keyToEntry.remove(localLinkedEntry.key);
      ((Poolable)localLinkedEntry.key).offer();
    }
    return null;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("GroupedLinkedMap( ");
    LinkedEntry localLinkedEntry = this.head.next;
    int i = 0;
    while (!localLinkedEntry.equals(this.head))
    {
      i = 1;
      localStringBuilder.append('{');
      localStringBuilder.append(localLinkedEntry.key);
      localStringBuilder.append(':');
      localStringBuilder.append(localLinkedEntry.size());
      localStringBuilder.append("}, ");
      localLinkedEntry = localLinkedEntry.next;
    }
    if (i != 0) {
      localStringBuilder.delete(localStringBuilder.length() - 2, localStringBuilder.length());
    }
    localStringBuilder.append(" )");
    return localStringBuilder.toString();
  }
  
  static class LinkedEntry<K, V>
  {
    final K key;
    LinkedEntry<K, V> next = this;
    LinkedEntry<K, V> prev = this;
    private List<V> values;
    
    LinkedEntry()
    {
      this(null);
    }
    
    LinkedEntry(K paramK)
    {
      this.key = paramK;
    }
    
    public void add(V paramV)
    {
      if (this.values == null) {
        this.values = new ArrayList();
      }
      this.values.add(paramV);
    }
    
    @Nullable
    public V removeLast()
    {
      int i = size();
      if (i > 0) {
        return (V)this.values.remove(i - 1);
      }
      return null;
    }
    
    public int size()
    {
      if (this.values != null) {
        return this.values.size();
      }
      return 0;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/bitmap_recycle/GroupedLinkedMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */