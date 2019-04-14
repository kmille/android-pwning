package b.i.b.a.c.l.a;

import b.f.b.j;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.at;
import b.i.b.a.c.l.au;
import b.i.b.a.c.l.az;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.t;
import b.i.b.a.c.n.i;
import b.i.b.a.c.n.i.b;
import java.util.ArrayDeque;
import java.util.Set;

public final class o
{
  int a;
  ArrayDeque<ad> b;
  Set<ad> c;
  final boolean d;
  private boolean e;
  private final boolean f;
  
  private o(boolean paramBoolean)
  {
    this.d = paramBoolean;
    this.f = true;
  }
  
  public static int a(ad paramad, e parame)
  {
    j.b(paramad, "subType");
    j.b(parame, "superType");
    return a.b;
  }
  
  public static Boolean a(az paramaz1, az paramaz2)
  {
    j.b(paramaz1, "subType");
    j.b(paramaz2, "superType");
    return null;
  }
  
  public static boolean a(an paraman1, an paraman2)
  {
    j.b(paraman1, "a");
    j.b(paraman2, "b");
    return j.a(paraman1, paraman2);
  }
  
  final void a()
  {
    boolean bool = this.e;
    if ((b.w.a) && (!(bool ^ true))) {
      throw ((Throwable)new AssertionError("Assertion failed"));
    }
    this.e = true;
    if (this.b == null) {
      this.b = new ArrayDeque(4);
    }
    if (this.c == null)
    {
      i.b localb = i.a;
      this.c = ((Set)i.b.a());
    }
  }
  
  public final boolean a(az paramaz)
  {
    j.b(paramaz, "receiver$0");
    return (this.f) && ((paramaz.f() instanceof k));
  }
  
  final void b()
  {
    Object localObject = this.b;
    if (localObject == null) {
      j.a();
    }
    ((ArrayDeque)localObject).clear();
    localObject = this.c;
    if (localObject == null) {
      j.a();
    }
    ((Set)localObject).clear();
    this.e = false;
  }
  
  public static enum a
  {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    
    public static int[] a()
    {
      return (int[])d.clone();
    }
  }
  
  public static enum b
  {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    
    public static int[] a()
    {
      return (int[])e.clone();
    }
  }
  
  public static abstract class c
  {
    public abstract ad a(b.i.b.a.c.l.w paramw);
    
    public static final class a
      extends o.c
    {
      public static final a a = new a();
      
      private a()
      {
        super();
      }
      
      public final ad a(b.i.b.a.c.l.w paramw)
      {
        j.b(paramw, "type");
        return t.c(paramw);
      }
    }
    
    public static final class b
      extends o.c
    {
      private final au a;
      
      public b(au paramau)
      {
        super();
        this.a = paramau;
      }
      
      public final ad a(b.i.b.a.c.l.w paramw)
      {
        j.b(paramw, "type");
        paramw = this.a.a((b.i.b.a.c.l.w)t.c(paramw), ba.a);
        j.a(paramw, "substitutor.safeSubstitu…le(), Variance.INVARIANT)");
        return at.a(paramw);
      }
    }
    
    public static final class c
      extends o.c
    {
      public static final c a = new c();
      
      private c()
      {
        super();
      }
    }
    
    public static final class d
      extends o.c
    {
      public static final d a = new d();
      
      private d()
      {
        super();
      }
      
      public final ad a(b.i.b.a.c.l.w paramw)
      {
        j.b(paramw, "type");
        return t.d(paramw);
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */