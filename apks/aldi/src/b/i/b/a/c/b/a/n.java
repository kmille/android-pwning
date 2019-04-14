package b.i.b.a.c.b.a;

import b.a.ac;
import b.a.j;
import b.m;
import b.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public enum n
{
  public static final a P;
  private static final HashMap<String, n> T;
  private static final Set<n> U;
  private static final Set<n> V = b.a.e.i(values());
  private static final Map<e, n> W = ac.a(new m[] { q.a(e.g, g), q.a(e.a, e), q.a(e.c, d), q.a(e.b, n), q.a(e.d, j), q.a(e.e, k), q.a(e.f, g), q.a(e.h, g), q.a(e.i, e) });
  private final String R;
  private final boolean S;
  
  static
  {
    Object localObject1 = new n("CLASS", 0, "class");
    a = (n)localObject1;
    Object localObject2 = new n("ANNOTATION_CLASS", 1, "annotation class");
    b = (n)localObject2;
    n localn1 = new n("TYPE_PARAMETER", 2, "type parameter", false);
    c = localn1;
    n localn2 = new n("PROPERTY", 3, "property");
    d = localn2;
    n localn3 = new n("FIELD", 4, "field");
    e = localn3;
    n localn4 = new n("LOCAL_VARIABLE", 5, "local variable");
    f = localn4;
    n localn5 = new n("VALUE_PARAMETER", 6, "value parameter");
    g = localn5;
    n localn6 = new n("CONSTRUCTOR", 7, "constructor");
    h = localn6;
    n localn7 = new n("FUNCTION", 8, "function");
    i = localn7;
    n localn8 = new n("PROPERTY_GETTER", 9, "getter");
    j = localn8;
    n localn9 = new n("PROPERTY_SETTER", 10, "setter");
    k = localn9;
    n localn10 = new n("TYPE", 11, "type usage", false);
    l = localn10;
    n localn11 = new n("EXPRESSION", 12, "expression", false);
    m = localn11;
    n localn12 = new n("FILE", 13, "file", false);
    n = localn12;
    n localn13 = new n("TYPEALIAS", 14, "typealias", false);
    o = localn13;
    n localn14 = new n("TYPE_PROJECTION", 15, "type projection", false);
    p = localn14;
    n localn15 = new n("STAR_PROJECTION", 16, "star projection", false);
    q = localn15;
    n localn16 = new n("PROPERTY_PARAMETER", 17, "property constructor parameter", false);
    r = localn16;
    n localn17 = new n("CLASS_ONLY", 18, "class", false);
    s = localn17;
    n localn18 = new n("OBJECT", 19, "object", false);
    t = localn18;
    n localn19 = new n("COMPANION_OBJECT", 20, "companion object", false);
    u = localn19;
    n localn20 = new n("INTERFACE", 21, "interface", false);
    v = localn20;
    n localn21 = new n("ENUM_CLASS", 22, "enum class", false);
    w = localn21;
    n localn22 = new n("ENUM_ENTRY", 23, "enum entry", false);
    x = localn22;
    n localn23 = new n("LOCAL_CLASS", 24, "local class", false);
    y = localn23;
    n localn24 = new n("LOCAL_FUNCTION", 25, "local function", false);
    z = localn24;
    n localn25 = new n("MEMBER_FUNCTION", 26, "member function", false);
    A = localn25;
    n localn26 = new n("TOP_LEVEL_FUNCTION", 27, "top level function", false);
    B = localn26;
    n localn27 = new n("MEMBER_PROPERTY", 28, "member property", false);
    C = localn27;
    n localn28 = new n("MEMBER_PROPERTY_WITH_BACKING_FIELD", 29, "member property with backing field", false);
    D = localn28;
    n localn29 = new n("MEMBER_PROPERTY_WITH_DELEGATE", 30, "member property with delegate", false);
    E = localn29;
    n localn30 = new n("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 31, "member property without backing field or delegate", false);
    F = localn30;
    n localn31 = new n("TOP_LEVEL_PROPERTY", 32, "top level property", false);
    G = localn31;
    n localn32 = new n("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 33, "top level property with backing field", false);
    H = localn32;
    n localn33 = new n("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 34, "top level property with delegate", false);
    I = localn33;
    n localn34 = new n("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 35, "top level property without backing field or delegate", false);
    J = localn34;
    n localn35 = new n("INITIALIZER", 36, "initializer", false);
    K = localn35;
    n localn36 = new n("DESTRUCTURING_DECLARATION", 37, "destructuring declaration", false);
    L = localn36;
    n localn37 = new n("LAMBDA_EXPRESSION", 38, "lambda expression", false);
    M = localn37;
    n localn38 = new n("ANONYMOUS_FUNCTION", 39, "anonymous function", false);
    N = localn38;
    n localn39 = new n("OBJECT_LITERAL", 40, "object literal", false);
    O = localn39;
    Q = new n[] { localObject1, localObject2, localn1, localn2, localn3, localn4, localn5, localn6, localn7, localn8, localn9, localn10, localn11, localn12, localn13, localn14, localn15, localn16, localn17, localn18, localn19, localn20, localn21, localn22, localn23, localn24, localn25, localn26, localn27, localn28, localn29, localn30, localn31, localn32, localn33, localn34, localn35, localn36, localn37, localn38, localn39 };
    P = new a((byte)0);
    T = new HashMap();
    localObject1 = values();
    int i2 = localObject1.length;
    int i1 = 0;
    while (i1 < i2)
    {
      localObject2 = localObject1[i1];
      ((Map)T).put(((n)localObject2).name(), localObject2);
      i1 += 1;
    }
    localObject1 = values();
    localObject2 = (Collection)new ArrayList();
    i2 = localObject1.length;
    i1 = 0;
    while (i1 < i2)
    {
      localn1 = localObject1[i1];
      if (localn1.S) {
        ((Collection)localObject2).add(localn1);
      }
      i1 += 1;
    }
    U = j.k((Iterable)localObject2);
  }
  
  private n(String paramString, boolean paramBoolean)
  {
    this.R = paramString;
    this.S = paramBoolean;
  }
  
  public static final class a {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */