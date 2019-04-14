package b.i.b.a.e;

import b.i.b.a.c.f.f;
import b.j;
import java.lang.annotation.Annotation;

@j(a={1, 1, 13}, b={"\000H\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\021\n\002\020\033\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\002\030\0002\0020\0012\0020\002B-\022\006\020\003\032\0020\004\022\f\020\005\032\b\022\004\022\0020\0070\006\022\b\020\b\032\004\030\0010\t\022\006\020\n\032\0020\013¢\006\002\020\fJ\022\020\033\032\004\030\0010\0172\006\020\034\032\0020\035H\026J\b\020\036\032\0020\tH\026R\032\020\r\032\b\022\004\022\0020\0170\0168VX\004¢\006\006\032\004\b\020\020\021R\024\020\022\032\0020\0138VX\004¢\006\006\032\004\b\022\020\023R\024\020\n\032\0020\013X\004¢\006\b\n\000\032\004\b\n\020\023R\026\020\024\032\004\030\0010\0258VX\004¢\006\006\032\004\b\026\020\027R\026\020\005\032\b\022\004\022\0020\0070\006X\004¢\006\004\n\002\020\030R\020\020\b\032\004\030\0010\tX\004¢\006\002\n\000R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\031\020\032¨\006\037"}, c={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaValueParameter;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaValueParameter;", "type", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "reflectAnnotations", "", "", "reflectName", "", "isVararg", "", "(Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;[Ljava/lang/annotation/Annotation;Ljava/lang/String;Z)V", "annotations", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "getAnnotations", "()Ljava/util/List;", "isDeprecatedInJavaDoc", "()Z", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "[Ljava/lang/annotation/Annotation;", "getType", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "findAnnotation", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "toString", "descriptors.runtime"})
public final class y
  extends n
  implements b.i.b.a.c.d.a.e.y
{
  private final w a;
  private final Annotation[] b;
  private final String c;
  private final boolean d;
  
  public y(w paramw, Annotation[] paramArrayOfAnnotation, String paramString, boolean paramBoolean)
  {
    this.a = paramw;
    this.b = paramArrayOfAnnotation;
    this.c = paramString;
    this.d = paramBoolean;
  }
  
  public final f b()
  {
    String str = this.c;
    if (str != null) {
      return f.d(str);
    }
    return null;
  }
  
  public final boolean d()
  {
    return this.d;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getName());
    localStringBuilder.append(": ");
    String str;
    if (this.d) {
      str = "vararg ";
    } else {
      str = "";
    }
    localStringBuilder.append(str);
    localStringBuilder.append(b());
    localStringBuilder.append(": ");
    localStringBuilder.append(this.a);
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/e/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */