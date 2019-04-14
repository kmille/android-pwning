package b.i.b.a.c.i.b;

import b.f.b.j;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.s;
import b.i.b.a.c.b.y;
import b.i.b.a.c.f.a;
import b.i.b.a.c.i.d;
import b.i.b.a.c.l.p;
import b.i.b.a.c.l.w;
import b.m;
import b.q;

public final class i
  extends f<m<? extends a, ? extends b.i.b.a.c.f.f>>
{
  public final b.i.b.a.c.f.f a;
  private final a b;
  
  public i(a parama, b.i.b.a.c.f.f paramf)
  {
    super(q.a(parama, paramf));
    this.b = parama;
    this.a = paramf;
  }
  
  public final w a(y paramy)
  {
    j.b(paramy, "module");
    paramy = s.a(paramy, this.b);
    if (paramy != null)
    {
      if (!d.j((l)paramy)) {
        paramy = null;
      }
      if (paramy != null)
      {
        paramy = paramy.h();
        if (paramy != null) {
          return (w)paramy;
        }
      }
    }
    paramy = new StringBuilder("Containing class for error-class based enum entry ");
    paramy.append(this.b);
    paramy.append('.');
    paramy.append(this.a);
    paramy = p.c(paramy.toString());
    j.a(paramy, "ErrorUtils.createErrorTy…mClassId.$enumEntryName\")");
    return (w)paramy;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.b.a());
    localStringBuilder.append('.');
    localStringBuilder.append(this.a);
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */