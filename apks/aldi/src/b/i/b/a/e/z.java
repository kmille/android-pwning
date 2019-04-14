package b.i.b.a.e;

import b.a.e;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

@b.j(a={1, 1, 13}, b={"\000\036\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\004\030\0002\0020\0012\0020\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005R\026\020\006\032\004\030\0010\0018VX\004¢\006\006\032\004\b\007\020\bR\024\020\t\032\0020\n8VX\004¢\006\006\032\004\b\t\020\013R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\f\020\r¨\006\016"}, c={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaWildcardType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaWildcardType;", "reflectType", "Ljava/lang/reflect/WildcardType;", "(Ljava/lang/reflect/WildcardType;)V", "bound", "getBound", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "isExtends", "", "()Z", "getReflectType", "()Ljava/lang/reflect/WildcardType;", "descriptors.runtime"})
public final class z
  extends w
  implements b.i.b.a.c.d.a.e.z
{
  private final WildcardType a;
  
  public z(WildcardType paramWildcardType)
  {
    this.a = paramWildcardType;
  }
  
  public final boolean b()
  {
    Type[] arrayOfType = this.a.getUpperBounds();
    b.f.b.j.a(arrayOfType, "reflectType.upperBounds");
    return b.f.b.j.a((Type)e.c(arrayOfType), Object.class) ^ true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/e/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */