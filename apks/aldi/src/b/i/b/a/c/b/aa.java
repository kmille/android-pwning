package b.i.b.a.c.b;

import b.a.ai;
import b.a.v;
import b.a.x;
import b.f.b.k;
import b.i.b.a.c.b.a.g.a;
import b.i.b.a.c.b.c.ah;
import b.i.b.a.c.b.c.m;
import b.i.b.a.c.k.c;
import b.i.b.a.c.k.i;
import b.i.b.a.c.l.ba;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class aa
{
  final c<b.i.b.a.c.f.b, ab> a;
  final i b;
  final y c;
  private final c<a, e> d;
  
  public aa(i parami, y paramy)
  {
    this.b = parami;
    this.c = paramy;
    this.a = this.b.a((b.f.a.b)new d(this));
    this.d = this.b.a((b.f.a.b)new c(this));
  }
  
  public final e a(b.i.b.a.c.f.a parama, List<Integer> paramList)
  {
    b.f.b.j.b(parama, "classId");
    b.f.b.j.b(paramList, "typeParametersCount");
    return (e)this.d.a(new a(parama, paramList));
  }
  
  static final class a
  {
    final b.i.b.a.c.f.a a;
    final List<Integer> b;
    
    public a(b.i.b.a.c.f.a parama, List<Integer> paramList)
    {
      this.a = parama;
      this.b = paramList;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if ((b.f.b.j.a(this.a, ((a)paramObject).a)) && (b.f.b.j.a(this.b, ((a)paramObject).b))) {}
        }
        else
        {
          return false;
        }
      }
      return true;
    }
    
    public final int hashCode()
    {
      Object localObject = this.a;
      int j = 0;
      int i;
      if (localObject != null) {
        i = localObject.hashCode();
      } else {
        i = 0;
      }
      localObject = this.b;
      if (localObject != null) {
        j = localObject.hashCode();
      }
      return i * 31 + j;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("ClassRequest(classId=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", typeParametersCount=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends b.i.b.a.c.b.c.g
  {
    private final List<ar> a;
    private final b.i.b.a.c.l.e b;
    private final boolean c;
    
    public b(i parami, l paraml, b.i.b.a.c.f.f paramf, boolean paramBoolean, int paramInt)
    {
      super(paraml, paramf, am.b);
      this.c = paramBoolean;
      paramf = (Iterable)b.h.d.a(0, paramInt);
      paraml = (Collection)new ArrayList(b.a.j.a(paramf));
      paramf = paramf.iterator();
      while (paramf.hasNext())
      {
        paramInt = ((b.a.ab)paramf).a();
        l locall = (l)this;
        g.a locala = b.i.b.a.c.b.a.g.a;
        paraml.add(ah.a(locall, g.a.a(), ba.a, b.i.b.a.c.f.f.a("T".concat(String.valueOf(paramInt))), paramInt));
      }
      this.a = ((List)paraml);
      this.b = new b.i.b.a.c.l.e((e)this, this.a, (Collection)ai.a(b.i.b.a.c.i.c.a.c(this).b().g()), parami);
    }
    
    public final w d_()
    {
      return w.a;
    }
    
    public final e e()
    {
      return null;
    }
    
    public final d e_()
    {
      return null;
    }
    
    public final Collection<d> f()
    {
      return (Collection)x.a;
    }
    
    public final f g()
    {
      return f.a;
    }
    
    public final az j()
    {
      az localaz = ay.e;
      b.f.b.j.a(localaz, "Visibilities.PUBLIC");
      return localaz;
    }
    
    public final boolean k()
    {
      return false;
    }
    
    public final boolean l()
    {
      return this.c;
    }
    
    public final boolean m()
    {
      return false;
    }
    
    public final boolean n()
    {
      return false;
    }
    
    public final boolean o()
    {
      return false;
    }
    
    public final boolean p()
    {
      return false;
    }
    
    public final boolean q()
    {
      return false;
    }
    
    public final b.i.b.a.c.b.a.g r()
    {
      g.a locala = b.i.b.a.c.b.a.g.a;
      return g.a.a();
    }
    
    public final Collection<e> t()
    {
      return (Collection)v.a;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("class ");
      localStringBuilder.append(this.d);
      localStringBuilder.append(" (not found)");
      return localStringBuilder.toString();
    }
    
    public final List<ar> u()
    {
      return this.a;
    }
  }
  
  static final class c
    extends k
    implements b.f.a.b<aa.a, aa.b>
  {
    c(aa paramaa)
    {
      super();
    }
  }
  
  static final class d
    extends k
    implements b.f.a.b<b.i.b.a.c.f.b, m>
  {
    d(aa paramaa)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */