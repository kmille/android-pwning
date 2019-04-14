package b.i.b.a.e;

import b.i.b.a.c.f.f;
import java.lang.annotation.Annotation;

@b.j(a={1, 1, 13}, b={"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b&\030\000 \0072\0020\001:\001\007B\017\022\b\020\002\032\004\030\0010\003¢\006\002\020\004R\026\020\002\032\004\030\0010\003X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\b"}, c={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationArgument;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "(Lorg/jetbrains/kotlin/name/Name;)V", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "Factory", "descriptors.runtime"})
public abstract class d
  implements b.i.b.a.c.d.a.e.b
{
  public static final a a = new a((byte)0);
  private final f b;
  
  public d(f paramf)
  {
    this.b = paramf;
  }
  
  public final f a()
  {
    return this.b;
  }
  
  @b.j(a={1, 1, 13}, b={"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\030\020\003\032\0020\0042\006\020\005\032\0020\0012\b\020\006\032\004\030\0010\007¨\006\b"}, c={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument$Factory;", "", "()V", "create", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "value", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "descriptors.runtime"})
  public static final class a
  {
    public static d a(Object paramObject, f paramf)
    {
      b.f.b.j.b(paramObject, "value");
      if (b.b(paramObject.getClass())) {
        paramObject = new o(paramf, (Enum)paramObject);
      }
      for (;;)
      {
        return (d)paramObject;
        if ((paramObject instanceof Annotation)) {
          paramObject = new e(paramf, (Annotation)paramObject);
        } else if ((paramObject instanceof Object[])) {
          paramObject = new h(paramf, (Object[])paramObject);
        } else if ((paramObject instanceof Class)) {
          paramObject = new k(paramf, (Class)paramObject);
        } else {
          paramObject = new q(paramf, paramObject);
        }
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */