package b.i.b.a.e;

import b.i.b.a.c.d.a.e.f;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

@b.j(a={1, 1, 13}, b={"\000\026\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\030\0002\0020\0012\0020\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005R\024\020\006\032\0020\001X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, c={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaArrayType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaArrayType;", "reflectType", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)V", "componentType", "getComponentType", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "getReflectType", "()Ljava/lang/reflect/Type;", "descriptors.runtime"})
public final class i
  extends w
  implements f
{
  private final w a;
  private final Type c;
  
  public i(Type paramType)
  {
    this.c = paramType;
    paramType = this.c;
    if ((paramType instanceof GenericArrayType))
    {
      paramType = ((GenericArrayType)paramType).getGenericComponentType();
      b.f.b.j.a(paramType, "genericComponentType");
    }
    for (;;)
    {
      paramType = w.a.a(paramType);
      break;
      if (!(paramType instanceof Class)) {
        break label95;
      }
      paramType = (Class)paramType;
      if (!paramType.isArray()) {
        break label95;
      }
      paramType = paramType.getComponentType();
      b.f.b.j.a(paramType, "getComponentType()");
      paramType = (Type)paramType;
    }
    this.a = paramType;
    return;
    label95:
    paramType = new StringBuilder("Not an array type (");
    paramType.append(this.c.getClass());
    paramType.append("): ");
    paramType.append(this.c);
    throw ((Throwable)new IllegalArgumentException(paramType.toString()));
  }
  
  protected final Type p_()
  {
    return this.c;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/e/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */