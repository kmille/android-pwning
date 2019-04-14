package b.i.b.a.c.j.a;

import b.f.b.j;
import b.i.b.a.c.b.am;
import b.i.b.a.c.e.a.c;
import b.i.b.a.c.e.a.a;
import b.i.b.a.c.e.a.c;

public final class e
{
  final c a;
  final a.c b;
  final a c;
  final am d;
  
  public e(c paramc, a.c paramc1, a parama, am paramam)
  {
    this.a = paramc;
    this.b = paramc1;
    this.c = parama;
    this.d = paramam;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof e))
      {
        paramObject = (e)paramObject;
        if ((j.a(this.a, ((e)paramObject).a)) && (j.a(this.b, ((e)paramObject).b)) && (j.a(this.c, ((e)paramObject).c)) && (j.a(this.d, ((e)paramObject).d))) {}
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
    StringBuilder localStringBuilder = new StringBuilder("ClassData(nameResolver=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", classProto=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", metadataVersion=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", sourceElement=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/j/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */