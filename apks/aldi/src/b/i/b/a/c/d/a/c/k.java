package b.i.b.a.c.d.a.c;

import b.f.b.j;
import b.i.b.a.c.d.a.a.a;
import b.i.b.a.c.d.a.f.h;
import java.util.Collection;

public final class k
{
  public final h a;
  public final Collection<a.a> b;
  
  public k(h paramh, Collection<? extends a.a> paramCollection)
  {
    this.a = paramh;
    this.b = paramCollection;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof k))
      {
        paramObject = (k)paramObject;
        if ((j.a(this.a, ((k)paramObject).a)) && (j.a(this.b, ((k)paramObject).b))) {}
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
    StringBuilder localStringBuilder = new StringBuilder("NullabilityQualifierWithApplicability(nullabilityQualifier=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", qualifierApplicabilityTypes=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/c/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */