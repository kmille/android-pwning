package b.i.b.a.c.b.b;

import b.f.b.j;
import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.e;

public abstract interface c
{
  public abstract boolean a(e parame, al paramal);
  
  public static final class a
    implements c
  {
    public static final a a = new a();
    
    public final boolean a(e parame, al paramal)
    {
      j.b(parame, "classDescriptor");
      j.b(paramal, "functionDescriptor");
      return true;
    }
  }
  
  public static final class b
    implements c
  {
    public static final b a = new b();
    
    public final boolean a(e parame, al paramal)
    {
      j.b(parame, "classDescriptor");
      j.b(paramal, "functionDescriptor");
      return !paramal.r().b(d.a());
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */