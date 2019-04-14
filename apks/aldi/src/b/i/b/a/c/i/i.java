package b.i.b.a.c.i;

import b.f.b.j;
import b.i.b.a.c.b.b;
import java.util.Collection;

public abstract class i
{
  public abstract void a(b paramb);
  
  public void a(b paramb, Collection<? extends b> paramCollection)
  {
    j.b(paramb, "member");
    j.b(paramCollection, "overridden");
    paramb.a(paramCollection);
  }
  
  public abstract void b(b paramb1, b paramb2);
  
  public abstract void c(b paramb1, b paramb2);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */