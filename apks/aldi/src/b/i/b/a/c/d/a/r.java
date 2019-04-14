package b.i.b.a.c.d.a;

import b.f.b.j;
import b.i.b.a.c.f.f;

final class r
{
  final f a;
  final String b;
  
  public r(f paramf, String paramString)
  {
    this.a = paramf;
    this.b = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof r))
      {
        paramObject = (r)paramObject;
        if ((j.a(this.a, ((r)paramObject).a)) && (j.a(this.b, ((r)paramObject).b))) {}
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
    StringBuilder localStringBuilder = new StringBuilder("NameAndSignature(name=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", signature=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */