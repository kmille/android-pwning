package b.i.b.a.c.b.a;

import b.a.v;
import b.f.b.a.a;
import b.f.b.j;
import b.i.b.a.c.f.b;
import java.util.Iterator;
import java.util.List;

public abstract interface g
  extends a, Iterable<c>
{
  public static final a a = a.a;
  
  public abstract c a(b paramb);
  
  public abstract boolean a();
  
  public abstract boolean b(b paramb);
  
  public static final class a
  {
    private static final g b = (g)new a();
    
    public static g a()
    {
      return b;
    }
    
    public static g a(List<? extends c> paramList)
    {
      j.b(paramList, "annotations");
      if (paramList.isEmpty()) {
        return b;
      }
      return (g)new h(paramList);
    }
    
    public static final class a
      implements g
    {
      public final boolean a()
      {
        return true;
      }
      
      public final boolean b(b paramb)
      {
        j.b(paramb, "fqName");
        return g.b.b(this, paramb);
      }
      
      public final Iterator<c> iterator()
      {
        return ((List)v.a).iterator();
      }
      
      public final String toString()
      {
        return "EMPTY";
      }
    }
  }
  
  public static final class b
  {
    public static c a(g paramg, b paramb)
    {
      j.b(paramb, "fqName");
      Iterator localIterator = ((Iterable)paramg).iterator();
      while (localIterator.hasNext())
      {
        paramg = localIterator.next();
        if (j.a(((c)paramg).b(), paramb)) {
          break label53;
        }
      }
      paramg = null;
      label53:
      return (c)paramg;
    }
    
    public static boolean b(g paramg, b paramb)
    {
      j.b(paramb, "fqName");
      return paramg.a(paramb) != null;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */