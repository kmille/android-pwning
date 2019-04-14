package b.i.b.a.c.h;

import b.f.b.t;
import b.f.b.v;
import b.i.b.a.c.a.g;
import b.i.b.a.c.b.au;
import b.i.b.a.c.f.f;
import b.i.b.a.c.l.ap;
import b.i.d;
import b.u;
import java.lang.reflect.Field;

public abstract class c
{
  public static final c a = a.a((b.f.a.b)d.a);
  public static final c b = a.a((b.f.a.b)b.a);
  public static final c c = a.a((b.f.a.b)c.a);
  public static final c d = a.a((b.f.a.b)e.a);
  public static final c e = a.a((b.f.a.b)i.a);
  public static final c f = a.a((b.f.a.b)g.a);
  public static final c g = a.a((b.f.a.b)j.a);
  public static final c h = a.a((b.f.a.b)f.a);
  public static final c i = a.a((b.f.a.b)h.a);
  public static final a j = new a((byte)0);
  
  public final c a(b.f.a.b<? super i, u> paramb)
  {
    b.f.b.j.b(paramb, "changeOptions");
    j localj1 = ((e)this).l;
    j localj2 = new j();
    Field[] arrayOfField = localj1.getClass().getDeclaredFields();
    int m = arrayOfField.length;
    int k = 0;
    while (k < m)
    {
      Field localField = arrayOfField[k];
      b.f.b.j.a(localField, "field");
      if ((localField.getModifiers() & 0x8) == 0)
      {
        localField.setAccessible(true);
        Object localObject2 = localField.get(localj1);
        Object localObject1 = localObject2;
        if (!(localObject2 instanceof b.g.b)) {
          localObject1 = null;
        }
        localObject1 = (b.g.b)localObject1;
        if (localObject1 != null)
        {
          localObject2 = localField.getName();
          b.f.b.j.a(localObject2, "field.name");
          boolean bool = b.k.l.a((String)localObject2, "is");
          if ((b.w.a) && (!(true ^ bool))) {
            throw ((Throwable)new AssertionError("Fields named is* are not supported here yet"));
          }
          localObject2 = (d)v.a(j.class);
          String str1 = localField.getName();
          StringBuilder localStringBuilder = new StringBuilder("get");
          String str2 = localField.getName();
          b.f.b.j.a(str2, "field.name");
          localStringBuilder.append(b.k.l.d(str2));
          localField.set(localj2, localj2.a(((b.g.b)localObject1).b((b.i.k)new t((d)localObject2, str1, localStringBuilder.toString()))));
        }
      }
      k += 1;
    }
    paramb.a(localj2);
    localj2.e();
    return (c)new e(localj2);
  }
  
  public abstract String a(b.i.b.a.c.b.a.c paramc, b.i.b.a.c.b.a.e parame);
  
  public abstract String a(b.i.b.a.c.b.l paraml);
  
  public abstract String a(b.i.b.a.c.f.c paramc);
  
  public abstract String a(f paramf, boolean paramBoolean);
  
  public abstract String a(ap paramap);
  
  public abstract String a(b.i.b.a.c.l.w paramw);
  
  public abstract String a(String paramString1, String paramString2, g paramg);
  
  public static final class a
  {
    public static c a(b.f.a.b<? super i, u> paramb)
    {
      b.f.b.j.b(paramb, "changeOptions");
      j localj = new j();
      paramb.a(localj);
      localj.e();
      return (c)new e(localj);
    }
  }
  
  static final class b
    extends b.f.b.k
    implements b.f.a.b<i, u>
  {
    public static final b a = new b();
    
    b()
    {
      super();
    }
  }
  
  static final class c
    extends b.f.b.k
    implements b.f.a.b<i, u>
  {
    public static final c a = new c();
    
    c()
    {
      super();
    }
  }
  
  static final class d
    extends b.f.b.k
    implements b.f.a.b<i, u>
  {
    public static final d a = new d();
    
    d()
    {
      super();
    }
  }
  
  static final class e
    extends b.f.b.k
    implements b.f.a.b<i, u>
  {
    public static final e a = new e();
    
    e()
    {
      super();
    }
  }
  
  static final class f
    extends b.f.b.k
    implements b.f.a.b<i, u>
  {
    public static final f a = new f();
    
    f()
    {
      super();
    }
  }
  
  static final class g
    extends b.f.b.k
    implements b.f.a.b<i, u>
  {
    public static final g a = new g();
    
    g()
    {
      super();
    }
  }
  
  static final class h
    extends b.f.b.k
    implements b.f.a.b<i, u>
  {
    public static final h a = new h();
    
    h()
    {
      super();
    }
  }
  
  static final class i
    extends b.f.b.k
    implements b.f.a.b<i, u>
  {
    public static final i a = new i();
    
    i()
    {
      super();
    }
  }
  
  static final class j
    extends b.f.b.k
    implements b.f.a.b<i, u>
  {
    public static final j a = new j();
    
    j()
    {
      super();
    }
  }
  
  public static abstract interface k
  {
    public abstract void a(au paramau, int paramInt1, int paramInt2, StringBuilder paramStringBuilder);
    
    public abstract void a(au paramau, StringBuilder paramStringBuilder);
    
    public abstract void a(StringBuilder paramStringBuilder);
    
    public abstract void b(StringBuilder paramStringBuilder);
    
    public static final class a
      implements c.k
    {
      public static final a a = new a();
      
      public final void a(au paramau, int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
      {
        b.f.b.j.b(paramau, "parameter");
        b.f.b.j.b(paramStringBuilder, "builder");
        if (paramInt1 != paramInt2 - 1) {
          paramStringBuilder.append(", ");
        }
      }
      
      public final void a(au paramau, StringBuilder paramStringBuilder)
      {
        b.f.b.j.b(paramau, "parameter");
        b.f.b.j.b(paramStringBuilder, "builder");
      }
      
      public final void a(StringBuilder paramStringBuilder)
      {
        b.f.b.j.b(paramStringBuilder, "builder");
        paramStringBuilder.append("(");
      }
      
      public final void b(StringBuilder paramStringBuilder)
      {
        b.f.b.j.b(paramStringBuilder, "builder");
        paramStringBuilder.append(")");
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/h/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */