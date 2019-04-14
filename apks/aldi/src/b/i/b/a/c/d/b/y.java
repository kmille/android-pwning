package b.i.b.a.c.d.b;

import b.f.a.q;
import b.i.b.a.c.a.b.c.a;
import b.i.b.a.c.a.g;
import b.i.b.a.c.b.ab;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.e;
import b.i.b.a.c.d.a.f.s;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.av;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.p;
import b.i.b.a.c.l.v;
import b.r;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class y
{
  private static final b.i.b.a.c.b.l a(b.i.b.a.c.b.l paraml)
  {
    for (;;)
    {
      if (!(paraml instanceof e)) {
        localObject = null;
      } else {
        localObject = paraml;
      }
      localObject = (e)localObject;
      if (localObject != null) {}
      b.i.b.a.c.b.l locall;
      for (;;)
      {
        locall = (b.i.b.a.c.b.l)localObject;
        break;
        if (!(paraml instanceof ab)) {
          localObject = null;
        } else {
          localObject = paraml;
        }
        localObject = (ab)localObject;
      }
      localObject = locall;
      if (locall != null) {
        return localObject;
      }
      if (paraml == null) {
        break;
      }
      paraml = paraml.a();
    }
    Object localObject = null;
    return (b.i.b.a.c.b.l)localObject;
  }
  
  private static b.i.b.a.c.l.w a(ar paramar)
  {
    b.f.b.j.b(paramar, "descriptor");
    List localList = paramar.j();
    b.f.b.j.a(localList, "descriptor.upperBounds");
    boolean bool = localList.isEmpty();
    if ((b.w.a) && (!(bool ^ true))) {
      throw ((Throwable)new AssertionError("Upper bounds should not be empty: ".concat(String.valueOf(paramar))));
    }
    Iterator localIterator = ((Iterable)localList).iterator();
    int i;
    do
    {
      bool = localIterator.hasNext();
      paramar = null;
      if (!bool) {
        break;
      }
      localObject = localIterator.next();
      b.i.b.a.c.b.h localh = ((b.i.b.a.c.l.w)localObject).f().c();
      if ((localh instanceof e)) {
        paramar = localh;
      }
      paramar = (e)paramar;
      if ((paramar != null) && (paramar.g() != b.i.b.a.c.b.f.b) && (paramar.g() != b.i.b.a.c.b.f.e)) {
        i = 1;
      } else {
        i = 0;
      }
    } while (i == 0);
    paramar = (ar)localObject;
    break label180;
    paramar = null;
    label180:
    Object localObject = (b.i.b.a.c.l.w)paramar;
    paramar = (ar)localObject;
    if (localObject == null)
    {
      paramar = b.a.j.c(localList);
      b.f.b.j.a(paramar, "upperBounds.first()");
      paramar = (b.i.b.a.c.l.w)paramar;
    }
    return paramar;
  }
  
  private static b.i.b.a.c.l.w a(b.i.b.a.c.l.w paramw, HashSet<b.i.b.a.c.b.h> paramHashSet)
  {
    b.f.b.j.b(paramw, "kotlinType");
    b.f.b.j.b(paramHashSet, "visitedClassifiers");
    b.i.b.a.c.b.h localh = paramw.f().c();
    if (localh != null)
    {
      b.f.b.j.a(localh, "kotlinType.constructor.d…n expected: $kotlinType\")");
      if (!paramHashSet.add(localh)) {
        return null;
      }
      if ((localh instanceof ar))
      {
        paramHashSet = a(a((ar)localh), paramHashSet);
        if (paramHashSet != null)
        {
          if (!b.i.b.a.c.l.y.a(paramHashSet))
          {
            if (!paramw.c()) {
              return paramHashSet;
            }
            return b.i.b.a.c.l.c.a.b(paramHashSet);
          }
          return paramHashSet;
        }
        return null;
      }
      b.i.b.a.c.l.w localw = paramw;
      if ((localh instanceof e))
      {
        localw = paramw;
        if (((e)localh).n())
        {
          localw = b.i.b.a.c.i.f.b(paramw);
          if (localw == null) {
            return null;
          }
          paramHashSet = a(localw, paramHashSet);
          if (paramHashSet == null) {
            return null;
          }
          if (!paramw.c()) {
            return paramHashSet;
          }
          if (b.i.b.a.c.l.y.a(paramHashSet)) {
            return paramw;
          }
          if (g.e(paramHashSet)) {
            return paramw;
          }
          localw = b.i.b.a.c.l.c.a.b(paramHashSet);
        }
      }
      return localw;
    }
    throw ((Throwable)new AssertionError("Type with a declaration expected: ".concat(String.valueOf(paramw))));
  }
  
  private static final <T> T a(k<T> paramk, T paramT, boolean paramBoolean)
  {
    if (paramBoolean) {
      return (T)paramk.a(paramT);
    }
    return paramT;
  }
  
  private static <T> T a(b.i.b.a.c.l.w paramw, k<T> paramk, w paramw1, u<? extends T> paramu, h<T> paramh, q<? super b.i.b.a.c.l.w, ? super T, ? super w, b.u> paramq, boolean paramBoolean)
  {
    w localw = paramw1;
    Object localObject1;
    for (;;)
    {
      b.f.b.j.b(paramw, "kotlinType");
      b.f.b.j.b(paramk, "factory");
      b.f.b.j.b(localw, "mode");
      b.f.b.j.b(paramu, "typeMappingConfiguration");
      b.f.b.j.b(paramq, "writeGenericType");
      if (b.i.b.a.c.a.f.b(paramw))
      {
        paramw = (b.i.b.a.c.l.w)b.i.b.a.c.a.k.a(paramw);
      }
      else
      {
        paramw1 = paramw.f().c();
        boolean bool = paramw1 instanceof e;
        localObject1 = null;
        if (!bool) {
          paramw1 = null;
        }
        paramw1 = (e)paramw1;
        if (paramw1 == null)
        {
          paramw1 = (w)localObject1;
        }
        else
        {
          if (paramw1 == b.i.b.a.c.a.k.a()) {
            paramw1 = a(false);
          }
          for (;;)
          {
            paramw1 = paramk.b(paramw1);
            break;
            if (b.f.b.j.a(paramw1, b.i.b.a.c.a.k.b()))
            {
              paramw1 = a(true);
            }
            else
            {
              Object localObject2 = (b.i.b.a.c.b.l)paramw1;
              paramw1 = g.c((b.i.b.a.c.b.l)localObject2);
              if (paramw1 != null)
              {
                paramw1 = b.i.b.a.c.i.d.c.a(paramw1);
                b.f.b.j.a(paramw1, "JvmPrimitiveType.get(primitiveType)");
                paramw1 = paramw1.k;
                b.f.b.j.a(paramw1, "JvmPrimitiveType.get(primitiveType).desc");
                paramw1 = paramk.a(paramw1);
                if ((!av.e(paramw)) && (!s.a(paramw))) {
                  bool = false;
                } else {
                  bool = true;
                }
                paramw1 = a(paramk, paramw1, bool);
                break;
              }
              paramw1 = g.d((b.i.b.a.c.b.l)localObject2);
              if (paramw1 != null)
              {
                localObject1 = new StringBuilder("[");
                paramw1 = b.i.b.a.c.i.d.c.a(paramw1);
                b.f.b.j.a(paramw1, "JvmPrimitiveType.get(arrayElementType)");
                ((StringBuilder)localObject1).append(paramw1.k);
                paramw1 = paramk.a(((StringBuilder)localObject1).toString());
                break;
              }
              paramw1 = (w)localObject1;
              if (!g.b((b.i.b.a.c.b.l)localObject2)) {
                break;
              }
              paramw1 = b.i.b.a.c.a.b.c.b;
              localObject2 = b.i.b.a.c.a.b.c.a(b.i.b.a.c.i.c.a.a((b.i.b.a.c.b.l)localObject2));
              paramw1 = (w)localObject1;
              if (localObject2 == null) {
                break;
              }
              if (!localw.g)
              {
                paramw1 = b.i.b.a.c.a.b.c.b;
                paramw1 = (Iterable)b.i.b.a.c.a.b.c.b();
                if ((!(paramw1 instanceof Collection)) || (!((Collection)paramw1).isEmpty()))
                {
                  paramw1 = paramw1.iterator();
                  while (paramw1.hasNext()) {
                    if (b.f.b.j.a(((c.a)paramw1.next()).a, localObject2))
                    {
                      i = 1;
                      break label391;
                    }
                  }
                }
                int i = 0;
                label391:
                paramw1 = (w)localObject1;
                if (i != 0) {
                  break;
                }
              }
              paramw1 = b.i.b.a.c.i.d.b.a((b.i.b.a.c.f.a)localObject2);
              b.f.b.j.a(paramw1, "JvmClassName.byClassId(classId)");
              paramw1 = paramw1.a;
              b.f.b.j.a(paramw1, "JvmClassName.byClassId(classId).internalName");
            }
          }
        }
        if (paramw1 != null)
        {
          paramk = a(paramk, paramw1, localw.a);
          paramq.a(paramw, paramk, localw);
          return paramk;
        }
        paramw1 = paramw.f();
        if ((paramw1 instanceof v))
        {
          paramw = ((v)paramw1).a;
          b.f.b.j.a(paramw, "constructor.supertypes");
          paramw = b.i.b.a.c.l.c.a.g(paramu.a(paramw));
        }
        else
        {
          paramw1 = paramw1.c();
          if (paramw1 == null) {
            break label1191;
          }
          b.f.b.j.a(paramw1, "constructor.declarationD…structor of $kotlinType\")");
          if (p.a((b.i.b.a.c.b.l)paramw1))
          {
            paramk = paramk.b("error/NonExistentClass");
            if (paramw1 != null)
            {
              paramu.a(paramw, (e)paramw1);
              if (paramh != null) {
                paramh.a(paramk);
              }
              return paramk;
            }
            throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
          }
          bool = paramw1 instanceof e;
          if ((bool) && (g.c(paramw)))
          {
            if (paramw.a().size() == 1)
            {
              paramw = (ap)paramw.a().get(0);
              localObject1 = paramw.c();
              b.f.b.j.a(localObject1, "memberProjection.type");
              if (paramw.b() == ba.b)
              {
                paramw1 = paramk.b("java/lang/Object");
                paramw = paramw1;
                if (paramh != null)
                {
                  paramh.a();
                  paramh.a(paramw1);
                  paramw = paramw1;
                }
              }
              else
              {
                if (paramh != null) {
                  paramh.a();
                }
                paramw = paramw.b();
                b.f.b.j.a(paramw, "memberProjection.projectionKind");
                b.f.b.j.b(paramw, "effectiveVariance");
                switch (x.a[paramw.ordinal()])
                {
                default: 
                  paramw1 = localw.f;
                  paramw = paramw1;
                  if (paramw1 == null) {
                    paramw = localw;
                  }
                  break;
                case 2: 
                  paramw1 = localw.i;
                  paramw = paramw1;
                  if (paramw1 == null) {
                    paramw = localw;
                  }
                  break;
                case 1: 
                  paramw1 = localw.h;
                  paramw = paramw1;
                  if (paramw1 == null) {
                    paramw = localw;
                  }
                  break;
                }
                paramw = a((b.i.b.a.c.l.w)localObject1, paramk, paramw, paramu, paramh, paramq, paramBoolean);
              }
              paramw1 = new StringBuilder("[");
              paramw1.append(paramk.b(paramw));
              return (T)paramk.a(paramw1.toString());
            }
            throw ((Throwable)new UnsupportedOperationException("arrays must have one type argument"));
          }
          if (!bool) {
            break label1101;
          }
          localObject1 = (e)paramw1;
          if ((!((e)localObject1).n()) || (localw.b)) {
            break;
          }
          b.f.b.j.b(paramw, "inlineClassType");
          paramw1 = a(paramw, new HashSet());
          if (paramw1 == null) {
            break;
          }
          localw = new w(localw.a, true, localw.c, localw.d, localw.e, localw.f, localw.g, localw.h, localw.i);
          paramw = paramw1;
        }
      }
    }
    if ((localw.c) && (g.e((e)localObject1)))
    {
      paramk = paramk.a();
    }
    else
    {
      paramw1 = ((e)localObject1).x();
      b.f.b.j.a(paramw1, "descriptor.original");
      paramu.a(paramw1);
      paramw1 = (w)localObject1;
      if (((e)localObject1).g() == b.i.b.a.c.b.f.d)
      {
        paramw1 = ((e)localObject1).a();
        if (paramw1 != null) {
          paramw1 = (e)paramw1;
        } else {
          throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        }
      }
      paramw1 = paramw1.x();
      b.f.b.j.a(paramw1, "enumClassIfEnumEntry.original");
      paramk = paramk.b(a(paramw1, paramu, paramBoolean));
    }
    paramq.a(paramw, paramk, localw);
    return paramk;
    label1101:
    if ((paramw1 instanceof ar))
    {
      paramw = a(a((ar)paramw1), paramk, localw, paramu, null, b.i.b.a.c.n.d.c(), paramBoolean);
      if (paramh != null)
      {
        paramk = paramw1.i();
        b.f.b.j.a(paramk, "descriptor.getName()");
        b.f.b.j.b(paramk, "name");
        b.f.b.j.b(paramw, "type");
        paramh.b(paramw);
      }
      return paramw;
    }
    throw ((Throwable)new UnsupportedOperationException("Unknown type ".concat(String.valueOf(paramw))));
    label1191:
    throw ((Throwable)new UnsupportedOperationException("no descriptor for type constructor of ".concat(String.valueOf(paramw))));
  }
  
  public static final String a(e parame, u<?> paramu, boolean paramBoolean)
  {
    b.f.b.j.b(parame, "klass");
    b.f.b.j.b(paramu, "typeMappingConfiguration");
    b.i.b.a.c.b.l locall;
    if (paramBoolean) {
      locall = a(parame.a());
    } else {
      locall = parame.a();
    }
    Object localObject = b.i.b.a.c.f.h.a(parame.i());
    b.f.b.j.a(localObject, "SpecialNames.safeIdentifier(klass.name)");
    String str = ((b.i.b.a.c.f.f)localObject).a();
    b.f.b.j.a(str, "SpecialNames.safeIdentifier(klass.name).identifier");
    if ((locall instanceof ab))
    {
      paramu = ((ab)locall).c();
      if (paramu.b.a.isEmpty()) {
        return str;
      }
      parame = new StringBuilder();
      paramu = paramu.b.a;
      b.f.b.j.a(paramu, "fqName.asString()");
      parame.append(b.k.l.a(paramu, '.', '/'));
      parame.append('/');
    }
    for (;;)
    {
      parame.append(str);
      return parame.toString();
      if (!(locall instanceof e)) {
        localObject = null;
      } else {
        localObject = locall;
      }
      localObject = (e)localObject;
      if (localObject == null) {
        break;
      }
      paramu.b((e)localObject);
      paramu = a((e)localObject, paramu, paramBoolean);
      parame = new StringBuilder();
      parame.append(paramu);
      parame.append('$');
    }
    paramu = new StringBuilder("Unexpected container: ");
    paramu.append(locall);
    paramu.append(" for ");
    paramu.append(parame);
    throw ((Throwable)new IllegalArgumentException(paramu.toString()));
  }
  
  private static final String a(boolean paramBoolean)
  {
    if (paramBoolean) {
      localObject = b.i.b.a.c.i.d.g;
    } else {
      localObject = b.i.b.a.c.i.d.f;
    }
    Object localObject = b.i.b.a.c.i.d.b.a(b.i.b.a.c.f.a.a((b.i.b.a.c.f.b)localObject));
    b.f.b.j.a(localObject, "JvmClassName.byClassId(ClassId.topLevel(fqName))");
    localObject = ((b.i.b.a.c.i.d.b)localObject).a;
    b.f.b.j.a(localObject, "JvmClassName.byClassId(C…vel(fqName)).internalName");
    return (String)localObject;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/b/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */