package b.i.b.a.c.n;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class b
{
  public static <N> Boolean a(Collection<N> paramCollection, b<N> paramb, b.f.a.b<N, Boolean> paramb1)
  {
    (Boolean)a(paramCollection, paramb, new a()
    {
      public final boolean a(N paramAnonymousN)
      {
        if (((Boolean)this.a.a(paramAnonymousN)).booleanValue()) {
          this.b[0] = true;
        }
        return this.b[0] == 0;
      }
    });
  }
  
  public static <N, R> R a(Collection<N> paramCollection, b<N> paramb, c<N, R> paramc)
  {
    return (R)a(paramCollection, paramb, new e(), paramc);
  }
  
  private static <N, R> R a(Collection<N> paramCollection, b<N> paramb, d<N> paramd, c<N, R> paramc)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      a(paramCollection.next(), paramb, paramd, paramc);
    }
    return (R)paramc.a();
  }
  
  private static <N> void a(N paramN, b<N> paramb, d<N> paramd, c<N, ?> paramc)
  {
    if (!paramd.a(paramN)) {
      return;
    }
    if (!paramc.a(paramN)) {
      return;
    }
    Iterator localIterator = paramb.a(paramN).iterator();
    while (localIterator.hasNext()) {
      a(localIterator.next(), paramb, paramd, paramc);
    }
    paramc.b(paramN);
  }
  
  public static abstract class a<N, R>
    implements b.c<N, R>
  {
    public boolean a(N paramN)
    {
      return true;
    }
    
    public void b(N paramN) {}
  }
  
  public static abstract interface b<N>
  {
    public abstract Iterable<? extends N> a(N paramN);
  }
  
  public static abstract interface c<N, R>
  {
    public abstract R a();
    
    public abstract boolean a(N paramN);
    
    public abstract void b(N paramN);
  }
  
  public static abstract interface d<N>
  {
    public abstract boolean a(N paramN);
  }
  
  public static final class e<N>
    implements b.d<N>
  {
    private final Set<N> a;
    
    public e()
    {
      this(new HashSet());
    }
    
    private e(Set<N> paramSet)
    {
      this.a = paramSet;
    }
    
    public final boolean a(N paramN)
    {
      return this.a.add(paramN);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/n/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */