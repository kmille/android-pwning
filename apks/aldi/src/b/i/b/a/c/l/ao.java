package b.i.b.a.c.l;

import b.a.ac;
import b.i.b.a.c.b.ar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class ao
  extends as
{
  public static final a b = new a((byte)0);
  
  public static final ao a(Map<an, ? extends ap> paramMap)
  {
    return a.a(paramMap);
  }
  
  public static final as a(an paraman, List<? extends ap> paramList)
  {
    return a.a(paraman, paramList);
  }
  
  public abstract ap a(an paraman);
  
  public final ap a(w paramw)
  {
    b.f.b.j.b(paramw, "key");
    return a(paramw.f());
  }
  
  public static final class a
  {
    public static ao a(Map<an, ? extends ap> paramMap)
    {
      b.f.b.j.b(paramMap, "map");
      return (ao)new a(paramMap);
    }
    
    public static as a(an paraman, List<? extends ap> paramList)
    {
      b.f.b.j.b(paraman, "typeConstructor");
      b.f.b.j.b(paramList, "arguments");
      Object localObject = paraman.b();
      b.f.b.j.a(localObject, "typeConstructor.parameters");
      ar localar = (ar)b.a.j.f((List)localObject);
      boolean bool;
      if (localar != null) {
        bool = localar.b();
      } else {
        bool = false;
      }
      if (bool)
      {
        paraman = paraman.b();
        b.f.b.j.a(paraman, "typeConstructor.parameters");
        localObject = (Iterable)paraman;
        paraman = (Collection)new ArrayList(b.a.j.a((Iterable)localObject));
        localObject = ((Iterable)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          localar = (ar)((Iterator)localObject).next();
          b.f.b.j.a(localar, "it");
          paraman.add(localar.c());
        }
      }
      for (paraman = a(ac.a((Iterable)b.a.j.a((Iterable)paraman, (Iterable)paramList)));; paraman = new u((List)localObject, paramList)) {
        return (as)paraman;
      }
    }
    
    public static as a(w paramw)
    {
      b.f.b.j.b(paramw, "kotlinType");
      return a(paramw.f(), paramw.a());
    }
    
    public static final class a
      extends ao
    {
      a(Map paramMap) {}
      
      public final ap a(an paraman)
      {
        b.f.b.j.b(paraman, "key");
        return (ap)this.a.get(paraman);
      }
      
      public final boolean a()
      {
        return this.a.isEmpty();
      }
      
      public final boolean c()
      {
        return this.c;
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */