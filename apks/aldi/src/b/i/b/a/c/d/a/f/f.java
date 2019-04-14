package b.i.b.a.c.d.a.f;

import b.f.b.j;
import b.i.b.a.c.b.a.g;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.av;
import b.i.b.a.c.l.ax;
import b.i.b.a.c.l.c.a;
import b.i.b.a.c.l.i;
import b.i.b.a.c.l.q;
import b.i.b.a.c.l.w;
import b.i.b.a.c.l.x;

public final class f
  extends i
  implements b.i.b.a.c.l.f
{
  private final ad a;
  
  public f(ad paramad)
  {
    this.a = paramad;
  }
  
  private static ad a(ad paramad)
  {
    ad localad = paramad.b(false);
    if (!a.e((w)paramad)) {
      return localad;
    }
    return (ad)new f(localad);
  }
  
  private f c(g paramg)
  {
    j.b(paramg, "newAnnotations");
    return new f(this.a.b(paramg));
  }
  
  public final w a_(w paramw)
  {
    j.b(paramw, "replacement");
    Object localObject = paramw.i();
    paramw = (w)localObject;
    if ((!av.e(paramw)) && (!a.e(paramw))) {
      return paramw;
    }
    if ((localObject instanceof ad)) {}
    for (paramw = a((ad)localObject);; paramw = ax.b(x.a(a(((q)localObject).a), a(((q)localObject).b)), ax.a(paramw)))
    {
      return (w)paramw;
      if (!(localObject instanceof q)) {
        break;
      }
      localObject = (q)localObject;
    }
    throw ((Throwable)new IllegalStateException("Incorrect type: ".concat(String.valueOf(localObject)).toString()));
  }
  
  public final ad b(boolean paramBoolean)
  {
    if (paramBoolean) {
      return this.a.b(true);
    }
    return (ad)this;
  }
  
  public final boolean c()
  {
    return false;
  }
  
  public final ad d()
  {
    return this.a;
  }
  
  public final boolean o_()
  {
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/f/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */