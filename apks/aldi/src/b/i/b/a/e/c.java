package b.i.b.a.e;

import b.i.b.a.c.f.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;

@b.j(a={1, 1, 13}, b={"\000H\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\033\n\002\b\004\n\002\020\036\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\030\0002\0020\0012\0020\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\024H\002J\b\020\025\032\0020\026H\026J\b\020\027\032\0020\030H\026J\b\020\031\032\0020\032H\026R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\006\020\007R\032\020\b\032\b\022\004\022\0020\n0\t8VX\004¢\006\006\032\004\b\013\020\fR\024\020\r\032\0020\0168VX\004¢\006\006\032\004\b\017\020\020¨\006\033"}, c={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotation;", "annotation", "", "(Ljava/lang/annotation/Annotation;)V", "getAnnotation", "()Ljava/lang/annotation/Annotation;", "arguments", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationArgument;", "getArguments", "()Ljava/util/Collection;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "equals", "", "other", "", "hashCode", "", "resolve", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "toString", "", "descriptors.runtime"})
public final class c
  extends n
  implements b.i.b.a.c.d.a.e.a
{
  public final Annotation a;
  
  public c(Annotation paramAnnotation)
  {
    this.a = paramAnnotation;
  }
  
  public final Collection<b.i.b.a.c.d.a.e.b> a()
  {
    Method[] arrayOfMethod = b.f.a.a(b.f.a.a(this.a)).getDeclaredMethods();
    b.f.b.j.a(arrayOfMethod, "annotation.annotationClass.java.declaredMethods");
    Collection localCollection = (Collection)new ArrayList(arrayOfMethod.length);
    int j = arrayOfMethod.length;
    int i = 0;
    while (i < j)
    {
      Method localMethod = arrayOfMethod[i];
      Object localObject = d.a;
      localObject = localMethod.invoke(this.a, new Object[0]);
      b.f.b.j.a(localObject, "method.invoke(annotation)");
      b.f.b.j.a(localMethod, "method");
      localCollection.add(d.a.a(localObject, f.a(localMethod.getName())));
      i += 1;
    }
    return (Collection)localCollection;
  }
  
  public final b.i.b.a.c.f.a b()
  {
    return b.e(b.f.a.a(b.f.a.a(this.a)));
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof c)) && (b.f.b.j.a(this.a, ((c)paramObject).a));
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


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */