package b.i.b.a.c.i.a.a;

import b.f.b.j;
import b.f.b.k;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.as;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.w;
import b.i.b.a.c.l.z;

public final class c
{
  static final ap a(ap paramap, b.i.b.a.c.b.ar paramar)
  {
    if (paramar != null)
    {
      if (paramap.b() == ba.a) {
        return paramap;
      }
      if (paramar.k() == paramap.b()) {
        if (paramap.a())
        {
          paramar = b.i.b.a.c.k.b.a;
          j.a(paramar, "LockBasedStorageManager.NO_LOCKS");
          paramap = new b.i.b.a.c.l.ar((w)new z(paramar, (b.f.a.a)new a(paramap)));
        }
      }
      for (;;)
      {
        return (ap)paramap;
        paramap = new b.i.b.a.c.l.ar(paramap.c());
        continue;
        paramap = new b.i.b.a.c.l.ar(a(paramap));
      }
    }
    return paramap;
  }
  
  private static w a(ap paramap)
  {
    j.b(paramap, "typeProjection");
    return (w)new a(paramap);
  }
  
  public static final boolean a(w paramw)
  {
    j.b(paramw, "receiver$0");
    return paramw.f() instanceof b;
  }
  
  static final class a
    extends k
    implements b.f.a.a<w>
  {
    a(ap paramap)
    {
      super();
    }
  }
  
  public static final class b
    extends b.i.b.a.c.l.h
  {
    b(as paramas1, as paramas2)
    {
      super();
    }
    
    public final ap a(w paramw)
    {
      j.b(paramw, "key");
      ap localap = super.a(paramw);
      if (localap != null)
      {
        b.i.b.a.c.b.h localh = paramw.f().c();
        paramw = localh;
        if (!(localh instanceof b.i.b.a.c.b.ar)) {
          paramw = null;
        }
        return c.a(localap, (b.i.b.a.c.b.ar)paramw);
      }
      return null;
    }
    
    public final boolean b()
    {
      return this.b;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */