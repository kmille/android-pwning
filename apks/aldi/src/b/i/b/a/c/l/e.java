package b.i.b.a.c.l;

import b.i.b.a.c.b.ap;
import b.i.b.a.c.b.ap.a;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.f.c;
import b.i.b.a.c.i.d;
import b.i.b.a.c.k.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class e
  extends b
  implements an
{
  private final b.i.b.a.c.b.e a;
  private final List<ar> b;
  private final Collection<w> c;
  
  public e(b.i.b.a.c.b.e parame, List<? extends ar> paramList, Collection<w> paramCollection, i parami)
  {
    super(parami);
    this.a = parame;
    this.b = Collections.unmodifiableList(new ArrayList(paramList));
    this.c = Collections.unmodifiableCollection(paramCollection);
  }
  
  protected final Collection<w> a()
  {
    return this.c;
  }
  
  public final List<ar> b()
  {
    return this.b;
  }
  
  public final boolean e()
  {
    return true;
  }
  
  protected final ap f()
  {
    return ap.a.a;
  }
  
  public final b.i.b.a.c.b.e h_()
  {
    return this.a;
  }
  
  public final String toString()
  {
    return d.c(this.a).a;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */