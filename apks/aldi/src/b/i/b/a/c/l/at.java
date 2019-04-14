package b.i.b.a.c.l;

import b.f.b.j;
import b.i.b.a.c.b.a.g;
import b.k;
import java.util.List;

public final class at
{
  private static ad a(ad paramad, List<? extends ap> paramList, g paramg)
  {
    j.b(paramad, "receiver$0");
    j.b(paramList, "newArguments");
    j.b(paramg, "newAnnotations");
    if ((paramList.isEmpty()) && (paramg == paramad.r())) {
      return paramad;
    }
    if (paramList.isEmpty()) {
      return paramad.b(paramg);
    }
    return x.a(paramg, paramad.f(), paramList, paramad.c());
  }
  
  public static final ad a(w paramw)
  {
    j.b(paramw, "receiver$0");
    az localaz = paramw.i();
    Object localObject = localaz;
    if (!(localaz instanceof ad)) {
      localObject = null;
    }
    localObject = (ad)localObject;
    if (localObject != null) {
      return (ad)localObject;
    }
    throw ((Throwable)new IllegalStateException("This is should be simple type: ".concat(String.valueOf(paramw)).toString()));
  }
  
  public static final w a(w paramw, List<? extends ap> paramList, g paramg)
  {
    j.b(paramw, "receiver$0");
    j.b(paramList, "newArguments");
    j.b(paramg, "newAnnotations");
    if (((paramList.isEmpty()) || (paramList == paramw.a())) && (paramg == paramw.r())) {
      return paramw;
    }
    paramw = paramw.i();
    if ((paramw instanceof q)) {
      paramw = (q)paramw;
    }
    for (paramw = x.a(a(paramw.a, paramList, paramg), a(paramw.b, paramList, paramg));; paramw = a((ad)paramw, paramList, paramg))
    {
      return (w)paramw;
      if (!(paramw instanceof ad)) {
        break;
      }
    }
    throw new k();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */