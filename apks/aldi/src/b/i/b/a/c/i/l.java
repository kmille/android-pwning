package b.i.b.a.c.i;

import b.f.b.j;
import b.i.b.a.c.b.ay;
import b.i.b.a.c.b.b;
import b.w;
import java.util.Collection;
import java.util.Iterator;

public final class l
{
  public static final b a(Collection<? extends b> paramCollection)
  {
    j.b(paramCollection, "descriptors");
    boolean bool = paramCollection.isEmpty();
    if ((w.a) && (!(bool ^ true))) {
      throw ((Throwable)new AssertionError("Assertion failed"));
    }
    b localb = null;
    Iterator localIterator = paramCollection.iterator();
    paramCollection = localb;
    if (localIterator.hasNext())
    {
      localb = (b)localIterator.next();
      if (paramCollection == null) {}
      for (;;)
      {
        paramCollection = localb;
        break;
        Integer localInteger = ay.b(paramCollection.j(), localb.j());
        if ((localInteger == null) || (localInteger.intValue() >= 0)) {
          break;
        }
      }
    }
    if (paramCollection == null) {
      j.a();
    }
    return paramCollection;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */