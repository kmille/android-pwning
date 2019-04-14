package b.i.b.a.c.l.a;

import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.ag;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.az;
import b.i.b.a.c.l.t;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class l
{
  public static final l a = new l();
  
  private static boolean a(o paramo, ad paramad, o.c paramc)
  {
    int i;
    if (((j.a(paramad)) && (!paramad.c())) || (ag.b((b.i.b.a.c.l.w)paramad))) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return true;
    }
    paramo.a();
    ArrayDeque localArrayDeque = paramo.b;
    if (localArrayDeque == null) {
      b.f.b.j.a();
    }
    Set localSet = paramo.c;
    if (localSet == null) {
      b.f.b.j.a();
    }
    localArrayDeque.push(paramad);
    while ((((Collection)localArrayDeque).isEmpty() ^ true)) {
      if (localSet.size() <= 1000)
      {
        Object localObject1 = (ad)localArrayDeque.pop();
        b.f.b.j.a(localObject1, "current");
        if (localSet.add(localObject1))
        {
          o.c localc;
          if (((ad)localObject1).c()) {
            localc = (o.c)o.c.c.a;
          } else {
            localc = paramc;
          }
          if (!(b.f.b.j.a(localc, o.c.c.a) ^ true)) {
            localc = null;
          }
          if (localc != null)
          {
            localObject1 = ((ad)localObject1).f().i_().iterator();
            while (((Iterator)localObject1).hasNext())
            {
              Object localObject2 = (b.i.b.a.c.l.w)((Iterator)localObject1).next();
              b.f.b.j.a(localObject2, "supertype");
              localObject2 = localc.a((b.i.b.a.c.l.w)localObject2);
              if (((j.a((ad)localObject2)) && (!((ad)localObject2).c())) || (ag.b((b.i.b.a.c.l.w)localObject2))) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0)
              {
                paramo.b();
                return true;
              }
              localArrayDeque.add(localObject2);
            }
          }
        }
      }
      else
      {
        paramo = new StringBuilder("Too many supertypes for type: ");
        paramo.append(paramad);
        paramo.append(". Supertypes = ");
        paramo.append(b.a.j.a((Iterable)localSet, null, null, null, 0, null, null, 63));
        throw ((Throwable)new IllegalStateException(paramo.toString().toString()));
      }
    }
    paramo.b();
    return false;
  }
  
  public static boolean a(o paramo, ad paramad1, ad paramad2)
  {
    b.f.b.j.b(paramo, "context");
    b.f.b.j.b(paramad1, "subType");
    b.f.b.j.b(paramad2, "superType");
    int i;
    if ((!j.c(paramad1)) && (!j.b(paramad1)) && (!paramo.a((az)paramad1))) {
      i = 0;
    } else {
      i = 1;
    }
    if ((b.w.a) && (i == 0)) {
      throw ((Throwable)new AssertionError("Not singleClassifierType superType: ".concat(String.valueOf(paramad2))));
    }
    if ((!j.b(paramad2)) && (!paramo.a((az)paramad2))) {
      i = 0;
    } else {
      i = 1;
    }
    if ((b.w.a) && (i == 0)) {
      throw ((Throwable)new AssertionError("Not singleClassifierType superType: ".concat(String.valueOf(paramad2))));
    }
    if (paramad2.c()) {
      return true;
    }
    if (ag.b((b.i.b.a.c.l.w)paramad1)) {
      return true;
    }
    if (a(paramo, paramad1, (o.c)o.c.a.a)) {
      return true;
    }
    if (ag.b((b.i.b.a.c.l.w)paramad2)) {
      return false;
    }
    if (a(paramo, paramad2, (o.c)o.c.d.a)) {
      return false;
    }
    if (j.a(paramad1)) {
      return false;
    }
    return a(paramo, paramad1, paramad2.f());
  }
  
  private static boolean a(o paramo, ad paramad, an paraman)
  {
    int i;
    if ((!paramad.c()) && (b.f.b.j.a(paramad.f(), paraman))) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return true;
    }
    paramo.a();
    ArrayDeque localArrayDeque = paramo.b;
    if (localArrayDeque == null) {
      b.f.b.j.a();
    }
    Set localSet = paramo.c;
    if (localSet == null) {
      b.f.b.j.a();
    }
    localArrayDeque.push(paramad);
    while ((((Collection)localArrayDeque).isEmpty() ^ true)) {
      if (localSet.size() <= 1000)
      {
        Object localObject2 = (ad)localArrayDeque.pop();
        b.f.b.j.a(localObject2, "current");
        if (localSet.add(localObject2))
        {
          if (((ad)localObject2).c()) {}
          for (Object localObject1 = o.c.c.a;; localObject1 = o.c.a.a)
          {
            localObject1 = (o.c)localObject1;
            break;
          }
          if (!(b.f.b.j.a(localObject1, o.c.c.a) ^ true)) {
            localObject1 = null;
          }
          if (localObject1 != null)
          {
            localObject2 = ((ad)localObject2).f().i_().iterator();
            while (((Iterator)localObject2).hasNext())
            {
              Object localObject3 = (b.i.b.a.c.l.w)((Iterator)localObject2).next();
              b.f.b.j.a(localObject3, "supertype");
              localObject3 = ((o.c)localObject1).a((b.i.b.a.c.l.w)localObject3);
              if ((!((ad)localObject3).c()) && (b.f.b.j.a(((ad)localObject3).f(), paraman))) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0)
              {
                paramo.b();
                return true;
              }
              localArrayDeque.add(localObject3);
            }
          }
        }
      }
      else
      {
        paramo = new StringBuilder("Too many supertypes for type: ");
        paramo.append(paramad);
        paramo.append(". Supertypes = ");
        paramo.append(b.a.j.a((Iterable)localSet, null, null, null, 0, null, null, 63));
        throw ((Throwable)new IllegalStateException(paramo.toString().toString()));
      }
    }
    paramo.b();
    return false;
  }
  
  public static boolean a(az paramaz)
  {
    b.f.b.j.b(paramaz, "type");
    return a(new o(false, (byte)0), t.c((b.i.b.a.c.l.w)paramaz), (o.c)o.c.a.a);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */