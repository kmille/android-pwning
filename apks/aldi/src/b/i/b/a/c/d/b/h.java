package b.i.b.a.c.d.b;

import b.f.b.j;
import b.k.l;

public final class h<T>
{
  private int a;
  private T b;
  private final k<T> c;
  
  public final void a()
  {
    if (this.b == null) {
      this.a += 1;
    }
  }
  
  public final void a(T paramT)
  {
    j.b(paramT, "objectType");
    b(paramT);
  }
  
  final void b(T paramT)
  {
    j.b(paramT, "type");
    if (this.b == null)
    {
      k localk = this.c;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(l.a((CharSequence)"[", this.a));
      localStringBuilder.append(this.c.b(paramT));
      this.b = localk.a(localStringBuilder.toString());
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */