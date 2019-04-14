package b.f.b;

import b.f.b;
import b.i.a;
import b.i.d;
import java.io.Serializable;

public abstract class c
  implements a, Serializable
{
  public static final Object b = ;
  protected final Object a;
  private transient a c;
  
  public c()
  {
    this(b);
  }
  
  protected c(Object paramObject)
  {
    this.a = paramObject;
  }
  
  public final Object a(Object... paramVarArgs)
  {
    return e().a(paramVarArgs);
  }
  
  protected abstract a b();
  
  public final Object c()
  {
    return this.a;
  }
  
  public final a d()
  {
    a locala2 = this.c;
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = b();
      this.c = locala1;
    }
    return locala1;
  }
  
  protected a e()
  {
    a locala = d();
    if (locala != this) {
      return locala;
    }
    throw new b();
  }
  
  public d f()
  {
    throw new AbstractMethodError();
  }
  
  public String g()
  {
    throw new AbstractMethodError();
  }
  
  public String h()
  {
    throw new AbstractMethodError();
  }
  
  static final class a
    implements Serializable
  {
    private static final a a = new a();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/f/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */