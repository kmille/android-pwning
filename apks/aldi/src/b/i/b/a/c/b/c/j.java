package b.i.b.a.c.b.c;

import b.i.b.a.c.b.a.b;
import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.l;
import b.i.b.a.c.f.f;
import b.i.b.a.c.h.c;

public abstract class j
  extends b
  implements l
{
  protected final f d;
  
  public j(g paramg, f paramf)
  {
    super(paramg);
    this.d = paramf;
  }
  
  public static String a(l paraml)
  {
    try
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(c.h.a(paraml));
      ((StringBuilder)localObject).append("[");
      ((StringBuilder)localObject).append(paraml.getClass().getSimpleName());
      ((StringBuilder)localObject).append("@");
      ((StringBuilder)localObject).append(Integer.toHexString(System.identityHashCode(paraml)));
      ((StringBuilder)localObject).append("]");
      localObject = ((StringBuilder)localObject).toString();
      return (String)localObject;
    }
    catch (Throwable localThrowable)
    {
      Object localObject;
      for (;;) {}
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paraml.getClass().getSimpleName());
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append(paraml.i());
    return ((StringBuilder)localObject).toString();
  }
  
  public l g_()
  {
    return this;
  }
  
  public final f i()
  {
    return this.d;
  }
  
  public String toString()
  {
    return a(this);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */