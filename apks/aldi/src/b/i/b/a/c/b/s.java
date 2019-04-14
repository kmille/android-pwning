package b.i.b.a.c.b;

import b.f.b.k;
import b.f.b.v;
import b.i.b.a.c.f.f;
import b.i.b.a.c.i.e.h;
import b.i.d;
import java.util.Iterator;
import java.util.List;

public final class s
{
  public static final e a(y paramy, b.i.b.a.c.f.a parama)
  {
    b.f.b.j.b(paramy, "receiver$0");
    b.f.b.j.b(parama, "classId");
    Object localObject = parama.a;
    b.f.b.j.a(localObject, "classId.packageFqName");
    paramy = paramy.a((b.i.b.a.c.f.b)localObject);
    localObject = parama.b.b.f();
    b.f.b.j.a(localObject, "classId.relativeClassName.pathSegments()");
    paramy = paramy.c();
    parama = b.a.j.c((List)localObject);
    b.f.b.j.a(parama, "segments.first()");
    parama = paramy.c((f)parama, (b.i.b.a.c.c.a.a)b.i.b.a.c.c.a.c.r);
    paramy = parama;
    if (!(parama instanceof e)) {
      paramy = null;
    }
    paramy = (e)paramy;
    if (paramy == null) {
      return null;
    }
    localObject = ((List)localObject).subList(1, ((List)localObject).size()).iterator();
    while (((Iterator)localObject).hasNext())
    {
      parama = (f)((Iterator)localObject).next();
      paramy = paramy.v();
      b.f.b.j.a(parama, "name");
      parama = paramy.c(parama, (b.i.b.a.c.c.a.a)b.i.b.a.c.c.a.c.r);
      paramy = parama;
      if (!(parama instanceof e)) {
        paramy = null;
      }
      parama = (e)paramy;
      paramy = parama;
      if (parama == null) {
        return null;
      }
    }
    return paramy;
  }
  
  public static final e a(y paramy, b.i.b.a.c.f.a parama, aa paramaa)
  {
    b.f.b.j.b(paramy, "receiver$0");
    b.f.b.j.b(parama, "classId");
    b.f.b.j.b(paramaa, "notFoundClasses");
    paramy = a(paramy, parama);
    if (paramy != null) {
      return paramy;
    }
    return paramaa.a(parama, b.j.i.c(b.j.i.d(b.j.i.a(parama, (b.f.a.b)a.c), (b.f.a.b)b.a)));
  }
  
  static final class a
    extends b.f.b.i
    implements b.f.a.b<b.i.b.a.c.f.a, b.i.b.a.c.f.a>
  {
    public static final a c = new a();
    
    a()
    {
      super();
    }
    
    public final d f()
    {
      return v.a(b.i.b.a.c.f.a.class);
    }
    
    public final String g()
    {
      return "getOuterClassId";
    }
    
    public final String h()
    {
      return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }
  }
  
  static final class b
    extends k
    implements b.f.a.b<b.i.b.a.c.f.a, Integer>
  {
    public static final b a = new b();
    
    b()
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */