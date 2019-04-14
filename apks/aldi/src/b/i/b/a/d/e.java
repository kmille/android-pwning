package b.i.b.a.d;

import java.io.Serializable;

public final class e<K, V>
  implements Serializable
{
  public final K a;
  public final V b;
  
  public e(K paramK, V paramV)
  {
    this.a = paramK;
    this.b = paramV;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof e)) {
      return false;
    }
    paramObject = (e)paramObject;
    return (this.a == null ? ((e)paramObject).a == null : this.a.equals(((e)paramObject).a)) && (this.b == null ? ((e)paramObject).b == null : this.b.equals(((e)paramObject).b));
  }
  
  public final int hashCode()
  {
    Object localObject = this.a;
    int j = 0;
    int i;
    if (localObject == null) {
      i = 0;
    } else {
      i = this.a.hashCode();
    }
    if (this.b != null) {
      j = this.b.hashCode();
    }
    return i ^ j;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a);
    localStringBuilder.append("=");
    localStringBuilder.append(this.b);
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */