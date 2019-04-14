package b.i.b.a.c.l;

import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.a.g.a;
import b.i.b.a.c.i.e.h;
import java.util.List;

final class ae
  extends ad
{
  private final an a;
  private final List<ap> b;
  private final boolean c;
  private final h d;
  
  public ae(an paraman, List<? extends ap> paramList, boolean paramBoolean, h paramh)
  {
    this.a = paraman;
    this.b = paramList;
    this.c = paramBoolean;
    this.d = paramh;
    if (!(this.d instanceof p.b)) {
      return;
    }
    paraman = new StringBuilder("SimpleTypeImpl should not be created for error type: ");
    paraman.append(this.d);
    paraman.append('\n');
    paraman.append(this.a);
    throw ((Throwable)new IllegalStateException(paraman.toString()));
  }
  
  public final List<ap> a()
  {
    return this.b;
  }
  
  public final h b()
  {
    return this.d;
  }
  
  public final ad b(g paramg)
  {
    b.f.b.j.b(paramg, "newAnnotations");
    if (paramg.a()) {
      return (ad)this;
    }
    return (ad)new d((ad)this, paramg);
  }
  
  public final ad b(boolean paramBoolean)
  {
    Object localObject;
    if (paramBoolean == this.c)
    {
      localObject = this;
    }
    else
    {
      if (paramBoolean) {}
      for (localObject = new ab((ad)this);; localObject = new aa((ad)this))
      {
        localObject = (j)localObject;
        break;
      }
    }
    return (ad)localObject;
  }
  
  public final boolean c()
  {
    return this.c;
  }
  
  public final an f()
  {
    return this.a;
  }
  
  public final g r()
  {
    g.a locala = g.a;
    return g.a.a();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */