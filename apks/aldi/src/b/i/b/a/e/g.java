package b.i.b.a.e;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@b.j(a={1, 1, 13}, b={"\000 \n\000\n\002\030\002\n\002\020\021\n\002\020\033\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\b\002\032\037\020\000\032\004\030\0010\001*\b\022\004\022\0020\0030\0022\006\020\004\032\0020\005¢\006\002\020\006\032\033\020\007\032\b\022\004\022\0020\0010\b*\b\022\004\022\0020\0030\002¢\006\002\020\t¨\006\n"}, c={"findAnnotation", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "", "", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "([Ljava/lang/annotation/Annotation;Lorg/jetbrains/kotlin/name/FqName;)Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "getAnnotations", "", "([Ljava/lang/annotation/Annotation;)Ljava/util/List;", "descriptors.runtime"})
public final class g
{
  public static final c a(Annotation[] paramArrayOfAnnotation, b.i.b.a.c.f.b paramb)
  {
    b.f.b.j.b(paramArrayOfAnnotation, "receiver$0");
    b.f.b.j.b(paramb, "fqName");
    int j = paramArrayOfAnnotation.length;
    int i = 0;
    while (i < j)
    {
      Annotation localAnnotation = paramArrayOfAnnotation[i];
      if (b.f.b.j.a(b.e(b.f.a.a(b.f.a.a(localAnnotation))).d(), paramb))
      {
        paramArrayOfAnnotation = localAnnotation;
        break label63;
      }
      i += 1;
    }
    paramArrayOfAnnotation = null;
    label63:
    if (paramArrayOfAnnotation != null) {
      return new c(paramArrayOfAnnotation);
    }
    return null;
  }
  
  public static final List<c> a(Annotation[] paramArrayOfAnnotation)
  {
    b.f.b.j.b(paramArrayOfAnnotation, "receiver$0");
    Collection localCollection = (Collection)new ArrayList(paramArrayOfAnnotation.length);
    int j = paramArrayOfAnnotation.length;
    int i = 0;
    while (i < j)
    {
      localCollection.add(new c(paramArrayOfAnnotation[i]));
      i += 1;
    }
    return (List)localCollection;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */