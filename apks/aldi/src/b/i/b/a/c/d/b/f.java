package b.i.b.a.c.d.b;

import b.f.b.j;
import b.i.b.a.c.f.a;
import b.w;

public final class f
  implements b.i.b.a.c.j.a.f
{
  private final m a;
  private final e b;
  
  public f(m paramm, e parame)
  {
    this.a = paramm;
    this.b = parame;
  }
  
  public final b.i.b.a.c.j.a.e a(a parama)
  {
    j.b(parama, "classId");
    n localn = this.a.a(parama);
    if (localn == null) {
      return null;
    }
    boolean bool = j.a(localn.b(), parama);
    if ((w.a) && (!bool))
    {
      StringBuilder localStringBuilder = new StringBuilder("Class with incorrect id found: expected ");
      localStringBuilder.append(parama);
      localStringBuilder.append(", actual ");
      localStringBuilder.append(localn.b());
      throw ((Throwable)new AssertionError(localStringBuilder.toString()));
    }
    return this.b.a(localn);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */