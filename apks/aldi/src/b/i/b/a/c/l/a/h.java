package b.i.b.a.c.l.a;

import b.i.b.a.c.b.ar;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.ag;
import b.i.b.a.c.l.aj;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ao;
import b.i.b.a.c.l.ao.a;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.as;
import b.i.b.a.c.l.av;
import b.i.b.a.c.l.ax;
import b.i.b.a.c.l.az;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.q;
import b.i.b.a.c.l.t;
import b.i.b.a.c.l.y;
import b.k;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class h
  implements c
{
  public static final h b = new h();
  
  private static ad a(ad paramad)
  {
    b.f.b.j.b(paramad, "type");
    Object localObject2 = paramad.f();
    boolean bool = localObject2 instanceof b.i.b.a.c.i.a.a.b;
    int i = 0;
    Object localObject3;
    if (bool)
    {
      b.i.b.a.c.i.a.a.b localb = (b.i.b.a.c.i.a.a.b)localObject2;
      localObject2 = localb.b;
      if (((ap)localObject2).b() == ba.b) {
        i = 1;
      }
      localObject3 = null;
      if (i == 0) {
        localObject2 = null;
      }
      localObject1 = localObject3;
      if (localObject2 != null)
      {
        localObject2 = ((ap)localObject2).c();
        localObject1 = localObject3;
        if (localObject2 != null) {
          localObject1 = ((b.i.b.a.c.l.w)localObject2).i();
        }
      }
      if (localb.a == null)
      {
        localObject2 = localb.b;
        Object localObject4 = (Iterable)localb.i_();
        localObject3 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject4));
        localObject4 = ((Iterable)localObject4).iterator();
        while (((Iterator)localObject4).hasNext()) {
          ((Collection)localObject3).add(((b.i.b.a.c.l.w)((Iterator)localObject4).next()).i());
        }
        localb.a = new f((ap)localObject2, (List)localObject3);
      }
      localObject2 = a.a;
      localObject3 = localb.a;
      if (localObject3 == null) {
        b.f.b.j.a();
      }
      return (ad)new e((a)localObject2, (f)localObject3, (az)localObject1, paramad.r(), paramad.c());
    }
    if ((localObject2 instanceof b.i.b.a.c.i.b.n))
    {
      localObject2 = (Iterable)((b.i.b.a.c.i.b.n)localObject2).a;
      localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
      localObject2 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((Collection)localObject1).add(av.a((b.i.b.a.c.l.w)((Iterator)localObject2).next(), paramad.c()));
      }
      localObject1 = new b.i.b.a.c.l.v((Collection)localObject1);
      return b.i.b.a.c.l.x.a(paramad.r(), (an)localObject1, (List)b.a.v.a, false, paramad.b());
    }
    Object localObject1 = paramad;
    if ((localObject2 instanceof b.i.b.a.c.l.v))
    {
      localObject1 = paramad;
      if (paramad.c())
      {
        localObject1 = ((b.i.b.a.c.l.v)localObject2).a;
        b.f.b.j.a(localObject1, "constructor.supertypes");
        localObject2 = (Iterable)localObject1;
        localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
        localObject2 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (b.i.b.a.c.l.w)((Iterator)localObject2).next();
          b.f.b.j.a(localObject3, "it");
          ((Collection)localObject1).add(b.i.b.a.c.l.c.a.b((b.i.b.a.c.l.w)localObject3));
        }
        localObject1 = new b.i.b.a.c.l.v((Collection)localObject1);
        paramad = paramad.r();
        localObject2 = (an)localObject1;
        localObject3 = (List)b.a.v.a;
        localObject1 = ((b.i.b.a.c.l.v)localObject1).f();
        b.f.b.j.a(localObject1, "newConstructor.createScopeForKotlinType()");
        localObject1 = b.i.b.a.c.l.x.a(paramad, (an)localObject2, (List)localObject3, false, (b.i.b.a.c.i.e.h)localObject1);
      }
    }
    return (ad)localObject1;
  }
  
  public static az a(az paramaz)
  {
    b.f.b.j.b(paramaz, "type");
    Object localObject;
    if ((paramaz instanceof ad))
    {
      localObject = (az)a((ad)paramaz);
    }
    else
    {
      if (!(paramaz instanceof q)) {
        break label94;
      }
      localObject = (q)paramaz;
      ad localad1 = a(((q)localObject).a);
      ad localad2 = a(((q)localObject).b);
      if ((localad1 == ((q)localObject).a) && (localad2 == ((q)localObject).b)) {
        localObject = paramaz;
      } else {
        localObject = b.i.b.a.c.l.x.a(localad1, localad2);
      }
    }
    return ax.a((az)localObject, (b.i.b.a.c.l.w)paramaz);
    label94:
    throw new k();
  }
  
  private final Boolean a(o paramo, ad paramad1, ad paramad2)
  {
    boolean bool2 = y.b((b.i.b.a.c.l.w)paramad1);
    boolean bool1 = false;
    Object localObject;
    if ((!bool2) && (!y.b((b.i.b.a.c.l.w)paramad2))) {
      if ((!(paramad1 instanceof aj)) && (!(paramad2 instanceof aj))) {
        if ((paramad2 instanceof e))
        {
          localObject = (e)paramad2;
          if (((e)localObject).b != null)
          {
            int i = o.a(paramad1, (e)localObject);
            switch (i.a[(i - 1)])
            {
            default: 
              break;
            case 2: 
              if (b(paramo, (az)paramad1, ((e)localObject).b)) {
                return Boolean.TRUE;
              }
              break;
            }
          }
        }
      }
    }
    for (bool1 = b(paramo, (az)paramad1, ((e)localObject).b);; bool1 = m.a.a(paramad1.b(false), paramad2.b(false)))
    {
      return Boolean.valueOf(bool1);
      an localan = paramad2.f();
      localObject = localan;
      if (!(localan instanceof b.i.b.a.c.l.v)) {
        localObject = null;
      }
      localObject = (b.i.b.a.c.l.v)localObject;
      if (localObject != null)
      {
        bool2 = paramad2.c();
        if ((b.w.a) && (!(bool2 ^ true))) {
          throw ((Throwable)new AssertionError("Intersection type should not be marked nullable!: ".concat(String.valueOf(paramad2))));
        }
        paramad2 = ((b.i.b.a.c.l.v)localObject).a;
        b.f.b.j.a(paramad2, "it.supertypes");
        paramad2 = (Iterable)paramad2;
        if ((!(paramad2 instanceof Collection)) || (!((Collection)paramad2).isEmpty()))
        {
          paramad2 = paramad2.iterator();
          while (paramad2.hasNext())
          {
            localObject = (b.i.b.a.c.l.w)paramad2.next();
            if (!b.b(paramo, (az)paramad1, ((b.i.b.a.c.l.w)localObject).i())) {
              break label317;
            }
          }
        }
        bool1 = true;
        label317:
        return Boolean.valueOf(bool1);
      }
      return null;
      return Boolean.TRUE;
      if (paramo.d) {
        return Boolean.TRUE;
      }
      if ((paramad1.c()) && (!paramad2.c())) {
        return Boolean.FALSE;
      }
    }
  }
  
  private static List<ad> a(o paramo, ad paramad, an paraman)
  {
    paramo = c(paramo, paramad, paraman);
    if (paramo.size() >= 2)
    {
      paraman = (Iterable)paramo;
      paramad = (Collection)new ArrayList();
      paraman = paraman.iterator();
      for (;;)
      {
        boolean bool = paraman.hasNext();
        int j = 1;
        if (!bool) {
          break;
        }
        Object localObject1 = paraman.next();
        Object localObject2 = (Iterable)((ad)localObject1).a();
        int i;
        if ((localObject2 instanceof Collection))
        {
          i = j;
          if (((Collection)localObject2).isEmpty()) {}
        }
        else
        {
          localObject2 = ((Iterable)localObject2).iterator();
          b.i.b.a.c.l.w localw;
          do
          {
            i = j;
            if (!((Iterator)localObject2).hasNext()) {
              break;
            }
            localw = ((ap)((Iterator)localObject2).next()).c();
            b.f.b.j.a(localw, "it.type");
          } while ((t.a(localw) ^ true));
          i = 0;
        }
        if (i != 0) {
          paramad.add(localObject1);
        }
      }
      paramad = (List)paramad;
      if ((((Collection)paramad).isEmpty() ^ true)) {
        return paramad;
      }
    }
    return paramo;
  }
  
  private static boolean a(b.i.b.a.c.b.e parame)
  {
    return (b.i.b.a.c.b.x.a(parame)) && (parame.g() != b.i.b.a.c.b.f.d) && (parame.g() != b.i.b.a.c.b.f.e);
  }
  
  private static boolean a(o paramo, ad paramad)
  {
    if (b.i.b.a.c.a.g.o((b.i.b.a.c.l.w)paramad)) {
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
          if (j.a((ad)localObject2)) {}
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
              if (b.i.b.a.c.a.g.o((b.i.b.a.c.l.w)localObject3))
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
  
  private boolean a(o paramo, az paramaz1, az paramaz2)
  {
    b.f.b.j.b(paramo, "receiver$0");
    b.f.b.j.b(paramaz1, "a");
    b.f.b.j.b(paramaz2, "b");
    if (paramaz1 == paramaz2) {
      return true;
    }
    b.i.b.a.c.l.w localw1 = (b.i.b.a.c.l.w)paramaz1;
    if (b(localw1))
    {
      b.i.b.a.c.l.w localw2 = (b.i.b.a.c.l.w)paramaz2;
      if (b(localw2))
      {
        if (!o.a(paramaz1.f(), paramaz2.f())) {
          return false;
        }
        if (paramaz1.a().isEmpty())
        {
          if (!a(localw1))
          {
            if (a(localw2)) {
              return true;
            }
            return paramaz1.c() == paramaz2.c();
          }
          return true;
        }
      }
    }
    return (b(paramo, paramaz1, paramaz2)) && (b(paramo, paramaz2, paramaz1));
  }
  
  private static boolean a(o paramo, List<? extends ap> paramList, ad paramad)
  {
    if (paramList == paramad.a()) {
      return true;
    }
    List localList = paramad.f().b();
    b.f.b.j.a(localList, "superType.constructor.parameters");
    int k = ((Collection)localList).size();
    int i = 0;
    while (i < k)
    {
      Object localObject2 = (ap)paramad.a().get(i);
      if (!((ap)localObject2).a())
      {
        az localaz1 = ((ap)localObject2).c().i();
        Object localObject1 = (ap)paramList.get(i);
        int j;
        if (((ap)localObject1).b() == ba.a) {
          j = 1;
        } else {
          j = 0;
        }
        if ((b.w.a) && (j == 0)) {
          throw ((Throwable)new AssertionError("Incorrect sub argument: ".concat(String.valueOf(localObject1))));
        }
        az localaz2 = ((ap)localObject1).c().i();
        localObject1 = localList.get(i);
        b.f.b.j.a(localObject1, "parameters[index]");
        localObject1 = ((ar)localObject1).k();
        b.f.b.j.a(localObject1, "parameters[index].variance");
        localObject2 = ((ap)localObject2).b();
        b.f.b.j.a(localObject2, "superProjection.projectionKind");
        b.f.b.j.b(localObject1, "declared");
        b.f.b.j.b(localObject2, "useSite");
        if (localObject1 == ba.a) {
          localObject1 = localObject2;
        } else if ((localObject2 != ba.a) && (localObject1 != localObject2)) {
          localObject1 = null;
        }
        if (localObject1 == null) {
          return paramo.d;
        }
        if (paramo.a <= 100)
        {
          paramo.a += 1;
          boolean bool;
          switch (i.c[localObject1.ordinal()])
          {
          default: 
            throw new k();
          case 3: 
            bool = b.b(paramo, localaz1, localaz2);
            break;
          case 2: 
            bool = b.b(paramo, localaz2, localaz1);
            break;
          case 1: 
            bool = b.a(paramo, localaz2, localaz1);
          }
          paramo.a -= 1;
          if (!bool) {
            return false;
          }
        }
        else
        {
          throw ((Throwable)new IllegalStateException("Arguments depth is too high. Some related argument: ".concat(String.valueOf(localaz2)).toString()));
        }
      }
      i += 1;
    }
    return true;
  }
  
  private static boolean a(b.i.b.a.c.l.w paramw)
  {
    return t.c(paramw).c() != t.d(paramw).c();
  }
  
  private static List<ad> b(o paramo, ad paramad, an paraman)
  {
    b.f.b.j.b(paramo, "receiver$0");
    b.f.b.j.b(paramad, "baseType");
    b.f.b.j.b(paraman, "constructor");
    if (j.a(paramad)) {
      return a(paramo, paramad, paraman);
    }
    if (!(paraman.c() instanceof b.i.b.a.c.b.e)) {
      return c(paramo, paramad, paraman);
    }
    b.i.b.a.c.n.h localh = new b.i.b.a.c.n.h();
    paramo.a();
    ArrayDeque localArrayDeque = paramo.b;
    if (localArrayDeque == null) {
      b.f.b.j.a();
    }
    Object localObject2 = paramo.c;
    if (localObject2 == null) {
      b.f.b.j.a();
    }
    localArrayDeque.push(paramad);
    while ((((Collection)localArrayDeque).isEmpty() ^ true)) {
      if (((Set)localObject2).size() <= 1000)
      {
        Object localObject3 = (ad)localArrayDeque.pop();
        b.f.b.j.a(localObject3, "current");
        if (((Set)localObject2).add(localObject3))
        {
          if (j.a((ad)localObject3)) {
            localh.add(localObject3);
          }
          for (localObject1 = o.c.c.a;; localObject1 = o.c.a.a)
          {
            localObject1 = (o.c)localObject1;
            break;
          }
          if (!(b.f.b.j.a(localObject1, o.c.c.a) ^ true)) {
            localObject1 = null;
          }
          if (localObject1 != null)
          {
            localObject3 = ((ad)localObject3).f().i_().iterator();
            while (((Iterator)localObject3).hasNext())
            {
              b.i.b.a.c.l.w localw = (b.i.b.a.c.l.w)((Iterator)localObject3).next();
              b.f.b.j.a(localw, "supertype");
              localArrayDeque.add(((o.c)localObject1).a(localw));
            }
          }
        }
      }
      else
      {
        paramo = new StringBuilder("Too many supertypes for type: ");
        paramo.append(paramad);
        paramo.append(". Supertypes = ");
        paramo.append(b.a.j.a((Iterable)localObject2, null, null, null, 0, null, null, 63));
        throw ((Throwable)new IllegalStateException(paramo.toString().toString()));
      }
    }
    paramo.b();
    Object localObject1 = (Iterable)localh;
    paramad = (Collection)new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (ad)((Iterator)localObject1).next();
      b.f.b.j.a(localObject2, "it");
      b.a.j.a(paramad, (Iterable)a(paramo, (ad)localObject2, paraman));
    }
    return (List)paramad;
  }
  
  private static boolean b(o paramo, ad paramad1, ad paramad2)
  {
    if ((!j.b(paramad1)) && (!j.c(paramad1)) && (!paramo.a((az)paramad1))) {
      i = 0;
    } else {
      i = 1;
    }
    if ((b.w.a) && (i == 0)) {
      throw ((Throwable)new AssertionError("Not singleClassifierType and not intersection subType: ".concat(String.valueOf(paramad1))));
    }
    if ((!j.b(paramad2)) && (!paramo.a((az)paramad2))) {
      i = 0;
    } else {
      i = 1;
    }
    if ((b.w.a) && (i == 0)) {
      throw ((Throwable)new AssertionError("Not singleClassifierType superType: ".concat(String.valueOf(paramad2))));
    }
    Object localObject1 = l.a;
    if (!l.a(paramo, paramad1, paramad2)) {
      return false;
    }
    localObject1 = paramad2.f();
    if ((b.f.b.j.a(paramad1.f(), localObject1)) && (((an)localObject1).b().isEmpty())) {
      return true;
    }
    if (b.i.b.a.c.l.c.a.d((b.i.b.a.c.l.w)paramad2)) {
      return true;
    }
    List localList = b(paramo, paramad1, (an)localObject1);
    switch (localList.size())
    {
    default: 
      i = o.b.d;
      switch (i.b[(i - 1)])
      {
      }
      break;
    case 1: 
      return a(paramo, ((ad)b.a.j.c(localList)).a(), paramad2);
    case 0: 
      return a(paramo, paramad1);
      localObject2 = (Iterable)localList;
      if ((!(localObject2 instanceof Collection)) || (!((Collection)localObject2).isEmpty()))
      {
        localObject2 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject2).hasNext()) {
          if (a(paramo, ((ad)((Iterator)localObject2).next()).a(), paramad2))
          {
            i = 1;
            break label373;
          }
        }
      }
      i = 0;
      label373:
      if (i != 0)
      {
        return true;
        return a(paramo, ((ad)b.a.j.c(localList)).a(), paramad2);
        return false;
      }
      break;
    }
    int i = o.b.d;
    localObject1 = ((an)localObject1).b();
    b.f.b.j.a(localObject1, "superConstructor.parameters");
    localObject1 = (Iterable)localObject1;
    Object localObject2 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject1));
    Iterator localIterator1 = ((Iterable)localObject1).iterator();
    i = 0;
    while (localIterator1.hasNext())
    {
      localIterator1.next();
      if (i < 0) {
        b.a.j.a();
      }
      localObject1 = (Iterable)localList;
      Collection localCollection = (Collection)new ArrayList(b.a.j.a((Iterable)localObject1));
      Iterator localIterator2 = ((Iterable)localObject1).iterator();
      while (localIterator2.hasNext())
      {
        ad localad = (ad)localIterator2.next();
        localObject1 = (ap)b.a.j.b(localad.a(), i);
        if (localObject1 != null)
        {
          int j;
          if (((ap)localObject1).b() == ba.a) {
            j = 1;
          } else {
            j = 0;
          }
          if (j == 0) {
            localObject1 = null;
          }
          if (localObject1 != null)
          {
            localObject1 = ((ap)localObject1).c();
            if (localObject1 != null)
            {
              localObject1 = ((b.i.b.a.c.l.w)localObject1).i();
              if (localObject1 != null)
              {
                localCollection.add(localObject1);
                continue;
              }
            }
          }
        }
        paramo = new StringBuilder("Incorrect type: ");
        paramo.append(localad);
        paramo.append(", subType: ");
        paramo.append(paramad1);
        paramo.append(", superType: ");
        paramo.append(paramad2);
        throw ((Throwable)new IllegalStateException(paramo.toString().toString()));
      }
      ((Collection)localObject2).add(b.i.b.a.c.l.c.a.f((b.i.b.a.c.l.w)b.a((List)localCollection)));
      i += 1;
    }
    return a(paramo, (List)localObject2, paramad2);
  }
  
  private boolean b(o paramo, az paramaz1, az paramaz2)
  {
    b.f.b.j.b(paramo, "receiver$0");
    b.f.b.j.b(paramaz1, "subType");
    b.f.b.j.b(paramaz2, "superType");
    if (paramaz1 == paramaz2) {
      return true;
    }
    paramaz1 = a(paramaz1);
    paramaz2 = a(paramaz2);
    b.i.b.a.c.l.w localw1 = (b.i.b.a.c.l.w)paramaz1;
    Object localObject = t.c(localw1);
    b.i.b.a.c.l.w localw2 = (b.i.b.a.c.l.w)paramaz2;
    localObject = a(paramo, (ad)localObject, t.d(localw2));
    if (localObject != null)
    {
      boolean bool = ((Boolean)localObject).booleanValue();
      o.a(paramaz1, paramaz2);
      return bool;
    }
    o.a(paramaz1, paramaz2);
    return b(paramo, t.c(localw1), t.d(localw2));
  }
  
  private static boolean b(b.i.b.a.c.l.w paramw)
  {
    return (paramw.f().e()) && (!b.i.b.a.c.l.n.a(paramw)) && (!ag.b(paramw)) && (b.f.b.j.a(t.c(paramw).f(), t.d(paramw).f()));
  }
  
  private static List<ad> c(o paramo, ad paramad, an paraman)
  {
    Object localObject2 = paraman.c();
    Object localObject1 = localObject2;
    if (!(localObject2 instanceof b.i.b.a.c.b.e)) {
      localObject1 = null;
    }
    localObject1 = (b.i.b.a.c.b.e)localObject1;
    if ((localObject1 != null) && (a((b.i.b.a.c.b.e)localObject1) == true))
    {
      if (o.a(paramad.f(), paraman))
      {
        paraman = g.a(paramad, a.a);
        paramo = paraman;
        if (paraman == null) {
          paramo = paramad;
        }
        return b.a.j.a(paramo);
      }
      return (List)b.a.v.a;
    }
    List localList = (List)new b.i.b.a.c.n.h();
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
        localObject2 = (ad)localArrayDeque.pop();
        b.f.b.j.a(localObject2, "current");
        if (localSet.add(localObject2))
        {
          Object localObject3 = g.a((ad)localObject2, a.a);
          localObject1 = localObject3;
          if (localObject3 == null) {
            localObject1 = localObject2;
          }
          if (o.a(((ad)localObject1).f(), paraman)) {
            localList.add(localObject1);
          }
          for (localObject1 = o.c.c.a;; localObject1 = o.c.a.a)
          {
            localObject1 = (o.c)localObject1;
            break label283;
            if (!((ad)localObject1).a().isEmpty()) {
              break;
            }
          }
          localObject3 = ao.b;
          localObject1 = (o.c)new o.c.b(ao.a.a((b.i.b.a.c.l.w)localObject1).d());
          label283:
          if (!(b.f.b.j.a(localObject1, o.c.c.a) ^ true)) {
            localObject1 = null;
          }
          if (localObject1 != null)
          {
            localObject2 = ((ad)localObject2).f().i_().iterator();
            while (((Iterator)localObject2).hasNext())
            {
              localObject3 = (b.i.b.a.c.l.w)((Iterator)localObject2).next();
              b.f.b.j.a(localObject3, "supertype");
              localArrayDeque.add(((o.c)localObject1).a((b.i.b.a.c.l.w)localObject3));
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
    return localList;
  }
  
  public final boolean a(b.i.b.a.c.l.w paramw1, b.i.b.a.c.l.w paramw2)
  {
    b.f.b.j.b(paramw1, "subtype");
    b.f.b.j.b(paramw2, "supertype");
    return b(new o(true, (byte)0), paramw1.i(), paramw2.i());
  }
  
  public final boolean b(b.i.b.a.c.l.w paramw1, b.i.b.a.c.l.w paramw2)
  {
    b.f.b.j.b(paramw1, "a");
    b.f.b.j.b(paramw2, "b");
    return a(new o(false, (byte)0), paramw1.i(), paramw2.i());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */