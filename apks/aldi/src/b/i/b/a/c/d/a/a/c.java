package b.i.b.a.c.d.a.a;

import b.a.ac;
import b.f.b.j;
import b.i.b.a.c.a.g;
import b.i.b.a.c.a.g.a;
import b.i.b.a.c.d.a.e.d;
import b.i.b.a.c.f.f;
import b.m;
import b.q;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Map;

public final class c
{
  public static final c a = new c();
  private static final b.i.b.a.c.f.b b = new b.i.b.a.c.f.b(Target.class.getCanonicalName());
  private static final b.i.b.a.c.f.b c = new b.i.b.a.c.f.b(Retention.class.getCanonicalName());
  private static final b.i.b.a.c.f.b d = new b.i.b.a.c.f.b(Deprecated.class.getCanonicalName());
  private static final b.i.b.a.c.f.b e = new b.i.b.a.c.f.b(Documented.class.getCanonicalName());
  private static final b.i.b.a.c.f.b f = new b.i.b.a.c.f.b("java.lang.annotation.Repeatable");
  private static final f g;
  private static final f h;
  private static final f i;
  private static final Map<b.i.b.a.c.f.b, b.i.b.a.c.f.b> j = ac.a(new m[] { q.a(g.k.E, b), q.a(g.k.H, c), q.a(g.k.I, f), q.a(g.k.J, e) });
  private static final Map<b.i.b.a.c.f.b, b.i.b.a.c.f.b> k = ac.a(new m[] { q.a(b, g.k.E), q.a(c, g.k.H), q.a(d, g.k.y), q.a(f, g.k.I), q.a(e, g.k.J) });
  
  static
  {
    f localf = f.a("message");
    j.a(localf, "Name.identifier(\"message\")");
    g = localf;
    localf = f.a("allowedTargets");
    j.a(localf, "Name.identifier(\"allowedTargets\")");
    h = localf;
    localf = f.a("value");
    j.a(localf, "Name.identifier(\"value\")");
    i = localf;
  }
  
  public static b.i.b.a.c.b.a.c a(b.i.b.a.c.d.a.e.a parama, b.i.b.a.c.d.a.c.h paramh)
  {
    j.b(parama, "annotation");
    j.b(paramh, "c");
    Object localObject = parama.b();
    if (j.a(localObject, b.i.b.a.c.f.a.a(b))) {
      parama = new i(parama, paramh);
    }
    for (;;)
    {
      return (b.i.b.a.c.b.a.c)parama;
      if (j.a(localObject, b.i.b.a.c.f.a.a(c)))
      {
        parama = new h(parama, paramh);
      }
      else if (j.a(localObject, b.i.b.a.c.f.a.a(f)))
      {
        localObject = g.k.I;
        j.a(localObject, "KotlinBuiltIns.FQ_NAMES.repeatable");
        parama = new b(paramh, parama, (b.i.b.a.c.f.b)localObject);
      }
      else if (j.a(localObject, b.i.b.a.c.f.a.a(e)))
      {
        localObject = g.k.J;
        j.a(localObject, "KotlinBuiltIns.FQ_NAMES.mustBeDocumented");
        parama = new b(paramh, parama, (b.i.b.a.c.f.b)localObject);
      }
      else
      {
        if (j.a(localObject, b.i.b.a.c.f.a.a(d))) {
          return null;
        }
        parama = new b.i.b.a.c.d.a.c.a.e(paramh, parama);
      }
    }
  }
  
  public static b.i.b.a.c.b.a.c a(b.i.b.a.c.f.b paramb, d paramd, b.i.b.a.c.d.a.c.h paramh)
  {
    j.b(paramb, "kotlinName");
    j.b(paramd, "annotationOwner");
    j.b(paramh, "c");
    if (j.a(paramb, g.k.y))
    {
      b.i.b.a.c.d.a.e.a locala = paramd.a(d);
      if (locala != null) {
        return (b.i.b.a.c.b.a.c)new e(locala, paramh);
      }
    }
    paramb = (b.i.b.a.c.f.b)j.get(paramb);
    if (paramb != null)
    {
      paramb = paramd.a(paramb);
      if (paramb != null) {
        return a(paramb, paramh);
      }
    }
    return null;
  }
  
  public static f a()
  {
    return g;
  }
  
  public static f b()
  {
    return h;
  }
  
  public static f c()
  {
    return i;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */