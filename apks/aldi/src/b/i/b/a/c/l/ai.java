package b.i.b.a.c.l;

import b.i.b.a.c.a.g;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.i;
import b.i.b.a.c.b.l;
import b.i.b.a.c.i.c.a;
import b.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ai
{
  public static final w a(ar paramar)
  {
    b.f.b.j.b(paramar, "receiver$0");
    Object localObject1 = paramar.a();
    if (localObject1 != null)
    {
      localObject1 = ((i)localObject1).c();
      b.f.b.j.a(localObject1, "classDescriptor.typeConstructor");
      localObject1 = ((an)localObject1).b();
      b.f.b.j.a(localObject1, "classDescriptor.typeConstructor.parameters");
      Object localObject2 = (Iterable)localObject1;
      localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
      localObject2 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        ar localar = (ar)((Iterator)localObject2).next();
        b.f.b.j.a(localar, "it");
        ((Collection)localObject1).add(localar.c());
      }
      localObject1 = au.a((as)new a((List)localObject1));
      localObject2 = paramar.j();
      b.f.b.j.a(localObject2, "this.upperBounds");
      localObject2 = ((au)localObject1).b((w)b.a.j.c((List)localObject2), ba.c);
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        paramar = a.d((l)paramar).h();
        b.f.b.j.a(paramar, "builtIns.defaultBound");
        localObject1 = (w)paramar;
      }
      return (w)localObject1;
    }
    throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassifierDescriptorWithTypeParameters");
  }
  
  public static final class a
    extends ao
  {
    a(List paramList) {}
    
    public final ap a(an paraman)
    {
      b.f.b.j.b(paraman, "key");
      if (this.a.contains(paraman))
      {
        paraman = paraman.c();
        if (paraman != null) {
          return av.a((ar)paraman);
        }
        throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
      }
      return null;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */