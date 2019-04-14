package b.i.b.a.c.l;

import b.f.b.j;
import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.h.i;
import b.i.b.a.c.l.c.a;
import b.k;

public final class r
  extends q
  implements f
{
  public static boolean c;
  public static final a d = new a((byte)0);
  private boolean e;
  
  public r(ad paramad1, ad paramad2)
  {
    super(paramad1, paramad2);
  }
  
  public final az a(g paramg)
  {
    j.b(paramg, "newAnnotations");
    return x.a(this.a.b(paramg), this.b.b(paramg));
  }
  
  public final az a(boolean paramBoolean)
  {
    return x.a(this.a.b(paramBoolean), this.b.b(paramBoolean));
  }
  
  public final String a(b.i.b.a.c.h.c paramc, i parami)
  {
    j.b(paramc, "renderer");
    j.b(parami, "options");
    if (parami.b())
    {
      parami = new StringBuilder("(");
      parami.append(paramc.a((w)this.a));
      parami.append("..");
      parami.append(paramc.a((w)this.b));
      parami.append(')');
      return parami.toString();
    }
    return paramc.a(paramc.a((w)this.a), paramc.a((w)this.b), a.a(this));
  }
  
  public final w a_(w paramw)
  {
    j.b(paramw, "replacement");
    az localaz = paramw.i();
    if ((localaz instanceof q))
    {
      paramw = localaz;
    }
    else
    {
      if (!(localaz instanceof ad)) {
        break label57;
      }
      paramw = (ad)localaz;
      paramw = x.a(paramw, paramw.b(true));
    }
    return (w)ax.a(paramw, (w)localaz);
    label57:
    throw new k();
  }
  
  public final ad n_()
  {
    if ((c) && (!this.e))
    {
      this.e = true;
      boolean bool = t.a((w)this.a);
      StringBuilder localStringBuilder;
      if ((b.w.a) && (!(bool ^ true)))
      {
        localStringBuilder = new StringBuilder("Lower bound of a flexible type can not be flexible: ");
        localStringBuilder.append(this.a);
        throw ((Throwable)new AssertionError(localStringBuilder.toString()));
      }
      bool = t.a((w)this.b);
      if ((b.w.a) && (!(bool ^ true)))
      {
        localStringBuilder = new StringBuilder("Upper bound of a flexible type can not be flexible: ");
        localStringBuilder.append(this.b);
        throw ((Throwable)new AssertionError(localStringBuilder.toString()));
      }
      bool = j.a(this.a, this.b);
      if ((b.w.a) && (!(true ^ bool)))
      {
        localStringBuilder = new StringBuilder("Lower and upper bounds are equal: ");
        localStringBuilder.append(this.a);
        localStringBuilder.append(" == ");
        localStringBuilder.append(this.b);
        throw ((Throwable)new AssertionError(localStringBuilder.toString()));
      }
      bool = b.i.b.a.c.l.a.c.a.a((w)this.a, (w)this.b);
      if ((b.w.a) && (!bool))
      {
        localStringBuilder = new StringBuilder("Lower bound ");
        localStringBuilder.append(this.a);
        localStringBuilder.append(" of a flexible type must be a subtype of the upper bound ");
        localStringBuilder.append(this.b);
        throw ((Throwable)new AssertionError(localStringBuilder.toString()));
      }
    }
    return this.a;
  }
  
  public final boolean o_()
  {
    return ((this.a.f().c() instanceof ar)) && (j.a(this.a.f(), this.b.f()));
  }
  
  public static final class a {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */