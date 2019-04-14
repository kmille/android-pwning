package b.i.b.a.c.d.a.b;

import b.i.b.a.c.b.a.a;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.c.ak;
import b.i.b.a.c.b.c.z;
import b.i.b.a.c.b.l;
import b.i.b.a.c.d.a.f.s;
import b.m;
import java.util.List;

public final class f
  extends z
  implements b
{
  private final boolean u;
  private final m<a.a<?>, ?> v;
  
  private f(l paraml, b.i.b.a.c.b.a.g paramg, b.i.b.a.c.b.w paramw, az paramaz, boolean paramBoolean1, b.i.b.a.c.f.f paramf, am paramam, ah paramah, b.a parama, boolean paramBoolean2, m<a.a<?>, ?> paramm)
  {
    super(paraml, paramah, paramg, paramw, paramaz, paramBoolean1, paramf, parama, paramam, false, false, false, false, false, false);
    this.u = paramBoolean2;
    this.v = paramm;
  }
  
  public static f a(l paraml, b.i.b.a.c.b.a.g paramg, b.i.b.a.c.b.w paramw, az paramaz, boolean paramBoolean1, b.i.b.a.c.f.f paramf, am paramam, boolean paramBoolean2)
  {
    return new f(paraml, paramg, paramw, paramaz, paramBoolean1, paramf, paramam, null, b.a.a, paramBoolean2, null);
  }
  
  public final boolean B()
  {
    b.i.b.a.c.l.w localw = y();
    return (this.u) && (b.i.b.a.c.b.j.a(localw)) && ((!s.a(localw)) || (b.i.b.a.c.a.g.t(localw)));
  }
  
  public final z a(l paraml, b.i.b.a.c.b.w paramw, az paramaz, ah paramah, b.a parama, b.i.b.a.c.f.f paramf)
  {
    return new f(paraml, r(), paramw, paramaz, this.r, paramf, am.b, paramah, parama, this.u, this.v);
  }
  
  public final b a(b.i.b.a.c.l.w paramw1, List<j> paramList, b.i.b.a.c.l.w paramw2, m<a.a<?>, ?> paramm)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a28 = a19\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
  
  public final <V> V a(a.a<V> parama)
  {
    if ((this.v != null) && (((a.a)this.v.a).equals(parama))) {
      return (V)this.v.b;
    }
    return null;
  }
  
  public final boolean l()
  {
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */