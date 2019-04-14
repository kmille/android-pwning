package b.i.b.a.c.m;

import b.f.b.j;
import b.i.b.a.c.b.t;

public abstract class f
  implements b
{
  private final String a;
  
  private f(String paramString)
  {
    this.a = paramString;
  }
  
  public final String a()
  {
    return this.a;
  }
  
  public final String b(t paramt)
  {
    j.b(paramt, "functionDescriptor");
    return b.a.a(this, paramt);
  }
  
  public static final class a
    extends f
  {
    public static final a a = new a();
    
    private a()
    {
      super((byte)0);
    }
    
    public final boolean a(t paramt)
    {
      j.b(paramt, "functionDescriptor");
      return paramt.e() != null;
    }
  }
  
  public static final class b
    extends f
  {
    public static final b a = new b();
    
    private b()
    {
      super((byte)0);
    }
    
    public final boolean a(t paramt)
    {
      j.b(paramt, "functionDescriptor");
      return (paramt.e() != null) || (paramt.d() != null);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/m/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */