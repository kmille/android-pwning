package b.i.b.a;

import b.i.b.a.d.a;
import b.i.b.a.d.b;
import b.i.b.a.d.e;
import java.lang.ref.WeakReference;

@b.j(a={1, 1, 13}, b={"\000&\n\000\n\002\030\002\n\002\020\016\n\000\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\032\b\020\005\032\0020\006H\000\032&\020\007\032\b\022\004\022\002H\t0\b\"\b\b\000\020\t*\0020\0042\f\020\n\032\b\022\004\022\002H\t0\013H\000\"*\020\000\032\036\022\f\022\n \003*\004\030\0010\0020\002\022\f\022\n \003*\004\030\0010\0040\0040\001X\016¢\006\002\n\000¨\006\f"}, c={"K_CLASS_CACHE", "Lkotlin/reflect/jvm/internal/pcollections/HashPMap;", "", "kotlin.jvm.PlatformType", "", "clearKClassCache", "", "getOrCreateKotlinClass", "Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "jClass", "Ljava/lang/Class;", "kotlin-reflect-api"})
public final class f
{
  private static b<String, Object> a;
  
  static
  {
    b localb = b.a();
    b.f.b.j.a(localb, "HashPMap.empty<String, Any>()");
    a = localb;
  }
  
  public static final <T> g<T> a(Class<T> paramClass)
  {
    b.f.b.j.b(paramClass, "jClass");
    String str = paramClass.getName();
    Object localObject2;
    Object localObject3;
    for (Object localObject1 = a.a(str.hashCode());; localObject1 = ((a)localObject1).b)
    {
      localObject2 = null;
      if ((localObject1 == null) || (((a)localObject1).c <= 0)) {
        break;
      }
      localObject3 = (e)((a)localObject1).a;
      if (((e)localObject3).a.equals(str))
      {
        localObject1 = ((e)localObject3).b;
        break label79;
      }
    }
    localObject1 = null;
    label79:
    if ((localObject1 instanceof WeakReference))
    {
      localObject3 = (g)((WeakReference)localObject1).get();
      localObject1 = localObject2;
      if (localObject3 != null) {
        localObject1 = ((g)localObject3).b;
      }
      if (b.f.b.j.a(localObject1, paramClass)) {
        return (g<T>)localObject3;
      }
    }
    else if (localObject1 != null)
    {
      localObject3 = (WeakReference[])localObject1;
      int j = localObject3.length;
      int i = 0;
      while (i < j)
      {
        g localg = (g)localObject3[i].get();
        if (localg != null) {
          localObject2 = localg.b;
        } else {
          localObject2 = null;
        }
        if (b.f.b.j.a(localObject2, paramClass)) {
          return localg;
        }
        i += 1;
      }
      i = ((Object[])localObject1).length;
      localObject2 = new WeakReference[i + 1];
      System.arraycopy(localObject1, 0, localObject2, 0, i);
      localObject1 = new g(paramClass);
      localObject2[i] = new WeakReference(localObject1);
      localObject2 = a.a(str, localObject2);
    }
    for (paramClass = "K_CLASS_CACHE.plus(name, newArray)";; paramClass = "K_CLASS_CACHE.plus(name, WeakReference(newKClass))")
    {
      b.f.b.j.a(localObject2, paramClass);
      a = (b)localObject2;
      return (g<T>)localObject1;
      localObject1 = new g(paramClass);
      localObject2 = a.a(str, new WeakReference(localObject1));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */