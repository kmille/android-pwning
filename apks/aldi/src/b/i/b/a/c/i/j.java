package b.i.b.a.c.i;

import b.i.b.a.c.b.a;
import b.i.b.a.c.b.ag;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.aj;
import b.i.b.a.c.b.ak;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.ay;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.c.z;
import b.i.b.a.c.b.v;
import b.i.b.a.c.f.f;
import b.i.b.a.c.l.a.c;
import b.i.b.a.c.l.a.c.a;
import b.i.b.a.c.l.an;
import b.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;

public class j
{
  public static final j a = new j(new c.a()
  {
    public final boolean a(an paramAnonymousan1, an paramAnonymousan2)
    {
      return paramAnonymousan1.equals(paramAnonymousan2);
    }
  });
  private static final List<e> c = b.a.j.i(ServiceLoader.load(e.class, e.class.getClassLoader()));
  private final c.a d;
  
  private j(c.a parama)
  {
    this.d = parama;
  }
  
  private static b.i.b.a.c.b.w a(Collection<b.i.b.a.c.b.b> paramCollection, b.i.b.a.c.b.e parame)
  {
    Object localObject = paramCollection.iterator();
    boolean bool = true;
    int j = 0;
    int i = 0;
    while (((Iterator)localObject).hasNext())
    {
      b.i.b.a.c.b.b localb = (b.i.b.a.c.b.b)((Iterator)localObject).next();
      switch (9.c[localb.d_().ordinal()])
      {
      default: 
        break;
      case 4: 
        i = 1;
        break;
      case 3: 
        j = 1;
        break;
      case 2: 
        throw new IllegalStateException("Member cannot have SEALED modality: ".concat(String.valueOf(localb)));
      case 1: 
        return b.i.b.a.c.b.w.a;
      }
    }
    if ((!parame.o()) || (parame.d_() == b.i.b.a.c.b.w.d) || (parame.d_() == b.i.b.a.c.b.w.b)) {
      bool = false;
    }
    if ((j != 0) && (i == 0)) {
      return b.i.b.a.c.b.w.c;
    }
    if ((j == 0) && (i != 0))
    {
      if (bool) {
        return parame.d_();
      }
      return b.i.b.a.c.b.w.d;
    }
    localObject = new HashSet();
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      ((Set)localObject).addAll(a((b.i.b.a.c.b.b)paramCollection.next()));
    }
    return a(a((Set)localObject), bool, parame.d_());
  }
  
  private static b.i.b.a.c.b.w a(Collection<b.i.b.a.c.b.b> paramCollection, boolean paramBoolean, b.i.b.a.c.b.w paramw)
  {
    Object localObject = b.i.b.a.c.b.w.d;
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      paramCollection = (b.i.b.a.c.b.b)localIterator.next();
      if ((paramBoolean) && (paramCollection.d_() == b.i.b.a.c.b.w.d)) {
        paramCollection = paramw;
      } else {
        paramCollection = paramCollection.d_();
      }
      if (paramCollection.compareTo((Enum)localObject) < 0) {
        localObject = paramCollection;
      }
    }
    return (b.i.b.a.c.b.w)localObject;
  }
  
  private a a(a parama1, a parama2, b.i.b.a.c.b.e parame)
  {
    return a(parama1, parama2, parame, false);
  }
  
  public static j a(c.a parama)
  {
    return new j(parama);
  }
  
  private c a(List<ar> paramList1, List<ar> paramList2)
  {
    final Object localObject;
    if ((!b) && (paramList1.size() != paramList2.size()))
    {
      localObject = new StringBuilder("Should be the same number of type parameters: ");
      ((StringBuilder)localObject).append(paramList1);
      ((StringBuilder)localObject).append(" vs ");
      ((StringBuilder)localObject).append(paramList2);
      throw new AssertionError(((StringBuilder)localObject).toString());
    }
    if (paramList1.isEmpty()) {}
    for (paramList1 = this.d;; paramList1 = new c.a()
        {
          public final boolean a(an paramAnonymousan1, an paramAnonymousan2)
          {
            if (j.a(j.this).a(paramAnonymousan1, paramAnonymousan2)) {
              return true;
            }
            an localan1 = (an)localObject.get(paramAnonymousan1);
            an localan2 = (an)localObject.get(paramAnonymousan2);
            return ((localan1 != null) && (localan1.equals(paramAnonymousan2))) || ((localan2 != null) && (localan2.equals(paramAnonymousan1)));
          }
        })
    {
      return b.i.b.a.c.l.a.d.a(paramList1);
      localObject = new HashMap();
      int i = 0;
      while (i < paramList1.size())
      {
        ((Map)localObject).put(((ar)paramList1.get(i)).c(), ((ar)paramList2.get(i)).c());
        i += 1;
      }
    }
  }
  
  public static <H> H a(Collection<H> paramCollection, b.f.a.b<H, a> paramb)
  {
    if ((!b) && (paramCollection.isEmpty())) {
      throw new AssertionError("Should have at least one overridable descriptor");
    }
    if (paramCollection.size() == 1) {
      return (H)b.a.j.b(paramCollection);
    }
    ArrayList localArrayList = new ArrayList(2);
    Object localObject2 = b.a.j.c(paramCollection, paramb);
    Object localObject1 = b.a.j.b(paramCollection);
    a locala1 = (a)paramb.a(localObject1);
    Iterator localIterator = paramCollection.iterator();
    for (paramCollection = (Collection<H>)localObject1; localIterator.hasNext(); paramCollection = (Collection<H>)localObject1)
    {
      label86:
      localObject1 = localIterator.next();
      a locala2 = (a)paramb.a(localObject1);
      if (a(locala2, (Collection)localObject2)) {
        localArrayList.add(localObject1);
      }
      if ((!a(locala2, locala1)) || (a(locala1, locala2))) {
        break label86;
      }
    }
    if (localArrayList.isEmpty()) {
      return paramCollection;
    }
    if (localArrayList.size() == 1) {
      return (H)b.a.j.b(localArrayList);
    }
    localObject1 = null;
    localObject2 = localArrayList.iterator();
    do
    {
      paramCollection = (Collection<H>)localObject1;
      if (!((Iterator)localObject2).hasNext()) {
        break;
      }
      paramCollection = ((Iterator)localObject2).next();
    } while (b.i.b.a.c.l.t.a(((a)paramb.a(paramCollection)).g()));
    if (paramCollection != null) {
      return paramCollection;
    }
    return (H)b.a.j.b(localArrayList);
  }
  
  private static Collection<b.i.b.a.c.b.b> a(b.i.b.a.c.b.b paramb, Collection<? extends b.i.b.a.c.b.b> paramCollection, b.i.b.a.c.b.e parame, i parami)
  {
    ArrayList localArrayList = new ArrayList(paramCollection.size());
    b.i.b.a.c.n.i locali = b.i.b.a.c.n.i.a();
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      b.i.b.a.c.b.b localb = (b.i.b.a.c.b.b)paramCollection.next();
      j.a.a locala = a.a(localb, paramb, parame).a;
      int i;
      if ((!ay.a(localb.j())) && (ay.a(localb, paramb))) {
        i = 1;
      } else {
        i = 0;
      }
      switch (9.b[locala.ordinal()])
      {
      default: 
        break;
      case 2: 
        if (i != 0) {
          parami.b(localb, paramb);
        }
        break;
      case 1: 
        if (i != 0) {
          locali.add(localb);
        }
        localArrayList.add(localb);
      }
    }
    parami.a(paramb, locali);
    return localArrayList;
  }
  
  private static Collection<b.i.b.a.c.b.b> a(b.i.b.a.c.b.e parame, Collection<b.i.b.a.c.b.b> paramCollection)
  {
    b.a.j.b(paramCollection, new b.f.a.b() {});
  }
  
  public static <H> Collection<H> a(H paramH, Collection<H> paramCollection, b.f.a.b<H, a> paramb, b.f.a.b<H, u> paramb1)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramH);
    a locala = (a)paramb.a(paramH);
    paramCollection = paramCollection.iterator();
    if (paramCollection.hasNext())
    {
      Object localObject1 = paramCollection.next();
      Object localObject2 = (a)paramb.a(localObject1);
      if (paramH == localObject1) {}
      for (;;)
      {
        paramCollection.remove();
        break;
        localObject2 = b(locala, (a)localObject2);
        if (localObject2 == j.a.a.a)
        {
          localArrayList.add(localObject1);
        }
        else
        {
          if (localObject2 != j.a.a.c) {
            break;
          }
          paramb1.a(localObject1);
        }
      }
    }
    return localArrayList;
  }
  
  private static List<b.i.b.a.c.l.w> a(a parama)
  {
    ak localak = parama.d();
    ArrayList localArrayList = new ArrayList();
    if (localak != null) {
      localArrayList.add(localak.y());
    }
    parama = parama.k().iterator();
    while (parama.hasNext()) {
      localArrayList.add(((au)parama.next()).y());
    }
    return localArrayList;
  }
  
  private static Set<b.i.b.a.c.b.b> a(b.i.b.a.c.b.b paramb)
  {
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    a(paramb, localLinkedHashSet);
    return localLinkedHashSet;
  }
  
  private static <D extends a> Set<D> a(Set<D> paramSet)
  {
    b.f.a.m local2 = new b.f.a.m() {};
    if (paramSet.size() <= 1) {
      return paramSet;
    }
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    Iterator localIterator1 = paramSet.iterator();
    while (localIterator1.hasNext())
    {
      Object localObject1 = localIterator1.next();
      Iterator localIterator2 = localLinkedHashSet.iterator();
      for (;;)
      {
        if (!localIterator2.hasNext()) {
          break label143;
        }
        Object localObject2 = (b.m)local2.a(localObject1, localIterator2.next());
        a locala = (a)((b.m)localObject2).a;
        localObject2 = (a)((b.m)localObject2).b;
        if (c(locala, (a)localObject2)) {
          localIterator2.remove();
        } else {
          if (c((a)localObject2, locala)) {
            break;
          }
        }
      }
      label143:
      localLinkedHashSet.add(localObject1);
    }
    if (!b)
    {
      if (!localLinkedHashSet.isEmpty()) {
        return localLinkedHashSet;
      }
      throw new AssertionError("All candidates filtered out from ".concat(String.valueOf(paramSet)));
    }
    return localLinkedHashSet;
  }
  
  public static void a(b.i.b.a.c.b.b paramb, b.f.a.b<b.i.b.a.c.b.b, u> paramb1)
  {
    Object localObject1 = paramb.m().iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (b.i.b.a.c.b.b)((Iterator)localObject1).next();
      if (((b.i.b.a.c.b.b)localObject2).j() == ay.g) {
        a((b.i.b.a.c.b.b)localObject2, paramb1);
      }
    }
    if (paramb.j() != ay.g) {
      return;
    }
    Object localObject3 = paramb.m();
    if (((Collection)localObject3).isEmpty())
    {
      localObject1 = ay.k;
    }
    else
    {
      Object localObject4 = ((Collection)localObject3).iterator();
      localObject1 = null;
      label100:
      if (((Iterator)localObject4).hasNext())
      {
        Object localObject5 = (b.i.b.a.c.b.b)((Iterator)localObject4).next();
        localObject2 = ((b.i.b.a.c.b.b)localObject5).j();
        if ((!b) && (localObject2 == ay.g)) {
          throw new AssertionError("Visibility should have been computed for ".concat(String.valueOf(localObject5)));
        }
        if (localObject1 == null) {}
        for (;;)
        {
          localObject1 = localObject2;
          break label100;
          localObject5 = ay.b((az)localObject2, (az)localObject1);
          if (localObject5 == null) {
            break;
          }
          if (((Integer)localObject5).intValue() <= 0) {
            break label100;
          }
        }
      }
      if (localObject1 == null) {}
      for (;;)
      {
        localObject1 = null;
        break;
        localObject2 = ((Collection)localObject3).iterator();
        do
        {
          if (!((Iterator)localObject2).hasNext()) {
            break label262;
          }
          localObject4 = ay.b((az)localObject1, ((b.i.b.a.c.b.b)((Iterator)localObject2).next()).j());
          if (localObject4 == null) {
            break;
          }
        } while (((Integer)localObject4).intValue() >= 0);
      }
    }
    label262:
    if (localObject1 == null) {}
    for (;;)
    {
      localObject1 = null;
      break;
      if (paramb.t() != b.a.b) {
        break label344;
      }
      localObject2 = ((Collection)localObject3).iterator();
      do
      {
        if (!((Iterator)localObject2).hasNext()) {
          break;
        }
        localObject3 = (b.i.b.a.c.b.b)((Iterator)localObject2).next();
      } while ((((b.i.b.a.c.b.b)localObject3).d_() == b.i.b.a.c.b.w.d) || (((b.i.b.a.c.b.b)localObject3).j().equals(localObject1)));
    }
    break label349;
    label344:
    localObject1 = ((az)localObject1).b();
    label349:
    if (localObject1 == null)
    {
      if (paramb1 != null) {
        paramb1.a(paramb);
      }
      localObject2 = ay.e;
    }
    else
    {
      localObject2 = localObject1;
    }
    if ((paramb instanceof z))
    {
      ((z)paramb).b = ((az)localObject2);
      localObject2 = ((ah)paramb).u().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (ag)((Iterator)localObject2).next();
        if (localObject1 == null) {
          paramb = null;
        } else {
          paramb = paramb1;
        }
        a((b.i.b.a.c.b.b)localObject3, paramb);
      }
      return;
    }
    if ((paramb instanceof b.i.b.a.c.b.c.p))
    {
      ((b.i.b.a.c.b.c.p)paramb).i = ((az)localObject2);
      return;
    }
    if ((!b) && (!(paramb instanceof b.i.b.a.c.b.c.y))) {
      throw new AssertionError();
    }
    paramb = (b.i.b.a.c.b.c.y)paramb;
    paramb.g = ((az)localObject2);
    if (localObject2 != paramb.e.j()) {
      paramb.a = false;
    }
  }
  
  private static void a(b.i.b.a.c.b.b paramb, Set<b.i.b.a.c.b.b> paramSet)
  {
    if (paramb.t().a())
    {
      paramSet.add(paramb);
      return;
    }
    if (!paramb.m().isEmpty())
    {
      paramb = paramb.m().iterator();
      while (paramb.hasNext()) {
        a((b.i.b.a.c.b.b)paramb.next(), paramSet);
      }
      return;
    }
    throw new IllegalStateException("No overridden descriptors found for (fake override) ".concat(String.valueOf(paramb)));
  }
  
  private static void a(b.i.b.a.c.b.e parame, Collection<b.i.b.a.c.b.b> paramCollection, i parami)
  {
    final Object localObject;
    if (paramCollection.size() >= 2)
    {
      localObject = new b.f.a.b() {};
      b.f.b.j.b(paramCollection, "receiver$0");
      b.f.b.j.b(localObject, "predicate");
      if (!((Collection)paramCollection).isEmpty())
      {
        Iterator localIterator = paramCollection.iterator();
        while (localIterator.hasNext()) {
          if (!((Boolean)((b.f.a.b)localObject).a(localIterator.next())).booleanValue())
          {
            i = 0;
            break label113;
          }
        }
      }
    }
    int i = 1;
    label113:
    if (i != 0)
    {
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        a(Collections.singleton((b.i.b.a.c.b.b)paramCollection.next()), parame, parami);
      }
      return;
    }
    paramCollection = new LinkedList(paramCollection);
    while (!paramCollection.isEmpty())
    {
      localObject = l.a(paramCollection);
      a(a(localObject, paramCollection, new b.f.a.b()new b.f.a.b {}, new b.f.a.b() {}), parame, parami);
    }
  }
  
  private static void a(Collection<b.i.b.a.c.b.b> paramCollection, b.i.b.a.c.b.e parame, i parami)
  {
    Object localObject = a(parame, paramCollection);
    boolean bool = ((Collection)localObject).isEmpty();
    if (!bool) {
      paramCollection = (Collection<b.i.b.a.c.b.b>)localObject;
    }
    b.i.b.a.c.b.w localw = a(paramCollection, parame);
    if (bool) {
      localObject = ay.h;
    } else {
      localObject = ay.g;
    }
    parame = ((b.i.b.a.c.b.b)a(paramCollection, new b.f.a.b() {})).a(parame, localw, (az)localObject, b.a.b);
    parami.a(parame, paramCollection);
    if ((!b) && (parame.m().isEmpty()))
    {
      paramCollection = new StringBuilder("Overridden descriptors should be set for ");
      paramCollection.append(b.a.b);
      throw new AssertionError(paramCollection.toString());
    }
    parami.a(parame);
  }
  
  public static void a(Collection<? extends b.i.b.a.c.b.b> paramCollection1, Collection<? extends b.i.b.a.c.b.b> paramCollection2, b.i.b.a.c.b.e parame, i parami)
  {
    LinkedHashSet localLinkedHashSet = new LinkedHashSet(paramCollection1);
    paramCollection2 = paramCollection2.iterator();
    while (paramCollection2.hasNext()) {
      localLinkedHashSet.removeAll(a((b.i.b.a.c.b.b)paramCollection2.next(), paramCollection1, parame, parami));
    }
    a(parame, localLinkedHashSet, parami);
  }
  
  public static boolean a(a parama1, a parama2)
  {
    b.i.b.a.c.l.w localw1 = parama1.g();
    b.i.b.a.c.l.w localw2 = parama2.g();
    if ((!b) && (localw1 == null))
    {
      parama2 = new StringBuilder("Return type of ");
      parama2.append(parama1);
      parama2.append(" is null");
      throw new AssertionError(parama2.toString());
    }
    if ((!b) && (localw2 == null))
    {
      parama1 = new StringBuilder("Return type of ");
      parama1.append(parama2);
      parama1.append(" is null");
      throw new AssertionError(parama1.toString());
    }
    if (!a(parama1, parama2)) {
      return false;
    }
    if ((parama1 instanceof b.i.b.a.c.b.t))
    {
      if ((!b) && (!(parama2 instanceof b.i.b.a.c.b.t)))
      {
        parama1 = new StringBuilder("b is ");
        parama1.append(parama2.getClass());
        throw new AssertionError(parama1.toString());
      }
      return a(parama1, localw1, parama2, localw2);
    }
    if ((parama1 instanceof ah))
    {
      if ((!b) && (!(parama2 instanceof ah)))
      {
        parama1 = new StringBuilder("b is ");
        parama1.append(parama2.getClass());
        throw new AssertionError(parama1.toString());
      }
      ah localah1 = (ah)parama1;
      ah localah2 = (ah)parama2;
      aj localaj1 = localah1.c();
      aj localaj2 = localah2.c();
      boolean bool;
      if ((localaj1 != null) && (localaj2 != null)) {
        bool = a(localaj1, localaj2);
      } else {
        bool = true;
      }
      if (!bool) {
        return false;
      }
      if ((localah1.z()) && (localah2.z())) {
        return a.a(parama1.f(), parama2.f()).b(localw1, localw2);
      }
      return ((localah1.z()) || (!localah2.z())) && (a(parama1, localw1, parama2, localw2));
    }
    parama2 = new StringBuilder("Unexpected callable: ");
    parama2.append(parama1.getClass());
    throw new IllegalArgumentException(parama2.toString());
  }
  
  private static boolean a(a parama1, b.i.b.a.c.l.w paramw1, a parama2, b.i.b.a.c.l.w paramw2)
  {
    return a.a(parama1.f(), parama2.f()).a(paramw1, paramw2);
  }
  
  private static boolean a(a parama, Collection<a> paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      if (!a(parama, (a)paramCollection.next())) {
        return false;
      }
    }
    return true;
  }
  
  private static boolean a(ar paramar1, ar paramar2, c paramc)
  {
    Object localObject = paramar1.j();
    paramar1 = new ArrayList(paramar2.j());
    if (((List)localObject).size() != paramar1.size()) {
      return false;
    }
    paramar2 = ((List)localObject).iterator();
    while (paramar2.hasNext())
    {
      localObject = (b.i.b.a.c.l.w)paramar2.next();
      ListIterator localListIterator = paramar1.listIterator();
      for (;;)
      {
        if (localListIterator.hasNext()) {
          if (a((b.i.b.a.c.l.w)localObject, (b.i.b.a.c.l.w)localListIterator.next(), paramc))
          {
            localListIterator.remove();
            break;
          }
        }
      }
      return false;
    }
    return true;
  }
  
  private static boolean a(b.i.b.a.c.b.p paramp1, b.i.b.a.c.b.p paramp2)
  {
    paramp1 = ay.b(paramp1.j(), paramp2.j());
    return (paramp1 == null) || (paramp1.intValue() >= 0);
  }
  
  private static boolean a(b.i.b.a.c.l.w paramw1, b.i.b.a.c.l.w paramw2, c paramc)
  {
    int i;
    if ((b.i.b.a.c.l.y.b(paramw1)) && (b.i.b.a.c.l.y.b(paramw2))) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return paramc.b(paramw1, paramw2);
    }
    return true;
  }
  
  public static j.a.a b(a parama1, a parama2)
  {
    j.a.a locala = a.a(parama2, parama1, null).a;
    parama1 = a.a(parama1, parama2, null).a;
    if ((locala == j.a.a.a) && (parama1 == j.a.a.a)) {
      return j.a.a.a;
    }
    if ((locala != j.a.a.c) && (parama1 != j.a.a.c)) {
      return j.a.a.b;
    }
    return j.a.a.c;
  }
  
  private static <D extends a> boolean c(D paramD1, D paramD2)
  {
    if ((!paramD1.equals(paramD2)) && (b.a.a(paramD1.k_(), paramD2.k_()))) {
      return true;
    }
    paramD2 = paramD2.k_();
    paramD1 = d.a(paramD1).iterator();
    while (paramD1.hasNext())
    {
      a locala = (a)paramD1.next();
      if (b.a.a(paramD2, locala)) {
        return true;
      }
    }
    return false;
  }
  
  private static a d(a parama1, a parama2)
  {
    boolean bool1 = parama1 instanceof b.i.b.a.c.b.t;
    boolean bool2;
    if ((!bool1) || ((parama2 instanceof b.i.b.a.c.b.t)))
    {
      bool2 = parama1 instanceof ah;
      if ((!bool2) || ((parama2 instanceof ah))) {
        break label41;
      }
    }
    for (parama1 = "Member kind mismatch";; parama1 = "Name mismatch")
    {
      return a.a(parama1);
      label41:
      if ((!bool1) && (!bool2)) {
        throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: ".concat(String.valueOf(parama1)));
      }
      if (parama1.i().equals(parama2.i())) {
        break;
      }
    }
    parama1 = e(parama1, parama2);
    if (parama1 != null) {
      return parama1;
    }
    return null;
  }
  
  private static a e(a parama1, a parama2)
  {
    ak localak = parama1.d();
    int j = 0;
    int i;
    if (localak == null) {
      i = 1;
    } else {
      i = 0;
    }
    if (parama2.d() == null) {
      j = 1;
    }
    if (i != j) {}
    for (parama1 = "Receiver presence mismatch";; parama1 = "Value parameter number mismatch")
    {
      return a.a(parama1);
      if (parama1.k().size() == parama2.k().size()) {
        break;
      }
    }
    return null;
  }
  
  public final a a(a parama1, a parama2, b.i.b.a.c.b.e parame, boolean paramBoolean)
  {
    Object localObject = a(parama1, parama2, paramBoolean);
    int i;
    if (((a)localObject).a == j.a.a.a) {
      i = 1;
    } else {
      i = 0;
    }
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      if ((locale.a() != e.a.a) && ((i == 0) || (locale.a() != e.a.b)))
      {
        int j = locale.a(parama1, parama2, parame);
        switch (9.a[(j - 1)])
        {
        default: 
          break;
        case 3: 
          return a.a("External condition");
        case 2: 
          return a.b("External condition failed");
        case 1: 
          i = 1;
        }
      }
    }
    if (i == 0) {
      return (a)localObject;
    }
    localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      localObject = (e)localIterator.next();
      if (((e)localObject).a() == e.a.a)
      {
        i = ((e)localObject).a(parama1, parama2, parame);
        switch (9.a[(i - 1)])
        {
        default: 
          break;
        case 3: 
          return a.a("External condition");
        case 2: 
          return a.b("External condition failed");
        case 1: 
          parama1 = new StringBuilder("Contract violation in ");
          parama1.append(localObject.getClass().getName());
          parama1.append(" condition. It's not supposed to end with success");
          throw new IllegalStateException(parama1.toString());
        }
      }
    }
    return a.a();
  }
  
  public final a a(a parama1, a parama2, boolean paramBoolean)
  {
    Object localObject = d(parama1, parama2);
    if (localObject != null) {
      return (a)localObject;
    }
    List localList1 = a(parama1);
    List localList2 = a(parama2);
    List localList3 = parama1.f();
    List localList4 = parama2.f();
    int k = localList3.size();
    int m = localList4.size();
    int j = 0;
    int i = 0;
    if (k != m)
    {
      while (i < localList1.size())
      {
        if (!c.a.b((b.i.b.a.c.l.w)localList1.get(i), (b.i.b.a.c.l.w)localList2.get(i))) {
          return a.a("Type parameter number mismatch");
        }
        i += 1;
      }
      return a.b("Type parameter number mismatch");
    }
    localObject = a(localList3, localList4);
    i = 0;
    while (i < localList3.size())
    {
      if (!a((ar)localList3.get(i), (ar)localList4.get(i), (c)localObject)) {
        return a.a("Type parameter bounds mismatch");
      }
      i += 1;
    }
    i = 0;
    while (i < localList1.size())
    {
      if (!a((b.i.b.a.c.l.w)localList1.get(i), (b.i.b.a.c.l.w)localList2.get(i), (c)localObject)) {
        return a.a("Value parameter type mismatch");
      }
      i += 1;
    }
    if (((parama1 instanceof b.i.b.a.c.b.t)) && ((parama2 instanceof b.i.b.a.c.b.t)) && (((b.i.b.a.c.b.t)parama1).C() != ((b.i.b.a.c.b.t)parama2).C())) {
      return a.b("Incompatible suspendability");
    }
    if (paramBoolean)
    {
      parama1 = parama1.g();
      parama2 = parama2.g();
      if ((parama1 != null) && (parama2 != null))
      {
        i = j;
        if (b.i.b.a.c.l.y.b(parama2))
        {
          i = j;
          if (b.i.b.a.c.l.y.b(parama1)) {
            i = 1;
          }
        }
        if ((i == 0) && (!((c)localObject).a(parama2, parama1))) {
          return a.b("Return type mismatch");
        }
      }
    }
    return a.a();
  }
  
  public static final class a
  {
    private static final a b = new a(a.a, "SUCCESS");
    public final a a;
    private final String c;
    
    private a(a parama, String paramString)
    {
      this.a = parama;
      this.c = paramString;
    }
    
    public static a a()
    {
      return b;
    }
    
    public static a a(String paramString)
    {
      return new a(a.b, paramString);
    }
    
    public static a b(String paramString)
    {
      return new a(a.c, paramString);
    }
    
    public static enum a
    {
      private a() {}
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */