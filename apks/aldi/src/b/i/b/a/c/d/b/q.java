package b.i.b.a.c.d.b;

import b.f.b.j;
import b.i.b.a.c.e.a.c;
import b.i.b.a.c.e.b.a.f;
import b.i.b.a.c.e.b.a.f.a;
import b.i.b.a.c.e.b.a.f.b;
import b.i.b.a.c.e.b.b.c;
import b.k;

public final class q
{
  public static final a b = new a((byte)0);
  final String a;
  
  private q(String paramString)
  {
    this.a = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof q))
      {
        paramObject = (q)paramObject;
        if (j.a(this.a, ((q)paramObject).a)) {}
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
    String str = this.a;
    if (str != null) {
      return str.hashCode();
    }
    return 0;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("MemberSignature(signature=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public static q a(q paramq, int paramInt)
    {
      j.b(paramq, "signature");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramq.a);
      localStringBuilder.append("@");
      localStringBuilder.append(paramInt);
      return new q(localStringBuilder.toString(), (byte)0);
    }
    
    public static q a(c paramc, b.c paramc1)
    {
      j.b(paramc, "nameResolver");
      j.b(paramc1, "signature");
      return a(paramc.a(paramc1.b), paramc.a(paramc1.c));
    }
    
    public static q a(f paramf)
    {
      j.b(paramf, "signature");
      if ((paramf instanceof f.b)) {
        return a(paramf.a(), paramf.b());
      }
      if ((paramf instanceof f.a)) {
        return b(paramf.a(), paramf.b());
      }
      throw new k();
    }
    
    public static q a(String paramString1, String paramString2)
    {
      j.b(paramString1, "name");
      j.b(paramString2, "desc");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString1);
      localStringBuilder.append(paramString2);
      return new q(localStringBuilder.toString(), (byte)0);
    }
    
    public static q b(String paramString1, String paramString2)
    {
      j.b(paramString1, "name");
      j.b(paramString2, "desc");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString1);
      localStringBuilder.append("#");
      localStringBuilder.append(paramString2);
      return new q(localStringBuilder.toString(), (byte)0);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/b/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */