package android.arch.core.internal;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

@RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class SafeIterableMap<K, V>
  implements Iterable<Map.Entry<K, V>>
{
  private Entry<K, V> mEnd;
  private WeakHashMap<SupportRemove<K, V>, Boolean> mIterators = new WeakHashMap();
  private int mSize = 0;
  private Entry<K, V> mStart;
  
  public Iterator<Map.Entry<K, V>> descendingIterator()
  {
    DescendingIterator localDescendingIterator = new DescendingIterator(this.mEnd, this.mStart);
    this.mIterators.put(localDescendingIterator, Boolean.FALSE);
    return localDescendingIterator;
  }
  
  public Map.Entry<K, V> eldest()
  {
    return this.mStart;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof SafeIterableMap)) {
      return false;
    }
    Object localObject1 = (SafeIterableMap)paramObject;
    if (size() != ((SafeIterableMap)localObject1).size()) {
      return false;
    }
    paramObject = iterator();
    localObject1 = ((SafeIterableMap)localObject1).iterator();
    while ((((Iterator)paramObject).hasNext()) && (((Iterator)localObject1).hasNext()))
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)paramObject).next();
      Object localObject2 = ((Iterator)localObject1).next();
      if (((localEntry == null) && (localObject2 != null)) || ((localEntry != null) && (!localEntry.equals(localObject2)))) {
        return false;
      }
    }
    return (!((Iterator)paramObject).hasNext()) && (!((Iterator)localObject1).hasNext());
  }
  
  protected Entry<K, V> get(K paramK)
  {
    for (Entry localEntry = this.mStart; (localEntry != null) && (!localEntry.mKey.equals(paramK)); localEntry = localEntry.mNext) {}
    return localEntry;
  }
  
  @NonNull
  public Iterator<Map.Entry<K, V>> iterator()
  {
    AscendingIterator localAscendingIterator = new AscendingIterator(this.mStart, this.mEnd);
    this.mIterators.put(localAscendingIterator, Boolean.FALSE);
    return localAscendingIterator;
  }
  
  public SafeIterableMap<K, V>.IteratorWithAdditions iteratorWithAdditions()
  {
    IteratorWithAdditions localIteratorWithAdditions = new IteratorWithAdditions(null);
    this.mIterators.put(localIteratorWithAdditions, Boolean.FALSE);
    return localIteratorWithAdditions;
  }
  
  public Map.Entry<K, V> newest()
  {
    return this.mEnd;
  }
  
  protected Entry<K, V> put(@NonNull K paramK, @NonNull V paramV)
  {
    paramK = new Entry(paramK, paramV);
    this.mSize += 1;
    if (this.mEnd == null)
    {
      this.mStart = paramK;
      this.mEnd = this.mStart;
      return paramK;
    }
    this.mEnd.mNext = paramK;
    paramK.mPrevious = this.mEnd;
    this.mEnd = paramK;
    return paramK;
  }
  
  public V putIfAbsent(@NonNull K paramK, @NonNull V paramV)
  {
    Entry localEntry = get(paramK);
    if (localEntry != null) {
      return (V)localEntry.mValue;
    }
    put(paramK, paramV);
    return null;
  }
  
  public V remove(@NonNull K paramK)
  {
    paramK = get(paramK);
    if (paramK == null) {
      return null;
    }
    this.mSize -= 1;
    if (!this.mIterators.isEmpty())
    {
      Iterator localIterator = this.mIterators.keySet().iterator();
      while (localIterator.hasNext()) {
        ((SupportRemove)localIterator.next()).supportRemove(paramK);
      }
    }
    if (paramK.mPrevious != null) {
      paramK.mPrevious.mNext = paramK.mNext;
    } else {
      this.mStart = paramK.mNext;
    }
    if (paramK.mNext != null) {
      paramK.mNext.mPrevious = paramK.mPrevious;
    } else {
      this.mEnd = paramK.mPrevious;
    }
    paramK.mNext = null;
    paramK.mPrevious = null;
    return (V)paramK.mValue;
  }
  
  public int size()
  {
    return this.mSize;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      localStringBuilder.append(((Map.Entry)localIterator.next()).toString());
      if (localIterator.hasNext()) {
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  static class AscendingIterator<K, V>
    extends SafeIterableMap.ListIterator<K, V>
  {
    AscendingIterator(SafeIterableMap.Entry<K, V> paramEntry1, SafeIterableMap.Entry<K, V> paramEntry2)
    {
      super(paramEntry2);
    }
    
    SafeIterableMap.Entry<K, V> backward(SafeIterableMap.Entry<K, V> paramEntry)
    {
      return paramEntry.mPrevious;
    }
    
    SafeIterableMap.Entry<K, V> forward(SafeIterableMap.Entry<K, V> paramEntry)
    {
      return paramEntry.mNext;
    }
  }
  
  static class DescendingIterator<K, V>
    extends SafeIterableMap.ListIterator<K, V>
  {
    DescendingIterator(SafeIterableMap.Entry<K, V> paramEntry1, SafeIterableMap.Entry<K, V> paramEntry2)
    {
      super(paramEntry2);
    }
    
    SafeIterableMap.Entry<K, V> backward(SafeIterableMap.Entry<K, V> paramEntry)
    {
      return paramEntry.mNext;
    }
    
    SafeIterableMap.Entry<K, V> forward(SafeIterableMap.Entry<K, V> paramEntry)
    {
      return paramEntry.mPrevious;
    }
  }
  
  static class Entry<K, V>
    implements Map.Entry<K, V>
  {
    @NonNull
    final K mKey;
    Entry<K, V> mNext;
    Entry<K, V> mPrevious;
    @NonNull
    final V mValue;
    
    Entry(@NonNull K paramK, @NonNull V paramV)
    {
      this.mKey = paramK;
      this.mValue = paramV;
    }
    
    public boolean equals(Object paramObject)
    {
      if (paramObject == this) {
        return true;
      }
      if (!(paramObject instanceof Entry)) {
        return false;
      }
      paramObject = (Entry)paramObject;
      return (this.mKey.equals(((Entry)paramObject).mKey)) && (this.mValue.equals(((Entry)paramObject).mValue));
    }
    
    @NonNull
    public K getKey()
    {
      return (K)this.mKey;
    }
    
    @NonNull
    public V getValue()
    {
      return (V)this.mValue;
    }
    
    public V setValue(V paramV)
    {
      throw new UnsupportedOperationException("An entry modification is not supported");
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(this.mKey);
      localStringBuilder.append("=");
      localStringBuilder.append(this.mValue);
      return localStringBuilder.toString();
    }
  }
  
  public class IteratorWithAdditions
    implements SafeIterableMap.SupportRemove<K, V>, Iterator<Map.Entry<K, V>>
  {
    private boolean mBeforeStart = true;
    private SafeIterableMap.Entry<K, V> mCurrent;
    
    private IteratorWithAdditions() {}
    
    public boolean hasNext()
    {
      if (this.mBeforeStart) {
        return SafeIterableMap.this.mStart != null;
      }
      return (this.mCurrent != null) && (this.mCurrent.mNext != null);
    }
    
    public Map.Entry<K, V> next()
    {
      SafeIterableMap.Entry localEntry;
      if (this.mBeforeStart)
      {
        this.mBeforeStart = false;
        localEntry = SafeIterableMap.this.mStart;
      }
      else if (this.mCurrent != null)
      {
        localEntry = this.mCurrent.mNext;
      }
      else
      {
        localEntry = null;
      }
      this.mCurrent = localEntry;
      return this.mCurrent;
    }
    
    public void supportRemove(@NonNull SafeIterableMap.Entry<K, V> paramEntry)
    {
      if (paramEntry == this.mCurrent)
      {
        this.mCurrent = this.mCurrent.mPrevious;
        boolean bool;
        if (this.mCurrent == null) {
          bool = true;
        } else {
          bool = false;
        }
        this.mBeforeStart = bool;
      }
    }
  }
  
  static abstract class ListIterator<K, V>
    implements SafeIterableMap.SupportRemove<K, V>, Iterator<Map.Entry<K, V>>
  {
    SafeIterableMap.Entry<K, V> mExpectedEnd;
    SafeIterableMap.Entry<K, V> mNext;
    
    ListIterator(SafeIterableMap.Entry<K, V> paramEntry1, SafeIterableMap.Entry<K, V> paramEntry2)
    {
      this.mExpectedEnd = paramEntry2;
      this.mNext = paramEntry1;
    }
    
    private SafeIterableMap.Entry<K, V> nextNode()
    {
      if ((this.mNext != this.mExpectedEnd) && (this.mExpectedEnd != null)) {
        return forward(this.mNext);
      }
      return null;
    }
    
    abstract SafeIterableMap.Entry<K, V> backward(SafeIterableMap.Entry<K, V> paramEntry);
    
    abstract SafeIterableMap.Entry<K, V> forward(SafeIterableMap.Entry<K, V> paramEntry);
    
    public boolean hasNext()
    {
      return this.mNext != null;
    }
    
    public Map.Entry<K, V> next()
    {
      SafeIterableMap.Entry localEntry = this.mNext;
      this.mNext = nextNode();
      return localEntry;
    }
    
    public void supportRemove(@NonNull SafeIterableMap.Entry<K, V> paramEntry)
    {
      if ((this.mExpectedEnd == paramEntry) && (paramEntry == this.mNext))
      {
        this.mNext = null;
        this.mExpectedEnd = null;
      }
      if (this.mExpectedEnd == paramEntry) {
        this.mExpectedEnd = backward(this.mExpectedEnd);
      }
      if (this.mNext == paramEntry) {
        this.mNext = nextNode();
      }
    }
  }
  
  static abstract interface SupportRemove<K, V>
  {
    public abstract void supportRemove(@NonNull SafeIterableMap.Entry<K, V> paramEntry);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/arch/core/internal/SafeIterableMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */