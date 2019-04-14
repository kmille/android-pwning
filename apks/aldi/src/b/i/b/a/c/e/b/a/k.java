package b.i.b.a.c.e.b.a;

import b.a.ac;
import b.a.v;
import b.f.a.b;
import b.f.b.y;
import b.i.b.a.c.e.a.d;
import b.i.b.a.c.e.b.a.c;
import b.i.b.a.c.g.o;
import b.r;
import b.u;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class k
{
  public static final k b = new k(ac.a(), new a((List)v.a), "EMPTY");
  public static final k c = new k(ac.a(), new a((List)v.a), "CORRUPTED");
  public static final a d = new a((byte)0);
  public final Map<String, m> a;
  private final a e;
  private final String f;
  
  private k(Map<String, m> paramMap, a parama, String paramString)
  {
    this.a = paramMap;
    this.e = parama;
    this.f = paramString;
  }
  
  public final String toString()
  {
    return this.f;
  }
  
  public static final class a
  {
    public static k a(byte[] paramArrayOfByte, String paramString, b<? super g, u> paramb)
    {
      b.f.b.j.b(paramString, "debugName");
      b.f.b.j.b(paramb, "reportIncompatibleVersionError");
      if (paramArrayOfByte == null) {
        return k.b;
      }
      paramArrayOfByte = new DataInputStream((InputStream)new ByteArrayInputStream(paramArrayOfByte));
      try
      {
        int j = paramArrayOfByte.readInt();
        Object localObject1 = new int[j];
        int i = 0;
        while (i < j)
        {
          localObject1[i] = paramArrayOfByte.readInt();
          i += 1;
        }
        Object localObject2 = new g(Arrays.copyOf((int[])localObject1, j));
        if (!((g)localObject2).a())
        {
          paramb.a(localObject2);
          return k.b;
        }
        if (b.i.b.a.c.e.a.j.a((b.i.b.a.c.e.a.a)localObject2)) {
          i = paramArrayOfByte.readInt();
        } else {
          i = 0;
        }
        boolean bool;
        if ((i & 0x1) != 0) {
          bool = true;
        } else {
          bool = false;
        }
        localObject1 = new g((int[])localObject1, bool);
        if (!((g)localObject1).a())
        {
          paramb.a(localObject1);
          return k.b;
        }
        localObject2 = b.i.b.a.c.e.b.a.a.a((InputStream)paramArrayOfByte);
        if (localObject2 == null) {
          return k.b;
        }
        localObject1 = new LinkedHashMap();
        Object localObject3 = ((b.i.b.a.c.e.b.a.a)localObject2).b.iterator();
        Object localObject4;
        Object localObject6;
        Object localObject5;
        while (((Iterator)localObject3).hasNext())
        {
          localObject4 = (a.c)((Iterator)localObject3).next();
          b.f.b.j.a(localObject4, "proto");
          localObject6 = ((a.c)localObject4).d();
          localObject5 = (Map)localObject1;
          b.f.b.j.a(localObject6, "packageFqName");
          paramb = ((Map)localObject5).get(localObject6);
          paramArrayOfByte = paramb;
          if (paramb == null)
          {
            paramArrayOfByte = new m((String)localObject6);
            ((Map)localObject5).put(localObject6, paramArrayOfByte);
          }
          localObject5 = (m)paramArrayOfByte;
          paramArrayOfByte = ((a.c)localObject4).b;
          b.f.b.j.a(paramArrayOfByte, "proto.shortClassNameList");
          Object localObject7 = ((Iterable)paramArrayOfByte).iterator();
          i = 0;
          for (;;)
          {
            bool = ((Iterator)localObject7).hasNext();
            paramb = null;
            if (!bool) {
              break;
            }
            String str = (String)((Iterator)localObject7).next();
            paramArrayOfByte = ((a.c)localObject4).c;
            b.f.b.j.a(paramArrayOfByte, "proto.multifileFacadeShortNameIdList");
            paramArrayOfByte = (Integer)b.a.j.b(paramArrayOfByte, i);
            if (paramArrayOfByte != null) {
              paramArrayOfByte = Integer.valueOf(paramArrayOfByte.intValue() - 1);
            } else {
              paramArrayOfByte = null;
            }
            if (paramArrayOfByte != null)
            {
              o localo = ((a.c)localObject4).d;
              b.f.b.j.a(localo, "proto.multifileFacadeShortNameList");
              j = ((Number)paramArrayOfByte).intValue();
              paramArrayOfByte = (String)b.a.j.b((List)localo, j);
            }
            else
            {
              paramArrayOfByte = null;
            }
            if (paramArrayOfByte != null) {
              paramb = l.a((String)localObject6, paramArrayOfByte);
            }
            b.f.b.j.a(str, "partShortName");
            ((m)localObject5).a(l.a((String)localObject6, str), paramb);
            i += 1;
          }
          paramArrayOfByte = ((a.c)localObject4).e;
          b.f.b.j.a(paramArrayOfByte, "proto.classWithJvmPackageNameShortNameList");
          localObject6 = ((Iterable)paramArrayOfByte).iterator();
          i = 0;
          while (((Iterator)localObject6).hasNext())
          {
            localObject7 = (String)((Iterator)localObject6).next();
            paramArrayOfByte = ((a.c)localObject4).f;
            b.f.b.j.a(paramArrayOfByte, "proto.classWithJvmPackageNamePackageIdList");
            paramb = (Integer)b.a.j.b(paramArrayOfByte, i);
            paramArrayOfByte = paramb;
            if (paramb == null)
            {
              paramArrayOfByte = ((a.c)localObject4).f;
              b.f.b.j.a(paramArrayOfByte, "proto.classWithJvmPackageNamePackageIdList");
              paramArrayOfByte = (Integer)b.a.j.f(paramArrayOfByte);
            }
            if (paramArrayOfByte != null)
            {
              j = paramArrayOfByte.intValue();
              paramArrayOfByte = ((b.i.b.a.c.e.b.a.a)localObject2).d;
              b.f.b.j.a(paramArrayOfByte, "moduleProto.jvmPackageNameList");
              paramArrayOfByte = (String)b.a.j.b((List)paramArrayOfByte, j);
              if (paramArrayOfByte != null)
              {
                b.f.b.j.a(localObject7, "partShortName");
                ((m)localObject5).a(l.a(paramArrayOfByte, (String)localObject7), null);
              }
            }
            i += 1;
          }
        }
        localObject3 = ((b.i.b.a.c.e.b.a.a)localObject2).c.iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject4 = (a.c)((Iterator)localObject3).next();
          localObject5 = (Map)localObject1;
          b.f.b.j.a(localObject4, "proto");
          localObject6 = ((a.c)localObject4).d();
          b.f.b.j.a(localObject6, "proto.packageFqName");
          paramb = ((Map)localObject5).get(localObject6);
          paramArrayOfByte = paramb;
          if (paramb == null)
          {
            paramArrayOfByte = ((a.c)localObject4).d();
            b.f.b.j.a(paramArrayOfByte, "proto.packageFqName");
            paramArrayOfByte = new m(paramArrayOfByte);
            ((Map)localObject5).put(localObject6, paramArrayOfByte);
          }
          paramArrayOfByte = (m)paramArrayOfByte;
          paramb = ((a.c)localObject4).b;
          b.f.b.j.a(paramb, "proto.shortClassNameList");
          paramb = ((Iterable)paramb).iterator();
          while (paramb.hasNext())
          {
            localObject4 = (String)paramb.next();
            b.f.b.j.b(localObject4, "shortName");
            localObject5 = paramArrayOfByte.a;
            if (localObject5 == null) {
              break label843;
            }
            y.a(localObject5).add(localObject4);
          }
          continue;
          label843:
          throw new r("null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
        }
        paramArrayOfByte = ((b.i.b.a.c.e.b.a.a)localObject2).e;
        b.f.b.j.a(paramArrayOfByte, "moduleProto.stringTable");
        paramb = ((b.i.b.a.c.e.b.a.a)localObject2).f;
        b.f.b.j.a(paramb, "moduleProto.qualifiedNameTable");
        paramArrayOfByte = new d(paramArrayOfByte, paramb);
        paramb = ((b.i.b.a.c.e.b.a.a)localObject2).g;
        b.f.b.j.a(paramb, "moduleProto.annotationList");
        localObject2 = (Iterable)paramb;
        paramb = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
        localObject2 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (b.i.b.a.c.e.a.a)((Iterator)localObject2).next();
          b.f.b.j.a(localObject3, "proto");
          paramb.add(paramArrayOfByte.b(((b.i.b.a.c.e.a.a)localObject3).b));
        }
        paramArrayOfByte = (List)paramb;
        return new k((Map)localObject1, new a(paramArrayOfByte), paramString, (byte)0);
      }
      catch (IOException paramArrayOfByte)
      {
        for (;;) {}
      }
      return k.c;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/e/b/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */