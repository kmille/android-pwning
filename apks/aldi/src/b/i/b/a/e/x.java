package b.i.b.a.e;

import b.i.b.a.c.d.a.e.w;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;

@b.j(a={1, 1, 13}, b={"\000N\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020 \n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\030\0002\0020\0012\0020\0022\0020\003B\021\022\n\020\004\032\006\022\002\b\0030\005¢\006\002\020\006J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\031H\002J\b\020\032\032\0020\033H\026J\b\020\034\032\0020\035H\026R\026\020\007\032\004\030\0010\b8VX\004¢\006\006\032\004\b\t\020\nR\024\020\013\032\0020\f8VX\004¢\006\006\032\004\b\r\020\016R\025\020\004\032\006\022\002\b\0030\005¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0230\0228VX\004¢\006\006\032\004\b\024\020\025¨\006\036"}, c={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaTypeParameter;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "typeVariable", "Ljava/lang/reflect/TypeVariable;", "(Ljava/lang/reflect/TypeVariable;)V", "element", "Ljava/lang/reflect/AnnotatedElement;", "getElement", "()Ljava/lang/reflect/AnnotatedElement;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "getTypeVariable", "()Ljava/lang/reflect/TypeVariable;", "upperBounds", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaClassifierType;", "getUpperBounds", "()Ljava/util/List;", "equals", "", "other", "", "hashCode", "", "toString", "", "descriptors.runtime"})
public final class x
  extends n
  implements w, f
{
  private final TypeVariable<?> a;
  
  public x(TypeVariable<?> paramTypeVariable)
  {
    this.a = paramTypeVariable;
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof x)) && (b.f.b.j.a(this.a, ((x)paramObject).a));
  }
  
  public final int hashCode()
  {
    return this.a.hashCode();
  }
  
  public final b.i.b.a.c.f.f p()
  {
    b.i.b.a.c.f.f localf = b.i.b.a.c.f.f.a(this.a.getName());
    b.f.b.j.a(localf, "Name.identifier(typeVariable.name)");
    return localf;
  }
  
  public final AnnotatedElement r()
  {
    TypeVariable localTypeVariable2 = this.a;
    TypeVariable localTypeVariable1 = localTypeVariable2;
    if (!(localTypeVariable2 instanceof AnnotatedElement)) {
      localTypeVariable1 = null;
    }
    return (AnnotatedElement)localTypeVariable1;
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


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/e/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */