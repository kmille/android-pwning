package b.i.b.a.c.d.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
{
  public final boolean a;
  public final b.i.b.a.c.n.e b;
  private final b.i.b.a.c.k.d<b.i.b.a.c.b.e, b.i.b.a.c.b.a.c> c;
  
  public a(b.i.b.a.c.k.i parami, b.i.b.a.c.n.e parame)
  {
    this.b = parame;
    this.c = parami.b((b.f.a.b)new c((a)this));
    this.a = this.b.a();
  }
  
  private final b.i.b.a.c.n.g a(b.i.b.a.c.b.e parame)
  {
    parame = parame.r().a(b.d());
    if (parame != null) {
      parame = b.i.b.a.c.i.c.a.b(parame);
    } else {
      parame = null;
    }
    Object localObject = parame;
    if (!(parame instanceof b.i.b.a.c.i.b.i)) {
      localObject = null;
    }
    parame = (b.i.b.a.c.i.b.i)localObject;
    if (parame == null) {
      return null;
    }
    localObject = this.b.c;
    if (localObject != null) {
      return (b.i.b.a.c.n.g)localObject;
    }
    parame = parame.a.a;
    int i = parame.hashCode();
    if (i != -2137067054)
    {
      if (i != -1838656823)
      {
        if (i != 2656902) {
          return null;
        }
        if (parame.equals("WARN")) {
          return b.i.b.a.c.n.g.b;
        }
      }
      else if (parame.equals("STRICT"))
      {
        return b.i.b.a.c.n.g.c;
      }
    }
    else if (parame.equals("IGNORE")) {
      return b.i.b.a.c.n.g.a;
    }
    return null;
  }
  
  private final List<a> a(b.i.b.a.c.i.b.f<?> paramf)
  {
    if ((paramf instanceof b.i.b.a.c.i.b.b))
    {
      Object localObject = (Iterable)((b.i.b.a.c.i.b.b)paramf).a();
      paramf = (Collection)new ArrayList();
      localObject = ((Iterable)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        b.a.j.a(paramf, (Iterable)a((b.i.b.a.c.i.b.f)((Iterator)localObject).next()));
      }
      return (List)paramf;
    }
    if ((paramf instanceof b.i.b.a.c.i.b.i))
    {
      paramf = ((b.i.b.a.c.i.b.i)paramf).a.a();
      int i = paramf.hashCode();
      if (i != -2024225567)
      {
        if (i != 66889946)
        {
          if (i != 107598562)
          {
            if ((i == 446088073) && (paramf.equals("PARAMETER")))
            {
              paramf = a.b;
              break label190;
            }
          }
          else if (paramf.equals("TYPE_USE"))
          {
            paramf = a.d;
            break label190;
          }
        }
        else if (paramf.equals("FIELD"))
        {
          paramf = a.c;
          break label190;
        }
      }
      else if (paramf.equals("METHOD"))
      {
        paramf = a.a;
        break label190;
      }
      paramf = null;
      label190:
      return b.a.j.b(paramf);
    }
    return (List)b.a.v.a;
  }
  
  public final b.i.b.a.c.b.a.c a(b.i.b.a.c.b.a.c paramc)
  {
    b.f.b.j.b(paramc, "annotationDescriptor");
    if (this.b.a()) {
      return null;
    }
    b.i.b.a.c.b.e locale = b.i.b.a.c.i.c.a.a(paramc);
    if (locale == null) {
      return null;
    }
    if (b.a(locale)) {
      return paramc;
    }
    if (locale.g() != b.i.b.a.c.b.f.e) {
      return null;
    }
    return (b.i.b.a.c.b.a.c)this.c.a(locale);
  }
  
  public final b b(b.i.b.a.c.b.a.c paramc)
  {
    b.f.b.j.b(paramc, "annotationDescriptor");
    if (this.b.a()) {
      return null;
    }
    Object localObject1 = b.i.b.a.c.i.c.a.a(paramc);
    if (localObject1 != null)
    {
      if (!((b.i.b.a.c.b.e)localObject1).r().b(b.c())) {
        localObject1 = null;
      }
      if (localObject1 == null) {
        return null;
      }
      paramc = b.i.b.a.c.i.c.a.a(paramc);
      if (paramc == null) {
        b.f.b.j.a();
      }
      paramc = paramc.r().a(b.c());
      if (paramc == null) {
        b.f.b.j.a();
      }
      paramc = paramc.c();
      Collection localCollection = (Collection)new ArrayList();
      Iterator localIterator = paramc.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject2 = (Map.Entry)localIterator.next();
        paramc = (b.i.b.a.c.f.f)((Map.Entry)localObject2).getKey();
        localObject2 = (b.i.b.a.c.i.b.f)((Map.Entry)localObject2).getValue();
        if (b.f.b.j.a(paramc, p.c)) {
          paramc = a((b.i.b.a.c.i.b.f)localObject2);
        } else {
          paramc = (List)b.a.v.a;
        }
        b.a.j.a(localCollection, (Iterable)paramc);
      }
      paramc = ((Iterable)localCollection).iterator();
      int i = 0;
      while (paramc.hasNext()) {
        i |= 1 << ((a)paramc.next()).ordinal();
      }
      localObject1 = ((Iterable)((b.i.b.a.c.b.e)localObject1).r()).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        paramc = ((Iterator)localObject1).next();
        int j;
        if (a((b.i.b.a.c.b.a.c)paramc) != null) {
          j = 1;
        } else {
          j = 0;
        }
        if (j != 0) {
          break label318;
        }
      }
      paramc = null;
      label318:
      paramc = (b.i.b.a.c.b.a.c)paramc;
      if (paramc == null) {
        return null;
      }
      return new b(paramc, i);
    }
    return null;
  }
  
  public final b.i.b.a.c.n.g c(b.i.b.a.c.b.a.c paramc)
  {
    b.f.b.j.b(paramc, "annotationDescriptor");
    paramc = d(paramc);
    if (paramc != null) {
      return paramc;
    }
    return this.b.b;
  }
  
  public final b.i.b.a.c.n.g d(b.i.b.a.c.b.a.c paramc)
  {
    b.f.b.j.b(paramc, "annotationDescriptor");
    Map localMap = this.b.d;
    Object localObject = paramc.b();
    if (localObject != null) {
      localObject = ((b.i.b.a.c.f.b)localObject).b.a;
    } else {
      localObject = null;
    }
    localObject = (b.i.b.a.c.n.g)localMap.get(localObject);
    if (localObject != null) {
      return (b.i.b.a.c.n.g)localObject;
    }
    paramc = b.i.b.a.c.i.c.a.a(paramc);
    if (paramc != null) {
      return a(paramc);
    }
    return null;
  }
  
  public static enum a
  {
    static
    {
      a locala1 = new a("METHOD_RETURN_TYPE", 0);
      a = locala1;
      a locala2 = new a("VALUE_PARAMETER", 1);
      b = locala2;
      a locala3 = new a("FIELD", 2);
      c = locala3;
      a locala4 = new a("TYPE_USE", 3);
      d = locala4;
      e = new a[] { locala1, locala2, locala3, locala4 };
    }
    
    private a() {}
  }
  
  public static final class b
  {
    public final b.i.b.a.c.b.a.c a;
    private final int b;
    
    public b(b.i.b.a.c.b.a.c paramc, int paramInt)
    {
      this.a = paramc;
      this.b = paramInt;
    }
    
    private final boolean a(a.a parama)
    {
      int i = this.b;
      return (1 << parama.ordinal() & i) != 0;
    }
    
    public final List<a.a> a()
    {
      a.a[] arrayOfa = a.a.values();
      Collection localCollection = (Collection)new ArrayList();
      int k = arrayOfa.length;
      int i = 0;
      while (i < k)
      {
        a.a locala = arrayOfa[i];
        b localb = (b)this;
        int j;
        if ((!localb.a(a.a.d)) && (!localb.a(locala))) {
          j = 0;
        } else {
          j = 1;
        }
        if (j != 0) {
          localCollection.add(locala);
        }
        i += 1;
      }
      return (List)localCollection;
    }
  }
  
  static final class c
    extends b.f.b.i
    implements b.f.a.b<b.i.b.a.c.b.e, b.i.b.a.c.b.a.c>
  {
    c(a parama)
    {
      super();
    }
    
    public final b.i.d f()
    {
      return b.f.b.v.a(a.class);
    }
    
    public final String g()
    {
      return "computeTypeQualifierNickname";
    }
    
    public final String h()
    {
      return "computeTypeQualifierNickname(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Lorg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor;";
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */