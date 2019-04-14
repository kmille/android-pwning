package b.i.b.a.c.b;

import b.f.b.j;
import b.i.b.a.c.c.a.a;
import b.i.b.a.c.f.b;
import b.i.b.a.c.f.c;
import b.i.b.a.c.f.f;
import b.i.b.a.c.i.e.h;

public final class q
{
  public static final e a(y paramy, b paramb, a parama)
  {
    j.b(paramy, "receiver$0");
    j.b(paramb, "fqName");
    j.b(parama, "lookupLocation");
    if (paramb.b.a.isEmpty()) {
      return null;
    }
    Object localObject1 = paramb.b();
    j.a(localObject1, "fqName.parent()");
    localObject1 = paramy.a((b)localObject1).c();
    Object localObject2 = paramb.b.d();
    j.a(localObject2, "fqName.shortName()");
    localObject2 = ((h)localObject1).c((f)localObject2, parama);
    localObject1 = localObject2;
    if (!(localObject2 instanceof e)) {
      localObject1 = null;
    }
    localObject1 = (e)localObject1;
    if (localObject1 != null) {
      return (e)localObject1;
    }
    localObject1 = paramb.b();
    j.a(localObject1, "fqName.parent()");
    paramy = a(paramy, (b)localObject1, parama);
    if (paramy != null)
    {
      paramy = paramy.v();
      if (paramy != null)
      {
        paramb = paramb.b.d();
        j.a(paramb, "fqName.shortName()");
        paramy = paramy.c(paramb, parama);
        break label169;
      }
    }
    paramy = null;
    label169:
    paramb = paramy;
    if (!(paramy instanceof e)) {
      paramb = null;
    }
    return (e)paramb;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */