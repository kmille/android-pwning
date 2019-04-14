package b.i.b.a.c.h;

import b.a.e;
import b.a.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public enum h
{
  public static final Set<h> k;
  public static final Set<h> l = e.i(values());
  public static final a m;
  private final boolean o;
  
  static
  {
    int i1 = 0;
    Object localObject1 = new h("VISIBILITY", 0, true);
    a = (h)localObject1;
    Object localObject2 = new h("MODALITY", 1, true);
    b = (h)localObject2;
    h localh1 = new h("OVERRIDE", 2, true);
    c = localh1;
    h localh2 = new h("ANNOTATIONS", 3, false);
    d = localh2;
    h localh3 = new h("INNER", 4, true);
    e = localh3;
    h localh4 = new h("MEMBER_KIND", 5, true);
    f = localh4;
    h localh5 = new h("DATA", 6, true);
    g = localh5;
    h localh6 = new h("INLINE", 7, true);
    h = localh6;
    h localh7 = new h("EXPECT", 8, true);
    i = localh7;
    h localh8 = new h("ACTUAL", 9, true);
    j = localh8;
    n = new h[] { localObject1, localObject2, localh1, localh2, localh3, localh4, localh5, localh6, localh7, localh8 };
    m = new a((byte)0);
    localObject1 = values();
    localObject2 = (Collection)new ArrayList();
    int i2 = localObject1.length;
    while (i1 < i2)
    {
      localh1 = localObject1[i1];
      if (localh1.o) {
        ((Collection)localObject2).add(localh1);
      }
      i1 += 1;
    }
    k = j.k((Iterable)localObject2);
  }
  
  private h(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  public static final class a {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/h/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */