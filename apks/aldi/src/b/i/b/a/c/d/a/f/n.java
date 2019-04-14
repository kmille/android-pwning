package b.i.b.a.c.d.a.f;

import b.a.ai;
import java.util.Set;

public final class n
{
  static final d a(g paramg, e parame, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean2) && (paramg == g.b)) {
      return new d(paramg, parame, true, paramBoolean1);
    }
    return new d(paramg, parame, false, paramBoolean1);
  }
  
  static final g a(Set<? extends g> paramSet, g paramg, boolean paramBoolean)
  {
    if (paramg == g.c) {
      return g.c;
    }
    return (g)a(paramSet, g.b, g.a, paramg, paramBoolean);
  }
  
  static final <T> T a(Set<? extends T> paramSet, T paramT1, T paramT2, T paramT3, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (paramSet.contains(paramT1)) {
        paramSet = paramT1;
      } else if (paramSet.contains(paramT2)) {
        paramSet = paramT2;
      } else {
        paramSet = null;
      }
      if ((b.f.b.j.a(paramSet, paramT1)) && (b.f.b.j.a(paramT3, paramT2))) {
        return null;
      }
      if (paramT3 == null) {
        return paramSet;
      }
      return paramT3;
    }
    paramT1 = paramSet;
    if (paramT3 != null)
    {
      paramT1 = b.a.j.k((Iterable)ai.a(paramSet, paramT3));
      if (paramT1 == null) {
        paramT1 = paramSet;
      }
    }
    return (T)b.a.j.f((Iterable)paramT1);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/f/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */