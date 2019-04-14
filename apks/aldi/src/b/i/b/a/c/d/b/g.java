package b.i.b.a.c.d.b;

import b.f.b.j;
import b.i.b.a.c.e.a.aa;
import b.i.b.a.c.e.b.b;
import b.i.b.a.c.j.a.n;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.p;
import b.i.b.a.c.l.w;
import b.i.b.a.c.l.x;

public final class g
  implements n
{
  public static final g a = new g();
  
  public final w a(a.aa paramaa, String paramString, ad paramad1, ad paramad2)
  {
    j.b(paramaa, "proto");
    j.b(paramString, "flexibleId");
    j.b(paramad1, "lowerBound");
    j.b(paramad2, "upperBound");
    if ((j.a(paramString, "kotlin.jvm.PlatformType") ^ true))
    {
      paramaa = new StringBuilder("Error java flexible type with id: ");
      paramaa.append(paramString);
      paramaa.append(". (");
      paramaa.append(paramad1);
      paramaa.append("..");
      paramaa.append(paramad2);
      paramaa.append(')');
      paramaa = p.c(paramaa.toString());
      j.a(paramaa, "ErrorUtils.createErrorTy…owerBound..$upperBound)\")");
    }
    for (;;)
    {
      return (w)paramaa;
      if (paramaa.a(b.g)) {
        paramaa = new b.i.b.a.c.d.a.c.b.g(paramad1, paramad2);
      } else {
        paramaa = x.a(paramad1, paramad2);
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */