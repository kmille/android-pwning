package b.i.b.a.c.e.a;

import b.f.b.j;
import b.i.b.a.c.g.i.c;
import b.i.b.a.c.g.i.f;
import java.util.List;

public final class f
{
  public static final <M extends i.c<M>, T> T a(i.c<M> paramc, i.f<M, T> paramf)
  {
    j.b(paramc, "receiver$0");
    j.b(paramf, "extension");
    if (paramc.a(paramf)) {
      return (T)paramc.c(paramf);
    }
    return null;
  }
  
  public static final <M extends i.c<M>, T> T a(i.c<M> paramc, i.f<M, List<T>> paramf, int paramInt)
  {
    j.b(paramc, "receiver$0");
    j.b(paramf, "extension");
    if (paramInt < paramc.b(paramf)) {
      return (T)paramc.a(paramf, paramInt);
    }
    return null;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/e/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */