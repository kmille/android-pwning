package b.i.b.a.c.a.a;

import b.a.x;
import b.i.b.a.c.b.ab;
import b.i.b.a.c.b.ad;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.y;
import b.i.b.a.c.f.f;
import b.i.b.a.c.k.i;
import b.k.l;
import b.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class a
  implements b.i.b.a.c.b.b.b
{
  public static final a a = new a((byte)0);
  private final i b;
  private final y c;
  
  public a(i parami, y paramy)
  {
    this.b = parami;
    this.c = paramy;
  }
  
  public final e a(b.i.b.a.c.f.a parama)
  {
    b.f.b.j.b(parama, "classId");
    if (!parama.c)
    {
      if (parama.c()) {
        return null;
      }
      Object localObject2 = parama.b.b.a;
      b.f.b.j.a(localObject2, "classId.relativeClassName.asString()");
      if (!l.b((CharSequence)localObject2, (CharSequence)"Function")) {
        return null;
      }
      Object localObject1 = parama.a;
      b.f.b.j.a(localObject1, "classId.packageFqName");
      localObject2 = a.a((String)localObject2, (b.i.b.a.c.f.b)localObject1);
      if (localObject2 == null) {
        return null;
      }
      parama = ((b)localObject2).a;
      int i = ((b)localObject2).b;
      localObject2 = (Iterable)this.c.a((b.i.b.a.c.f.b)localObject1).f();
      localObject1 = (Collection)new ArrayList();
      localObject2 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Object localObject3 = ((Iterator)localObject2).next();
        if ((localObject3 instanceof b.i.b.a.c.a.c)) {
          ((Collection)localObject1).add(localObject3);
        }
      }
      localObject1 = (b.i.b.a.c.a.c)b.a.j.c((List)localObject1);
      return (e)new b(this.b, (ab)localObject1, parama, i);
    }
    return null;
  }
  
  public final Collection<e> a(b.i.b.a.c.f.b paramb)
  {
    b.f.b.j.b(paramb, "packageFqName");
    return (Collection)x.a;
  }
  
  public final boolean a(b.i.b.a.c.f.b paramb, f paramf)
  {
    b.f.b.j.b(paramb, "packageFqName");
    b.f.b.j.b(paramf, "name");
    paramf = paramf.a;
    b.f.b.j.a(paramf, "name.asString()");
    return ((l.a(paramf, "Function")) || (l.a(paramf, "KFunction")) || (l.a(paramf, "SuspendFunction")) || (l.a(paramf, "KSuspendFunction"))) && (a.a(paramf, paramb) != null);
  }
  
  public static final class a
  {
    static a.b a(String paramString, b.i.b.a.c.f.b paramb)
    {
      b.b.a locala = b.b.g;
      b.f.b.j.b(paramb, "packageFqName");
      b.f.b.j.b(paramString, "className");
      b.b[] arrayOfb = b.b.values();
      int n = arrayOfb.length;
      int k = 0;
      int i = 0;
      int m;
      int j;
      for (;;)
      {
        m = 1;
        if (i >= n) {
          break;
        }
        locala = arrayOfb[i];
        if ((b.f.b.j.a(locala.e, paramb)) && (l.a(paramString, locala.f))) {
          j = 1;
        } else {
          j = 0;
        }
        if (j != 0)
        {
          paramb = locala;
          break label97;
        }
        i += 1;
      }
      paramb = null;
      label97:
      if (paramb == null) {
        return null;
      }
      i = paramb.f.length();
      if (paramString != null)
      {
        paramString = paramString.substring(i);
        b.f.b.j.a(paramString, "(this as java.lang.String).substring(startIndex)");
        if (((CharSequence)paramString).length() == 0) {
          i = m;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          paramString = null;
        }
        else
        {
          m = paramString.length();
          j = 0;
          i = k;
          for (;;)
          {
            if (i >= m) {
              break label213;
            }
            k = paramString.charAt(i) - '0';
            if ((k < 0) || (9 < k)) {
              break;
            }
            j = j * 10 + k;
            i += 1;
          }
          label213:
          paramString = Integer.valueOf(j);
        }
        if (paramString != null) {
          return new a.b(paramb, paramString.intValue());
        }
        return null;
      }
      throw new r("null cannot be cast to non-null type java.lang.String");
    }
    
    public static b.b b(String paramString, b.i.b.a.c.f.b paramb)
    {
      b.f.b.j.b(paramString, "className");
      b.f.b.j.b(paramb, "packageFqName");
      paramString = a(paramString, paramb);
      if (paramString != null) {
        return paramString.a;
      }
      return null;
    }
  }
  
  static final class b
  {
    final b.b a;
    final int b;
    
    public b(b.b paramb, int paramInt)
    {
      this.a = paramb;
      this.b = paramInt;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          if (b.f.b.j.a(this.a, ((b)paramObject).a))
          {
            int i;
            if (this.b == ((b)paramObject).b) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              return true;
            }
          }
        }
        return false;
      }
      return true;
    }
    
    public final int hashCode()
    {
      b.b localb = this.a;
      int i;
      if (localb != null) {
        i = localb.hashCode();
      } else {
        i = 0;
      }
      return i * 31 + this.b;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("KindWithArity(kind=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", arity=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */