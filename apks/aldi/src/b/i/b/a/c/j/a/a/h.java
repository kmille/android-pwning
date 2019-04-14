package b.i.b.a.c.j.a.a;

import b.a.x;
import b.f.b.j;
import b.i.b.a.c.b.ab;
import b.i.b.a.c.b.l;
import b.i.b.a.c.e.a.s;
import b.i.b.a.c.e.a.c;
import b.i.b.a.c.f.f;
import b.i.b.a.c.j.a.i;
import b.i.b.a.c.j.a.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class h
  extends g
{
  private final b.i.b.a.c.f.b a;
  private final ab d;
  
  public h(ab paramab, a.s params, c paramc, b.i.b.a.c.e.a.a parama, e parame, i parami, b.f.a.a<? extends Collection<f>> parama1)
  {
    super(paramc, parama, parame, (Collection)params, parama1);
    this.d = paramab;
    this.a = this.d.c();
  }
  
  protected final b.i.b.a.c.f.a a(f paramf)
  {
    j.b(paramf, "name");
    return new b.i.b.a.c.f.a(this.a, paramf);
  }
  
  protected final void a(Collection<l> paramCollection, b.f.a.b<? super f, Boolean> paramb)
  {
    j.b(paramCollection, "result");
    j.b(paramb, "nameFilter");
  }
  
  protected final boolean b(f paramf)
  {
    j.b(paramf, "name");
    if (!super.b(paramf))
    {
      Object localObject = this.c.c.k;
      if ((!(localObject instanceof Collection)) || (!((Collection)localObject).isEmpty()))
      {
        localObject = ((Iterable)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          if (((b.i.b.a.c.b.b.b)((Iterator)localObject).next()).a(this.a, paramf))
          {
            i = 1;
            break label89;
          }
        }
      }
      int i = 0;
      label89:
      return i != 0;
    }
    return true;
  }
  
  public final b.i.b.a.c.b.h c(f paramf, b.i.b.a.c.c.a.a parama)
  {
    j.b(paramf, "name");
    j.b(parama, "location");
    d(paramf, parama);
    return super.c(paramf, parama);
  }
  
  protected final Set<f> c()
  {
    return (Set)x.a;
  }
  
  protected final Set<f> d()
  {
    return (Set)x.a;
  }
  
  public final void d(f paramf, b.i.b.a.c.c.a.a parama)
  {
    j.b(paramf, "name");
    j.b(parama, "location");
    b.i.b.a.c.c.a.a(this.c.c.i, parama, this.d, paramf);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/j/a/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */