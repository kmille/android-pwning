package b.i.b.a.c.b.c;

import b.i.b.a.c.b.a.g.a;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.d;
import b.i.b.a.c.b.l;
import b.i.b.a.c.i.e.h;
import b.i.b.a.c.i.e.h.b;
import b.i.b.a.c.k.i;
import b.i.b.a.c.l.an;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class w
  extends g
{
  public az a;
  private final b.i.b.a.c.b.f c;
  private final boolean g;
  private b.i.b.a.c.b.w h;
  private an i;
  private List<ar> j;
  private final Collection<b.i.b.a.c.l.w> k = new ArrayList();
  private final i l;
  
  public w(l paraml, b.i.b.a.c.b.f paramf, b.i.b.a.c.f.f paramf1, am paramam, i parami)
  {
    super(parami, paraml, paramf1, paramam);
    this.l = parami;
    if ((!b) && (paramf == b.i.b.a.c.b.f.f)) {
      throw new AssertionError("Fix isCompanionObject()");
    }
    this.c = paramf;
    this.g = false;
  }
  
  public final void a(b.i.b.a.c.b.w paramw)
  {
    if ((!b) && (paramw == b.i.b.a.c.b.w.b))
    {
      paramw = new StringBuilder("Implement getSealedSubclasses() for this class: ");
      paramw.append(getClass());
      throw new AssertionError(paramw.toString());
    }
    this.h = paramw;
  }
  
  public final void a(List<ar> paramList)
  {
    if (this.j == null)
    {
      this.j = new ArrayList(paramList);
      return;
    }
    paramList = new StringBuilder("Type parameters are already set for ");
    paramList.append(this.d);
    throw new IllegalStateException(paramList.toString());
  }
  
  public final h b()
  {
    return h.b.a;
  }
  
  public final an c()
  {
    return this.i;
  }
  
  public final h d()
  {
    return h.b.a;
  }
  
  public final b.i.b.a.c.b.w d_()
  {
    return this.h;
  }
  
  public final b.i.b.a.c.b.e e()
  {
    return null;
  }
  
  public final d e_()
  {
    return null;
  }
  
  public final b.i.b.a.c.b.f g()
  {
    return this.c;
  }
  
  public final az j()
  {
    return this.a;
  }
  
  public final boolean k()
  {
    return false;
  }
  
  public final boolean l()
  {
    return this.g;
  }
  
  public final boolean m()
  {
    return false;
  }
  
  public final boolean n()
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
  
  public final b.i.b.a.c.b.a.g r()
  {
    g.a locala = b.i.b.a.c.b.a.g.a;
    return g.a.a();
  }
  
  public final Collection<b.i.b.a.c.b.e> t()
  {
    return Collections.emptyList();
  }
  
  public String toString()
  {
    return j.a(this);
  }
  
  public final List<ar> u()
  {
    return this.j;
  }
  
  public final void y()
  {
    if ((!b) && (this.i != null)) {
      throw new AssertionError(this.i);
    }
    this.i = new b.i.b.a.c.l.e(this, this.j, this.k, this.l);
    Iterator localIterator = Collections.emptySet().iterator();
    while (localIterator.hasNext()) {
      ((f)localIterator.next()).f = h();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */