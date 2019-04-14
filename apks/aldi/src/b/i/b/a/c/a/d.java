package b.i.b.a.c.a;

import b.i.b.a.c.b.e;
import b.i.b.a.c.b.l;
import b.i.b.a.c.f.b;
import b.i.b.a.c.f.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class d
{
  public static final d a = new d();
  private static final LinkedHashSet<b.i.b.a.c.f.a> b;
  
  static
  {
    Object localObject1 = h.i;
    b.f.b.j.a(localObject1, "PrimitiveType.NUMBER_TYPES");
    Object localObject2 = (Iterable)localObject1;
    localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((Collection)localObject1).add(g.c((h)((Iterator)localObject2).next()));
    }
    localObject2 = (Iterable)b.a.j.a((Collection)b.a.j.a((Collection)b.a.j.a((Collection)localObject1, g.k.g.b()), g.k.i.b()), g.k.r.b());
    localObject1 = (Collection)new LinkedHashSet();
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((Collection)localObject1).add(b.i.b.a.c.f.a.a((b)((Iterator)localObject2).next()));
    }
    b = (LinkedHashSet)localObject1;
  }
  
  public static Set<b.i.b.a.c.f.a> a()
  {
    Set localSet = Collections.unmodifiableSet((Set)b);
    b.f.b.j.a(localSet, "Collections.unmodifiableSet(classIds)");
    return localSet;
  }
  
  public static boolean a(e parame)
  {
    b.f.b.j.b(parame, "classDescriptor");
    if (b.i.b.a.c.i.d.g((l)parame))
    {
      Iterable localIterable = (Iterable)b;
      parame = b.i.b.a.c.i.c.a.a((b.i.b.a.c.b.h)parame);
      if (parame != null) {
        parame = parame.b();
      } else {
        parame = null;
      }
      if (b.a.j.a(localIterable, parame)) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */