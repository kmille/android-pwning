package b.i.b.a.c.a.b;

import b.a.ai;
import b.a.x;
import b.f.b.j;
import b.f.b.k;
import b.i.b.a.c.a.g;
import b.i.b.a.c.a.g.a;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.y;
import b.i.b.a.c.k.i;
import java.util.Collection;
import java.util.Set;

public final class d
  implements b.i.b.a.c.b.b.b
{
  public static final a b = new a((byte)0);
  private static final b.i.b.a.c.f.b f = g.c;
  private static final b.i.b.a.c.f.f g;
  private static final b.i.b.a.c.f.a h;
  private final b.i.b.a.c.k.f c;
  private final y d;
  private final b.f.a.b<y, l> e;
  
  static
  {
    Object localObject = g.k.c.d();
    j.a(localObject, "KotlinBuiltIns.FQ_NAMES.cloneable.shortName()");
    g = (b.i.b.a.c.f.f)localObject;
    localObject = b.i.b.a.c.f.a.a(g.k.c.b());
    j.a(localObject, "ClassId.topLevel(KotlinB…NAMES.cloneable.toSafe())");
    h = (b.i.b.a.c.f.a)localObject;
  }
  
  private d(final i parami, y paramy, b.f.a.b<? super y, ? extends l> paramb)
  {
    this.d = paramy;
    this.e = paramb;
    this.c = parami.a((b.f.a.a)new b(this, parami));
  }
  
  private final b.i.b.a.c.b.c.h d()
  {
    return (b.i.b.a.c.b.c.h)b.i.b.a.c.k.h.a(this.c, a[0]);
  }
  
  public final e a(b.i.b.a.c.f.a parama)
  {
    j.b(parama, "classId");
    if (j.a(parama, h)) {
      return (e)d();
    }
    return null;
  }
  
  public final Collection<e> a(b.i.b.a.c.f.b paramb)
  {
    j.b(paramb, "packageFqName");
    if (j.a(paramb, f)) {}
    for (paramb = ai.a(d());; paramb = (Set)x.a) {
      return (Collection)paramb;
    }
  }
  
  public final boolean a(b.i.b.a.c.f.b paramb, b.i.b.a.c.f.f paramf)
  {
    j.b(paramb, "packageFqName");
    j.b(paramf, "name");
    return (j.a(paramf, g)) && (j.a(paramb, f));
  }
  
  public static final class a {}
  
  static final class b
    extends k
    implements b.f.a.a<b.i.b.a.c.b.c.h>
  {
    b(d paramd, i parami)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/a/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */