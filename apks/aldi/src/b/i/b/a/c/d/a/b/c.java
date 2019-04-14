package b.i.b.a.c.d.a.b;

import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.t;

public class c
  extends b.i.b.a.c.b.c.f
  implements b
{
  private Boolean w = null;
  private Boolean x = null;
  
  private c(e parame, c paramc, g paramg, boolean paramBoolean, b.a parama, am paramam)
  {
    super(parame, paramc, paramg, paramBoolean, parama, paramam);
  }
  
  public static c a(e parame, g paramg, boolean paramBoolean, am paramam)
  {
    return new c(parame, null, paramg, paramBoolean, b.a.a, paramam);
  }
  
  private c c(l paraml, t paramt, b.a parama, b.i.b.a.c.f.f paramf, g paramg, am paramam)
  {
    if ((parama != b.a.a) && (parama != b.a.d))
    {
      paramt = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
      paramt.append(this);
      paramt.append("\nnewOwner: ");
      paramt.append(paraml);
      paramt.append("\nkind: ");
      paramt.append(parama);
      throw new IllegalStateException(paramt.toString());
    }
    if ((!v) && (paramf != null)) {
      throw new AssertionError("Attempt to rename constructor: ".concat(String.valueOf(this)));
    }
    paraml = new c((e)paraml, (c)paramt, paramg, this.a, parama, paramam);
    paraml.a(F());
    paraml.b(l());
    return paraml;
  }
  
  public final boolean F()
  {
    if ((!v) && (this.w == null)) {
      throw new AssertionError("hasStableParameterNames was not set: ".concat(String.valueOf(this)));
    }
    return this.w.booleanValue();
  }
  
  public final void a(boolean paramBoolean)
  {
    this.w = Boolean.valueOf(paramBoolean);
  }
  
  public final void b(boolean paramBoolean)
  {
    this.x = Boolean.valueOf(paramBoolean);
  }
  
  public final boolean l()
  {
    if ((!v) && (this.x == null)) {
      throw new AssertionError("hasSynthesizedParameterNames was not set: ".concat(String.valueOf(this)));
    }
    return this.x.booleanValue();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */