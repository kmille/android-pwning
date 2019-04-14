package b.i.b.a.c.h;

import b.a.ah;
import b.f.b.j;
import b.i.b.a.c.b.ab;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.h;
import b.i.b.a.c.b.l;
import b.i.b.a.c.f.f;
import b.i.b.a.c.i.d;
import java.util.ArrayList;
import java.util.List;

public abstract interface b
{
  public abstract String a(h paramh, c paramc);
  
  public static final class a
    implements b
  {
    public static final a a = new a();
    
    public final String a(h paramh, c paramc)
    {
      j.b(paramh, "classifier");
      j.b(paramc, "renderer");
      if ((paramh instanceof ar))
      {
        paramh = ((ar)paramh).i();
        j.a(paramh, "classifier.name");
        return paramc.a(paramh, false);
      }
      paramh = d.c((l)paramh);
      j.a(paramh, "DescriptorUtils.getFqName(classifier)");
      return paramc.a(paramh);
    }
  }
  
  public static final class b
    implements b
  {
    public static final b a = new b();
    
    public final String a(h paramh, c paramc)
    {
      j.b(paramh, "classifier");
      j.b(paramc, "renderer");
      if ((paramh instanceof ar))
      {
        paramh = ((ar)paramh).i();
        j.a(paramh, "classifier.name");
        return paramc.a(paramh, false);
      }
      ArrayList localArrayList = new ArrayList();
      paramh = (l)paramh;
      do
      {
        localArrayList.add(paramh.i());
        paramc = paramh.a();
        paramh = paramc;
      } while ((paramc instanceof e));
      paramh = (List)localArrayList;
      j.b(paramh, "receiver$0");
      return q.a((List)new ah(paramh));
    }
  }
  
  public static final class c
    implements b
  {
    public static final c a = new c();
    
    private final String a(h paramh)
    {
      Object localObject = paramh.i();
      j.a(localObject, "descriptor.name");
      localObject = q.a((f)localObject);
      if ((paramh instanceof ar)) {
        return (String)localObject;
      }
      paramh = paramh.a();
      j.a(paramh, "descriptor.containingDeclaration");
      paramh = a(paramh);
      if ((paramh != null) && ((j.a(paramh, "") ^ true)))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(paramh);
        localStringBuilder.append(".");
        localStringBuilder.append((String)localObject);
        return localStringBuilder.toString();
      }
      return (String)localObject;
    }
    
    private final String a(l paraml)
    {
      if ((paraml instanceof e)) {
        return a((h)paraml);
      }
      if ((paraml instanceof ab))
      {
        paraml = ((ab)paraml).c().b;
        j.a(paraml, "descriptor.fqName.toUnsafe()");
        return q.a(paraml);
      }
      return null;
    }
    
    public final String a(h paramh, c paramc)
    {
      j.b(paramh, "classifier");
      j.b(paramc, "renderer");
      return a(paramh);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */