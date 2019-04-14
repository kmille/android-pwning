package b.i.b.a.c.l;

import b.i.b.a.c.b.a.g;
import b.i.b.a.c.i.e.h;
import b.r;
import java.util.List;

public abstract class bb
  extends w
{
  public bb()
  {
    super((byte)0);
  }
  
  public final List<ap> a()
  {
    return d().a();
  }
  
  public final h b()
  {
    return d().b();
  }
  
  public final boolean c()
  {
    return d().c();
  }
  
  protected abstract w d();
  
  public boolean e()
  {
    return true;
  }
  
  public final an f()
  {
    return d().f();
  }
  
  public final az i()
  {
    for (w localw = d(); (localw instanceof bb); localw = ((bb)localw).d()) {}
    if (localw != null) {
      return (az)localw;
    }
    throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
  }
  
  public final g r()
  {
    return d().r();
  }
  
  public String toString()
  {
    if (e()) {
      return d().toString();
    }
    return "<Not computed yet>";
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */