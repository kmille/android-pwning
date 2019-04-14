package b.i.b.a.c.i;

import b.f.a.m;
import b.f.b.k;
import b.i.b.a.c.b.a;
import b.i.b.a.c.b.ab;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.l;
import b.i.b.a.c.l.a.c.a;

public final class b
{
  public static final b a = new b();
  
  private final boolean a(ar paramar1, ar paramar2, m<? super l, ? super l, Boolean> paramm)
  {
    if (b.f.b.j.a(paramar1, paramar2)) {
      return true;
    }
    if (b.f.b.j.a(paramar1.a(), paramar2.a())) {
      return false;
    }
    if (!a((l)paramar1, (l)paramar2, paramm)) {
      return false;
    }
    return paramar1.g() == paramar2.g();
  }
  
  private final boolean a(l paraml1, l paraml2, m<? super l, ? super l, Boolean> paramm)
  {
    paraml1 = paraml1.a();
    paraml2 = paraml2.a();
    if ((!(paraml1 instanceof b.i.b.a.c.b.b)) && (!(paraml2 instanceof b.i.b.a.c.b.b))) {
      return a(paraml1, paraml2);
    }
    return ((Boolean)paramm.a(paraml1, paraml2)).booleanValue();
  }
  
  public final boolean a(l paraml1, final l paraml2)
  {
    if (((paraml1 instanceof e)) && ((paraml2 instanceof e)))
    {
      paraml1 = (e)paraml1;
      paraml2 = (e)paraml2;
      return b.f.b.j.a(paraml1.c(), paraml2.c());
    }
    if (((paraml1 instanceof ar)) && ((paraml2 instanceof ar))) {
      return a((ar)paraml1, (ar)paraml2, (m)c.a);
    }
    if (((paraml1 instanceof a)) && ((paraml2 instanceof a)))
    {
      paraml1 = (a)paraml1;
      paraml2 = (a)paraml2;
      b.f.b.j.b(paraml1, "a");
      b.f.b.j.b(paraml2, "b");
      if (b.f.b.j.a(paraml1, paraml2)) {
        return true;
      }
      if ((!(b.f.b.j.a(paraml1.i(), paraml2.i()) ^ true)) && (!b.f.b.j.a(paraml1.a(), paraml2.a())))
      {
        Object localObject1 = (l)paraml1;
        if (!d.b((l)localObject1))
        {
          Object localObject2 = (l)paraml2;
          if (d.b((l)localObject2)) {
            return false;
          }
          if (a((l)localObject1, (l)localObject2, (m)a.a))
          {
            localObject1 = j.a((c.a)new b(paraml1, paraml2));
            b.f.b.j.a(localObject1, "OverridingUtil.createWit…= a && y == b})\n        }");
            localObject2 = ((j)localObject1).a(paraml1, paraml2, null, true);
            b.f.b.j.a(localObject2, "overridingUtil.isOverrid… null, !ignoreReturnType)");
            if (((j.a)localObject2).a == j.a.a.a)
            {
              paraml1 = ((j)localObject1).a(paraml2, paraml1, null, true);
              b.f.b.j.a(paraml1, "overridingUtil.isOverrid… null, !ignoreReturnType)");
              if (paraml1.a == j.a.a.a) {
                return true;
              }
            }
          }
        }
      }
      return false;
    }
    if (((paraml1 instanceof ab)) && ((paraml2 instanceof ab))) {
      return b.f.b.j.a(((ab)paraml1).c(), ((ab)paraml2).c());
    }
    return b.f.b.j.a(paraml1, paraml2);
  }
  
  static final class a
    extends k
    implements m<l, l, Boolean>
  {
    public static final a a = new a();
    
    a()
    {
      super();
    }
  }
  
  static final class b
    implements c.a
  {
    b(a parama1, a parama2) {}
  }
  
  static final class c
    extends k
    implements m<l, l, Boolean>
  {
    public static final c a = new c();
    
    c()
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */