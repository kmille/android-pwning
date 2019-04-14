package b.i.b.a.c.m;

import b.f.b.j;
import b.i.b.a.c.b.t;
import java.util.List;

public abstract class l
  implements b
{
  private final String a;
  
  private l(String paramString)
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
    extends l
  {
    private final int a;
    
    public a(int paramInt)
    {
      super((byte)0);
      this.a = paramInt;
    }
    
    public final boolean a(t paramt)
    {
      j.b(paramt, "functionDescriptor");
      return paramt.k().size() >= this.a;
    }
  }
  
  public static final class b
    extends l
  {
    private final int a = 2;
    
    public b()
    {
      super((byte)0);
    }
    
    public final boolean a(t paramt)
    {
      j.b(paramt, "functionDescriptor");
      return paramt.k().size() == this.a;
    }
  }
  
  public static final class c
    extends l
  {
    public static final c a = new c();
    
    private c()
    {
      super((byte)0);
    }
    
    public final boolean a(t paramt)
    {
      j.b(paramt, "functionDescriptor");
      return paramt.k().isEmpty();
    }
  }
  
  public static final class d
    extends l
  {
    public static final d a = new d();
    
    private d()
    {
      super((byte)0);
    }
    
    public final boolean a(t paramt)
    {
      j.b(paramt, "functionDescriptor");
      return paramt.k().size() == 1;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/m/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */