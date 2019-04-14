package b.i.b.a.c.n;

import b.a.ac;
import b.d;
import b.f.a.a;
import b.f.b.j;
import b.f.b.k;
import java.util.Map;

public final class e
{
  public static final e f;
  public static final e g;
  public static final e h;
  public static final a i = new a((byte)0);
  public final g b;
  public final g c;
  public final Map<String, g> d;
  public final boolean e;
  private final d j;
  
  static
  {
    f = new e(g.b, null, ac.a(), (byte)0);
    g localg = g.a;
    g = new e(localg, localg, ac.a(), (byte)0);
    localg = g.c;
    h = new e(localg, localg, ac.a(), (byte)0);
  }
  
  private e(g paramg1, g paramg2, Map<String, ? extends g> paramMap)
  {
    this.b = paramg1;
    this.c = paramg2;
    this.d = paramMap;
    this.e = true;
    this.j = b.e.a((a)new b(this));
  }
  
  public final boolean a()
  {
    return (e)this == g;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof e))
      {
        paramObject = (e)paramObject;
        if ((j.a(this.b, ((e)paramObject).b)) && (j.a(this.c, ((e)paramObject).c)) && (j.a(this.d, ((e)paramObject).d)))
        {
          int k;
          if (this.e == ((e)paramObject).e) {
            k = 1;
          } else {
            k = 0;
          }
          if (k != 0) {
            return true;
          }
        }
      }
      return false;
    }
    return true;
  }
  
  public final int hashCode()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Jsr305State(global=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", migration=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", user=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", enableCompatqualCheckerFrameworkAnnotations=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a {}
  
  static final class b
    extends k
    implements a<String[]>
  {
    b(e parame)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/n/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */