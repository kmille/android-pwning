package b.i.b.a.c.j.a.a;

import b.f.b.j;
import b.i.b.a.c.b.a.c;
import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.a.g.b;
import b.i.b.a.c.f.b;
import b.i.b.a.c.k.f;
import b.i.b.a.c.k.h;
import b.i.b.a.c.k.i;
import java.util.Iterator;
import java.util.List;

public class a
  implements g
{
  private final f c;
  
  public a(i parami, b.f.a.a<? extends List<? extends c>> parama)
  {
    this.c = parami.a(parama);
  }
  
  private final List<c> b()
  {
    return (List)h.a(this.c, b[0]);
  }
  
  public final c a(b paramb)
  {
    j.b(paramb, "fqName");
    return g.b.a(this, paramb);
  }
  
  public boolean a()
  {
    return b().isEmpty();
  }
  
  public final boolean b(b paramb)
  {
    j.b(paramb, "fqName");
    return g.b.b(this, paramb);
  }
  
  public Iterator<c> iterator()
  {
    return b().iterator();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/j/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */