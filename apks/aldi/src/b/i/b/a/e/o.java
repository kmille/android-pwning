package b.i.b.a.e;

import b.i.b.a.c.d.a.e.m;
import b.i.b.a.c.f.a;
import b.i.b.a.c.f.f;

@b.j(a={1, 1, 13}, b={"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\020\n\002\b\005\n\002\030\002\n\002\b\003\030\0002\0020\0012\0020\002B\033\022\b\020\003\032\004\030\0010\004\022\n\020\005\032\006\022\002\b\0030\006¢\006\002\020\007R\026\020\b\032\004\030\0010\0048VX\004¢\006\006\032\004\b\t\020\nR\026\020\013\032\004\030\0010\f8VX\004¢\006\006\032\004\b\r\020\016R\022\020\005\032\006\022\002\b\0030\006X\004¢\006\002\n\000¨\006\017"}, c={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaEnumValueAnnotationArgument;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaEnumValueAnnotationArgument;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "value", "", "(Lorg/jetbrains/kotlin/name/Name;Ljava/lang/Enum;)V", "entryName", "getEntryName", "()Lorg/jetbrains/kotlin/name/Name;", "enumClassId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getEnumClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "descriptors.runtime"})
public final class o
  extends d
  implements m
{
  private final Enum<?> b;
  
  public o(f paramf, Enum<?> paramEnum)
  {
    super(paramf);
    this.b = paramEnum;
  }
  
  public final a b()
  {
    Class localClass = this.b.getClass();
    if (!localClass.isEnum()) {
      localClass = localClass.getEnclosingClass();
    }
    b.f.b.j.a(localClass, "enumClass");
    return b.e(localClass);
  }
  
  public final f c()
  {
    return f.a(this.b.name());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/e/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */