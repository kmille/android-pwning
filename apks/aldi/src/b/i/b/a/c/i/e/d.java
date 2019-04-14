package b.i.b.a.c.i.e;

import b.r;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class d
{
  public static final d c;
  public static final d d;
  public static final d e;
  public static final d f;
  public static final d g;
  public static final d h;
  public static final d i;
  public static final d j;
  public static final d k;
  public static final d l;
  public static final a m = new a((byte)0);
  private static int n = 1;
  private static final int o = a.a();
  private static final int p = a.a();
  private static final int q = a.a();
  private static final int r = a.a();
  private static final int s = a.a();
  private static final int t = a.a();
  private static final int u = a.a() - 1;
  private static final int v = o | p | q;
  private static final int w = p | s | t;
  private static final int x = s | t;
  private static final List<d.a.a> y;
  private static final List<d.a.a> z;
  final int a;
  public final List<c> b;
  
  static
  {
    c = new d(u);
    d = new d(x);
    e = new d(o);
    f = new d(p);
    g = new d(q);
    h = new d(v);
    i = new d(r);
    j = new d(s);
    k = new d(t);
    l = new d(w);
    Object localObject1 = d.class.getFields();
    b.f.b.j.a(localObject1, "T::class.java.fields");
    Object localObject2 = (Collection)new ArrayList();
    int i2 = localObject1.length;
    int i1 = 0;
    while (i1 < i2)
    {
      localObject3 = localObject1[i1];
      b.f.b.j.a(localObject3, "it");
      if (Modifier.isStatic(((Field)localObject3).getModifiers())) {
        ((Collection)localObject2).add(localObject3);
      }
      i1 += 1;
    }
    localObject1 = (Iterable)localObject2;
    Object localObject4 = (Collection)new ArrayList();
    Iterator localIterator = ((Iterable)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      localObject2 = null;
      if (!bool) {
        break;
      }
      Field localField = (Field)localIterator.next();
      localObject3 = localField.get(null);
      localObject1 = localObject3;
      if (!(localObject3 instanceof d)) {
        localObject1 = null;
      }
      localObject3 = (d)localObject1;
      localObject1 = localObject2;
      if (localObject3 != null)
      {
        i1 = ((d)localObject3).a;
        b.f.b.j.a(localField, "field");
        localObject1 = localField.getName();
        b.f.b.j.a(localObject1, "field.name");
        localObject1 = new d.a.a(i1, (String)localObject1);
      }
      if (localObject1 != null) {
        ((Collection)localObject4).add(localObject1);
      }
    }
    y = b.a.j.i((Iterable)localObject4);
    localObject1 = d.class.getFields();
    b.f.b.j.a(localObject1, "T::class.java.fields");
    localObject2 = (Collection)new ArrayList();
    i2 = localObject1.length;
    i1 = 0;
    while (i1 < i2)
    {
      localObject3 = localObject1[i1];
      b.f.b.j.a(localObject3, "it");
      if (Modifier.isStatic(((Field)localObject3).getModifiers())) {
        ((Collection)localObject2).add(localObject3);
      }
      i1 += 1;
    }
    localObject2 = (Iterable)localObject2;
    localObject1 = (Collection)new ArrayList();
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = ((Iterator)localObject2).next();
      localObject4 = (Field)localObject3;
      b.f.b.j.a(localObject4, "it");
      if (b.f.b.j.a(((Field)localObject4).getType(), Integer.TYPE)) {
        ((Collection)localObject1).add(localObject3);
      }
    }
    localObject1 = (Iterable)localObject1;
    localObject2 = (Collection)new ArrayList();
    Object localObject3 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject1 = (Field)((Iterator)localObject3).next();
      localObject4 = ((Field)localObject1).get(null);
      if (localObject4 != null)
      {
        i2 = ((Integer)localObject4).intValue();
        if (i2 == (-i2 & i2)) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if (i1 != 0)
        {
          b.f.b.j.a(localObject1, "field");
          localObject1 = ((Field)localObject1).getName();
          b.f.b.j.a(localObject1, "field.name");
          localObject1 = new d.a.a(i2, (String)localObject1);
        }
        else
        {
          localObject1 = null;
        }
        if (localObject1 != null) {
          ((Collection)localObject2).add(localObject1);
        }
      }
      else
      {
        throw new r("null cannot be cast to non-null type kotlin.Int");
      }
    }
    z = b.a.j.i((Iterable)localObject2);
  }
  
  public d(int paramInt, List<? extends c> paramList)
  {
    this.b = paramList;
    paramList = ((Iterable)this.b).iterator();
    while (paramList.hasNext()) {
      paramInt &= (((c)paramList.next()).a() ^ 0xFFFFFFFF);
    }
    this.a = paramInt;
  }
  
  public final boolean a(int paramInt)
  {
    return (paramInt & this.a) != 0;
  }
  
  public final String toString()
  {
    Object localObject2 = ((Iterable)y).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = ((Iterator)localObject2).next();
      int i1;
      if (((d.a.a)localObject1).a == this.a) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (i1 != 0) {
        break label58;
      }
    }
    Object localObject1 = null;
    label58:
    localObject1 = (d.a.a)localObject1;
    if (localObject1 != null) {
      localObject1 = ((d.a.a)localObject1).b;
    } else {
      localObject1 = null;
    }
    localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject1 = (Iterable)z;
      localObject2 = (Collection)new ArrayList();
      Iterator localIterator = ((Iterable)localObject1).iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (d.a.a)localIterator.next();
        if (a(((d.a.a)localObject1).a)) {
          localObject1 = ((d.a.a)localObject1).b;
        } else {
          localObject1 = null;
        }
        if (localObject1 != null) {
          ((Collection)localObject2).add(localObject1);
        }
      }
      localObject2 = b.a.j.a((Iterable)localObject2, (CharSequence)" | ", null, null, 0, null, null, 62);
    }
    localObject1 = new StringBuilder("DescriptorKindFilter(");
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(", ");
    ((StringBuilder)localObject1).append(this.b);
    ((StringBuilder)localObject1).append(')');
    return ((StringBuilder)localObject1).toString();
  }
  
  public static final class a
  {
    static int a()
    {
      int i = d.a();
      d.b(d.a() << 1);
      return i;
    }
    
    static final class a
    {
      final int a;
      final String b;
      
      public a(int paramInt, String paramString)
      {
        this.a = paramInt;
        this.b = paramString;
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */