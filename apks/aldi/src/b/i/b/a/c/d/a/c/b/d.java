package b.i.b.a.c.d.a.c.b;

import b.f.b.k;
import b.i.b.a.c.b.e;
import b.i.b.a.c.d.a.a.l;
import b.i.b.a.c.f.b;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.ah;
import b.i.b.a.c.l.ai;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.w;
import b.r;
import java.util.List;

public final class d
{
  private static final b a = new b("java.lang.Class");
  
  public static final ap a(b.i.b.a.c.b.ar paramar, a parama)
  {
    b.f.b.j.b(paramar, "typeParameter");
    b.f.b.j.b(parama, "attr");
    if (parama.a == l.a) {}
    for (paramar = new b.i.b.a.c.l.ar(ai.a(paramar));; paramar = new ah(paramar)) {
      return (ap)paramar;
    }
  }
  
  public static final w a(b.i.b.a.c.b.ar paramar1, b.i.b.a.c.b.ar paramar2, b.f.a.a<? extends w> parama)
  {
    b.f.b.j.b(paramar1, "receiver$0");
    b.f.b.j.b(parama, "defaultValue");
    if (paramar1 == paramar2) {
      return (w)parama.b_();
    }
    Object localObject = paramar1.j();
    b.f.b.j.a(localObject, "upperBounds");
    localObject = (w)b.a.j.c((List)localObject);
    if ((((w)localObject).f().c() instanceof e))
    {
      b.f.b.j.a(localObject, "firstUpperBound");
      return b.i.b.a.c.l.c.a.g((w)localObject);
    }
    if (paramar2 != null) {
      paramar1 = paramar2;
    }
    paramar2 = ((w)localObject).f().c();
    if (paramar2 != null)
    {
      do
      {
        paramar2 = (b.i.b.a.c.b.ar)paramar2;
        if (!(b.f.b.j.a(paramar2, paramar1) ^ true)) {
          break;
        }
        paramar2 = paramar2.j();
        b.f.b.j.a(paramar2, "current.upperBounds");
        paramar2 = (w)b.a.j.c(paramar2);
        if ((paramar2.f().c() instanceof e))
        {
          b.f.b.j.a(paramar2, "nextUpperBound");
          return b.i.b.a.c.l.c.a.g(paramar2);
        }
        paramar2 = paramar2.f().c();
      } while (paramar2 != null);
      throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
      return (w)parama.b_();
    }
    throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
  }
  
  static final class a
    extends k
    implements b.f.a.a<ad>
  {
    a(b.i.b.a.c.b.ar paramar)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/c/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */