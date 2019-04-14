package b.i.b.a.c.b.a;

import b.f.b.j;
import b.i.b.a.c.f.b;
import java.util.Iterator;
import java.util.List;

public final class h
  implements g
{
  private final List<c> b;
  
  public h(List<? extends c> paramList)
  {
    this.b = paramList;
  }
  
  public final c a(b paramb)
  {
    j.b(paramb, "fqName");
    return g.b.a(this, paramb);
  }
  
  public final boolean a()
  {
    return this.b.isEmpty();
  }
  
  public final boolean b(b paramb)
  {
    j.b(paramb, "fqName");
    return g.b.b(this, paramb);
  }
  
  public final Iterator<c> iterator()
  {
    return this.b.iterator();
  }
  
  public final String toString()
  {
    return this.b.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */