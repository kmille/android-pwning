package b.i.b.a.c.j.a;

import b.a.ai;
import b.f.a.b;
import b.f.b.j;
import b.f.b.k;
import b.i.b.a.c.f.a;
import b.i.b.a.c.f.c;
import java.util.Set;

public final class g
{
  public static final b a = new b((byte)0);
  private static final Set<a> d = ai.a(a.a(b.i.b.a.c.a.g.k.c.b()));
  private final b<a, b.i.b.a.c.b.e> b;
  private final i c;
  
  public g(i parami)
  {
    this.c = parami;
    this.b = ((b)this.c.b.b((b)new c(this)));
  }
  
  public final b.i.b.a.c.b.e a(a parama, e parame)
  {
    j.b(parama, "classId");
    return (b.i.b.a.c.b.e)this.b.a(new a(parama, parame));
  }
  
  static final class a
  {
    final a a;
    final e b;
    
    public a(a parama, e parame)
    {
      this.a = parama;
      this.b = parame;
    }
    
    public final boolean equals(Object paramObject)
    {
      return ((paramObject instanceof a)) && (j.a(this.a, ((a)paramObject).a));
    }
    
    public final int hashCode()
    {
      return this.a.hashCode();
    }
  }
  
  public static final class b {}
  
  static final class c
    extends k
    implements b<g.a, b.i.b.a.c.b.e>
  {
    c(g paramg)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/j/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */