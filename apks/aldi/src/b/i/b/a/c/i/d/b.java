package b.i.b.a.c.i.d;

import b.i.b.a.c.f.a;
import b.i.b.a.c.f.c;

public final class b
{
  public final String a;
  private b.i.b.a.c.f.b b;
  
  private b(String paramString)
  {
    this.a = paramString;
  }
  
  public static b a(a parama)
  {
    b.i.b.a.c.f.b localb = parama.a;
    parama = parama.b.b.a.replace('.', '$');
    if (localb.a()) {
      return new b(parama);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(localb.b.a.replace('.', '/'));
    localStringBuilder.append("/");
    localStringBuilder.append(parama);
    return new b(localStringBuilder.toString());
  }
  
  public static b a(b.i.b.a.c.f.b paramb)
  {
    b localb = new b(paramb.b.a.replace('.', '/'));
    localb.b = paramb;
    return localb;
  }
  
  public static b a(String paramString)
  {
    return new b(paramString);
  }
  
  public final b.i.b.a.c.f.b a()
  {
    int i = this.a.lastIndexOf("/");
    if (i == -1) {
      return b.i.b.a.c.f.b.a;
    }
    return new b.i.b.a.c.f.b(this.a.substring(0, i).replace('/', '.'));
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass())) {
      return this.a.equals(((b)paramObject).a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.a.hashCode();
  }
  
  public final String toString()
  {
    return this.a;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */