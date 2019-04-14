package b.i.b.a.c.i.b;

import b.f.b.j;
import b.i.b.a.c.a.g;
import b.i.b.a.c.a.g.a;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.s;
import b.i.b.a.c.b.y;
import b.i.b.a.c.f.a;
import b.i.b.a.c.l.p;

public final class w
  extends x<Short>
{
  public w(short paramShort)
  {
    super(Short.valueOf(paramShort));
  }
  
  public final b.i.b.a.c.l.w a(y paramy)
  {
    j.b(paramy, "module");
    a locala = g.k.aq;
    j.a(locala, "KotlinBuiltIns.FQ_NAMES.uShort");
    paramy = s.a(paramy, locala);
    if (paramy != null)
    {
      paramy = paramy.h();
      if (paramy != null) {
        return (b.i.b.a.c.l.w)paramy;
      }
    }
    paramy = p.c("Unsigned type UShort not found");
    j.a(paramy, "ErrorUtils.createErrorTy…d type UShort not found\")");
    return (b.i.b.a.c.l.w)paramy;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(((Number)a()).shortValue());
    localStringBuilder.append(".toUShort()");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/b/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */