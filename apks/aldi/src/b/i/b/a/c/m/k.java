package b.i.b.a.c.m;

import b.f.b.j;
import b.i.b.a.c.a.g;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.t;
import b.i.b.a.c.i.c.a;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.w;

public abstract class k
  implements b
{
  private final String a;
  private final String b;
  private final b.f.a.b<g, w> c;
  
  private k(String paramString, b.f.a.b<? super g, ? extends w> paramb)
  {
    this.b = paramString;
    this.c = paramb;
    paramString = new StringBuilder("must return ");
    paramString.append(this.b);
    this.a = paramString.toString();
  }
  
  public final String a()
  {
    return this.a;
  }
  
  public final boolean a(t paramt)
  {
    j.b(paramt, "functionDescriptor");
    return j.a(paramt.g(), (w)this.c.a(a.d((l)paramt)));
  }
  
  public final String b(t paramt)
  {
    j.b(paramt, "functionDescriptor");
    return b.a.a(this, paramt);
  }
  
  public static final class a
    extends k
  {
    public static final a a = new a();
    
    private a()
    {
      super((b.f.a.b)1.a, (byte)0);
    }
  }
  
  public static final class b
    extends k
  {
    public static final b a = new b();
    
    private b()
    {
      super((b.f.a.b)1.a, (byte)0);
    }
  }
  
  public static final class c
    extends k
  {
    public static final c a = new c();
    
    private c()
    {
      super((b.f.a.b)1.a, (byte)0);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/m/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */