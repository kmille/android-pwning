package b.i.b;

import b.f.b.v;
import b.i.b;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.f;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.w;
import b.i.b.a.u;
import b.i.b.a.x;
import b.i.c;
import b.i.o;
import b.i.p;
import b.r;
import java.util.Iterator;
import java.util.List;

@b.j(a={1, 1, 13}, b={"\000\026\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\"\034\020\000\032\006\022\002\b\0030\001*\0020\0028@X\004¢\006\006\032\004\b\003\020\004\"\"\020\000\032\006\022\002\b\0030\001*\0020\0058FX\004¢\006\f\022\004\b\006\020\007\032\004\b\003\020\b¨\006\t"}, c={"jvmErasure", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/KClassifier;", "getJvmErasure", "(Lkotlin/reflect/KClassifier;)Lkotlin/reflect/KClass;", "Lkotlin/reflect/KType;", "jvmErasure$annotations", "(Lkotlin/reflect/KType;)V", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KClass;", "kotlin-reflect-api"})
public final class a
{
  public static final b<?> a(c paramc)
  {
    b.f.b.j.b(paramc, "receiver$0");
    if ((paramc instanceof b)) {
      return (b)paramc;
    }
    if ((paramc instanceof p))
    {
      List localList = ((p)paramc).a();
      Iterator localIterator = ((Iterable)localList).iterator();
      int i;
      do
      {
        boolean bool = localIterator.hasNext();
        paramc = null;
        if (!bool) {
          break label172;
        }
        localObject1 = localIterator.next();
        Object localObject2 = (o)localObject1;
        if (localObject2 == null) {
          break;
        }
        localObject2 = ((u)localObject2).b.f().c();
        if ((localObject2 instanceof e)) {
          paramc = (c)localObject2;
        }
        paramc = (e)paramc;
        if ((paramc != null) && (paramc.g() != f.b) && (paramc.g() != f.e)) {
          i = 1;
        } else {
          i = 0;
        }
      } while (i == 0);
      paramc = (c)localObject1;
      break label174;
      throw new r("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
      label172:
      paramc = null;
      label174:
      Object localObject1 = (o)paramc;
      paramc = (c)localObject1;
      if (localObject1 == null) {
        paramc = (o)b.a.j.d(localList);
      }
      if (paramc != null)
      {
        paramc = a(paramc);
        if (paramc != null) {
          return paramc;
        }
      }
      return v.a(Object.class);
    }
    throw ((Throwable)new x("Cannot calculate JVM erasure for type: ".concat(String.valueOf(paramc))));
  }
  
  private static b<?> a(o paramo)
  {
    b.f.b.j.b(paramo, "receiver$0");
    Object localObject = paramo.a();
    if (localObject != null)
    {
      localObject = a((c)localObject);
      if (localObject != null) {
        return (b<?>)localObject;
      }
    }
    throw ((Throwable)new x("Cannot calculate JVM erasure for type: ".concat(String.valueOf(paramo))));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */