package b.i.b.a.c.i.b;

import b.f.b.j;
import b.i.b.a.c.a.g;
import b.i.b.a.c.a.g.a;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.s;
import b.i.b.a.c.b.y;
import b.i.b.a.c.f.a;
import b.i.b.a.c.l.p;
import b.i.b.a.c.l.w;

public final class u
  extends x<Integer>
{
  public u(int paramInt)
  {
    super(Integer.valueOf(paramInt));
  }
  
  public final w a(y paramy)
  {
    j.b(paramy, "module");
    a locala = g.k.ar;
    j.a(locala, "KotlinBuiltIns.FQ_NAMES.uInt");
    paramy = s.a(paramy, locala);
    if (paramy != null)
    {
      paramy = paramy.h();
      if (paramy != null) {
        return (w)paramy;
      }
    }
    paramy = p.c("Unsigned type UInt not found");
    j.a(paramy, "ErrorUtils.createErrorTy…ned type UInt not found\")");
    return (w)paramy;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(((Number)a()).intValue());
    localStringBuilder.append(".toUInt()");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/b/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */