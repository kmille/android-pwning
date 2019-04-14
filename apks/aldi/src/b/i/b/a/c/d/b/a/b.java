package b.i.b.a.c.d.b.a;

import b.i.b.a.c.b.am;
import b.i.b.a.c.d.a.p;
import b.i.b.a.c.d.b.n.a;
import b.i.b.a.c.d.b.n.b;
import b.i.b.a.c.d.b.n.c;
import b.i.b.a.c.d.b.n.d;
import b.i.b.a.c.e.b.a.d;
import b.i.b.a.c.f.a;
import b.i.b.a.c.f.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b
  implements n.c
{
  private static final boolean j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
  private static final Map<a, a.a> k;
  public int[] a = null;
  public d b = null;
  public String c = null;
  public int d = 0;
  public String e = null;
  public String[] f = null;
  public String[] g = null;
  public String[] h = null;
  public a.a i = null;
  
  static
  {
    HashMap localHashMap = new HashMap();
    k = localHashMap;
    localHashMap.put(a.a(new b.i.b.a.c.f.b("kotlin.jvm.internal.KotlinClass")), a.a.b);
    k.put(a.a(new b.i.b.a.c.f.b("kotlin.jvm.internal.KotlinFileFacade")), a.a.c);
    k.put(a.a(new b.i.b.a.c.f.b("kotlin.jvm.internal.KotlinMultifileClass")), a.a.e);
    k.put(a.a(new b.i.b.a.c.f.b("kotlin.jvm.internal.KotlinMultifileClassPart")), a.a.f);
    k.put(a.a(new b.i.b.a.c.f.b("kotlin.jvm.internal.KotlinSyntheticClass")), a.a.d);
  }
  
  public final n.a a(a parama, am paramam)
  {
    if (parama.d().equals(p.a)) {
      return new b((byte)0);
    }
    if (j) {
      return null;
    }
    if (this.i != null) {
      return null;
    }
    parama = (a.a)k.get(parama);
    if (parama != null)
    {
      this.i = parama;
      return new c((byte)0);
    }
    return null;
  }
  
  public final void a() {}
  
  static abstract class a
    implements n.b
  {
    private final List<String> a = new ArrayList();
    
    public final void a()
    {
      a((String[])this.a.toArray(new String[this.a.size()]));
    }
    
    public final void a(n.d paramd) {}
    
    public final void a(a parama, f paramf) {}
    
    public final void a(Object paramObject)
    {
      if ((paramObject instanceof String)) {
        this.a.add((String)paramObject);
      }
    }
    
    protected abstract void a(String[] paramArrayOfString);
  }
  
  final class b
    implements n.a
  {
    private b() {}
    
    public final n.a a(f paramf, a parama)
    {
      return null;
    }
    
    public final n.b a(f paramf)
    {
      paramf = paramf.a;
      if ("d1".equals(paramf)) {
        new b.a()
        {
          protected final void a(String[] paramAnonymousArrayOfString)
          {
            b.a(b.this, paramAnonymousArrayOfString);
          }
        };
      }
      if ("d2".equals(paramf)) {
        new b.a()
        {
          protected final void a(String[] paramAnonymousArrayOfString)
          {
            b.b(b.this, paramAnonymousArrayOfString);
          }
        };
      }
      return null;
    }
    
    public final void a() {}
    
    public final void a(f paramf, n.d paramd) {}
    
    public final void a(f paramf1, a parama, f paramf2) {}
    
    public final void a(f paramf, Object paramObject)
    {
      if (paramf == null) {
        return;
      }
      paramf = paramf.a;
      if ("k".equals(paramf))
      {
        if ((paramObject instanceof Integer)) {
          b.a(b.this, a.a.a(((Integer)paramObject).intValue()));
        }
      }
      else if ("mv".equals(paramf))
      {
        if ((paramObject instanceof int[])) {
          b.a(b.this, (int[])paramObject);
        }
      }
      else if ("bv".equals(paramf))
      {
        if ((paramObject instanceof int[])) {
          b.a(b.this, new d((int[])paramObject));
        }
      }
      else if ("xs".equals(paramf))
      {
        if ((paramObject instanceof String)) {
          b.a(b.this, (String)paramObject);
        }
      }
      else if ("xi".equals(paramf))
      {
        if ((paramObject instanceof Integer)) {
          b.a(b.this, ((Integer)paramObject).intValue());
        }
      }
      else if (("pn".equals(paramf)) && ((paramObject instanceof String))) {
        b.b(b.this, (String)paramObject);
      }
    }
  }
  
  final class c
    implements n.a
  {
    private c() {}
    
    public final n.a a(f paramf, a parama)
    {
      return null;
    }
    
    public final n.b a(f paramf)
    {
      paramf = paramf.a;
      if ((!"data".equals(paramf)) && (!"filePartClassNames".equals(paramf)))
      {
        if ("strings".equals(paramf)) {
          new b.a()
          {
            protected final void a(String[] paramAnonymousArrayOfString)
            {
              b.b(b.this, paramAnonymousArrayOfString);
            }
          };
        }
        return null;
      }
      new b.a()
      {
        protected final void a(String[] paramAnonymousArrayOfString)
        {
          b.a(b.this, paramAnonymousArrayOfString);
        }
      };
    }
    
    public final void a() {}
    
    public final void a(f paramf, n.d paramd) {}
    
    public final void a(f paramf1, a parama, f paramf2) {}
    
    public final void a(f paramf, Object paramObject)
    {
      if (paramf == null) {
        return;
      }
      paramf = paramf.a;
      if ("version".equals(paramf))
      {
        if ((paramObject instanceof int[]))
        {
          paramf = b.this;
          paramObject = (int[])paramObject;
          b.a(paramf, (int[])paramObject);
          if (b.a(b.this) == null) {
            b.a(b.this, new d((int[])paramObject));
          }
        }
      }
      else if ("multifileClassName".equals(paramf))
      {
        b localb = b.this;
        if ((paramObject instanceof String)) {
          paramf = (String)paramObject;
        } else {
          paramf = null;
        }
        b.a(localb, paramf);
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/b/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */