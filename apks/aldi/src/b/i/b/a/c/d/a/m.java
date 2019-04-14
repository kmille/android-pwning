package b.i.b.a.c.d.a;

import b.i.b.a.c.a.g;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.b;
import b.i.b.a.c.b.c.p;
import b.i.b.a.c.b.l;
import b.i.b.a.c.d.b.j.c;
import b.i.b.a.c.d.b.r;
import b.i.b.a.c.f.f;
import b.i.b.a.c.i.e.a;
import b.i.b.a.c.i.e.b;
import b.i.b.a.c.l.an;
import java.util.Iterator;
import java.util.List;

public final class m
  implements b.i.b.a.c.i.e
{
  public static final a a = new a((byte)0);
  
  public final int a()
  {
    return e.a.a;
  }
  
  public final int a(b.i.b.a.c.b.a parama1, b.i.b.a.c.b.a parama2, b.i.b.a.c.b.e parame)
  {
    b.f.b.j.b(parama1, "superDescriptor");
    b.f.b.j.b(parama2, "subDescriptor");
    boolean bool1 = parama1 instanceof b;
    int j = 0;
    int i = j;
    if (bool1)
    {
      i = j;
      if ((parama2 instanceof b.i.b.a.c.b.t)) {
        if (g.a((l)parama2))
        {
          i = j;
        }
        else
        {
          Object localObject = d.a;
          b.i.b.a.c.b.t localt = (b.i.b.a.c.b.t)parama2;
          localObject = localt.i();
          b.f.b.j.a(localObject, "subDescriptor.name");
          if (!d.a((f)localObject))
          {
            localObject = c.a;
            localObject = localt.i();
            b.f.b.j.a(localObject, "subDescriptor.name");
            if (!c.a((f)localObject))
            {
              i = j;
              break label355;
            }
          }
          b localb = t.c((b)parama1);
          bool1 = localt.y();
          boolean bool2 = parama1 instanceof b.i.b.a.c.b.t;
          if (!bool2) {
            localObject = null;
          } else {
            localObject = parama1;
          }
          localObject = (b.i.b.a.c.b.t)localObject;
          if ((localObject != null) && (bool1 == ((b.i.b.a.c.b.t)localObject).y())) {
            i = 0;
          } else {
            i = 1;
          }
          if ((i != 0) && ((localb == null) || (!localt.y()))) {}
          do
          {
            do
            {
              i = 1;
              break;
              i = j;
              if (!(parame instanceof b.i.b.a.c.d.a.b.d)) {
                break;
              }
              if (localt.x() != null)
              {
                i = j;
                break;
              }
              i = j;
              if (localb == null) {
                break;
              }
              if (t.a(parame, (b.i.b.a.c.b.a)localb))
              {
                i = j;
                break;
              }
            } while ((!(localb instanceof b.i.b.a.c.b.t)) || (!bool2) || (d.a((b.i.b.a.c.b.t)localb) == null));
            parame = r.a(localt, false, false, 2);
            localObject = ((b.i.b.a.c.b.t)parama1).w();
            b.f.b.j.a(localObject, "superDescriptor.original");
          } while (!b.f.b.j.a(parame, r.a((b.i.b.a.c.b.t)localObject, false, false, 2)));
          i = j;
        }
      }
    }
    label355:
    if (i != 0) {
      return e.b.c;
    }
    if (a.a(parama1, parama2)) {
      return e.b.c;
    }
    return e.b.d;
  }
  
  public static final class a
  {
    private static b.i.b.a.c.d.b.j a(b.i.b.a.c.b.t paramt, au paramau)
    {
      if ((!r.a((b.i.b.a.c.b.a)paramt)) && (!a(paramt)))
      {
        paramt = paramau.y();
        b.f.b.j.a(paramt, "valueParameterDescriptor.type");
      }
      for (;;)
      {
        return r.a(paramt);
        paramt = paramau.y();
        b.f.b.j.a(paramt, "valueParameterDescriptor.type");
        paramt = b.i.b.a.c.l.c.a.b(paramt);
      }
    }
    
    public static boolean a(b.i.b.a.c.b.a parama1, b.i.b.a.c.b.a parama2)
    {
      b.f.b.j.b(parama1, "superDescriptor");
      b.f.b.j.b(parama2, "subDescriptor");
      if ((parama2 instanceof b.i.b.a.c.d.a.b.e))
      {
        if (!(parama1 instanceof b.i.b.a.c.b.t)) {
          return false;
        }
        Object localObject1 = (b.i.b.a.c.d.a.b.e)parama2;
        int i = ((p)localObject1).e.size();
        parama1 = (b.i.b.a.c.b.t)parama1;
        if (i == parama1.k().size()) {
          i = 1;
        } else {
          i = 0;
        }
        if ((b.w.a) && (i == 0)) {
          throw ((Throwable)new AssertionError("External overridability condition with CONFLICTS_ONLY should not be run with different value parameters size"));
        }
        localObject1 = ((b.i.b.a.c.d.a.b.e)localObject1).u();
        b.f.b.j.a(localObject1, "subDescriptor.original");
        localObject1 = ((al)localObject1).k();
        b.f.b.j.a(localObject1, "subDescriptor.original.valueParameters");
        localObject1 = (Iterable)localObject1;
        Object localObject2 = parama1.w();
        b.f.b.j.a(localObject2, "superDescriptor.original");
        localObject2 = ((b.i.b.a.c.b.t)localObject2).k();
        b.f.b.j.a(localObject2, "superDescriptor.original.valueParameters");
        localObject1 = b.a.j.a((Iterable)localObject1, (Iterable)localObject2).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          Object localObject3 = (b.m)((Iterator)localObject1).next();
          localObject2 = (au)((b.m)localObject3).a;
          localObject3 = (au)((b.m)localObject3).b;
          b.i.b.a.c.b.t localt = (b.i.b.a.c.b.t)parama2;
          b.f.b.j.a(localObject2, "subParameter");
          boolean bool = a(localt, (au)localObject2) instanceof j.c;
          b.f.b.j.a(localObject3, "superParameter");
          if (bool != a(parama1, (au)localObject3) instanceof j.c) {
            return true;
          }
        }
      }
      return false;
    }
    
    private static boolean a(b.i.b.a.c.b.t paramt)
    {
      if (paramt.k().size() != 1) {
        return false;
      }
      Object localObject2 = paramt.a();
      Object localObject1 = localObject2;
      if (!(localObject2 instanceof b.i.b.a.c.b.e)) {
        localObject1 = null;
      }
      localObject2 = (b.i.b.a.c.b.e)localObject1;
      if (localObject2 == null) {
        return false;
      }
      paramt = paramt.k();
      b.f.b.j.a(paramt, "f.valueParameters");
      paramt = b.a.j.g(paramt);
      b.f.b.j.a(paramt, "f.valueParameters.single()");
      localObject1 = ((au)paramt).y().f().c();
      paramt = (b.i.b.a.c.b.t)localObject1;
      if (!(localObject1 instanceof b.i.b.a.c.b.e)) {
        paramt = null;
      }
      paramt = (b.i.b.a.c.b.e)paramt;
      if (paramt == null) {
        return false;
      }
      return (g.b((b.i.b.a.c.b.e)localObject2)) && (b.f.b.j.a(b.i.b.a.c.i.c.a.b((l)localObject2), b.i.b.a.c.i.c.a.b((l)paramt)));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */