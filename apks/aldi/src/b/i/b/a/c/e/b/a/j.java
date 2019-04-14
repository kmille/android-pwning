package b.i.b.a.c.e.b.a;

import b.i.b.a.c.e.a.aa;
import b.i.b.a.c.e.a.ai;
import b.i.b.a.c.e.a.c;
import b.i.b.a.c.e.a.e;
import b.i.b.a.c.e.a.o;
import b.i.b.a.c.e.a.s;
import b.i.b.a.c.e.a.u;
import b.i.b.a.c.e.a.f;
import b.i.b.a.c.e.b.b.c;
import b.i.b.a.c.e.b.b.e;
import b.i.b.a.c.e.b.b.g;
import b.i.b.a.c.g.i.c;
import b.i.b.a.c.g.i.f;
import b.m;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class j
{
  public static final j a = new j();
  private static final b.i.b.a.c.g.g b;
  
  static
  {
    b.i.b.a.c.g.g localg = b.i.b.a.c.g.g.a();
    b.i.b.a.c.e.b.b.a(localg);
    b.f.b.j.a(localg, "ExtensionRegistryLite.ne…f::registerAllExtensions)");
    b = localg;
  }
  
  public static f.a a(a.u paramu, b.i.b.a.c.e.a.c paramc, b.i.b.a.c.e.a.h paramh, boolean paramBoolean)
  {
    b.f.b.j.b(paramu, "proto");
    b.f.b.j.b(paramc, "nameResolver");
    b.f.b.j.b(paramh, "typeTable");
    Object localObject = (i.c)paramu;
    i.f localf = b.i.b.a.c.e.b.b.d;
    b.f.b.j.a(localf, "JvmProtoBuf.propertySignature");
    localObject = (b.e)f.a((i.c)localObject, localf);
    if (localObject == null) {
      return null;
    }
    if (((b.e)localObject).c()) {
      localObject = ((b.e)localObject).b;
    } else {
      localObject = null;
    }
    if ((localObject == null) && (paramBoolean)) {
      return null;
    }
    int i;
    if ((localObject != null) && (((b.i.b.a.c.e.b.b.a)localObject).c())) {
      i = ((b.i.b.a.c.e.b.b.a)localObject).b;
    } else {
      i = paramu.d;
    }
    if ((localObject != null) && (((b.i.b.a.c.e.b.b.a)localObject).d()))
    {
      paramu = paramc.a(((b.i.b.a.c.e.b.b.a)localObject).c);
    }
    else
    {
      paramh = a(b.i.b.a.c.e.a.g.a(paramu, paramh), paramc);
      paramu = paramh;
      if (paramh == null) {
        return null;
      }
    }
    return new f.a(paramc.a(i), paramu);
  }
  
  public static f.b a(a.e parame, b.i.b.a.c.e.a.c paramc, b.i.b.a.c.e.a.h paramh)
  {
    b.f.b.j.b(parame, "proto");
    b.f.b.j.b(paramc, "nameResolver");
    b.f.b.j.b(paramh, "typeTable");
    Object localObject1 = (i.c)parame;
    Object localObject2 = b.i.b.a.c.e.b.b.a;
    b.f.b.j.a(localObject2, "JvmProtoBuf.constructorSignature");
    localObject2 = (b.c)f.a((i.c)localObject1, (i.f)localObject2);
    if ((localObject2 != null) && (((b.c)localObject2).c())) {
      localObject1 = paramc.a(((b.c)localObject2).b);
    } else {
      localObject1 = "<init>";
    }
    if ((localObject2 != null) && (((b.c)localObject2).d()))
    {
      parame = paramc.a(((b.c)localObject2).c);
    }
    else
    {
      parame = parame.c;
      b.f.b.j.a(parame, "proto.valueParameterList");
      localObject2 = (Iterable)parame;
      parame = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
      localObject2 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Object localObject3 = (a.ai)((Iterator)localObject2).next();
        b.f.b.j.a(localObject3, "it");
        localObject3 = a(b.i.b.a.c.e.a.g.a((a.ai)localObject3, paramh), paramc);
        if (localObject3 == null) {
          return null;
        }
        parame.add(localObject3);
      }
      parame = b.a.j.a((Iterable)parame, (CharSequence)"", (CharSequence)"(", (CharSequence)")V", 0, null, null, 56);
    }
    return new f.b((String)localObject1, parame);
  }
  
  public static f.b a(a.o paramo, b.i.b.a.c.e.a.c paramc, b.i.b.a.c.e.a.h paramh)
  {
    b.f.b.j.b(paramo, "proto");
    b.f.b.j.b(paramc, "nameResolver");
    b.f.b.j.b(paramh, "typeTable");
    Object localObject1 = (i.c)paramo;
    Object localObject2 = b.i.b.a.c.e.b.b.b;
    b.f.b.j.a(localObject2, "JvmProtoBuf.methodSignature");
    localObject1 = (b.c)f.a((i.c)localObject1, (i.f)localObject2);
    int i;
    if ((localObject1 != null) && (((b.c)localObject1).c())) {
      i = ((b.c)localObject1).b;
    } else {
      i = paramo.d;
    }
    if ((localObject1 != null) && (((b.c)localObject1).d()))
    {
      paramo = paramc.a(((b.c)localObject1).c);
    }
    else
    {
      localObject1 = (Collection)b.a.j.b(b.i.b.a.c.e.a.g.b(paramo, paramh));
      localObject2 = paramo.j;
      b.f.b.j.a(localObject2, "proto.valueParameterList");
      Object localObject3 = (Iterable)localObject2;
      localObject2 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject3));
      localObject3 = ((Iterable)localObject3).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        a.ai localai = (a.ai)((Iterator)localObject3).next();
        b.f.b.j.a(localai, "it");
        ((Collection)localObject2).add(b.i.b.a.c.e.a.g.a(localai, paramh));
      }
      localObject2 = (Iterable)b.a.j.b((Collection)localObject1, (Iterable)localObject2);
      localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
      localObject2 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = a((a.aa)((Iterator)localObject2).next(), paramc);
        if (localObject3 == null) {
          return null;
        }
        ((Collection)localObject1).add(localObject3);
      }
      localObject1 = (List)localObject1;
      paramo = a(b.i.b.a.c.e.a.g.a(paramo, paramh), paramc);
      if (paramo == null) {
        return null;
      }
      paramh = new StringBuilder();
      paramh.append(b.a.j.a((Iterable)localObject1, (CharSequence)"", (CharSequence)"(", (CharSequence)")", 0, null, null, 56));
      paramh.append(paramo);
      paramo = paramh.toString();
    }
    return new f.b(paramc.a(i), paramo);
  }
  
  private static h a(InputStream paramInputStream, String[] paramArrayOfString)
  {
    paramInputStream = b.g.a(paramInputStream, b);
    b.f.b.j.a(paramInputStream, "JvmProtoBuf.StringTableT…this, EXTENSION_REGISTRY)");
    return new h(paramInputStream, paramArrayOfString);
  }
  
  public static b.i.b.a.c.g.g a()
  {
    return b;
  }
  
  public static final m<h, a.c> a(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    b.f.b.j.b(paramArrayOfString1, "data");
    b.f.b.j.b(paramArrayOfString2, "strings");
    paramArrayOfString1 = b.a(paramArrayOfString1);
    b.f.b.j.a(paramArrayOfString1, "BitEncoding.decodeBytes(data)");
    b.f.b.j.b(paramArrayOfString1, "bytes");
    b.f.b.j.b(paramArrayOfString2, "strings");
    paramArrayOfString1 = (InputStream)new ByteArrayInputStream(paramArrayOfString1);
    return new m(a(paramArrayOfString1, paramArrayOfString2), a.c.a(paramArrayOfString1, b));
  }
  
  private static String a(a.aa paramaa, b.i.b.a.c.e.a.c paramc)
  {
    if (paramaa.m()) {
      return c.a(paramc.b(paramaa.g));
    }
    return null;
  }
  
  public static final boolean a(a.u paramu)
  {
    b.f.b.j.b(paramu, "proto");
    Object localObject = e.a;
    localObject = e.a();
    paramu = paramu.c(b.i.b.a.c.e.b.b.e);
    b.f.b.j.a(paramu, "proto.getExtension(JvmProtoBuf.flags)");
    paramu = ((b.i.b.a.c.e.a.b.a)localObject).a(((Number)paramu).intValue());
    b.f.b.j.a(paramu, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
    return paramu.booleanValue();
  }
  
  public static final m<h, a.s> b(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    b.f.b.j.b(paramArrayOfString1, "data");
    b.f.b.j.b(paramArrayOfString2, "strings");
    paramArrayOfString1 = b.a(paramArrayOfString1);
    b.f.b.j.a(paramArrayOfString1, "BitEncoding.decodeBytes(data)");
    b.f.b.j.b(paramArrayOfString1, "bytes");
    b.f.b.j.b(paramArrayOfString2, "strings");
    paramArrayOfString1 = (InputStream)new ByteArrayInputStream(paramArrayOfString1);
    return new m(a(paramArrayOfString1, paramArrayOfString2), a.s.a(paramArrayOfString1, b));
  }
  
  public static final m<h, a.o> c(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    b.f.b.j.b(paramArrayOfString1, "data");
    b.f.b.j.b(paramArrayOfString2, "strings");
    paramArrayOfString1 = (InputStream)new ByteArrayInputStream(b.a(paramArrayOfString1));
    return new m(a(paramArrayOfString1, paramArrayOfString2), a.o.a(paramArrayOfString1, b));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/e/b/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */