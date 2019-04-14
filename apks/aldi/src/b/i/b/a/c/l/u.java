package b.i.b.a.c.l;

import b.f.b.j;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.h;
import java.util.List;

public final class u
  extends as
{
  public final ar[] a;
  public final ap[] b;
  private final boolean c;
  
  public u(List<? extends ar> paramList, List<? extends ap> paramList1) {}
  
  public u(ar[] paramArrayOfar, ap[] paramArrayOfap, boolean paramBoolean)
  {
    this.a = paramArrayOfar;
    this.b = paramArrayOfap;
    this.c = paramBoolean;
    int i;
    if (this.a.length <= this.b.length) {
      i = 1;
    } else {
      i = 0;
    }
    if (b.w.a)
    {
      if (i != 0) {
        return;
      }
      paramArrayOfar = new StringBuilder("Number of arguments should not be less then number of parameters, but: parameters=");
      paramArrayOfar.append(this.a.length);
      paramArrayOfar.append(", args=");
      paramArrayOfar.append(this.b.length);
      throw ((Throwable)new AssertionError(paramArrayOfar.toString()));
    }
  }
  
  public final ap a(w paramw)
  {
    j.b(paramw, "key");
    h localh = paramw.f().c();
    paramw = localh;
    if (!(localh instanceof ar)) {
      paramw = null;
    }
    paramw = (ar)paramw;
    if (paramw == null) {
      return null;
    }
    int i = paramw.g();
    if ((i < this.a.length) && (j.a(this.a[i].c(), paramw.c()))) {
      return this.b[i];
    }
    return null;
  }
  
  public final boolean a()
  {
    return this.b.length == 0;
  }
  
  public final boolean b()
  {
    return this.c;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */