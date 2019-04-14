package b.i.b.a.c.l.d;

import b.f.b.j;

public final class a<T>
{
  final T a;
  public final T b;
  
  public a(T paramT1, T paramT2)
  {
    this.a = paramT1;
    this.b = paramT2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((j.a(this.a, ((a)paramObject).a)) && (j.a(this.b, ((a)paramObject).b))) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public final int hashCode()
  {
    Object localObject = this.a;
    int j = 0;
    int i;
    if (localObject != null) {
      i = localObject.hashCode();
    } else {
      i = 0;
    }
    localObject = this.b;
    if (localObject != null) {
      j = localObject.hashCode();
    }
    return i * 31 + j;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ApproximationBounds(lower=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", upper=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */