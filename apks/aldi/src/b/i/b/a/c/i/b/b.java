package b.i.b.a.c.i.b;

import b.f.b.j;
import b.i.b.a.c.a.g;
import b.i.b.a.c.b.y;
import java.util.List;

public final class b
  extends f<List<? extends f<?>>>
{
  private final b.f.a.b<y, b.i.b.a.c.l.w> a;
  
  public b(List<? extends f<?>> paramList, b.f.a.b<? super y, ? extends b.i.b.a.c.l.w> paramb)
  {
    super(paramList);
    this.a = paramb;
  }
  
  public final b.i.b.a.c.l.w a(y paramy)
  {
    j.b(paramy, "module");
    paramy = (b.i.b.a.c.l.w)this.a.a(paramy);
    int i;
    if ((!g.c(paramy)) && (!g.d(paramy))) {
      i = 0;
    } else {
      i = 1;
    }
    if (b.w.a)
    {
      if (i != 0) {
        return paramy;
      }
      StringBuilder localStringBuilder = new StringBuilder("Type should be an array, but was ");
      localStringBuilder.append(paramy);
      localStringBuilder.append(": ");
      localStringBuilder.append((List)a());
      throw ((Throwable)new AssertionError(localStringBuilder.toString()));
    }
    return paramy;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */