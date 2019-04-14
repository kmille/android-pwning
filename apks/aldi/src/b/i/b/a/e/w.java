package b.i.b.a.e;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

@b.j(a={1, 1, 13}, b={"\000.\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b&\030\000 \0172\0020\001:\001\017B\005¢\006\002\020\002J\023\020\007\032\0020\b2\b\020\t\032\004\030\0010\nH\002J\b\020\013\032\0020\fH\026J\b\020\r\032\0020\016H\026R\022\020\003\032\0020\004X¤\004¢\006\006\032\004\b\005\020\006¨\006\020"}, c={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaType;", "()V", "reflectType", "Ljava/lang/reflect/Type;", "getReflectType", "()Ljava/lang/reflect/Type;", "equals", "", "other", "", "hashCode", "", "toString", "", "Factory", "descriptors.runtime"})
public abstract class w
  implements b.i.b.a.c.d.a.e.v
{
  public static final a b = new a((byte)0);
  
  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof w)) && (b.f.b.j.a(p_(), ((w)paramObject).p_()));
  }
  
  public int hashCode()
  {
    return p_().hashCode();
  }
  
  protected abstract Type p_();
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getName());
    localStringBuilder.append(": ");
    localStringBuilder.append(p_());
    return localStringBuilder.toString();
  }
  
  @b.j(a={1, 1, 13}, b={"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, c={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaType$Factory;", "", "()V", "create", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "type", "Ljava/lang/reflect/Type;", "descriptors.runtime"})
  public static final class a
  {
    public static w a(Type paramType)
    {
      b.f.b.j.b(paramType, "type");
      boolean bool = paramType instanceof Class;
      if (bool)
      {
        Class localClass = (Class)paramType;
        if (localClass.isPrimitive()) {
          return (w)new v(localClass);
        }
      }
      if ((!(paramType instanceof GenericArrayType)) && ((!bool) || (!((Class)paramType).isArray()))) {
        if ((paramType instanceof WildcardType)) {
          paramType = new z((WildcardType)paramType);
        }
      }
      for (;;)
      {
        return (w)paramType;
        paramType = new l(paramType);
        continue;
        paramType = new i(paramType);
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/e/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */