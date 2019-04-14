package b.i.b.a.c.g;

import java.util.Iterator;
import java.util.Map.Entry;

public final class l
  extends m
{
  private final q b;
  
  public final q a()
  {
    return a(this.b);
  }
  
  public final boolean equals(Object paramObject)
  {
    return a().equals(paramObject);
  }
  
  public final int hashCode()
  {
    return a().hashCode();
  }
  
  public final String toString()
  {
    return a().toString();
  }
  
  static final class a<K>
    implements Map.Entry<K, Object>
  {
    private Map.Entry<K, l> a;
    
    private a(Map.Entry<K, l> paramEntry)
    {
      this.a = paramEntry;
    }
    
    public final K getKey()
    {
      return (K)this.a.getKey();
    }
    
    public final Object getValue()
    {
      l locall = (l)this.a.getValue();
      if (locall == null) {
        return null;
      }
      return locall.a();
    }
    
    public final Object setValue(Object paramObject)
    {
      if ((paramObject instanceof q)) {
        return ((l)this.a.getValue()).b((q)paramObject);
      }
      throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
  }
  
  static final class b<K>
    implements Iterator<Map.Entry<K, Object>>
  {
    private Iterator<Map.Entry<K, Object>> a;
    
    public b(Iterator<Map.Entry<K, Object>> paramIterator)
    {
      this.a = paramIterator;
    }
    
    public final boolean hasNext()
    {
      return this.a.hasNext();
    }
    
    public final void remove()
    {
      this.a.remove();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/g/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */