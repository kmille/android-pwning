package b.i.b.a.c.d.b;

import b.i.b.a.c.b.a.d;
import b.i.b.a.c.b.aa;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.s;
import b.i.b.a.c.b.y;
import b.i.b.a.c.i.b.g;
import b.i.b.a.c.i.b.j.a;
import b.i.b.a.c.l.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class c
  extends a<b.i.b.a.c.b.a.c, b.i.b.a.c.i.b.f<?>>
{
  private final b.i.b.a.c.j.a.c a;
  private final y b;
  private final aa c;
  
  public c(y paramy, aa paramaa, b.i.b.a.c.k.i parami, m paramm)
  {
    super(parami, paramm);
    this.b = paramy;
    this.c = paramaa;
    this.a = new b.i.b.a.c.j.a.c(this.b, this.c);
  }
  
  private final e a(b.i.b.a.c.f.a parama)
  {
    return s.a(this.b, parama, this.c);
  }
  
  protected final n.a a(b.i.b.a.c.f.a parama, final am paramam, final List<b.i.b.a.c.b.a.c> paramList)
  {
    b.f.b.j.b(parama, "annotationClassId");
    b.f.b.j.b(paramam, "source");
    b.f.b.j.b(paramList, "result");
    return (n.a)new a(this, a(parama), paramList, paramam);
  }
  
  public static final class a
    implements n.a
  {
    final HashMap<b.i.b.a.c.f.f, b.i.b.a.c.i.b.f<?>> a = new HashMap();
    
    a(e parame, List paramList, am paramam) {}
    
    static b.i.b.a.c.i.b.f<?> b(b.i.b.a.c.f.f paramf, Object paramObject)
    {
      b.i.b.a.c.i.b.f localf = g.a.a(paramObject);
      paramObject = localf;
      if (localf == null)
      {
        paramObject = b.i.b.a.c.i.b.j.a;
        paramObject = (b.i.b.a.c.i.b.f)j.a.a("Unsupported annotation argument: ".concat(String.valueOf(paramf)));
      }
      return (b.i.b.a.c.i.b.f<?>)paramObject;
    }
    
    public final n.a a(final b.i.b.a.c.f.f paramf, b.i.b.a.c.f.a parama)
    {
      b.f.b.j.b(paramf, "name");
      b.f.b.j.b(parama, "classId");
      final ArrayList localArrayList = new ArrayList();
      c localc = this.b;
      am localam = am.b;
      b.f.b.j.a(localam, "SourceElement.NO_SOURCE");
      return (n.a)new a(this, localc.a(parama, localam, (List)localArrayList), paramf, localArrayList);
    }
    
    public final n.b a(final b.i.b.a.c.f.f paramf)
    {
      b.f.b.j.b(paramf, "name");
      return (n.b)new b(this, paramf);
    }
    
    public final void a()
    {
      paramList.add(new d((w)this.c.h(), (Map)this.a, paramam));
    }
    
    public final void a(b.i.b.a.c.f.f paramf, n.d paramd)
    {
      b.f.b.j.b(paramf, "name");
      b.f.b.j.b(paramd, "classLiteralId");
      Map localMap = (Map)this.a;
      Object localObject = c.a(this.b, paramd);
      if (localObject != null)
      {
        paramd = (b.i.b.a.c.i.b.f)localObject;
      }
      else
      {
        localObject = b.i.b.a.c.i.b.j.a;
        localObject = new StringBuilder("Error value of annotation argument: ");
        ((StringBuilder)localObject).append(paramf);
        ((StringBuilder)localObject).append(": class ");
        ((StringBuilder)localObject).append(paramd.a.d());
        ((StringBuilder)localObject).append(" not found");
        paramd = (b.i.b.a.c.i.b.f)j.a.a(((StringBuilder)localObject).toString());
      }
      localMap.put(paramf, paramd);
    }
    
    public final void a(b.i.b.a.c.f.f paramf1, b.i.b.a.c.f.a parama, b.i.b.a.c.f.f paramf2)
    {
      b.f.b.j.b(paramf1, "name");
      b.f.b.j.b(parama, "enumClassId");
      b.f.b.j.b(paramf2, "enumEntryName");
      ((Map)this.a).put(paramf1, new b.i.b.a.c.i.b.i(parama, paramf2));
    }
    
    public final void a(b.i.b.a.c.f.f paramf, Object paramObject)
    {
      if (paramf != null) {
        ((Map)this.a).put(paramf, b(paramf, paramObject));
      }
    }
    
    public static final class a
      implements n.a
    {
      a(n.a parama, b.i.b.a.c.f.f paramf, ArrayList paramArrayList)
      {
        this.e = paramf;
      }
      
      public final n.a a(b.i.b.a.c.f.f paramf, b.i.b.a.c.f.a parama)
      {
        b.f.b.j.b(paramf, "name");
        b.f.b.j.b(parama, "classId");
        return this.e.a(paramf, parama);
      }
      
      public final n.b a(b.i.b.a.c.f.f paramf)
      {
        b.f.b.j.b(paramf, "name");
        return this.e.a(paramf);
      }
      
      public final void a()
      {
        this.b.a();
        ((Map)this.a.a).put(paramf, new b.i.b.a.c.i.b.a((b.i.b.a.c.b.a.c)b.a.j.g((List)localArrayList)));
      }
      
      public final void a(b.i.b.a.c.f.f paramf, n.d paramd)
      {
        b.f.b.j.b(paramf, "name");
        b.f.b.j.b(paramd, "classLiteralId");
        this.e.a(paramf, paramd);
      }
      
      public final void a(b.i.b.a.c.f.f paramf1, b.i.b.a.c.f.a parama, b.i.b.a.c.f.f paramf2)
      {
        b.f.b.j.b(paramf1, "name");
        b.f.b.j.b(parama, "enumClassId");
        b.f.b.j.b(paramf2, "enumEntryName");
        this.e.a(paramf1, parama, paramf2);
      }
      
      public final void a(b.i.b.a.c.f.f paramf, Object paramObject)
      {
        this.e.a(paramf, paramObject);
      }
    }
    
    public static final class b
      implements n.b
    {
      private final ArrayList<b.i.b.a.c.i.b.f<?>> c = new ArrayList();
      
      b(b.i.b.a.c.f.f paramf) {}
      
      public final void a()
      {
        Object localObject1 = b.i.b.a.c.d.a.a.a.a(paramf, this.a.c);
        if (localObject1 != null)
        {
          Map localMap = (Map)this.a.a;
          b.i.b.a.c.f.f localf = paramf;
          Object localObject2 = g.a;
          localObject2 = b.i.b.a.c.n.a.a(this.c);
          localObject1 = ((au)localObject1).y();
          b.f.b.j.a(localObject1, "parameter.type");
          localMap.put(localf, g.a((List)localObject2, (w)localObject1));
        }
      }
      
      public final void a(n.d paramd)
      {
        b.f.b.j.b(paramd, "classLiteralId");
        ArrayList localArrayList = this.c;
        Object localObject = c.a(this.a.b, paramd);
        if (localObject != null)
        {
          paramd = (b.i.b.a.c.i.b.f)localObject;
        }
        else
        {
          localObject = b.i.b.a.c.i.b.j.a;
          localObject = new StringBuilder("Error array element value of annotation argument: ");
          ((StringBuilder)localObject).append(paramf);
          ((StringBuilder)localObject).append(": class ");
          ((StringBuilder)localObject).append(paramd.a.d());
          ((StringBuilder)localObject).append(" not found");
          paramd = (b.i.b.a.c.i.b.f)j.a.a(((StringBuilder)localObject).toString());
        }
        localArrayList.add(paramd);
      }
      
      public final void a(b.i.b.a.c.f.a parama, b.i.b.a.c.f.f paramf)
      {
        b.f.b.j.b(parama, "enumClassId");
        b.f.b.j.b(paramf, "enumEntryName");
        this.c.add(new b.i.b.a.c.i.b.i(parama, paramf));
      }
      
      public final void a(Object paramObject)
      {
        this.c.add(c.a.b(paramf, paramObject));
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */