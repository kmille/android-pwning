package b.i.b.a.c.i;

import b.f.b.j;
import b.i.b.a.c.b.b;

public abstract class h
  extends i
{
  protected abstract void a(b paramb1, b paramb2);
  
  public final void b(b paramb1, b paramb2)
  {
    j.b(paramb1, "fromSuper");
    j.b(paramb2, "fromCurrent");
    a(paramb1, paramb2);
  }
  
  public final void c(b paramb1, b paramb2)
  {
    j.b(paramb1, "first");
    j.b(paramb2, "second");
    a(paramb1, paramb2);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */