package b.i.b.a.b;

import b.i.b.a.e.b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@b.j(a={1, 1, 13}, b={"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\bÂ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\022\020\003\032\0020\0042\n\020\005\032\006\022\002\b\0030\006J\016\020\007\032\0020\0042\006\020\b\032\0020\tJ\016\020\n\032\0020\0042\006\020\013\032\0020\f¨\006\r"}, c={"Lkotlin/reflect/jvm/internal/components/SignatureSerializer;", "", "()V", "constructorDesc", "", "constructor", "Ljava/lang/reflect/Constructor;", "fieldDesc", "field", "Ljava/lang/reflect/Field;", "methodDesc", "method", "Ljava/lang/reflect/Method;", "descriptors.runtime"})
final class l
{
  public static final l a = new l();
  
  public static String a(Constructor<?> paramConstructor)
  {
    b.f.b.j.b(paramConstructor, "constructor");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("(");
    paramConstructor = paramConstructor.getParameterTypes();
    int j = paramConstructor.length;
    int i = 0;
    while (i < j)
    {
      Object localObject = paramConstructor[i];
      b.f.b.j.a(localObject, "parameterType");
      localStringBuilder.append(b.f((Class)localObject));
      i += 1;
    }
    localStringBuilder.append(")V");
    paramConstructor = localStringBuilder.toString();
    b.f.b.j.a(paramConstructor, "sb.toString()");
    return paramConstructor;
  }
  
  public static String a(Field paramField)
  {
    b.f.b.j.b(paramField, "field");
    paramField = paramField.getType();
    b.f.b.j.a(paramField, "field.type");
    return b.f(paramField);
  }
  
  public static String a(Method paramMethod)
  {
    b.f.b.j.b(paramMethod, "method");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("(");
    Class[] arrayOfClass = paramMethod.getParameterTypes();
    int j = arrayOfClass.length;
    int i = 0;
    while (i < j)
    {
      Class localClass = arrayOfClass[i];
      b.f.b.j.a(localClass, "parameterType");
      localStringBuilder.append(b.f(localClass));
      i += 1;
    }
    localStringBuilder.append(")");
    paramMethod = paramMethod.getReturnType();
    b.f.b.j.a(paramMethod, "method.returnType");
    localStringBuilder.append(b.f(paramMethod));
    paramMethod = localStringBuilder.toString();
    b.f.b.j.a(paramMethod, "sb.toString()");
    return paramMethod;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */