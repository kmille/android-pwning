package b.i.b.a.c.j.a;

import b.f.b.j;
import b.i.b.a.c.b.ay;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.f;
import b.i.b.a.c.b.w;
import b.i.b.a.c.e.a.aa.a.b;
import b.i.b.a.c.e.a.ae.b;
import b.i.b.a.c.e.a.ao;
import b.i.b.a.c.e.a.c.b;
import b.i.b.a.c.e.a.q;
import b.i.b.a.c.e.a.r;
import b.i.b.a.c.l.ba;
import b.k;

public final class t
{
  public static final t a = new t();
  
  public static az a(a.ao paramao)
  {
    if (paramao != null) {
      switch (u.e[paramao.ordinal()])
      {
      default: 
        break;
      case 6: 
        paramao = ay.f;
        break;
      case 5: 
        paramao = ay.e;
        break;
      case 4: 
        paramao = ay.c;
        break;
      case 3: 
        paramao = ay.b;
        break;
      case 1: 
        paramao = ay.d;
        break;
      }
    }
    paramao = ay.a;
    j.a(paramao, "when (visibility) {\n    …isibilities.PRIVATE\n    }");
    return paramao;
  }
  
  public static b.a a(a.q paramq)
  {
    if (paramq != null) {
      switch (u.a[paramq.ordinal()])
      {
      default: 
        break;
      case 4: 
        return b.a.d;
      case 3: 
        return b.a.c;
      case 2: 
        return b.a.b;
      case 1: 
        return b.a.a;
      }
    }
    return b.a.a;
  }
  
  public static f a(a.c.b paramb)
  {
    if (paramb != null) {
      switch (u.f[paramb.ordinal()])
      {
      default: 
        break;
      case 6: 
      case 7: 
        return f.f;
      case 5: 
        return f.e;
      case 4: 
        return f.d;
      case 3: 
        return f.c;
      case 2: 
        return f.b;
      case 1: 
        return f.a;
      }
    }
    return f.a;
  }
  
  public static w a(a.r paramr)
  {
    if (paramr != null) {
      switch (u.c[paramr.ordinal()])
      {
      default: 
        break;
      case 4: 
        return w.b;
      case 3: 
        return w.d;
      case 2: 
        return w.c;
      case 1: 
        return w.a;
      }
    }
    return w.a;
  }
  
  public static ba a(a.aa.a.b paramb)
  {
    j.b(paramb, "projection");
    switch (u.i[paramb.ordinal()])
    {
    default: 
      throw new k();
    case 4: 
      throw ((Throwable)new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: ".concat(String.valueOf(paramb))));
    case 3: 
      return ba.a;
    case 2: 
      return ba.c;
    }
    return ba.b;
  }
  
  public static ba a(a.ae.b paramb)
  {
    j.b(paramb, "variance");
    switch (u.h[paramb.ordinal()])
    {
    default: 
      throw new k();
    case 3: 
      return ba.a;
    case 2: 
      return ba.c;
    }
    return ba.b;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/j/a/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */