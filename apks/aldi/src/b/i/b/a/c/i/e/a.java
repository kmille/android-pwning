package b.i.b.a.c.i.e;

import b.f.a.b;
import b.f.b.j;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.l;
import b.i.b.a.c.f.f;
import java.util.Collection;
import java.util.Set;

public abstract class a
  implements h
{
  public Collection<ah> a(f paramf, b.i.b.a.c.c.a.a parama)
  {
    j.b(paramf, "name");
    j.b(parama, "location");
    return c().a(paramf, parama);
  }
  
  public Collection<l> a(d paramd, b<? super f, Boolean> paramb)
  {
    j.b(paramd, "kindFilter");
    j.b(paramb, "nameFilter");
    return c().a(paramd, paramb);
  }
  
  public Collection<al> b(f paramf, b.i.b.a.c.c.a.a parama)
  {
    j.b(paramf, "name");
    j.b(parama, "location");
    return c().b(paramf, parama);
  }
  
  public final b.i.b.a.c.b.h c(f paramf, b.i.b.a.c.c.a.a parama)
  {
    j.b(paramf, "name");
    j.b(parama, "location");
    return c().c(paramf, parama);
  }
  
  protected abstract h c();
  
  public final Set<f> j_()
  {
    return c().j_();
  }
  
  public final Set<f> l_()
  {
    return c().l_();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */