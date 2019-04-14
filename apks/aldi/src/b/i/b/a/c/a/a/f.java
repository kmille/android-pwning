package b.i.b.a.c.a.a;

import b.a.v;
import b.a.y;
import b.i.b.a.c.b.a;
import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.a.g.a;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.ay;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.c.ad;
import b.i.b.a.c.b.c.ai;
import b.i.b.a.c.b.c.p;
import b.i.b.a.c.b.c.p.a;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.t;
import b.i.b.a.c.l.ba;
import b.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class f
  extends ad
{
  public static final a a = new a((byte)0);
  
  private f(l paraml, f paramf, b.a parama, boolean paramBoolean)
  {
    super(paraml, paramf, g.a.a(), b.i.b.a.c.m.j.g, parama, am.b);
    this.j = true;
    this.s = paramBoolean;
    a(false);
  }
  
  private final t a(List<b.i.b.a.c.f.f> paramList)
  {
    int j = this.e.size() - paramList.size();
    boolean bool2 = false;
    int i;
    if ((j != 0) && (j != 1)) {
      i = 0;
    } else {
      i = 1;
    }
    if ((b.w.a) && (i == 0)) {
      throw ((Throwable)new AssertionError("Assertion failed"));
    }
    Object localObject1 = this.e;
    b.f.b.j.a(localObject1, "valueParameters");
    localObject1 = (Iterable)localObject1;
    Collection localCollection = (Collection)new ArrayList(b.a.j.a((Iterable)localObject1));
    Iterator localIterator = ((Iterable)localObject1).iterator();
    while (localIterator.hasNext())
    {
      b.i.b.a.c.b.au localau = (b.i.b.a.c.b.au)localIterator.next();
      b.f.b.j.a(localau, "it");
      localObject2 = localau.i();
      b.f.b.j.a(localObject2, "it.name");
      i = localau.c();
      int k = i - j;
      localObject1 = localObject2;
      if (k >= 0)
      {
        b.i.b.a.c.f.f localf = (b.i.b.a.c.f.f)paramList.get(k);
        localObject1 = localObject2;
        if (localf != null) {
          localObject1 = localf;
        }
      }
      localCollection.add(localau.a((a)this, (b.i.b.a.c.f.f)localObject1, i));
    }
    localObject1 = (List)localCollection;
    Object localObject2 = e(b.i.b.a.c.l.au.a);
    paramList = (Iterable)paramList;
    boolean bool1 = bool2;
    if (!((Collection)paramList).isEmpty())
    {
      paramList = paramList.iterator();
      do
      {
        bool1 = bool2;
        if (!paramList.hasNext()) {
          break;
        }
        if ((b.i.b.a.c.f.f)paramList.next() == null) {
          i = 1;
        } else {
          i = 0;
        }
      } while (i == 0);
      bool1 = true;
    }
    ((p.a)localObject2).u = Boolean.valueOf(bool1);
    paramList = ((p.a)localObject2).b((List)localObject1).a((b.i.b.a.c.b.b)u());
    b.f.b.j.a(paramList, "newCopyBuilder(TypeSubst…   .setOriginal(original)");
    paramList = super.a(paramList);
    if (paramList == null) {
      b.f.b.j.a();
    }
    return paramList;
  }
  
  public final p a(l paraml, t paramt, b.a parama, b.i.b.a.c.f.f paramf, g paramg, am paramam)
  {
    b.f.b.j.b(paraml, "newOwner");
    b.f.b.j.b(parama, "kind");
    b.f.b.j.b(paramg, "annotations");
    b.f.b.j.b(paramam, "source");
    return (p)new f(paraml, (f)paramt, parama, C());
  }
  
  public final t a(p.a parama)
  {
    b.f.b.j.b(parama, "configuration");
    parama = (f)super.a(parama);
    if (parama == null) {
      return null;
    }
    Object localObject1 = parama.e;
    b.f.b.j.a(localObject1, "substituted.valueParameters");
    localObject1 = (Iterable)localObject1;
    boolean bool = localObject1 instanceof Collection;
    int j = 0;
    if ((!bool) || (!((Collection)localObject1).isEmpty()))
    {
      localObject1 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (b.i.b.a.c.b.au)((Iterator)localObject1).next();
        b.f.b.j.a(localObject2, "it");
        localObject2 = ((b.i.b.a.c.b.au)localObject2).y();
        b.f.b.j.a(localObject2, "it.type");
        if (b.i.b.a.c.a.f.g((b.i.b.a.c.l.w)localObject2) != null) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          i = j;
          break label148;
        }
      }
    }
    int i = 1;
    label148:
    if (i != 0) {
      return (t)parama;
    }
    localObject1 = parama.e;
    b.f.b.j.a(localObject1, "substituted.valueParameters");
    Object localObject2 = (Iterable)localObject1;
    localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      Object localObject3 = (b.i.b.a.c.b.au)((Iterator)localObject2).next();
      b.f.b.j.a(localObject3, "it");
      localObject3 = ((b.i.b.a.c.b.au)localObject3).y();
      b.f.b.j.a(localObject3, "it.type");
      ((Collection)localObject1).add(b.i.b.a.c.a.f.g((b.i.b.a.c.l.w)localObject3));
    }
    return parama.a((List)localObject1);
  }
  
  public final boolean b()
  {
    return false;
  }
  
  public final boolean c()
  {
    return false;
  }
  
  public final boolean q()
  {
    return false;
  }
  
  public static final class a
  {
    public static f a(b paramb, boolean paramBoolean)
    {
      b.f.b.j.b(paramb, "functionClass");
      List localList1 = paramb.a;
      f localf = new f((l)paramb, b.a.a, paramBoolean);
      paramb = paramb.w();
      List localList2 = (List)v.a;
      Object localObject2 = (Iterable)localList1;
      Object localObject1 = new ArrayList();
      localObject2 = ((Iterable)localObject2).iterator();
      Object localObject3;
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = ((Iterator)localObject2).next();
        int i;
        if (((ar)localObject3).k() == ba.b) {
          i = 1;
        } else {
          i = 0;
        }
        if (i == 0) {
          break;
        }
        ((ArrayList)localObject1).add(localObject3);
      }
      localObject2 = b.a.j.l((Iterable)localObject1);
      localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
      localObject2 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (y)((Iterator)localObject2).next();
        a locala = f.a;
        ((Collection)localObject1).add(a(localf, ((y)localObject3).a, (ar)((y)localObject3).b));
      }
      localf.b(null, paramb, localList2, (List)localObject1, (b.i.b.a.c.l.w)((ar)b.a.j.e(localList1)).h(), b.i.b.a.c.b.w.d, ay.e);
      localf.b(true);
      return localf;
    }
    
    private static b.i.b.a.c.b.au a(f paramf, int paramInt, ar paramar)
    {
      Object localObject1 = paramar.i().a;
      b.f.b.j.a(localObject1, "typeParameter.name.asString()");
      int i = ((String)localObject1).hashCode();
      if (i != 69)
      {
        if ((i == 84) && (((String)localObject1).equals("T")))
        {
          localObject1 = "instance";
          break label92;
        }
      }
      else if (((String)localObject1).equals("E"))
      {
        localObject1 = "receiver";
        break label92;
      }
      if (localObject1 != null)
      {
        localObject1 = ((String)localObject1).toLowerCase();
        b.f.b.j.a(localObject1, "(this as java.lang.String).toLowerCase()");
        label92:
        paramf = (a)paramf;
        Object localObject2 = g.a;
        localObject2 = g.a.a();
        localObject1 = b.i.b.a.c.f.f.a((String)localObject1);
        b.f.b.j.a(localObject1, "Name.identifier(name)");
        paramar = paramar.h();
        b.f.b.j.a(paramar, "typeParameter.defaultType");
        paramar = (b.i.b.a.c.l.w)paramar;
        am localam = am.b;
        b.f.b.j.a(localam, "SourceElement.NO_SOURCE");
        return (b.i.b.a.c.b.au)new ai(paramf, null, paramInt, (g)localObject2, (b.i.b.a.c.f.f)localObject1, paramar, false, false, false, null, localam);
      }
      throw new r("null cannot be cast to non-null type java.lang.String");
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/a/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */