package b.i.b.a.e;

import b.i.b.a.c.a.h;
import b.i.b.a.c.d.a.e.u;
import b.i.b.a.c.i.d.c;

@b.j(a={1, 1, 13}, b={"\000\036\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\030\0002\0020\0012\0020\002B\021\022\n\020\003\032\006\022\002\b\0030\004¢\006\002\020\005R\030\020\003\032\006\022\002\b\0030\004X\004¢\006\b\n\000\032\004\b\006\020\007R\026\020\b\032\004\030\0010\t8VX\004¢\006\006\032\004\b\n\020\013¨\006\f"}, c={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaPrimitiveType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaPrimitiveType;", "reflectType", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "getReflectType", "()Ljava/lang/Class;", "type", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "getType", "()Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "descriptors.runtime"})
public final class v
  extends w
  implements u
{
  private final Class<?> a;
  
  public v(Class<?> paramClass)
  {
    this.a = paramClass;
  }
  
  public final h a()
  {
    if (b.f.b.j.a(this.a, Void.TYPE)) {
      return null;
    }
    c localc = c.a(this.a.getName());
    b.f.b.j.a(localc, "JvmPrimitiveType.get(reflectType.name)");
    return localc.i;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/e/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */