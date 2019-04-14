package b.i.b.a.c.i.b;

import b.u;

public abstract class j
  extends f<u>
{
  public static final a a = new a((byte)0);
  
  public j()
  {
    super(u.a);
  }
  
  public static final class a
  {
    public static j a(String paramString)
    {
      b.f.b.j.b(paramString, "message");
      return (j)new j.b(paramString);
    }
  }
  
  public static final class b
    extends j
  {
    private final String b;
    
    public b(String paramString)
    {
      this.b = paramString;
    }
    
    public final String toString()
    {
      return this.b;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */