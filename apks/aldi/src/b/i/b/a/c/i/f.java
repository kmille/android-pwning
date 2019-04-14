package b.i.b.a.c.i;

import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.d;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.l;
import b.i.b.a.c.c.a.a;
import b.i.b.a.c.c.a.c;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.w;

public final class f
{
  private static boolean a(l paraml)
  {
    b.f.b.j.b(paraml, "receiver$0");
    return ((paraml instanceof e)) && (((e)paraml).n());
  }
  
  public static final boolean a(w paramw)
  {
    b.f.b.j.b(paramw, "receiver$0");
    paramw = paramw.f().c();
    if (paramw != null) {
      return a((l)paramw);
    }
    return false;
  }
  
  public static final w b(w paramw)
  {
    b.f.b.j.b(paramw, "receiver$0");
    Object localObject = c(paramw);
    if (localObject == null) {
      return null;
    }
    paramw = paramw.b();
    localObject = ((au)localObject).i();
    b.f.b.j.a(localObject, "parameter.name");
    paramw = (ah)b.a.j.f((Iterable)paramw.a((b.i.b.a.c.f.f)localObject, (a)c.l));
    if (paramw != null) {
      return paramw.y();
    }
    return null;
  }
  
  private static au c(w paramw)
  {
    b.f.b.j.b(paramw, "receiver$0");
    b.i.b.a.c.b.h localh = paramw.f().c();
    paramw = localh;
    if (!(localh instanceof e)) {
      paramw = null;
    }
    paramw = (e)paramw;
    if (paramw != null)
    {
      b.f.b.j.b(paramw, "receiver$0");
      if (!paramw.n()) {
        return null;
      }
      paramw = paramw.e_();
      if (paramw != null)
      {
        paramw = paramw.k();
        if (paramw != null) {
          return (au)b.a.j.h(paramw);
        }
      }
    }
    return null;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */