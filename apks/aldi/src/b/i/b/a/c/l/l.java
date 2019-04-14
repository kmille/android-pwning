package b.i.b.a.c.l;

import b.f.b.j;
import b.i.b.a.c.b.a.g;

public final class l
  extends as
{
  public static final a a = new a((byte)0);
  private final as b;
  private final as c;
  
  private l(as paramas1, as paramas2)
  {
    this.b = paramas1;
    this.c = paramas2;
  }
  
  public static final as a(as paramas1, as paramas2)
  {
    j.b(paramas1, "first");
    j.b(paramas2, "second");
    if (paramas1.a()) {
      return paramas2;
    }
    if (paramas2.a()) {
      return paramas1;
    }
    return (as)new l(paramas1, paramas2, (byte)0);
  }
  
  public final g a(g paramg)
  {
    j.b(paramg, "annotations");
    return this.c.a(this.b.a(paramg));
  }
  
  public final ap a(w paramw)
  {
    j.b(paramw, "key");
    ap localap2 = this.b.a(paramw);
    ap localap1 = localap2;
    if (localap2 == null) {
      localap1 = this.c.a(paramw);
    }
    return localap1;
  }
  
  public final w a(w paramw, ba paramba)
  {
    j.b(paramw, "topLevelType");
    j.b(paramba, "position");
    return this.c.a(this.b.a(paramw, paramba), paramba);
  }
  
  public final boolean a()
  {
    return false;
  }
  
  public final boolean b()
  {
    return (this.b.b()) || (this.c.b());
  }
  
  public final boolean c()
  {
    return (this.b.c()) || (this.c.c());
  }
  
  public static final class a {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */