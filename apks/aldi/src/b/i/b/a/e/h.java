package b.i.b.a.e;

import b.i.b.a.c.d.a.e.e;
import b.i.b.a.c.f.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@b.j(a={1, 1, 13}, b={"\000\"\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\021\n\002\b\003\n\002\020 \n\000\030\0002\0020\0012\0020\002B\033\022\b\020\003\032\004\030\0010\004\022\n\020\005\032\006\022\002\b\0030\006¢\006\002\020\007J\016\020\t\032\b\022\004\022\0020\0010\nH\026R\024\020\005\032\006\022\002\b\0030\006X\004¢\006\004\n\002\020\b¨\006\013"}, c={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaArrayAnnotationArgument;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaArrayAnnotationArgument;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "values", "", "(Lorg/jetbrains/kotlin/name/Name;[Ljava/lang/Object;)V", "[Ljava/lang/Object;", "getElements", "", "descriptors.runtime"})
public final class h
  extends d
  implements e
{
  private final Object[] b;
  
  public h(f paramf, Object[] paramArrayOfObject)
  {
    super(paramf);
    this.b = paramArrayOfObject;
  }
  
  public final List<d> b()
  {
    Object[] arrayOfObject = this.b;
    Collection localCollection = (Collection)new ArrayList(arrayOfObject.length);
    int j = arrayOfObject.length;
    int i = 0;
    while (i < j)
    {
      Object localObject = arrayOfObject[i];
      if (localObject == null) {
        b.f.b.j.a();
      }
      localCollection.add(d.a.a(localObject, null));
      i += 1;
    }
    return (List)localCollection;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/e/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */