package b.i.b.a.c.h;

import b.f.b.j;
import b.k.l;

public enum p
{
  static
  {
    b localb = new b("PLAIN");
    a = localb;
    a locala = new a("HTML");
    b = locala;
    c = new p[] { localb, locala };
  }
  
  protected p() {}
  
  public abstract String a(String paramString);
  
  public static final class a
    extends p
  {
    a()
    {
      super(1);
    }
    
    public final String a(String paramString)
    {
      j.b(paramString, "string");
      return l.a(l.a(paramString, "<", "&lt;"), ">", "&gt;");
    }
  }
  
  public static final class b
    extends p
  {
    b()
    {
      super(0);
    }
    
    public final String a(String paramString)
    {
      j.b(paramString, "string");
      return paramString;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/h/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */