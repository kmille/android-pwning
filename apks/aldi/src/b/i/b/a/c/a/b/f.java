package b.i.b.a.c.a.b;

import b.a.ai;
import b.a.v;
import b.f.a.m;
import b.f.b.u.a;
import b.i.b.a.c.a.g.a;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ay;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.q;
import b.i.b.a.c.b.t.a;
import b.i.b.a.c.b.y;
import b.i.b.a.c.e.a.c;
import b.i.b.a.c.e.a.o;
import b.i.b.a.c.i.e.h.b;
import b.i.b.a.c.i.j.a.a;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ao;
import b.i.b.a.c.l.z;
import b.i.b.a.c.n.b.b;
import b.i.b.a.c.n.b.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class f
  implements b.i.b.a.c.b.b.a, b.i.b.a.c.b.b.c
{
  public static final a b = new a((byte)0);
  private static final Set<String> k;
  private static final Set<String> l;
  private static final Set<String> m;
  private static final Set<String> n;
  private static final Set<String> o;
  private static final Set<String> p;
  private final c c;
  private final b.d d;
  private final b.d e;
  private final b.i.b.a.c.l.w f;
  private final b.i.b.a.c.k.f g;
  private final b.i.b.a.c.k.a<b.i.b.a.c.f.b, b.i.b.a.c.b.e> h;
  private final b.i.b.a.c.k.f i;
  private final y j;
  
  static
  {
    Object localObject1 = b.i.b.a.c.d.b.t.a;
    k = ai.a((Set)b.i.b.a.c.d.b.t.b("Collection", new String[] { "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;" }), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
    localObject1 = b.i.b.a.c.d.b.t.a;
    localObject1 = b.i.b.a.c.d.b.t.a;
    Object localObject2 = (Iterable)b.a.j.b(new b.i.b.a.c.i.d.c[] { b.i.b.a.c.i.d.c.a, b.i.b.a.c.i.d.c.b });
    localObject1 = (Collection)new LinkedHashSet();
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      b.i.b.a.c.i.d.c localc = (b.i.b.a.c.i.d.c)((Iterator)localObject2).next();
      String str = localc.l.b.d().a;
      b.f.b.j.a(str, "it.wrapperFqName.shortName().asString()");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(localc.j);
      localStringBuilder.append("Value()");
      localStringBuilder.append(localc.k);
      b.a.j.a((Collection)localObject1, (Iterable)b.i.b.a.c.d.b.t.a(str, new String[] { localStringBuilder.toString() }));
    }
    l = ai.a(ai.a(ai.a(ai.a(ai.a((Set)localObject1, (Iterable)b.i.b.a.c.d.b.t.b("List", new String[] { "sort(Ljava/util/Comparator;)V" })), (Iterable)b.i.b.a.c.d.b.t.a("String", new String[] { "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;" })), (Iterable)b.i.b.a.c.d.b.t.a("Double", new String[] { "isInfinite()Z", "isNaN()Z" })), (Iterable)b.i.b.a.c.d.b.t.a("Float", new String[] { "isInfinite()Z", "isNaN()Z" })), (Iterable)b.i.b.a.c.d.b.t.a("Enum", new String[] { "getDeclaringClass()Ljava/lang/Class;", "finalize()V" }));
    localObject1 = b.i.b.a.c.d.b.t.a;
    m = ai.a(ai.a(ai.a(ai.a(ai.a(ai.a((Set)b.i.b.a.c.d.b.t.a("CharSequence", new String[] { "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;" }), (Iterable)b.i.b.a.c.d.b.t.b("Iterator", new String[] { "forEachRemaining(Ljava/util/function/Consumer;)V" })), (Iterable)b.i.b.a.c.d.b.t.a("Iterable", new String[] { "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;" })), (Iterable)b.i.b.a.c.d.b.t.a("Throwable", new String[] { "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V" })), (Iterable)b.i.b.a.c.d.b.t.b("Collection", new String[] { "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z" })), (Iterable)b.i.b.a.c.d.b.t.b("List", new String[] { "replaceAll(Ljava/util/function/UnaryOperator;)V" })), (Iterable)b.i.b.a.c.d.b.t.b("Map", new String[] { "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;" }));
    localObject1 = b.i.b.a.c.d.b.t.a;
    n = ai.a(ai.a((Set)b.i.b.a.c.d.b.t.b("Collection", new String[] { "removeIf(Ljava/util/function/Predicate;)Z" }), (Iterable)b.i.b.a.c.d.b.t.b("List", new String[] { "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V" })), (Iterable)b.i.b.a.c.d.b.t.b("Map", new String[] { "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z" }));
    localObject1 = b.i.b.a.c.d.b.t.a;
    localObject1 = a.a();
    localObject2 = b.i.b.a.c.d.b.t.a(new String[] { "D" });
    localObject1 = ai.a((Set)localObject1, (Iterable)b.i.b.a.c.d.b.t.a("Float", (String[])Arrays.copyOf((Object[])localObject2, localObject2.length)));
    localObject2 = b.i.b.a.c.d.b.t.a(new String[] { "[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;" });
    o = ai.a((Set)localObject1, (Iterable)b.i.b.a.c.d.b.t.a("String", (String[])Arrays.copyOf((Object[])localObject2, localObject2.length)));
    localObject1 = b.i.b.a.c.d.b.t.a;
    localObject1 = b.i.b.a.c.d.b.t.a(new String[] { "Ljava/lang/String;Ljava/lang/Throwable;ZZ" });
    p = (Set)b.i.b.a.c.d.b.t.a("Throwable", (String[])Arrays.copyOf((Object[])localObject1, localObject1.length));
  }
  
  public f(y paramy, final b.i.b.a.c.k.i parami, b.f.a.a<? extends y> parama, b.f.a.a<Boolean> parama1)
  {
    this.j = paramy;
    this.c = c.b;
    this.d = b.e.a(parama);
    this.e = b.e.a(parama1);
    paramy = new d(this, this.j, new b.i.b.a.c.f.b("java.io"));
    parama = b.a.j.a(new z(parami, (b.f.a.a)new e(this)));
    paramy = new b.i.b.a.c.b.c.h((l)paramy, b.i.b.a.c.f.f.a("Serializable"), b.i.b.a.c.b.w.d, b.i.b.a.c.b.f.b, (Collection)parama, am.b, parami);
    paramy.a((b.i.b.a.c.i.e.h)h.b.a, (Set)b.a.x.a, null);
    paramy = paramy.h();
    b.f.b.j.a(paramy, "mockSerializableClass.defaultType");
    this.f = ((b.i.b.a.c.l.w)paramy);
    this.g = parami.a((b.f.a.a)new c(this, parami));
    this.h = parami.b();
    this.i = parami.a((b.f.a.a)new m(this));
  }
  
  private final y d()
  {
    return (y)this.d.a();
  }
  
  private final b.i.b.a.c.d.a.c.a.f d(b.i.b.a.c.b.e parame)
  {
    if (b.i.b.a.c.a.g.d(parame)) {
      return null;
    }
    parame = (l)parame;
    if (!b.i.b.a.c.a.g.b(parame)) {
      return null;
    }
    parame = b.i.b.a.c.i.c.a.a(parame);
    if (!parame.a()) {
      return null;
    }
    parame = c.a(parame);
    if (parame != null)
    {
      parame = parame.d();
      if (parame == null) {
        return null;
      }
      b.f.b.j.a(parame, "j2kClassMap.mapKotlinToJ…leFqName() ?: return null");
      b.i.b.a.c.b.e locale = q.a(d(), parame, (b.i.b.a.c.c.a.a)b.i.b.a.c.c.a.c.d);
      parame = locale;
      if (!(locale instanceof b.i.b.a.c.d.a.c.a.f)) {
        parame = null;
      }
      return (b.i.b.a.c.d.a.c.a.f)parame;
    }
    return null;
  }
  
  private final boolean e()
  {
    return ((Boolean)this.e.a()).booleanValue();
  }
  
  private final ad f()
  {
    return (ad)b.i.b.a.c.k.h.a(this.g, a[2]);
  }
  
  private final b.i.b.a.c.b.a.g g()
  {
    return (b.i.b.a.c.b.a.g)b.i.b.a.c.k.h.a(this.i, a[3]);
  }
  
  public final Collection<b.i.b.a.c.l.w> a(b.i.b.a.c.b.e parame)
  {
    b.f.b.j.b(parame, "classDescriptor");
    parame = b.i.b.a.c.i.c.a.a((l)parame);
    if (a.b(parame))
    {
      parame = f();
      b.f.b.j.a(parame, "cloneableType");
      parame = b.a.j.b(new b.i.b.a.c.l.w[] { (b.i.b.a.c.l.w)parame, this.f });
    }
    for (;;)
    {
      return (Collection)parame;
      if (a.a(parame)) {
        parame = b.a.j.a(this.f);
      } else {
        parame = (List)v.a;
      }
    }
  }
  
  public final Collection<al> a(b.i.b.a.c.f.f paramf, b.i.b.a.c.b.e parame)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parame, "classDescriptor");
    Object localObject1 = a.a;
    boolean bool1 = b.f.b.j.a(paramf, a.b());
    int i1 = 1;
    if ((bool1) && ((parame instanceof b.i.b.a.c.j.a.a.d)) && (b.i.b.a.c.a.g.a(parame)))
    {
      parame = (b.i.b.a.c.j.a.a.d)parame;
      localObject1 = parame.g.j;
      b.f.b.j.a(localObject1, "classDescriptor.classProto.functionList");
      localObject1 = (Iterable)localObject1;
      if ((!(localObject1 instanceof Collection)) || (!((Collection)localObject1).isEmpty()))
      {
        localObject1 = ((Iterable)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (a.o)((Iterator)localObject1).next();
          localObject3 = parame.a.d;
          b.f.b.j.a(localObject2, "functionProto");
          localObject2 = b.i.b.a.c.j.a.r.b((b.i.b.a.c.e.a.c)localObject3, ((a.o)localObject2).d);
          localObject3 = a.a;
          if (b.f.b.j.a(localObject2, a.b())) {
            break label180;
          }
        }
      }
      i1 = 0;
      label180:
      if (i1 == 0) {}
    }
    while (!e()) {
      for (paramf = (List)v.a;; paramf = b.a.j.a((al)paramf))
      {
        return (Collection)paramf;
        paramf = ((al)b.a.j.e((Iterable)f().b().b(paramf, (b.i.b.a.c.c.a.a)b.i.b.a.c.c.a.c.d))).D();
        paramf.a((l)parame);
        paramf.a(ay.e);
        paramf.a((b.i.b.a.c.l.w)parame.h());
        paramf.b(parame.w());
        paramf = paramf.f();
        if (paramf == null) {
          b.f.b.j.a();
        }
      }
    }
    localObject1 = (b.f.a.b)new h(paramf);
    Object localObject2 = d(parame);
    if (localObject2 == null) {}
    final Object localObject5;
    do
    {
      paramf = (Collection)v.a;
      break;
      localObject3 = (l)localObject2;
      localObject4 = b.i.b.a.c.i.c.a.b((l)localObject3);
      paramf = b.a;
      paramf = b.a().a();
      b.f.b.j.b(localObject4, "fqName");
      b.f.b.j.b(paramf, "builtIns");
      localObject4 = c.a((b.i.b.a.c.f.b)localObject4, paramf);
      if (localObject4 == null) {
        paramf = (Set)b.a.x.a;
      }
      for (;;)
      {
        paramf = (Collection)paramf;
        break;
        localObject5 = (b.i.b.a.c.f.b)c.a.get(b.i.b.a.c.i.c.a.a((l)localObject4));
        if (localObject5 == null)
        {
          paramf = ai.a(localObject4);
        }
        else
        {
          b.f.b.j.a(localObject5, "readOnlyToMutable[kotlin…eturn setOf(kotlinAnalog)");
          paramf = Arrays.asList(new b.i.b.a.c.b.e[] { localObject4, paramf.a((b.i.b.a.c.f.b)localObject5) });
          b.f.b.j.a(paramf, "Arrays.asList(kotlinAnal…tlinMutableAnalogFqName))");
        }
      }
      localObject4 = (Iterable)paramf;
      b.f.b.j.b(localObject4, "receiver$0");
      if ((localObject4 instanceof List))
      {
        paramf = (List)localObject4;
        if (!paramf.isEmpty()) {}
      }
      do
      {
        paramf = null;
        break;
        paramf = paramf.get(paramf.size() - 1);
        break;
        localObject5 = ((Iterable)localObject4).iterator();
      } while (!((Iterator)localObject5).hasNext());
      do
      {
        paramf = ((Iterator)localObject5).next();
      } while (((Iterator)localObject5).hasNext());
      localObject5 = (b.i.b.a.c.b.e)paramf;
    } while (localObject5 == null);
    paramf = b.i.b.a.c.n.i.a;
    paramf = (Collection)new ArrayList(b.a.j.a((Iterable)localObject4));
    Object localObject4 = ((Iterable)localObject4).iterator();
    while (((Iterator)localObject4).hasNext()) {
      paramf.add(b.i.b.a.c.i.c.a.b((l)((Iterator)localObject4).next()));
    }
    localObject4 = (Collection)paramf;
    b.f.b.j.b(localObject4, "set");
    paramf = new b.i.b.a.c.n.i((byte)0);
    paramf.addAll((Collection)localObject4);
    boolean bool2 = c.a(parame);
    localObject2 = ((b.i.b.a.c.b.e)this.h.a(b.i.b.a.c.i.c.a.b((l)localObject3), (b.f.a.a)new f((b.i.b.a.c.d.a.c.a.f)localObject2, (b.i.b.a.c.b.e)localObject5))).d();
    b.f.b.j.a(localObject2, "fakeJavaClassDescriptor.unsubstitutedMemberScope");
    localObject2 = (Iterable)((b.f.a.b)localObject1).a(localObject2);
    localObject1 = (Collection)new ArrayList();
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = ((Iterator)localObject2).next();
      localObject4 = (al)localObject3;
      if ((((al)localObject4).t() == b.i.b.a.c.b.b.a.a) && (((al)localObject4).j().a) && (!b.i.b.a.c.a.g.e((l)localObject4)))
      {
        localObject5 = ((al)localObject4).m();
        b.f.b.j.a(localObject5, "analogueMember.overriddenDescriptors");
        localObject5 = (Iterable)localObject5;
        Object localObject6;
        if ((!(localObject5 instanceof Collection)) || (!((Collection)localObject5).isEmpty()))
        {
          localObject5 = ((Iterable)localObject5).iterator();
          while (((Iterator)localObject5).hasNext())
          {
            localObject6 = (b.i.b.a.c.b.t)((Iterator)localObject5).next();
            b.f.b.j.a(localObject6, "it");
            localObject6 = ((b.i.b.a.c.b.t)localObject6).a();
            b.f.b.j.a(localObject6, "it.containingDeclaration");
            if (paramf.contains(b.i.b.a.c.i.c.a.b((l)localObject6)))
            {
              i1 = 1;
              break label972;
            }
          }
        }
        i1 = 0;
        label972:
        if (i1 == 0)
        {
          localObject5 = ((al)localObject4).a();
          if (localObject5 != null)
          {
            localObject5 = (b.i.b.a.c.b.e)localObject5;
            localObject6 = b.i.b.a.c.d.b.r.a((b.i.b.a.c.b.t)localObject4, false, false, 3);
            Set localSet = n;
            b.i.b.a.c.d.b.t localt = b.i.b.a.c.d.b.t.a;
            if ((localSet.contains(b.i.b.a.c.d.b.t.a((b.i.b.a.c.b.e)localObject5, (String)localObject6)) ^ bool2))
            {
              bool1 = true;
            }
            else
            {
              localObject4 = b.i.b.a.c.n.b.a((Collection)b.a.j.a(localObject4), (b.b)k.a, (b.f.a.b)new l(this));
              b.f.b.j.a(localObject4, "DFS.ifAny<CallableMember…lassDescriptor)\n        }");
              bool1 = ((Boolean)localObject4).booleanValue();
            }
            if (!bool1)
            {
              i1 = 1;
              break label1114;
            }
          }
          else
          {
            throw new b.r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
          }
        }
      }
      i1 = 0;
      label1114:
      if (i1 != 0) {
        ((Collection)localObject1).add(localObject3);
      }
    }
    paramf = (Collection)localObject1;
    paramf = (Iterable)paramf;
    localObject2 = (Collection)new ArrayList();
    Object localObject3 = paramf.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      paramf = (al)((Iterator)localObject3).next();
      localObject1 = paramf.a();
      if (localObject1 != null)
      {
        localObject1 = paramf.c(h.a((b.i.b.a.c.b.e)localObject1, parame).d());
        if (localObject1 != null)
        {
          localObject4 = ((al)localObject1).D();
          ((t.a)localObject4).a((l)parame);
          ((t.a)localObject4).b(parame.w());
          ((t.a)localObject4).b();
          localObject1 = (b.i.b.a.c.b.t)paramf;
          paramf = ((b.i.b.a.c.b.t)localObject1).a();
          if (paramf != null)
          {
            paramf = (b.i.b.a.c.b.e)paramf;
            localObject1 = b.i.b.a.c.d.b.r.a((b.i.b.a.c.b.t)localObject1, false, false, 3);
            localObject5 = new u.a();
            ((u.a)localObject5).a = null;
            paramf = b.i.b.a.c.n.b.a((Collection)b.a.j.a(paramf), (b.b)new i(this), (b.c)new j((String)localObject1, (u.a)localObject5));
            b.f.b.j.a(paramf, "DFS.dfs<ClassDescriptor,…CONSIDERED\n            })");
            paramf = (b)paramf;
            switch (g.a[paramf.ordinal()])
            {
            default: 
              break;
            case 3: 
              paramf = null;
              break;
            case 2: 
              paramf = ((t.a)localObject4).a(g());
            case 1: 
              for (localObject1 = "setAdditionalAnnotations(notConsideredDeprecation)";; localObject1 = "setHiddenForResolutionEverywhereBesideSupercalls()")
              {
                b.f.b.j.a(paramf, (String)localObject1);
                break label1460;
                if (b.i.b.a.c.b.x.a(parame)) {
                  break;
                }
                paramf = ((t.a)localObject4).e();
              }
            }
            label1460:
            paramf = ((t.a)localObject4).f();
            if (paramf == null) {
              b.f.b.j.a();
            }
            paramf = (al)paramf;
            if (paramf != null) {
              ((Collection)localObject2).add(paramf);
            }
          }
          else
          {
            throw new b.r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
          }
        }
        else
        {
          throw new b.r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
        }
      }
      else
      {
        throw new b.r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
      }
    }
    return (Collection)localObject2;
  }
  
  public final boolean a(b.i.b.a.c.b.e parame, al paramal)
  {
    b.f.b.j.b(parame, "classDescriptor");
    b.f.b.j.b(paramal, "functionDescriptor");
    Object localObject = d(parame);
    if (localObject == null) {
      return true;
    }
    if (!paramal.r().b(b.i.b.a.c.b.b.d.a())) {
      return true;
    }
    if (!e()) {
      return false;
    }
    parame = b.i.b.a.c.d.b.r.a((b.i.b.a.c.b.t)paramal, false, false, 3);
    localObject = ((b.i.b.a.c.d.a.c.a.f)localObject).c;
    paramal = paramal.i();
    b.f.b.j.a(paramal, "functionDescriptor.name");
    paramal = (Iterable)((b.i.b.a.c.d.a.c.a.g)localObject).b(paramal, (b.i.b.a.c.c.a.a)b.i.b.a.c.c.a.c.d);
    if ((!(paramal instanceof Collection)) || (!((Collection)paramal).isEmpty()))
    {
      paramal = paramal.iterator();
      while (paramal.hasNext()) {
        if (b.f.b.j.a(b.i.b.a.c.d.b.r.a((b.i.b.a.c.b.t)paramal.next(), false, false, 3), parame)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final Collection<b.i.b.a.c.b.d> c(b.i.b.a.c.b.e parame)
  {
    b.f.b.j.b(parame, "classDescriptor");
    if ((parame.g() == b.i.b.a.c.b.f.a) && (e()))
    {
      localObject1 = d(parame);
      if (localObject1 != null) {
        break label51;
      }
    }
    label51:
    do
    {
      return (Collection)v.a;
      localObject2 = b.i.b.a.c.i.c.a.b((l)localObject1);
      localObject3 = b.a;
      localObject4 = c.a((b.i.b.a.c.f.b)localObject2, b.a().a());
    } while (localObject4 == null);
    Object localObject2 = (b.i.b.a.c.b.e)localObject1;
    Object localObject3 = h.a((b.i.b.a.c.b.e)localObject4, (b.i.b.a.c.b.e)localObject2).d();
    Object localObject5 = new g((b.i.b.a.c.l.au)localObject3);
    Object localObject1 = (Iterable)((b.i.b.a.c.d.a.c.a.f)localObject1).y();
    Object localObject6 = (Collection)new ArrayList();
    Object localObject7 = ((Iterable)localObject1).iterator();
    Object localObject8;
    for (;;)
    {
      boolean bool = ((Iterator)localObject7).hasNext();
      int i3 = 0;
      if (!bool) {
        break;
      }
      localObject8 = ((Iterator)localObject7).next();
      b.i.b.a.c.b.d locald = (b.i.b.a.c.b.d)localObject8;
      b.f.b.j.a(locald, "javaConstructor");
      int i1 = i3;
      if (locald.j().a)
      {
        localObject1 = ((b.i.b.a.c.b.e)localObject4).f();
        b.f.b.j.a(localObject1, "defaultKotlinVersion.constructors");
        localObject1 = (Iterable)localObject1;
        Object localObject9;
        if ((!(localObject1 instanceof Collection)) || (!((Collection)localObject1).isEmpty()))
        {
          localObject1 = ((Iterable)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject9 = (b.i.b.a.c.b.d)((Iterator)localObject1).next();
            b.f.b.j.a(localObject9, "it");
            if (((g)localObject5).a((b.i.b.a.c.b.k)localObject9, (b.i.b.a.c.b.k)locald))
            {
              i2 = 0;
              break label314;
            }
          }
        }
        int i2 = 1;
        label314:
        i1 = i3;
        if (i2 != 0)
        {
          localObject1 = (b.i.b.a.c.b.k)locald;
          if (((b.i.b.a.c.b.k)localObject1).k().size() == 1)
          {
            localObject1 = ((b.i.b.a.c.b.k)localObject1).k();
            b.f.b.j.a(localObject1, "valueParameters");
            localObject1 = b.a.j.g((List)localObject1);
            b.f.b.j.a(localObject1, "valueParameters.single()");
            localObject1 = ((b.i.b.a.c.b.au)localObject1).y().f().c();
            if (localObject1 != null) {
              localObject1 = b.i.b.a.c.i.c.a.a((l)localObject1);
            } else {
              localObject1 = null;
            }
            if (b.f.b.j.a(localObject1, b.i.b.a.c.i.c.a.a((l)parame)))
            {
              i2 = 1;
              break label439;
            }
          }
          i2 = 0;
          label439:
          i1 = i3;
          if (i2 == 0)
          {
            i1 = i3;
            if (!b.i.b.a.c.a.g.e((l)locald))
            {
              localObject1 = o;
              localObject9 = b.i.b.a.c.d.b.t.a;
              i1 = i3;
              if (!((Set)localObject1).contains(b.i.b.a.c.d.b.t.a((b.i.b.a.c.b.e)localObject2, b.i.b.a.c.d.b.r.a((b.i.b.a.c.b.t)locald, false, false, 3)))) {
                i1 = 1;
              }
            }
          }
        }
      }
      if (i1 != 0) {
        ((Collection)localObject6).add(localObject8);
      }
    }
    Object localObject4 = (Iterable)localObject6;
    localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject4));
    localObject4 = ((Iterable)localObject4).iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject5 = (b.i.b.a.c.b.d)((Iterator)localObject4).next();
      localObject6 = ((b.i.b.a.c.b.d)localObject5).D();
      ((t.a)localObject6).a((l)parame);
      ((t.a)localObject6).a((b.i.b.a.c.l.w)parame.h());
      ((t.a)localObject6).b();
      ((t.a)localObject6).a(((b.i.b.a.c.l.au)localObject3).b);
      localObject7 = p;
      localObject8 = b.i.b.a.c.d.b.t.a;
      b.f.b.j.a(localObject5, "javaConstructor");
      if (!((Set)localObject7).contains(b.i.b.a.c.d.b.t.a((b.i.b.a.c.b.e)localObject2, b.i.b.a.c.d.b.r.a((b.i.b.a.c.b.t)localObject5, false, false, 3)))) {
        ((t.a)localObject6).a(g());
      }
      localObject5 = ((t.a)localObject6).f();
      if (localObject5 != null) {
        ((Collection)localObject1).add((b.i.b.a.c.b.d)localObject5);
      } else {
        throw new b.r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
      }
    }
    return (Collection)localObject1;
  }
  
  public static final class a
  {
    static Set<String> a()
    {
      Object localObject1 = b.i.b.a.c.d.b.t.a;
      Object localObject2 = (Iterable)b.a.j.b(new b.i.b.a.c.i.d.c[] { b.i.b.a.c.i.d.c.a, b.i.b.a.c.i.d.c.c, b.i.b.a.c.i.d.c.h, b.i.b.a.c.i.d.c.f, b.i.b.a.c.i.d.c.c, b.i.b.a.c.i.d.c.e, b.i.b.a.c.i.d.c.g, b.i.b.a.c.i.d.c.d });
      localObject1 = (Collection)new LinkedHashSet();
      localObject2 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        String str = ((b.i.b.a.c.i.d.c)((Iterator)localObject2).next()).l.b.d().a;
        b.f.b.j.a(str, "it.wrapperFqName.shortName().asString()");
        String[] arrayOfString = b.i.b.a.c.d.b.t.a(new String[] { "Ljava/lang/String;" });
        b.a.j.a((Collection)localObject1, (Iterable)b.i.b.a.c.d.b.t.a(str, (String[])Arrays.copyOf(arrayOfString, arrayOfString.length)));
      }
      return (Set)localObject1;
    }
    
    public static boolean a(b.i.b.a.c.f.c paramc)
    {
      b.f.b.j.b(paramc, "fqName");
      if (b(paramc)) {
        return true;
      }
      c localc = c.b;
      paramc = c.a(paramc);
      if (paramc == null) {
        return false;
      }
      try
      {
        paramc = Class.forName(paramc.d().b.a);
        return Serializable.class.isAssignableFrom(paramc);
      }
      catch (ClassNotFoundException paramc) {}
      return false;
    }
    
    static boolean b(b.i.b.a.c.f.c paramc)
    {
      return (b.f.b.j.a(paramc, b.i.b.a.c.a.g.k.h)) || (b.i.b.a.c.a.g.a(paramc));
    }
  }
  
  static enum b
  {
    static
    {
      b localb1 = new b("BLACK_LIST", 0);
      a = localb1;
      b localb2 = new b("WHITE_LIST", 1);
      b = localb2;
      b localb3 = new b("NOT_CONSIDERED", 2);
      c = localb3;
      b localb4 = new b("DROP", 3);
      d = localb4;
      e = new b[] { localb1, localb2, localb3, localb4 };
    }
    
    private b() {}
  }
  
  static final class c
    extends b.f.b.k
    implements b.f.a.a<ad>
  {
    c(f paramf, b.i.b.a.c.k.i parami)
    {
      super();
    }
  }
  
  public static final class d
    extends b.i.b.a.c.b.c.x
  {
    d(y paramy, b.i.b.a.c.f.b paramb)
    {
      super(localb);
    }
  }
  
  static final class e
    extends b.f.b.k
    implements b.f.a.a<ad>
  {
    e(f paramf)
    {
      super();
    }
  }
  
  static final class f
    extends b.f.b.k
    implements b.f.a.a<b.i.b.a.c.d.a.c.a.f>
  {
    f(b.i.b.a.c.d.a.c.a.f paramf, b.i.b.a.c.b.e parame)
    {
      super();
    }
  }
  
  static final class g
    extends b.f.b.k
    implements m<b.i.b.a.c.b.k, b.i.b.a.c.b.k, Boolean>
  {
    g(b.i.b.a.c.l.au paramau)
    {
      super();
    }
    
    public final boolean a(b.i.b.a.c.b.k paramk1, b.i.b.a.c.b.k paramk2)
    {
      b.f.b.j.b(paramk1, "receiver$0");
      b.f.b.j.b(paramk2, "javaConstructor");
      return b.i.b.a.c.i.j.b((b.i.b.a.c.b.a)paramk1, (b.i.b.a.c.b.a)paramk2.b(this.a)) == j.a.a.a;
    }
  }
  
  static final class h
    extends b.f.b.k
    implements b.f.a.b<b.i.b.a.c.i.e.h, Collection<? extends al>>
  {
    h(b.i.b.a.c.f.f paramf)
    {
      super();
    }
  }
  
  static final class i<N>
    implements b.b<N>
  {
    i(f paramf) {}
  }
  
  public static final class j
    extends b.i.b.a.c.n.b.a<b.i.b.a.c.b.e, f.b>
  {
    j(String paramString, u.a parama) {}
  }
  
  static final class k<N>
    implements b.b<N>
  {
    public static final k a = new k();
  }
  
  static final class l
    extends b.f.b.k
    implements b.f.a.b<b.i.b.a.c.b.b, Boolean>
  {
    l(f paramf)
    {
      super();
    }
  }
  
  static final class m
    extends b.f.b.k
    implements b.f.a.a<b.i.b.a.c.b.a.g>
  {
    m(f paramf)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/a/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */