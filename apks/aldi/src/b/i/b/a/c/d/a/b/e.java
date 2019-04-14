package b.i.b.a.c.d.a.b;

import b.i.b.a.c.b.a.a;
import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.ak;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.c.ad;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.t;
import b.i.b.a.c.f.f;
import b.i.b.a.c.m.a;
import b.i.b.a.c.m.c;
import b.i.b.a.c.m.c.a;
import b.i.b.a.c.m.c.b;
import b.i.b.a.c.m.c.c;
import b.i.b.a.c.m.d;
import b.i.b.a.c.m.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class e
  extends ad
  implements b
{
  public static final a.a<au> a = new a.a() {};
  private a v = null;
  
  private e(l paraml, al paramal, g paramg, f paramf, b.a parama, am paramam)
  {
    super(paraml, paramal, paramg, paramf, parama, paramam);
  }
  
  public static e a(l paraml, g paramg, f paramf, am paramam)
  {
    return new e(paraml, null, paramg, paramf, b.a.a, paramam);
  }
  
  public final boolean F()
  {
    if ((!b) && (this.v == null)) {
      throw new AssertionError("Parameter names status was not set: ".concat(String.valueOf(this)));
    }
    return this.v.e;
  }
  
  public final ad a(ak paramak1, ak paramak2, List<? extends ar> paramList, List<au> paramList1, b.i.b.a.c.l.w paramw, b.i.b.a.c.b.w paramw1, az paramaz, Map<? extends a.a<?>, ?> paramMap)
  {
    paramak2 = super.a(paramak1, paramak2, paramList, paramList1, paramw, paramw1, paramaz, paramMap);
    paramak1 = i.a;
    b.f.b.j.b(paramak2, "functionDescriptor");
    paramList = paramak1.a().iterator();
    while (paramList.hasNext())
    {
      paramak1 = (d)paramList.next();
      b.f.b.j.b(paramak2, "functionDescriptor");
      paramList1 = paramak1.a;
      int k = 1;
      int j = 0;
      if ((paramList1 != null) && ((b.f.b.j.a(paramak2.i(), paramak1.a) ^ true))) {}
      int i;
      do
      {
        do
        {
          i = 0;
          break label187;
          if (paramak1.b == null) {
            break;
          }
          paramList1 = paramak2.i().a;
          b.f.b.j.a(paramList1, "functionDescriptor.name.asString()");
          paramList1 = (CharSequence)paramList1;
        } while (!paramak1.b.a(paramList1));
        i = k;
        if (paramak1.c == null) {
          break;
        }
        i = k;
      } while (!paramak1.c.contains(paramak2.i()));
      label187:
      if (i != 0)
      {
        b.f.b.j.b(paramak2, "functionDescriptor");
        paramList = paramak1.e;
        k = paramList.length;
        i = j;
        while (i < k)
        {
          paramList1 = paramList[i].b(paramak2);
          if (paramList1 != null)
          {
            paramak1 = new c.b(paramList1);
            break label301;
          }
          i += 1;
        }
        paramak1 = (String)paramak1.d.a(paramak2);
        if (paramak1 != null)
        {
          paramak1 = (c)new c.b(paramak1);
          break label306;
        }
        paramak1 = c.c.b;
        break label301;
      }
    }
    paramak1 = c.a.b;
    label301:
    paramak1 = (c)paramak1;
    label306:
    this.j = paramak1.a;
    return paramak2;
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.v = a.a(paramBoolean1, paramBoolean2);
  }
  
  public final boolean l()
  {
    if ((!b) && (this.v == null)) {
      throw new AssertionError("Parameter names status was not set: ".concat(String.valueOf(this)));
    }
    return this.v.f;
  }
  
  static enum a
  {
    public final boolean e;
    public final boolean f;
    
    private a(boolean paramBoolean1, boolean paramBoolean2)
    {
      this.e = paramBoolean1;
      this.f = paramBoolean2;
    }
    
    public static a a(boolean paramBoolean1, boolean paramBoolean2)
    {
      if (paramBoolean1)
      {
        if (paramBoolean2) {
          return d;
        }
        return b;
      }
      if (paramBoolean2) {
        return c;
      }
      return a;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */