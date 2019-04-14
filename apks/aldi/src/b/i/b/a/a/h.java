package b.i.b.a.a;

import b.i.b.a.c.b.ak;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.b;
import b.i.b.a.c.i.f;
import b.i.b.a.c.l.w;
import java.lang.reflect.Member;
import java.util.Collection;
import java.util.Iterator;

@b.j(a={1, 1, 13}, b={"\000\036\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\0324\020\000\032\b\022\004\022\002H\0020\001\"\b\b\000\020\002*\0020\003*\b\022\004\022\002H\0020\0042\006\020\005\032\0020\0062\b\b\002\020\007\032\0020\bH\000¨\006\t"}, c={"createInlineClassAwareCallerIfNeeded", "Lkotlin/reflect/jvm/internal/calls/Caller;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "isDefault", "", "kotlin-reflect-api"})
public final class h
{
  public static final <M extends Member> d<M> a(e<? extends M> parame, b paramb, boolean paramBoolean)
  {
    b.f.b.j.b(parame, "receiver$0");
    b.f.b.j.b(paramb, "descriptor");
    Object localObject1 = paramb.k();
    b.f.b.j.a(localObject1, "descriptor.valueParameters");
    localObject1 = (Iterable)localObject1;
    boolean bool = localObject1 instanceof Collection;
    int j = 0;
    if ((!bool) || (!((Collection)localObject1).isEmpty()))
    {
      localObject1 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (au)((Iterator)localObject1).next();
        b.f.b.j.a(localObject2, "it");
        localObject2 = ((au)localObject2).y();
        b.f.b.j.a(localObject2, "it.type");
        if (f.a((w)localObject2))
        {
          i = 1;
          break label131;
        }
      }
    }
    int i = 0;
    label131:
    if (i == 0)
    {
      localObject1 = paramb.g();
      if ((localObject1 == null) || (f.a((w)localObject1) != true))
      {
        i = j;
        if ((parame instanceof c)) {
          break label214;
        }
        localObject1 = paramb.d();
        i = j;
        if (localObject1 == null) {
          break label214;
        }
        localObject1 = ((ak)localObject1).y();
        i = j;
        if (localObject1 == null) {
          break label214;
        }
        i = j;
        if (f.a((w)localObject1) != true) {
          break label214;
        }
      }
    }
    i = 1;
    label214:
    if (i != 0) {
      return (d)new g(paramb, parame, paramBoolean);
    }
    return (d)parame;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */