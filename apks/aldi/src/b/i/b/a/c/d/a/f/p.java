package b.i.b.a.c.d.a.f;

import b.f.b.j;
import b.i.b.a.c.l.w;

final class p
{
  final w a;
  final d b;
  
  public p(w paramw, d paramd)
  {
    this.a = paramw;
    this.b = paramd;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof p))
      {
        paramObject = (p)paramObject;
        if ((j.a(this.a, ((p)paramObject).a)) && (j.a(this.b, ((p)paramObject).b))) {}
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
    StringBuilder localStringBuilder = new StringBuilder("TypeAndDefaultQualifiers(type=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", defaultQualifiers=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/f/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */