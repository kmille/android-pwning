package b.i.b.a.c.j.a;

import b.a.ac;
import b.i.b.a.c.b.aa;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.y;
import b.i.b.a.c.e.a.a;
import b.i.b.a.c.e.a.a.a;
import b.i.b.a.c.e.a.a.a.b;
import b.i.b.a.c.e.a.b;
import b.i.b.a.c.e.a.b.a;
import b.i.b.a.c.i.b.i;
import b.i.b.a.c.i.b.j.a;
import b.i.b.a.c.i.b.k;
import b.i.b.a.c.i.b.o;
import b.i.b.a.c.i.b.t;
import b.i.b.a.c.i.b.u;
import b.i.b.a.c.i.b.v;
import b.i.b.a.c.l.ar;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.x;
import b.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class c
{
  private final y a;
  private final aa b;
  
  public c(y paramy, aa paramaa)
  {
    this.a = paramy;
    this.b = paramaa;
  }
  
  private final b.i.b.a.c.a.g a()
  {
    return this.a.b();
  }
  
  private final b.i.b.a.c.b.e a(b.i.b.a.c.f.a parama)
  {
    return b.i.b.a.c.b.s.a(this.a, parama, this.b);
  }
  
  private b.i.b.a.c.i.b.f<?> a(b.i.b.a.c.l.w paramw, a.a.a.b paramb, b.i.b.a.c.e.a.c paramc)
  {
    b.f.b.j.b(paramw, "expectedType");
    b.f.b.j.b(paramb, "value");
    b.f.b.j.b(paramc, "nameResolver");
    Object localObject1 = b.K.a(paramb.l);
    b.f.b.j.a(localObject1, "Flags.IS_UNSIGNED.get(value.flags)");
    boolean bool2 = ((Boolean)localObject1).booleanValue();
    localObject1 = paramb.b;
    if (localObject1 != null)
    {
      int k = d.a[localObject1.ordinal()];
      int i = 0;
      boolean bool1 = false;
      int j = 0;
      Object localObject2;
      switch (k)
      {
      default: 
        break;
      case 13: 
        if (!b.i.b.a.c.a.g.c(paramw))
        {
          i = j;
          if (!b.i.b.a.c.a.g.d(paramw)) {}
        }
        else
        {
          i = 1;
        }
        Object localObject3 = paramb.j;
        b.f.b.j.a(localObject3, "arrayElements");
        if ((((Collection)localObject3).isEmpty() ^ true))
        {
          localObject1 = b.a.j.c((List)localObject3);
          b.f.b.j.a(localObject1, "arrayElements.first()");
          localObject1 = (a.a.a.b)localObject1;
          localObject2 = a();
          localObject4 = ((a.a.a.b)localObject1).b;
          if (localObject4 != null)
          {
            switch (d.b[localObject4.ordinal()])
            {
            default: 
              break;
            case 13: 
              throw ((Throwable)new IllegalStateException("Array of arrays is impossible".toString()));
            case 12: 
              localObject1 = ((a.a.a.b)localObject1).i;
              b.f.b.j.a(localObject1, "value.annotation");
              localObject1 = a(r.a(paramc, ((a.a)localObject1).b)).h();
              localObject2 = "resolveClass(nameResolve…notation.id)).defaultType";
              break;
            case 11: 
              localObject1 = a(r.a(paramc, ((a.a.a.b)localObject1).g)).h();
              localObject2 = "resolveClass(nameResolve…lue.classId)).defaultType";
              break;
            case 10: 
              throw ((Throwable)new IllegalStateException("Arrays of class literals are not supported yet".toString()));
            case 9: 
              localObject1 = ((b.i.b.a.c.a.g)localObject2).j();
              localObject2 = "stringType";
              break;
            case 8: 
              localObject1 = ((b.i.b.a.c.a.g)localObject2).a(b.i.b.a.c.a.h.a);
              localObject2 = "booleanType";
              break;
            case 7: 
              localObject1 = ((b.i.b.a.c.a.g)localObject2).a(b.i.b.a.c.a.h.h);
              localObject2 = "doubleType";
              break;
            case 6: 
              localObject1 = ((b.i.b.a.c.a.g)localObject2).a(b.i.b.a.c.a.h.f);
              localObject2 = "floatType";
              break;
            case 5: 
              localObject1 = ((b.i.b.a.c.a.g)localObject2).a(b.i.b.a.c.a.h.g);
              localObject2 = "longType";
              break;
            case 4: 
              localObject1 = ((b.i.b.a.c.a.g)localObject2).a(b.i.b.a.c.a.h.e);
              localObject2 = "intType";
              break;
            case 3: 
              localObject1 = ((b.i.b.a.c.a.g)localObject2).a(b.i.b.a.c.a.h.d);
              localObject2 = "shortType";
              break;
            case 2: 
              localObject1 = ((b.i.b.a.c.a.g)localObject2).a(b.i.b.a.c.a.h.b);
              localObject2 = "charType";
              break;
            case 1: 
              localObject1 = ((b.i.b.a.c.a.g)localObject2).a(b.i.b.a.c.a.h.c);
              localObject2 = "byteType";
            }
            b.f.b.j.a(localObject1, (String)localObject2);
            localObject2 = a();
            localObject1 = (b.i.b.a.c.l.w)localObject1;
            localObject2 = ((b.i.b.a.c.a.g)localObject2).b((b.i.b.a.c.l.w)localObject1);
            if (localObject2 != null)
            {
              localObject1 = (b.i.b.a.c.l.w)localObject2;
              break label716;
            }
            localObject1 = a().a(ba.a, (b.i.b.a.c.l.w)localObject1);
            localObject2 = "builtIns.getArrayType(Va…RIANT, actualElementType)";
          }
          else
          {
            paramw = new StringBuilder("Unknown type: ");
            paramw.append(((a.a.a.b)localObject1).b);
            throw ((Throwable)new IllegalStateException(paramw.toString().toString()));
          }
        }
        else
        {
          if (i != 0)
          {
            localObject1 = paramw;
            break label716;
          }
          localObject1 = a().a(ba.a, (b.i.b.a.c.l.w)a().g());
          localObject2 = "builtIns.getArrayType(Va…ARIANT, builtIns.anyType)";
        }
        b.f.b.j.a(localObject1, (String)localObject2);
        localObject1 = (b.i.b.a.c.l.w)localObject1;
        Object localObject4 = a();
        if (i != 0) {
          localObject2 = paramw;
        } else {
          localObject2 = localObject1;
        }
        localObject2 = ((b.i.b.a.c.a.g)localObject4).a((b.i.b.a.c.l.w)localObject2);
        b.f.b.j.a(localObject2, "builtIns.getArrayElement…ype else actualArrayType)");
        localObject4 = b.i.b.a.c.i.b.g.a;
        localObject4 = (Iterable)localObject3;
        localObject3 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject4));
        localObject4 = ((Iterable)localObject4).iterator();
        while (((Iterator)localObject4).hasNext())
        {
          a.a.a.b localb = (a.a.a.b)((Iterator)localObject4).next();
          b.f.b.j.a(localb, "it");
          ((Collection)localObject3).add(a((b.i.b.a.c.l.w)localObject2, localb, paramc));
        }
        paramc = b.i.b.a.c.i.b.g.a((List)localObject3, (b.i.b.a.c.l.w)localObject1);
        break;
      case 12: 
        localObject1 = paramb.i;
        b.f.b.j.a(localObject1, "value.annotation");
        paramc = new b.i.b.a.c.i.b.a(a((a.a)localObject1, paramc));
        break;
      case 11: 
        paramc = new i(r.a(paramc, paramb.g), r.b(paramc, paramb.h));
        break;
      case 10: 
        paramc = r.a(paramc, paramb.g);
        j = paramb.k;
        paramc = a(paramc).h();
        b.f.b.j.a(paramc, "resolveClass(classId).defaultType");
        paramc = b.i.b.a.c.l.c.a.g((b.i.b.a.c.l.w)paramc);
        while (i < j)
        {
          paramc = a().a(ba.a, paramc);
          b.f.b.j.a(paramc, "builtIns.getArrayType(Variance.INVARIANT, type)");
          paramc = (b.i.b.a.c.l.w)paramc;
          i += 1;
        }
        localObject1 = b.i.b.a.c.f.a.a(b.i.b.a.c.a.g.k.ac.b());
        b.f.b.j.a(localObject1, "ClassId.topLevel(KotlinB…FQ_NAMES.kClass.toSafe())");
        localObject1 = a((b.i.b.a.c.f.a)localObject1);
        localObject2 = b.i.b.a.c.b.a.g.a;
        paramc = (b.i.b.a.c.i.b.f)new o((b.i.b.a.c.l.w)x.a(b.i.b.a.c.b.a.g.a.a(), (b.i.b.a.c.b.e)localObject1, b.a.j.a(new ar(paramc))));
        break;
      case 9: 
        label716:
        paramc = new b.i.b.a.c.i.b.s(paramc.a(paramb.f));
      }
      for (;;)
      {
        paramc = (b.i.b.a.c.i.b.f)paramc;
        break;
        if (paramb.c != 0L) {
          bool1 = true;
        }
        paramc = new b.i.b.a.c.i.b.c(bool1);
        break label1274;
        paramc = new b.i.b.a.c.i.b.h(paramb.e);
        break label1274;
        paramc = new k(paramb.d);
        break label1274;
        long l = paramb.c;
        if (bool2)
        {
          paramc = new v(l);
        }
        else
        {
          paramc = new b.i.b.a.c.i.b.p(l);
          break label1274;
          i = (int)paramb.c;
          if (bool2)
          {
            paramc = new u(i);
            continue;
          }
          paramc = new b.i.b.a.c.i.b.l(i);
          continue;
          short s = (short)(int)paramb.c;
          if (bool2)
          {
            paramc = new b.i.b.a.c.i.b.w(s);
            continue;
          }
          paramc = new b.i.b.a.c.i.b.r(s);
          continue;
          paramc = new b.i.b.a.c.i.b.e((char)(int)paramb.c);
        }
        label1274:
        paramc = (b.i.b.a.c.i.b.f)paramc;
        break;
        byte b1 = (byte)(int)paramb.c;
        if (bool2) {
          paramc = new t(b1);
        } else {
          paramc = new b.i.b.a.c.i.b.d(b1);
        }
      }
      if (b.i.b.a.c.l.c.a.a(paramc.a(this.a), paramw)) {
        return paramc;
      }
      localObject1 = b.i.b.a.c.i.b.j.a;
      localObject1 = new StringBuilder("Unexpected argument value: type ");
      ((StringBuilder)localObject1).append(paramc.a(this.a));
      ((StringBuilder)localObject1).append(" is not a subtype of ");
      ((StringBuilder)localObject1).append(paramw);
      ((StringBuilder)localObject1).append(" (value.type = ");
      ((StringBuilder)localObject1).append(paramb.b);
      ((StringBuilder)localObject1).append(')');
      return (b.i.b.a.c.i.b.f)j.a.a(((StringBuilder)localObject1).toString());
    }
    paramc = new StringBuilder("Unsupported annotation argument type: ");
    paramc.append(paramb.b);
    paramc.append(" (expected ");
    paramc.append(paramw);
    paramc.append(')');
    throw ((Throwable)new IllegalStateException(paramc.toString().toString()));
  }
  
  private final m<b.i.b.a.c.f.f, b.i.b.a.c.i.b.f<?>> a(a.a.a parama, Map<b.i.b.a.c.f.f, ? extends au> paramMap, b.i.b.a.c.e.a.c paramc)
  {
    Object localObject = (au)paramMap.get(r.b(paramc, parama.b));
    if (localObject == null) {
      return null;
    }
    paramMap = r.b(paramc, parama.b);
    localObject = ((au)localObject).y();
    b.f.b.j.a(localObject, "parameter.type");
    parama = parama.c;
    b.f.b.j.a(parama, "proto.value");
    return new m(paramMap, a((b.i.b.a.c.l.w)localObject, parama, paramc));
  }
  
  public final b.i.b.a.c.b.a.c a(a.a parama, b.i.b.a.c.e.a.c paramc)
  {
    b.f.b.j.b(parama, "proto");
    b.f.b.j.b(paramc, "nameResolver");
    b.i.b.a.c.b.e locale = a(r.a(paramc, parama.b));
    Object localObject2 = ac.a();
    Object localObject1 = localObject2;
    if (parama.d() != 0)
    {
      Object localObject3 = (b.i.b.a.c.b.l)locale;
      localObject1 = localObject2;
      if (!b.i.b.a.c.l.p.a((b.i.b.a.c.b.l)localObject3))
      {
        localObject1 = localObject2;
        if (b.i.b.a.c.i.d.k((b.i.b.a.c.b.l)localObject3))
        {
          localObject1 = locale.f();
          b.f.b.j.a(localObject1, "annotationClass.constructors");
          localObject3 = (b.i.b.a.c.b.d)b.a.j.f((Iterable)localObject1);
          localObject1 = localObject2;
          if (localObject3 != null)
          {
            localObject1 = ((b.i.b.a.c.b.d)localObject3).k();
            b.f.b.j.a(localObject1, "constructor.valueParameters");
            localObject2 = (Iterable)localObject1;
            localObject1 = (Map)new LinkedHashMap(b.h.d.b(ac.a(b.a.j.a((Iterable)localObject2)), 16));
            localObject2 = ((Iterable)localObject2).iterator();
            while (((Iterator)localObject2).hasNext())
            {
              localObject3 = ((Iterator)localObject2).next();
              au localau = (au)localObject3;
              b.f.b.j.a(localau, "it");
              ((Map)localObject1).put(localau.i(), localObject3);
            }
            parama = parama.c;
            b.f.b.j.a(parama, "proto.argumentList");
            localObject2 = (Iterable)parama;
            parama = (Collection)new ArrayList();
            localObject2 = ((Iterable)localObject2).iterator();
            while (((Iterator)localObject2).hasNext())
            {
              localObject3 = (a.a.a)((Iterator)localObject2).next();
              b.f.b.j.a(localObject3, "it");
              localObject3 = a((a.a.a)localObject3, (Map)localObject1, paramc);
              if (localObject3 != null) {
                parama.add(localObject3);
              }
            }
            localObject1 = ac.a((Iterable)parama);
          }
        }
      }
    }
    return (b.i.b.a.c.b.a.c)new b.i.b.a.c.b.a.d((b.i.b.a.c.l.w)locale.h(), (Map)localObject1, am.b);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/j/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */