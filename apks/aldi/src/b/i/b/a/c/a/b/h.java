package b.i.b.a.c.a.b;

import b.a.ac;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.e;
import b.i.b.a.c.l.ao;
import b.i.b.a.c.l.ao.a;
import b.i.b.a.c.l.c.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class h
{
  public static final ao a(e parame1, e parame2)
  {
    b.f.b.j.b(parame1, "from");
    b.f.b.j.b(parame2, "to");
    int i;
    if (parame1.u().size() == parame2.u().size()) {
      i = 1;
    } else {
      i = 0;
    }
    if ((b.w.a) && (i == 0))
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append(parame1);
      ((StringBuilder)localObject1).append(" and ");
      ((StringBuilder)localObject1).append(parame2);
      ((StringBuilder)localObject1).append(" should have same number of type parameters, but ");
      ((StringBuilder)localObject1).append(parame1.u().size());
      ((StringBuilder)localObject1).append(" / ");
      ((StringBuilder)localObject1).append(parame2.u().size());
      ((StringBuilder)localObject1).append(" found");
      throw ((Throwable)new AssertionError(((StringBuilder)localObject1).toString()));
    }
    Object localObject1 = ao.b;
    parame1 = parame1.u();
    b.f.b.j.a(parame1, "from.declaredTypeParameters");
    localObject1 = (Iterable)parame1;
    parame1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject1));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext()) {
      parame1.add(((ar)((Iterator)localObject1).next()).c());
    }
    parame1 = (Iterable)parame1;
    parame2 = parame2.u();
    b.f.b.j.a(parame2, "to.declaredTypeParameters");
    localObject1 = (Iterable)parame2;
    parame2 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject1));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (ar)((Iterator)localObject1).next();
      b.f.b.j.a(localObject2, "it");
      localObject2 = ((ar)localObject2).h();
      b.f.b.j.a(localObject2, "it.defaultType");
      parame2.add(a.f((b.i.b.a.c.l.w)localObject2));
    }
    return ao.a.a(ac.a((Iterable)b.a.j.a(parame1, (Iterable)parame2)));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/a/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */