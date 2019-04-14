package b.i.b.a.c.b;

import b.f.a.b;
import b.f.b.j;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.w;
import b.u;
import java.util.Collection;

public abstract interface ap
{
  public abstract Collection<w> a(an paraman, Collection<? extends w> paramCollection, b<? super an, ? extends Iterable<? extends w>> paramb, b<? super w, u> paramb1);
  
  public static final class a
    implements ap
  {
    public static final a a = new a();
    
    public final Collection<w> a(an paraman, Collection<? extends w> paramCollection, b<? super an, ? extends Iterable<? extends w>> paramb, b<? super w, u> paramb1)
    {
      j.b(paraman, "currentTypeConstructor");
      j.b(paramCollection, "superTypes");
      j.b(paramb, "neighbors");
      j.b(paramb1, "reportLoop");
      return paramCollection;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */