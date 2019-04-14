package b.i.b.a.c.e.b.a;

import b.f.a.m;
import b.f.b.k;
import b.h.a;
import b.h.a.a;
import b.k.l;
import b.u;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class c
{
  public static final c a = new c();
  private static final Map<String, String> b;
  
  static
  {
    Map localMap = (Map)new LinkedHashMap();
    Object localObject1 = b.a.j.b(new String[] { "Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D" });
    Object localObject2 = (a)b.a.j.a((Collection)localObject1);
    b.f.b.j.b(localObject2, "receiver$0");
    b.f.b.j.b((Number)Integer.valueOf(2), "step");
    Object localObject3 = a.d;
    int j = ((a)localObject2).a;
    int k = ((a)localObject2).b;
    if (((a)localObject2).c > 0) {
      i = 2;
    } else {
      i = -2;
    }
    localObject2 = a.a.a(j, k, i);
    int i = ((a)localObject2).a;
    j = ((a)localObject2).b;
    k = ((a)localObject2).c;
    if (k > 0 ? i <= j : i >= j) {
      for (;;)
      {
        localObject2 = new StringBuilder("kotlin/");
        ((StringBuilder)localObject2).append((String)((List)localObject1).get(i));
        localObject2 = ((StringBuilder)localObject2).toString();
        int m = i + 1;
        localMap.put(localObject2, ((List)localObject1).get(m));
        localObject2 = new StringBuilder("kotlin/");
        ((StringBuilder)localObject2).append((String)((List)localObject1).get(i));
        ((StringBuilder)localObject2).append("Array");
        localObject2 = ((StringBuilder)localObject2).toString();
        localObject3 = new StringBuilder("[");
        ((StringBuilder)localObject3).append((String)((List)localObject1).get(m));
        localMap.put(localObject2, ((StringBuilder)localObject3).toString());
        if (i == j) {
          break;
        }
        i += k;
      }
    }
    localMap.put("kotlin/Unit", "V");
    localObject1 = new a(localMap);
    ((a)localObject1).a("Any", "java/lang/Object");
    ((a)localObject1).a("Nothing", "java/lang/Void");
    ((a)localObject1).a("Annotation", "java/lang/annotation/Annotation");
    localObject2 = b.a.j.b(new String[] { "String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum" }).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (String)((Iterator)localObject2).next();
      ((a)localObject1).a((String)localObject3, "java/lang/".concat(String.valueOf(localObject3)));
    }
    localObject2 = b.a.j.b(new String[] { "Iterator", "Collection", "List", "Set", "Map", "ListIterator" }).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (String)((Iterator)localObject2).next();
      ((a)localObject1).a("collections/".concat(String.valueOf(localObject3)), "java/util/".concat(String.valueOf(localObject3)));
      ((a)localObject1).a("collections/Mutable".concat(String.valueOf(localObject3)), "java/util/".concat(String.valueOf(localObject3)));
    }
    ((a)localObject1).a("collections/Iterable", "java/lang/Iterable");
    ((a)localObject1).a("collections/MutableIterable", "java/lang/Iterable");
    ((a)localObject1).a("collections/Map.Entry", "java/util/Map$Entry");
    ((a)localObject1).a("collections/MutableMap.MutableEntry", "java/util/Map$Entry");
    i = 0;
    while (i <= 22)
    {
      ((a)localObject1).a("Function".concat(String.valueOf(i)), "kotlin/jvm/functions/Function".concat(String.valueOf(i)));
      ((a)localObject1).a("reflect/KFunction".concat(String.valueOf(i)), "kotlin/reflect/KFunction");
      i += 1;
    }
    localObject2 = b.a.j.b(new String[] { "Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum" }).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (String)((Iterator)localObject2).next();
      Object localObject4 = new StringBuilder();
      ((StringBuilder)localObject4).append((String)localObject3);
      ((StringBuilder)localObject4).append(".Companion");
      localObject4 = ((StringBuilder)localObject4).toString();
      StringBuilder localStringBuilder = new StringBuilder("kotlin/jvm/internal/");
      localStringBuilder.append((String)localObject3);
      localStringBuilder.append("CompanionObject");
      ((a)localObject1).a((String)localObject4, localStringBuilder.toString());
    }
    b = localMap;
  }
  
  public static final String a(String paramString)
  {
    b.f.b.j.b(paramString, "classId");
    String str = (String)b.get(paramString);
    Object localObject = str;
    if (str == null)
    {
      localObject = new StringBuilder("L");
      ((StringBuilder)localObject).append(l.a(paramString, '.', '$'));
      ((StringBuilder)localObject).append(';');
      localObject = ((StringBuilder)localObject).toString();
    }
    return (String)localObject;
  }
  
  static final class a
    extends k
    implements m<String, String, u>
  {
    a(Map paramMap)
    {
      super();
    }
    
    public final void a(String paramString1, String paramString2)
    {
      b.f.b.j.b(paramString1, "kotlinSimpleName");
      b.f.b.j.b(paramString2, "javaInternalName");
      Map localMap = this.a;
      paramString1 = "kotlin/".concat(String.valueOf(paramString1));
      StringBuilder localStringBuilder = new StringBuilder("L");
      localStringBuilder.append(paramString2);
      localStringBuilder.append(';');
      localMap.put(paramString1, localStringBuilder.toString());
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/e/b/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */