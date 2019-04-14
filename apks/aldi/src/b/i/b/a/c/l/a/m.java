package b.i.b.a.c.l.a;

import b.f.b.j;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.ag;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.az;
import b.i.b.a.c.l.q;
import b.i.b.a.c.l.w;
import java.util.Collection;
import java.util.List;

public final class m
{
  public static final m a = new m();
  
  public final boolean a(ad paramad1, ad paramad2)
  {
    j.b(paramad1, "a");
    j.b(paramad2, "b");
    if ((paramad1.c() == paramad2.c()) && (ag.b((w)paramad1) == ag.b((w)paramad2)) && (!(j.a(paramad1.f(), paramad2.f()) ^ true)))
    {
      if (paramad1.a().size() != paramad2.a().size()) {
        return false;
      }
      if (paramad1.a() == paramad2.a()) {
        return true;
      }
      int j = ((Collection)paramad1.a()).size();
      int i = 0;
      while (i < j)
      {
        ap localap1 = (ap)paramad1.a().get(i);
        ap localap2 = (ap)paramad2.a().get(i);
        if (localap1.a() != localap2.a()) {
          return false;
        }
        if (!localap1.a())
        {
          if (localap1.b() != localap2.b()) {
            return false;
          }
          if (!a(localap1.c().i(), localap2.c().i())) {
            return false;
          }
        }
        i += 1;
      }
      return true;
    }
    return false;
  }
  
  public final boolean a(az paramaz1, az paramaz2)
  {
    j.b(paramaz1, "a");
    j.b(paramaz2, "b");
    if (paramaz1 == paramaz2) {
      return true;
    }
    if (((paramaz1 instanceof ad)) && ((paramaz2 instanceof ad))) {
      return a((ad)paramaz1, (ad)paramaz2);
    }
    if (((paramaz1 instanceof q)) && ((paramaz2 instanceof q)))
    {
      paramaz1 = (q)paramaz1;
      ad localad = paramaz1.a;
      paramaz2 = (q)paramaz2;
      if ((a(localad, paramaz2.a)) && (a(paramaz1.b, paramaz2.b))) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */