package b.i.b.a.c.l;

import b.i.b.a.c.a.g;
import b.i.b.a.c.b.ab;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.y;
import b.i.b.a.c.f.f;
import b.i.b.a.c.i.c.a;
import b.i.b.a.c.i.d;
import b.i.b.a.c.k.i;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class b
  extends c
  implements an
{
  private int a = 0;
  
  public b(i parami)
  {
    super(parami);
  }
  
  private static boolean a(b.i.b.a.c.b.h paramh)
  {
    return (!p.a(paramh)) && (!d.b(paramh));
  }
  
  protected final Collection<w> a(boolean paramBoolean)
  {
    Object localObject = h_().a();
    if (!(localObject instanceof e)) {
      return Collections.emptyList();
    }
    b.i.b.a.c.n.h localh = new b.i.b.a.c.n.h();
    localObject = (e)localObject;
    localh.add(((e)localObject).h());
    localObject = ((e)localObject).e();
    if ((paramBoolean) && (localObject != null)) {
      localh.add(((e)localObject).h());
    }
    return localh;
  }
  
  public final g d()
  {
    return a.d(h_());
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof an)) {
      return false;
    }
    if (paramObject.hashCode() != hashCode()) {
      return false;
    }
    Object localObject = (an)paramObject;
    if (((an)localObject).b().size() != b().size()) {
      return false;
    }
    paramObject = h_();
    localObject = ((an)localObject).c();
    if (a((b.i.b.a.c.b.h)paramObject))
    {
      if ((localObject != null) && (!a((b.i.b.a.c.b.h)localObject))) {
        return false;
      }
      if ((localObject instanceof e))
      {
        paramObject = (e)paramObject;
        e locale = (e)localObject;
        if (!((e)paramObject).i().equals(locale.i())) {
          return false;
        }
        localObject = ((e)paramObject).a();
        for (paramObject = locale.a(); (localObject != null) && (paramObject != null); paramObject = ((l)paramObject).a())
        {
          if ((localObject instanceof y)) {
            return paramObject instanceof y;
          }
          if ((paramObject instanceof y)) {
            return false;
          }
          if ((localObject instanceof ab))
          {
            if (((paramObject instanceof ab)) && (((ab)localObject).c().equals(((ab)paramObject).c()))) {
              break;
            }
            return false;
          }
          if ((paramObject instanceof ab)) {
            return false;
          }
          if (!((l)localObject).i().equals(((l)paramObject).i())) {
            return false;
          }
          localObject = ((l)localObject).a();
        }
        return true;
      }
    }
    return false;
  }
  
  protected final w g()
  {
    if (g.c(h_())) {
      return null;
    }
    return a.d(h_()).g();
  }
  
  public abstract e h_();
  
  public final int hashCode()
  {
    int i = this.a;
    if (i != 0) {
      return i;
    }
    e locale = h_();
    if (a(locale)) {
      i = d.c(locale).hashCode();
    } else {
      i = System.identityHashCode(this);
    }
    this.a = i;
    return i;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */