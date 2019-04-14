package b.i.b.a.c.m.b;

import b.f.b.j;
import java.util.Collection;
import java.util.LinkedHashSet;

public final class a
{
  public static final <T> Collection<T> a(Collection<? extends T> paramCollection1, Collection<? extends T> paramCollection2)
  {
    j.b(paramCollection2, "collection");
    if (paramCollection2.isEmpty()) {
      return paramCollection1;
    }
    if (paramCollection1 == null) {
      return paramCollection2;
    }
    if ((paramCollection1 instanceof LinkedHashSet))
    {
      ((LinkedHashSet)paramCollection1).addAll(paramCollection2);
      return paramCollection1;
    }
    paramCollection1 = new LinkedHashSet(paramCollection1);
    paramCollection1.addAll(paramCollection2);
    return (Collection)paramCollection1;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/m/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */