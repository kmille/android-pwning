package b.i.b.a.c.l;

import b.f.b.j;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.l.a.k;
import b.i.b.a.c.l.a.l;
import b.i.b.a.c.l.c.a;

public final class g
  extends i
  implements f
{
  public static final a b = new a((byte)0);
  final ad a;
  
  private g(ad paramad)
  {
    this.a = paramad;
  }
  
  private g c(b.i.b.a.c.b.a.g paramg)
  {
    j.b(paramg, "newAnnotations");
    return new g(this.a.b(paramg));
  }
  
  public final w a_(w paramw)
  {
    j.b(paramw, "replacement");
    paramw = paramw.i();
    j.b(paramw, "receiver$0");
    g localg = a.a(paramw);
    if (localg != null) {
      paramw = (az)localg;
    } else {
      paramw = paramw.a(false);
    }
    return (w)paramw;
  }
  
  public final ad b(boolean paramBoolean)
  {
    if (paramBoolean) {
      return this.a.b(paramBoolean);
    }
    return (ad)this;
  }
  
  public final boolean c()
  {
    return false;
  }
  
  protected final ad d()
  {
    return this.a;
  }
  
  public final boolean o_()
  {
    return ((this.a.f() instanceof k)) || ((this.a.f().c() instanceof ar));
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a);
    localStringBuilder.append("!!");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public static g a(az paramaz)
    {
      j.b(paramaz, "type");
      if ((paramaz instanceof g)) {
        return (g)paramaz;
      }
      if (b(paramaz))
      {
        if ((paramaz instanceof q))
        {
          Object localObject = (q)paramaz;
          boolean bool = j.a(((q)localObject).a.f(), ((q)localObject).b.f());
          if ((b.w.a) && (!bool))
          {
            localObject = new StringBuilder("DefinitelyNotNullType for flexible type (");
            ((StringBuilder)localObject).append(paramaz);
            ((StringBuilder)localObject).append(") can be created only from type variable with the same constructor for bounds");
            throw ((Throwable)new AssertionError(((StringBuilder)localObject).toString()));
          }
        }
        return new g(t.c((w)paramaz), (byte)0);
      }
      return null;
    }
    
    private static boolean b(az paramaz)
    {
      j.b(paramaz, "type");
      if (a.a(paramaz))
      {
        l locall = l.a;
        if (!l.a(paramaz)) {
          return true;
        }
      }
      return false;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */