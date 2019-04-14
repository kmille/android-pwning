package b.i.b.a.c.j.a;

import b.f.b.j;

public final class o<T extends b.i.b.a.c.e.a.a>
{
  private final T a;
  private final T b;
  private final String c;
  private final b.i.b.a.c.f.a d;
  
  public o(T paramT1, T paramT2, String paramString, b.i.b.a.c.f.a parama)
  {
    this.a = paramT1;
    this.b = paramT2;
    this.c = paramString;
    this.d = parama;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof o))
      {
        paramObject = (o)paramObject;
        if ((j.a(this.a, ((o)paramObject).a)) && (j.a(this.b, ((o)paramObject).b)) && (j.a(this.c, ((o)paramObject).c)) && (j.a(this.d, ((o)paramObject).d))) {}
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
    int m = 0;
    int i;
    if (localObject != null) {
      i = localObject.hashCode();
    } else {
      i = 0;
    }
    localObject = this.b;
    int j;
    if (localObject != null) {
      j = localObject.hashCode();
    } else {
      j = 0;
    }
    localObject = this.c;
    int k;
    if (localObject != null) {
      k = localObject.hashCode();
    } else {
      k = 0;
    }
    localObject = this.d;
    if (localObject != null) {
      m = localObject.hashCode();
    }
    return ((i * 31 + j) * 31 + k) * 31 + m;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", expectedVersion=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", filePath=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", classId=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/j/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */