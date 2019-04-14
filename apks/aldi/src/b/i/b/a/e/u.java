package b.i.b.a.e;

import b.a.v;
import b.i.b.a.c.d.a.e.g;
import b.i.b.a.c.d.a.e.t;
import b.i.b.a.c.f.f;
import java.util.Collection;

@b.j(a={1, 1, 13}, b={"\000Z\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\002\n\002\020\036\n\002\b\004\n\002\020\000\n\000\n\002\020\001\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\030\0002\0020\0012\0020\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\023\020\024\032\0020\0162\b\020\025\032\004\030\0010\026H\002J\022\020\027\032\004\030\0010\0302\006\020\003\032\0020\004H\026J\"\020\031\032\b\022\004\022\0020\0320\0212\022\020\033\032\016\022\004\022\0020\035\022\004\022\0020\0160\034H\026J\b\020\036\032\0020\037H\026J\b\020 \032\0020!H\026R\032\020\006\032\b\022\004\022\0020\b0\0078VX\004¢\006\006\032\004\b\t\020\nR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\0168VX\004¢\006\006\032\004\b\r\020\017R\032\020\020\032\b\022\004\022\0020\0020\0218VX\004¢\006\006\032\004\b\022\020\023¨\006\""}, c={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaPackage;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaPackage;", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "(Lorg/jetbrains/kotlin/name/FqName;)V", "annotations", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotation;", "getAnnotations", "()Ljava/util/List;", "getFqName", "()Lorg/jetbrains/kotlin/name/FqName;", "isDeprecatedInJavaDoc", "", "()Z", "subPackages", "", "getSubPackages", "()Ljava/util/Collection;", "equals", "other", "", "findAnnotation", "", "getClasses", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "nameFilter", "Lkotlin/Function1;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "hashCode", "", "toString", "", "descriptors.runtime"})
public final class u
  extends n
  implements t
{
  private final b.i.b.a.c.f.b a;
  
  public u(b.i.b.a.c.f.b paramb)
  {
    this.a = paramb;
  }
  
  public final Collection<g> a(b.f.a.b<? super f, Boolean> paramb)
  {
    b.f.b.j.b(paramb, "nameFilter");
    return (Collection)v.a;
  }
  
  public final b.i.b.a.c.f.b b()
  {
    return this.a;
  }
  
  public final Collection<t> c()
  {
    return (Collection)v.a;
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof u)) && (b.f.b.j.a(this.a, ((u)paramObject).a));
  }
  
  public final int hashCode()
  {
    return this.a.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getName());
    localStringBuilder.append(": ");
    localStringBuilder.append(this.a);
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/e/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */