package b.i.b.a.c.d.a.a;

import b.a.ac;
import b.f.b.k;
import b.i.b.a.c.b.a.c;
import b.i.b.a.c.b.am;
import b.i.b.a.c.d.a.c.h;
import b.i.b.a.c.d.a.e.l;
import b.i.b.a.c.k.i;
import b.i.b.a.c.l.ad;
import java.util.Map;

public class b
  implements c
{
  final b.i.b.a.c.d.a.e.b b;
  final b.i.b.a.c.f.b c;
  private final am d;
  private final b.i.b.a.c.k.f e;
  
  public b(final h paramh, b.i.b.a.c.d.a.e.a parama, b.i.b.a.c.f.b paramb)
  {
    this.c = paramb;
    if (parama != null)
    {
      paramb = (am)paramh.c.i.a((l)parama);
    }
    else
    {
      paramb = am.b;
      b.f.b.j.a(paramb, "SourceElement.NO_SOURCE");
    }
    this.d = paramb;
    this.e = paramh.c.a.a((b.f.a.a)new a(this, paramh));
    if (parama != null) {
      paramh = (b.i.b.a.c.d.a.e.b)b.a.j.c((Iterable)parama.a());
    } else {
      paramh = null;
    }
    this.b = paramh;
  }
  
  public final b.i.b.a.c.f.b b()
  {
    return this.c;
  }
  
  public Map<b.i.b.a.c.f.f, b.i.b.a.c.i.b.f<?>> c()
  {
    return ac.a();
  }
  
  public final am d()
  {
    return this.d;
  }
  
  static final class a
    extends k
    implements b.f.a.a<ad>
  {
    a(b paramb, h paramh)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */