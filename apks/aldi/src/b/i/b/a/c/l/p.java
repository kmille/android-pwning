package b.i.b.a.c.l;

import b.a.v;
import b.i.b.a.c.b.a.g.a;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.ay;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.c.z;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.n;
import b.i.b.a.c.b.y;
import b.i.b.a.c.i.e.d;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class p
{
  public static final ad a;
  private static final y b = new y()
  {
    public final b.i.b.a.c.b.ad a(b.i.b.a.c.f.b paramAnonymousb)
    {
      throw new IllegalStateException("Should not be called!");
    }
    
    public final l a()
    {
      return null;
    }
    
    public final <R, D> R a(n<R, D> paramAnonymousn, D paramAnonymousD)
    {
      return null;
    }
    
    public final Collection<b.i.b.a.c.f.b> a(b.i.b.a.c.f.b paramAnonymousb, b.f.a.b<? super b.i.b.a.c.f.f, Boolean> paramAnonymousb1)
    {
      return (List)v.a;
    }
    
    public final boolean a(y paramAnonymousy)
    {
      return false;
    }
    
    public final b.i.b.a.c.a.g b()
    {
      return b.i.b.a.c.a.e.a();
    }
    
    public final l g_()
    {
      return this;
    }
    
    public final b.i.b.a.c.f.f i()
    {
      return b.i.b.a.c.f.f.c("<ERROR MODULE>");
    }
    
    public final b.i.b.a.c.b.a.g r()
    {
      g.a locala = b.i.b.a.c.b.a.g.a;
      return g.a.a();
    }
  };
  private static final a c = new a(b.i.b.a.c.f.f.c("<ERROR CLASS>"));
  private static final w d;
  private static final ah e;
  private static final Set<ah> f;
  
  static
  {
    a = a("<LOOP IN SUPERTYPES>", Collections.emptyList());
    d = a("<ERROR PROPERTY TYPE>", Collections.emptyList());
    Object localObject = c;
    g.a locala = b.i.b.a.c.b.a.g.a;
    localObject = z.a((l)localObject, g.a.a(), b.i.b.a.c.b.w.c, ay.e, b.i.b.a.c.f.f.c("<ERROR PROPERTY>"), b.a.a, am.b);
    ((z)localObject).a(d, Collections.emptyList(), null, null);
    e = (ah)localObject;
    f = Collections.singleton(localObject);
  }
  
  public static b.i.b.a.c.b.e a(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder("<ERROR CLASS: ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(">");
    return new a(b.i.b.a.c.f.f.c(localStringBuilder.toString()));
  }
  
  public static y a()
  {
    return b;
  }
  
  public static b.i.b.a.c.i.e.h a(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      return new c(paramString, (byte)0);
    }
    return new b(paramString, (byte)0);
  }
  
  public static ad a(String paramString, an paraman)
  {
    return new o(paraman, a(paramString, false), (byte)0);
  }
  
  public static ad a(String paramString, List<ap> paramList)
  {
    return new o(e(paramString), a(paramString, false), paramList, false);
  }
  
  public static boolean a(l paraml)
  {
    if (paraml == null) {
      return false;
    }
    return ((paraml instanceof a)) || ((paraml.a() instanceof a)) || (paraml == b);
  }
  
  public static boolean a(w paramw)
  {
    return (paramw != null) && ((paramw.f() instanceof d));
  }
  
  public static b.i.b.a.c.i.e.h b(String paramString)
  {
    return a(paramString, false);
  }
  
  private static an b(final String paramString, a parama)
  {
    new an()
    {
      public final List<ar> b()
      {
        return (List)v.a;
      }
      
      public final b.i.b.a.c.b.h c()
      {
        return this.a;
      }
      
      public final b.i.b.a.c.a.g d()
      {
        return b.i.b.a.c.a.e.a();
      }
      
      public final boolean e()
      {
        return false;
      }
      
      public final Collection<w> i_()
      {
        return (List)v.a;
      }
      
      public final String toString()
      {
        return paramString;
      }
    };
  }
  
  public static ad c(String paramString)
  {
    return a(paramString, Collections.emptyList());
  }
  
  public static ad d(String paramString)
  {
    return a(paramString, b(paramString, c));
  }
  
  public static an e(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder("[ERROR : ");
    localStringBuilder.append(paramString);
    localStringBuilder.append("]");
    return b(localStringBuilder.toString(), c);
  }
  
  static final class a
    extends b.i.b.a.c.b.c.h
  {
    public a(b.i.b.a.c.f.f paramf)
    {
      super(paramf, b.i.b.a.c.b.w.c, b.i.b.a.c.b.f.a, Collections.emptyList(), am.b, b.i.b.a.c.k.b.a);
      paramf = b.i.b.a.c.b.a.g.a;
      paramf = b.i.b.a.c.b.c.f.a(this, g.a.a(), am.b);
      paramf.a(Collections.emptyList(), ay.d);
      b.i.b.a.c.i.e.h localh = p.b(this.d.a);
      paramf.f = new o(p.a("<ERROR>", this), localh, (byte)0);
      a(localh, Collections.singleton(paramf), paramf);
    }
    
    public final b.i.b.a.c.b.e a(au paramau)
    {
      return this;
    }
    
    public final b.i.b.a.c.i.e.h a(as paramas)
    {
      StringBuilder localStringBuilder = new StringBuilder("Error scope for class ");
      localStringBuilder.append(this.d);
      localStringBuilder.append(" with arguments: ");
      localStringBuilder.append(paramas);
      return p.b(localStringBuilder.toString());
    }
    
    public final String toString()
    {
      return this.d.a;
    }
  }
  
  public static final class b
    implements b.i.b.a.c.i.e.h
  {
    private final String a;
    
    private b(String paramString)
    {
      this.a = paramString;
    }
    
    public final Collection<l> a(d paramd, b.f.a.b<? super b.i.b.a.c.f.f, Boolean> paramb)
    {
      return Collections.emptyList();
    }
    
    public final b.i.b.a.c.b.h c(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
    {
      return p.a(paramf.a);
    }
    
    public final Set<b.i.b.a.c.f.f> j_()
    {
      return Collections.emptySet();
    }
    
    public final Set<b.i.b.a.c.f.f> l_()
    {
      return Collections.emptySet();
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("ErrorScope{");
      localStringBuilder.append(this.a);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
  
  static final class c
    implements b.i.b.a.c.i.e.h
  {
    private final String a;
    
    private c(String paramString)
    {
      this.a = paramString;
    }
    
    public final Collection a(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
    {
      parama = new StringBuilder();
      parama.append(this.a);
      parama.append(", required name: ");
      parama.append(paramf);
      throw new IllegalStateException(parama.toString());
    }
    
    public final Collection<l> a(d paramd, b.f.a.b<? super b.i.b.a.c.f.f, Boolean> paramb)
    {
      throw new IllegalStateException(this.a);
    }
    
    public final Collection b(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
    {
      parama = new StringBuilder();
      parama.append(this.a);
      parama.append(", required name: ");
      parama.append(paramf);
      throw new IllegalStateException(parama.toString());
    }
    
    public final b.i.b.a.c.b.h c(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
    {
      parama = new StringBuilder();
      parama.append(this.a);
      parama.append(", required name: ");
      parama.append(paramf);
      throw new IllegalStateException(parama.toString());
    }
    
    public final Set<b.i.b.a.c.f.f> j_()
    {
      throw new IllegalStateException();
    }
    
    public final Set<b.i.b.a.c.f.f> l_()
    {
      throw new IllegalStateException();
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("ThrowingScope{");
      localStringBuilder.append(this.a);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
  
  public static final class d
    implements an
  {
    public final ar a;
    private final an b;
    
    public final List<ar> b()
    {
      return this.b.b();
    }
    
    public final b.i.b.a.c.b.h c()
    {
      return this.b.c();
    }
    
    public final b.i.b.a.c.a.g d()
    {
      return b.i.b.a.c.i.c.a.d(this.a);
    }
    
    public final boolean e()
    {
      return this.b.e();
    }
    
    public final Collection<w> i_()
    {
      return this.b.i_();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */