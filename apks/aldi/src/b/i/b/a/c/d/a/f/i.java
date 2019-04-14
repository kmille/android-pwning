package b.i.b.a.c.d.a.f;

import b.f.a.b;
import b.f.b.k;
import b.i.b.a.c.d.b.t;
import b.u;
import java.util.Map;

public final class i
{
  private static final d a = new d(g.a, null, false);
  private static final d b = new d(g.b, null, false);
  private static final d c = new d(g.b, null, true);
  private static final Map<String, j> d;
  
  static
  {
    t localt = t.a;
    final String str1 = t.a("Object");
    final String str2 = t.c("Predicate");
    final String str3 = t.c("Function");
    final String str4 = t.c("Consumer");
    final String str5 = t.c("BiFunction");
    final String str6 = t.c("BiConsumer");
    final String str7 = t.c("UnaryOperator");
    final String str8 = t.b("stream/Stream");
    final String str9 = t.b("Optional");
    m localm = new m();
    new m.a(localm, t.b("Iterator")).a("forEachRemaining", (b)new a(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    new m.a(localm, t.a("Iterable")).a("spliterator", (b)new l(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    m.a locala = new m.a(localm, t.b("Collection"));
    locala.a("removeIf", (b)new v(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.a("stream", (b)new w(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.a("parallelStream", (b)new x(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    new m.a(localm, t.b("List")).a("replaceAll", (b)new y(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala = new m.a(localm, t.b("Map"));
    locala.a("forEach", (b)new z(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.a("putIfAbsent", (b)new aa(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.a("replace", (b)new ab(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.a("replace", (b)new b(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.a("replaceAll", (b)new c(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.a("compute", (b)new d(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.a("computeIfAbsent", (b)new e(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.a("computeIfPresent", (b)new f(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.a("merge", (b)new g(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala = new m.a(localm, str9);
    locala.a("empty", (b)new h(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.a("of", (b)new i(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.a("ofNullable", (b)new j(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.a("get", (b)new k(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.a("ifPresent", (b)new m(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    new m.a(localm, t.a("ref/Reference")).a("get", (b)new n(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    new m.a(localm, str2).a("test", (b)new o(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    new m.a(localm, t.c("BiPredicate")).a("test", (b)new p(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    new m.a(localm, str4).a("accept", (b)new q(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    new m.a(localm, str6).a("accept", (b)new r(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    new m.a(localm, str3).a("apply", (b)new s(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    new m.a(localm, str5).a("apply", (b)new t(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    new m.a(localm, t.c("Supplier")).a("get", (b)new u(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    d = localm.a;
  }
  
  public static final Map<String, j> a()
  {
    return d;
  }
  
  static final class a
    extends k
    implements b<m.a.a, u>
  {
    a(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class aa
    extends k
    implements b<m.a.a, u>
  {
    aa(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class ab
    extends k
    implements b<m.a.a, u>
  {
    ab(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class b
    extends k
    implements b<m.a.a, u>
  {
    b(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class c
    extends k
    implements b<m.a.a, u>
  {
    c(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class d
    extends k
    implements b<m.a.a, u>
  {
    d(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class e
    extends k
    implements b<m.a.a, u>
  {
    e(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class f
    extends k
    implements b<m.a.a, u>
  {
    f(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class g
    extends k
    implements b<m.a.a, u>
  {
    g(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class h
    extends k
    implements b<m.a.a, u>
  {
    h(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class i
    extends k
    implements b<m.a.a, u>
  {
    i(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class j
    extends k
    implements b<m.a.a, u>
  {
    j(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class k
    extends k
    implements b<m.a.a, u>
  {
    k(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class l
    extends k
    implements b<m.a.a, u>
  {
    l(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class m
    extends k
    implements b<m.a.a, u>
  {
    m(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class n
    extends k
    implements b<m.a.a, u>
  {
    n(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class o
    extends k
    implements b<m.a.a, u>
  {
    o(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class p
    extends k
    implements b<m.a.a, u>
  {
    p(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class q
    extends k
    implements b<m.a.a, u>
  {
    q(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class r
    extends k
    implements b<m.a.a, u>
  {
    r(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class s
    extends k
    implements b<m.a.a, u>
  {
    s(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class t
    extends k
    implements b<m.a.a, u>
  {
    t(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class u
    extends k
    implements b<m.a.a, u>
  {
    u(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class v
    extends k
    implements b<m.a.a, u>
  {
    v(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class w
    extends k
    implements b<m.a.a, u>
  {
    w(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class x
    extends k
    implements b<m.a.a, u>
  {
    x(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class y
    extends k
    implements b<m.a.a, u>
  {
    y(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
  
  static final class z
    extends k
    implements b<m.a.a, u>
  {
    z(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/f/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */