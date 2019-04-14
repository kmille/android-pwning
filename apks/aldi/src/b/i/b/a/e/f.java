package b.i.b.a.e;

import b.a.v;
import b.i.b.a.c.d.a.e.d;
import b.i.b.a.c.f.b;
import java.lang.reflect.AnnotatedElement;
import java.util.List;

@b.j(a={1, 1, 13}, b={"\000,\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\003\n\002\030\002\n\000\bf\030\0002\0020\001J\022\020\016\032\004\030\0010\0042\006\020\017\032\0020\020H\026R\032\020\002\032\b\022\004\022\0020\0040\0038VX\004¢\006\006\032\004\b\005\020\006R\024\020\007\032\004\030\0010\bX¦\004¢\006\006\032\004\b\t\020\nR\024\020\013\032\0020\f8VX\004¢\006\006\032\004\b\013\020\r¨\006\021"}, c={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationOwner;", "annotations", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "getAnnotations", "()Ljava/util/List;", "element", "Ljava/lang/reflect/AnnotatedElement;", "getElement", "()Ljava/lang/reflect/AnnotatedElement;", "isDeprecatedInJavaDoc", "", "()Z", "findAnnotation", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "descriptors.runtime"})
public abstract interface f
  extends d
{
  public abstract AnnotatedElement r();
  
  @b.j(a={1, 1, 13})
  public static final class a
  {
    public static c a(f paramf, b paramb)
    {
      b.f.b.j.b(paramb, "fqName");
      paramf = paramf.r();
      if (paramf != null)
      {
        paramf = paramf.getDeclaredAnnotations();
        if (paramf != null) {
          return g.a(paramf, paramb);
        }
      }
      return null;
    }
    
    public static List<c> a(f paramf)
    {
      paramf = paramf.r();
      if (paramf != null)
      {
        paramf = paramf.getDeclaredAnnotations();
        if (paramf != null) {
          return g.a(paramf);
        }
      }
      return (List)v.a;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/e/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */