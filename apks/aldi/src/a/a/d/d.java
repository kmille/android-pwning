package a.a.d;

import java.util.Iterator;

public final class d<T>
  implements Iterable<T>
{
  private final Iterable<T> a;
  
  private d(Iterable<T> paramIterable)
  {
    this.a = paramIterable;
  }
  
  public static <T> d<T> a(Iterable<T> paramIterable)
  {
    return new d(paramIterable);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject != null)
    {
      if (getClass() != paramObject.getClass()) {
        return false;
      }
      paramObject = (d)paramObject;
      if (this.a != null)
      {
        if (!this.a.equals(((d)paramObject).a)) {
          return false;
        }
      }
      else {
        if (((d)paramObject).a != null) {
          break label61;
        }
      }
      return true;
    }
    label61:
    return false;
  }
  
  public final int hashCode()
  {
    if (this.a != null) {
      return this.a.hashCode();
    }
    return 0;
  }
  
  public final Iterator<T> iterator()
  {
    return this.a.iterator();
  }
  
  public final String toString()
  {
    return this.a.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/a/a/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */