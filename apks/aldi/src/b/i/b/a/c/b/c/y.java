package b.i.b.a.c.b.c;

import b.i.b.a.c.b.a.a;
import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.ag;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.ak;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.b;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.t;
import b.i.b.a.c.b.t.a;
import b.i.b.a.c.b.w;
import b.i.b.a.c.f.f;
import b.i.b.a.c.l.au;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class y
  extends k
  implements ag
{
  public boolean a;
  public final boolean b;
  public final w c;
  public final ah e;
  public final boolean f;
  public az g;
  public t h = null;
  private final b.a j;
  
  public y(w paramw, az paramaz, ah paramah, g paramg, f paramf, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, b.a parama, am paramam)
  {
    super(paramah.a(), paramg, paramf, paramam);
    this.c = paramw;
    this.g = paramaz;
    this.e = paramah;
    this.a = paramBoolean1;
    this.b = paramBoolean2;
    this.f = paramBoolean3;
    this.j = parama;
  }
  
  public final boolean A()
  {
    return false;
  }
  
  public final boolean B()
  {
    return false;
  }
  
  public final boolean C()
  {
    return false;
  }
  
  public final t.a<? extends t> D()
  {
    throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
  }
  
  public abstract ag E();
  
  public final <V> V a(a.a<V> parama)
  {
    return null;
  }
  
  protected final Collection<ag> a(boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList(0);
    Iterator localIterator = this.e.m().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (ah)localIterator.next();
      if (paramBoolean) {
        localObject = ((ah)localObject).b();
      } else {
        localObject = ((ah)localObject).c();
      }
      if (localObject != null) {
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
  
  public final void a(Collection<? extends b> paramCollection)
  {
    if (!i)
    {
      if (paramCollection.isEmpty()) {
        return;
      }
      throw new AssertionError("Overridden accessors should be empty");
    }
  }
  
  public final boolean b()
  {
    return this.f;
  }
  
  public final t c(au paramau)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean c()
  {
    return false;
  }
  
  public final ak d()
  {
    return this.e.d();
  }
  
  public final w d_()
  {
    return this.c;
  }
  
  public final ak e()
  {
    return this.e.e();
  }
  
  public final List<ar> f()
  {
    return Collections.emptyList();
  }
  
  public final az j()
  {
    return this.g;
  }
  
  public final boolean l()
  {
    return false;
  }
  
  public final boolean o()
  {
    return false;
  }
  
  public final boolean p()
  {
    return false;
  }
  
  public final boolean q()
  {
    return this.b;
  }
  
  public final b.a t()
  {
    return this.j;
  }
  
  public final boolean u()
  {
    return this.a;
  }
  
  public final ah v()
  {
    return this.e;
  }
  
  public final t x()
  {
    return this.h;
  }
  
  public final boolean y()
  {
    return false;
  }
  
  public final boolean z()
  {
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */