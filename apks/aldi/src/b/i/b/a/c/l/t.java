package b.i.b.a.c.l;

import b.f.b.j;
import b.k;
import b.r;

public final class t
{
  public static final boolean a(w paramw)
  {
    j.b(paramw, "receiver$0");
    return paramw.i() instanceof q;
  }
  
  public static final q b(w paramw)
  {
    j.b(paramw, "receiver$0");
    paramw = paramw.i();
    if (paramw != null) {
      return (q)paramw;
    }
    throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
  }
  
  public static final ad c(w paramw)
  {
    j.b(paramw, "receiver$0");
    paramw = paramw.i();
    if ((paramw instanceof q)) {
      return ((q)paramw).a;
    }
    if ((paramw instanceof ad)) {
      return (ad)paramw;
    }
    throw new k();
  }
  
  public static final ad d(w paramw)
  {
    j.b(paramw, "receiver$0");
    paramw = paramw.i();
    if ((paramw instanceof q)) {
      return ((q)paramw).b;
    }
    if ((paramw instanceof ad)) {
      return (ad)paramw;
    }
    throw new k();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */