package b.i.b.a.c.d.b;

import b.f.b.j;
import b.i.b.a.c.b.an;
import b.i.b.a.c.e.a.s;
import b.i.b.a.c.e.a.c;
import b.i.b.a.c.e.b.a.g;
import b.i.b.a.c.f.a;
import b.i.b.a.c.g.i.c;
import b.i.b.a.c.j.a.a.e;
import b.i.b.a.c.j.a.o;
import b.k.l;

public final class i
  implements e
{
  public final b.i.b.a.c.i.d.b a;
  public final b.i.b.a.c.i.d.b c;
  final n d;
  private final String e;
  private final o<g> f;
  private final boolean g;
  
  public i(n paramn, a.s params, c paramc, o<g> paramo, boolean paramBoolean)
  {
    this(localb, (b.i.b.a.c.i.d.b)localObject1, params, paramc, paramo, paramBoolean, paramn);
  }
  
  private i(b.i.b.a.c.i.d.b paramb1, b.i.b.a.c.i.d.b paramb2, a.s params, c paramc, o<g> paramo, boolean paramBoolean, n paramn)
  {
    this.a = paramb1;
    this.c = paramb2;
    this.f = paramo;
    this.g = paramBoolean;
    this.d = paramn;
    paramb1 = (i.c)params;
    paramb2 = b.i.b.a.c.e.b.b.l;
    j.a(paramb2, "JvmProtoBuf.packageModuleName");
    paramb1 = (Integer)b.i.b.a.c.e.a.f.a(paramb1, paramb2);
    if (paramb1 != null)
    {
      paramb2 = paramc.a(((Number)paramb1).intValue());
      paramb1 = paramb2;
      if (paramb2 != null) {}
    }
    else
    {
      paramb1 = "main";
    }
    this.e = paramb1;
  }
  
  public final an a()
  {
    an localan = an.a;
    j.a(localan, "SourceFile.NO_SOURCE_FILE");
    return localan;
  }
  
  public final b.i.b.a.c.f.f b()
  {
    Object localObject = this.a.a;
    j.a(localObject, "className.internalName");
    localObject = b.i.b.a.c.f.f.a(l.a((String)localObject, '/'));
    j.a(localObject, "Name.identifier(classNam….substringAfterLast('/'))");
    return (b.i.b.a.c.f.f)localObject;
  }
  
  public final a c()
  {
    return new a(this.a.a(), b());
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName());
    localStringBuilder.append(": ");
    localStringBuilder.append(this.a);
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */