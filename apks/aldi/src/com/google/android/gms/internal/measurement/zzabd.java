package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzabd<K extends Comparable<K>, V>
  extends AbstractMap<K, V>
{
  private boolean zzbnw;
  private final int zzbwe;
  private List<zzabi> zzbwf;
  private Map<K, V> zzbwg;
  private volatile zzabk zzbwh;
  private Map<K, V> zzbwi;
  
  private zzabd(int paramInt)
  {
    this.zzbwe = paramInt;
    this.zzbwf = Collections.emptyList();
    this.zzbwg = Collections.emptyMap();
    this.zzbwi = Collections.emptyMap();
  }
  
  private final int zza(K paramK)
  {
    int j = this.zzbwf.size() - 1;
    if (j >= 0)
    {
      i = paramK.compareTo((Comparable)((zzabi)this.zzbwf.get(j)).getKey());
      if (i > 0) {
        return -(j + 2);
      }
      if (i == 0) {
        return j;
      }
    }
    int i = 0;
    while (i <= j)
    {
      int k = (i + j) / 2;
      int m = paramK.compareTo((Comparable)((zzabi)this.zzbwf.get(k)).getKey());
      if (m < 0) {
        j = k - 1;
      } else if (m > 0) {
        i = k + 1;
      } else {
        return k;
      }
    }
    return -(i + 1);
  }
  
  static <FieldDescriptorType extends zzzt<FieldDescriptorType>> zzabd<FieldDescriptorType, Object> zzag(int paramInt)
  {
    return new zzabe(paramInt);
  }
  
  private final V zzai(int paramInt)
  {
    zzva();
    Object localObject = ((zzabi)this.zzbwf.remove(paramInt)).getValue();
    if (!this.zzbwg.isEmpty())
    {
      Iterator localIterator = zzvb().entrySet().iterator();
      this.zzbwf.add(new zzabi(this, (Map.Entry)localIterator.next()));
      localIterator.remove();
    }
    return (V)localObject;
  }
  
  private final void zzva()
  {
    if (!this.zzbnw) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  private final SortedMap<K, V> zzvb()
  {
    zzva();
    if ((this.zzbwg.isEmpty()) && (!(this.zzbwg instanceof TreeMap)))
    {
      this.zzbwg = new TreeMap();
      this.zzbwi = ((TreeMap)this.zzbwg).descendingMap();
    }
    return (SortedMap)this.zzbwg;
  }
  
  public void clear()
  {
    zzva();
    if (!this.zzbwf.isEmpty()) {
      this.zzbwf.clear();
    }
    if (!this.zzbwg.isEmpty()) {
      this.zzbwg.clear();
    }
  }
  
  public boolean containsKey(Object paramObject)
  {
    paramObject = (Comparable)paramObject;
    return (zza((Comparable)paramObject) >= 0) || (this.zzbwg.containsKey(paramObject));
  }
  
  public Set<Map.Entry<K, V>> entrySet()
  {
    if (this.zzbwh == null) {
      this.zzbwh = new zzabk(this, null);
    }
    return this.zzbwh;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzabd)) {
      return super.equals(paramObject);
    }
    paramObject = (zzabd)paramObject;
    int j = size();
    if (j != ((zzabd)paramObject).size()) {
      return false;
    }
    int k = zzuy();
    if (k != ((zzabd)paramObject).zzuy()) {
      return entrySet().equals(((zzabd)paramObject).entrySet());
    }
    int i = 0;
    while (i < k)
    {
      if (!zzah(i).equals(((zzabd)paramObject).zzah(i))) {
        return false;
      }
      i += 1;
    }
    if (k != j) {
      return this.zzbwg.equals(((zzabd)paramObject).zzbwg);
    }
    return true;
  }
  
  public V get(Object paramObject)
  {
    paramObject = (Comparable)paramObject;
    int i = zza((Comparable)paramObject);
    if (i >= 0) {
      return (V)((zzabi)this.zzbwf.get(i)).getValue();
    }
    return (V)this.zzbwg.get(paramObject);
  }
  
  public int hashCode()
  {
    int k = zzuy();
    int j = 0;
    int i = 0;
    while (j < k)
    {
      i += ((zzabi)this.zzbwf.get(j)).hashCode();
      j += 1;
    }
    j = i;
    if (this.zzbwg.size() > 0) {
      j = i + this.zzbwg.hashCode();
    }
    return j;
  }
  
  public final boolean isImmutable()
  {
    return this.zzbnw;
  }
  
  public V remove(Object paramObject)
  {
    zzva();
    paramObject = (Comparable)paramObject;
    int i = zza((Comparable)paramObject);
    if (i >= 0) {
      return (V)zzai(i);
    }
    if (this.zzbwg.isEmpty()) {
      return null;
    }
    return (V)this.zzbwg.remove(paramObject);
  }
  
  public int size()
  {
    return this.zzbwf.size() + this.zzbwg.size();
  }
  
  public final V zza(K paramK, V paramV)
  {
    zzva();
    int i = zza(paramK);
    if (i >= 0) {
      return (V)((zzabi)this.zzbwf.get(i)).setValue(paramV);
    }
    zzva();
    if ((this.zzbwf.isEmpty()) && (!(this.zzbwf instanceof ArrayList))) {
      this.zzbwf = new ArrayList(this.zzbwe);
    }
    i = -(i + 1);
    if (i >= this.zzbwe) {
      return (V)zzvb().put(paramK, paramV);
    }
    if (this.zzbwf.size() == this.zzbwe)
    {
      zzabi localzzabi = (zzabi)this.zzbwf.remove(this.zzbwe - 1);
      zzvb().put((Comparable)localzzabi.getKey(), localzzabi.getValue());
    }
    this.zzbwf.add(i, new zzabi(this, paramK, paramV));
    return null;
  }
  
  public final Map.Entry<K, V> zzah(int paramInt)
  {
    return (Map.Entry)this.zzbwf.get(paramInt);
  }
  
  public void zzru()
  {
    if (!this.zzbnw)
    {
      Map localMap;
      if (this.zzbwg.isEmpty()) {
        localMap = Collections.emptyMap();
      } else {
        localMap = Collections.unmodifiableMap(this.zzbwg);
      }
      this.zzbwg = localMap;
      if (this.zzbwi.isEmpty()) {
        localMap = Collections.emptyMap();
      } else {
        localMap = Collections.unmodifiableMap(this.zzbwi);
      }
      this.zzbwi = localMap;
      this.zzbnw = true;
    }
  }
  
  public final int zzuy()
  {
    return this.zzbwf.size();
  }
  
  public final Iterable<Map.Entry<K, V>> zzuz()
  {
    if (this.zzbwg.isEmpty()) {
      return zzabf.zzvc();
    }
    return this.zzbwg.entrySet();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzabd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */