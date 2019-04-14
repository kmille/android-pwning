package b.i.b.a.c.i.e;

import b.f.b.j;
import b.i.b.a.c.b.aq;
import b.i.b.a.c.b.e;
import b.i.b.a.c.c.a.a;
import java.util.Set;

public final class f
  extends i
{
  private final h a;
  
  public f(h paramh)
  {
    this.a = paramh;
  }
  
  public final b.i.b.a.c.b.h c(b.i.b.a.c.f.f paramf, a parama)
  {
    j.b(paramf, "name");
    j.b(parama, "location");
    paramf = this.a.c(paramf, parama);
    if (paramf != null)
    {
      if (!(paramf instanceof e)) {
        parama = null;
      } else {
        parama = paramf;
      }
      parama = (e)parama;
      if (parama != null) {
        return (b.i.b.a.c.b.h)parama;
      }
      parama = paramf;
      if (!(paramf instanceof aq)) {
        parama = null;
      }
      return (b.i.b.a.c.b.h)parama;
    }
    return null;
  }
  
  public final Set<b.i.b.a.c.f.f> j_()
  {
    return this.a.j_();
  }
  
  public final Set<b.i.b.a.c.f.f> l_()
  {
    return this.a.l_();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Classes from ");
    localStringBuilder.append(this.a);
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/e/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */