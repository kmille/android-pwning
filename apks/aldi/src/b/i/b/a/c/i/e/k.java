package b.i.b.a.c.i.e;

import b.f.a.a;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.e;
import b.i.b.a.c.k.h;
import b.w;
import java.util.List;

public final class k
  extends i
{
  private final b.i.b.a.c.k.f b;
  private final e c;
  
  public k(b.i.b.a.c.k.i parami, e parame)
  {
    this.c = parame;
    int i;
    if (this.c.g() == b.i.b.a.c.b.f.c) {
      i = 1;
    } else {
      i = 0;
    }
    if ((w.a) && (i == 0))
    {
      parami = new StringBuilder("Class should be an enum: ");
      parami.append(this.c);
      throw ((Throwable)new AssertionError(parami.toString()));
    }
    this.b = parami.a((a)new a(this));
  }
  
  private final List<al> c()
  {
    return (List)h.a(this.b, a[0]);
  }
  
  static final class a
    extends b.f.b.k
    implements a<List<? extends al>>
  {
    a(k paramk)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/e/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */