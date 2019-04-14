package b.i.b.a.c.d.a.f;

import b.a.ac;
import b.a.e;
import b.a.y;
import b.f.a.b;
import b.i.b.a.c.d.b.t;
import b.i.b.a.c.i.d.c;
import b.q;
import b.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

final class m
{
  final Map<String, j> a = (Map)new LinkedHashMap();
  
  public final class a
  {
    final String a;
    
    public a()
    {
      this.a = ((String)localObject);
    }
    
    public final void a(String paramString, b<? super a, u> paramb)
    {
      b.f.b.j.b(paramString, "name");
      b.f.b.j.b(paramb, "block");
      Map localMap = m.this.a;
      paramString = new a(paramString);
      paramb.a(paramString);
      paramString = paramString.a();
      localMap.put(paramString.a, paramString.b);
    }
    
    public final class a
    {
      private final List<b.m<String, r>> b;
      private b.m<String, r> c;
      private final String d;
      
      public a()
      {
        this.d = ((String)localObject);
        this.b = ((List)new ArrayList());
        this.c = q.a("V", null);
      }
      
      public final b.m<String, j> a()
      {
        Object localObject1 = t.a;
        localObject1 = m.a.this.a;
        Object localObject2 = this.d;
        Object localObject3 = (Iterable)this.b;
        Collection localCollection = (Collection)new ArrayList(b.a.j.a((Iterable)localObject3));
        localObject3 = ((Iterable)localObject3).iterator();
        while (((Iterator)localObject3).hasNext()) {
          localCollection.add((String)((b.m)((Iterator)localObject3).next()).a);
        }
        localObject1 = t.a((String)localObject1, t.a((String)localObject2, (List)localCollection, (String)this.c.a));
        localObject2 = (r)this.c.b;
        localObject3 = (Iterable)this.b;
        localCollection = (Collection)new ArrayList(b.a.j.a((Iterable)localObject3));
        localObject3 = ((Iterable)localObject3).iterator();
        while (((Iterator)localObject3).hasNext()) {
          localCollection.add((r)((b.m)((Iterator)localObject3).next()).b);
        }
        return q.a(localObject1, new j((r)localObject2, (List)localCollection));
      }
      
      public final void a(c paramc)
      {
        b.f.b.j.b(paramc, "type");
        this.c = q.a(paramc.k, null);
      }
      
      public final void a(String paramString, d... paramVarArgs)
      {
        b.f.b.j.b(paramString, "type");
        b.f.b.j.b(paramVarArgs, "qualifiers");
        Collection localCollection = (Collection)this.b;
        int i;
        if (paramVarArgs.length == 0) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          paramVarArgs = null;
        }
        else
        {
          Object localObject = e.j(paramVarArgs);
          paramVarArgs = (Map)new LinkedHashMap(b.h.d.b(ac.a(b.a.j.a((Iterable)localObject)), 16));
          localObject = ((Iterable)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            y localy = (y)((Iterator)localObject).next();
            paramVarArgs.put(Integer.valueOf(localy.a), (d)localy.b);
          }
          paramVarArgs = new r(paramVarArgs);
        }
        localCollection.add(q.a(paramString, paramVarArgs));
      }
      
      public final void b(String paramString, d... paramVarArgs)
      {
        b.f.b.j.b(paramString, "type");
        b.f.b.j.b(paramVarArgs, "qualifiers");
        Object localObject = e.j(paramVarArgs);
        paramVarArgs = (Map)new LinkedHashMap(b.h.d.b(ac.a(b.a.j.a((Iterable)localObject)), 16));
        localObject = ((Iterable)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          y localy = (y)((Iterator)localObject).next();
          paramVarArgs.put(Integer.valueOf(localy.a), (d)localy.b);
        }
        this.c = q.a(paramString, new r(paramVarArgs));
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/f/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */