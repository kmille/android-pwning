package b.i.b.a.c.d.a.b;

import b.i.b.a.c.b.am;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.c.ai;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.y;
import b.i.b.a.c.f.f;
import b.i.b.a.c.i.e.h;
import b.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class i
{
  public static final b.i.b.a.c.d.a.c.a.l a(e parame)
  {
    h localh;
    do
    {
      b.f.b.j.b(parame, "receiver$0");
      parame = b.i.b.a.c.i.c.a.a(parame);
      if (parame == null) {
        return null;
      }
      localh = parame.b();
      b.f.b.j.a(localh, "superClassDescriptor.staticScope");
    } while (!(localh instanceof b.i.b.a.c.d.a.c.a.l));
    return (b.i.b.a.c.d.a.c.a.l)localh;
  }
  
  public static final List<au> a(Collection<j> paramCollection, Collection<? extends au> paramCollection1, b.i.b.a.c.b.a parama)
  {
    b.f.b.j.b(paramCollection, "newValueParametersTypes");
    b.f.b.j.b(paramCollection1, "oldValueParameters");
    b.f.b.j.b(parama, "newOwner");
    int i;
    if (paramCollection.size() == paramCollection1.size()) {
      i = 1;
    } else {
      i = 0;
    }
    if ((b.w.a) && (i == 0))
    {
      parama = new StringBuilder("Different value parameters sizes: Enhanced = ");
      parama.append(paramCollection.size());
      parama.append(", Old = ");
      parama.append(paramCollection1.size());
      throw ((Throwable)new AssertionError(parama.toString()));
    }
    paramCollection = (Iterable)b.a.j.a((Iterable)paramCollection, (Iterable)paramCollection1);
    paramCollection1 = (Collection)new ArrayList(b.a.j.a(paramCollection));
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (m)localIterator.next();
      paramCollection = (j)((m)localObject1).a;
      Object localObject2 = (au)((m)localObject1).b;
      i = ((au)localObject2).c();
      localObject1 = ((au)localObject2).r();
      f localf = ((au)localObject2).i();
      b.f.b.j.a(localf, "oldParameter.name");
      b.i.b.a.c.l.w localw = paramCollection.a;
      boolean bool1 = paramCollection.b;
      boolean bool2 = ((au)localObject2).p();
      boolean bool3 = ((au)localObject2).q();
      if (((au)localObject2).m_() != null) {}
      for (paramCollection = b.i.b.a.c.i.c.a.c((b.i.b.a.c.b.l)parama).b().a(paramCollection.a);; paramCollection = null) {
        break;
      }
      localObject2 = ((au)localObject2).s();
      b.f.b.j.a(localObject2, "oldParameter.source");
      paramCollection1.add(new ai(parama, null, i, (b.i.b.a.c.b.a.g)localObject1, localf, localw, bool1, bool2, bool3, paramCollection, (am)localObject2));
    }
    return (List)paramCollection1;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */