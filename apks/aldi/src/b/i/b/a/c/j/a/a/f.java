package b.i.b.a.c.j.a.a;

import b.i.b.a.c.b.v;
import b.i.b.a.c.e.a.c;
import b.i.b.a.c.e.a.h;
import b.i.b.a.c.g.q;

public abstract interface f
  extends v
{
  public abstract q G();
  
  public abstract c H();
  
  public abstract h I();
  
  public abstract e J();
  
  public static enum a
  {
    static
    {
      a locala1 = new a("COMPATIBLE", 0);
      a = locala1;
      a locala2 = new a("NEEDS_WRAPPER", 1);
      b = locala2;
      a locala3 = new a("INCOMPATIBLE", 2);
      c = locala3;
      d = new a[] { locala1, locala2, locala3 };
    }
    
    private a() {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/j/a/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */